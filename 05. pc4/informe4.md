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
#### 1. Trigger para actualizar la fecha de último traslado de un transportista y fecha de último viaje de un vehículo

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
### Módulo de Pedidos

#### Requerimientos Relacionados
R101 , R102 , R103 y R104

#### Codigos de pantallas
I101, I102, I103 y I104

#### Interfaz I103: Pantalla de todos los pedidos

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/590ee867-7837-49cd-aec2-37d3d998c3a5)

Al dar click al boton "Nuevo Pedido" lleva al usuario a la interfaz I101.

#### Interfaz I101:

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/1b0c8b33-b7e5-4751-ac15-39fe1471d62d)
 
El empleado ingresa los datos del representante y del cliente, como nombres, apellidos, DNI, teléfono, correo empresarial, empresa, fecha de solicitud y fecha de entrega esperada.

Al dar click al boton "siguiente" lleva al usuario a la interfaz I102

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/7f1a7d47-18c1-4a73-bcf8-96ac4f98b792)

#### Interfaz I102:

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/f798940c-71b0-45d9-9319-855fb42c021b)

El sistema muestra una lista de productos disponibles en el catálogo, agrupados por categorías.

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/f055e85b-0663-45c3-8f95-3ab309b48588)

El empleado selecciona los productos necesarios y las cantidades correspondientes.

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/5d1ca309-4813-4337-b685-92dcc2c2f629)

Al dar al boton "Confirmar" lleva al usuario a la interfaz I104

#### Interfaz I104:

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/aadabba8-8667-404c-8926-475ee465a968)

![image](https://github.com/fiis-bd241/grupo01/assets/121084712/aaf7c5ec-3486-42fc-9119-16aa5cfa242a)

Aqui se muestra mas a detalle, los datos especificos del cliente (Empresa), representante y empleado , asi como el codigo del ticket asignado, el estado del pedido. También se muestra los productos solicitados, con datos especificos como su codigo, nombre, cantidad y unidad.
     
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

### Módulo de Control 
#### Requerimientos Relacionados
R401 , R402 , R403 y R404

#### Codigos de pantallas
I401, I402, I403,I404,I405,I406 Y I407


#### Interfaz I401: Pantalla de registro de disponibilidad de todos los conductores 
Una vez ingresemos al módulo de control, lo primero que se muestra es la pantalla correspondiente a la lista de todos los conductores, donde podemos acceder a cambiarle su estado de disponibilidad para asignarle un vehículo en función de sus atributos los cuales son código de conductor, código de empleado, tipo de licencia, fecha de vencimiento de licencia, fecha de último traslado.

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/1bc521ac-d983-45d8-8f71-91fd58ec0526)

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/debd5270-76d0-4e2a-8a45-90671700ad0a)

#### Interfaz I402: Pantalla de registro de disponibilidad de todos los vehículos
Al darle click en la opción de vehículos accedemos a la lista de todos los vehículos , donde podemos acceder a cambiarle su estado de disponibilidad para efectuar un futuro traslado en función de sus atributos los cuales son código de vehículo, año fabricación, fecha último mantenimiento, capacidad de carga, modelo, placa y fecha de último viaje.

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/1367a08b-878c-4a76-a0f8-49fd2a051133)

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/0ff562c0-d325-4eb6-a8d4-ad119f7ab5af)

#### Interfaz I407: Pantalla de registro de atención a las incidencias 
Al darle click en la opción de Incidencias, accedemos a la lista de todos las incidencias , donde podemos acceder a cambiarle su estado de atención, es decir si ya fue solucionado o está en proceso, todo eso se efectuará en función de sus atributos los cuales son código de incidencia, código de traslado, tipo de incidencia, fecha de ocurrencia, hora de ocurrencia. 

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/473c34ce-c848-4fff-a216-1fe975accdee)

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/6f7b8316-4a1a-41df-8d1a-89bbc993cc52)

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/276c00bc-e641-40ad-b24e-72ba78bf500f)

#### Interfaz I403: Pantalla de registro de Nueva Incidencia
Al darle click en la opción Nueva Incidencia, accedemos a una pantalla donde nos solicita llenar una serie de campos como tipo de incidencia, tipo de procedimiento, descripción de la incidencia para ser un poco más específico, tipo de norma sobre la que se basa el determinado procedimiento, la fecha y hora de la ocurrencia de la incidencia, código de traslado y el tiempo estimado de de procedimiento en minutos.
Dentro de este pantallazo están involucrados las siguientes interfaces:

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/2ccce023-8530-452a-8a16-e3de1db60cd2)

![image](https://github.com/fiis-bd241/grupo01/assets/164266999/7a508f16-20ab-43bd-86b9-068ff38a657d)

Dentro de este pantallazo están involucrados las interfaces de Tipo de Incidencia, Tipo de Procedimiento,Tipo de Norma con código I404, I405,I406 respectivamente. 

### Módulo de Reportes 
#### Requerimientos Relacionados
R501, R502, R503, R504

#### Códigos de pantallas
I501, I502, I503, I504

#### Pantalla I501: Pantalla de inicio de reportes

![reporte1](https://github.com/fiis-bd241/grupo01/assets/161625149/d458ee05-9521-40fb-9c37-4a78562095d9)

Al dar click en el botón “Generar Reporte”, se abre una ventana emergente para generar un reporte.

Al dar click en el botón “Programar Reporte”, se abre una ventana emergente para programar un reporte.

Al dar click en el botón “Gráficos”, se abre una pantalla con gráficos sobre los demás módulos

Al entrar al módulo se cargan los reportes programados

Al entrar al módulo se carga el inventario en almacén

#### Pantalla I502: Pantalla para generar el reporte

![reporte2](https://github.com/fiis-bd241/grupo01/assets/161625149/b6c7392c-a75e-409e-897d-0bd2dcaea8b8)

Se escoge el formato de una lista desplegable

El tipo de reporte a generar

Las fechas desde donde se escoge la información para el reporte

#### Pantalla I503: Pantalla para programar un reporte

![reporte3](https://github.com/fiis-bd241/grupo01/assets/161625149/caedc6fd-c409-4f38-bbc1-d0f1369a1f56)

Se escoge la frecuencia de generación 

El formato de los reportes generados

El tipo de reporte a generar

Las fechas de inicio y fin para la programación

#### Pantalla I504: Pantalla de gráficos

![reporte4](https://github.com/fiis-bd241/grupo01/assets/161625149/b9e722e2-8dc3-4adb-b75b-e86e132d4397)
![reporte5](https://github.com/fiis-bd241/grupo01/assets/161625149/b6de47c1-8619-4c36-9032-b52606510cdf)

En la esquina superior derecha de cada gráfico está la opción para descargar cada gráfico en imagen

Al pasar el cursor del mouse sobre cada gráfico se ve más información acerca del gráfico

### Módulo de Reclamos

#### Requerimientos Relacionados
R601, R602, R603

#### Códigos de pantallas
I601, I602, I603, I604, I605, I606, I607 y I608

#### Pantalla I601: Pantalla de todos los reclamos

![I1](https://github.com/fiis-bd241/grupo01/assets/130238034/3cb8bff3-c158-448f-87de-b9c464241705)

Al dar click al a la lista “Tipo de cliente”, se puede filtrar clientes internos o externos.

Al dar click al código de un reclamo lleva al usuario a la interfaz I602.

Al dar click al botón "Crear Nuevo Reclamo" lleva al usuario a la interfaz I603.

#### Pantalla I602: Pantalla de la visualización de un reclamo

![I2-1](https://github.com/fiis-bd241/grupo01/assets/130238034/60b30eb3-6487-404c-9483-1f43bd3e3b86)
![I2-2](https://github.com/fiis-bd241/grupo01/assets/130238034/915da37f-e10e-45c0-9c06-44f5cf939a42)

#### Pantalla I603: Pantalla 1 de la creación de un reclamo

![I3](https://github.com/fiis-bd241/grupo01/assets/130238034/8a79e4af-f030-4306-88d7-3a4c8c6c0bc0)

Al dar click al a la lista “Nombre del cliente”, se obtiene una serie de clientes a seleccionar.

Al dar click al a la lista “Nombre del representante”, se obtiene una serie de representante a seleccionar relacionados con el cliente escogido. Además de forma automática se autocompletan los demás campos.

#### Pantalla I604: Pantalla 2 de la creación de un reclamo

![I4](https://github.com/fiis-bd241/grupo01/assets/130238034/6fc45218-1f66-49ce-abe6-1695cc87e046)

Al dar click al a la lista “Código Ticket”, se obtiene una serie de tickets a seleccionar relacionados con el representante escogido.

Al dar click al a la lista “Nombre del producto”, se obtiene una serie de productos a seleccionar relacionados con el ticket escogido. Además de forma automática se autocompletan los demás campos.

#### Pantalla I605: Pantalla 3 de la creación de un reclamo

![I5](https://github.com/fiis-bd241/grupo01/assets/130238034/e2698acf-647d-4925-aa55-d1a4324743fc)

Al dar click al a la lista “Tipo de reclamo”, se obtiene una serie de tipos de reclamos a seleccionar.

Se puede describir el problema en el recuadro designado.

Se puede escoger la fecha en la fecha de incidencia.

Al dar click al a la lista “Urgencia”, se obtiene una serie de urgencias a seleccionar.

#### Pantalla I606: Pantalla 4 de la creación de un reclamo

![I6](https://github.com/fiis-bd241/grupo01/assets/130238034/80ed4fcd-8ecf-483c-9dda-04dc1cd3a2c9)

Se puede escribir el nombre de la evidencia.

Al dar click al a la lista “Tipo de Evidencia”, se obtiene una serie de tipos de evidencia a seleccionar.

Al dar click al a la lista “Tipo de Archivo”, se obtiene una serie de tipos de archivo a seleccionar.

#### Pantalla I607: Pantalla 5 de la creación de un reclamo

![I7](https://github.com/fiis-bd241/grupo01/assets/130238034/62bb9f6c-ab50-4b60-a9f4-23b229ac85e0)

Al dar click al a la lista “Área responsable”, se obtiene las áreas responsables a seleccionar.	

Al dar click al a la lista “Acción solicitada”, se obtiene una serie de acciones solicitadas a seleccionar.

Se puede describir un comentario adicional en el recuadro designado.

#### Pantalla I608: Pantalla 6 de la creación de un reclamo

![I8](https://github.com/fiis-bd241/grupo01/assets/130238034/40b38e3b-e552-4491-aa0b-78f74bdb0d91)

Se puede escoger la fecha en la fecha esperada de resolución.

El número de caso se autocompleta.

Al dar click al a la lista “Estado de Reclamo”, se obtiene los estados de reclamo a seleccionar.

## 5. Próximos Pasos

### Módulo de Pedidos: 
Hacer la filtracion de los productos cuando el empleado ingresa los datos del representante y debe haber un input donde se puede poner si es de tipo venta o abastecimiento para que luego en la solicitud de productos se presentes productos filtrados por el tipo de venta ya sea abastecimiento y venta. Con esta implementacion evitar que el empleado este buscando los productos en una lista donde se muestra todos los productos y que lo haga por la filtracion del tipo de venta

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

### Módulo de Reportes
En el módulo de reportes, es necesario implementar funcionalidades para los módulos de control, seguimiento, pedidos y almacén, garantizando así una cobertura completa de las operaciones críticas. Además, sería beneficioso añadir un chatbot que interprete cada reporte generado, facilitando la comprensión y el análisis de los datos a través de respuestas automatizadas y precisas. También se recomienda habilitar la opción de almacenar los reportes generados en la nube, permitiendo que no solo los empleados de San Fernando tengan acceso, sino también un analista de datos externo. Esto garantizaría una mayor accesibilidad, seguridad y colaboración, optimizando el proceso de toma de decisiones y asegurando que los datos estén disponibles en tiempo real para los interesados. Adicionalmente, la integración de herramientas de visualización de datos podría mejorar la presentación y el análisis de los informes, proporcionando una perspectiva más clara y detallada de la información.

### Módulo de Reclamos

En la creación de un reclamo, el apartado de evidencia podría mejorarse significativamente. Actualmente, solo es posible registrar manualmente una evidencia, especificando el nombre de la evidencia y seleccionando el tipo de archivo y el tipo de evidencia mediante listas desplegables. Para mejorar este proceso, se propone implementar la funcionalidad de subir múltiples evidencias de una vez. Adicionalmente, el sistema debería ser capaz de detectar automáticamente el tipo de archivo y el tipo de evidencia correspondiente, eliminando la necesidad de selección manual. Además, estas evidencias deberían tener la opción de almacenarse en la nube. Esta mejora no solo facilitaría el proceso de registro de evidencias, sino que también garantizaría una mayor seguridad y accesibilidad de la información, permitiendo acceder a las evidencias desde cualquier lugar con conexión a internet.

## 6. NoSQL

``` redis

HSET estado_civil 1 '{"codigo": 1, "descripcion": "Soltero"}'
HSET estado_civil 2 '{"codigo": 2, "descripcion": "Casado"}'
HSET estado_civil 3 '{"codigo": 3, "descripcion": "Conviviente"}'
HSET estado_civil 4 '{"codigo": 4, "descripcion": "Divorciado"}'
HSET estado_civil 5 '{"codigo": 5, "descripcion": "Viudo"}'



HSET nacionalidad 1 '{"cod_nacionalidad":1, "descripcion":"Peruano"}'
HSET nacionalidad 2 '{"cod_nacionalidad":1, "descripcion":"Argentino"}'

HSET genero 1 '{"cod_genero":1 , "descripcion":"Masculino"}'
HSET genero 2 '{"cod_genero":2 , "descripcion":"Femenino"}'


HSET cliente_estado 1 '{"cod_cliente_estado":"A", "estado_cliente":"Activo"}'
HSET cliente_estado 2 '{"cod_cliente_estado":"I", "estado_cliente":"Inactivo"}'


HSET cliente_tipo 1 '{"cod_cliente_tipo":"I","tipo_cliente":"Cliente interno"}'
HSET cliente_tipo 2 '{"cod_cliente_tipo":"E","tipo_cliente":"Cliente externo"}'


HSET vehiculo_estado 1 '{"cod_vehiculo_estado":"D", "descripcion":"Disponible"}'
HSET vehiculo_estado 2 '{"cod_vehiculo_estado":"N", "descripcion":"No disponible"}'
HSET vehiculo_estado 3 '{"cod_vehiculo_estado":"C", "descripcion":"Cuarentena"}'

HSET vehiculo_modelo 1 '{"cod_vehiculo_modelo":"F", "descripcion":"Furgoneta"}'
HSET vehiculo_modelo 2 '{"cod_vehiculo_modelo":"C", "descripcion":"Camión"}'
HSET vehiculo_modelo 3 '{"cod_vehiculo_modelo":"S", "descripcion":"SUV"}'

HSET vehiculo_tipo 1 '{"cod_vehiculo_tipo":"C", "descripcion":"Carga"}'
HSET vehiculo_tipo 2 '{"cod_vehiculo_tipo":"R", "descripcion":"Refrigerante"}'
HSET vehiculo_tipo 3 '{"cod_vehiculo_tipo":"P", "descripcion":"Personal"}'

HSET elemento_catalogo_unidad 1 '{"cod_unidad":1, "descripcion":"Kilogramo"}'
HSET elemento_catalogo_unidad 2 '{"cod_unidad":2, "descripcion":"Gramo"}'
HSET elemento_catalogo_unidad 3 '{"cod_unidad":3, "descripcion":"Litro"}'
HSET elemento_catalogo_unidad 4 '{"cod_unidad":4, "descripcion":"Mililitro"}'
HSET elemento_catalogo_unidad 5 '{"cod_unidad":5, "descripcion":"Metro"}'
HSET elemento_catalogo_unidad 6 '{"cod_unidad":6, "descripcion":"Centímetro"}'
HSET elemento_catalogo_unidad 7 '{"cod_unidad":7, "descripcion":"Unidad"}'
HSET elemento_catalogo_unidad 8 '{"cod_unidad":8, "descripcion":"Docena"}'
HSET elemento_catalogo_unidad 9 '{"cod_unidad":9, "descripcion":"Caja"}'
HSET elemento_catalogo_unidad 10 '{"cod_unidad":10, "descripcion":"Bolsa"}'
HSET elemento_catalogo_unidad 11 '{"cod_unidad":11, "descripcion":"Envase"}'
HSET elemento_catalogo_unidad 12 '{"cod_unidad":12, "descripcion":"Bandeja"}'
HSET elemento_catalogo_unidad 13 '{"cod_unidad":13, "descripcion":"Paquete"}'
HSET elemento_catalogo_unidad 14 '{"cod_unidad":14, "descripcion":"Saco"}'
HSET elemento_catalogo_unidad 15 '{"cod_unidad":15, "descripcion":"Barril"}'
HSET elemento_catalogo_unidad 16 '{"cod_unidad":16, "descripcion":"Galón"}'

HSET elemento_produccion 1 '{"id_elemento_produccion":1, "descripcion":"Materia prima"}'
HSET elemento_produccion 2 '{"id_elemento_produccion":2, "descripcion":"Material"}'
HSET elemento_produccion 3 '{"id_elemento_produccion":3, "descripcion":"Producto"}'

HSET segmento 1 '{"id_segmento":1, "descripcion":"Materiales peligrosos"}'
HSET segmento 2 '{"id_segmento":2, "descripcion":"Suministros y repuestos"}'
HSET segmento 3 '{"id_segmento":3, "descripcion":"Insumos y etiquetas"}'
HSET segmento 4 '{"id_segmento":4, "descripcion":"No aplica"}'


HSET elemento_catalogo_tipo 1 '{"id_elemento_catalogo_tipo":1, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Especias y condimentos"}'
HSET elemento_catalogo_tipo 2 '{"id_elemento_catalogo_tipo":2, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Aditivos alimentarios"}'
HSET elemento_catalogo_tipo 3 '{"id_elemento_catalogo_tipo":3, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Aceites y grasas"}'
HSET elemento_catalogo_tipo 4 '{"id_elemento_catalogo_tipo":4, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Harinas"}'
HSET elemento_catalogo_tipo 5 '{"id_elemento_catalogo_tipo":5, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Huevos"}'
HSET elemento_catalogo_tipo 6 '{"id_elemento_catalogo_tipo":6, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Conservantes"}'
HSET elemento_catalogo_tipo 7 '{"id_elemento_catalogo_tipo":7, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Colorantes"}'
HSET elemento_catalogo_tipo 8 '{"id_elemento_catalogo_tipo":8, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Emulsionantes"}'
HSET elemento_catalogo_tipo 9 '{"id_elemento_catalogo_tipo":9, "id_elemento_produccion":1, "id_segmento":3, "descripcion":"Otras materias primas"}'
HSET elemento_catalogo_tipo 10 '{"id_elemento_catalogo_tipo":10, "id_elemento_produccion":2, "id_segmento":2, "descripcion":"Herramientas"}'
HSET elemento_catalogo_tipo 11 '{"id_elemento_catalogo_tipo":11, "id_elemento_produccion":2, "id_segmento":2, "descripcion":"Repuestos"}'
HSET elemento_catalogo_tipo 12 '{"id_elemento_catalogo_tipo":12, "id_elemento_produccion":2, "id_segmento":1, "descripcion":"Químicos"}'
HSET elemento_catalogo_tipo 13 '{"id_elemento_catalogo_tipo":13, "id_elemento_produccion":2, "id_segmento":1, "descripcion":"Detergentes industriales"}'
HSET elemento_catalogo_tipo 14 '{"id_elemento_catalogo_tipo":14, "id_elemento_produccion":2, "id_segmento":3, "descripcion":"Etiquetas"}'
HSET elemento_catalogo_tipo 15 '{"id_elemento_catalogo_tipo":15, "id_elemento_produccion":2, "id_segmento":2, "descripcion":"Otros materiales"}'
HSET elemento_catalogo_tipo 16 '{"id_elemento_catalogo_tipo":16, "id_elemento_produccion":3, "id_segmento":4, "descripcion":"Pollo congelado"}'
HSET elemento_catalogo_tipo 17 '{"id_elemento_catalogo_tipo":17, "id_elemento_produccion":3, "id_segmento":4, "descripcion":"Pollo fresco"}'
HSET elemento_catalogo_tipo 18 '{"id_elemento_catalogo_tipo":18, "id_elemento_produccion":3, "id_segmento":4, "descripcion":"Saborizado"}'


HSET ruta_tipo 1 '{"cod_ruta_tipo":1, "descripcion":"Urbana"}'
HSET ruta_tipo 2 '{"cod_ruta_tipo":2, "descripcion":"Rural"}'


HSET empleado_cargo 1 '{"cod_empleado_cargo":1, "descripcion":"Supervisor de Almacén"}'
HSET empleado_cargo 2 '{"cod_empleado_cargo":2, "descripcion":"Encargado de almacén"}'
HSET empleado_cargo 3 '{"cod_empleado_cargo":3, "descripcion":"Asistente operativo"}'
HSET empleado_cargo 4 '{"cod_empleado_cargo":4, "descripcion":"Almacenero"}'
HSET empleado_cargo 5 '{"cod_empleado_cargo":5, "descripcion":"Transportista"}'
HSET empleado_cargo 6 '{"cod_empleado_cargo":6, "descripcion":"Técnico de almacén"}'
HSET empleado_cargo 7 '{"cod_empleado_cargo":7, "descripcion":"Supervisor de producción"}'
HSET empleado_cargo 8 '{"cod_empleado_cargo":8, "descripcion":"Técnico de mantenimiento"}'



HSET transportista_estado D '{"cod_estado_transportista":"D", "descripcion":"Disponible"}'
HSET transportista_estado N '{"cod_estado_transportista":"N", "descripcion":"No disponible"}'
HSET transportista_estado C '{"cod_estado_transportista":"C", "descripcion":"Cuarentena"}'

HSET licencia_tipo X '{"cod_tipo_licencia":"X", "descripcion":"A-IIb"}'
HSET licencia_tipo Y '{"cod_tipo_licencia":"Y", "descripcion":"A-IIIb"}'

HSET operacion_tipo 1 '{"cod_tipo_operacion":1, "descripcion":"Picking"}'
HSET operacion_tipo 2 '{"cod_tipo_operacion":2, "descripcion":"Precintado"}'
HSET operacion_tipo 3 '{"cod_tipo_operacion":3, "descripcion":"Paletizado"}'
HSET operacion_tipo 4 '{"cod_tipo_operacion":4, "descripcion":"Carga"}'
HSET operacion_tipo 5 '{"cod_tipo_operacion":5, "descripcion":"Salida"}'
HSET operacion_tipo 6 '{"cod_tipo_operacion":6, "descripcion":"Recepción"}'
HSET operacion_tipo 7 '{"cod_tipo_operacion":7, "descripcion":"Descarga"}'

HSET local_tipo 1 '{"cod_local_tipo":1, "descripcion":"Almacén"}'
HSET local_tipo 2 '{"cod_local_tipo":2, "descripcion":"Recepción"}'
HSET local_tipo 3 '{"cod_local_tipo":3, "descripcion":"Venta"}'
HSET local_tipo 4 '{"cod_local_tipo":4, "descripcion":"Distribuidora"}'


HSET local_region 1 '{"cod_local_region":1, "descripcion":"Amazonas"}'
HSET local_region 2 '{"cod_local_region":2, "descripcion":"Áncash"}'
HSET local_region 3 '{"cod_local_region":3, "descripcion":"Apurímac"}'
HSET local_region 4 '{"cod_local_region":4, "descripcion":"Arequipa"}'
HSET local_region 5 '{"cod_local_region":5, "descripcion":"Ayacucho"}'
HSET local_region 6 '{"cod_local_region":6, "descripcion":"Cajamarca"}'
HSET local_region 7 '{"cod_local_region":7, "descripcion":"Callao"}'
HSET local_region 8 '{"cod_local_region":8, "descripcion":"Cusco"}'
HSET local_region 9 '{"cod_local_region":9, "descripcion":"Huancavelica"}'
HSET local_region 10 '{"cod_local_region":10, "descripcion":"Huánuco"}'
HSET local_region 11 '{"cod_local_region":11, "descripcion":"Ica"}'
HSET local_region 12 '{"cod_local_region":12, "descripcion":"Junín"}'
HSET local_region 13 '{"cod_local_region":13, "descripcion":"La Libertad"}'
HSET local_region 14 '{"cod_local_region":14, "descripcion":"Lambayeque"}'
HSET local_region 15 '{"cod_local_region":15, "descripcion":"Lima"}'
HSET local_region 16 '{"cod_local_region":16, "descripcion":"Loreto"}'
HSET local_region 17 '{"cod_local_region":17, "descripcion":"Madre de Dios"}'
HSET local_region 18 '{"cod_local_region":18, "descripcion":"Moquegua"}'
HSET local_region 19 '{"cod_local_region":19, "descripcion":"Pasco"}'
HSET local_region 20 '{"cod_local_region":20, "descripcion":"Piura"}'
HSET local_region 21 '{"cod_local_region":21, "descripcion":"Puno"}'
HSET local_region 22 '{"cod_local_region":22, "descripcion":"San Martín"}'
HSET local_region 23 '{"cod_local_region":23, "descripcion":"Tacna"}'
HSET local_region 24 '{"cod_local_region":24, "descripcion":"Tumbes"}'
HSET local_region 25 '{"cod_local_region":25, "descripcion":"Ucayali"}'

HSET local_distrito 1 '{"cod_local_distrito":1, "descripcion":"Ancón"}'
HSET local_distrito 2 '{"cod_local_distrito":2, "descripcion":"Ate"}'
HSET local_distrito 3 '{"cod_local_distrito":3, "descripcion":"Barranco"}'
HSET local_distrito 4 '{"cod_local_distrito":4, "descripcion":"Breña"}'
HSET local_distrito 5 '{"cod_local_distrito":5, "descripcion":"Carabayllo"}'
HSET local_distrito 6 '{"cod_local_distrito":6, "descripcion":"Chaclacayo"}'
HSET local_distrito 7 '{"cod_local_distrito":7, "descripcion":"Chorrillos"}'
HSET local_distrito 8 '{"cod_local_distrito":8, "descripcion":"Cieneguilla"}'
HSET local_distrito 9 '{"cod_local_distrito":9, "descripcion":"Comas"}'
HSET local_distrito 10 '{"cod_local_distrito":10, "descripcion":"El Agustino"}'
HSET local_distrito 11 '{"cod_local_distrito":11, "descripcion":"Independencia"}'
HSET local_distrito 12 '{"cod_local_distrito":12, "descripcion":"Jesús María"}'
HSET local_distrito 13 '{"cod_local_distrito":13, "descripcion":"La Molina"}'
HSET local_distrito 14 '{"cod_local_distrito":14, "descripcion":"La Victoria"}'
HSET local_distrito 15 '{"cod_local_distrito":15, "descripcion":"Lima"}'
HSET local_distrito 16 '{"cod_local_distrito":16, "descripcion":"Lince"}'
HSET local_distrito 17 '{"cod_local_distrito":17, "descripcion":"Los Olivos"}'
HSET local_distrito 18 '{"cod_local_distrito":18, "descripcion":"Lurigancho-Chosica"}'
HSET local_distrito 19 '{"cod_local_distrito":19, "descripcion":"Lurín"}'
HSET local_distrito 20 '{"cod_local_distrito":20, "descripcion":"Magdalena del Mar"}'
HSET local_distrito 21 '{"cod_local_distrito":21, "descripcion":"Miraflores"}'
HSET local_distrito 22 '{"cod_local_distrito":22, "descripcion":"Pachacámac"}'
HSET local_distrito 23 '{"cod_local_distrito":23, "descripcion":"Pucusana"}'
HSET local_distrito 24 '{"cod_local_distrito":24, "descripcion":"Pueblo Libre"}'
HSET local_distrito 25 '{"cod_local_distrito":25, "descripcion":"Puente Piedra"}'
HSET local_distrito 26 '{"cod_local_distrito":26, "descripcion":"Punta Hermosa"}'
HSET local_distrito 27 '{"cod_local_distrito":27, "descripcion":"Punta Negra"}'
HSET local_distrito 28 '{"cod_local_distrito":28, "descripcion":"Rímac"}'
HSET local_distrito 29 '{"cod_local_distrito":29, "descripcion":"San Bartolo"}'
HSET local_distrito 30 '{"cod_local_distrito":30, "descripcion":"San Borja"}'
HSET local_distrito 31 '{"cod_local_distrito":31, "descripcion":"San Isidro"}'
HSET local_distrito 32 '{"cod_local_distrito":32, "descripcion":"San Juan de Lurigancho"}'
HSET local_distrito 33 '{"cod_local_distrito":33, "descripcion":"San Juan de Miraflores"}'
HSET local_distrito 34 '{"cod_local_distrito":34, "descripcion":"San Luis"}'
HSET local_distrito 35 '{"cod_local_distrito":35, "descripcion":"San Martín de Porres"}'
HSET local_distrito 36 '{"cod_local_distrito":36, "descripcion":"San Miguel"}'
HSET local_distrito 37 '{"cod_local_distrito":37, "descripcion":"Santa Anita"}'
HSET local_distrito 38 '{"cod_local_distrito":38, "descripcion":"Santa María del Mar"}'
HSET local_distrito 39 '{"cod_local_distrito":39, "descripcion":"Santa Rosa"}'
HSET local_distrito 40 '{"cod_local_distrito":40, "descripcion":"Santiago de Surco"}'
HSET local_distrito 41 '{"cod_local_distrito":41, "descripcion":"Surquillo"}'
HSET local_distrito 42 '{"cod_local_distrito":42, "descripcion":"Villa El Salvador"}'
HSET local_distrito 43 '{"cod_local_distrito":43, "descripcion":"Villa María del Triunfo"}'
HSET local_distrito 44 '{"cod_local_distrito":44, "descripcion":"Huaral"}'
HSET local_distrito 45 '{"cod_local_distrito":45, "descripcion":"Ventanilla"}'
HSET local_distrito 46 '{"cod_local_distrito":46, "descripcion":"Callao"}'








HSET paradero_tipo 1 '{"cod_paradero_tipo":1, "descripcion":"Origen"}'
HSET paradero_tipo 2 '{"cod_paradero_tipo":2, "descripcion":"Paradero"}'
HSET paradero_tipo 3 '{"cod_paradero_tipo":3, "descripcion":"Destino"}'

HSET pedido_tipo A '{"cod_pedido_tipo":"A", "tipo_pedido":"Abastecimiento"}'
HSET pedido_tipo V '{"cod_pedido_tipo":"V", "tipo_pedido":"Venta"}'

HSET pedido_estado A '{"cod_pedido_estado":"A", "estado_pedido":"Aceptado"}'
HSET pedido_estado R '{"cod_pedido_estado":"R", "estado_pedido":"Rechazado"}'
HSET pedido_estado P '{"cod_pedido_estado":"P", "estado_pedido":"En proceso"}'
HSET pedido_estado E '{"cod_pedido_estado":"E", "estado_pedido":"Entregado"}'
HSET pedido_estado F '{"cod_pedido_estado":"F", "estado_pedido":"Finalizado"}'

HSET incidencia_tipo A '{"cod_tipo_incidencia":"A", "descripcion":"Incidencia de tipo A: retrasos en la entrega"}'
HSET incidencia_tipo B '{"cod_tipo_incidencia":"B", "descripcion":"Incidencia de tipo B: errores en el etiquetado o embalaje"}'
HSET incidencia_tipo C '{"cod_tipo_incidencia":"C", "descripcion":"Incidencia de tipo C: fallas en la documentación"}'
HSET incidencia_tipo D '{"cod_tipo_incidencia":"D", "descripcion":"Incidencia de tipo D: problemas mecánicos con el vehículo"}'
HSET incidencia_tipo E '{"cod_tipo_incidencia":"E", "descripcion":"Incidencia de tipo E: error en la asignación de ruta"}'


HSET procedimiento_tipo A '{"cod_tipo_procedimiento":"A", "descripcion":"Procedimiento de tipo A: retrasos en la entrega"}'
HSET procedimiento_tipo B '{"cod_tipo_procedimiento":"B", "descripcion":"Procedimiento de tipo B: errores en el etiquetado o embalaje"}'
HSET procedimiento_tipo C '{"cod_tipo_procedimiento":"C", "descripcion":"Procedimiento de tipo C: fallas en la documentación"}'
HSET procedimiento_tipo D '{"cod_tipo_procedimiento":"D", "descripcion":"Procedimiento de tipo D: problemas mecánicos con el vehículo"}'
HSET procedimiento_tipo E '{"cod_tipo_procedimiento":"E", "descripcion":"Procedimiento de tipo E: error en la asignación de ruta"}'

HSET norma_tipo X '{"cod_norma_tipo":"X", "descripcion":"NTP 209.027"}'
HSET norma_tipo Y '{"cod_norma_tipo":"Y", "descripcion":"ISO 17712"}'
HSET norma_tipo Z '{"cod_norma_tipo":"Z", "descripcion":"ISO 22000"}'
HSET norma_tipo W '{"cod_norma_tipo":"W", "descripcion":"ISO 9001"}'

HSET accion_tipo I '{"cod_tipo_accion":"I", "descripcion":"Investigación"}'
HSET accion_tipo E '{"cod_tipo_accion":"E", "descripcion":"Evaluación"}'
HSET accion_tipo R '{"cod_tipo_accion":"R", "descripcion":"Resarcimiento"}'
HSET accion_tipo C '{"cod_tipo_accion":"C", "descripcion":"Correción"}'

HSET reclamo_tipo A '{"cod_tipo_reclamo":"A", "descripcion":"Productos en mal estado o de calidad inferior"}'
HSET reclamo_tipo B '{"cod_tipo_reclamo":"B", "descripcion":"Cantidad incorrecta de productos recibidos"}'
HSET reclamo_tipo C '{"cod_tipo_reclamo":"C", "descripcion":"Productos incorrectos o diferentes a los solicitados"}'
HSET reclamo_tipo D '{"cod_tipo_reclamo":"D", "descripcion":"Embalaje inadecuado que afecta la frescura o la calidad de los productos"}'
HSET reclamo_tipo E '{"cod_tipo_reclamo":"E", "descripcion":"Retraso en la entrega del pedido"}'
HSET reclamo_tipo F '{"cod_tipo_reclamo":"F", "descripcion":"Problemas con la facturación o el proceso de pago"}'
HSET reclamo_tipo G '{"cod_tipo_reclamo":"G", "descripcion":"Problemas relacionados con la limpieza, higiene o seguridad de los productos"}'



HSET estado_reclamo A '{"cod_estado_reclamo":"A", "descripcion":"Pendiente"}'
HSET estado_reclamo B '{"cod_estado_reclamo":"B", "descripcion":"En Proceso"}'
HSET estado_reclamo C '{"cod_estado_reclamo":"C", "descripcion":"Resuelto"}'
HSET estado_reclamo D '{"cod_estado_reclamo":"D", "descripcion":"Rechazado"}'

HSET nivel_urgencia B '{"cod_nivel_urgencia":"B", "descripcion":"Baja"}'
HSET nivel_urgencia M '{"cod_nivel_urgencia":"M", "descripcion":"Media"}'
HSET nivel_urgencia A '{"cod_nivel_urgencia":"A", "descripcion":"Alta"}'

HSET evidencia_tipo C '{"cod_tipo_evidencia":"C", "descripcion":"Captura Pantalla"}'
HSET evidencia_tipo D '{"cod_tipo_evidencia":"D", "descripcion":"Documento"}'
HSET evidencia_tipo E '{"cod_tipo_evidencia":"E", "descripcion":"Escaneo"}'
HSET evidencia_tipo F '{"cod_tipo_evidencia":"F", "descripcion":"Fotografía"}'
HSET evidencia_tipo G '{"cod_tipo_evidencia":"G", "descripcion":"Grabación de audio"}'
HSET evidencia_tipo T '{"cod_tipo_evidencia":"T", "descripcion":"Testimonio escrito"}'
HSET evidencia_tipo V '{"cod_tipo_evidencia":"V", "descripcion":"Video"}'


HSET archivo_tipo 1 '{"cod_tipo_archivo":1, "descripcion":"AAC"}'
HSET archivo_tipo 2 '{"cod_tipo_archivo":2, "descripcion":"AVI"}'
HSET archivo_tipo 3 '{"cod_tipo_archivo":3, "descripcion":"BMP"}'
HSET archivo_tipo 4 '{"cod_tipo_archivo":4, "descripcion":"CSV"}'
HSET archivo_tipo 5 '{"cod_tipo_archivo":5, "descripcion":"DOCX"}'
HSET archivo_tipo 6 '{"cod_tipo_archivo":6, "descripcion":"FLAC"}'
HSET archivo_tipo 7 '{"cod_tipo_archivo":7, "descripcion":"GIF"}'
HSET archivo_tipo 8 '{"cod_tipo_archivo":8, "descripcion":"JPG"}'
HSET archivo_tipo 9 '{"cod_tipo_archivo":9, "descripcion":"MKV"}'
HSET archivo_tipo 10 '{"cod_tipo_archivo":10, "descripcion":"MOV"}'
HSET archivo_tipo 11 '{"cod_tipo_archivo":11, "descripcion":"MP3"}'
HSET archivo_tipo 12 '{"cod_tipo_archivo":12, "descripcion":"MP4"}'
HSET archivo_tipo 13 '{"cod_tipo_archivo":13, "descripcion":"OGG"}'
HSET archivo_tipo 14 '{"cod_tipo_archivo":14, "descripcion":"PDF"}'
HSET archivo_tipo 15 '{"cod_tipo_archivo":15, "descripcion":"PNG"}'
HSET archivo_tipo 16 '{"cod_tipo_archivo":16, "descripcion":"PPTX"}'
HSET archivo_tipo 17 '{"cod_tipo_archivo":17, "descripcion":"RTF"}'
HSET archivo_tipo 18 '{"cod_tipo_archivo":18, "descripcion":"TIFF"}'
HSET archivo_tipo 19 '{"cod_tipo_archivo":19, "descripcion":"TXT"}'
HSET archivo_tipo 20 '{"cod_tipo_archivo":20, "descripcion":"WAV"}'
HSET archivo_tipo 21 '{"cod_tipo_archivo":21, "descripcion":"WMV"}'
HSET archivo_tipo 22 '{"cod_tipo_archivo":22, "descripcion":"XLSX"}'

HSET reporte_formato 1 '{"cod_reporte_formato":1, "descripcion":"DOCX"}'
HSET reporte_formato 2 '{"cod_reporte_formato":2, "descripcion":"PDF"}'
HSET reporte_formato 3 '{"cod_reporte_formato":3, "descripcion":"XLSX"}'
HSET reporte_formato 4 '{"cod_reporte_formato":4, "descripcion":"CSV"}'

HSET reporte_estado 1 '{"cod_reporte_estado":1, "descripcion":"Activo"}'
HSET reporte_estado 2 '{"cod_reporte_estado":2, "descripcion":"Inactivo"}'


HSET persona 1 '{"cod_persona":1, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"77688137", "primer_apellido":"López", "segundo_apellido":"García", "prenombre":"Juan", "direccion":"AV BENAVIDES 1015 MIRAFLORES, Lima"}'
HSET persona 2 '{"cod_persona":2, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"52359123", "primer_apellido":"Mendoza", "segundo_apellido":"Mendoza", "prenombre":"Luis", "direccion":"Av. Alameda Del Corregidor 3023, Lima"}'
HSET persona 3 '{"cod_persona":3, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"76464764", "primer_apellido":"Rodríguez", "segundo_apellido":"Valdés", "prenombre":"Pedro", "direccion":"Avenida Heroes Del Cenepa, Lt. 120, Lima"}'
HSET persona 4 '{"cod_persona":4, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":2, "dni":"46729764", "primer_apellido":"Martínez", "segundo_apellido":"Perez", "prenombre":"Ana", "direccion":"2450, Of. 602, Edificio El Dorado, Lima, Trujillo"}'
HSET persona 5 '{"cod_persona":5, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"79641337", "primer_apellido":"Hernández", "segundo_apellido":"Flores", "prenombre":"Luis", "direccion":"Avenida Los Alamos 345, Chiclayo"}'
HSET persona 6 '{"cod_persona":6, "cod_estado_civil":3, "cod_nacionalidad":1, "cod_genero":2, "dni":"45424873", "primer_apellido":"González", "segundo_apellido":"Martinez", "prenombre":"Laura", "direccion":"Santa Iluminata, Mz. A Lt. 6, Lima"}'
HSET persona 7 '{"cod_persona":7, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"73283354", "primer_apellido":"Ramírez", "segundo_apellido":"Ramírez", "prenombre":"Carlos", "direccion":"AV DOLORES 119, JOSE LUIS BUSTAMANTE Y RIVERO, Lima"}'
HSET persona 8 '{"cod_persona":8, "cod_estado_civil":3, "cod_nacionalidad":1, "cod_genero":2, "dni":"43783734", "primer_apellido":"Vargas", "segundo_apellido":"Guerrero", "prenombre":"Diana", "direccion":"Avenida Los Cerezos 234, Iquitos"}'
HSET persona 9 '{"cod_persona":9, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":1, "dni":"45373782", "primer_apellido":"Paredes", "segundo_apellido":"Osvaldo", "prenombre":"Roberto", "direccion":"Calle Las Palmeras 567, Tacna"}'
HSET persona 10 '{"cod_persona":10, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":2, "dni":"43787671", "primer_apellido":"Torres", "segundo_apellido":"Lopez", "prenombre":"Sandra", "direccion":"Avenida Los Pinos 890, Puno"}'
HSET persona 11 '{"cod_persona":11, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":1, "dni":"78978464", "primer_apellido":"Pérez", "segundo_apellido":"Alvarez", "prenombre":"Juan", "direccion":"Calle Víctor Reynel, 766, Lima"}'
HSET persona 12 '{"cod_persona":12, "cod_estado_civil":3, "cod_nacionalidad":1, "cod_genero":2, "dni":"75696723", "primer_apellido":"García", "segundo_apellido":"Ruiz", "prenombre":"Ana", "direccion":"Cl 2 Lt 17, Bellavista, Callao"}'
HSET persona 13 '{"cod_persona":13, "cod_estado_civil":5, "cod_nacionalidad":1, "cod_genero":1, "dni":"45396782", "primer_apellido":"Rodríguez", "segundo_apellido":"Jiménez", "prenombre":"Pedro", "direccion":"Cl De La Colina, Narciso Nro 911, Lima"}'
HSET persona 14 '{"cod_persona":14, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":2, "dni":"16786781", "primer_apellido":"Fernández", "segundo_apellido":"Hernández", "prenombre":"Laura", "direccion":"Avenida Trinidad Morán, Mz. J Lt. 2 León Xvi, Arequipa"}'
HSET persona 15 '{"cod_persona":15, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"16877361", "primer_apellido":"Gómez", "segundo_apellido":"Quispe", "prenombre":"Miguel", "direccion":"Gutiérrez De La Fuente,119,Iv Centenario, Arequipa"}'
HSET persona 16 '{"cod_persona":16, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":2, "dni":"16786455", "primer_apellido":"Díaz", "segundo_apellido":"Navarro", "prenombre":"Elena", "direccion":"LT 25, URB MANUEL AREVALO ETAPA III, LA ESPERANZA, La Libertad"}'
HSET persona 17 '{"cod_persona":17, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"74524324", "primer_apellido":"Sánchez", "segundo_apellido":"Pérez", "prenombre":"David", "direccion":"AV 13 DE NOVIEMBRE 994 OF 202, EL TAMBO, Junin"}'
HSET persona 18 '{"cod_persona":18, "cod_estado_civil":4, "cod_nacionalidad":1, "cod_genero":2, "dni":"43787353", "primer_apellido":"Martín", "segundo_apellido":"Velázquez", "prenombre":"Sara", "direccion":"Jirón Moquegua, 140, Huanuco"}'
HSET persona 19 '{"cod_persona":19, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"65775732", "primer_apellido":"Ruiz", "segundo_apellido":"Ruíz", "prenombre":"Javier", "direccion":"Calle Santa Catalina, 384, Cuzco"}'
HSET persona 20 '{"cod_persona":20, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":2, "dni":"86876711", "primer_apellido":"Gutiérrez", "segundo_apellido":"Arroyo", "prenombre":"Paula", "direccion":"AV NICOLAS DE PIEROLA 1518, LA ESPERANZA, La Libertad"}'
HSET persona 21 '{"cod_persona":21, "cod_estado_civil":3, "cod_nacionalidad":1, "cod_genero":1, "dni":"14242781", "primer_apellido":"López", "segundo_apellido":"Cruzado", "prenombre":"Daniel", "direccion":"Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa"}'
HSET persona 22 '{"cod_persona":22, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":2, "dni":"42343272", "primer_apellido":"Hernández", "segundo_apellido":"Flores", "prenombre":"Lucía", "direccion":"CA SANTA MARTA 302 INT 25, AREQUIPA, Arequipa"}'
HSET persona 23 '{"cod_persona":23, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"78943713", "primer_apellido":"Pérez", "segundo_apellido":"Espinoza", "prenombre":"Alejandro", "direccion":"Av Joaquín Madrid Nro 141, Lima"}'
HSET persona 24 '{"cod_persona":24, "cod_estado_civil":1, "cod_nacionalidad":1, "cod_genero":1, "dni":"78567231", "primer_apellido":"Sánchez", "segundo_apellido":"Chávez", "prenombre":"David", "direccion":"Jirón Sinchi Roca, 310, 376, La Libertad"}'
HSET persona 25 '{"cod_persona":25, "cod_estado_civil":2, "cod_nacionalidad":1, "cod_genero":2, "dni":"20220002", "primer_apellido":"Martín", "segundo_apellido":"Cruz", "prenombre":"Sara", "direccion":"Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa"}'

HSET cliente 1 '{"cod_cliente":1, "cod_cliente_tipo":"I", "cod_cliente_estado":"A", "nombre":"Almacen", "ruc":"20100154308", "razon_social":"SAN FERNANDO S.A.", "fecha_registro":"2002-06-01"}'
HSET cliente 2 '{"cod_cliente":2, "cod_cliente_tipo":"I", "cod_cliente_estado":"A", "nombre":"Atencion al cliente", "ruc":"20100154308", "razon_social":"SAN FERNANDO S.A.", "fecha_registro":"2002-06-01"}'
HSET cliente 3 '{"cod_cliente":3, "cod_cliente_tipo":"I", "cod_cliente_estado":"A", "nombre":"Produccion", "ruc":"20100154308", "razon_social":"SAN FERNANDO S.A.", "fecha_registro":"2002-06-01"}'
HSET cliente 4 '{"cod_cliente":4, "cod_cliente_tipo":"I", "cod_cliente_estado":"A", "nombre":"Mantenimiento", "ruc":"20100154308", "razon_social":"SAN FERNANDO S.A.", "fecha_registro":"2002-06-01"}'
HSET cliente 5 '{"cod_cliente":5, "cod_cliente_tipo":"E", "cod_cliente_estado":"A", "nombre":"PLAZA VEA", "ruc":"20100070970", "razon_social":"SOCIEDAD ANONIMA O S.P.S.A.", "fecha_registro":"2023-05-15"}'
HSET cliente 6 '{"cod_cliente":6, "cod_cliente_tipo":"E", "cod_cliente_estado":"A", "nombre":"Tottus Hipermercado-Tottus", "ruc":"20508565934", "razon_social":"HIPERMERCADOS TOTTUS S.A", "fecha_registro":"2022-11-28"}'
HSET cliente 7 '{"cod_cliente":7, "cod_cliente_tipo":"E", "cod_cliente_estado":"A", "nombre":"Wong & Metro", "ruc":"20109072177", "razon_social":"Cencosud Retail Peru S.A.", "fecha_registro":"2023-07-03"}'
HSET cliente 8 '{"cod_cliente":8, "cod_cliente_tipo":"E", "cod_cliente_estado":"A", "nombre":"Kentucky Fried Chicken", "ruc":"20100123330", "razon_social":"DELOSI S.A.", "fecha_registro":"2022-10-12"}'
HSET cliente 9 '{"cod_cliente":9, "cod_cliente_tipo":"E", "cod_cliente_estado":"A", "nombre":"Pardos Chicken-Planet-Pasquale", "ruc":"20510885229", "razon_social":"SANGUCHES DEL PERU S.A.C", "fecha_registro":"2024-01-25"}'
HSET cliente 10 '{"cod_cliente":10, "cod_cliente_tipo":"E", "cod_cliente_estado":"A", "nombre":"Rockys", "ruc":"20513427710", "razon_social":"Grupo Rokys S.A.C.", "fecha_registro":"2023-03-08"}'

HSET ubicacion 1 '{"cod_ubicacion":1, "longitud":-11.556595, "latitud":-77.203523}'
HSET ubicacion 2 '{"cod_ubicacion":2, "longitud":-11.501818, "latitud":-77.226304}'
HSET ubicacion 3 '{"cod_ubicacion":3, "longitud":-11.872139, "latitud":-77.127159}'
HSET ubicacion 4 '{"cod_ubicacion":4, "longitud":-11.866499, "latitud":-77.073656}'
HSET ubicacion 5 '{"cod_ubicacion":5, "longitud":-11.518728, "latitud":-77.205331}'
HSET ubicacion 6 '{"cod_ubicacion":6, "longitud":-11.547767, "latitud":-77.203855}'
HSET ubicacion 7 '{"cod_ubicacion":7, "longitud":-11.593654, "latitud":-77.201504}'
HSET ubicacion 8 '{"cod_ubicacion":8, "longitud":-11.728288, "latitud":-77.165746}'
HSET ubicacion 9 '{"cod_ubicacion":9, "longitud":-11.834073, "latitud":-77.112874}'
HSET ubicacion 10 '{"cod_ubicacion":10, "longitud":-11.928733, "latitud":-77.072607}'
HSET ubicacion 11 '{"cod_ubicacion":11, "longitud":-12.007750, "latitud":-77.056319}'
HSET ubicacion 12 '{"cod_ubicacion":12, "longitud":-11.993166, "latitud":-77.063375}'
HSET ubicacion 13 '{"cod_ubicacion":13, "longitud":-12.059688, "latitud":-77.041633}'
HSET ubicacion 14 '{"cod_ubicacion":14, "longitud":-12.089659, "latitud":-77.023307}'
HSET ubicacion 15 '{"cod_ubicacion":15, "longitud":-12.028432, "latitud":-77.084411}'
HSET ubicacion 16 '{"cod_ubicacion":16, "longitud":-12.058004, "latitud":-77.037207}'
HSET ubicacion 17 '{"cod_ubicacion":17, "longitud":-12.051560, "latitud":-77.031446}'
HSET ubicacion 18 '{"cod_ubicacion":18, "longitud":-12.173548, "latitud":-76.990706}'
HSET ubicacion 19 '{"cod_ubicacion":19, "longitud":-12.004222, "latitud":-77.093759}'
HSET ubicacion 20 '{"cod_ubicacion":20, "longitud":-12.034577, "latitud":-77.047632}'
HSET ubicacion 21 '{"cod_ubicacion":21, "longitud":-12.072477, "latitud":-77.065383}'
HSET ubicacion 22 '{"cod_ubicacion":22, "longitud":-12.072888, "latitud":-77.008987}'
HSET ubicacion 23 '{"cod_ubicacion":23, "longitud":-12.049493, "latitud":-77.112024}'
HSET ubicacion 24 '{"cod_ubicacion":24, "longitud":-12.006146, "latitud":-77.001076}'
HSET ubicacion 25 '{"cod_ubicacion":25, "longitud":-12.180751, "latitud":-77.002283}'
HSET ubicacion 26 '{"cod_ubicacion":26, "longitud":-12.169918, "latitud":-77.023956}'
HSET ubicacion 27 '{"cod_ubicacion":27, "longitud":-11.933034, "latitud":-77.054910}'
HSET ubicacion 28 '{"cod_ubicacion":28, "longitud":-12.086610, "latitud":-77.033145}'


HSET ticket 1 '{"cod_ticket":1, "fecha_entrega":"2019-04-27"}'
HSET ticket 2 '{"cod_ticket":2, "fecha_entrega":"2021-04-22"}'
HSET ticket 3 '{"cod_ticket":3, "fecha_entrega":"2022-01-20"}'
HSET ticket 4 '{"cod_ticket":4, "fecha_entrega":"2022-01-22"}'
HSET ticket 5 '{"cod_ticket":5, "fecha_entrega":"2022-05-22"}'
HSET ticket 6 '{"cod_ticket":6, "fecha_entrega":"2022-11-18"}'
HSET ticket 7 '{"cod_ticket":7, "fecha_entrega":"2023-01-20"}'
HSET ticket 8 '{"cod_ticket":8, "fecha_entrega":"2023-01-22"}'
HSET ticket 9 '{"cod_ticket":9, "fecha_entrega":"2023-03-20"}'
HSET ticket 10 '{"cod_ticket":10, "fecha_entrega":"2023-04-20"}'
HSET ticket 11 '{"cod_ticket":11, "fecha_entrega":"2023-05-20"}'
HSET ticket 12 '{"cod_ticket":12, "fecha_entrega":"2023-05-22"}'
HSET ticket 13 '{"cod_ticket":13, "fecha_entrega":"2023-06-20"}'
HSET ticket 14 '{"cod_ticket":14, "fecha_entrega":"2023-09-16"}'
HSET ticket 15 '{"cod_ticket":15, "fecha_entrega":"2023-11-22"}'
HSET ticket 16 '{"cod_ticket":16, "fecha_entrega":"2023-12-19"}'
HSET ticket 17 '{"cod_ticket":17, "fecha_entrega":"2024-01-22"}'
HSET ticket 18 '{"cod_ticket":18, "fecha_entrega":"2024-02-22"}'
HSET ticket 19 '{"cod_ticket":19, "fecha_entrega":"2024-04-20"}'
HSET ticket 20 '{"cod_ticket":20, "fecha_entrega":"2024-04-22"}'


HSET vehiculo 1 '{"cod_vehiculo":1, "cod_vehiculo_estado":"D", "cod_vehiculo_modelo":"F", "cod_vehiculo_tipo":"C", "anio_fabricacion":2008, "capacidad_carga":850, "fecha_ultimo_mantenimiento":"2022-01-10", "fecha_ultimo_viaje":"2024-01-24", "placa":"A4E-123"}'
HSET vehiculo 2 '{"cod_vehiculo":2, "cod_vehiculo_estado":"N", "cod_vehiculo_modelo":"C", "cod_vehiculo_tipo":"R", "anio_fabricacion":2009, "capacidad_carga":620.5, "fecha_ultimo_mantenimiento":"2023-02-12", "fecha_ultimo_viaje":"2024-02-24", "placa":"D3F-756"}'
HSET vehiculo 3 '{"cod_vehiculo":3, "cod_vehiculo_estado":"C", "cod_vehiculo_modelo":"S", "cod_vehiculo_tipo":"C", "anio_fabricacion":2020, "capacidad_carga":440.2, "fecha_ultimo_mantenimiento":"2022-03-05", "fecha_ultimo_viaje":"2024-03-15", "placa":"G5I-789"}'
HSET vehiculo 4 '{"cod_vehiculo":4, "cod_vehiculo_estado":"D", "cod_vehiculo_modelo":"S", "cod_vehiculo_tipo":"C", "anio_fabricacion":2015, "capacidad_carga":550, "fecha_ultimo_mantenimiento":"2021-04-08", "fecha_ultimo_viaje":"2024-04-14", "placa":"J4L-223"}'
HSET vehiculo 5 '{"cod_vehiculo":5, "cod_vehiculo_estado":"N", "cod_vehiculo_modelo":"F", "cod_vehiculo_tipo":"C", "anio_fabricacion":2012, "capacidad_carga":650, "fecha_ultimo_mantenimiento":"2023-05-15", "fecha_ultimo_viaje":"2024-05-27", "placa":"M9O-456"}'
HSET vehiculo 6 '{"cod_vehiculo":6, "cod_vehiculo_estado":"C", "cod_vehiculo_modelo":"C", "cod_vehiculo_tipo":"C", "anio_fabricacion":2021, "capacidad_carga":600, "fecha_ultimo_mantenimiento":"2023-06-02", "fecha_ultimo_viaje":"2024-06-24", "placa":"P3R-789"}'
HSET vehiculo 7 '{"cod_vehiculo":7, "cod_vehiculo_estado":"C", "cod_vehiculo_modelo":"S", "cod_vehiculo_tipo":"R", "anio_fabricacion":2006, "capacidad_carga":620.4, "fecha_ultimo_mantenimiento":"2021-07-18", "fecha_ultimo_viaje":"2024-07-24", "placa":"S5U-123"}'
HSET vehiculo 8 '{"cod_vehiculo":8, "cod_vehiculo_estado":"D", "cod_vehiculo_modelo":"F", "cod_vehiculo_tipo":"C", "anio_fabricacion":2017, "capacidad_carga":620.2, "fecha_ultimo_mantenimiento":"2022-08-10", "fecha_ultimo_viaje":"2024-08-24", "placa":"V4X-456"}'
HSET vehiculo 9 '{"cod_vehiculo":9, "cod_vehiculo_estado":"N", "cod_vehiculo_modelo":"F", "cod_vehiculo_tipo":"C", "anio_fabricacion":2020, "capacidad_carga":220, "fecha_ultimo_mantenimiento":"2023-09-05", "fecha_ultimo_viaje":"2024-09-05", "placa":"Y7A-789"}'
HSET vehiculo 10 '{"cod_vehiculo":10, "cod_vehiculo_estado":"C", "cod_vehiculo_modelo":"C", "cod_vehiculo_tipo":"C", "anio_fabricacion":2018, "capacidad_carga":430, "fecha_ultimo_mantenimiento":"2022-10-15", "fecha_ultimo_viaje":"2024-10-22", "placa":"B8D-413"}'



HSET elemento_catalogo 1 '{"id_elemento_catalogo":1, "nombre":"Filete de pechuga de pollo San Fernando congelado", "id_elemento_catalogo_tipo":31, "descripcion":"Filete de pechuga de pollo San Fernando congelado, listo para su uso en la preparación de platos.", "cod_unidad":7, "temperatura_maxima":-18, "temperatura_minima":-20, "vida_util":90, "peso_unitario":900}'
HSET elemento_catalogo 2 '{"id_elemento_catalogo":2, "nombre":"Pierna de pollo San Fernando congelada", "id_elemento_catalogo_tipo":31, "descripcion":"Pierna de pollo San Fernando congelada, perfecta para su uso en la elaboración de diversos platos.", "cod_unidad":7, "temperatura_maxima":-18, "temperatura_minima":-20, "vida_util":90, "peso_unitario":1200}'
HSET elemento_catalogo 3 '{"id_elemento_catalogo":3, "nombre":"Ala de pollo San Fernando congelada", "id_elemento_catalogo_tipo":31, "descripcion":"Ala de pollo San Fernando congelada, ideal para recetas fáciles y deliciosas.", "cod_unidad":7, "temperatura_maxima":-18, "temperatura_minima":-20, "vida_util":90, "peso_unitario":800}'
HSET elemento_catalogo 4 '{"id_elemento_catalogo":4, "nombre":"Muslo de pollo San Fernando congelado", "id_elemento_catalogo_tipo":31, "descripcion":"Muslo de pollo San Fernando congelado, versátil y sabroso para preparaciones culinarias.", "cod_unidad":7, "temperatura_maxima":-18, "temperatura_minima":-20, "vida_util":90, "peso_unitario":1000}'
HSET elemento_catalogo 5 '{"id_elemento_catalogo":5, "nombre":"Pechuga entera de pollo San Fernando congelada", "id_elemento_catalogo_tipo":31, "descripcion":"Pechuga entera de pollo San Fernando congelada, fresca y de alta calidad para diversas recetas.", "cod_unidad":7, "temperatura_maxima":-18, "temperatura_minima":-20, "vida_util":90, "peso_unitario":1500}'
HSET elemento_catalogo 6 '{"id_elemento_catalogo":6, "nombre":"Pierna con encuentro San Fernando fresca", "id_elemento_catalogo_tipo":32, "descripcion":"Pierna con encuentro de pollo San Fernando fresca, perfecta para asados y platos principales.", "cod_unidad":7, "temperatura_maxima":0, "temperatura_minima":-2, "vida_util":7, "peso_unitario":1300}'
HSET elemento_catalogo 7 '{"id_elemento_catalogo":7, "nombre":"Muslo de pollo San Fernando fresco", "id_elemento_catalogo_tipo":32, "descripcion":"Muslo de pollo San Fernando fresco, jugoso y listo para su uso en una amplia variedad de platos.", "cod_unidad":7, "temperatura_maxima":0, "temperatura_minima":-2, "vida_util":7, "peso_unitario":1100}'
HSET elemento_catalogo 8 '{"id_elemento_catalogo":8, "nombre":"Pechuga especial de pollo San Fernando fresca", "id_elemento_catalogo_tipo":32, "descripcion":"Pechuga especial de pollo San Fernando fresca, de la más alta calidad para platos gourmet.", "cod_unidad":7, "temperatura_maxima":0, "temperatura_minima":-2, "vida_util":7, "peso_unitario":1200}'
HSET elemento_catalogo 9 '{"id_elemento_catalogo":9, "nombre":"Pechuga entera de pollo San Fernando fresca", "id_elemento_catalogo_tipo":32, "descripcion":"Pechuga entera de pollo San Fernando fresca, versátil y perfecta para diversas preparaciones culinarias.", "cod_unidad":7, "temperatura_maxima":0, "temperatura_minima":-2, "vida_util":7, "peso_unitario":1400}'
HSET elemento_catalogo 10 '{"id_elemento_catalogo":10, "nombre":"Carne molida de pollo San Fernando fresca", "id_elemento_catalogo_tipo":32, "descripcion":"Carne molida de pollo San Fernando fresca, ideal para hamburguesas, albóndigas y más.", "cod_unidad":7, "temperatura_maxima":0, "temperatura_minima":-2, "vida_util":7, "peso_unitario":900}'
HSET elemento_catalogo 11 '{"id_elemento_catalogo":11, "nombre":"Especias y condimentos Jardín del Sabor para pollo", "id_elemento_catalogo_tipo":11, "descripcion":"Mezcla de especias y condimentos Jardín del Sabor especialmente seleccionados para realzar el sabor del pollo.", "cod_unidad":2, "vida_util":180, "peso_unitario":80}'
HSET elemento_catalogo 12 '{"id_elemento_catalogo":12, "nombre":"Aceite de oliva Aceitunas del Sur para cocinar", "id_elemento_catalogo_tipo":13, "descripcion":"Aceite de oliva Aceitunas del Sur de alta calidad, perfecto para cocinar y aderezar platos.", "cod_unidad":4, "vida_util":365, "peso_unitario":1000}'
HSET elemento_catalogo 13 '{"id_elemento_catalogo":13, "nombre":"Harina de trigo Trigomar para empanizar", "id_elemento_catalogo_tipo":14, "descripcion":"Harina de trigo Trigomar ideal para empanizar y darle un acabado crujiente a tus platillos favoritos.", "cod_unidad":2, "vida_util":180, "peso_unitario":500}'
HSET elemento_catalogo 14 '{"id_elemento_catalogo":14, "nombre":"Huevo fresco Granja Real para rebozar", "id_elemento_catalogo_tipo":15, "descripcion":"Huevo fresco Granja Real para rebozar y darle un toque especial a tus recetas.", "cod_unidad":7, "vida_util":30, "peso_unitario":50}'
HSET elemento_catalogo 15 '{"id_elemento_catalogo":15, "nombre":"Conservante natural Biolife para prolongar la vida útil del producto", "id_elemento_catalogo_tipo":16, "descripcion":"Conservante natural Biolife para prolongar la vida útil del producto, sin aditivos artificiales.", "cod_unidad":2, "vida_util":365, "peso_unitario":30}'
HSET elemento_catalogo 16 '{"id_elemento_catalogo":16, "nombre":"Colorante natural Chroma para mejorar la apariencia del producto", "id_elemento_catalogo_tipo":17, "descripcion":"Colorante natural Chroma para mejorar la apariencia del producto, seguro y confiable.", "cod_unidad":2, "vida_util":365, "peso_unitario":20}'
HSET elemento_catalogo 17 '{"id_elemento_catalogo":17, "nombre":"Emulsionante Quality para mejorar la textura del producto", "id_elemento_catalogo_tipo":18, "descripcion":"Emulsionante Quality para mejorar la textura del producto, ideal para aplicaciones culinarias.", "cod_unidad":2, "vida_util":365, "peso_unitario":40}'
HSET elemento_catalogo 18 '{"id_elemento_catalogo":18, "nombre":"Detergente SuperClean", "id_elemento_catalogo_tipo":23, "descripcion":"Detergente SuperClean para uso industrial, ideal para limpieza profunda y desengrase de equipos y superficies.", "cod_unidad":3, "peso_unitario":1000}'
HSET elemento_catalogo 19 '{"id_elemento_catalogo":19, "nombre":"Escritorio de oficina", "id_elemento_catalogo_tipo":19, "descripcion":"Escritorio de oficina, ideal para el área de almacén.", "cod_unidad":7, "peso_unitario":30000}'
HSET elemento_catalogo 20 '{"id_elemento_catalogo":20, "nombre":"Silla ergonómica", "id_elemento_catalogo_tipo":21, "descripcion":"Silla ergonómica para atención al cliente, cómoda y resistente.", "cod_unidad":7, "peso_unitario":8000}'
HSET elemento_catalogo 21 '{"id_elemento_catalogo":21, "nombre":"Ordenador portátil", "id_elemento_catalogo_tipo":21, "descripcion":"Ordenador portátil para el área de atención al cliente.", "cod_unidad":7, "peso_unitario":2000}'
HSET elemento_catalogo 22 '{"id_elemento_catalogo":22, "nombre":"Rollos de papel térmico para impresora", "id_elemento_catalogo_tipo":21, "descripcion":"Rollos de papel térmico para impresora en el área de atención al cliente.", "cod_unidad":8, "peso_unitario":500}'
HSET elemento_catalogo 23 '{"id_elemento_catalogo":23, "nombre":"Herramientas de mano básica", "id_elemento_catalogo_tipo":21, "descripcion":"Herramientas de mano básica para el área de mantenimiento.", "cod_unidad":7, "peso_unitario":1000}'
HSET elemento_catalogo 24 '{"id_elemento_catalogo":24, "nombre":"Teléfono multifuncional", "id_elemento_catalogo_tipo":21, "descripcion":"Teléfono multifuncional para el área de atención al cliente.", "cod_unidad":7, "peso_unitario":1500}'
HSET elemento_catalogo 25 '{"id_elemento_catalogo":25, "nombre":"Estanterías metálicas", "id_elemento_catalogo_tipo":21, "descripcion":"Estanterías metálicas para el área de almacén.", "cod_unidad":7, "peso_unitario":20000}'
HSET elemento_catalogo 26 '{"id_elemento_catalogo":26, "nombre":"Mascarillas", "id_elemento_catalogo_tipo":21, "descripcion":"Mascarillas para el área de producción.", "cod_unidad":9, "peso_unitario":200}'
HSET elemento_catalogo 27 '{"id_elemento_catalogo":27, "nombre":"Caja registradora", "id_elemento_catalogo_tipo":21, "descripcion":"Caja registradora para el área de atención al cliente.", "cod_unidad":7, "peso_unitario":5000}'
HSET elemento_catalogo 28 '{"id_elemento_catalogo":28, "nombre":"Repuestos para maquinaria industrial", "id_elemento_catalogo_tipo":21, "descripcion":"Repuestos para maquinaria industrial en el área de mantenimiento.", "cod_unidad":7, "peso_unitario":300}'
HSET elemento_catalogo 29 '{"id_elemento_catalogo":29, "nombre":"Guantes Latex", "id_elemento_catalogo_tipo":21, "descripcion":"Guantes Latex para el área de producción.", "cod_unidad":9, "peso_unitario":100}'
HSET elemento_catalogo 30 '{"id_elemento_catalogo":30, "nombre":"Carretilla elevadora", "id_elemento_catalogo_tipo":21, "descripcion":"Carretilla elevadora para el área de almacén.", "cod_unidad":7, "peso_unitario":150000}'
HSET elemento_catalogo 31 '{"id_elemento_catalogo":31, "nombre":"Indumentaria de protección", "id_elemento_catalogo_tipo":21, "descripcion":"Indumentaria de protección para el área de producción.", "cod_unidad":7, "peso_unitario":500}'
HSET elemento_catalogo 32 '{"id_elemento_catalogo":32, "nombre":"Cámara de seguridad", "id_elemento_catalogo_tipo":21, "descripcion":"Cámara de seguridad para el área de almacén.", "cod_unidad":7, "peso_unitario":3000}'
HSET elemento_catalogo 33 '{"id_elemento_catalogo":33, "nombre":"Gorros Hipotérmicos", "id_elemento_catalogo_tipo":21, "descripcion":"Gorros Hipotérmicos para el área de producción.", "cod_unidad":7, "peso_unitario":150}'
HSET elemento_catalogo 34 '{"id_elemento_catalogo":34, "nombre":"Impresora de etiquetas", "id_elemento_catalogo_tipo":21, "descripcion":"Impresora de etiquetas para el área de almacén.", "cod_unidad":7, "peso_unitario":8000}'
HSET elemento_catalogo 35 '{"id_elemento_catalogo":35, "nombre":"Kit de herramientas eléctricas", "id_elemento_catalogo_tipo":21, "descripcion":"Kit de herramientas eléctricas para el área de mantenimiento.", "cod_unidad":7, "peso_unitario":3000}'
HSET elemento_catalogo 36 '{"id_elemento_catalogo":36, "nombre":"Material de embalaje", "id_elemento_catalogo_tipo":21, "descripcion":"Material de embalaje para el área de almacén.", "cod_unidad":7, "peso_unitario":2000}'


HSET ruta 1 '{"cod_ruta":1, "distancia_total":70.9, "cod_ruta_tipo":1, "duracion":2.4}'
HSET ruta 2 '{"cod_ruta":2, "distancia_total":23.5, "cod_ruta_tipo":1, "duracion":0.8}'
HSET ruta 3 '{"cod_ruta":3, "distancia_total":12.3, "cod_ruta_tipo":1, "duracion":0.4}'
HSET ruta 4 '{"cod_ruta":4, "distancia_total":70.9, "cod_ruta_tipo":1, "duracion":2.4}'
HSET ruta 5 '{"cod_ruta":5, "distancia_total":5.6, "cod_ruta_tipo":1, "duracion":0.2}'
HSET ruta 6 '{"cod_ruta":6, "distancia_total":11.2, "cod_ruta_tipo":1, "duracion":0.4}'
HSET ruta 7 '{"cod_ruta":7, "distancia_total":23, "cod_ruta_tipo":1, "duracion":0.8}'
HSET ruta 8 '{"cod_ruta":8, "distancia_total":16.4, "cod_ruta_tipo":1, "duracion":0.5}'
HSET ruta 9 '{"cod_ruta":9, "distancia_total":7.3, "cod_ruta_tipo":1, "duracion":0.2}'
HSET ruta 10 '{"cod_ruta":10, "distancia_total":34.8, "cod_ruta_tipo":1, "duracion":1.2}'

HSET empleado 1 '{"cod_empleado":1, "cod_cliente":1, "cod_persona":11, "cod_empleado_cargo":1, "fecha_contrato":"2021-04-09"}'
HSET empleado 2 '{"cod_empleado":2, "cod_cliente":1, "cod_persona":12, "cod_empleado_cargo":1, "fecha_contrato":"2021-06-17"}'
HSET empleado 3 '{"cod_empleado":3, "cod_cliente":1, "cod_persona":13, "cod_empleado_cargo":2, "fecha_contrato":"2022-03-20"}'
HSET empleado 4 '{"cod_empleado":4, "cod_cliente":1, "cod_persona":14, "cod_empleado_cargo":3, "fecha_contrato":"2021-01-20"}'
HSET empleado 5 '{"cod_empleado":5, "cod_cliente":1, "cod_persona":15, "cod_empleado_cargo":4, "fecha_contrato":"2022-01-07"}'
HSET empleado 6 '{"cod_empleado":6, "cod_cliente":1, "cod_persona":16, "cod_empleado_cargo":5, "fecha_contrato":"2021-08-09"}'
HSET empleado 7 '{"cod_empleado":7, "cod_cliente":1, "cod_persona":17, "cod_empleado_cargo":6, "fecha_contrato":"2021-11-06"}'
HSET empleado 8 '{"cod_empleado":8, "cod_cliente":1, "cod_persona":18, "cod_empleado_cargo":6, "fecha_contrato":"2021-07-09"}'
HSET empleado 9 '{"cod_empleado":9, "cod_cliente":3, "cod_persona":19, "cod_empleado_cargo":7, "fecha_contrato":"2021-01-09"}'
HSET empleado 10 '{"cod_empleado":10, "cod_cliente":4, "cod_persona":20, "cod_empleado_cargo":8, "fecha_contrato":"2021-02-09"}'
HSET empleado 11 '{"cod_empleado":11, "cod_cliente":4, "cod_persona":21, "cod_empleado_cargo":3, "fecha_contrato":"2021-05-18"}'
HSET empleado 12 '{"cod_empleado":12, "cod_cliente":1, "cod_persona":22, "cod_empleado_cargo":5, "fecha_contrato":"2021-05-18"}'
HSET empleado 13 '{"cod_empleado":13, "cod_cliente":1, "cod_persona":23, "cod_empleado_cargo":5, "fecha_contrato":"2021-05-18"}'

HSET transportista 1 '{"cod_transportista":1, "cod_empleado":6, "cod_estado_transportista":"D", "cod_tipo_licencia":"X", "num_licencia":"E567890", "fecha_vencimiento_licencia":"2027-01-23", "fecha_ultimo_traslado":"2024-04-15"}'
HSET transportista 2 '{"cod_transportista":2, "cod_empleado":12, "cod_estado_transportista":"N", "cod_tipo_licencia":"Y", "num_licencia":"R487236", "fecha_vencimiento_licencia":"2025-01-08", "fecha_ultimo_traslado":"2024-04-24"}'



HSET representante 1 '{"cod_representante":1, "num_telefono":"(+51) 943 567 890", "correo_empresarial":"juan.lopez@sanfernando.com", "cargo":"Gerente de Almacén", "cod_cliente":1, "cod_persona":1}'
HSET representante 2 '{"cod_representante":2, "num_telefono":"(+51) 976 345 678", "correo_empresarial":"diana.vargas@sanfernando.com", "cargo":"Supervisora de Atención al Cliente", "cod_cliente":2, "cod_persona":2}'
HSET representante 3 '{"cod_representante":3, "num_telefono":"(+51) 983 912 345", "correo_empresarial":"roberto.paredes@sanfernando.com", "cargo":"Gerente de Producción", "cod_cliente":3, "cod_persona":3}'
HSET representante 4 '{"cod_representante":4, "num_telefono":"(+51) 944 567 891", "correo_empresarial":"sandra.torres@sanfernando.com", "cargo":"Supervisora de Mantenimiento", "cod_cliente":4, "cod_persona":4}'
HSET representante 5 '{"cod_representante":5, "num_telefono":"(+51) 981 234 567", "correo_empresarial":"luis.mendoza@supermercadosperuanos.com", "cargo":"Supervisor de Ventas", "cod_cliente":5, "cod_persona":5}'
HSET representante 6 '{"cod_representante":6, "num_telefono":"(+51) 957 890 123", "correo_empresarial":"pedro.rodriguez@hipermercadostottus.com", "cargo":"Gerente de Compras", "cod_cliente":6, "cod_persona":6}'
HSET representante 7 '{"cod_representante":7, "num_telefono":"(+51) 992 456 789", "correo_empresarial":"ana.martinez@CencosudRetailPeru.com", "cargo":"Supervisora de Logística", "cod_cliente":7, "cod_persona":7}'
HSET representante 8 '{"cod_representante":8, "num_telefono":"(+51) 945 678 901", "correo_empresarial":"luis.hernandez@delosi.com", "cargo":"Gerente de Operaciones", "cod_cliente":8, "cod_persona":8}'
HSET representante 9 '{"cod_representante":9, "num_telefono":"(+51) 965 123 456", "correo_empresarial":"laura.gonzalez@sanguchesdelperu.com", "cargo":"Supervisora de Compras", "cod_cliente":9, "cod_persona":9}'
HSET representante 10 '{"cod_representante":10, "num_telefono":"(+51) 954 789 012", "correo_empresarial":"carlos.ramirez@gruporokys.com", "cargo":"Gerente de Logística", "cod_cliente":10, "cod_persona":10}'

HSET operacion 1 '{"id_operacion":1, "id_operacion_picking":1, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-01", "hora_inicio":"08:00:00", "hora_fin":"08:30:00", "cod_tipo_operacion":1}'
HSET operacion 2 '{"id_operacion":2, "id_operacion_picking":1, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-01", "hora_inicio":"08:45:00", "hora_fin":"09:15:00", "cod_tipo_operacion":2}'
HSET operacion 3 '{"id_operacion":3, "id_operacion_picking":1, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-01", "hora_inicio":"09:30:00", "hora_fin":"10:30:00", "cod_tipo_operacion":3}'
HSET operacion 4 '{"id_operacion":4, "id_operacion_picking":1, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-01", "hora_inicio":"10:45:00", "hora_fin":"11:15:00", "cod_tipo_operacion":4}'
HSET operacion 5 '{"id_operacion":5, "id_operacion_picking":1, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-01", "hora_inicio":"11:30:00", "hora_fin":"12:00:00", "cod_tipo_operacion":5}'
HSET operacion 6 '{"id_operacion":6, "id_operacion_picking":1, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-01", "hora_inicio":"14:00:00", "hora_fin":"14:30:00", "cod_tipo_operacion":6}'
HSET operacion 7 '{"id_operacion":7, "id_operacion_picking":7, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"08:00:00", "hora_fin":"08:35:00", "cod_tipo_operacion":1}'
HSET operacion 8 '{"id_operacion":8, "id_operacion_picking":7, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"08:45:00", "hora_fin":"09:15:00", "cod_tipo_operacion":2}'
HSET operacion 9 '{"id_operacion":9, "id_operacion_picking":7, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"09:30:00", "hora_fin":"10:30:00", "cod_tipo_operacion":3}'
HSET operacion 10 '{"id_operacion":10, "id_operacion_picking":7, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"10:45:00", "hora_fin":"11:15:00", "cod_tipo_operacion":4}'
HSET operacion 11 '{"id_operacion":11, "id_operacion_picking":7, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"11:30:00", "hora_fin":"12:00:00", "cod_tipo_operacion":5}'
HSET operacion 12 '{"id_operacion":12, "id_operacion_picking":7, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"17:00:00", "hora_fin":"17:18:00", "cod_tipo_operacion":6}'
HSET operacion 13 '{"id_operacion":13, "id_operacion_picking":13, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"09:15:00", "hora_fin":"09:30:00", "cod_tipo_operacion":1}'
HSET operacion 14 '{"id_operacion":14, "id_operacion_picking":13, "cod_empleado_ejecutor":12, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"09:42:00", "hora_fin":"10:10:00", "cod_tipo_operacion":2}'
HSET operacion 15 '{"id_operacion":15, "id_operacion_picking":13, "cod_empleado_ejecutor":12, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"10:20:00", "hora_fin":"11:10:00", "cod_tipo_operacion":3}'
HSET operacion 16 '{"id_operacion":16, "id_operacion_picking":13, "cod_empleado_ejecutor":12, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"12:15:00", "hora_fin":"12:05:00", "cod_tipo_operacion":4}'
HSET operacion 17 '{"id_operacion":17, "id_operacion_picking":13, "cod_empleado_ejecutor":12, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"12:20:00", "hora_fin":"12:56:00", "cod_tipo_operacion":5}'
HSET operacion 18 '{"id_operacion":18, "id_operacion_picking":13, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"18:20:00", "hora_fin":"18:56:00", "cod_tipo_operacion":6}'
HSET operacion 19 '{"id_operacion":19, "id_operacion_picking":19, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"10:00:00", "hora_fin":"10:35:00", "cod_tipo_operacion":1}'
HSET operacion 20 '{"id_operacion":20, "id_operacion_picking":19, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"10:45:00", "hora_fin":"10:15:00", "cod_tipo_operacion":2}'
HSET operacion 21 '{"id_operacion":21, "id_operacion_picking":19, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"10:30:00", "hora_fin":"11:30:00", "cod_tipo_operacion":3}'
HSET operacion 22 '{"id_operacion":22, "id_operacion_picking":19, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"11:45:00", "hora_fin":"12:15:00", "cod_tipo_operacion":4}'
HSET operacion 23 '{"id_operacion":23, "id_operacion_picking":19, "cod_empleado_ejecutor":13, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"12:30:00", "hora_fin":"13:00:00", "cod_tipo_operacion":5}'
HSET operacion 24 '{"id_operacion":24, "id_operacion_picking":19, "cod_empleado_ejecutor":1, "cod_empleado_supervisor":4, "fecha":"2024-04-02", "hora_inicio":"18:20:00", "hora_fin":"18:56:00", "cod_tipo_operacion":6}'

HSET mercancia 1 '{"id_mercancia":1, "id_operacion_picking":1, "nro_precinto":"00002202404010800011", "peso_total":12000}'
HSET mercancia 2 '{"id_mercancia":2, "id_operacion_picking":1, "nro_precinto":"00002202404010800023", "peso_total":7500}'
HSET mercancia 3 '{"id_mercancia":3, "id_operacion_picking":1, "nro_precinto":"00002202404010800044", "peso_total":5500}'
HSET mercancia 4 '{"id_mercancia":4, "id_operacion_picking":7, "nro_precinto":"00008202404020800055", "peso_total":13500}'
HSET mercancia 5 '{"id_mercancia":5, "id_operacion_picking":7, "nro_precinto":"00008202404020800067", "peso_total":15000}'
HSET mercancia 6 '{"id_mercancia":6, "id_operacion_picking":13, "nro_precinto":"00014202404020900087", "peso_total":750}'
HSET mercancia 7 '{"id_mercancia":7, "id_operacion_picking":13, "nro_precinto":"00014202404020900098", "peso_total":600}'
HSET mercancia 8 '{"id_mercancia":8, "id_operacion_picking":19, "nro_precinto":"00020202404021000019", "peso_total":18000}'
HSET mercancia 9 '{"id_mercancia":9, "id_operacion_picking":19, "nro_precinto":"00020202404021000021", "peso_total":16500}'

HSET stock 1 '{"id_stock":1, "cod_stock":"00001-00001-00123", "id_elemento_catalogo":1, "nro_lote":123, "fecha_caducidad":"2024-04-01", "cantidad_disponible":1000}'
HSET stock 2 '{"id_stock":2, "cod_stock":"00002-00002-00124", "id_elemento_catalogo":2, "nro_lote":124, "fecha_caducidad":"2024-04-02", "cantidad_disponible":2000}'
HSET stock 3 '{"id_stock":3, "cod_stock":"00003-00003-00125", "id_elemento_catalogo":3, "nro_lote":125, "fecha_caducidad":"2024-04-03", "cantidad_disponible":5000}'
HSET stock 4 '{"id_stock":4, "cod_stock":"00004-00004-00126", "id_elemento_catalogo":4, "nro_lote":126, "fecha_caducidad":"2024-04-04", "cantidad_disponible":3000}'
HSET stock 5 '{"id_stock":5, "cod_stock":"00005-00005-00127", "id_elemento_catalogo":5, "nro_lote":127, "fecha_caducidad":"2024-04-05", "cantidad_disponible":4000}'
HSET stock 6 '{"id_stock":6, "cod_stock":"00006-00006-00128", "id_elemento_catalogo":6, "nro_lote":128, "fecha_caducidad":"2024-04-06", "cantidad_disponible":6000}'
HSET stock 7 '{"id_stock":7, "cod_stock":"00007-00007-00129", "id_elemento_catalogo":7, "nro_lote":129, "fecha_caducidad":"2024-04-07", "cantidad_disponible":7000}'
HSET stock 8 '{"id_stock":8, "cod_stock":"00008-00008-00130", "id_elemento_catalogo":8, "nro_lote":130, "fecha_caducidad":"2024-04-08", "cantidad_disponible":8000}'
HSET stock 9 '{"id_stock":9, "cod_stock":"00009-00009-00131", "id_elemento_catalogo":9, "nro_lote":131, "fecha_caducidad":"2024-04-09", "cantidad_disponible":9000}'
HSET stock 10 '{"id_stock":10, "cod_stock":"00010-00001-00132", "id_elemento_catalogo":1, "nro_lote":132, "fecha_caducidad":"2024-04-10", "cantidad_disponible":2500}'
HSET stock 11 '{"id_stock":11, "cod_stock":"00011-00011-00223", "id_elemento_catalogo":11, "nro_lote":223, "fecha_caducidad":"2024-04-01", "cantidad_disponible":1000}'
HSET stock 12 '{"id_stock":12, "cod_stock":"00012-00011-00224", "id_elemento_catalogo":11, "nro_lote":224, "fecha_caducidad":"2024-04-02", "cantidad_disponible":2000}'
HSET stock 13 '{"id_stock":13, "cod_stock":"00013-00012-00225", "id_elemento_catalogo":12, "nro_lote":225, "fecha_caducidad":"2024-04-03", "cantidad_disponible":1000}'
HSET stock 14 '{"id_stock":14, "cod_stock":"00014-00012-00226", "id_elemento_catalogo":12, "nro_lote":226, "fecha_caducidad":"2024-04-04", "cantidad_disponible":1050}'
HSET stock 15 '{"id_stock":15, "cod_stock":"00015-00013-00227", "id_elemento_catalogo":13, "nro_lote":227, "fecha_caducidad":"2024-04-05", "cantidad_disponible":1010}'
HSET stock 16 '{"id_stock":16, "cod_stock":"00016-00014-00228", "id_elemento_catalogo":14, "nro_lote":228, "fecha_caducidad":"2024-04-06", "cantidad_disponible":1000}'
HSET stock 17 '{"id_stock":17, "cod_stock":"00017-00015-00229", "id_elemento_catalogo":15, "nro_lote":229, "fecha_caducidad":"2024-04-07", "cantidad_disponible":8000}'
HSET stock 18 '{"id_stock":18, "cod_stock":"00018-00016-00230", "id_elemento_catalogo":16, "nro_lote":230, "fecha_caducidad":"2024-04-08", "cantidad_disponible":7000}'
HSET stock 19 '{"id_stock":19, "cod_stock":"00019-00017-00231", "id_elemento_catalogo":17, "nro_lote":231, "fecha_caducidad":"2024-04-09", "cantidad_disponible":3000}'
HSET stock 20 '{"id_stock":20, "cod_stock":"00020-00010-00232", "id_elemento_catalogo":10, "nro_lote":232, "fecha_caducidad":"2024-04-10", "cantidad_disponible":4000}'
HSET stock 21 '{"id_stock":21, "cod_stock":"00021-00009-00233", "id_elemento_catalogo":9, "nro_lote":233, "fecha_caducidad":"2024-04-11", "cantidad_disponible":1500}'
HSET stock 22 '{"id_stock":22, "cod_stock":"00022-00008-00234", "id_elemento_catalogo":8, "nro_lote":234, "fecha_caducidad":"2024-04-12", "cantidad_disponible":1700}'
HSET stock 23 '{"id_stock":23, "cod_stock":"00023-00007-00235", "id_elemento_catalogo":7, "nro_lote":235, "fecha_caducidad":"2024-04-13", "cantidad_disponible":1600}'
HSET stock 24 '{"id_stock":24, "cod_stock":"00024-00007-00236", "id_elemento_catalogo":7, "nro_lote":236, "fecha_caducidad":"2024-04-14", "cantidad_disponible":1200}'
HSET stock 25 '{"id_stock":25, "cod_stock":"00025-00007-00237", "id_elemento_catalogo":7, "nro_lote":237, "fecha_caducidad":"2024-04-15", "cantidad_disponible":1030}'

HSET traslado:1 data '{"id_traslado": 1, "cod_guia_remision": "000012024040111301200", "cod_vehiculo": 2, "cod_ruta": 2, "cod_transportista": 2, "id_operacion_inicia": 5, "id_operacion_termina": 6}'
HSET traslado:2 data '{"id_traslado": 2, "cod_guia_remision": "000022024040211301200", "cod_vehiculo": 3, "cod_ruta": 3, "cod_transportista": 2, "id_operacion_inicia": 11, "id_operacion_termina": 12}'
HSET traslado:3 data '{"id_traslado": 3, "cod_guia_remision": "000032024040212201256", "cod_vehiculo": 3, "cod_ruta": 3, "cod_transportista": 1, "id_operacion_inicia": 17, "id_operacion_termina": 18}'
HSET traslado:4 data '{"id_traslado": 4, "cod_guia_remision": "000042024040212301300", "cod_vehiculo": 3, "cod_ruta": 3, "cod_transportista": 2, "id_operacion_inicia": 23, "id_operacion_termina": 24}'




HSET detalle_mercancia_stock 1 '{"id_detalle_mercancia_stock": 1, "id_mercancia": 1, "id_stock": 1, "cantidad": 10}'
HSET detalle_mercancia_stock 2 '{"id_detalle_mercancia_stock": 2, "id_mercancia": 1, "id_stock": 2, "cantidad": 5}'
HSET detalle_mercancia_stock 3 '{"id_detalle_mercancia_stock": 3, "id_mercancia": 1, "id_stock": 3, "cantidad": 15}'
HSET detalle_mercancia_stock 4 '{"id_detalle_mercancia_stock": 4, "id_mercancia": 2, "id_stock": 4, "cantidad": 10}'
HSET detalle_mercancia_stock 5 '{"id_detalle_mercancia_stock": 5, "id_mercancia": 2, "id_stock": 5, "cantidad": 5}'
HSET detalle_mercancia_stock 6 '{"id_detalle_mercancia_stock": 6, "id_mercancia": 3, "id_stock": 6, "cantidad": 10}'
HSET detalle_mercancia_stock 7 '{"id_detalle_mercancia_stock": 7, "id_mercancia": 3, "id_stock": 7, "cantidad": 5}'
HSET detalle_mercancia_stock 8 '{"id_detalle_mercancia_stock": 8, "id_mercancia": 4, "id_stock": 8, "cantidad": 10}'
HSET detalle_mercancia_stock 9 '{"id_detalle_mercancia_stock": 9, "id_mercancia": 4, "id_stock": 9, "cantidad": 5}'
HSET detalle_mercancia_stock 10 '{"id_detalle_mercancia_stock": 10, "id_mercancia": 4, "id_stock": 10, "cantidad": 15}'
HSET detalle_mercancia_stock 11 '{"id_detalle_mercancia_stock": 11, "id_mercancia": 5, "id_stock": 11, "cantidad": 10}'
HSET detalle_mercancia_stock 12 '{"id_detalle_mercancia_stock": 12, "id_mercancia": 5, "id_stock": 12, "cantidad": 5}'
HSET detalle_mercancia_stock 13 '{"id_detalle_mercancia_stock": 13, "id_mercancia": 5, "id_stock": 13, "cantidad": 15}'
HSET detalle_mercancia_stock 14 '{"id_detalle_mercancia_stock": 14, "id_mercancia": 6, "id_stock": 14, "cantidad": 10}'
HSET detalle_mercancia_stock 15 '{"id_detalle_mercancia_stock": 15, "id_mercancia": 6, "id_stock": 15, "cantidad": 5}'
HSET detalle_mercancia_stock 16 '{"id_detalle_mercancia_stock": 16, "id_mercancia": 6, "id_stock": 16, "cantidad": 15}'
HSET detalle_mercancia_stock 17 '{"id_detalle_mercancia_stock": 17, "id_mercancia": 7, "id_stock": 17, "cantidad": 10}'
HSET detalle_mercancia_stock 18 '{"id_detalle_mercancia_stock": 18, "id_mercancia": 7, "id_stock": 18, "cantidad": 5}'
HSET detalle_mercancia_stock 19 '{"id_detalle_mercancia_stock": 19, "id_mercancia": 7, "id_stock": 19, "cantidad": 15}'
HSET detalle_mercancia_stock 20 '{"id_detalle_mercancia_stock": 20, "id_mercancia": 8, "id_stock": 20, "cantidad": 10}'
HSET detalle_mercancia_stock 21 '{"id_detalle_mercancia_stock": 21, "id_mercancia": 8, "id_stock": 21, "cantidad": 5}'
HSET detalle_mercancia_stock 22 '{"id_detalle_mercancia_stock": 22, "id_mercancia": 8, "id_stock": 22, "cantidad": 15}'
HSET detalle_mercancia_stock 23 '{"id_detalle_mercancia_stock": 23, "id_mercancia": 9, "id_stock": 23, "cantidad": 10}'
HSET detalle_mercancia_stock 24 '{"id_detalle_mercancia_stock": 24, "id_mercancia": 9, "id_stock": 24, "cantidad": 5}'
HSET detalle_mercancia_stock 25 '{"id_detalle_mercancia_stock": 25, "id_mercancia": 9, "id_stock": 25, "cantidad": 15}'

HSET detalle_ticket_producto 1 '{"cod_ticket": 1, "id_elemento_catalogo": 25, "cantidad": 5}'
HSET detalle_ticket_producto 2 '{"cod_ticket": 1, "id_elemento_catalogo": 19, "cantidad": 2}'
HSET detalle_ticket_producto 3 '{"cod_ticket": 1, "id_elemento_catalogo": 30, "cantidad": 10}'
HSET detalle_ticket_producto 4 '{"cod_ticket": 2, "id_elemento_catalogo": 27, "cantidad": 2}'
HSET detalle_ticket_producto 5 '{"cod_ticket": 3, "id_elemento_catalogo": 20, "cantidad": 6}'
HSET detalle_ticket_producto 6 '{"cod_ticket": 3, "id_elemento_catalogo": 24, "cantidad": 3}'
HSET detalle_ticket_producto 7 '{"cod_ticket": 4, "id_elemento_catalogo": 36, "cantidad": 100}'
HSET detalle_ticket_producto 8 '{"cod_ticket": 4, "id_elemento_catalogo": 32, "cantidad": 1}'
HSET detalle_ticket_producto 9 '{"cod_ticket": 5, "id_elemento_catalogo": 31, "cantidad": 15}'
HSET detalle_ticket_producto 10 '{"cod_ticket": 5, "id_elemento_catalogo": 29, "cantidad": 12}'
HSET detalle_ticket_producto 11 '{"cod_ticket": 6, "id_elemento_catalogo": 33, "cantidad": 12}'
HSET detalle_ticket_producto 12 '{"cod_ticket": 7, "id_elemento_catalogo": 35, "cantidad": 5}'
HSET detalle_ticket_producto 13 '{"cod_ticket": 8, "id_elemento_catalogo": 28, "cantidad": 20}'
HSET detalle_ticket_producto 14 '{"cod_ticket": 8, "id_elemento_catalogo": 23, "cantidad": 2}'
HSET detalle_ticket_producto 15 '{"cod_ticket": 9, "id_elemento_catalogo": 34, "cantidad": 4}'
HSET detalle_ticket_producto 16 '{"cod_ticket": 10, "id_elemento_catalogo": 2, "cantidad": 1000}'
HSET detalle_ticket_producto 17 '{"cod_ticket": 11, "id_elemento_catalogo": 3, "cantidad": 1000}'
HSET detalle_ticket_producto 18 '{"cod_ticket": 12, "id_elemento_catalogo": 5, "cantidad": 1000}'
HSET detalle_ticket_producto 19 '{"cod_ticket": 13, "id_elemento_catalogo": 6, "cantidad": 1000}'
HSET detalle_ticket_producto 20 '{"cod_ticket": 14, "id_elemento_catalogo": 4, "cantidad": 1000}'
HSET detalle_ticket_producto 21 '{"cod_ticket": 15, "id_elemento_catalogo": 4, "cantidad": 1000}'
HSET detalle_ticket_producto 22 '{"cod_ticket": 16, "id_elemento_catalogo": 7, "cantidad": 1000}'
HSET detalle_ticket_producto 23 '{"cod_ticket": 16, "id_elemento_catalogo": 11, "cantidad": 1000}'
HSET detalle_ticket_producto 24 '{"cod_ticket": 17, "id_elemento_catalogo": 18, "cantidad": 50}'
HSET detalle_ticket_producto 25 '{"cod_ticket": 18, "id_elemento_catalogo": 1, "cantidad": 1000}'
HSET detalle_ticket_producto 26 '{"cod_ticket": 18, "id_elemento_catalogo": 15, "cantidad": 1000}'
HSET detalle_ticket_producto 27 '{"cod_ticket": 19, "id_elemento_catalogo": 9, "cantidad": 1000}'
HSET detalle_ticket_producto 28 '{"cod_ticket": 20, "id_elemento_catalogo": 14, "cantidad": 1000}'

HSET detalle_ticket_traslado 1 '{"cod_ticket": 1, "id_traslado": 1}'
HSET detalle_ticket_traslado 2 '{"cod_ticket": 1, "id_traslado": 2}'
HSET detalle_ticket_traslado 3 '{"cod_ticket": 2, "id_traslado": 1}'
HSET detalle_ticket_traslado 4 '{"cod_ticket": 3, "id_traslado": 1}'
HSET detalle_ticket_traslado 5 '{"cod_ticket": 3, "id_traslado": 2}'
HSET detalle_ticket_traslado 6 '{"cod_ticket": 4, "id_traslado": 1}'
HSET detalle_ticket_traslado 7 '{"cod_ticket": 4, "id_traslado": 2}'
HSET detalle_ticket_traslado 8 '{"cod_ticket": 4, "id_traslado": 3}'
HSET detalle_ticket_traslado 9 '{"cod_ticket": 5, "id_traslado": 1}'
HSET detalle_ticket_traslado 10 '{"cod_ticket": 6, "id_traslado": 2}'
HSET detalle_ticket_traslado 11 '{"cod_ticket": 7, "id_traslado": 3}'
HSET detalle_ticket_traslado 12 '{"cod_ticket": 8, "id_traslado": 3}'
HSET detalle_ticket_traslado 13 '{"cod_ticket": 9, "id_traslado": 3}'
HSET detalle_ticket_traslado 14 '{"cod_ticket": 10, "id_traslado": 2}'
HSET detalle_ticket_traslado 15 '{"cod_ticket": 11, "id_traslado": 1}'
HSET detalle_ticket_traslado 16 '{"cod_ticket": 11, "id_traslado": 3}'
HSET detalle_ticket_traslado 17 '{"cod_ticket": 12, "id_traslado": 2}'
HSET detalle_ticket_traslado 18 '{"cod_ticket": 13, "id_traslado": 1}'
HSET detalle_ticket_traslado 19 '{"cod_ticket": 14, "id_traslado": 2}'
HSET detalle_ticket_traslado 20 '{"cod_ticket": 15, "id_traslado": 4}'
HSET detalle_ticket_traslado 21 '{"cod_ticket": 16, "id_traslado": 4}'
HSET detalle_ticket_traslado 22 '{"cod_ticket": 16, "id_traslado": 1}'
HSET detalle_ticket_traslado 23 '{"cod_ticket": 17, "id_traslado": 4}'
HSET detalle_ticket_traslado 24 '{"cod_ticket": 18, "id_traslado": 4}'
HSET detalle_ticket_traslado 25 '{"cod_ticket": 18, "id_traslado": 1}'
HSET detalle_ticket_traslado 26 '{"cod_ticket": 19, "id_traslado": 4}'
HSET detalle_ticket_traslado 27 '{"cod_ticket": 20, "id_traslado": 4}'

HSET gps 1 '{"cod_gps": 1, "cod_ubicacion": 1, "cod_vehiculo": 4, "fecha_ubicacion": "2024-04-20", "hora_ubicacion": "04:53:21"}'
HSET gps 2 '{"cod_gps": 2, "cod_ubicacion": 15, "cod_vehiculo": 4, "fecha_ubicacion": "2024-04-20", "hora_ubicacion": "09:10:53"}'
HSET gps 3 '{"cod_gps": 3, "cod_ubicacion": 17, "cod_vehiculo": 4, "fecha_ubicacion": "2024-04-20", "hora_ubicacion": "11:33:14"}'
HSET gps 4 '{"cod_gps": 4, "cod_ubicacion": 18, "cod_vehiculo": 4, "fecha_ubicacion": "2024-04-20", "hora_ubicacion": "13:45:11"}'
HSET gps 5 '{"cod_gps": 5, "cod_ubicacion": 1, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "05:13:55"}'
HSET gps 6 '{"cod_gps": 6, "cod_ubicacion": 5, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "07:34:25"}'
HSET gps 7 '{"cod_gps": 7, "cod_ubicacion": 4, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "10:45:30"}'
HSET gps 8 '{"cod_gps": 8, "cod_ubicacion": 8, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "11:20:10"}'
HSET gps 9 '{"cod_gps": 9, "cod_ubicacion": 12, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "11:54:31"}'
HSET gps 10 '{"cod_gps": 10, "cod_ubicacion": 10, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "12:29:30"}'
HSET gps 11 '{"cod_gps": 11, "cod_ubicacion": 13, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "13:04:10"}'
HSET gps 12 '{"cod_gps": 12, "cod_ubicacion": 14, "cod_vehiculo": 7, "fecha_ubicacion": "2024-04-22", "hora_ubicacion": "13:38:50"}'

HSET local 1 '{"cod_local": 1, "cod_cliente": 1, "cod_ubicacion": 1, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 44, "calle": "Panamericana Norte", "denominacion": "Beneficio Huaral", "cod_local_tipo": 1}'
HSET local 2 '{"cod_local": 2, "cod_cliente": 8, "cod_ubicacion": 2, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 44, "calle": "Av. El Solar", "numero": null, "denominacion": "KFC Huaral", "cod_local_tipo": 2}'
HSET local 3 '{"cod_local": 3, "cod_cliente": 8, "cod_ubicacion": 3, "pais": "PER", "cod_local_region": 7, "cod_local_distrito": 45, "calle": "Av. Néstor Gambetta", "numero": 7036, "denominacion": "KFC Ventanilla", "cod_local_tipo": 2}'
HSET local 4 '{"cod_local": 4, "cod_cliente": 8, "cod_ubicacion": 4, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 25, "calle": "Av. Puente Piedra", "numero": 266, "denominacion": "KFC Puente Piedra", "cod_local_tipo": 2}'
HSET local 5 '{"cod_local": 5, "cod_cliente": 7, "cod_ubicacion": 10, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 11, "calle": "Av. Tomás Valle", "numero": 1400, "denominacion": "Plaza Norte", "cod_local_tipo": 2}'
HSET local 6 '{"cod_local": 6, "cod_cliente": 6, "cod_ubicacion": 12, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 11, "calle": "Av. Alfredo Mendiola", "numero": 3698, "denominacion": "Mega Plaza", "cod_local_tipo": 2}'
HSET local 7 '{"cod_local": 7, "cod_cliente": 2, "cod_ubicacion": 15, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 15, "calle": "Jr. Iquitos", "numero": 347, "denominacion": "Tienda Jr Iquitos", "cod_local_tipo": 3}'
HSET local 8 '{"cod_local": 8, "cod_cliente": 10, "cod_ubicacion": 16, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 15, "calle": "Av. España", "numero": 1337, "denominacion": "Real Plaza - Centro Cívico", "cod_local_tipo": 2}'
HSET local 9 '{"cod_local": 9, "cod_cliente": 2, "cod_ubicacion": 17, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 15, "calle": "Jr. Puno", "numero": 370, "denominacion": "Distribuidora Jr Puno", "cod_local_tipo": 4}'
HSET local 10 '{"cod_local": 10, "cod_cliente": 3, "cod_ubicacion": 18, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 7, "calle": "C. Constelación Austral", "numero": 135, "denominacion": "Almacén Chorrillos", "cod_local_tipo": 1}'
HSET local 11 '{"cod_local": 11, "cod_cliente": 2, "cod_ubicacion": 19, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 35, "calle": "Tomas Cochrane", "numero": null, "denominacion": "Distribuidora Tomas Cochrane", "cod_local_tipo": 4}'
HSET local 12 '{"cod_local": 12, "cod_cliente": 2, "cod_ubicacion": 20, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 35, "calle": "Jr. Mártir Olaya", "numero": 413, "denominacion": "Distribuidora Jr Mártir Olaya", "cod_local_tipo": 4}'
HSET local 13 '{"cod_local": 13, "cod_cliente": 2, "cod_ubicacion": 21, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 24, "calle": "Av. Simón Bolívar", "numero": 1149, "denominacion": "Distribuidora Av Simón Bolívar", "cod_local_tipo": 4}'
HSET local 14 '{"cod_local": 14, "cod_cliente": 2, "cod_ubicacion": 22, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 15, "calle": "Jr. 3 de Febrero", "numero": 1234, "denominacion": "Distribuidora Jr 3 de Febrero", "cod_local_tipo": 4}'
HSET local 15 '{"cod_local": 15, "cod_cliente": 2, "cod_ubicacion": 23, "pais": "PER", "cod_local_region": 7, "cod_local_distrito": 46, "calle": "Av. Argentina", "numero": 3093, "denominacion": "Distribuidora Av Argentina", "cod_local_tipo": 3}'
HSET local 16 '{"cod_local": 16, "cod_cliente": 2, "cod_ubicacion": 24, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 32, "calle": "Av. 13 de Enero", "numero": 1592, "denominacion": "Distribuidora Av 13 de Enero", "cod_local_tipo": 4}'
HSET local 17 '{"cod_local": 17, "cod_cliente": 3, "cod_ubicacion": 25, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 7, "calle": "Av. Los Faisanes", "numero": 179, "denominacion": "Almacén Central", "cod_local_tipo": 1}'
HSET local 18 '{"cod_local": 18, "cod_cliente": 2, "cod_ubicacion": 26, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 7, "calle": "Jr. Justo Naveda", "numero": 136, "denominacion": "Distribuidora Jr Justo Naveda", "cod_local_tipo": 4}'
HSET local 19 '{"cod_local": 19, "cod_cliente": 2, "cod_ubicacion": 27, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 9, "calle": "Av. Universitaria", "numero": 7718, "denominacion": "Distribuidora Av Universitaria", "cod_local_tipo": 3}'
HSET local 20 '{"cod_local": 20, "cod_cliente": 2, "cod_ubicacion": 28, "pais": "PER", "cod_local_region": 15, "cod_local_distrito": 16, "calle": "Av. Petit Thouars", "numero": 2260, "denominacion": "Distribuidora Av Petit Thouars", "cod_local_tipo": 3}'

HSET paradero 1 '{"cod_paradero": 1, "cod_ruta": 1, "cod_local": 1, "cod_paradero_tipo": 1, "orden": 1}'
HSET paradero 2 '{"cod_paradero": 2, "cod_ruta": 1, "cod_local": 2, "cod_paradero_tipo": 2, "orden": 2}'
HSET paradero 3 '{"cod_paradero": 3, "cod_ruta": 1, "cod_local": 4, "cod_paradero_tipo": 2, "orden": 3}'
HSET paradero 4 '{"cod_paradero": 4, "cod_ruta": 1, "cod_local": 17, "cod_paradero_tipo": 3, "orden": 4}'
HSET paradero 5 '{"cod_paradero": 5, "cod_ruta": 2, "cod_local": 1, "cod_paradero_tipo": 1, "orden": 1}'
HSET paradero 6 '{"cod_paradero": 6, "cod_ruta": 2, "cod_local": 16, "cod_paradero_tipo": 3, "orden": 2}'
HSET paradero 7 '{"cod_paradero": 7, "cod_ruta": 3, "cod_local": 1, "cod_paradero_tipo": 1, "orden": 1}'
HSET paradero 8 '{"cod_paradero": 8, "cod_ruta": 3, "cod_local": 4, "cod_paradero_tipo": 2, "orden": 2}'
HSET paradero 9 '{"cod_paradero": 9, "cod_ruta": 3, "cod_local": 5, "cod_paradero_tipo": 2, "orden": 3}'
HSET paradero 10 '{"cod_paradero": 10, "cod_ruta": 3, "cod_local": 6, "cod_paradero_tipo": 2, "orden": 4}'
HSET paradero 11 '{"cod_paradero": 11, "cod_ruta": 4, "cod_local": 17, "cod_paradero_tipo": 1, "orden": 1}'
HSET paradero 12 '{"cod_paradero": 12, "cod_ruta": 4, "cod_local": 1, "cod_paradero_tipo": 3, "orden": 2}'

HSET pedido 1 '{"cod_pedido": 1, "cod_representante": 1, "cod_empleado": 1, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2019-04-22", "cod_ticket": 1}'
HSET pedido 2 '{"cod_pedido": 2, "cod_representante": 2, "cod_empleado": 2, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2021-04-17", "cod_ticket": 2}'
HSET pedido 3 '{"cod_pedido": 3, "cod_representante": 2, "cod_empleado": 1, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2022-01-15", "cod_ticket": 3}'
HSET pedido 4 '{"cod_pedido": 4, "cod_representante": 1, "cod_empleado": 2, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2022-01-17", "cod_ticket": 4}'
HSET pedido 5 '{"cod_pedido": 5, "cod_representante": 3, "cod_empleado": 1, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2022-05-17", "cod_ticket": 5}'
HSET pedido 6 '{"cod_pedido": 6, "cod_representante": 3, "cod_empleado": 2, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2022-11-13", "cod_ticket": 6}'
HSET pedido 7 '{"cod_pedido": 7, "cod_representante": 4, "cod_empleado": 1, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2023-01-15", "cod_ticket": 7}'
HSET pedido 8 '{"cod_pedido": 8, "cod_representante": 4, "cod_empleado": 2, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2023-01-17", "cod_ticket": 8}'
HSET pedido 9 '{"cod_pedido": 9, "cod_representante": 4, "cod_empleado": 1, "cod_pedido_tipo": "A", "cod_pedido_estado": "P", "fecha_registro": "2023-03-15", "cod_ticket": 9}'
HSET pedido 10 '{"cod_pedido": 10, "cod_representante": 5, "cod_empleado": 1, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-04-15", "cod_ticket": 10}'
HSET pedido 11 '{"cod_pedido": 11, "cod_representante": 5, "cod_empleado": 2, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-05-15", "cod_ticket": 11}'
HSET pedido 12 '{"cod_pedido": 12, "cod_representante": 6, "cod_empleado": 1, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-05-17", "cod_ticket": 12}'
HSET pedido 13 '{"cod_pedido": 13, "cod_representante": 7, "cod_empleado": 2, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-06-15", "cod_ticket": 13}'
HSET pedido 14 '{"cod_pedido": 14, "cod_representante": 8, "cod_empleado": 1, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-09-11", "cod_ticket": 14}'
HSET pedido 15 '{"cod_pedido": 15, "cod_representante": 8, "cod_empleado": 2, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-11-17", "cod_ticket": 15}'
HSET pedido 16 '{"cod_pedido": 16, "cod_representante": 8, "cod_empleado": 1, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2023-12-14", "cod_ticket": 16}'
HSET pedido 17 '{"cod_pedido": 17, "cod_representante": 9, "cod_empleado": 2, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2024-01-17", "cod_ticket": 17}'
HSET pedido 18 '{"cod_pedido": 18, "cod_representante": 10, "cod_empleado": 1, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2024-02-17", "cod_ticket": 18}'
HSET pedido 19 '{"cod_pedido": 19, "cod_representante": 9, "cod_empleado": 2, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2024-04-17", "cod_ticket": 19}'
HSET pedido 20 '{"cod_pedido": 20, "cod_representante": 10, "cod_empleado": 1, "cod_pedido_tipo": "V", "cod_pedido_estado": "P", "fecha_registro": "2024-04-17", "cod_ticket": 20}'

HSET incidencia 1 '{"cod_incidencia": 1, "id_traslado": 1, "cod_tipo_incidencia": "A", "descripcion": "La fecha de entrega no coincide con la fecha establecida de llegada", "fecha_ocurrencia": "2024-04-24"}'
HSET incidencia 2 '{"cod_incidencia": 2, "id_traslado": 2, "cod_tipo_incidencia": "B", "descripcion": "Hay paquetes que no están sellados correctamente", "fecha_ocurrencia": "2024-05-03"}'
HSET incidencia 3 '{"cod_incidencia": 3, "id_traslado": 2, "cod_tipo_incidencia": "C", "descripcion": "El transportista no se le dio la documentación correspondiente", "fecha_ocurrencia": "2024-05-05"}'
HSET incidencia 4 '{"cod_incidencia": 4, "id_traslado": 1, "cod_tipo_incidencia": "D", "descripcion": "El vehículo asignado no enciende", "fecha_ocurrencia": "2024-04-28"}'
HSET incidencia 5 '{"cod_incidencia": 5, "id_traslado": 2, "cod_tipo_incidencia": "E", "descripcion": "La direccion no coincide con el pedido del cliente", "fecha_ocurrencia": "2024-05-08"}'
HSET incidencia 6 '{"cod_incidencia": 6, "id_traslado": 2, "cod_tipo_incidencia": "C", "descripcion": "La documentación presenta datos erróneos", "fecha_ocurrencia": "2024-05-10"}'
HSET incidencia 7 '{"cod_incidencia": 7, "id_traslado": 1, "cod_tipo_incidencia": "D", "descripcion": "El vehiculo sufrió derrame de aceite", "fecha_ocurrencia": "2024-04-30"}'
HSET incidencia 8 '{"cod_incidencia": 8, "id_traslado": 2, "cod_tipo_incidencia": "E", "descripcion": "La direccion asignada presenta demasiado tráfico", "fecha_ocurrencia": "2024-05-12"}'
HSET incidencia 9 '{"cod_incidencia": 9, "id_traslado": 1, "cod_tipo_incidencia": "B", "descripcion": "El sello del paquete está dañado", "fecha_ocurrencia": "2024-04-30"}'
HSET incidencia 10 '{"cod_incidencia": 10, "id_traslado": 1, "cod_tipo_incidencia": "A", "descripcion": "Ocurrió un accidente en la carretera que retrasó la entrega del pedido", "fecha_ocurrencia": "2024-05-02"}'

HSET procedimiento 1 '{"cod_procedimiento": 1, "cod_incidencia": 1, "cod_tipo_procedimiento": "A", "nombre": "Nro 1: Problema con la entrega", "tiempo_estimado": 2}'
HSET procedimiento 2 '{"cod_procedimiento": 2, "cod_incidencia": 2, "cod_tipo_procedimiento": "B", "nombre": "Nro 2: Problema con el etiquetado", "tiempo_estimado": 1}'
HSET procedimiento 3 '{"cod_procedimiento": 3, "cod_incidencia": 3, "cod_tipo_procedimiento": "C", "nombre": "Nro 3: Problema con la documentacion", "tiempo_estimado": 4}'
HSET procedimiento 4 '{"cod_procedimiento": 4, "cod_incidencia": 4, "cod_tipo_procedimiento": "D", "nombre": "Nro 4: Problema con el vehiculo", "tiempo_estimado": 6}'
HSET procedimiento 5 '{"cod_procedimiento": 5, "cod_incidencia": 5, "cod_tipo_procedimiento": "E", "nombre": "Nro 5: Problema con la ruta", "tiempo_estimado": 3}'
HSET procedimiento 6 '{"cod_procedimiento": 6, "cod_incidencia": 6, "cod_tipo_procedimiento": "C", "nombre": "Nro 6: Problema con el vehiculo", "tiempo_estimado": 6}'
HSET procedimiento 7 '{"cod_procedimiento": 7, "cod_incidencia": 7, "cod_tipo_procedimiento": "D", "nombre": "Nro 7: Problema con el vehiculo", "tiempo_estimado": 6}'
HSET procedimiento 8 '{"cod_procedimiento": 8, "cod_incidencia": 8, "cod_tipo_procedimiento": "E", "nombre": "Nro 8: Problema con la ruta", "tiempo_estimado": 3}'
HSET procedimiento 9 '{"cod_procedimiento": 9, "cod_incidencia": 9, "cod_tipo_procedimiento": "B", "nombre": "Nro 9: Problema con el etiquetado", "tiempo_estimado": 1}'
HSET procedimiento 10 '{"cod_procedimiento": 10, "cod_incidencia": 10, "cod_tipo_procedimiento": "B", "nombre": "Nro 10: Problema con el etiquetado", "tiempo_estimado": 1}'

HSET norma 1 '{"cod_norma": 1, "cod_incidencia": 1, "cod_norma_tipo": "X", "fecha_emision": "2019-01-24", "fecha_vigencia": "2025-01-24"}'
HSET norma 2 '{"cod_norma": 2, "cod_incidencia": 2, "cod_norma_tipo": "Y", "fecha_emision": "2021-02-21", "fecha_vigencia": "2029-02-21"}'
HSET norma 3 '{"cod_norma": 3, "cod_incidencia": 3, "cod_norma_tipo": "Z", "fecha_emision": "2020-02-17", "fecha_vigencia": "2026-02-17"}'
HSET norma 4 '{"cod_norma": 4, "cod_incidencia": 4, "cod_norma_tipo": "W", "fecha_emision": "2017-03-28", "fecha_vigencia": "2027-03-28"}'
HSET norma 5 '{"cod_norma": 5, "cod_incidencia": 5, "cod_norma_tipo": "X", "fecha_emision": "2005-03-15", "fecha_vigencia": "2025-01-24"}'
HSET norma 6 '{"cod_norma": 6, "cod_incidencia": 6, "cod_norma_tipo": "Y", "fecha_emision": "2027-03-21", "fecha_vigencia": "2029-02-21"}'
HSET norma 7 '{"cod_norma": 7, "cod_incidencia": 7, "cod_norma_tipo": "W", "fecha_emision": "2018-02-17", "fecha_vigencia": "2026-02-17"}'
HSET norma 8 '{"cod_norma": 8, "cod_incidencia": 8, "cod_norma_tipo": "X", "fecha_emision": "2015-06-11", "fecha_vigencia": "2027-03-28"}'
HSET norma 9 '{"cod_norma": 9, "cod_incidencia": 9, "cod_norma_tipo": "Y", "fecha_emision": "2018-02-17", "fecha_vigencia": "2026-02-17"}'
HSET norma 10 '{"cod_norma": 10, "cod_incidencia": 10, "cod_norma_tipo": "X", "fecha_emision": "2019-01-24", "fecha_vigencia": "2025-01-24"}'


HSET seguimiento 1 '{"cod_seguimiento": 1, "comentario": "Se está evaluando la temperatura de almacenamiento y transporte de los productos congelados para corregir cualquier irregularidad que pueda causar la formación de cristales de hielo en el futuro.", "fecha_resolucion": "2024-03-09", "numero_caso": 0, "cod_cliente_interno": 1, "cod_tipo_accion": "E"}'
HSET seguimiento 2 '{"cod_seguimiento": 2, "comentario": "Se ha iniciado una investigación interna para determinar en qué etapa del proceso de embalaje ocurrió el daño al envase y se está tomando medidas para mejorar el proceso de manipulación y embalaje.", "fecha_resolucion": "2024-04-29", "numero_caso": 1, "cod_cliente_interno": 1, "cod_tipo_accion": "C"}'
HSET seguimiento 3 '{"cod_seguimiento": 3, "comentario": "Se está coordinando la entrega de una nueva partida de guantes de la talla correcta y reemplazando la indumentaria de protección dañada para garantizar tu seguridad en el trabajo.", "fecha_resolucion": "2023-04-30", "numero_caso": 0, "cod_cliente_interno": 1, "cod_tipo_accion": "R"}'
HSET seguimiento 4 '{"cod_seguimiento": 4, "comentario": "Se ha verificado el inventario de herramientas y se ha iniciado el proceso de envío del taladro faltante para completar el kit.", "fecha_resolucion": "2023-06-01", "numero_caso": 0, "cod_cliente_interno": 1, "cod_tipo_accion": "E"}'
HSET seguimiento 5 '{"cod_seguimiento": 5, "comentario": "Se está realizando pruebas exhaustivas en la impresora para identificar y solucionar los problemas de impresión y funcionamiento.", "fecha_resolucion": "2023-06-04", "numero_caso": 0, "cod_cliente_interno": 4, "cod_tipo_accion": "I"}'
HSET seguimiento 6 '{"cod_seguimiento": 6, "comentario": "Se ha contactado al proveedor para discutir el problema de las alas de pollo y se están revisando los procedimientos de corte para garantizar la calidad y consistencia del producto.", "fecha_resolucion": "2023-09-30", "numero_caso": 0, "cod_cliente_interno": 3, "cod_tipo_accion": "C"}'
HSET seguimiento 7 '{"cod_seguimiento": 7, "comentario": "Se ha descartado el lote afectado y se está investigando la cadena de suministro para identificar la causa del problema y evitar futuras incidencias.", "fecha_resolucion": "2023-12-29", "numero_caso": 0, "cod_cliente_interno": 1, "cod_tipo_accion": "I"}'
HSET seguimiento 8 '{"cod_seguimiento": 8, "comentario": "Se está evaluando la temperatura de almacenamiento y transporte de los productos congelados para corregir cualquier irregularidad que pueda causar la formación de cristales de hielo en el futuro.", "fecha_resolucion": "2024-03-09", "numero_caso": 0, "cod_cliente_interno": 1, "cod_tipo_accion": "E"}'
HSET seguimiento 9 '{"cod_seguimiento": 9, "comentario": "Se ha iniciado una investigación interna para determinar en qué etapa del proceso de embalaje ocurrió el daño al envase y se está tomando medidas para mejorar el proceso de manipulación y embalaje.", "fecha_resolucion": "2024-04-29", "numero_caso": 1, "cod_cliente_interno": 1, "cod_tipo_accion": "C"}'
HSET seguimiento 10 '{"cod_seguimiento": 10, "comentario": "Se está llevando a cabo una revisión exhaustiva de los procesos de almacenamiento y manipulación de las pechugas de pollo para identificar la fuente del problema y se han reforzado los controles de calidad para evitar errores similares en el futuro.", "fecha_resolucion": "2024-05-02", "numero_caso": 2, "cod_cliente_interno": 1, "cod_tipo_accion": "I"}'

HSET reclamo 1 '{"cod_reclamo": 1, "comentario": "Las estanterías metálicas recibidas están oxidadas y algunas piezas están dañadas.", "fecha_suceso": "2019-04-30", "fecha_reclamo": "2019-05-01", "cod_representante": 1, "cod_pedido": 1, "cod_seguimiento": 1, "cod_tipo_reclamo": "A", "cod_nivel_urgencia": "M", "cod_estado_reclamo": "C"}'
HSET reclamo 2 '{"cod_reclamo": 2, "comentario": "La silla ergonómica recibida tiene un defecto en el respaldo y el teléfono multifuncional no funciona correctamente.", "fecha_suceso": "2022-01-23", "fecha_reclamo": "2022-01-26", "cod_representante": 2, "cod_pedido": 3, "cod_seguimiento": 2, "cod_tipo_reclamo": "C", "cod_nivel_urgencia": "A", "cod_estado_reclamo": "B"}'
HSET reclamo 3 '{"cod_reclamo": 3, "comentario": "Los guantes de látex recibidos son de una talla incorrecta y la indumentaria de protección está desgarrada.", "fecha_suceso": "2023-04-20", "fecha_reclamo": "2023-04-20", "cod_representante": 3, "cod_pedido": 5, "cod_seguimiento": 3, "cod_tipo_reclamo": "C", "cod_nivel_urgencia": "A", "cod_estado_reclamo": "D"}'
HSET reclamo 4 '{"cod_reclamo": 4, "comentario": "El kit de herramientas eléctricas recibido está incompleto, falta el taladro.", "fecha_suceso": "2023-05-21", "fecha_reclamo": "2023-05-22", "cod_representante": 4, "cod_pedido": 7, "cod_seguimiento": 4, "cod_tipo_reclamo": "B", "cod_nivel_urgencia": "M", "cod_estado_reclamo": "A"}'
HSET reclamo 5 '{"cod_reclamo": 5, "comentario": "La impresora de etiquetas recibida no imprime correctamente y presenta errores de funcionamiento.", "fecha_suceso": "2023-05-22", "fecha_reclamo": "2023-05-22", "cod_representante": 5, "cod_pedido": 9, "cod_seguimiento": 5, "cod_tipo_reclamo": "A", "cod_nivel_urgencia": "M", "cod_estado_reclamo": "D"}'
HSET reclamo 6 '{"cod_reclamo": 6, "comentario": "Las alas de pollo congeladas recibidas están mal cortadas y no presentan el tamaño adecuado.", "fecha_suceso": "2023-09-18", "fecha_reclamo": "2023-09-20", "cod_representante": 6, "cod_pedido": 11, "cod_seguimiento": 6, "cod_tipo_reclamo": "C", "cod_nivel_urgencia": "A", "cod_estado_reclamo": "A"}'
HSET reclamo 7 '{"cod_reclamo": 7, "comentario": "Las piernas con encuentros frescas recibidas están vencidas y los muslos de pollos frescos tienen un olor extraño.", "fecha_suceso": "2023-12-19", "fecha_reclamo": "2023-12-19", "cod_representante": 7, "cod_pedido": 13, "cod_seguimiento": 7, "cod_tipo_reclamo": "A", "cod_nivel_urgencia": "A", "cod_estado_reclamo": "C"}'
HSET reclamo 8 '{"cod_reclamo": 8, "comentario": "El muslo de pollo congelado recibido está congelado en exceso y presenta cristales de hielo.", "fecha_suceso": "2024-02-26", "fecha_reclamo": "2024-02-29", "cod_representante": 8, "cod_pedido": 15, "cod_seguimiento": 8, "cod_tipo_reclamo": "A", "cod_nivel_urgencia": "A", "cod_estado_reclamo": "B"}'
HSET reclamo 9 '{"cod_reclamo": 9, "comentario": "El detergente SuperClean recibido tiene el envase roto y parte del contenido se ha derramado.", "fecha_suceso": "2024-04-21", "fecha_reclamo": "2024-04-22", "cod_representante": 9, "cod_pedido": 17, "cod_seguimiento": 9, "cod_tipo_reclamo": "D", "cod_nivel_urgencia": "M", "cod_estado_reclamo": "C"}'
HSET reclamo 10 '{"cod_reclamo": 10, "comentario": "Las pechugas enteras de pollos frescas recibidas están en mal estado y los colorantes naturales Chroma no se incluyeron en el pedido.", "fecha_suceso": "2024-04-22", "fecha_reclamo": "2024-04-23", "cod_representante": 10, "cod_pedido": 19, "cod_seguimiento": 10, "cod_tipo_reclamo": "C", "cod_nivel_urgencia": "A", "cod_estado_reclamo": "A"}'

HSET evidencia 1 '{"cod_evidencia": 1, "nombre_evidencia": "Captura_estanterias_oxidadas", "cod_reclamo": 1, "cod_tipo_evidencia": "C", "cod_tipo_archivo": "1"}'
HSET evidencia 2 '{"cod_evidencia": 2, "nombre_evidencia": "Foto_estanterias_dañadas", "cod_reclamo": 1, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "8"}'
HSET evidencia 3 '{"cod_evidencia": 3, "nombre_evidencia": "Documento_silla_defectuosa", "cod_reclamo": 2, "cod_tipo_evidencia": "D", "cod_tipo_archivo": "5"}'
HSET evidencia 4 '{"cod_evidencia": 4, "nombre_evidencia": "Grabacion_audio_respaldo_silla", "cod_reclamo": 2, "cod_tipo_evidencia": "G", "cod_tipo_archivo": "6"}'
HSET evidencia 5 '{"cod_evidencia": 5, "nombre_evidencia": "Foto_telefono_dañado", "cod_reclamo": 2, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "15"}'
HSET evidencia 6 '{"cod_evidencia": 6, "nombre_evidencia": "Documento_guantes_talla_incorrecta", "cod_reclamo": 3, "cod_tipo_evidencia": "D", "cod_tipo_archivo": "14"}'
HSET evidencia 7 '{"cod_evidencia": 7, "nombre_evidencia": "Foto_indumentaria_desgarrada", "cod_reclamo": 3, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "7"}'
HSET evidencia 8 '{"cod_evidencia": 8, "nombre_evidencia": "Fotografia_herramientas_incompletas", "cod_reclamo": 4, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "18"}'
HSET evidencia 9 '{"cod_evidencia": 9, "nombre_evidencia": "Documento_lista_faltante_herramientas", "cod_reclamo": 4, "cod_tipo_evidencia": "D", "cod_tipo_archivo": "17"}'
HSET evidencia 10 '{"cod_evidencia": 10, "nombre_evidencia": "Captura_impresora_error", "cod_reclamo": 5, "cod_tipo_evidencia": "C", "cod_tipo_archivo": "2"}'
HSET evidencia 11 '{"cod_evidencia": 11, "nombre_evidencia": "Foto_impresora_error", "cod_reclamo": 5, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "9"}'
HSET evidencia 12 '{"cod_evidencia": 12, "nombre_evidencia": "Foto_alas_pollos_mal_estado", "cod_reclamo": 6, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "3"}'
HSET evidencia 13 '{"cod_evidencia": 13, "nombre_evidencia": "Foto_pollo_descongelado", "cod_reclamo": 6, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "8"}'
HSET evidencia 14 '{"cod_evidencia": 14, "nombre_evidencia": "Grabacion_audio_piernas_vencidas", "cod_reclamo": 7, "cod_tipo_evidencia": "G", "cod_tipo_archivo": "13"}'
HSET evidencia 15 '{"cod_evidencia": 15, "nombre_evidencia": "Fotografia_muslos_olor_extraño", "cod_reclamo": 7, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "18"}'
HSET evidencia 16 '{"cod_evidencia": 16, "nombre_evidencia": "Fotografia_muslo_congelado_exceso", "cod_reclamo": 8, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "20"}'
HSET evidencia 17 '{"cod_evidencia": 17, "nombre_evidencia": "Documento_cristales_hielo", "cod_reclamo": 8, "cod_tipo_evidencia": "D", "cod_tipo_archivo": "19"}'
HSET evidencia 18 '{"cod_evidencia": 18, "nombre_evidencia": "Fotografia_detergente_derramado", "cod_reclamo": 9, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "4"}'
HSET evidencia 19 '{"cod_evidencia": 19, "nombre_evidencia": "Documento_envase_roto", "cod_reclamo": 9, "cod_tipo_evidencia": "D", "cod_tipo_archivo": "10"}'
HSET evidencia 20 '{"cod_evidencia": 20, "nombre_evidencia": "Fotografia_pechugas_mal_estado", "cod_reclamo": 10, "cod_tipo_evidencia": "F", "cod_tipo_archivo": "16"}'
HSET evidencia 21 '{"cod_evidencia": 21, "nombre_evidencia": "Documento_reclamo_sin_colorantes", "cod_reclamo": 10, "cod_tipo_evidencia": "D", "cod_tipo_archivo": "22"}'

```
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




