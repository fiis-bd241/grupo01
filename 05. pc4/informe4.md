# Cuarta práctica calificada - Informe      

## 1. Índices y otros objetos de BD

### Vista 
```sql
CREATE VIEW PEDIDO_LISTA AS
	SELECT 
    pd.cod_pedido, 
    c.nombre, 
    CONCAT(pr.prenombre, ' ', pr.primer_apellido, ' ', pr.segundo_apellido) AS Encargado, 
    pd.fecha_registro, 
    pde.estado_pedido 
	FROM 
		pedido AS pd
	INNER JOIN 
		pedido_estado AS pde ON pde.cod_pedido_estado = pd.cod_pedido_estado
	INNER JOIN 
		representante AS r ON r.cod_representante = pd.cod_representante
	INNER JOIN 
		empleado AS e ON e.cod_empleado = pd.cod_empleado
	INNER JOIN 
		persona AS pr ON pr.cod_persona = e.cod_persona
	INNER JOIN 
		cliente AS c ON c.cod_cliente = r.cod_cliente;
```
### Índices
#### Índice Fecha_mantenimiento:
```sql
DROP INDEX IF EXISTS fecha_mantenimiento;
CREATE INDEX fecha_mantenimiento
ON vehiculo(fecha_ultimo_mantenimiento, cod_vehiculo_estado)
```
Proceso B001 sin Índice:
![image](https://github.com/fiis-bd241/grupo01/assets/164358065/16591b4f-918c-4d1b-8f5f-8c3df1a2e379)

Proceso B001 con Índice:
![image](https://github.com/fiis-bd241/grupo01/assets/164358065/e84c9605-59f5-482d-adc0-d94f9467e6d0)

### Triggers
#### 1. Trigger para actualizar la fecha de último traslado de un transportista

Este trigger se encarga de actualizar las fechas de último traslado y último viaje en las tablas `transportista` y `vehiculo` cada vez que se registra una nueva operación de tipo 6 ('Recepción'). 

Cuando se inserta una nueva operación:
   - **Si el tipo de operación es de 'Recepción'**:
     - Busca el `transportista` y el `vehiculo` asociados con la operación.
     - Actualiza la fecha del último traslado del `transportista` con la fecha de la nueva operación.
     - Actualiza la fecha del último viaje del `vehiculo` con la misma fecha.

```sql
CREATE OR REPLACE FUNCTION actualizar_fechas_ultimo_traslado_y_viaje()
RETURNS TRIGGER AS $$
BEGIN
    UPDATE transportista
    SET fecha_ultimo_traslado = NEW.fecha
    WHERE cod_transportista = (
        SELECT t.cod_transportista
        FROM traslado t
        JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
        WHERE o.id_operacion_picking = NEW.id_operacion_picking
        LIMIT 1
    );
    
    UPDATE vehiculo
    SET fecha_ultimo_viaje = NEW.fecha
    WHERE cod_vehiculo = (
        SELECT t.cod_vehiculo
        FROM traslado t
        JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
        WHERE o.id_operacion_picking = NEW.id_operacion_picking
        LIMIT 1
    );
    
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trg_actualizar_fechas_ultimo_traslado_y_viaje
AFTER INSERT ON operacion
FOR EACH ROW
WHEN (NEW.cod_tipo_operacion = 6)
EXECUTE FUNCTION actualizar_fechas_ultimo_traslado_y_viaje();
```
#### 2. Trigger para la generación de un registro cuando se actualiza el estado de un vehículo
Este trigger se ejecuta cuando, a través de la interfaz de la aplicación o el proceso B001, se actualiza la variable de estado de `vehiculo` (`cod_vehiculo _estado`) que define si este está "Disponible", "No Disponible" o "Cuatentena".

Para esta necesidad se ha creado una nueva tabla denominada `vehiculo_logs`, la cual almacenará toda la información de las actualizaciones antes mencionadas.
```sql
DROP TABLE IF EXISTS vehiculo_logs;
CREATE TABLE IF NOT EXISTS vehiculo_logs (
	cod_vehiculo_log SERIAL NOT NULL,
	cod_vehiculo INT NOT NULL,
	cod_estado_anterior CHAR NOT NULL,
	cod_estado_actual CHAR NOT NULL,
	fecha_log TIMESTAMP NOT NULL,
	PRIMARY KEY (cod_vehiculo_log),
	CONSTRAINT cod_estado_anterior
	FOREIGN KEY (cod_estado_anterior)
	REFERENCES vehiculo_estado (cod_vehiculo_estado),
	CONSTRAINT cod_estado_actual
	FOREIGN KEY (cod_estado_actual)
	REFERENCES vehiculo_estado (cod_vehiculo_estado)	
);
```
Cuando se actualiza este atributo:
 - Se crea un nuevo registro en `vehiculo_logs`
 - Se almacena el estado anterior a la actualización
 - Se almacena el nuevo estado que está tomando el vehículo
 - Se registra la fecha y hora del cambio

**Creación de la función para el trigger**
```sql
CREATE OR REPLACE FUNCTION validar_transportista()
RETURNS TRIGGER
LANGUAGE plpgsql AS $$
BEGIN
	INSERT INTO vehiculo_logs (cod_vehiculo, cod_estado_anterior, cod_estado_actual, fecha_log)
    VALUES (NEW.cod_vehiculo, OLD.cod_vehiculo_estado, NEW.cod_vehiculo_estado, CURRENT_TIMESTAMP);
    RETURN NEW;
END $$;
```
**Creación del Trigger**
```sql
CREATE TRIGGER cambio_estado_vehiculo
AFTER UPDATE OF cod_vehiculo_estado ON vehiculo
FOR EACH ROW
WHEN (OLD.cod_vehiculo_estado IS DISTINCT FROM NEW.cod_vehiculo_estado)
EXECUTE FUNCTION validar_transportista();
```

## 2. PL/pgSQL – Proceso Batch

### Proceso B001: Actualización del estado del vehículo por fecha del último mantenimiento

Cada fin de mes se actualiza el estado del vehículo a 'No disponible' para los vehículos cuya fecha de último mantenimiento cumple dentro del próximo mes un año o más desde el último mantenimiento.

```sql
CREATE OR REPLACE FUNCTION actualizar_mantenimiento_y_estado() RETURNS void AS $$
DECLARE
    vehiculo_cursor CURSOR FOR
        SELECT cod_vehiculo, fecha_ultimo_mantenimiento
        FROM vehiculo;
BEGIN
    FOR v IN vehiculo_cursor LOOP       
        IF EXTRACT(YEAR FROM AGE(CURRENT_DATE, v.fecha_ultimo_mantenimiento)) * 12 +
           EXTRACT(MONTH FROM AGE(CURRENT_DATE, v.fecha_ultimo_mantenimiento)) >= 11
	THEN
            UPDATE vehiculo
            SET cod_vehiculo_estado = 'N'
            WHERE cod_vehiculo = v.cod_vehiculo;
        END IF;
    END LOOP;
END;
$$ LANGUAGE plpgsql;
```

### Proceso B002: Actualización del estado del vehículo por años de antigüedad

Anualmente se actualiza el estado  a 'No disponible' a los vehículos que están por cumplir 15 años de antigüedad.

```sql
CREATE OR REPLACE FUNCTION actualizar_estado_vehiculos_antiguos() RETURNS void AS $$
DECLARE
   vehiculo_cursor CURSOR FOR
	SELECT cod_vehiculo, anio_fabricacion
        FROM vehiculo;
BEGIN
   FOR v IN vehiculo_cursor LOOP
	IF 
	   v.anio_fabricacion <= EXTRACT(YEAR FROM CURRENT_DATE) - 15
	THEN
	   UPDATE vehiculo
   	   SET cod_vehiculo_estado = 'N'
	   WHERE cod_vehiculo = v.cod_vehiculo;
	END IF;
   END LOOP;
END;
$$ LANGUAGE plpgsql;
```


## 3. Actualizaciones a la Arquitectura de la Aplicación

### Estructura de la aplicación

### Tecnología utilizada

#### Herramientas

#### Frontend

#### Backend

#### Base de datos

## 4. Versión Final de la Aplicación

## 5. Próximos Pasos

### Módulo de Seguimiento
#### Disponibilidad para dispositivos móviles.
Como parte del planeamiento de los requerimientos iniciales se consideró que los usuarios principales de este módulo serían tanto en transportista como su supervisor. Sin embargo, no se consideró que durante la realización de los traslados lo más probable es que el transportista solo pueda acceder a su dispositivo móvil.
Por lo tanto, la siguiente iniciativa podría enfocarse de dos formas: 
-	Mejorar la adaptabilidad de la aplicación web haciéndola compatible con los dispositivos móviles a través del Responsive Design. Este cambio tendría un impacto solo a nivel de lógica del frontend de la aplicación, sin embargo, obligaría a un acceso a través del navegador del dispositivo móvil.
-	Una aplicación móvil conectada a la misma base de datos. A través de enfoques como el MBaaS para agilizar tanto el desarrollo como la escalabilidad y seguridad. Esto no solo permitiría a los transportistas acceder a este módulo, sino que ahora los demás trabajadores de la empresa podrían acceder a sistemas como los de almacén y pedidos desde dispositivos móviles. En este punto se debe recalcar que son una industria de trabajo físico donde las verificaciones y recogida de información se realiza en campo donde no se accede inmediatamente a un computador de escritorio.
Esta aplicación podría contar con funcionalidades adicionales como lectora de códigos qr o de barras para facilitar el registro de los códigos impresos en los pedidos y paquetes.
#### Capacidad de trabajar con IoT
Considerando que la misión del módulo de seguimiento es conocer el estado y ubicación de los pedidos que están siendo llevados en un traslado esto no puede restringirse a solo realizar un seguimiento de ubicación, por lo que con la influencia de la tecnología del internet de las cosas se podrían acceder a datos proporcionados por más tipos de sensores.
En un escenario ideal no muy lejano se debe poder verificar y controlar señales de múltiples sensores, como el de velocidad instantánea, temperatura del compartimiento de refrigeración, disposición de los productos, etc. Esta cantidad de información instantánea podría suponer un sobrecargo para una base de datos relacional.
Debido a esto los siguientes proyectos pueden enfocarse a un cambio de base de datos a una que soporte esa cantidad masiva de datos y tenga alta disponibilidad. Como criterio inicial podría considerarse usar Casandra como la base de datos adicional debido a su escalabilidad, alta disponibilidad y manejo de grandes volúmenes de datos.

### Módulo de Almacén
Algunas funcionalidades que se pueden implementar en este módulo son:
- **Soporte para lector de códigos de barras:** Implementar soporte para la entrada de códigos por medio de un lector de código de barras, ya que de esta forma el usuario ingresará los números de precinto o códigos de guía de remisión para la búsqueda en la pantalla de "Vista de procesos de traslado".
- **Vista de todas las mercancías y traslados:** Implementar una pantalla que permita visualizar las mercancías y los traslados ordenados por la fecha y hora de finalización de su última operación, como alternativa a la búsqueda por número de precinto o código de guía de remisión.

Por ejemplo, para el caso de las mercancías, la consulta a la base de datos sería de la siguiente forma:

```sql
SELECT
    m.nro_precinto,
    ot.descripcion AS tipo_operacion,
    o.fecha,
    o.hora_inicio,
    o.hora_fin
FROM
    mercancia m
INNER JOIN
    operacion o ON o.id_operacion = (
        SELECT o2.id_operacion
        FROM operacion o2
        WHERE o2.id_operacion = m.id_operacion_picking
           OR o2.id_operacion_picking = m.id_operacion_picking
        ORDER BY o2.cod_tipo_operacion DESC
        LIMIT 1
    )
INNER JOIN
    operacion_tipo ot ON ot.cod_tipo_operacion = o.cod_tipo_operacion
ORDER BY fecha DESC, hora_fin DESC;
```

![image](https://github.com/fiis-bd241/grupo01/assets/130816094/981fc228-8276-4893-9b48-64ad4f69ca45)

Para el caso de los traslados, la consulta a la base de datos sería:

```sql
SELECT
    t.cod_guia_remision,
    ot.descripcion AS tipo_operacion,
    o2.fecha,
    o2.hora_inicio,
    o2.hora_fin
FROM
    traslado t
INNER JOIN
    operacion o1 ON t.id_operacion_inicia = o1.id_operacion
INNER JOIN
    operacion o2 ON o2.id_operacion = (
        SELECT o3.id_operacion
        FROM operacion o3
        WHERE o3.id_operacion = o1.id_operacion_picking
           OR o3.id_operacion_picking = o1.id_operacion_picking
        ORDER BY o3.cod_tipo_operacion DESC
        LIMIT 1
    )
INNER JOIN
    operacion_tipo ot ON ot.cod_tipo_operacion = o2.cod_tipo_operacion
ORDER BY fecha DESC, hora_fin DESC;
```

![image](https://github.com/fiis-bd241/grupo01/assets/130816094/59000bd7-62fb-40ba-b13d-c4d5412d7533)

Debido a que el usuario cuenta físicamente con la mercancía o la guía de remisión y un lector de códigos de barras a su disposición, el ingreso de estos códigos no suele tomar demasiado tiempo, por lo que no se consideró necesario implementar estas pantallas. Sin embargo, en situaciones donde las operaciones se registran con reducidos intervalos entre una operación y su consecutiva (generalmente es así con excepción de las operaciones de Salida y Recepción, debido a que tienen un intervalo considerable que los separa), tener una pantalla con todas las mercancías y traslados ordenados por la fecha y hora de su operación más reciente puede resultar útil, por lo que se pueden implementar estas pantallas como opción adicional a la búsqueda por código.

- **Integración con el módulo de Control:** En la pantalla de "Vista de procesos de traslado", cuando se encuentra un traslado como resultado de la búsqueda, se puede habilitar un botón que redirija al usuario al módulo de Control para el registro de una incidencia respectiva a este traslado.

- **Integración con los módulos de Pedidos y Seguimiento:** Dado que las entidades `pedido` y `ruta` pertenecen a estos módulos, respectivamente, en la pantalla de "Registro de salida" se decidió simplificar el ingreso de los pedidos y la ruta asociados al traslado por medio del ingreso de sus códigos. Sin embargo, estos códigos son de uso de la base de datos únicamente, por lo que esto no sería lo ideal. En lugar de esto, se podría implementar ventanas modales que permitan buscar una ruta o pedidos por medio de atributos o información que el usuario maneja, lo cual implica una integración del módulo de Almacén con los módulos de Pedidos y Seguimiento en cuanto a funcionalidad.

### Módulo de Control
Las próximas funcionalidades que podría desarrollar el Módulo de Control incluyen la capacidad de eliminar incidencias resueltas que lleven más de un mes registradas en ese estado, mientras conserva el registro de incidencias resueltas durante el último mes para estudios futuros. Estos estudios permitirían analizar los planes de acción para determinar su efectividad en la reducción de incidencias, mejorando así las decisiones estratégicas de San Fernando. Adicionalmente, se podría implementar la funcionalidad de notificaciones en tiempo real, proporcionando alertas inmediatas sobre nuevas incidencias o cambios de estado. Para mejorar la gestión de incidencias, el sistema podría permitir la adición de detalles más completos en los registros, incluyendo fotos u otros materiales significativos que ayuden a identificar rápidamente el tipo de incidencia, el procedimiento adecuado a seguir y la norma en la que se basa. Esto facilitaría una respuesta más rápida y eficiente, optimizando la gestión general de las incidencias.

### Módulo de Reclamos

En la creación de un reclamo, el apartado de evidencia podría mejorarse significativamente. Actualmente, solo es posible registrar manualmente una evidencia, especificando el nombre de la evidencia y seleccionando el tipo de archivo y el tipo de evidencia mediante listas desplegables. Para mejorar este proceso, se propone implementar la funcionalidad de subir múltiples evidencias de una vez. Adicionalmente, el sistema debería ser capaz de detectar automáticamente el tipo de archivo y el tipo de evidencia correspondiente, eliminando la necesidad de selección manual. Además, estas evidencias deberían tener la opción de almacenarse en la nube. Esta mejora no solo facilitaría el proceso de registro de evidencias, sino que también garantizaría una mayor seguridad y accesibilidad de la información, permitiendo acceder a las evidencias desde cualquier lugar con conexión a internet.

## 6. NoSQL

## 7. Videos Individuales

### Módulo de pedidos

Miguel Anderson Inocente Caro


<div align="center">
    <a href="https://www.youtube.com/watch?v=neDWn9OWGkY" target="_blank">
        <img src="http://img.youtube.com/vi/neDWn9OWGkY/0.jpg" alt="Modulo de Control" width="500" height="auto" border="10" />
    </a>
</div>

### Módulo de Almacén

José Joaquín Alvarado Usucachi

[![Almacén](https://github.com/fiis-bd241/grupo01/assets/130816094/57578ece-dc46-4e34-8e9a-79b474344e4e)](https://www.youtube.com/watch?v=wdnBdCbLu0M)

### Módulo de Control

Alex Espinoza Cerna 


<div align="center">
    <a href="https://www.youtube.com/watch?v=z81TUZU8u2g" target="_blank">
        <img src="http://img.youtube.com/vi/z81TUZU8u2g/0.jpg" alt="Modulo de Control" width="500" height="auto" border="10" />
    </a>
</div>

### Módulo de Reportes

Cruz Mamani Cristhian Samir

<div align="center">
    <a href="https://youtu.be/TYnVb20MsJs" target="_blank">
        <img src="http://img.youtube.com/vi/TYnVb20MsJs/0.jpg" alt="Modulo de Control" width="500" height="auto" border="10" />
    </a>
</div>




