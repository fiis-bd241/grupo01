# Segunda práctica calificada - Informe

## 1. Modelo conceptual

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/686b13d6-0c06-4b49-8a5d-efe548bdecb0"></p>

[Diagrama Chen](https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B"pageId"%3A"R2lEEEUBdFMjLlhIrx00"%7D)

## 2. Modelo lógico

![Modelo logico (1)](https://github.com/fiis-bd241/grupo01/assets/161625149/da077864-ec9f-42b9-b3d9-d297166ff915)

[Modelo lógico](https://app.diagrams.net/#G1GrupzXPfoShdgRXzAIGe09sujAwB4f1J)

### Diccionario de datos:

**Entidad:** Catálogo_contingencias 

Semántica: Recurso que enumera y describe posibles situaciones de emergencia o riesgos, junto con las estrategias o procedimientos diseñados para responder a cada una de ellas de manera efectiva. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| código_catalogo_contingencias | CHAR | 999999999 | 9 dígitos | --- | --- | Identificador del catálogo de contingencias |  
| comentario | CHAR | X(200) | - | - | - |Comentario o descripción detallada acerca del catálogo de contingencias | 

**Entidad**: Cliente 

Semántica: Persona o entidad que utiliza productos o servicios de una empresa. 

| ATRIBUTO | NATURALEZA | FORMATO| VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN| 
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_cliente| INT| SERIAL | Enteros positivos generados automáticamente | -  | -  | Código único que identifica al cliente. | 
| cod_cliente_tipo | CHAR | X | Un carácter alfanumérico | -  | cliente_tipo | codigo unico que identifica al tipo de cliente |
| cod_cliente_estado | CHAR  | X| 1 Un carácter alfanumérico | - | cliente_estado | codigo unico que identifica el estado actual del cliente en la plataforma. | 
| nombre | CHAR  |  X(32)  | NOT NULL  | -  | -  | Nombre de la empresa | 
| ruc | CHAR | X(11) | Cadena de 11 caracteres alfanuméricos | - |  - | Registro Único de Contribuyente del cliente|
| razon_social | VARCHAR | X(120)| Cadena de texto de hasta 120 caracteres | -  | - | Razón social del cliente | 
| fecha_registro | DATE | AAAA-MM-DD | valido calendario | - | - | Fecha de registro del cliente |


**Entidad**: Cliente_interno 

Semántica: Representa un área interna de la empresa San Fernando, que puede ser un departamento, una sección o cualquier otra subdivisión dentro de la organización. 

| ATRIBUTO | NATURALEZA | FORMATO| VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN| 
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_area | CHAR | 999999999 | 9 dígitos | -  | -  | Nombre del área interna de la empresa | 
| nombre_area | CHAR | X(255) | NOT NULL | - | - | Nombre del área interna de la empresa | 

**Entidad**: Cliente_externo 

Semántica: Representa a una empresa externa que interactúa con la empresa San Fernando como cliente. 

| Atributo | Naturaleza | Formato | Valores validos | Unidad | Derivada de | Descripción | 
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
|ruc| INT | 99999999999 | 11 dígitos |- |- | Registro Único de Contribuyente de la empresa cliente| 
| nombre_empresa | CHAR | X(32) | NOT NULL | - | - | Nombre de la empresa cliente | 
|razon_social| CHAR | X(32) | - | - | - | Razón  social de la empresa cliente | 

**Entidad:** Elemento_catalogo 

Semántica: Representa los productos ofrecidos por sanfernando  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN | 
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_elemento_catalogo | CHAR | 999999999 | 9 dígitos | --  | --  | Identificador del elemento en el catálogo. | 
| nombre | CHAR | X(32) | NO NULL  | - | - | Nombre del elemento en el catálogo. |
| categoría | INT  | 99 | NO NULL | TAB  | - | Es la forma de categorizar los elementos | 
| segmento | INT  | 9 | NO NULL | TAB  | - | Es la segmentación del material y las materias primas |
| descripcion | CHAR| X(256) | NO NULL | -  | - | Descripción del elemento en el catálogo. | 
| unidad  | CHAR  | X(32) | NO NULL | -  | - | Unidad de medida del elemento en el catálogo. | 
| temperatura_maxima | INT | 999 | - | Grados Celsius | - | Temperatura máxima permitida para la materia prima | 
| temperatura_mínima | INT | 999 | - | Grados Celsius | - | Temperatura mínima permitida para la materia prima |
| vida_util | INT | 999 | - | Días | - | Vida útil de la materia prima | 
| peso_unitario | CHAR | X(64) | - | - | - | Segmento al que pertenece el material en el catálogo|

TAB: Categoría de elemento
<table>
  <tr><th>Valor</th><th>Categoría</th><th>Descripción</th></tr>
  <tr><td>11</td><td rowspan="9">Materia Prima</td><td>Especias y condimentos</td></tr>
  <tr><td>12</td><td>Aditivos alimentarios</td></tr>
  <tr><td>13</td><td>Aceites y grasas</td></tr>
  <tr><td>14</td><td>Harinas</td></tr>
  <tr><td>15</td><td>Huevos</td></tr>
  <tr><td>16</td><td>Conservantes</td></tr>
  <tr><td>17</td><td>Colorantes</td></tr>
  <tr><td>18</td><td>Emulsionantes</td></tr>
  <tr><td>19</td><td>Otras materias primas</td></tr>
  <tr><td>21</td><td rowspan="6">Material</td><td>Herramientas</td></tr>
  <tr><td>22</td><td>Repuestos</td></tr>
  <tr><td>23</td><td>Químicos</td></tr>
  <tr><td>24</td><td>Detergentes industriales</td></tr>
  <tr><td>25</td><td>Etiquetas</td></tr>
  <tr><td>26</td><td>Otros materiales</td></tr>
  <tr><td>31</td><td rowspan="3">Producto</td><td>Pollo congelado</td></tr>
  <tr><td>32</td><td>Pollo fresco</td></tr>
  <tr><td>33</td><td>Saborizado</td></tr>
</table>

TAB: Segmentación
|Código|Semántica|
|------|---------|
|1|Materiales peligrosos|
|2|Suministros y repuestos|
|3|Insumos y etiquetas|
|4|No aplica|

**Entidad**: Empleado 

Semántica: Entidad que representa a los trabajadores de la empresa San fernando. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN | 
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
|cod_empleado| CHAR | 999999999 | 9 digitos | -  | -  | Identificador único del empleado dentro de la organización. Permite diferenciar a cada empleado de manera inequívoca. | 
| cargo | CHAR | X(32) | - | - | - | Cargo o función que desempeña el empleado en la organización. Describe el rol del empleado dentro de la empresa. | 
| fecha_contrato | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que empezó a trabajar el empleado | 

**Entidad**: Evidencia  

Semántica: Implica la representación de archivos adjuntos que respaldan o documentan reclamos, incidencias o eventos en un sistema o proceso.  
 
| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_evidencia | CHAR | 999999999 | 9 dígitos | - | - | Código único de identificación de la evidencia |  
| nombre_evidencia | CHAR | X(32) | - | - | - | Nombre o descripción de la evidencia. |  
| tipo_evidencia | CHAR | X(16) | foto, video, documento, etc | - | - | Tipo de evidencia (formato del archivo).|  
| tipo_archivo | CHAR | X(4) | jpg, png, mp4, pdf, etc | - | - | Tipo de archivo asociado a la evidencia.|  

 **Entidad**: GPS  

 Semántica: Registro del momento en el tiempo y ubicación en el que estuvo un vehículo determinado.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------|  
| cod_gps | CHAR | 9999999 | NO NULL | - | - |  Fecha específica en las que el vehículo se encuentra en la ubicación |  
| fecha_ubicacion | DATE | AAAAMMDD | NO NULL | - | - |  Fecha específica en las que el vehículo se encuentra en la ubicación |  
| hora_ubicacion | TIME| HHMMSS | NO NULL | - | - |  Hora específica en las que el vehículo se encuentra en la ubicación | 

**Entidad**: Incidencia  

Semántica: Problema, situación anormal o evento no planificado.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_incidencia | INT | 9 | >0 | - | - | - | Código único que identifica la incidencia.|  
| cod_tipo_incidencia | CHAR | X| TAB | - | - | Tipo de incidencia que ha ocurrido |  
| descripcion | CHAR | x(128) | - | - | - | Descripción detallada de la incidencia.|  
| fecha_ocurrencia | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que ocurrió la incidencia. |  

TAB: Tipo de incidencia
|Código|Descripción|
|------|---------|
|A|Incidencia de tipo A: Retraso en la entrega|
|B|Incidencia de tipo B: Error en el etiquetado o embalaje|
|C|Incidencia de tipo C: Fallos en la documentación|
|D|Incidencia de tipo D: Problemas mecánicos con el vehículo|
|E|Incidencia de tipo E: Error en la asignación de la ruta|


**Entidad**: Local  

Semántica: Lugar físico que cuenta con una dirección legal registrada.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_local | CHAR | 999999999 | 9 dígitos | - | - | Identificador del local |  
| pais | CHAR | xxx | ISO 3166-1 alfa-3 | - | - | República donde se encuentra el local |  
| region | CHAR | xx-xxx | ISO 3166-2 | - | - | Departamento / Estado donde se encuentra el local |  
| distrito | INT | 999999 | Ubigeo | - | - | Ciudad donde se encuentra el local |  
| calle | CHAR | X(64) | NO NULL | - | - | Calle, Jirón, Avenida, Pasaje donde se encuentra el local |  
| numero | INT | 9999 | 4 dígitos | - | - | Identificador numérico de domicilio |  
| tipo_local | INT | 9 | TAB | - | - | Indica el tipo de local |  

TAB: Tipo Local
|Código|Descripción|
|------|---------|
|1|Almacén|
|2|Recepción|
|3|Venta|
|4|Distribuidora|

**Entidad**: Mercancía  

 Semántica: Representar los diferentes productos que una empresa tiene en su inventario para la venta o distribución.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cantidad_producto | INT | 9999 | unidades | - | - | Cantidad de productos disponibles |  
| numero_precinto | CHAR | 999999999 | 9 dígitos | - | - | Número de precinto asociado a la mercancía |  
| peso_total | INT | 999 | >=0 | - | - | Peso total de la mercancía |  
| cod_operacion | CHAR | 999999999 | 9 dígitos | - | - | Identificador de la operación tipo picking que asignó las existencias a la mercancía |  

 **Entidad:** Norma  

 Semántica: Conjunto de reglas o directrices establecidas para regular un comportamiento específico o para guiar una actividad particular. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_norma | INT| 9 | >0 | - | -- | Identificador de la norma |  
| cod_tipo_norma | CHAR | X |TAB| --- | --- | Registra el identificador del tipo de norma a utilizar |  
| fecha_emision | DATE | AAAAMMDD |NO NULL | - | - | Indica la fecha de emisión de la norma para su cumplimiento|  
| fecha_vigencia | DATE | AAAAMMDD | TAB | - | - | Indica la vigencia de la norma para su cumplimiento |  

TAB: Tipo de Norma
|Código|Descripción|
|------|---------|
|X|NTP 209.027|
|Y|ISO 17712|
|Z|ISO 22000|
|W|ISO 9001|


**Entidad**: Operación  

Semántica: Entidad que representa las diferentes transacciones o movimientos de mercancía que se realizan dentro de la empresa San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_operacion | CHAR | 999999999 | 9 digitos | - | - | Identificador único de la operación. |
| cod_operacion_previa | CHAR | 999999999 | 9 digitos | - | - | Identificador único de la operación previa. |
| cod_empleado_ejecutor | CHAR | 999999999 | 9 digitos | - | - | Identificador único del empleado que ejecuta la operación. |
| cod_empleado_supervisor | CHAR | 999999999 | 9 digitos | - | - | Identificador único del empleado que supervisó la ejecución de la operación. |
| cod_operacion | CHAR | 999999999 | 9 digitos | - | - | Identificador único de la operación. |
| tipo_operacion | INT | 9 | TAB | - | - | Indica el tipo de movimiento realizado en la operación. |  
| fecha | DATE | AAAAMMDD | NO NULL | - | - | Fecha en que la operación se realizó. |
| hora_inicio | TIME| HHMMSS | NO NULL | - | - |  Hora en que la operación inició. | 
| hora_fin | TIME| HHMMSS | NO NULL | - | - |  Hora en que la operación finalizó. |

TAB: Tipo de operación
|Código|Semántica|
|------|---------|
|1|Picking|
|2|Precintado|
|3|Paletizado|
|4|Carga|
|5|Salida|
|6|Recepción|
|7|Descarga|

 **Entidad**: Pedido  

Semántica: La entidad que representa las solicitudes de compra o de suministros realizadas por la empresa San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_pedido | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del pedido. |  
| descripcion | CHAR | X(32) | - | - | - | Descripcion detallada del pedido |  
| fecha_registro | DATE | AAAAMMDD | NO NULL | - | - | Fecha de registro del pedido |  
| tipo_pedido | CHAR | X(32) | - | - | - | Tipología del pedido registrado. |  
| estado_pedido | CHAR | X(32) | "Pendiente", "En proceso", "Entregado", "Cancelado" | - | - | Indica el estado actual del pedido. |  

**Entidad**: Persona  

Semántica: Entidad que interactúan con la empresa San fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| dni | CHAR | 9999999 | 7 digitos | - | - | Documento Nacional de Identidad de la persona|  
| primer_apellido | CHAR | X(16) | - | - | - | Apellido paterno de la persona. |  
| segundo_apellido | CHAR | X(16) | - | - | - | Apellido materno de la persona. |  
| prenombre | CHAR | X(16) | - | - | - | Nombre(s) de la persona. |  
| genero | CHAR | X(16) | "Masculino" , "Femenino" | - | - | Género de la persona. |  
| nacionalidad | CHAR | X(16) | - | - | - | Nacionalidad de la persona. |  
| estado_civil | CHAR | X(16) | "Soltero", "Casado", "Divorciado", "Viudo" | - | - | Estado civil de la persona. |  
| direccion | CHAR | X(32) | - | - | - | Dirección de residencia de la persona. |  

**Entidad:** Procedimiento  

Semántica: Recurso que engloba una lista da pasos a seguir para abordar una determinada incidencia de traslado.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_procedimiento | INT| 9 | >0 | - | -- | Identificador del procedimiento |  
| cod_tipo_procedimiento | CHAR | X | TAB | - | - | Identificador del tipo de procedimiento |
| nombre| VARCHAR | X(70) | NO NULL | - | - | Indica en resumen el problema específico que requiere procedimiento | 
| tiempo estimado | INT | 9 | >0 | horas | - | Representa la duración estimada de la aplicación del procedimeiento | 

TAB: Tipo de procedimiento
|Código|Descripción|
|------|---------|
|A|Procedimiento de tipo A: Retraso en la entrega|
|B|Procedimiento de tipo B: Errores en el etiquetado o embalaje|
|C|Procedimiento de tipo C: Fallas en la documentación|
|D|Procedimiento de tipo D: Problemas mecánicos con el vehículo|
|E|Procedimiento de tipo E: Error en la asignación de la ruta|


**Entidad:** Programacion_reporte  

Semántica: Datos necesarios para la generación automática de cada reporte.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| formato | CHAR | 999999999 | 9 dígitos | - | - | Identificador de la programación del reporte. |  
| filtros | CHAR | X(128) | NO NULL | - | - | Filtros necesarios para el reporte guardados. |  
| frecuencia | CHAR | X(32) | - | - | - | Periodo de tiempo de máximo 1 año en el que debe generarse automáticamente el reporte |  
| estado | CHAR | X(16) | Activo, Inactivo | - | - | Indica si la programación este activa o inactiva |  
| fecha_inicio | DATE | AAAAMMDD | NO NULL | - | - | Fecha donde inicia la programación |  
| fecha_fin | DATE | AAAAMMDD | NO NULL | - | - | Fecha donde termina la programación |  

**Entidad**: Reclamo  

Semántica: Queja formal expresada por un cliente sobre un producto o servicio.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_reclamo | CHAR| 999999999 | 9 dígitos | - | - | Código único que identifica el reclamo.|  
| tipo_reclamo | CHAR| X(32) | - | - | - | Tipo de reclamo, puede ser de diferentes categorías, como técnico, operativo, etc.|  
| nivel_urgencia | CHAR | X(32) | 1 (Baja), 2 (Media), 3 (Alta) | - | - | Nivel de urgencia del reclamo, indicando la prioridad con la que debe ser atendido.|  
| estado_reclamo | CHAR| X(16)| Pendiente, En Proceso, Resuelto, Cerrado | - | - | Estado actual del reclamo.|  
| comentario | CHAR| X(128) | - | - | - | Comentario detallado sobre el reclamo, describiendo el problema o situación reportada.|  
| fecha_incidente | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que el cliente encontró el problema/incidente. Puede ser el código único de la fecha. |  

**Entidad**: Reporte  

Semántica: Representación de registros que documentan incidentes, eventos o problemas dentro de un sistema, proceso o entorno.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_reporte | CHAR | 999999999 | - | - | - | Identificador único del reporte |  
| fecha_generacion | DATE | AAAAMMDD |NO NULL | - | - | Fecha en que se generó el reporte |  
| hora_generacion | TIME | HHMMSS |NO NULL | - | - | Hora en que se generó el reporte |  

**Entidad**: Representante  

Semántica: Persona que actúa en nombre de una empohraresa o entidad en particular.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN|  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_representante | CHAR | 999999999| 9 dígitos | - | - | Código único que identifica al representante.|  
| tipo_representante | INT |999999999| 9 dígitos | Interno, Externo | - | Indica el tipo de representante.| 
| cargo | CHAR | X(32) | Cargo 1, Cargo 2, Cargo 3, ... | - | - | Cargo o posición del representante en la empresa.|  
| correo_empresarial | CHAR | X(32) | - | - | - | Correo de contacto del representante en la empresa.|  
| nro_telefono | INT |999999999| 9 dígitos | - | - | Número de contacto del representante en la empresa.|  

**Entidad**: Ruta  

Semántica: Conjunto de ubicaciones que va a visitar el vehículo en su transcurso de su origen a su destino.   

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_ruta | CHAR | 999999999 | 9 dígitos | - | - | Identificador primario para relacionar y referenciar la ruta en el sistema. |  
| distancia_total | INT | 9999 | >0 | Kilómetros | - | Indica la distancia total en unidades específicas entre el punto de origen y el punto de destino. |  
| tipo_ruta | CHAR | X(6) | TAB | - | - | Clasificación que define la naturaleza y características principales de la ruta. |  
| duracion | INT | 999 | >0 | horas | ditancia_total/30 | Representa la duración estimada de la ruta en el sistema a una velocidad promedio de 30km/h. |  

TAB: Tipo de ruta
|Código|Semántica|
|------|---------|
|1|Urbana|
|2|Rural|

**Entidad**: Seguimiento Reclamo

Semántica: Permitir el seguimiento y la gestión de casos, incidencias o eventos dentro de San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| numero_caso | INT | 9999 | >0 | - | - | Número de caso asociado al seguimiento (Cola) de reclamos |  
| tipo_accion | CHAR | X(150) | - | - | - | Tipo de acción realizada en el seguimiento del reclamo|  
| area_responsable | CHAR | X(10) | - | - | - | Área responsable del seguimiento de la queja |  
| comentario | CHAR | X(200) | - | - | - |Comentario o descripción detallada del seguimiento del reclamo |  
| fecha_resolucion | DATE | AAAAMMDD |NO NULL | - | - | Fecha en que se espera resolver el reclamo | 

**Entidad**: Stock  

Semántica: Se refiere a la representación de los productos físicos disponibles en el inventario de una empresa en un momento dado  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_stock | CHAR | 999999999 | - | - | - | Código único de identificación del registro de stock |
| cod_elemento_catalogo | CHAR | 999999999 | - | - | - |  Identificador del elemento en catálogo que describe las características generales del stock |
| cod_mercancía | CHAR | 999999999 | - | - | - | Identificador de la mercancía de la cual forma parte el stock |
| nro_lote | INT | 999 | >=0 | - | - | Número de lote asociado al stock | 
| tipo_stock | INT  | 9 | NO NULL | TAB  | - | Tipo de stock según su relación con el proceso de producción | 
| fecha_caducidad | DATE | AAAAMMDD |NO NULL | - | - | Fecha en que el producto pierde su valor o propiedades |

TAB: Tipo de stock
|Código|Semántica|
|------|---------|
|1|Materia prima|
|2|Material|
|3|Producto|

**Entidad:** Paradero 

Semántica: Segmento transitable de ruta entre dos locales  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN | 
|----------|------------|---------|------------------|--------|-------------|--------------| 
| cod_paradero | CHAR | 999999999| 9 dígitos | - | - | Identificador único del paradero en una ruta| 
| paradero_tipo | INT | 9 | TAB | - | - | Identifica si el local es un punto de origen, de paso o el final de la ruta | 
| orden | INT| 9 |>0| - | - | Identifica el orden correlativo de la parada en la ruta | 

TAB: Tipo de paradero
|Código|Semántica|
|------|---------|
|1|Origen|
|2|Paradero|
|3|Destino|

**Entidad**: Transportista  

Semántica: Entidad que representa a los empleados de la empresa San Fernando que se encargan de realizar los traslados de mercancía.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_transportista | INT | 99 | >0| - | - | Identificador único del transportista dentro de la empresa. |  
| cod_estado_transportista | CHAR | X | TAB | - | - | Indica el estado de determinado transportista para determinar su disponibilidad.|  
| cod_tipo_licencia | CHAR | X |TAB | - | - | Identificador del tipo de licencia de conducir que posee el transportista. |  
| numero_licencia | CHAR | X(7) | 9 digitos | - | - | Número de licencia de conducir del transportista. |  
| fecha_vencimiento_licencia | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que vence la licencia del transportista. |  
| fecha_ultimo_traslado | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que el transportista realizó su último traslado. |  

TAB: Estado del Tranportista
|Código|Descripción|
|------|---------|
|D|Disponible|
|N|No disponible|
|C|Cuarentena|


TAB: Tipo de licencia de tranportista
|Código|Descripción|
|------|---------|
|X|A-IIb|
|Y|A-IIIb|


**Entidad**: Traslado  

Semántica: Entidad que representa los movimientos de mercancía realizados tanto dentro de la empresa San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_traslado | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del traslado realizado. |
| cod_vehiculo | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del vehículo asignado para el traslado. |
| cod_ruta | CHAR | 9999999999 | 9 digitos | - | - | Identificador único de la ruta asignada para el traslado. |
| cod_transportista | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del transportista asignado para el traslado. |
| cod_operacion_inicia | CHAR | 9999999999 | 9 digitos | - | - | Identificador único de la operación tipo ¨Salida¨ mediante la cual se inicia el traslado. |
| cod_operacion_termina | CHAR | 9999999999 | 9 digitos | - | - | Identificador único de la operación tipo ¨Recepción¨ mediante la cual se finaliza el traslado. |

**Entidad**: Ubicación  

Semántica: Latitud y Longitud de un lugar geográfico  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_ubicacion | CHAR | 999999999 | 9 dígitos | - | - | Identificador de la ubicación |  
| longitud | FLOAT | 999.999999 | - | - | - | Ubicación de un punto respecto al meridiano de Greenwich |  
| latitud | FLOAT | 999.999999 | - | - | - | Ubicación de un punto del globo respecto a la línea imaginaria del ecuador |  

**Entidad:** Vehículo  

Semántica:  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_vehiculo | INT | 99 | >0 | - | - | Identificador del vehículo en el sistema. |  
| cod_estado_vehiculo | CHAR | X | TAB | - | - | Indicador del Estado actual del vehículo. |
| cod_modelo_vehiculo | CHAR | X | TAB | - | - | indicador del modelo del vehículo. |  
| año_fabricacion | INT | 9999 | Año válido | - | - | Año en que fue fabricado el vehículo. |  
| capacidad_carga | FLOAT | 999.99 | x>0 | - | - | Capacidad máxima de carga del vehículo. | 
| fecha_último_mantenimiento | DATE | AAAAMMDD | De acuerdo a calendario | - | - | Fecha en que el vehículo realizó su último mantenimiento. | 
| fecha_último_viaje | DATE | AAAAMMDD | De acuerdo a calendario | - | - | Fecha en que el vehículo realizó su último viaje. | 
| placa | CHAR | XXX-XXX | NO NULL | - | - | Identificador único de placa del vehículo. | 

TAB: Estado del Vehículo
|Código|Descripción|
|------|---------|
|D|Disponible|
|N|No disponible|
|C|Cuarentena|


TAB: Tipo de modelo del vehículo
|Código|Descripción|
|------|---------|
|F|Furgoneta|
|C|Camión|
|S|SUV|


##### Relaciones

| Nombre de la relación | Entidad 1 | Cardinalidad 1 | Entidad 2 | Cardinalidad 2 | Atributos propios de la relación | Entidad aparte? | Identificador Único |
|-|-|-|-|-|-|-|-|
| Genera | Empleado | 1 | Reporte | N | --- | No | Cod_empleado + cod_reporte |
| Genera | Programación Reporte | 1 | Reporte | N | --- | No | Cod_prog_reporte + cod_reporte |
| Programa | Empleado | 1 | Programación reporte | N | --- | No | Cod_empleado + cod_prog_reporte |
| Supervisa | Empleado | 1 | Operación | N | --- | No | Sup+ Cod_empleado + cod_operacion |
| Ejecuta | Empleado | 1 | Operación | N | --- | No | Eje+ Cod_empleado + cod_operacion |
| Sigue a | Operación | 1 | Operación | 1 | --- | No | Cod_operacion+ cod_operacion |
| Inicia | Operación | 1 | Traslado | 1 | --- | No | Ini + cod_operacion + cod_traslado |
| Termina | Operación | 1 | Traslado | 1 | --- | No | Fin + cod_operación + cod_traslado |
| Acontece | Traslado | 1 | Incidencia | N | --- | No | Cod_traslado + Cod_incidencia |
| Cumple | Incidencia | 1 | Catálogo Contingencias | N | --- | No | Cod_incidencia + cod_cat_contignencias |
| Contiene | Catálogo Contingencias | 1 | Procedimiento | N | --- | No | Cod_cat_contingencias + cod_procedimiento |
| Requiere | Procedimiento | 1 | Pasos | N | --- | No | Cod_procedimiento + cod_pasos |
| Contiene | Catálogo Contingencias | 1 | Normas | N | --- | No | Cod_cat_contignencias + cod_norma |
| Evita | Normas | 1 | Sanción | N | --- | No | Cod_norma + cod_sancion |
| Satisfacen | Traslado | N | Pedido | N | --- | Sí | Cod_traslado + cod_pedido |
| Asigna | Traslado | 1 | Vehículo | 1 | --- | No | Cod_traslado + cod_vehículo |
| Modificado | Operación | N | Mercancía | 1 | --- | No | Cod_operacion + cod_mercancia |
| Compuesto | Mercancía | 1 | Stock | N | --- | No | Cod_mercancía + cod_stock |
| Describe | Elemento Catálogo | 1 | Stock | N | --- | No | Cod_elem_catalogo + cod_stock |
| Conforman | Elemento Catálogo | 1 | Pedido | N | --- | No | Cod_elem_catalogo + cod_pedido |
| Asignado | Transportista | 1 | Traslado | N | --- | No | Cod_transportista + cod_traslado |
| Realiza | Representante | 1 | Pedido | N | --- | No | Cod_representante + cod_pedido |
| Sobre | Reclamo | 1 | Pedido | N | --- | No | Cod_reclamo + cod_pedido |
| Registra | Empleado | 1 | Reclamo | N | --- | No | Cod_empleado + cod_reclamo |
| Trabaja en | Empleado | N | Cliente Interno | 1 | --- | No | Cod_empleado + cod_cliente_int |
| Asigna | Cliente | 1 | Representante | N | --- | No | Cod_cliente + cod_representante |
| Registra | Cliente | 1 | Local | N | --- | No | Cod_cliente + cod_local |
| Presenta | Representante | 1 | Reclamo | N | --- | No | Cod_representante + cod_reclamo |
| Tiene | Reclamo | 1 | Evidencia | N | --- | No | Cod_reclamo + cod_evidencia |
| Presenta | Reclamo | 1 | Seguimiento Reclamo | 1 | --- | No | Cod_reclamo + cod_seguimiento_rec |
| Designado a | Seguimiento Reclamo | N | Cliente Interno | 1 | --- | No | Cod_seguimiento_rec + cod_cliente_int |
| Posiciona | GPS | N | Vehículo | 1 | --- | No | Cod_gps + cod_vehículo |
| Registra | GPS | N | Ubicación | 1 | --- | No | Cod_gps + cod_ubicacion |
| Corresponde | Paradero | 1 | Local | 1 | --- | No | Cod_paradero + cod_local |
| Visita | Ruta | 1 | Paradero | N | --- | No | Cod_ruta + cod_paradero |
| Sigue | Traslado | N | Ruta | 1 | --- | No | Cod_traslado +cod_ruta |

## 3. Validación del esquema utilizando las Formas Normales
## 4. Creación de tablas y poblamiento de datos

```sql
DROP TABLE IF EXISTS reporte;
DROP TABLE IF EXISTS programacion_reporte;
DROP TABLE IF EXISTS evidencia;
DROP TABLE IF EXISTS reclamo;
DROP TABLE IF EXISTS seguimiento;
DROP TABLE IF EXISTS norma;
DROP TABLE IF EXISTS procedimiento;
DROP TABLE IF EXISTS incidencia;
DROP TABLE IF EXISTS detalle_ticket_producto;
DROP TABLE IF EXISTS detalle_ticket_traslado;
DROP TABLE IF EXISTS traslado;
DROP TABLE IF EXISTS pedido;
DROP TABLE IF EXISTS detalle_mercancia_stock;
DROP TABLE IF EXISTS stock;
DROP TABLE IF EXISTS gps;
DROP TABLE IF EXISTS representante;
DROP TABLE IF EXISTS mercancia;
DROP TABLE IF EXISTS operacion;
DROP TABLE IF EXISTS paradero;
DROP TABLE IF EXISTS transportista;
DROP TABLE IF EXISTS empleado;
DROP TABLE IF EXISTS ruta;
DROP TABLE IF EXISTS elemento_catalogo;
DROP TABLE IF EXISTS vehiculo;
DROP TABLE IF EXISTS "local";
DROP TABLE IF EXISTS ubicacion;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS persona;
DROP TABLE IF EXISTS ticket;

DROP TABLE IF EXISTS estado_civil;
DROP TABLE IF EXISTS nacionalidad;
DROP TABLE IF EXISTS genero;
DROP TABLE IF EXISTS cliente_estado;
DROP TABLE IF EXISTS cliente_tipo;
DROP TABLE IF EXISTS vehiculo_estado;
DROP TABLE IF EXISTS vehiculo_modelo;
DROP TABLE IF EXISTS elemento_catalogo_tipo;
DROP TABLE IF EXISTS elemento_catalogo_unidad;
DROP TABLE IF EXISTS ruta_tipo;
DROP TABLE IF EXISTS transportista_estado;
DROP TABLE IF EXISTS licencia_tipo;
DROP TABLE IF EXISTS norma_tipo;
DROP TABLE IF EXISTS procedimiento_tipo;
DROP TABLE IF EXISTS operacion_tipo;
DROP TABLE IF EXISTS empleado_cargo;
DROP TABLE IF EXISTS local_tipo;
DROP TABLE IF EXISTS local_region;
DROP TABLE IF EXISTS local_distrito;
DROP TABLE IF EXISTS paradero_tipo;
DROP TABLE IF EXISTS pedido_tipo;
DROP TABLE IF EXISTS pedido_estado;
DROP TABLE IF EXISTS incidencia_tipo;
DROP TABLE IF EXISTS accion_tipo;
DROP TABLE IF EXISTS reclamo_tipo;
DROP TABLE IF EXISTS estado_reclamo;
DROP TABLE IF EXISTS nivel_urgencia;
DROP TABLE IF EXISTS evidencia_tipo;
DROP TABLE IF EXISTS archivo_tipo;
DROP TABLE IF EXISTS reporte_formato;
DROP TABLE IF EXISTS reporte_estado;

/* CREAR LOOKUP TABLES */

CREATE TABLE IF NOT EXISTS estado_civil (
 cod_estado_civil INT NOT NULL,
 descripcion VARCHAR(16),
 PRIMARY KEY (cod_estado_civil)
);

CREATE TABLE IF NOT EXISTS nacionalidad (
 cod_nacionalidad INT NOT NULL,
 descripcion VARCHAR(16),
 PRIMARY KEY (cod_nacionalidad)
);

CREATE TABLE IF NOT EXISTS genero (
 cod_genero INT NOT NULL,
 descripcion VARCHAR(16),
 PRIMARY KEY (cod_genero)
);

CREATE TABLE IF NOT EXISTS cliente_estado (
 cod_cliente_estado CHAR(1) NOT NULL,
 estado_cliente VARCHAR(20) NULL,
 PRIMARY KEY (cod_cliente_estado)

);

CREATE TABLE IF NOT EXISTS cliente_tipo (
 cod_cliente_tipo CHAR(1) NOT NULL,
 tipo_cliente VARCHAR(20) NULL,
 PRIMARY KEY (cod_cliente_tipo)
);

CREATE TABLE IF NOT EXISTS vehiculo_estado (
 cod_vehiculo_estado CHAR(1),
 descripcion VARCHAR(20),
 PRIMARY KEY (cod_vehiculo_estado)
);

CREATE TABLE IF NOT EXISTS vehiculo_modelo (
 cod_vehiculo_modelo CHAR(1),
 descripcion VARCHAR(20),
 PRIMARY KEY (cod_vehiculo_modelo)
);

CREATE TABLE IF NOT EXISTS elemento_catalogo_tipo (
 id_elemento_catalogo_tipo INT NOT NULL,
 descripcion VARCHAR(30) NOT NULL,
 PRIMARY KEY (id_elemento_catalogo_tipo)
);

CREATE TABLE IF NOT EXISTS elemento_catalogo_unidad (
 cod_unidad INT NOT NULL,
 descripcion VARCHAR(30),
 PRIMARY KEY (cod_unidad)
);

CREATE TABLE IF NOT EXISTS ruta_tipo (
 cod_ruta_tipo INT NOT NULL,
 descripcion VARCHAR(32),
 PRIMARY KEY (cod_ruta_tipo)
);

CREATE TABLE IF NOT EXISTS empleado_cargo (
 cod_empleado_cargo INT NOT NULL,
 descripcion VARCHAR(32),
 PRIMARY KEY (cod_empleado_cargo)
);

CREATE TABLE IF NOT EXISTS transportista_estado (
 cod_estado_transportista CHAR(1) NOT NULL,
 descripcion VARCHAR(20) NULL DEFAULT NULL,
 PRIMARY KEY (cod_estado_transportista)
);

CREATE TABLE IF NOT EXISTS licencia_tipo (
 cod_tipo_licencia CHAR(1) NOT NULL,
 descripcion VARCHAR(20) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_licencia)
);

CREATE TABLE IF NOT EXISTS operacion_tipo (
 cod_tipo_operacion INT NOT NULL,
 descripcion VARCHAR(10),
 PRIMARY KEY (cod_tipo_operacion)
);

CREATE TABLE IF NOT EXISTS local_tipo (
 cod_local_tipo INT NOT NULL,
 descripcion VARCHAR(32),
 PRIMARY KEY (cod_local_tipo)
);

CREATE TABLE IF NOT EXISTS local_region (
 cod_local_region INT NOT NULL,
 descripcion VARCHAR(16),
 PRIMARY KEY (cod_local_region)
);

CREATE TABLE IF NOT EXISTS local_distrito (
 cod_local_distrito INT NOT NULL,
 descripcion VARCHAR(64),
 PRIMARY KEY (cod_local_distrito)
);

CREATE TABLE IF NOT EXISTS paradero_tipo (
 cod_paradero_tipo INT NOT NULL,
 descripcion VARCHAR(32),
 PRIMARY KEY (cod_paradero_tipo)
);

CREATE TABLE IF NOT EXISTS pedido_tipo (
 cod_pedido_tipo CHAR(1) NOT NULL,
 tipo_pedido VARCHAR(20) NULL,
 PRIMARY KEY (cod_pedido_tipo)
);

CREATE TABLE IF NOT EXISTS pedido_estado (
 cod_pedido_estado CHAR(1) NOT NULL,
 estado_pedido VARCHAR(20) NULL,
 PRIMARY KEY (cod_pedido_estado)
);

CREATE TABLE IF NOT EXISTS incidencia_tipo (
 cod_tipo_incidencia CHAR(1) NOT NULL,
 descripcion VARCHAR(60) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_incidencia)
);

CREATE TABLE IF NOT EXISTS procedimiento_tipo (
 cod_tipo_procedimiento CHAR(1) NOT NULL,
 descripcion VARCHAR(60) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_procedimiento)
);

CREATE TABLE IF NOT EXISTS norma_tipo (
 cod_norma_tipo CHAR(1) NOT NULL,
 descripcion VARCHAR(60) NULL DEFAULT NULL,
 PRIMARY KEY (cod_norma_tipo)
);

CREATE TABLE IF NOT EXISTS accion_tipo (
 cod_tipo_accion CHAR(1) NOT NULL,
 descripcion VARCHAR(60) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_accion)
);

CREATE TABLE IF NOT EXISTS reclamo_tipo (
 cod_tipo_reclamo CHAR(1) NOT NULL,
 descripcion VARCHAR(100) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_reclamo)
);

CREATE TABLE IF NOT EXISTS estado_reclamo (
 cod_estado_reclamo CHAR(1) NOT NULL,
 descripcion VARCHAR(15) NULL DEFAULT NULL,
 PRIMARY KEY (cod_estado_reclamo)
);

CREATE TABLE IF NOT EXISTS nivel_urgencia (
 cod_nivel_urgencia CHAR(1) NOT NULL,
 descripcion VARCHAR(15) NULL DEFAULT NULL,
 PRIMARY KEY (cod_nivel_urgencia)
);

CREATE TABLE IF NOT EXISTS evidencia_tipo (
 cod_tipo_evidencia CHAR(1) NOT NULL,
 descripcion VARCHAR(30) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_evidencia)
);

CREATE TABLE IF NOT EXISTS archivo_tipo (
 cod_tipo_archivo INT NOT NULL,
 descripcion VARCHAR(5) NULL DEFAULT NULL,
 PRIMARY KEY (cod_tipo_archivo)
);

CREATE TABLE IF NOT EXISTS reporte_formato (
 cod_reporte_formato INT NOT NULL,
 descripcion VARCHAR(32),
 PRIMARY KEY (cod_reporte_formato)
);

CREATE TABLE IF NOT EXISTS reporte_estado (
 cod_reporte_estado INT NOT NULL,
 descripcion VARCHAR(16),
 PRIMARY KEY (cod_reporte_estado)
);

/* CREAR TABLAS */

CREATE TABLE IF NOT EXISTS persona (
 cod_persona SERIAL,
 cod_estado_civil INT NOT NULL,
 cod_nacionalidad INT NOT NULL,
 cod_genero INT NOT NULL,
 dni CHAR(8) NOT NULL,
 primer_apellido VARCHAR(32) NULL DEFAULT NULL,
 segundo_apellido VARCHAR(32) NULL DEFAULT NULL,
 prenombre VARCHAR(32) NULL DEFAULT NULL,
 direccion VARCHAR(128) NULL DEFAULT NULL,
 PRIMARY KEY (cod_persona),
 CONSTRAINT cod_estado_civil
 FOREIGN KEY (cod_estado_civil)
 REFERENCES estado_civil (cod_estado_civil),
 CONSTRAINT cod_nacionalidad
 FOREIGN KEY (cod_nacionalidad)
 REFERENCES nacionalidad (cod_nacionalidad),
 CONSTRAINT cod_genero
 FOREIGN KEY (cod_genero)
 REFERENCES genero (cod_genero)
);

CREATE TABLE IF NOT EXISTS cliente (
 cod_cliente SERIAL,
 cod_cliente_tipo CHAR(1) NOT NULL,
 cod_cliente_estado CHAR(1) NOT NULL,
 nombre VARCHAR(32) NOT NULL,
 ruc CHAR(11) NOT NULL,
 razon_social VARCHAR(120) NOT NULL,
 fecha_registro DATE NOT NULL,
 PRIMARY KEY (cod_cliente),
 CONSTRAINT cod_cliente_tipo
 FOREIGN KEY (cod_cliente_tipo)
 REFERENCES cliente_tipo (cod_cliente_tipo),
 CONSTRAINT cod_cliente_estado
 FOREIGN KEY (cod_cliente_estado)
 REFERENCES cliente_estado (cod_cliente_estado)
);

CREATE TABLE IF NOT EXISTS ubicacion (
 cod_ubicacion SERIAL NOT NULL,
 longitud FLOAT NOT NULL,
 latitud FLOAT NOT NULL,
 PRIMARY KEY (cod_ubicacion)
);

CREATE TABLE IF NOT EXISTS ticket (
 cod_ticket SERIAL NOT NULL,
 fecha_entrega DATE NOT NULL,
 PRIMARY KEY (cod_ticket)
);

CREATE TABLE IF NOT EXISTS vehiculo (
 cod_vehiculo SERIAL NOT NULL,
 cod_vehiculo_estado CHAR(1) NOT NULL,
 anio_fabricacion INT NOT NULL,
 fecha_ultimo_mantenimiento DATE NOT NULL,
 fecha_ultimo_viaje DATE NOT NULL,
 capacidad_carga FLOAT NOT NULL CHECK (capacidad_carga > 0),
 cod_vehiculo_modelo CHAR(1) NOT NULL,
 placa CHAR(7) NOT NULL,
 PRIMARY KEY (cod_vehiculo),
 CONSTRAINT cod_vehiculo_estado
 FOREIGN KEY (cod_vehiculo_estado)
 REFERENCES vehiculo_estado (cod_vehiculo_estado),
 CONSTRAINT cod_vehiculo_modelo
 FOREIGN KEY (cod_vehiculo_modelo)
 REFERENCES vehiculo_modelo (cod_vehiculo_modelo)
);

CREATE TABLE IF NOT EXISTS elemento_catalogo (
 id_elemento_catalogo SERIAL NOT NULL,
 nombre VARCHAR(128) NOT NULL,
 id_elemento_catalogo_tipo INT NOT NULL,
 descripcion VARCHAR(256) NOT NULL,
 cod_unidad INT NOT NULL,
 temperatura_minima FLOAT NULL DEFAULT NULL,
 temperatura_maxima FLOAT NULL DEFAULT NULL,
 vida_util FLOAT NULL DEFAULT NULL CHECK (vida_util > 0),
 peso_unitario FLOAT NOT NULL CHECK (peso_unitario > 0),
 PRIMARY KEY (id_elemento_catalogo),
 CONSTRAINT id_elemento_catalogo_tipo
 FOREIGN KEY (id_elemento_catalogo_tipo)
 REFERENCES elemento_catalogo_tipo (id_elemento_catalogo_tipo),
 CONSTRAINT cod_unidad
 FOREIGN KEY (cod_unidad)
 REFERENCES elemento_catalogo_unidad (cod_unidad)
);

CREATE TABLE IF NOT EXISTS ruta (
 cod_ruta SERIAL NOT NULL,
 distancia_total FLOAT NOT NULL CHECK (distancia_total > 0),
 cod_ruta_tipo INT NOT NULL,
 duracion FLOAT NOT NULL CHECK (duracion > 0),
 PRIMARY KEY (cod_ruta),
 CONSTRAINT cod_ruta_tipo
 FOREIGN KEY (cod_ruta_tipo)
 REFERENCES ruta_tipo (cod_ruta_tipo)
);

CREATE TABLE IF NOT EXISTS empleado (
 cod_empleado SERIAL,
 cod_cliente INT NOT NULL,
 cod_persona INT NOT NULL,
 cod_empleado_cargo INT NOT NULL,
 fecha_contrato DATE NOT NULL,
 PRIMARY KEY (cod_empleado),
 CONSTRAINT cod_cliente
 FOREIGN KEY (cod_cliente)
 REFERENCES cliente (cod_cliente),
 CONSTRAINT cod_persona
 FOREIGN KEY (cod_persona)
 REFERENCES persona (cod_persona),
 CONSTRAINT cod_empleado_cargo
 FOREIGN KEY (cod_empleado_cargo)
 REFERENCES empleado_cargo (cod_empleado_cargo)
);

CREATE TABLE IF NOT EXISTS transportista (
cod_transportista SERIAL NOT NULL,
cod_empleado INT NOT NULL,
cod_estado_transportista CHAR(1) DEFAULT NULL,
cod_tipo_licencia CHAR(1) NULL DEFAULT NULL,
num_licencia VARCHAR(7) NULL DEFAULT NULL,
fecha_vencimiento_licencia DATE NOT NULL,
fecha_ultimo_traslado DATE NULL DEFAULT NULL,
PRIMARY KEY (cod_transportista),
CONSTRAINT cod_empleado
 FOREIGN KEY (cod_empleado)
 REFERENCES empleado (cod_empleado),
CONSTRAINT cod_estado_transportista
 FOREIGN KEY (cod_estado_transportista)
 REFERENCES transportista_estado (cod_estado_transportista),
CONSTRAINT cod_tipo_licencia
 FOREIGN KEY (cod_tipo_licencia)
 REFERENCES licencia_tipo (cod_tipo_licencia)
);

CREATE TABLE IF NOT EXISTS operacion (
 id_operacion SERIAL,
 id_operacion_picking INT NULL DEFAULT NULL,
 cod_empleado_ejecutor INT NOT NULL,
 cod_empleado_supervisor INT NOT NULL,
 fecha DATE NOT NULL,
 hora_inicio TIME NOT NULL,
 hora_fin TIME NOT NULL,
 cod_tipo_operacion INT NOT NULL,
 PRIMARY KEY (id_operacion),
 CONSTRAINT cod_empleado_ejecutor
 FOREIGN KEY (cod_empleado_ejecutor)
 REFERENCES empleado (cod_empleado),
 CONSTRAINT cod_empleado_supervisor
 FOREIGN KEY (cod_empleado_supervisor)
 REFERENCES empleado (cod_empleado),
 CONSTRAINT id_operacion_picking
 FOREIGN KEY (id_operacion_picking)
 REFERENCES operacion (id_operacion),
 CONSTRAINT cod_tipo_operacion
 FOREIGN KEY (cod_tipo_operacion)
 REFERENCES operacion_tipo (cod_tipo_operacion)
);

CREATE TABLE IF NOT EXISTS mercancia (
 id_mercancia SERIAL,
 id_operacion_picking INT NOT NULL,
 cantidad_productos INT NOT NULL DEFAULT 0,
 nro_precinto CHAR(20) NULL DEFAULT NULL,
 peso_total FLOAT NOT NULL DEFAULT 0,
 PRIMARY KEY (id_mercancia),
 CONSTRAINT id_operacion_picking
 FOREIGN KEY (id_operacion_picking)
 REFERENCES operacion (id_operacion)
);

CREATE TABLE IF NOT EXISTS representante (
 cod_representante SERIAL,
 cod_cliente INT NOT NULL,
 cod_persona INT NOT NULL,
 num_telefono VARCHAR(20) NULL DEFAULT NULL,
 correo_empresarial VARCHAR(50) NULL DEFAULT NULL,
 cargo VARCHAR(40) NULL DEFAULT NULL,
 PRIMARY KEY (cod_representante),
 CONSTRAINT cod_cliente
 FOREIGN KEY (cod_cliente)
 REFERENCES cliente (cod_cliente),
 CONSTRAINT cod_persona
 FOREIGN KEY (cod_persona)
 REFERENCES persona (cod_persona)
);

CREATE TABLE IF NOT EXISTS gps (
 cod_gps SERIAL,
 cod_ubicacion INT NOT NULL,
 cod_vehiculo INT NOT NULL,
 fecha_ubicacion DATE NOT NULL,
 hora_ubicacion TIME NOT NULL,
 PRIMARY KEY (cod_gps),
 CONSTRAINT cod_ubicacion
 FOREIGN KEY (cod_ubicacion)
 REFERENCES ubicacion (cod_ubicacion),
 CONSTRAINT cod_vehiculo
 FOREIGN KEY (cod_vehiculo)
 REFERENCES vehiculo (cod_vehiculo)
);

CREATE TABLE IF NOT EXISTS "local" (
 cod_local SERIAL NOT NULL,
 cod_cliente INT NOT NULL,
 cod_ubicacion INT NOT NULL,
 cod_local_tipo INT NOT NULL,
 cod_local_region INT NOT NULL,
 cod_local_distrito INT NOT NULL,
 calle VARCHAR(64) NULL,
 numero INT NULL,
 pais VARCHAR(8) NOT NULL,
 PRIMARY KEY (cod_local),
 CONSTRAINT cod_cliente
 FOREIGN KEY (cod_cliente)
 REFERENCES cliente (cod_cliente),
 CONSTRAINT cod_ubicacion
 FOREIGN KEY (cod_ubicacion)
 REFERENCES ubicacion (cod_ubicacion),
 CONSTRAINT cod_local_tipo
 FOREIGN KEY (cod_local_tipo)
 REFERENCES local_tipo (cod_local_tipo),
 CONSTRAINT cod_local_region
 FOREIGN KEY (cod_local_region)
 REFERENCES local_region (cod_local_region),
 CONSTRAINT cod_local_distrito
 FOREIGN KEY (cod_local_distrito)
 REFERENCES local_distrito (cod_local_distrito)
);

CREATE TABLE IF NOT EXISTS paradero (
 cod_paradero SERIAL NOT NULL,
 cod_ruta INT NOT NULL,
 cod_local INT NOT NULL,
 cod_paradero_tipo INT NOT NULL,
 orden INT NOT NULL CHECK (orden > 0),
 PRIMARY KEY (cod_paradero),
 CONSTRAINT cod_ruta
 FOREIGN KEY (cod_ruta)
 REFERENCES ruta (cod_ruta),
 CONSTRAINT cod_local
 FOREIGN KEY (cod_local)
 REFERENCES local (cod_local),
 CONSTRAINT cod_paradero_tipo
 FOREIGN KEY (cod_paradero_tipo)
 REFERENCES paradero_tipo (cod_paradero_tipo)
);

CREATE TABLE IF NOT EXISTS stock (
 id_stock SERIAL NOT NULL,
 cod_stock CHAR(17) NOT NULL,
 id_elemento_catalogo INT NOT NULL,
 nro_lote INT NULL DEFAULT NULL,
 fecha_caducidad DATE NOT NULL,
 PRIMARY KEY (id_stock),
 CONSTRAINT id_elemento_catalogo
 FOREIGN KEY (id_elemento_catalogo)
 REFERENCES elemento_catalogo (id_elemento_catalogo),
);

CREATE TABLE IF NOT EXISTS detalle_mercancia_stock(
 id_mercancia INT NOT NULL,
 id_stock INT NOT NULL,
 cantidad INT NOT NULL,
 FOREIGN KEY (id_mercancia) REFERENCES mercancia (id_mercancia),
 FOREIGN KEY (id_stock) REFERENCES stock (id_stock),
 PRIMARY KEY (id_mercancia, id_stock)
);

CREATE TABLE IF NOT EXISTS pedido (
 cod_pedido SERIAL,
 cod_representante INT NOT NULL,
 cod_empleado INT NOT NULL,
 cod_pedido_tipo CHAR(1) NULL DEFAULT NULL,
 cod_pedido_estado CHAR(1) NOT NULL,
 fecha_registro DATE NOT NULL,
 cod_ticket INT NOT NULL,
 PRIMARY KEY (cod_pedido),
 CONSTRAINT cod_representante
 FOREIGN KEY (cod_representante)
 REFERENCES representante (cod_representante),
 CONSTRAINT cod_empleado
 FOREIGN KEY (cod_empleado)
 REFERENCES empleado (cod_empleado),
 CONSTRAINT cod_pedido_tipo
 FOREIGN KEY (cod_pedido_tipo)
 REFERENCES pedido_tipo (cod_pedido_tipo),
 CONSTRAINT cod_pedido_estado
 FOREIGN KEY (cod_pedido_estado)
 REFERENCES pedido_estado (cod_pedido_estado),
 CONSTRAINT cod_ticket
 FOREIGN KEY (cod_ticket)
 REFERENCES ticket (cod_ticket)
);

CREATE TABLE IF NOT EXISTS traslado (
 id_traslado SERIAL,
 cod_guia_remision CHAR(21) NOT NULL,
 cod_vehiculo INT NOT NULL,
 cod_ruta INT NOT NULL,
 cod_transportista INT NOT NULL,
 id_operacion_inicia INT NOT NULL,
 id_operacion_termina INT NULL DEFAULT NULL,
 PRIMARY KEY (id_traslado),
 CONSTRAINT id_operacion_inicia
 FOREIGN KEY (id_operacion_inicia)
 REFERENCES operacion (id_operacion),
 CONSTRAINT id_operacion_termina
 FOREIGN KEY (id_operacion_termina)
 REFERENCES operacion (id_operacion),
 CONSTRAINT cod_ruta
 FOREIGN KEY (cod_ruta)
 REFERENCES ruta (cod_ruta),
 CONSTRAINT cod_transportista
 FOREIGN KEY (cod_transportista)
 REFERENCES transportista (cod_transportista),
 CONSTRAINT cod_vehiculo
 FOREIGN KEY (cod_vehiculo)
 REFERENCES vehiculo (cod_vehiculo)
);

CREATE TABLE IF NOT EXISTS detalle_ticket_traslado (
 id_traslado INT NOT NULL,
 cod_ticket INT NOT NULL,
 PRIMARY KEY (id_traslado, cod_ticket),
 CONSTRAINT id_traslado
 FOREIGN KEY (id_traslado)
 REFERENCES traslado (id_traslado),
 CONSTRAINT cod_ticket
 FOREIGN KEY (cod_ticket)
 REFERENCES ticket (cod_ticket)
);


CREATE TABLE IF NOT EXISTS detalle_ticket_producto (
 cod_ticket INT NOT NULL,
 id_elemento_catalogo INT NOT NULL,
 cantidad INT NOT NULL CHECK (cantidad > 0),
 PRIMARY KEY (cod_ticket, id_elemento_catalogo),
 CONSTRAINT cod_ticket
 FOREIGN KEY (cod_ticket)
 REFERENCES ticket (cod_ticket),
 CONSTRAINT id_elemento_catalogo
 FOREIGN KEY (id_elemento_catalogo)
 REFERENCES elemento_catalogo (id_elemento_catalogo)
);

CREATE TABLE IF NOT EXISTS incidencia (
 cod_incidencia SERIAL NOT NULL,
 id_traslado INT NOT NULL,
 cod_tipo_incidencia CHAR(1) NOT NULL,
 descripcion VARCHAR(128) NULL DEFAULT NULL,
 fecha_ocurrencia DATE NULL DEFAULT NULL,
 PRIMARY KEY (cod_incidencia),
 CONSTRAINT id_traslado
 FOREIGN KEY (id_traslado)
 REFERENCES traslado (id_traslado),
 CONSTRAINT cod_tipo_incidencia
 FOREIGN KEY (cod_tipo_incidencia)
 REFERENCES incidencia_tipo (cod_tipo_incidencia)
);

CREATE TABLE IF NOT EXISTS procedimiento (
cod_procedimiento SERIAL NOT NULL,
cod_incidencia INT NOT NULL,
cod_tipo_procedimiento CHAR(1) NOT NULL,
nombre VARCHAR(64) NULL DEFAULT NULL,
tiempo_estimado INT NOT NULL CHECK (tiempo_estimado > 0),
PRIMARY KEY (cod_procedimiento),
CONSTRAINT cod_tipo_procedimiento
 FOREIGN KEY (cod_tipo_procedimiento)
 REFERENCES procedimiento_tipo (cod_tipo_procedimiento),
CONSTRAINT cod_incidencia
 FOREIGN KEY (cod_incidencia)
 REFERENCES incidencia (cod_incidencia)
);

CREATE TABLE IF NOT EXISTS norma (
cod_norma SERIAL NOT NULL,
cod_incidencia INT NOT NULL,
cod_norma_tipo CHAR(1) NOT NULL,
fecha_emision DATE NOT NULL,
fecha_vigencia DATE NOT NULL,
PRIMARY KEY (cod_norma),
CONSTRAINT cod_incidencia
 FOREIGN KEY (cod_incidencia)
 REFERENCES incidencia (cod_incidencia),
CONSTRAINT cod_norma_tipo
 FOREIGN KEY (cod_norma_tipo)
 REFERENCES norma_tipo (cod_norma_tipo)
);

CREATE TABLE IF NOT EXISTS seguimiento (
 cod_seguimiento SERIAL NOT NULL,
 cod_cliente_interno INT NOT NULL,
 cod_tipo_accion CHAR(1) NOT NULL,
 comentario VARCHAR(250) NULL DEFAULT NULL,
 fecha_resolucion DATE NOT NULL,
 numero_caso INT NOT NULL,
 PRIMARY KEY (cod_seguimiento),
 CONSTRAINT cod_cliente_interno
 FOREIGN KEY (cod_cliente_interno)
 REFERENCES cliente (cod_cliente),
 CONSTRAINT cod_tipo_accion
 FOREIGN KEY (cod_tipo_accion)
 REFERENCES accion_tipo (cod_tipo_accion)
);

CREATE TABLE IF NOT EXISTS reclamo (
 cod_reclamo SERIAL NOT NULL,
 cod_representante INT NOT NULL,
 cod_pedido INT NOT NULL,
 cod_seguimiento INT NOT NULL,
 cod_tipo_reclamo CHAR(1) NOT NULL,
 cod_nivel_urgencia CHAR(1) NOT NULL,
 cod_estado_reclamo CHAR(1) NOT NULL,
 comentario VARCHAR(200) NULL DEFAULT NULL,
 fecha_suceso DATE NOT NULL,
 fecha_reclamo DATE NOT NULL,
 PRIMARY KEY (cod_reclamo),
 CONSTRAINT cod_representante
 FOREIGN KEY (cod_representante)
 REFERENCES representante (cod_representante),
 CONSTRAINT cod_pedido
 FOREIGN KEY (cod_pedido)
 REFERENCES pedido (cod_pedido),
 CONSTRAINT cod_seguimiento
 FOREIGN KEY (cod_seguimiento)
 REFERENCES seguimiento (cod_seguimiento),
 CONSTRAINT cod_tipo_reclamo
 FOREIGN KEY (cod_tipo_reclamo)
 REFERENCES reclamo_tipo (cod_tipo_reclamo),
 CONSTRAINT cod_nivel_urgencia
 FOREIGN KEY (cod_nivel_urgencia)
 REFERENCES nivel_urgencia (cod_nivel_urgencia),
 CONSTRAINT cod_estado_reclamo
 FOREIGN KEY (cod_estado_reclamo)
 REFERENCES estado_reclamo (cod_estado_reclamo)
);

CREATE TABLE IF NOT EXISTS evidencia (
 cod_evidencia SERIAL NOT NULL,
 cod_reclamo INT NOT NULL,
 cod_tipo_evidencia CHAR(1) NOT NULL,
 cod_tipo_archivo INT NOT NULL,
 nombre_evidencia VARCHAR(60) NULL DEFAULT NULL,
 PRIMARY KEY (cod_evidencia),
 CONSTRAINT cod_reclamo
 FOREIGN KEY (cod_reclamo)
 REFERENCES reclamo (cod_reclamo),
 CONSTRAINT cod_tipo_evidencia
 FOREIGN KEY (cod_tipo_evidencia)
 REFERENCES evidencia_tipo (cod_tipo_evidencia),
 CONSTRAINT cod_tipo_archivo
 FOREIGN KEY (cod_tipo_archivo)
 REFERENCES archivo_tipo (cod_tipo_archivo)
);

CREATE TABLE IF NOT EXISTS programacion_reporte (
 cod_programacion_reporte SERIAL NOT NULL,
 cod_representante INT NOT NULL,
 cod_reporte_formato INT NOT NULL,
 cod_reporte_estado INT NULL DEFAULT NULL,
 frecuencia VARCHAR(32) NULL DEFAULT NULL,
 filtros VARCHAR(32)[] NULL DEFAULT NULL,
 fecha_inicio DATE NOT NULL,
 fecha_fin TIME NOT NULL,
 PRIMARY KEY (cod_programacion_reporte),
 CONSTRAINT cod_empleado
 FOREIGN KEY (cod_representante)
 REFERENCES representante (cod_representante),
 CONSTRAINT cod_reporte_formato
 FOREIGN KEY (cod_reporte_formato)
 REFERENCES reporte_formato (cod_reporte_formato),
 CONSTRAINT cod_reporte_estado
 FOREIGN KEY (cod_reporte_estado)
 REFERENCES reporte_estado (cod_reporte_estado)
);

CREATE TABLE IF NOT EXISTS reporte (
 cod_reporte SERIAL NOT NULL,
 cod_programacion_reporte INT NOT NULL,
 fecha_generacion DATE NOT NULL,
 hora_generacion TIME NOT NULL,
 PRIMARY KEY (cod_reporte),
 CONSTRAINT cod_programacion_reporte
 FOREIGN KEY (cod_programacion_reporte)
 REFERENCES programacion_reporte (cod_programacion_reporte)
);

