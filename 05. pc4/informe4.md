# Cuarta práctica calificada - Informe      

## 1. Índices y otros objetos de BD
### Índice Fecha_mantenimiento:
```sql
DROP INDEX IF EXISTS fecha_mantenimiento;
CREATE INDEX fecha_mantenimiento
ON vehiculo(fecha_ultimo_mantenimiento, cod_vehiculo_estado)
```
Proceso B001 sin Índice:
![image](https://github.com/fiis-bd241/grupo01/assets/164358065/16591b4f-918c-4d1b-8f5f-8c3df1a2e379)

Proceso B001 con Índice:
![image](https://github.com/fiis-bd241/grupo01/assets/164358065/e84c9605-59f5-482d-adc0-d94f9467e6d0)

## 2. PL/pgSQL – Proceso Batch

### Proceso B001: Actualización del estado del vehículo por fecha del último mantenimiento

Cada fin de mes se actualiza el estado del vehículo a 'No disponible' para los vehículos cuya fecha de último mantenimiento cumple dentro del próximo mes un año o más desde el último mantenimiento.

```sql
CREATE OR REPLACE FUNCTION actualizar_mantenimiento_y_estado() RETURNS void AS $$
BEGIN
    UPDATE vehiculo
    SET
        cod_vehiculo_estado = 'N'
    WHERE 
        EXTRACT(year FROM AGE(v.fecha_ultimo_mantenimiento))>=1;
END;
$$ LANGUAGE plpgsql;
```

### Proceso B002: Actualización del estado del vehículo por años de antigüedad

Anualmente se actualiza el estado  a 'No disponible' a los vehículos que están por cumplir 15 años de antigüedad.

```sql
CREATE OR REPLACE FUNCTION actualizar_estado_vehiculos_antiguos() RETURNS void AS $$
BEGIN
    UPDATE vehiculo
    SET 
        cod_vehiculo_estado = 'N'
    WHERE 
        anio_fabricacion <= EXTRACT(YEAR FROM CURRENT_DATE) - 15;
END;
$$ LANGUAGE plpgsql;
```


## 3. Actualizaciones a la Arquitectura de la Aplicación

## 4. Versión Final de la Aplicación

## 5. Próximos Pasos

## 6. NoSQL
