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

### Secuencias
Los PK de las tablas creadas, al ser de tipo SERIAL, generan una secuencia que empieza de 1 y se va incrementando en 1 cada vez que se ingresa un registro sin especificar el PK. Debido a que en los csv de la carga masiva de datos se especifican los PK de las tablas, es necesario ejecutar el siguiente script SQL para actualizar los valores de las secuencias y así poder ingresar nuevos registros desde el backend sin necesidad de especificar el PK.

```sql
-- Actualizar la secuencia para la tabla "persona"
SELECT setval('persona_cod_persona_seq', (SELECT MAX(cod_persona) FROM persona));

-- Actualizar la secuencia para la tabla "cliente"
SELECT setval('cliente_cod_cliente_seq', (SELECT MAX(cod_cliente) FROM cliente));

-- Actualizar la secuencia para la tabla "ubicacion"
SELECT setval('ubicacion_cod_ubicacion_seq', (SELECT MAX(cod_ubicacion) FROM ubicacion));

-- Actualizar la secuencia para la tabla "ticket"
SELECT setval('ticket_cod_ticket_seq', (SELECT MAX(cod_ticket) FROM ticket));

-- Actualizar la secuencia para la tabla "vehiculo"
SELECT setval('vehiculo_cod_vehiculo_seq', (SELECT MAX(cod_vehiculo) FROM vehiculo));

-- Actualizar la secuencia para la tabla "elemento_catalogo"
SELECT setval('elemento_catalogo_id_elemento_catalogo_seq', (SELECT MAX(id_elemento_catalogo) FROM elemento_catalogo));

-- Actualizar la secuencia para la tabla "ruta"
SELECT setval('ruta_cod_ruta_seq', (SELECT MAX(cod_ruta) FROM ruta));

-- Actualizar la secuencia para la tabla "empleado"
SELECT setval('empleado_cod_empleado_seq', (SELECT MAX(cod_empleado) FROM empleado));

-- Actualizar la secuencia para la tabla "transportista"
SELECT setval('transportista_cod_transportista_seq', (SELECT MAX(cod_transportista) FROM transportista));

-- Actualizar la secuencia para la tabla "operacion"
SELECT setval('operacion_id_operacion_seq', (SELECT MAX(id_operacion) FROM operacion));

-- Actualizar la secuencia para la tabla "mercancia"
SELECT setval('mercancia_id_mercancia_seq', (SELECT MAX(id_mercancia) FROM mercancia));

-- Actualizar la secuencia para la tabla "representante"
SELECT setval('representante_cod_representante_seq', (SELECT MAX(cod_representante) FROM representante));

-- Actualizar la secuencia para la tabla "gps"
SELECT setval('gps_cod_gps_seq', (SELECT MAX(cod_gps) FROM gps));

-- Actualizar la secuencia para la tabla "local"
SELECT setval('"local_cod_local_seq"', (SELECT MAX(cod_local) FROM "local"));

-- Actualizar la secuencia para la tabla "paradero"
SELECT setval('paradero_cod_paradero_seq', (SELECT MAX(cod_paradero) FROM paradero));

-- Actualizar la secuencia para la tabla "stock"
SELECT setval('stock_id_stock_seq', (SELECT MAX(id_stock) FROM stock));

-- Actualizar la secuencia para la tabla "pedido"
SELECT setval('pedido_cod_pedido_seq', (SELECT MAX(cod_pedido) FROM pedido));

-- Actualizar la secuencia para la tabla "traslado"
SELECT setval('traslado_id_traslado_seq', (SELECT MAX(id_traslado) FROM traslado));

-- Actualizar la secuencia para la tabla "incidencia"
SELECT setval('incidencia_cod_incidencia_seq', (SELECT MAX(cod_incidencia) FROM incidencia));

-- Actualizar la secuencia para la tabla "procedimiento"
SELECT setval('procedimiento_cod_procedimiento_seq', (SELECT MAX(cod_procedimiento) FROM procedimiento));

-- Actualizar la secuencia para la tabla "norma"
SELECT setval('norma_cod_norma_seq', (SELECT MAX(cod_norma) FROM norma));

-- Actualizar la secuencia para la tabla "seguimiento"
SELECT setval('seguimiento_cod_seguimiento_seq', (SELECT MAX(cod_seguimiento) FROM seguimiento));

-- Actualizar la secuencia para la tabla "reclamo"
SELECT setval('reclamo_cod_reclamo_seq', (SELECT MAX(cod_reclamo) FROM reclamo));

-- Actualizar la secuencia para la tabla "evidencia"
SELECT setval('evidencia_cod_evidencia_seq', (SELECT MAX(cod_evidencia) FROM evidencia));

-- Actualizar la secuencia para la tabla "programacion_reporte"
SELECT setval('programacion_reporte_cod_programacion_reporte_seq', (SELECT MAX(cod_programacion_reporte) FROM programacion_reporte));

-- Actualizar la secuencia para la tabla "reporte"
SELECT setval('reporte_cod_reporte_seq', (SELECT MAX(cod_reporte) FROM reporte));
```

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

### Frontend
   * Framework: Angular
   * UI Components: Primeng
   * Estilos: Primeflex
   * Gráficos: Apache ECharts
   * Íconos: Font Awesome
   * Generación de pdfs: jspdf
### Backend 
   * Patrón de diseño: Dao
   * Lenguaje de programación: Java
   * Dependencias:
     * Springboot
     * Quartz
     * PostgreSQL JDBC Driver
     * Lombok
### Databases
   * Sistema gestor de base de datos: PostgreSQL 
   * Motor de base de datos: PostgreSQL
### Diagrama
![app](https://github.com/fiis-bd241/grupo01/assets/161625149/118087b3-308f-4b84-9770-b74b500291f3)

## 4. Versión Final de la Aplicación
### Módulo de Seguimiento

#### Requerimientos Relacionados
- R201

#### Códigos de pantallas
- I201, I202, I201-E1

#### Interfaz I201: Pantalla Inicial

![image](https://github.com/fiis-bd241/grupo01/assets/164358065/2fe5f59b-68e1-41a3-a08d-b9e3806ce967)

#### Interfaz I202: Traslados en Proceso

![image](https://github.com/fiis-bd241/grupo01/assets/164358065/e340a36b-c84f-4e87-b5f6-e6c7162e8507)

#### Interfaz I202-E1: Realizar entrega de Pedido

![image](https://github.com/fiis-bd241/grupo01/assets/164358065/b197c897-338d-47f5-a865-34f538d4ae35)

### Módulo de Almacén

#### Requerimientos Relacionados
- R301, R302, R303, R304, R305, R306, R307

#### Códigos de pantallas
- I301, I302, I303, I304, I305, I306, I307, I308, I309, I310, I311

#### Pantalla I301: Vista de Procesos

![Captura de Pantalla 2024-06-04 a la(s) 23 41 49](https://github.com/fiis-bd241/grupo01/assets/130816094/3fe88474-f72e-40ed-94e7-71000489e492)

1. **Botón "Iniciar nuevo proceso"**
   - Lleva al usuario a la pantalla I302 para comenzar un nuevo proceso.

2. **Selección de tipo de búsqueda**
   - El usuario elige entre buscar el proceso asociado a una mercancía por el número de precinto o a un traslado por el código de guía de remisión. 
   - Según la elección, se ingresa en el campo el tipo de entrada correspondiente.

3. **Botón "Buscar"**
   - Realiza la búsqueda usando el valor ingresado por el usuario y valida el número de precinto o el código de guía de remisión.
   - Si alguna validación falla, se muestra un mensaje de error. Si es exitosa, se procede con la búsqueda y se muestran los resultados en tres secciones: Proceso, Mercancías y Traslado (si existe).

4. **Botón "Registrar operación"**
   - Lleva al usuario a la pantalla adecuada para registrar una operación adicional del proceso encontrado. Dependiendo de la última operación registrada, se redirige a la pantalla correspondiente:
     - Picking: I304
     - Precintado: I305
     - Paletizado: I306
     - Carga: I307
     - Salida: I309
     - Recepción: I310
     - Si es "Descarga", el botón no se habilita.

#### Pantalla I302: Inicio de Nuevo Proceso

![Captura de Pantalla 2024-06-04 a la(s) 23 48 17](https://github.com/fiis-bd241/grupo01/assets/130816094/e93f318d-f9bb-4e21-84d1-0821946d0f0b)

1. **Carga de Página**
   - El campo "Fecha" se autocompleta con la fecha actual.

2. **Botón "Agregar mercancía"**
   - Abre la pantalla I303 para agregar una mercancía. 
   - Retorna con un código de stock y su cantidad a transportar, mostrando botones para editar o eliminar la mercancía.

3. **Botón "Ingresar"**
   - Valida los DNIs de los empleados ejecutor y supervisor.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se genera un número de precinto para cada mercancía.
   - Se exporta un PDF con los números de precinto y se redirige a la pantalla I311.

#### Pantalla I303: Agregar Mercancía

![Captura de Pantalla 2024-06-04 a la(s) 23 48 53](https://github.com/fiis-bd241/grupo01/assets/130816094/855539c9-cbd2-4d66-9219-567d27dc8b70)

1. **Botón "Buscar"**
   - Busca el código de stock ingresado y muestra la información del stock en pantalla.

2. **Botón "Ingresar"**
   - Ingresa el código de stock especificado y redirige al usuario a la pantalla I302.

3. **Botón "Cerrar"**
   - Lleva al usuario de vuelta a la pantalla I302.

#### Pantalla I304: Registro de Operación de Picking

![Captura de Pantalla 2024-06-04 a la(s) 23 56 04](https://github.com/fiis-bd241/grupo01/assets/130816094/1aca11e7-41d9-4699-88ab-e5d634186122)

1. **Carga de Página**
   - La pantalla se carga con la fecha actual y el valor de `id_operacion_picking` (variable interna usada para seguimiento de la operación).

2. **Botón "Ingresar"**
   - Valida los DNIs de los empleados ejecutor y supervisor.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se redirige a la pantalla I311.

#### Pantalla I305: Registro de Operación de Precintado

![Captura de Pantalla 2024-06-04 a la(s) 23 56 28](https://github.com/fiis-bd241/grupo01/assets/130816094/d4cf7cfa-51df-4f7e-8d7a-d244a05ef89f)

1. **Carga de Página**
   - Igual que I304, se carga con la fecha actual y el valor de `id_operacion_picking` (variable interna usada para seguimiento de la operación).

2. **Botón "Ingresar"**
   - Valida los DNIs de los empleados ejecutor y supervisor.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se redirige a la pantalla I311.

#### Pantalla I306: Registro de Operación de Paletizado

![Captura de Pantalla 2024-06-04 a la(s) 23 56 54](https://github.com/fiis-bd241/grupo01/assets/130816094/b6fb1a6c-452e-4180-aa3a-48accfefbeb2)

1. **Carga de Página**
   - Igual que I304 e I305, se carga con la fecha actual y el valor de `id_operacion_picking` (variable interna usada para seguimiento de la operación).

2. **Botón "Ingresar"**
   - Valida los DNIs de los empleados ejecutor y supervisor.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se redirige a la pantalla I311.

#### Pantalla I307: Registro de Operación de Carga

![Captura de Pantalla 2024-06-04 a la(s) 23 58 39](https://github.com/fiis-bd241/grupo01/assets/130816094/d0d74edb-dbe2-4fb6-8335-da9dd5d0bbcf)

1. **Carga de Página**
   - Igual que las anteriores, se carga con la fecha actual y el valor de `id_operacion_picking` (variable interna usada para seguimiento de la operación).

2. **Botón "Agregar pedido"**
   - Abre la pantalla I308 para agregar un código de pedido.

3. **Botón "Eliminar pedido"**
   - Elimina un código de pedido de la lista.

4. **Botón "Ingresar"**
   - Valida los DNIs de los empleados, código de ruta, placa del vehículo y DNI del transportista.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se genera el código de guía de remisión.
   - Se redirige al usuario a la pantalla I311.

#### Pantalla I308: Agregar Pedido

![Captura de Pantalla 2024-06-04 a la(s) 23 58 27](https://github.com/fiis-bd241/grupo01/assets/130816094/5699b0bf-7787-4912-a833-61eaeb90bfc3)

1. **Botón "Agregar"**
   - Valida el código de pedido ingresado. 
   - Si es válido, lo agrega a la lista y redirige al usuario a la pantalla I307.

2. **Botón "Cerrar"**
   - Lleva al usuario de vuelta a la pantalla I307.

#### Pantalla I309: Registro de Operación de Salida

![Captura de Pantalla 2024-06-05 a la(s) 00 00 04](https://github.com/fiis-bd241/grupo01/assets/130816094/80d60d08-f3e0-4886-807b-482fbedad15c)

1. **Carga de Página**
   - Igual que las anteriores, se carga con la fecha actual y el valor de `id_operacion_picking` (variable interna usada para seguimiento de la operación).

2. **Botón "Ingresar"**
   - Valida los DNIs de los empleados ejecutor y supervisor.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se actualiza la información del traslado.
   - Se redirige al usuario a la pantalla I311.

#### Pantalla I310: Registro de Operación de Recepción

![Captura de Pantalla 2024-06-05 a la(s) 00 00 29](https://github.com/fiis-bd241/grupo01/assets/130816094/76dbd489-d054-4e6d-ba74-5c2581f8c69c)

1. **Carga de Página**
   - Igual que las anteriores, se carga con la fecha actual y el valor de `id_operacion_picking` (variable interna usada para seguimiento de la operación).

2. **Botón "Ingresar"**
   - Valida los DNIs de los empleados ejecutor y supervisor.
   - Si las validaciones son exitosas, se ingresan los valores a la base de datos y se actualiza la información del traslado.
   - Se redirige al usuario a la pantalla I311.

#### Pantalla I311: Confirmación de Operación

![Captura de Pantalla 2024-06-04 a la(s) 23 55 12](https://github.com/fiis-bd241/grupo01/assets/130816094/fe07d02e-b301-4048-800a-3e43986904e9)

1. **Botón "Volver a vista de procesos"**
   - Lleva al usuario de vuelta a la pantalla I301.

2. **Botón "Continuar siguiente operación"**
   - Lleva al usuario a la pantalla correspondiente para registrar la siguiente operación del proceso. 
   - Dependiendo del tipo de operación actual, se redirige a las pantallas I304 a I310. Si es una operación de "Descarga", el botón no se habilita.

En el caso de una operación de "Salida", se muestra un mensaje de confirmación con el código de guía de remisión generado.

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

### Módulo de Seguimiento

Dennis Leopoldo Campos Herrera

<div align="center">
    <a href="https://www.youtube.com/watch?v=EFCcUfZexKg" target="_blank">
        <img src="http://img.youtube.com/vi/EFCcUfZexKg/0.jpg" alt="Modulo de Control" width="500" height="auto" border="10" />
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




