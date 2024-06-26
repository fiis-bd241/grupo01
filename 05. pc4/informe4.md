# Cuarta práctica calificada - Informe      

## 1. Índices y otros objetos de BD

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

### 6. Módulo de Reclamos

En la creación de un reclamo, el apartado de evidencia podría mejorarse significativamente. Actualmente, solo es posible registrar manualmente una evidencia, especificando el nombre de la evidencia y seleccionando el tipo de archivo y el tipo de evidencia mediante listas desplegables. Para mejorar este proceso, se propone implementar la funcionalidad de subir múltiples evidencias de una vez. Adicionalmente, el sistema debería ser capaz de detectar automáticamente el tipo de archivo y el tipo de evidencia correspondiente, eliminando la necesidad de selección manual. Además, estas evidencias deberían tener la opción de almacenarse en la nube. Esta mejora no solo facilitaría el proceso de registro de evidencias, sino que también garantizaría una mayor seguridad y accesibilidad de la información, permitiendo acceder a las evidencias desde cualquier lugar con conexión a internet.

## 6. NoSQL
