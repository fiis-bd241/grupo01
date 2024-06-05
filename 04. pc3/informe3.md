# Tercera práctica calificada - Informe 

## 1. Asignación de Códigos por Requerimientos y Prototipos de Interfaces de Usuario

### Requerimientos

#### 3. Requerimientos del módulo de Almacén

Caso de Uso #1: Registrar picking
| Código | R301 | 
|----------|----------|
|Objetivo | Registrar el proceso de agrupamiento de ítems o stock de productos, materiales o materias primas en grupos |
|Descripción | El usuario registra los ítems seleccionados indicando sus códigos|
|Actor Primario | Gestor de compras |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Ítems disponibles en el almacén |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar picking"|
|2|Ingresa los ítems para el picking|
|3|Asigna los ítems seleccionados a un grupo|
|4|Ingresa los datos de fecha y hora de inicio y fin del proceso|
|5|Confirma el registro del picking|
|6|El sistema registra la operación de picking y almacena los grupos (mercadería) con los ítems seleccionados|

Caso de Uso #2: Registrar precintado
| Código | R302 | 
|----------|----------|
|Objetivo | Registrar el proceso de embalaje y sellado de seguridad de los grupos de ítems previamente seleccionados en el picking |
|Descripción | El usuario registra los grupos de ítems que han sido previamente seleccionados en el picking para el proceso de precintado |
|Actor Primario | Almacenero |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Grupos de ítems seleccionados en el proceso de picking |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar precintado"|
|2|Selecciona los grupos de ítems previamente seleccionados en el proceso de picking|
|3|Registra los datos de fecha y hora de inicio y fin del proceso de embalaje y sellado de seguridad de los grupos de ítems, así como los códigos de precintado de cada grupo|
|4|Confirma el registro del precintado|
|5|El sistema registra la operación y registra el código de precinto de la mercadería|

Caso de Uso #3: Registrar paletizado
| Código | R303 | 
|----------|----------|
|Objetivo | Registrar el proceso de paletizado de los grupos de ítems precintados |
|Descripción | El usuario registra los grupos de ítems precintados que serán paletizados para su posterior carga |
|Actor Primario | Almacenero |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Grupos de ítems precintados |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar paletizado"|
|2|Selecciona los grupos de ítems precintados que serán paletizados|
|3|Registra el proceso de paletizado de los grupos de ítems|
|4|Confirma el registro del paletizado|
|5|El sistema registra la operación|

Caso de Uso #4: Registrar carga
| Código | R304 | 
|----------|----------|
|Objetivo | Registrar el proceso de carga de los grupos de ítems paletizados |
|Descripción | El usuario registra los grupos de ítems paletizados que serán cargados en un vehículo para su posterior envío |
|Actor Primario | Encargado de almacén |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Grupos de ítems paletizados |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar carga"|
|2|Selecciona los grupos de ítems paletizados que serán cargados|
|3|Registra el proceso de carga de los grupos de ítems en el vehículo|
|4|Confirma el registro de la carga|
|5|El sistema registra la operación|

Caso de Uso #5: Registrar guía de remisión
| Código | R305 | 
|----------|----------|
|Objetivo | Registrar el proceso de envío de los grupos de ítems cargados |
|Descripción | El usuario registra los datos del envío, incluyendo datos del transportista y vehículo, entre otros |
|Actor Primario | Encargado de Almacén |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Grupos de ítems cargados en el vehículo |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar guía de remisión"|
|2|Ingresa los datos del envío: código de guía de remisión, identificación del transportista y vehículo, el o los pedidos que se están atendiendo, la operación de carga, la ruta asignada y la fecha y hora de salida|
|3|Confirma el registro del envío|
|4|El sistema registra el inicio del traslado|

Caso de Uso #6: Registrar recepción
| Código | R306 | 
|----------|----------|
|Objetivo | Registrar el proceso de recepción de los grupos de ítems enviados |
|Descripción | El usuario registra la fecha y hora de recepción de los grupos de ítems en el lugar de destino |
|Actor Primario | Encargado de Almacén |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Guía de remisión |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar recepción"|
|2|Ingresa la fecha y hora de recepción de los grupos de ítems, seleccionando la guía de remisión respectiva|
|3|Confirma el registro de la recepción|
|4|El sistema registra la finalización del traslado|

Caso de Uso #7: Registrar descarga
| Código | R307 | 
|----------|----------|
|Objetivo | Registrar el proceso de descarga de los grupos de ítems recibidos |
|Descripción | El usuario registra la fecha y hora de inicio y finalización de la descarga de los grupos de ítems en el lugar de destino |
|Actor Primario | Encargado de Almacén |
|Actor Secundario| Supervisor de almacén |
|Precondiciones| Grupos de ítems recibidos en el lugar de destino |
|Paso| Acción |
|1|El usuario selecciona la opción "Registrar descarga"|
|2|Ingresa la fecha y hora de inicio de la descarga de los grupos de ítems|
|3|Registra la fecha y hora de finalización de la descarga de los grupos de ítems|
|4|Confirma el registro de la descarga|
|5|El sistema actualiza el estado de los grupos de ítems como "descargados"|

#### 5. Requerimientos del módulo de Reportes

Caso de Uso #1: Generar reporte

| Código           | R501                                                                                                                                                                       |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Generar un reporte de un tipo específico para cada módulo de forma inmediata                                                                                               |
| Descripción      | Permite generar reportes personalizados para cada módulo de forma instantánea donde el usuario define las características del reporte y lo descarga en el formato deseado. |
| Actor Primario   | Representante de un área                                                                                                                                                   |
| Actor Secundario | -                                                                                                                                                                          |
| Precondiciones   | El representante debió iniciar sesión                                                                                                                                      |
| Paso             | Acción                                                                                                                                                                     |
| 1                | El usuario selecciona el módulo "Reportes"                                                                                                                                 |
| 2                | El usuario presiona el de botón de "Generar reporte"                                                                                                                       |
| 3                | Se muestra una ventana emergente, donde el usuario podrá seleccionar las características del reporte a su preferencia                                                      |
| 4                | El usuario presiona el boton "Generar" y se le descarga el reporte en el formato escogido                                                                                  |

Caso de Uso #2: Programar reporte

| Código           | R502                                                                                                                                                                                                                            |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Programar la generación de un reporte de un tipo específico para cada módulo en intervalos predefinidos                                                                                                                         |
| Descripción      | Permite programar la generación de reportes a intervalos predefinidos específicos por el usuario, que define las características del reporte, la frecuencia de generación y el sistema se encarga de generarlo automáticamente. |
| Actor Primario   | Representante de un área                                                                                                                                                                                                        |
| Actor Secundario | -                                                                                                                                                                                                                               |
| Precondiciones   | El representante debió iniciar sesión                                                                                                                                                                                           |
| Paso             | Acción                                                                                                                                                                                                                          |
| 1                | El usuario selecciona el módulo "Reportes"                                                                                                                                                                                      |
| 2                | El usuario presiona el de botón de "Programar reporte"                                                                                                                                                                          |
| 3                | Se muestra una ventana emergente, donde el usuario podrá seleccionar las características de la programació del reporte a su preferencia                                                                                         |
| 4                | El usuario presiona el boton "Programar" y se añade a la lista de reportes programados                                                                                                                                          |

Caso de Uso #3: Ver nivel de inventario

| Código           | R503                                                                                                                                                                                                        |
| ---------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Proporcionar visibilidad de los niveles de inventario para los productos                                                                                                                                    |
| Descripción      | Permite visualizar en tiempo real los niveles de inventario para todos los productos o un subconjunto específico. El usuario puede filtrar, ordenar y seleccionar productos para ver información detallada. |
| Actor Primario   | Representante de un área                                                                                                                                                                                    |
| Actor Secundario | -                                                                                                                                                                                                           |
| Precondiciones   | El representante debió iniciar sesión                                                                                                                                                                       |
| Paso             | Acción                                                                                                                                                                                                      |
| 1                | El usuario selecciona el módulo "Reportes"                                                                                                                                                                  |
| 2                | Se muestra una tabla con los productos                                                                                                                                                                      |
| 3                | El usuario puede interactuar con la tabla para seleccionar los productos que desea ver los niveles de inventario                                                                                            |

Caso de Uso #4: Ver gráficos de cada módulo

| Código           | R504                                                                                                |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Objetivo         | Visualizar datos utilizando una variedad de gráficos y tablas                                       |
| Descripción      | Permite visualizar datos utilizando gráficos y tablas para una mejor comprensión de la información. |
| Actor Primario   | Representante de un área                                                                            |
| Actor Secundario | -                                                                                                   |
| Precondiciones   | El representante debió iniciar sesión                                                               |
| Paso             | Acción                                                                                              |
| 1                | El usuario selecciona el módulo "Reportes"                                                          |
| 2                | El usuario debe presionar el botón de "Gráficos"                                                    |
| 3                | Se muestran diversos gráficos relacionados con cada módulo                                          |

### Prototipos


#### 5. Prototipos del módulo de Reportes

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R501, R502, R503, R504           |
| Código      | I501 |
| Prototipo   |     ![P501](https://github.com/fiis-bd241/grupo01/assets/161625149/eb29ab8b-8fb7-4e69-88ad-926acf086307)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R501           |
| Código      | I502 |
| Prototipo   | ![P502](https://github.com/fiis-bd241/grupo01/assets/161625149/df005dc5-7ebb-4274-94c4-523000c47962)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R502          |
| Código      | I503 |
| Prototipo   |  ![P503](https://github.com/fiis-bd241/grupo01/assets/161625149/3adf13d0-7cb1-4e1d-902d-fe408ea98340) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R504          |
| Código      | I504 |
| Prototipo   |   ![P504](https://github.com/fiis-bd241/grupo01/assets/161625149/e62b62ae-d440-4708-9240-c5cc0fa6b39b)|

## 2. Sentencias SQL por cada prototipo

### 5. Sentencias SQL módulo de Reportes

#### Caso 1
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R503</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I501</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/2acc5a60-390a-4174-baca-12bdc48e3da0">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de reportes programados: Cuando el usuario entre al modulo de reportes, se llenará la tabla de reportes programados según su id.
``` sql 
SELECT 
	pr.cod_programacion_reporte,
	rfo.descripcion formato,
	rt.descripcion tipo,
	rfe.descripcion frecuencia,
	pr.fecha_inicio, 
	pr.fecha_fin 
FROM programacion_reporte AS pr
INNER JOIN reporte_formato AS rfo ON rfo.cod_reporte_formato = pr.cod_reporte_formato
INNER JOIN reporte_tipo AS rt ON rt.cod_reporte_tipo = pr.cod_reporte_tipo
INNER JOIN reporte_frecuencia AS rfe ON rfe.cod_reporte_frecuencia = pr.cod_reporte_frecuencia
WHERE pr.cod_reporte_estado = 1 AND pr.cod_representante = <1>
ORDER BY pr.cod_programacion_reporte;
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.
El cod_reporte_estado = 1 corresponde a "Activo".

3. Carga de inventario: Cuando el usuario entre al modulo de reportes, se llenará la tabla de elementos catálogo.
``` sql 
SELECT 
	ec.id_elemento_catalogo, 
	ec.nombre,
	ec.peso_unitario,
	ecu.descripcion AS unidad,
	ect.descripcion AS tipo,
	ep.descripcion AS produccion,
	SUM(st.cantidad) AS cantidad
FROM elemento_catalogo AS ec
LEFT JOIN stock AS st ON st.id_elemento_catalogo = ec.id_elemento_catalogo
LEFT JOIN elemento_catalogo_unidad AS ecu ON ecu.cod_unidad = ec.cod_unidad
LEFT JOIN elemento_catalogo_tipo AS ect ON ect.id_elemento_catalogo_tipo = ec.id_elemento_catalogo_tipo
LEFT JOIN elemento_produccion AS ep ON ep.id_elemento_produccion = ect.id_elemento_produccion
GROUP BY ec.id_elemento_catalogo, ecu.cod_unidad, ect.id_elemento_catalogo_tipo, ep.id_elemento_produccion;
```
#### Caso 2
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R501</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I502</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/535c570e-bfca-44c8-bcca-614900b5c099">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de formatos: Se llenará la lista de formatos de reportes a seleccionar.
``` sql 
SELECT cod_reporte_formato, descripcion FROM reporte_formato;
```
3. Carga de tipos: Se llenará la lista de tipos de reportes a seleccionar.

``` sql 
SELECT cod_reporte_tipo, descripcion FROM reporte_tipo; 
```
4. Botón generar: Cuando el usuario presione el botón generar, se generará un reporte.

``` sql 
INSERT INTO reporte
(cod_representante, cod_reporte_formato, cod_reporte_tipo)
VALUES
(<1>, <2>, <3>);
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.

#### Caso 3
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R502</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I503</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/e534c9ea-dca5-44ce-a337-e3b0e4dcf9bc">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de frecuencia: Se llenará la lista de frecuencias para programar reportes.
``` sql
SELECT cod_reporte_frecuencia, descripcion FROM reporte_frecuencia;
```
3. Carga de formatos: Se llenará la lista de formatos de reportes a seleccionar.

``` sql
SELECT cod_reporte_formato, descripcion FROM reporte_formato;
```
4. Carga de tipos: Se llenará la lista de tipos de reportes a seleccionar.

``` sql
SELECT cod_reporte_tipo, descripcion FROM reporte_tipo; 
```
7. Botón programar: Cuando el usuario presione el botón generar, se generará un reporte.

``` sql
INSERT INTO programacion_reporte
(cod_representante, cod_reporte_frecuencia, cod_reporte_formato, cod_reporte_tipo,, fecha_inicio, fecha_fin, cod_reporte_estado ) 
VALUES
(<1>, <2>, <3>, <4>, <5>, <7>, 1);
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.
El cod_reporte_estado = 1 corresponde a "Activo".

#### Caso 4
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R504</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I504</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/a450e6c6-fd86-4fac-8730-46b13ef6402d">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>
1. Carga de reportes programados: Cuando el usuario entre al modulo de reportes, se llenará la tabla de reportes programados según su id.

``` sql 
SELECT 
    pr.cod_programacion_reporte,
    rfo.descripcion formato,
    rt.descripcion tipo,
    rfe.descripcion frecuencia,
    pr.fecha_inicio, 
    pr.fecha_fin 
FROM programacion_reporte AS pr
INNER JOIN reporte_formato AS rfo ON rfo.cod_reporte_formato = pr.cod_reporte_formato
INNER JOIN reporte_tipo AS rt ON rt.cod_reporte_tipo = pr.cod_reporte_tipo
INNER JOIN reporte_frecuencia AS rfe ON rfe.cod_reporte_frecuencia = pr.cod_reporte_frecuencia
WHERE pr.cod_reporte_estado = 1 AND pr.cod_representante = <1>
ORDER BY pr.cod_programacion_reporte;
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.
El cod_reporte_estado = 1 corresponde a "Activo".

Al haber presionado antes el botón de "Gráficos", se carga otra pantalla con diversos gráficos de:

2. Carga de gráfica de pedidos por mes:
``` sql
WITH meses AS (
    SELECT generate_series(1, 12) AS mes_num
)
SELECT 
    TO_CHAR(TO_DATE(mes_num::text, 'MM'), 'TMMonth') AS mes,
    COUNT(pe.fecha_registro) AS total_pedidos FROM meses
LEFT JOIN 
    pedido AS pe ON EXTRACT(MONTH FROM pe.fecha_registro) = meses.mes_num
    AND EXTRACT(YEAR FROM pe.fecha_registro) = 2024
GROUP BY meses.mes_num
ORDER BY meses.mes_num;
```
3. Carga de productos más pedidos: Aparecerán barras según el límite escogido:
``` sql
SELECT ec.id_elemento_catalogo, ec.nombre, SUM(dtp.cantidad) AS cantidad FROM pedido AS pe
INNER JOIN ticket AS t ON t.cod_ticket = pe.cod_ticket AND pe.cod_pedido_tipo = 'V'
INNER JOIN detalle_ticket_producto AS dtp ON dtp.cod_ticket = t.cod_ticket
INNER JOIN elemento_catalogo AS ec ON ec.id_elemento_catalogo = dtp.id_elemento_catalogo
GROUP BY ec.id_elemento_catalogo
ORDER BY cantidad DESC LIMIT <3>;
```
El `<3>` corresponde a la cantidad escogida de elementos catálogos para mostrar en el gráfico de barras. <br>

4. Cantidad de reclamos por mes:
``` sql
WITH meses AS (
    SELECT generate_series(1, 12) AS mes_num
)
SELECT 
    TO_CHAR(TO_DATE(mes_num::text, 'MM'), 'TMMonth') AS mes,
    COUNT(re.fecha_reclamo) AS total_reclamos FROM meses
LEFT JOIN 
    reclamo AS re ON EXTRACT(MONTH FROM re.fecha_reclamo) = meses.mes_num
    AND EXTRACT(YEAR FROM re.fecha_reclamo) = 2024
GROUP BY meses.mes_num
ORDER BY meses.mes_num;
```
5. Tiempo medio de resolución de reclamos por su nivel de urgencia:
``` sql
SELECT 
    nu.cod_nivel_urgencia, 
    nu.descripcion, 
    COALESCE(SUM(se.fecha_resolucion - re.fecha_reclamo)/COUNT(re.cod_reclamo),0) AS tiempo_medio,
    COUNT(re.cod_reclamo) AS cantidad
FROM nivel_urgencia AS nu
LEFT JOIN reclamo AS re ON re.cod_nivel_urgencia = nu.cod_nivel_urgencia
LEFT JOIN seguimiento AS se ON se.cod_seguimiento = re.cod_seguimiento
GROUP BY nu.cod_nivel_urgencia;
```
6. Cantidad de reclamos por tipo y nivel de urgencia
``` sql
SELECT 
    rt.cod_tipo_reclamo,
    rt.descripcion,
    COUNT(re.cod_reclamo) AS total,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'B' THEN 1 ELSE 0 END) AS urgencia_baja,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'M' THEN 1 ELSE 0 END) AS urgencia_media,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'A' THEN 1 ELSE 0 END) AS urgencia_alta
FROM reclamo_tipo AS rt
LEFT JOIN reclamo AS re ON re.cod_tipo_reclamo = rt.cod_tipo_reclamo
LEFT JOIN nivel_urgencia AS nu ON nu.cod_nivel_urgencia = re.cod_nivel_urgencia
GROUP BY rt.cod_tipo_reclamo
ORDER BY rt.cod_tipo_reclamo;
```
7. Tiempo medio para realizar cada operación en almacén:
``` sql
SELECT 
    ot.cod_tipo_operacion, 
    ot.descripcion, 
    COALESCE(SUM(hora_fin-hora_inicio)/COUNT(*),'00:00:00') as operacion_tipo_tiempo_medio
FROM operacion_tipo AS ot
LEFT JOIN operacion AS o ON o.cod_tipo_operacion = ot.cod_tipo_operacion 
GROUP BY ot.cod_tipo_operacion;
```
8. Descripción de tipos de reclamos: (Se obtiene de la parte 6.)
``` sql
SELECT 
    rt.cod_tipo_reclamo,
		rt.descripcion,
    COUNT(re.cod_reclamo) AS total,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'B' THEN 1 ELSE 0 END) AS urgencia_baja,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'M' THEN 1 ELSE 0 END) AS urgencia_media,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'A' THEN 1 ELSE 0 END) AS urgencia_alta
FROM reclamo_tipo AS rt
LEFT JOIN reclamo AS re ON re.cod_tipo_reclamo = rt.cod_tipo_reclamo
LEFT JOIN nivel_urgencia AS nu ON nu.cod_nivel_urgencia = re.cod_nivel_urgencia
GROUP BY rt.cod_tipo_reclamo
ORDER BY rt.cod_tipo_reclamo;
```
## 3. Carga de Datos

```sql
INSERT INTO estado_civil( cod_estado_civil, descripcion ) VALUES
 ( 1, 'Soltero'),
 ( 2, 'Casado'),
 ( 3, 'Conviviente'),
 ( 4, 'Divorciado'),
 ( 5, 'Viudo');

INSERT INTO nacionalidad( cod_nacionalidad, descripcion ) VALUES
 ( 1, 'Peruano'),
 ( 2, 'Argentino');

INSERT INTO genero( cod_genero, descripcion ) VALUES
 ( 1, 'Masculino'),
 ( 2, 'Femenino');

INSERT INTO cliente_estado (cod_cliente_estado, estado_cliente) VALUES
 ( 'A', 'Activo'),
 ( 'I', 'Inactivo');

INSERT INTO cliente_tipo (cod_cliente_tipo, tipo_cliente) VALUES
 ( 'I', 'Cliente interno'),
 ( 'E', 'Cliente externo');

INSERT INTO vehiculo_estado (cod_vehiculo_estado,descripcion) VALUES
 ( 'D', 'Disponible'),
 ( 'N', 'No disponible'),
 ( 'C', 'Cuarentena');

INSERT INTO vehiculo_modelo (cod_vehiculo_modelo,descripcion) VALUES
 ( 'F', 'Furgoneta'),
 ( 'C', 'Camión'),
 ( 'S', 'SUV');

INSERT INTO elemento_catalogo_unidad (cod_unidad, descripcion) VALUES
 (1, 'Kilogramo'),
 (2, 'Gramo'),
 (3, 'Litro'),
 (4, 'Mililitro'),
 (5, 'Metro'),
 (6, 'Centímetro'),
 (7, 'Unidad'),
 (8, 'Docena'),
 (9, 'Caja'),
 (10, 'Bolsa'),
 (11, 'Envase'),
 (12, 'Bandeja'),
 (13, 'Paquete'),
 (14, 'Saco'),
 (15, 'Barril'),
 (16, 'Galón');

INSERT INTO elemento_produccion (id_elemento_produccion, descripcion) VALUES
 (1, 'Materia prima'),
 (2, 'Material'),
 (3, 'Producto');

INSERT INTO segmento (id_segmento, descripcion) VALUES
 (1, 'Materiales peligrosos'),
 (2, 'Suministros y repuestos'),
 (3, 'Insumos y etiquetas'),
 (4, 'No aplica');

INSERT INTO elemento_catalogo_tipo (id_elemento_catalogo_tipo, id_elemento_produccion, id_segmento, descripcion) VALUES
 (11, 1, 3, 'Especias y condimentos'),
 (12, 1, 3, 'Aditivos alimentarios'),
 (13, 1, 3, 'Aceites y grasas'),
 (14, 1, 3, 'Harinas'),
 (15, 1, 3, 'Huevos'),
 (16, 1, 3, 'Conservantes'),
 (17, 1, 3, 'Colorantes'),
 (18, 1, 3, 'Emulsionantes'),
 (19, 1, 3, 'Otras materias primas'),
 (21, 2, 2, 'Herramientas'),
 (22, 2, 2, 'Repuestos'),
 (23, 2, 1, 'Químicos'),
 (24, 2, 1, 'Detergentes industriales'),
 (25, 2, 3, 'Etiquetas'),
 (26, 2, 2, 'Otros materiales'),
 (31, 3, 4, 'Pollo congelado'),
 (32, 3, 4, 'Pollo fresco'),
 (33, 3, 4, 'Saborizado');

INSERT INTO ruta_tipo (cod_ruta_tipo,descripcion) VALUES
 ( 1, 'Urbana'),
 ( 2, 'Rural');

INSERT INTO empleado_cargo( cod_empleado_cargo, descripcion ) VALUES
 ( 1, 'Supervisor de Almacén'),
 ( 2, 'Encargado de almacén'),
 ( 3, 'Asistente operativo'),
 ( 4, 'Almacenero'),
 ( 5, 'Transportista'),
 ( 6, 'Técnico de almacén'),
 ( 7, 'Supervisor de producción'),
 ( 8, 'Técnico de mantenimiento');

INSERT INTO transportista_estado (cod_estado_transportista,descripcion) VALUES
 ( 'D', 'Disponible'),
 ( 'N', 'No disponible'),
 ( 'C', 'Cuarentena');

INSERT INTO licencia_tipo (cod_tipo_licencia,descripcion) VALUES
 ( 'X', 'A-IIb'),
 ( 'Y', 'A-IIIb');

INSERT INTO operacion_tipo (cod_tipo_operacion, descripcion) VALUES
 (1, 'Picking'),
 (2, 'Precintado'),
 (3, 'Paletizado'),
 (4, 'Carga'),
 (5, 'Salida'),
 (6, 'Recepción'),
 (7, 'Descarga');

INSERT INTO local_tipo (cod_local_tipo,descripcion) VALUES
 ( 1, 'Almacén'),
 ( 2, 'Recepción'),
 ( 3, 'Venta'),
 ( 4, 'Distribuidora');

INSERT INTO local_region (cod_local_region,descripcion) VALUES
  (1, 'Amazonas'),
  (2, 'Áncash'),
  (3, 'Apurímac'),
  (4, 'Arequipa'),
  (5, 'Ayacucho'),
  (6, 'Cajamarca'),
  (7, 'Callao'),
  (8, 'Cusco'),
  (9, 'Huancavelica'),
  (10, 'Huánuco'),
  (11, 'Ica'),
  (12, 'Junín'),
  (13, 'La Libertad'),
  (14, 'Lambayeque'),
  (15, 'Lima'),
  (16, 'Loreto'),
  (17, 'Madre de Dios'),
  (18, 'Moquegua'),
  (19, 'Pasco'),
  (20, 'Piura'),
  (21, 'Puno'),
  (22, 'San Martín'),
  (23, 'Tacna'),
  (24, 'Tumbes'),
  (25, 'Ucayali');

INSERT INTO local_distrito (cod_local_distrito, descripcion) VALUES
  (1, 'Ancón'),
  (2, 'Ate'),
  (3, 'Barranco'),
  (4, 'Breña'),
  (5, 'Carabayllo'),
  (6, 'Chaclacayo'),
  (7, 'Chorrillos'),
  (8, 'Cieneguilla'),
  (9, 'Comas'),
  (10, 'El Agustino'),
  (11, 'Independencia'),
  (12, 'Jesús María'),
  (13, 'La Molina'),
  (14, 'La Victoria'),
  (15, 'Lima'),
  (16, 'Lince'),
  (17, 'Los Olivos'),
  (18, 'Lurigancho-Chosica'),
  (19, 'Lurín'),
  (20, 'Magdalena del Mar'),
  (21, 'Miraflores'),
  (22, 'Pachacámac'),
  (23, 'Pucusana'),
  (24, 'Pueblo Libre'),
  (25, 'Puente Piedra'),
  (26, 'Punta Hermosa'),
  (27, 'Punta Negra'),
  (28, 'Rímac'),
  (29, 'San Bartolo'),
  (30, 'San Borja'),
  (31, 'San Isidro'),
  (32, 'San Juan de Lurigancho'),
  (33, 'San Juan de Miraflores'),
  (34, 'San Luis'),
  (35, 'San Martín de Porres'),
  (36, 'San Miguel'),
  (37, 'Santa Anita'),
  (38, 'Santa María del Mar'),
  (39, 'Santa Rosa'),
  (40, 'Santiago de Surco'),
  (41, 'Surquillo'),
  (42, 'Villa El Salvador'),
  (43, 'Villa María del Triunfo'),
  (44, 'Huaral'),
  (45, 'Ventanilla'),
  (46, 'Callao');

INSERT INTO paradero_tipo (cod_paradero_tipo,descripcion) VALUES
  ( 1,  'Origen'),
  ( 2,  'Paradero'),
  ( 3,  'Destino');

INSERT INTO pedido_tipo (cod_pedido_tipo,tipo_pedido) VALUES
  ('A', 'Abastecimiento'),
  ('V', 'Venta');

INSERT INTO pedido_estado (cod_pedido_estado, estado_pedido) VALUES
  ('A', 'Aceptado'),
  ('R', 'Rechazado'),
  ('P', 'En proceso'),
  ('F', 'Finalizado');

INSERT INTO incidencia_tipo (cod_tipo_incidencia,descripcion) VALUES
  ( 'A',  'Incidencia de tipo A: retrasos en la entrega'),
  ( 'B',  'Incidencia de tipo B: errores en el etiquetado o embalaje'),
  ( 'C',  'Incidencia de tipo C: fallas en la documentación'),
  ( 'D',  'Incidencia de tipo D: problemas mecánicos con el vehículo'),
  ( 'E',  'Incidencia de tipo E: error en la asignación de ruta');

INSERT INTO incidencia_estado (cod_estado_incidencia,descripcion) VALUES
  ( 'S',  'Solucionado'),
  ( 'P',  'Pendiente');    

INSERT INTO procedimiento_tipo (cod_tipo_procedimiento,descripcion) VALUES
  ( 'A',  'Procedimiento de tipo A: retrasos en la entrega'),
  ( 'B',  'Procedimiento de tipo B: errores en el etiquetado o embalaje'),
  ( 'C',  'Procedimiento de tipo C: fallas en la documentación'),
  ( 'D',  'Procedimiento de tipo D: problemas mecánicos con el vehículo'),
  ( 'E',  'Procedimiento de tipo E: error en la asignación de ruta');

INSERT INTO norma_tipo (cod_norma_tipo,descripcion) VALUES
  ( 'X',  'NTP 209.027'),
  ( 'Y',  'ISO 17712'),
  ( 'Z',  'ISO 22000'),
  ( 'W',  'ISO 9001');

INSERT INTO accion_tipo (cod_tipo_accion,descripcion) VALUES
  ('I', 'Investigación'),
  ('E', 'Evaluación'),
  ('R', 'Resarcimiento'),
  ('C', 'Correción');

INSERT INTO reclamo_tipo (cod_tipo_reclamo,descripcion) VALUES
  ( 'A', 'Productos en mal estado o de calidad inferior'),
  ( 'B', 'Cantidad incorrecta de productos recibidos'),
  ( 'C', 'Productos incorrectos o diferentes a los solicitados'),
  ( 'D', 'Embalaje inadecuado que afecta la frescura o la calidad de los productos'),
  ( 'E', 'Retraso en la entrega del pedido'),
  ( 'F', 'Problemas con la facturación o el proceso de pago'),
  ( 'G', 'Problemas relacionados con la limpieza, higiene o seguridad de los productos');

INSERT INTO estado_reclamo (cod_estado_reclamo,descripcion) VALUES
  ( 'A',  'Pendiente'),
  ( 'B', 'En Proceso'),
  ( 'C',   'Resuelto'),
  ( 'D',  'Rechazado');

INSERT INTO nivel_urgencia (cod_nivel_urgencia,descripcion) VALUES
  ( 'B',  'Baja'),
  ( 'M', 'Media'),
  ( 'A',  'Alta');

INSERT INTO evidencia_tipo (cod_tipo_evidencia,descripcion) VALUES
  ( 'C',   'Captura Pantalla'),
  ( 'D',          'Documento'),
  ( 'E',            'Escaneo'),
  ( 'F',         'Fotografía'),
  ( 'G', 'Grabación de audio'),
  ( 'T', 'Testimonio escrito'),
  ( 'V',              'Video');

INSERT INTO archivo_tipo (cod_tipo_archivo, descripcion) VALUES
  ( 1,  'AAC'),
  ( 2,  'AVI'),
  ( 3,  'BMP'),
  ( 4,  'CSV'),
  ( 5, 'DOCX'),
  ( 6, 'FLAC'),
  ( 7,  'GIF'),
  ( 8,  'JPG'),
  ( 9,  'MKV'),
  (10,  'MOV'),
  (11,  'MP3'),
  (12,  'MP4'),
  (13,  'OGG'),
  (14,  'PDF'),
  (15,  'PNG'),
  (16, 'PPTX'),
  (17,  'RTF'),
  (18, 'TIFF'),
  (19,  'TXT'),
  (20,  'WAV'),
  (21, ' WMV'),
  (22, 'XLSX');


INSERT INTO reporte_frecuencia (cod_reporte_frecuencia,descripcion,cantidad_tiempo,unidad_tiempo) VALUES
  ( 1,  'Diario'    ,         1,  'dia'),
  ( 2,  'Semanal'   ,         7,  'dia'), 
  ( 3,  'Quincenal' ,         15, 'dia'),
  ( 4,  'Mensual'   ,         1,  'mes'),
  ( 5,  'Trimestral',         3,  'mes'),
  ( 6,  'Semestral' ,         6,  'mes'),
  ( 7,  'Prueba (5 seg)'    , 5,  'segundo');

INSERT INTO reporte_formato (cod_reporte_formato,descripcion) VALUES
  ( 1,  'docx'),
  ( 2,  'pdf'), 
  ( 3,  'xlsx'),
  ( 4,  'csv');

INSERT INTO reporte_tipo (cod_reporte_tipo,descripcion) VALUES
  ( 1,  'General'),
  ( 2,  'Reclamos'), 
  ( 3,  'Pedidos'),
  ( 4,  'Almacen'),
  ( 5,  'Seguimiento');

INSERT INTO reporte_estado (cod_reporte_estado,descripcion) VALUES
  ( 1,  'Activo'),
  ( 2,  'Inactivo');  

INSERT INTO persona(cod_estado_civil, cod_nacionalidad, cod_genero, dni, primer_apellido, segundo_apellido, prenombre, direccion ) VALUES
  ( 1,  1,  1,  '77688137',   'López',       'García',     'Juan',      'AV BENAVIDES 1015 MIRAFLORES, Lima'),
  ( 1,  1,  1,  '52359123',   'Mendoza',     'Mendoza',    'Luis',      'Av. Alameda Del Corregidor 3023, Lima'),
  ( 1,  1,  1,  '76464764',   'Rodríguez',   'Valdés',     'Pedro',     'Avenida Heroes Del Cenepa, Lt. 120, Lima'),
  ( 2,  1,  2,  '46729764',   'Martínez',    'Perez',      'Ana',       '2450, Of. 602, Edificio El Dorado, Lima, Trujillo'),
  ( 1,  1,  1,  '79641337',   'Hernández',   'Flores',     'Luis',      'Avenida Los Alamos 345, Chiclayo'),
  ( 3,  1,  2,  '45424873',   'González',    'Martinez',   'Laura',     'Santa Iluminata, Mz. A Lt. 6, Lima'),
  ( 1,  1,  1,  '73283354',   'Ramírez',     'Ramírez',    'Carlos',    'AV DOLORES 119, JOSE LUIS BUSTAMANTE Y RIVERO, Lima'),
  ( 3,  1,  2,  '43783734',   'Vargas',      'Guerrero',   'Diana',     'Avenida Los Cerezos 234, Iquitos'),
  ( 2,  1,  1,  '45373782',   'Paredes',     'Osvaldo',    'Roberto',   'Calle Las Palmeras 567, Tacna'),
  ( 1,  1,  2,  '43787671',   'Torres',      'Lopez',      'Sandra',    'Avenida Los Pinos 890, Puno'),
  ( 2,  1,  1,  '78978464',   'Pérez',       'Alvarez',    'Juan',      'Calle Víctor Reynel, 766, Lima'),
  ( 3,  1,  2,  '75696723',   'García',      'Ruiz',       'Ana',       'Cl 2 Lt 17, Bellavista, Callao'),
  ( 5,  1,  1,  '45396782',   'Rodríguez',   'Jiménez',    'Pedro',     'Cl De La Colina, Narciso Nro 911, Lima'),
  ( 2,  1,  2,  '16786781',   'Fernández',   'Hernández',  'Laura',     'Avenida Trinidad Morán, Mz. J Lt. 2 León Xvi, Arequipa'),
  ( 1,  1,  1,  '16877361',   'Gómez',       'Quispe',     'Miguel',    'Gutiérrez De La Fuente,119,Iv Centenario, Arequipa'),
  ( 2,  1,  2,  '16786455',   'Díaz',        'Navarro',    'Elena',     'LT 25, URB MANUEL AREVALO ETAPA III, LA ESPERANZA, La Libertad'),
  ( 1,  1,  1,  '74524324',   'Sánchez',     'Pérez',      'David',     'AV 13 DE NOVIEMBRE 994 OF 202, EL TAMBO, Junin'),
  ( 4,  1,  2,  '43787353',   'Martín',      'Velázquez',  'Sara',      'Jirón Moquegua, 140, Huanuco'),
  ( 1,  1,  1,  '65775732',   'Ruiz',        'Ruíz',       'Javier',    'Calle Santa Catalina, 384, Cuzco'),
  ( 2,  1,  2,  '86876711',   'Gutiérrez',   'Arroyo',     'Paula',     'AV NICOLAS DE PIEROLA 1518, LA ESPERANZA, La Libertad'),
  ( 3,  1,  1,  '14242781',   'López',       'Cruzado',    'Daniel',    'Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa'),
  ( 2,  1,  2,  '42343272',   'Hernández',   'Flores',     'Lucía',     'CA SANTA MARTA 302 INT 25, AREQUIPA, Arequipa'),
  ( 1,  1,  1,  '78943713',   'Pérez',       'Espinoza',   'Alejandro', 'Av Joaquín Madrid Nro 141, Lima'),
  ( 1,  1,  1,  '78567231',   'Sánchez',     'Chávez',     'David',     'Jirón Sinchi Roca, 310, 376, La Libertad'),
  ( 2,  1,  2,  '20220002',   'Martín',      'Cruz',       'Sara',      'Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa');

INSERT INTO cliente (cod_cliente_tipo, cod_cliente_estado, nombre , ruc , razon_social, fecha_registro) VALUES
  ('I', 'A',   'Almacen', '20100154308','SAN FERNANDO S.A.', '2002-06-01'),
  ('I', 'A' ,'Atencion al cliente' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'),
  ('I', 'A' ,'Produccion' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'),
  ('I', 'A' ,'Mantenimiento' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'),
  ('E', 'A' ,'PLAZA VEA' , '20100070970', 'SOCIEDAD ANONIMA O S.P.S.A.', '2023-05-15'),
  ('E', 'A' ,'Tottus Hipermercado-Tottus' , '20508565934', 'HIPERMERCADOS TOTTUS S.A', '2022-11-28'),
  ('E', 'A' ,'Wong & Metro' , '20109072177', 'Cencosud Retail Peru S.A.', '2023-07-03'),
  ('E', 'A' ,'Kentucky Fried Chicken' , '20100123330', 'DELOSI S.A.', '2022-10-12'),
  ('E', 'A' ,'Pardos Chicken-Planet-Pasquale' , '20510885229', 'SANGUCHES DEL PERU S.A.C', '2024-01-25'),
  ('E', 'A' ,'Rockys' , '20513427710', 'Grupo Rokys S.A.C.', '2023-03-08');

INSERT INTO ubicacion (longitud, latitud) VALUES
  (-11.556595, -77.203523),
  (-11.501818, -77.226304),
  (-11.872139, -77.127159),
  (-11.866499, -77.073656),
  (-11.518728, -77.205331),
  (-11.547767, -77.203855),
  (-11.593654, -77.201504),
  (-11.728288, -77.165746),
  (-11.834073, -77.112874),
  (-11.928733, -77.072607),
  (-12.007750, -77.056319),
  (-11.993166, -77.063375),
  (-12.059688, -77.041633),
  (-12.089659, -77.023307),
  (-12.028432, -77.084411),
  (-12.058004, -77.037207),
  (-12.051560, -77.031446),
  (-12.173548, -76.990706),
  (-12.004222, -77.093759),
  (-12.034577, -77.047632),
  (-12.072477, -77.065383),
  (-12.072888, -77.008987),
  (-12.049493, -77.112024),
  (-12.006146, -77.001076),
  (-12.180751, -77.002283),
  (-12.169918, -77.023956),
  (-11.933034, -77.054910),
  (-12.086610, -77.033145);

INSERT INTO ticket (fecha_entrega) VALUES
  ('2019-04-27'),
  ('2021-04-22'),
  ('2022-01-20'),
  ('2022-01-22'),
  ('2022-05-22'),
  ('2022-11-18'),
  ('2023-01-20'),
  ('2023-01-22'),
  ('2023-03-20'),
  ('2023-04-20'),
  ('2023-05-20'),
  ('2023-05-22'),
  ('2023-06-20'),
  ('2023-09-16'),
  ('2023-11-22'),
  ('2023-12-19'),
  ('2024-01-22'),
  ('2024-02-22'),
  ('2024-04-20'),
  ('2024-04-22');

INSERT INTO vehiculo (cod_vehiculo_estado,cod_vehiculo_modelo,anio_fabricacion, capacidad_carga, fecha_ultimo_mantenimiento,cod_pedido_tipo,fecha_ultimo_viaje, hora_ultimo_viaje,placa) VALUES
  ('D', 'F', 2008, 850, '2022-01-10','A','2024-01-24','04:53:21', 'A4E-123'),
  ('N', 'C', 2009, 620.5, '2023-02-12','A','2024-02-24','04:53:21','D3F-756'),
  ('C', 'S', 2020, 440.2, '2022-03-05','V','2024-03-15','04:53:21','G5I-789'), 
  ('D', 'S', 2015, 550, '2021-04-08','V','2024-04-14','04:53:21', 'J4L-223'),
  ('N', 'F', 2012, 650, '2023-05-15','A','2024-05-27','04:53:21','M9O-456'),
  ('C', 'C', 2021, 600, '2023-06-02','V','2024-06-24', '04:53:21','P3R-789'),
  ('C', 'S', 2006, 620.4, '2021-07-18','A','2024-07-24','04:53:21','S5U-123'),
  ('D', 'F', 2017, 620.2, '2022-08-10','V','2024-08-24','04:53:21','V4X-456'),
  ('N', 'F', 2020, 220, '2023-09-05','V','2024-09-05','04:53:21','Y7A-789'),
  ('C', 'C', 2018, 430, '2022-10-15','A','2024-10-22','04:53:21','B8D-413');

INSERT INTO elemento_catalogo (nombre, id_elemento_catalogo_tipo, descripcion, cod_unidad, temperatura_maxima, temperatura_minima, vida_util, peso_unitario) VALUES
  ('Filete de pechuga de pollo San Fernando congelado', 31, 'Filete de pechuga de pollo San Fernando congelado, listo para su uso en la preparación de platos.', 7, -18, -20, 90, 900),
  ('Pierna de pollo San Fernando congelada', 31, 'Pierna de pollo San Fernando congelada, perfecta para su uso en la elaboración de diversos platos.', 7, -18, -20, 90, 1200),
  ('Ala de pollo San Fernando congelada', 31, 'Ala de pollo San Fernando congelada, ideal para recetas fáciles y deliciosas.', 7, -18, -20, 90, 800),
  ('Muslo de pollo San Fernando congelado', 31, 'Muslo de pollo San Fernando congelado, versátil y sabroso para preparaciones culinarias.', 7, -18, -20, 90, 1000),
  ('Pechuga entera de pollo San Fernando congelada', 31, 'Pechuga entera de pollo San Fernando congelada, fresca y de alta calidad para diversas recetas.', 7, -18, -20, 90, 1500),
  ('Pierna con encuentro San Fernando fresca', 32, 'Pierna con encuentro de pollo San Fernando fresca, perfecta para asados y platos principales.', 7, 0, -2, 7, 1300),
  ('Muslo de pollo San Fernando fresco', 32, 'Muslo de pollo San Fernando fresco, jugoso y listo para su uso en una amplia variedad de platos.', 7, 0, -2, 7, 1100),
  ('Pechuga especial de pollo San Fernando fresca', 32, 'Pechuga especial de pollo San Fernando fresca, de la más alta calidad para platos gourmet.', 7, 0, -2, 7, 1200),
  ('Pechuga entera de pollo San Fernando fresca', 32, 'Pechuga entera de pollo San Fernando fresca, versátil y perfecta para diversas preparaciones culinarias.', 7, 0, -2, 7, 1400),
  ('Carne molida de pollo San Fernando fresca', 32, 'Carne molida de pollo San Fernando fresca, ideal para hamburguesas, albóndigas y más.', 7, 0, -2, 7, 900),
  ('Especias y condimentos Jardín del Sabor para pollo', 11, 'Mezcla de especias y condimentos Jardín del Sabor especialmente seleccionados para realzar el sabor del pollo.', 2, NULL, NULL, 180, 80),
  ('Aceite de oliva Aceitunas del Sur para cocinar', 13, 'Aceite de oliva Aceitunas del Sur de alta calidad, perfecto para cocinar y aderezar platos.', 4, NULL, NULL, 365, 1000),
  ('Harina de trigo Trigomar para empanizar', 14, 'Harina de trigo Trigomar ideal para empanizar y darle un acabado crujiente a tus platillos favoritos.', 2, NULL, NULL, 180, 500),
  ('Huevo fresco Granja Real para rebozar', 15, 'Huevo fresco Granja Real para rebozar y darle un toque especial a tus recetas.', 7, NULL, NULL, 30, 50),
  ('Conservante natural Biolife para prolongar la vida útil del producto', 16, 'Conservante natural Biolife para prolongar la vida útil del producto, sin aditivos artificiales.', 2, NULL, NULL, 365, 30),
  ('Colorante natural Chroma para mejorar la apariencia del producto', 17, 'Colorante natural Chroma para mejorar la apariencia del producto, seguro y confiable.', 2, NULL, NULL, 365, 20),
  ('Emulsionante Quality para mejorar la textura del producto', 18, 'Emulsionante Quality para mejorar la textura del producto, ideal para aplicaciones culinarias.', 2, NULL, NULL, 365, 40),
  ('Detergente SuperClean', 23, 'Detergente SuperClean para uso industrial, ideal para limpieza profunda y desengrase de equipos y superficies.', 3, NULL, NULL, NULL, 1000),
  ('Escritorio de oficina', 19, 'Escritorio de oficina, ideal para el área de almacén.', 7, NULL, NULL, NULL, 30000),
  ('Silla ergonómica', 21, 'Silla ergonómica para atención al cliente, cómoda y resistente.', 7, NULL, NULL, NULL, 8000),
  ('Ordenador portátil', 21, 'Ordenador portátil para el área de atención al cliente.', 7, NULL, NULL, NULL, 2000),
  ('Rollos de papel térmico para impresora', 21, 'Rollos de papel térmico para impresora en el área de atención al cliente.', 8, NULL, NULL, NULL, 500),
  ('Herramientas de mano básica', 21, 'Herramientas de mano básica para el área de mantenimiento.', 7, NULL, NULL, NULL, 1000),
  ('Teléfono multifuncional', 21, 'Teléfono multifuncional para el área de atención al cliente.', 7, NULL, NULL, NULL, 1500),
  ('Estanterías metálicas', 21, 'Estanterías metálicas para el área de almacén.', 7, NULL, NULL, NULL, 20000),
  ('Mascarillas', 21, 'Mascarillas para el área de producción.', 9, NULL, NULL, NULL, 200),
  ('Caja registradora', 21, 'Caja registradora para el área de atención al cliente.', 7, NULL, NULL, NULL, 5000),
  ('Repuestos para maquinaria industrial', 21, 'Repuestos para maquinaria industrial en el área de mantenimiento.', 7, NULL, NULL, NULL, 300),
  ('Guantes Latex', 21, 'Guantes Latex para el área de producción.', 9, NULL, NULL, NULL, 100),
  ('Carretilla elevadora', 21, 'Carretilla elevadora para el área de almacén.', 7, NULL, NULL, NULL, 150000),
  ('Indumentaria de protección', 21, 'Indumentaria de protección para el área de producción.', 7, NULL, NULL, NULL, 500),
  ('Cámara de seguridad', 21, 'Cámara de seguridad para el área de almacén.', 7, NULL, NULL, NULL, 3000),
  ('Gorros Hipotérmicos', 21, 'Gorros Hipotérmicos para el área de producción.', 7, NULL, NULL, NULL, 150),
  ('Impresora de etiquetas', 21, 'Impresora de etiquetas para el área de almacén.', 7, NULL, NULL, NULL, 8000),
  ('Kit de herramientas eléctricas', 21, 'Kit de herramientas eléctricas para el área de mantenimiento.', 7, NULL, NULL, NULL, 3000),
  ('Material de embalaje', 21, 'Material de embalaje para el área de almacén.', 7, NULL, NULL, NULL, 2000);

INSERT INTO ruta (distancia_total, cod_ruta_tipo, duracion) VALUES
  ( 70.9, 1, 2.4),
  ( 23.5, 1, 0.8),
  ( 12.3, 1, 0.4),
  ( 70.9, 1, 2.4),
  ( 5.6, 1, 0.2),
  ( 11.2, 1, 0.4),
  ( 23, 1, 0.8),
  ( 16.4, 1, 0.5),
  ( 7.3, 1, 0.2),
  ( 34.8, 1, 1.2);

INSERT INTO empleado(cod_cliente, cod_persona, cod_empleado_cargo, fecha_contrato ) VALUES
  ( 1, 11, 1, '2021-04-09'),
  ( 1, 12, 1, '2021-06-17'),
  ( 1, 13, 2, '2022-03-20'),
  ( 1, 14, 3, '2021-01-20'),
  ( 1, 15, 4, '2022-01-07'),
  ( 1, 16, 5, '2021-08-09'),
  ( 1, 17, 6, '2021-11-06'),
  ( 1, 18, 6, '2021-07-09'),
  ( 3, 19, 7, '2021-01-09'),
  ( 4, 20, 8, '2021-02-09'),
  ( 4, 21, 3, '2021-05-18'),
  ( 1, 22, 5, '2021-05-18'),
  ( 1, 23, 5, '2021-05-18');

INSERT INTO transportista (cod_empleado,cod_estado_transportista,cod_tipo_licencia, num_licencia, fecha_vencimiento_licencia,fecha_ultimo_traslado) VALUES
  ( 6,  'D', 'X','E567890', '2027-01-23', '2024-04-15'),
  ( 12, 'N', 'Y','R487236','2025-01-08', '2024-04-24');

INSERT INTO representante (num_telefono,correo_empresarial,cargo,cod_cliente,cod_persona) VALUES
  ( '(+51) 943 567 890',              'juan.lopez@sanfernando.com',                 'Gerente de Almacén',  1,  1),
  ( '(+51) 976 345 678',            'diana.vargas@sanfernando.com', 'Supervisora de Atención al Cliente',  2,  2),
  ( '(+51) 983 912 345',         'roberto.paredes@sanfernando.com',              'Gerente de Producción',  3,  3),
  ( '(+51) 944 567 891',           'sandra.torres@sanfernando.com',       'Supervisora de Mantenimiento',  4,  4),
  ( '(+51) 981 234 567',  'luis.mendoza@supermercadosperuanos.com',               'Supervisor de Ventas',  5,  5),
  ( '(+51) 957 890 123', 'pedro.rodriguez@hipermercadostottus.com',                 'Gerente de Compras',  6,  6),
  ( '(+51) 992 456 789',     'ana.martinez@CencosudRetailPeru.com',           'Supervisora de Logística',  7,  7),
  ( '(+51) 945 678 901',               'luis.hernandez@delosi.com',             'Gerente de Operaciones',  8,  8),
  ( '(+51) 965 123 456',     'laura.gonzalez@sanguchesdelperu.com',             'Supervisora de Compras',  9,  9),
  ( '(+51) 954 789 012',           'carlos.ramirez@gruporokys.com',               'Gerente de Logística', 10, 10);

INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, fecha, hora_inicio, hora_fin, cod_tipo_operacion) VALUES
  (NULL, 1, 4, '2024-04-01', '08:00:00', '08:30:00', 1),
  (1, 1, 4, '2024-04-01', '08:45:00', '09:15:00', 2),
  (1, 1, 4, '2024-04-01', '09:30:00', '10:30:00', 3),
  (1, 1, 4, '2024-04-01', '10:45:00', '11:15:00', 4),
  (1, 1, 4, '2024-04-01', '11:30:00', '12:00:00', 5),
  (1, 1, 4, '2024-04-01', '14:00:00', '14:30:00', 6),
  (NULL, 13, 4, '2024-04-02', '08:00:00', '08:35:00', 1),
  (7, 13, 4, '2024-04-02', '08:45:00', '09:15:00', 2),
  (7, 13, 4, '2024-04-02', '09:30:00', '10:30:00', 3),
  (7, 13, 4, '2024-04-02', '10:45:00', '11:15:00', 4),
  (7, 13, 4, '2024-04-02', '11:30:00', '12:00:00', 5),
  (7, 1, 4, '2024-04-02', '17:00:00', '17:18:00', 6),
  (NULL, 13, 4, '2024-04-02', '09:15:00', '09:30:00', 1),
  (13, 12, 4, '2024-04-02', '09:42:00', '10:10:00', 2),
  (13, 12, 4, '2024-04-02', '10:20:00', '11:10:00', 3),
  (13, 12, 4, '2024-04-02', '12:15:00', '12:05:00', 4),
  (13, 12, 4, '2024-04-02', '12:20:00', '12:56:00', 5),
  (13, 1, 4, '2024-04-02', '18:20:00', '18:56:00', 6),
  (NULL, 13, 4, '2024-04-02', '10:00:00', '10:35:00', 1),
  (19, 13, 4, '2024-04-02', '10:45:00', '10:15:00', 2),
  (19, 13, 4, '2024-04-02', '10:30:00', '11:30:00', 3),
  (19, 13, 4, '2024-04-02', '11:45:00', '12:15:00', 4),
  (19, 13, 4, '2024-04-02', '12:30:00', '13:00:00', 5),
  (19, 1, 4, '2024-04-02', '18:20:00', '18:56:00', 6);

INSERT INTO mercancia (id_operacion_picking, nro_precinto, peso_total) VALUES
  (1, '00002202404010800011', 12000),
  (1, '00002202404010800023', 7500),
  (1, '00002202404010800044', 5500),
  (7, '00008202404020800055', 13500),
  (7, '00008202404020800067', 15000),
  (13, '00014202404020900087', 750),
  (13, '00014202404020900098', 600),
  (19, '00020202404021000019', 18000),
  (19, '00020202404021000021', 16500);

INSERT INTO stock (cod_stock, id_elemento_catalogo, nro_lote, fecha_caducidad, cantidad_disponible) VALUES
  ( '00001-00001-00123', 1, 123, '2024-04-01', 1000),
  ( '00002-00002-00124', 2, 124, '2024-04-02', 2000),
  ( '00003-00003-00125', 3, 125, '2024-04-03', 5000),
  ( '00004-00004-00126', 4, 126, '2024-04-04', 3000),
  ( '00005-00005-00127', 5, 127, '2024-04-05', 4000),
  ( '00006-00006-00128', 6, 128, '2024-04-06', 6000),
  ( '00007-00007-00129', 7, 129, '2024-04-07', 7000),
  ( '00008-00008-00130', 8, 130, '2024-04-08', 8000),
  ( '00009-00009-00131', 9, 131, '2024-04-09', 9000),
  ( '00010-00001-00132', 1, 132, '2024-04-10', 2500),
  ( '00011-00011-00223', 11, 223, '2024-04-01', 1000),
  ( '00012-00011-00224', 11, 224, '2024-04-02', 2000),
  ( '00013-00012-00225', 12, 225, '2024-04-03', 1000),
  ( '00014-00012-00226', 12, 226, '2024-04-04', 1050),
  ( '00015-00013-00227', 13, 227, '2024-04-05', 1010),
  ( '00016-00014-00228', 14, 228, '2024-04-06', 1000),
  ( '00017-00015-00229', 15, 229, '2024-04-07', 8000),
  ( '00018-00016-00230', 16, 230, '2024-04-08', 7000),
  ( '00019-00017-00231', 17, 231, '2024-04-09', 3000),
  ( '00020-00010-00232', 10, 232, '2024-04-10', 4000),
  ( '00021-00009-00233', 9, 233, '2024-04-11', 1500),
  ( '00022-00008-00234', 8, 234, '2024-04-12', 1700),
  ( '00023-00007-00235', 7, 235, '2024-04-13', 1600),
  ( '00024-00007-00236', 7, 236, '2024-04-14', 1200),
  ( '00025-00007-00237', 7, 237, '2024-04-15', 1030);

INSERT INTO traslado (cod_guia_remision, cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia, id_operacion_termina) VALUES
  ('000012024040111301200', 2, 2, 2, 5, 6),
  ('000022024040211301200', 3, 3, 2, 11, 12),
  ('000032024040212201256', 3, 3, 1, 17, 18),
  ('000042024040212301300', 3, 3, 2, 23, 24);

INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES
  (1, 1, 10),
  (1, 2, 5),
  (1, 3, 15),
  (2, 4, 10),
  (2, 5, 5),
  (3, 6, 10),
  (3, 7, 5),
  (4, 8, 10),
  (4, 9, 5),
  (4, 10, 15),
  (5, 11, 10),
  (5, 12, 5),
  (5, 13, 15),
  (6, 14, 10),
  (6, 15, 5),
  (6, 16, 15),
  (7, 17, 10),
  (7, 18, 5),
  (7, 19, 15),
  (8, 20, 10),
  (8, 21, 5),
  (8, 22, 15),
  (9, 23, 10),
  (9, 24, 5),
  (9, 25, 15);

INSERT INTO detalle_ticket_producto (cod_ticket, id_elemento_catalogo, cantidad) VALUES
  (1, 25, 5),
  (1, 19, 2),
  (1, 30, 10),
  (2, 27, 2),
  (3, 20, 6),
  (3, 24, 3),
  (4, 36, 100),
  (4, 32, 1),
  (5, 31, 15),
  (5, 29, 12),
  (6, 33, 12),
  (7, 35, 5),
  (8, 28, 20),
  (8, 23, 2),
  (9, 34, 4),
  (10, 2, 1000),
  (11, 3, 1000),
  (12, 5, 1000),
  (13, 6, 1000),
  (14, 4, 1000),
  (15, 4, 1000),
  (16, 7, 1000),
  (16, 11, 1000),
  (17, 18, 50),
  (18, 1, 1000),
  (18, 15, 1000),
  (19, 9, 1000),
  (20, 14, 1000);

INSERT INTO detalle_ticket_traslado (cod_ticket, id_traslado) VALUES
	(1, 1),
	(1, 2),
	(2, 1),
	(3, 1),
	(3, 2),
	(4, 1),
	(4, 2),
	(4, 3 ),
	(5, 1),
	(6, 2),
	(7, 3),
	(8, 3),
	(9, 3),
	(10, 2),
	(11,1),
	(11, 3),
	(12, 2),
	(13, 1),
	(14, 2),
	(15, 4),
	(16, 4),
	(16, 1),
	(17, 4),
	(18, 4),
	(18, 1),
	(19, 4),
	(20, 4);

INSERT INTO gps (cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) VALUES
  ( 1, 4, '2024-04-20', '04:53:21'),
  ( 15, 4, '2024-04-20', '09:10:53'),
  ( 17, 4, '2024-04-20', '11:33:14'),
  ( 18, 4, '2024-04-20', '13:45:11'),
  ( 1, 7, '2024-04-22', '05:13:55'),
  ( 5, 7, '2024-04-22', '07:34:25'),
  ( 4, 7, '2024-04-22', '10:45:30'),
  ( 8, 7, '2024-04-22', '11:20:10'),
  ( 12, 7, '2024-04-22', '11:54:31'),
  ( 10, 7, '2024-04-22', '12:29:30'),
  ( 13, 7, '2024-04-22', '13:04:10'),
  ( 14, 7, '2024-04-22', '13:38:50');

INSERT INTO local (cod_cliente, cod_ubicacion, pais, cod_local_region, cod_local_distrito, calle, numero, cod_local_tipo) VALUES
  ( 1, 1, 'PER', 15, 44, 'Panamericana Norte', NULL, 1),
  ( 8, 2, 'PER', 15, 44, 'Av. El Solar', NULL, 2),
  ( 8, 3, 'PER', 7, 45, 'Av. Néstor Gambetta', 7036, 2),
  ( 8, 4, 'PER', 15, 25, 'Av. Puente Piedra', 266, 2),
  ( 7, 10, 'PER', 15, 11, 'Av. Tomás Valle', 1400, 2),
  ( 6, 12, 'PER', 15, 11, 'Av. Alfredo Mendiola', 3698, 2),
  ( 2, 15, 'PER', 15, 15, 'Jr. Iquitos', 347, 3),
  ( 10, 16, 'PER', 15, 15, 'Av. España', 1337, 2),
  ( 2, 17, 'PER', 15, 15, 'Jr. Puno', 370, 4),
  ( 3, 18, 'PER', 15, 7, 'C. Constelación Austral', 135, 1),
  ( 2, 19, 'PER', 15, 35, 'Tomas Cochrane', NULL, 4),
  ( 2, 20, 'PER', 15, 35, 'Jr. Mártir Olaya', 413, 4),
  ( 2, 21, 'PER', 15, 24, 'Av. Simón Bolívar', 1149, 4),
  ( 2, 22, 'PER', 15, 15, 'Jr. 3 de Febrero', 1234, 4),
  ( 2, 23, 'PER', 7, 46, 'Av. Argentina', 3093, 3),
  ( 2, 24, 'PER', 15, 32, 'Av. 13 de Enero', 1592, 4),
  ( 3, 25, 'PER', 15, 7, 'Av. Los Faisanes', 179, 1),
  ( 2, 26, 'PER', 15, 7, 'Jr. Justo Naveda', 136, 4),
  ( 2, 27, 'PER', 15, 9, 'Av. Universitaria', 7718, 3),
  ( 2, 28, 'PER', 15, 16, 'Av. Petit Thouars', 2260, 3);

INSERT INTO paradero (cod_ruta, cod_local, cod_paradero_tipo, orden) VALUES
  ( 1, 1, 1, 1),
  ( 1, 2, 2, 2),
  ( 1, 4, 2, 3),
  ( 1, 17, 3, 4),
  ( 2, 1, 1, 1),
  ( 2, 16, 3, 2),
  ( 3, 1, 1, 1),
  ( 3, 4, 2, 2),
  ( 3, 5, 2, 3),
  ( 3, 6, 2, 4),
  ( 4, 17, 1, 1),
  ( 4, 1, 3, 2);

INSERT INTO pedido (cod_representante, cod_empleado, cod_pedido_tipo,cod_pedido_estado,fecha_registro, cod_ticket) VALUES
  (1,1,'A', 'P','2019-04-22', 1),
  (2,2,'A', 'P','2021-04-17', 2),
  (2,1,'A', 'P','2022-01-15', 3),
  (1,2,'A', 'P','2022-01-17', 4),
  (3,1,'A', 'P','2022-05-17', 5),
  (3,2,'A', 'P','2022-11-13', 6),
  (4,1,'A', 'P','2023-01-15', 7),
  (4,2,'A', 'P','2023-01-17', 8),
  (4,1,'A', 'P','2023-03-15', 9),
  (5,1,'V', 'P','2023-04-15', 10),
  (5,2,'V', 'P','2023-05-15', 11),
  (6,1,'V', 'P','2023-05-17', 12),
  (7,2,'V', 'P','2023-06-15', 13),
  (8,1,'V', 'P', '2023-09-11',14),
  (8,2,'V', 'P', '2023-11-17', 15),
  (8,1,'V', 'P', '2023-12-14', 16),
  (9,2,'V', 'P', '2024-01-17', 17),
  (10,1,'V', 'P','2024-02-17', 18),
  (9,2,'V', 'P','2024-04-17', 19),
  (10,1,'V', 'P','2024-04-17', 20);

INSERT INTO incidencia (id_traslado,cod_tipo_incidencia,descripcion,fecha_ocurrencia, hora_ocurrencia,cod_estado_incidencia) VALUES
  ( 1, 'A', 'La fecha de entrega no coincide con la fecha establecida de llegada','2024-04-24','04:53:21','S'),
  ( 2, 'B', 'Hay paquetes que no están sellados correctamente', '2024-05-03','04:53:21','P'),
  ( 2, 'C', 'El transportista no se le dio la documentación correspondiente', '2024-05-05','04:53:21','S'),
  ( 1, 'D', 'El vehículo asignado no enciende', '2024-04-28','04:53:21', 'P'),
  ( 2, 'E', 'La direccion no coincide con el pedido del cliente', '2024-05-08','04:53:21','S'),
  ( 2, 'C', 'La documentación presenta datos erróneos', '2024-05-10','04:53:21', 'S'),
  ( 1, 'D', 'El vehiculo sufrió derrame de aceite ', '2024-04-30', '04:53:21', 'S'),
  ( 2, 'E', 'La direccion asignada presenta demasiado tráfico', '2024-05-12','04:53:21','P'),
  ( 1, 'B', 'El sello del paquete está dañado', '2024-04-30','04:53:21','P'),
  ( 1, 'A', 'Ocurrió un accidente en la carretera que retrasó la entrega del pedido', '2024-05-02','04:53:21','S');

INSERT INTO procedimiento (cod_incidencia,cod_tipo_procedimiento,nombre, tiempo_estimado) VALUES
  ( 1,    'A', 'Nro 1:Problema con la entrega',2 ),
  ( 2,    'B', 'Nro 2:Problema con el etiquetado',1),
  ( 3,    'C', 'Nro 3:Problema con la documentacion',4),
  ( 4,    'D', 'Nro 4:Problema con el vehiculo',6),
  ( 5,    'E', 'Nro 5:Problema con la ruta',3),
  ( 6,    'C', 'Nro 6:Problema con el vehiculo',6),
  ( 7,    'D', 'Nro 7:Problema con el vehiculo',6),
  ( 8,    'E', 'Nro 8:Problema con la ruta',3),
  ( 9,    'B', 'Nro 9:Problema con el etiquetado',1),
  (10,   'B', 'Nro 10:Problema con el etiquetado',1);

INSERT INTO norma (cod_incidencia, cod_norma_tipo, fecha_emision, fecha_vigencia) VALUES
  ( 1, 'X', '2019-01-24', '2025-01-24'),
  ( 2, 'Y', '2021-02-21', '2029-02-21'),
  ( 3, 'Z', '2020-02-17', '2026-02-17'),
  ( 4, 'W', '2017-03-28', '2027-03-28'),
  ( 5, 'X', '2005-03-15', '2025-01-24'),
  ( 6, 'Y', '2027-03-21', '2029-02-21'),
  ( 7, 'W', '2018-02-17', '2026-02-17'),
  ( 8, 'X', '2015-06-11', '2027-03-28'),
  ( 9, 'Y', '2018-02-17', '2026-02-17'),
  (10,'X', '2019-01-24', '2025-01-24');

INSERT INTO seguimiento (comentario,fecha_resolucion,numero_caso,cod_cliente_interno,cod_tipo_accion) VALUES
  (                                                 'Se está inspeccionando cada pieza de las estanterías afectadas para identificar el alcance del daño y determinar las acciones correctivas necesarias.', '2019-05-11', 0, 4, 'I'),
  (                                                               'Se revisará detalladamente el respaldo de la silla y diagnosticar el problema con el teléfono multifuncional para su pronta reparación.', '2022-02-05', 0, 4, 'C'),
  (                   'Se está coordinando la entrega de una nueva partida de guantes de la talla correcta y reemplazando la indumentaria de protección dañada para garantizar tu seguridad en el trabajo.', '2023-04-30', 0, 1, 'R'),
  (                                                                       'Se ha verificado el inventario de herramientas y se ha iniciado el proceso de envío del taladro faltante para completar el kit.', '2023-06-01', 0, 1, 'E'),
  (                                                                     'Se está realizando pruebas exhaustivas en la impresora para identificar y solucionar los problemas de impresión y funcionamiento.', '2023-06-04', 0, 4, 'I'),
  (                 'Se ha contactado al proveedor para discutir el problema de las alas de pollo y se están revisando los procedimientos de corte para garantizar la calidad y consistencia del producto.', '2023-09-30', 0, 3, 'C'),
  (                                                 'Se ha descartado el lote afectado y se está investigando la cadena de suministro para identificar la causa del problema y evitar futuras incidencias.', '2023-12-29', 0, 1, 'I'),
  (   'Se está evaluando la temperatura de almacenamiento y transporte de los productos congelados para corregir cualquier irregularidad que pueda causar la formación de cristales de hielo en el futuro.', '2024-03-09', 0, 1, 'E'),
  ( 'Se ha iniciado una investigación interna para determinar en qué etapa del proceso de embalaje ocurrió el daño al envase y se está tomando medidas para mejorar el proceso de manipulación y embalaje.', '2024-04-29', 1, 1, 'C'),
  ( 'Se está llevando a cabo una revisión exhaustiva de los procesos de almacenamiento y manipulación de las pechugas de pollo para identificar la fuente del problema y se han reforzado los controles de calidad para evitar errores similares en el futuro.', '2024-05-02', 2, 1, 'I');

INSERT INTO reclamo (comentario,fecha_suceso,fecha_reclamo,cod_representante,cod_pedido,cod_seguimiento,cod_tipo_reclamo,cod_nivel_urgencia,cod_estado_reclamo) VALUES
  (                                                    'Las estanterías metálicas recibidas están oxidadas y algunas piezas están dañadas.', '2019-04-30', '2019-05-01',  1,  1,  1, 'A', 'M', 'C'),
  (                  'La silla ergonómica recibida tiene un defecto en el respaldo y el teléfono multifuncional no funciona correctamente.', '2022-01-23', '2022-01-26',  2,  3,  2, 'C', 'A', 'B'),
  (                           'Los guantes de látex recibidos son de una talla incorrecta y la indumentaria de protección está desgarrada.', '2023-04-20', '2023-04-20',  3,  5,  3, 'C', 'A', 'D'),
  (                                                         'El kit de herramientas eléctricas recibido está incompleto, falta el taladro.', '2023-05-21', '2023-05-22',  4,  7,  4, 'B', 'M', 'A'),
  (                                     'La impresora de etiquetas recibida no imprime correctamente y presenta errores de funcionamiento.', '2023-05-22', '2023-05-22',  5,  9,  5, 'A', 'M', 'D'),
  (                                         'Las alas de pollo congeladas recibidas están mal cortadas y no presentan el tamaño adecuando.', '2023-09-18', '2023-09-20',  6, 11,  6, 'C', 'A', 'A'),
  (                    'Las piernas con encuentros frescas recibidas están vencidas y los muslos de pollos frescos tienen un olor extraño.', '2023-12-19', '2023-12-19',  7, 13,  7, 'A', 'A', 'C'),
  (                                          'El muslo de pollo congelado recibido está congelado en exceso y presenta cristales de hielo.', '2024-02-26', '2024-02-29',  8, 15,  8, 'A', 'A', 'B'),
  (                                         'El detergente SuperClean recibido tiene el envase roto y parte del contenido se ha derramado.', '2024-04-21', '2024-04-22',  9, 17,  9, 'D', 'M', 'C'),
  ( 'Las pechugas enteras de pollos frescas recibidas están en mal estado y los colorantes naturales Chroma no se incluyeron en el pedido.', '2024-04-22', '2024-04-23', 10, 19, 10, 'C', 'A', 'A');

INSERT INTO evidencia (nombre_evidencia, cod_reclamo, cod_tipo_evidencia, cod_tipo_archivo) VALUES
  (          'Captura_estanterias_oxidadas',  1, 'C',  '1'),
  (              'Foto_estanterias_dañadas',  1, 'F',  '8'),
  (            'Documento_silla_defectuosa',  2, 'D',  '5'),
  (        'Grabacion_audio_respaldo_silla',  2, 'G',  '6'),
  (                  'Foto_telefono_dañado',  2, 'F', '15'),
  (    'Documento_guantes_talla_incorrecta',  3, 'D', '14'),
  (          'Foto_indumentaria_desgarrada',  3, 'F',  '7'),
  (   'Fotografia_herramientas_incompletas',  4, 'F', '18'),
  ( 'Documento_lista_faltante_herramientas',  4, 'D', '17'),
  (               'Captura_impresora_error',  5, 'C',  '2'),
  (                  'Foto_impresora_error',  5, 'F',  '9'),
  (           'Foto_alas_pollos_mal_estado',  6, 'F',  '3'),
  (               'Foto_pollo_descongelado',  6, 'F',  '8'),
  (      'Grabacion_audio_piernas_vencidas',  7, 'G', '13'),
  (        'Fotografia_muslos_olor_extraño',  7, 'F', '18'),
  (     'Fotografia_muslo_congelado_exceso',  8, 'F', '20'),
  (             'Documento_cristales_hielo',  8, 'D', '19'),
  (       'Fotografia_detergente_derramado',  9, 'F',  '4'),
  (                 'Documento_envase_roto',  9, 'D', '10'),
  (        'Fotografia_pechugas_mal_estado', 10, 'F', '16'),
  (      'Documento_reclamo_sin_colorantes', 10, 'D', '22');

INSERT INTO programacion_reporte (cod_representante, cod_reporte_formato, cod_reporte_estado, cod_reporte_tipo, cod_reporte_frecuencia, fecha_inicio, fecha_fin) VALUES
  (1, 1, 1, 1, 1, '2024-01-01', '2024-12-31'),
  (2, 2, 1, 2, 2, '2024-02-01', '2024-10-31'),
  (3, 3, 2, 3, 3, '2024-03-01', '2024-12-31'),
  (4, 4, 1, 4, 4, '2024-04-01', '2024-06-30'),
  (1, 2, 1, 1, 5, '2024-05-01', '2024-08-31'),
  (2, 3, 2, 1, 6, '2024-06-01', '2024-12-31'),
  (3, 4, 1, 2, 7, '2024-07-01', '2024-10-31'),
  (4, 1, 2, 3, 1, '2024-08-01', '2024-11-30'),
  (1, 3, 1, 4, 2, '2024-09-01', '2024-12-31'),
  (2, 4, 2, 2, 3, '2024-10-01', '2024-12-31'),
  (3, 1, 1, 1, 4, '2024-11-01', '2024-12-31'),
  (4, 2, 1, 2, 5, '2024-12-01', '2024-12-31'),
  (1, 4, 2, 3, 6, '2024-01-15', '2024-04-30'),
  (2, 1, 1, 4, 7, '2024-02-15', '2024-12-31'),
  (3, 2, 1, 2, 1, '2024-03-15', '2024-04-30'),
  (4, 3, 2, 1, 2, '2024-04-15', '2024-12-31'),
  (1, 4, 1, 2, 3, '2024-05-15', '2024-05-31'),
  (2, 3, 1, 3, 4, '2024-06-15', '2024-12-31'),
  (3, 1, 2, 4, 5, '2024-07-15', '2024-12-31'),
  (4, 2, 1, 3, 6, '2024-08-15', '2024-09-30'),
  (1, 3, 2, 1, 7, '2024-09-15', '2024-12-31'),
  (2, 4, 1, 2, 1, '2024-10-15', '2024-12-31'),
  (3, 2, 2, 3, 2, '2024-11-15', '2024-12-31'),
  (4, 1, 1, 4, 3, '2024-12-15', '2024-12-31'),
  (1, 2, 1, 4, 4, '2024-01-31', '2024-02-28');

INSERT INTO reporte (cod_representante, cod_reporte_formato, cod_reporte_tipo, fecha_generacion, hora_generacion) VALUES
  (1, 1, 1, '2024-06-01', '08:00:00'),
  (2, 2, 2, '2024-06-02', '09:00:00'),
  (3, 3, 3, '2024-06-03', '10:00:00'),
  (4, 4, 4, '2024-06-04', '11:00:00'),
  (1, 2, 1, '2024-06-05', '12:00:00'),
  (2, 3, 1, '2024-06-06', '13:00:00'),
  (3, 4, 2, '2024-06-07', '14:00:00'),
  (4, 1, 3, '2024-06-08', '15:00:00'),
  (1, 3, 4, '2024-06-09', '16:00:00'),
  (2, 4, 2, '2024-06-10', '17:00:00'),
  (3, 1, 1, '2024-06-11', '18:00:00'),
  (4, 2, 2, '2024-06-12', '19:00:00'),
  (1, 4, 3, '2024-06-13', '20:00:00'),
  (2, 1, 4, '2024-06-14', '21:00:00'),
  (3, 2, 3, '2024-06-15', '22:00:00'),
  (4, 3, 1, '2024-06-16', '23:00:00'),
  (1, 4, 2, '2024-06-17', '00:00:00'),
  (2, 3, 3, '2024-06-18', '01:00:00'),
  (3, 1, 4, '2024-06-19', '02:00:00'),
  (4, 2, 1, '2024-06-20', '03:00:00'),
  (1, 3, 1, '2024-06-21', '04:00:00'),
  (2, 4, 2, '2024-06-22', '05:00:00'),
  (3, 2, 3, '2024-06-23', '06:00:00'),
  (4, 1, 4, '2024-06-24', '07:00:00'),
  (1, 2, 1, '2024-06-25', '08:00:00');
```

## 4. Funcionalidad Primaria Elegida

### 5. Funcionalidad Primaria del módulo de reportes

**Funcionalidad primaria elegida:** Programar la generación de un tipo de reporte en un intervalo de tiempo definido. <br>
**Sustentación:** Se automatiza y facilita la generación de informes en intervalos predefinidos, brindando acceso a información crítica sin intervención manual. Además, permite personalizar los tipos, formatos, frecuencias y períodos de los informes según las necesidades específicas, organizando todas las tareas de generación de informes en un solo lugar. Esta funcionalidad se integra con los datos de otros módulos, apoyando la toma de decisiones basada en datos dentro de la empresa. <br>
Esta funcionalidad permitirá cumplir con los requerimientos de Generar reporte (R501) y Programar reporte (R502), los cuales se encuentran relacionados con las interfaces I501 y I-503.
<table>
   <tr>
      <th>Actividad</th>
      <th>Descripción</th>
   </tr>
   <tr>
      <td>1</td>
      <td>Al ingresar al módulo de Reportes (desde un usuario con cargo de representante de algún área), el usuario puede ver todas las opciones de este módulo, donde hay un cuadro que dice opciones y puede presionar el botón de "Programar reporte"
	<p align="center">
           <img style="width: 80%;" src="https://github.com/fiis-bd241/grupo01/assets/161625149/eb29ab8b-8fb7-4e69-88ad-926acf086307">
	</p>
      </td>
   </tr>
	
   <tr>
      <td>2</td>
      <td>Luego de presionar el botón, saldrá una ventana emergente donde saldrán los valores necesarios para programar el reporte: El tipo de reporte, el formato en el que se va a generar, la frecuencia de creación de los reportes, la fecha desde donde va a comenzar la programación y la fecha en la que termina. Une vez llenado esos campos, se va a presionar el botón "Programar".
          <p align="center">
             <img style="width: 80%;" src="https://github.com/fiis-bd241/grupo01/assets/161625149/df005dc5-7ebb-4274-94c4-523000c47962">
          </p> 
      </td>
   </tr>
   
   <tr>
      <td>3</td>
      <td>
	 Ahora el usuario podrá ver la programación del reporte hecha en la lista de programaciones que está al lado del cuadro de opciones.
      <p align="center">
        <img style="width: 80%;" src="https://github.com/fiis-bd241/grupo01/assets/161625149/eb29ab8b-8fb7-4e69-88ad-926acf086307">
      </p> 
      </td>
   </tr>
   <tr>
      <td>4</td>
      <td>Ahora une vez que se llega a la fecha inicio de programación, cada cierto tiempo (indicado en la frecuencia del reporte) se generará el reporte en el backend y será enviado al usuario.</td>
   </tr>
</table>

## 5. Stack Tecnológico elegido para su aplicación

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
## 6. Primera Versión de su Aplicación

## 7. Videos individuales
