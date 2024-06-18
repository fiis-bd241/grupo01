# Cuarta práctica calificada - Informe      

## 1. Índices y otros objetos de BD

## 2. PL/pgSQL – Proceso Batch

### Proceso: Actualización del estado del vehículo por fecha del último mantenimiento

Cada fin de mes se actualiza el estado del vehículo a 'No disponible' para los vehículos cuya fecha de último mantenimiento cumple dentro del próximo mes un año o más desde el último mantenimiento.

```sql
CREATE OR REPLACE FUNCTION actualizar_mantenimiento_y_estado() RETURNS void AS $$
BEGIN
    -- Actualizar la fecha de último mantenimiento a la fecha actual para vehículos cuyo mantenimiento vence dentro del próximo mes
    UPDATE vehiculo
    SET
        cod_vehiculo_estado = 'N'
    WHERE 
        fecha_ultimo_mantenimiento <= CURRENT_DATE - INTERVAL '11 months';
END;
$$ LANGUAGE plpgsql;
```

### Proceso: Actualización del estado del vehículo por años de antigüedad

Anualmente se actualiza el estado  a 'No disponible' a los vehículos que están por cumplir 15 años de antigüedad.

```sql
CREATE OR REPLACE FUNCTION actualizar_estado_vehiculos_antiguos() RETURNS void AS $$
BEGIN
    -- Actualizar el estado del vehículo a 'N' para vehículos que están por cumplir 15 años de antigüedad
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

## 6. Bonus: NoSQL
