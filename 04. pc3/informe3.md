# Tercera práctica calificada - Informe

## 1. Asignación de Códigos por Requerimientos y Prototipos de Interfaces de Usuario

### Requerimientos

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
| Código      | P501 |
| Prototipo   |     ![P501](https://github.com/fiis-bd241/grupo01/assets/161625149/ad771877-0791-4306-9b88-16bacd77c461)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R501           |
| Código      | P502 |
| Prototipo   | ![P502](https://github.com/fiis-bd241/grupo01/assets/161625149/1d9231b8-5eec-4b2b-82be-01d3f61c9114) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R502          |
| Código      | P503 |
| Prototipo   |  ![P503](https://github.com/fiis-bd241/grupo01/assets/161625149/20e8f6c6-ec0a-435e-9787-a251b975e0bd) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R504          |
| Código      | P504 |
| Prototipo   |   ![P504](https://github.com/fiis-bd241/grupo01/assets/161625149/2e4a32c5-0ad2-41a8-a4bf-417dc081b162)|

## 2. Sentencias SQL por cada prototipo

### Sentencias SQL del módulo de Reportes

#### Caso 1
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R503</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>P501</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/49b92b4f-8454-4796-80b5-40231c04d128">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

``` sql 
1. Carga de reportes programados: Cuando el usuario entre al modulo de reportes, se llenará la tabla de reportes programados.
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
WHERE pr.cod_reporte_estado = 1
ORDER BY pr.cod_programacion_reporte;

2. Carga de inventario: Cuando el usuario entre al modulo de reportes, se llenará la tabla de elementos catálogo.
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
      <td>P502</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/4e76cb59-7849-47a6-818f-d5e98ad1f9a7">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

``` sql 
1. Carga de formatos: Se llenará la lista de formatos de reportes a seleccionar.
SELECT cod_reporte_formato, descripcion FROM reporte_formato;

2. Carga de tipos: Se llenará la lista de tipos de reportes a seleccionar.
SELECT cod_reporte_tipo, descripcion FROM reporte_tipo; 

3. Botón generar: Cuando el usuario presione el botón generar, se generará un reporte.
INSERT INTO reporte (cod_representante, cod_reporte_formato, cod_reporte_tipo)
VALUES
(cod_representante, <1>, <2>)
```
#### Caso 3
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R502</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>P503</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/cdcf6d64-c139-4470-bf06-a3e197484db5">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

``` sql
1. Carga de frecuencia: Se llenará la lista de frecuencias para programar reportes.
SELECT cod_reporte_frecuencia, descripcion FROM reporte_frecuencia;

2. Carga de formatos: Se llenará la lista de formatos de reportes a seleccionar.
SELECT cod_reporte_formato, descripcion FROM reporte_formato;

3. Carga de tipos: Se llenará la lista de tipos de reportes a seleccionar.
SELECT cod_reporte_tipo, descripcion FROM reporte_tipo; 

6. Botón programar: Cuando el usuario presione el botón generar, se generará un reporte.
INSERT INTO programacion_reporte
(cod_representante, cod_reporte_frecuencia, cod_reporte_formato, cod_reporte_tipo,, fecha_inicio, fecha_fin ) 
VALUES
(cod_representante, <1>, <2>, <3>, <4>, <5>);
```
#### Caso 4
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R504</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>P504</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

``` sql

```
## 3. Carga de Datos

## 4. Funcionalidad Primaria Elegida

### Funcionalidad Primaria del módulo de reportes

Funcionalidad primaria elegida: Programación de reportes.
Sustentación: 

<table>
   <tr>
      <th>Actividad</th>
      <th>Descripción</th>
   </tr>
   <tr>
      <td>1</td>
      <td></td>
   </tr>
   <tr>
      <td>2</td>
      <td></td>
   </tr>
   <tr>
      <td>3</td>
      <td>
         <img src="">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>
