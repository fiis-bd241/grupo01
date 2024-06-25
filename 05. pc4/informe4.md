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
#### Trigger para actualizar la fecha de último traslado de un transportista

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

## 6. NoSQL
