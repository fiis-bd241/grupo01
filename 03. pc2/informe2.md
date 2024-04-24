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
| cod_cliente| CHAR | 999999999 | 9 dígitos | -  | -  | Código único que identifica al cliente. | 
| estado | CHAR  | X(32)| Activo, Inactivo, Pendiente | - | - | Estado actual del cliente en la plataforma. | 
| prioridad | INT  |  9  | 1, 2, 3, ...  | -  | -  | Prioridad asignada al cliente para atención. | 
| fecha_registro | DATE | AAAAMMDD | NO NULL | -  | - | Fecha en que el cliente fue registrado en el sistema. | 

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
| fecha_ubicacion | DATE | AAAAMMDD | NO NULL | - | - |  Fecha específica en las que el vehículo se encuentra en la ubicación |  
| hora_ubicacion | TIME| HHMMSS | NO NULL | - | - |  Hora específica en las que el vehículo se encuentra en la ubicación | 

**Entidad**: Incidencia  

Semántica: Problema, situación anormal o evento no planificado.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_incidencia | CHAR | 999999999 | 9 digitos | - | - | - | Código único que identifica la incidencia.|  
| tipo_incidencia | CHAR | x(32)| - | - | - | Tipo de incidencia que ha ocurrido. Puede ser de diferentes categorías, como técnica, operativa, etc. |  
| descripcion | CHAR | x(128) | - | - | - | Descripción detallada de la incidencia.|  
| fecha_incidencia | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que ocurrió la incidencia. |  

**Entidad**: Local  

Semántica: Lugar físico que cuenta con una dirección legal registrada.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_local | CHAR | 999999999 | 9 dígitos | - | - | Identificador del local |  
| pais | CHAR | xxx | ISO 3166-1 alfa-3 | - | - | República donde se encuentra el local |  
| region | CHAR | xx-xxx | ISO 3166-2 | - | - | Departamento / Estado donde se encuentra el local |  
| distrito | CHAR | X(64) | NO NULL | - | - | Ciudad donde se encuentra el local |  
| calle | CHAR | X(64) | NO NULL | - | - | Calle, Jirón, Avenida, Pasaje donde se encuentra el local |  
| numero | INT | 9999 | 4 dígitos | - | - | Identificador numérico de domicilio |  
| tipo_local | CHAR | X(16) | Refrigerante, almacén, recepción,etc | - | - | Indica el tipo de local |  

**Entidad**: Mercancía  

 Semántica: Representar los diferentes productos que una empresa tiene en su inventario para la venta o distribución.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cantidad_producto | INT | 9999 | unidades | - | - | Cantidad de productos disponibles |  
| numero_precinto | CHAR | 999999999 | 9 dígitos | - | - | Número de precinto asociado a la mercancía |  
| peso_total | INT | 999 | >=0 | - | - | Peso total de la mercancía |  
| cod_operacion | CHAR | 999999999 | 9 dígitos | - | - | Identificador de la operación tipo picking que asignó las existencias a la mercancía |  

 **Entidad:** Normas  

 Semántica: Conjunto de reglas o directrices establecidas para regular un comportamiento específico o para guiar una actividad particular. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| código_norma | CHAR| 999999999 | 9 dígitos | - | -- | Identificador de la norma |  
| fecha_emisión | DATE | AAAAMMDD |NO NULL| --- | --- | Indica la fecha de publicación de la norma |  
| fecha_vigencia | DATE | AAAAMMDD |NO NULL | - | - | Indica la vigencia de la norma para su cumplimiento|  
| tipo | CHAR | X | X, Y,Z, etc. | - | - | Indica el tipo de norma  |  

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

**Entidad:** Pasos  

Semántica: Conjunto de actividades pertenecientes a un procedimiento. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
|cod_paso| CHAR | 999999999 | 9 dígitos | - | - | Identificador de paso| 
|descripcion|CHAR|X(64)|-|-|-|Describe en que consiste un conjunto de pasos| 

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

Semántica: Recurso que engloba una lista da pasos. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_procedimiento | CHAR| 999999999 | 9 dígitos | - | -- | Identificador del procedimiento |  
| descripción| CHAR | X(64) | NO NULL | - | - | Explicación detallada del procedimiento | 
| duracion | INT | 999 | >0 | horas | - | Representa la duración estimada de la aplicación del procedimeiento. | 
| tipo | CHAR | X | X,Y,Z, etc | - | - | Indica el tipo de procedimiento | 

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
| punto_origen | CHAR | 999999999 | 9 dígitos | - | - | Representa la ubicación exacta del local de donde parte el vehículo. |  
| punto_destino | CHAR | 999999999 | 9 dígitos | - | - | Representa la ubicación exacta del local a donde llega el vehículo. |  
| distancia_total | INT | 9999 | >0 | Kilómetros | - | Indica la distancia total en unidades específicas entre el punto de origen y el punto de destino. |  
| tipo_ruta | CHAR | X(6) | Urbana, Rural | - | - | Clasificación que define la naturaleza y características principales de la ruta. |  
| duracion | INT | 999 | >0 | horas | - | Representa la duración estimada de la ruta en el sistema. |  

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

**Entidad:** Tramo 

Semántica: Segmento transitable de ruta entre dos locales  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN | 
|----------|------------|---------|------------------|--------|-------------|--------------| 
| local_origen | CHAR | 999999999| 9 dígitos | - | - | Ubicación del local donde inicia el tramo| 
| local_destino | CHAR | 999999999 | 9 dígitos | - | - | Ubicación del local destino del tramo | 
| distancia | FLOAT | 9999 | >0 | Kilómetros | - | Distancia entre el punto origen y destino en kilómetros | 
| tiempo_estimado | FLOAT| 999 | >0 | Horas | - | Tiempo estimado para recorrer el tramo | 
| estado_tramo | CHAR| x(32) | "Disponible”, “Tráfico”, “Cerrado” | - | - | Circunstancias en las que se encuentra el tramo | 

**Entidad**: Transportista  

Semántica: Entidad que representa a los empleados de la empresa San Fernando que se encargan de realizar los traslados de mercancía.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| cod_transportista | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del transportista dentro de la organización. |  
| fecha_ultima_traslado | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que el transportista realizó su última actividad. |  
| estado | CHAR | X(16) | "Activo", "Inactivo" | - | - | Indica si el transportista se encuentra activo o inactivo en este momento. |  
| numero_licencia | CHAR | 9999999999 | 9 digitos | - | - | Código de la licencia de conducir del transportista. |  
| tipo_licencia | CHAR | X(32) |- | - | - | Tipo de licencia de conducir que posee el transportista. |  

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
| cod_vehiculo | CHAR | 999999999 | 9 dígitos | - | - | Identificador del vehículo en el sistema. |  
| placa | CHAR | XXX999 | Alfanumérico | - | - | Número de placa del vehículo. |  
| estado | CHAR | X(32) | Activo, Inactivo | - | - | Estado actual del vehículo. |  
| anio_fabricacion | INT | 9999 | Año válido | - | - | Año en que fue fabricado el vehículo. |  
| capacidad_carga | FLOAT | 999.99 | x>0 | - | - | Capacidad máxima de carga del vehículo. |  
| modelo | CHAR | X(64) | NO NULO | - | - | Modelo del vehículo. |  
| fecha_último_viaje | DATE | AAAAMMDD | NO NULL | - | - | Fecha en que el vehículo realizó su último viaje. | 
| fecha_último_mantenimiento | DATE | AAAAMMDD | NO NULL | - | - | Fecha en que el vehículo realizó su último mantenimiento. | 

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
| Conforma | Local | 2 | Tramo | 1 | --- | No | Cod_local + cod_tramo |
| Conforma | Tramo | N | Ruta | 1 | --- | No | Cod_tramo + cod_ruta |
| Sigue | Traslado | N | Ruta | 1 | --- | No | Cod_traslado +cod_ruta |

## 3. Validación del esquema utilizando las Formas Normales
## 4. Creación de Tablas

```sql

CREATE TABLE IF NOT EXISTS cliente (
  cod_cliente CHAR(9) NOT NULL,
  estado VARCHAR(45) NULL,
  prioridad VARCHAR(45) NULL,
  fecha_registro DATE NULL,
  PRIMARY KEY (cod_cliente));
 
CREATE TABLE IF NOT EXISTS cliente_interno (
  cod_area CHAR(9) NOT NULL,
  cod_cliente CHAR(9) NOT NULL,
  nombre_area VARCHAR(45) NULL,
  PRIMARY KEY (cod_area),
  CONSTRAINT cod_cliente_interno
    FOREIGN KEY (cod_cliente)
    REFERENCES cliente (cod_cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
CREATE TABLE IF NOT EXISTS cliente_externo (
  ruc CHAR(9) NOT NULL,
  cod_cliente CHAR(9) NOT NULL,
  nombre_empresa VARCHAR(45) NULL,
  razon_social VARCHAR(45) NULL,
  PRIMARY KEY (ruc),
  CONSTRAINT cod_cliente_externo
    FOREIGN KEY (cod_cliente)
    REFERENCES cliente (cod_cliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
	
CREATE TABLE IF NOT EXISTS ruta (
  cod_ruta CHAR(9) NOT NULL,
  punto_origen VARCHAR(45) NULL,
  punto_destino VARCHAR(45) NULL,
  distancia_total FLOAT NULL,
  tipo_ruta VARCHAR(45) NULL,
  duracion VARCHAR(45) NULL,
  PRIMARY KEY (cod_ruta));
  
CREATE TABLE IF NOT EXISTS persona (
  dni CHAR(9) NOT NULL,
  direccion VARCHAR(45) NULL DEFAULT NULL,
  estado_civil VARCHAR(45) NULL DEFAULT NULL,
  nacionalidad VARCHAR(45) NULL DEFAULT NULL,
  genero VARCHAR(45) NULL DEFAULT NULL,
  primer_apellido VARCHAR(45) NULL DEFAULT NULL,
  segundo_apellido VARCHAR(45) NULL DEFAULT NULL,
  prenombre VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (dni));
  
CREATE TABLE IF NOT EXISTS empleado (
  cod_empleado CHAR(9) NOT NULL,
  cod_area CHAR(9) NOT NULL,
  dni CHAR(9) NOT NULL,
  cargo VARCHAR(45) NULL DEFAULT NULL,
  fecha_contrato DATE NULL DEFAULT NULL,
  PRIMARY KEY (cod_empleado),
  CONSTRAINT cod_area
    FOREIGN KEY (cod_area)
    REFERENCES cliente_interno (cod_area),
  CONSTRAINT dni
    FOREIGN KEY (dni)
    REFERENCES persona (dni));
	
CREATE TABLE IF NOT EXISTS operacion (
  cod_operacion CHAR(9) NOT NULL,
  cod_operacion_previa CHAR(9) NULL DEFAULT NULL,
  cod_empleado_ejecutor CHAR(9) NOT NULL,
  cod_empleado_supervisor CHAR(9) NOT NULL,
  fecha DATE NOT NULL,
  hora_inicio VARCHAR(45) NOT NULL,
  hora_fin VARCHAR(45) NULL DEFAULT NULL,
  tipo_operacion INT NOT NULL,
  PRIMARY KEY (cod_operacion),
  CONSTRAINT cod_empleado_ejecutor
    FOREIGN KEY (cod_empleado_ejecutor)
    REFERENCES empleado (cod_empleado),
  CONSTRAINT cod_empleado_supervisor
    FOREIGN KEY (cod_empleado_supervisor)
    REFERENCES empleado (cod_empleado),
  CONSTRAINT cod_operacion_previa
    FOREIGN KEY (cod_operacion_previa)
    REFERENCES operacion (cod_operacion));
	
CREATE TABLE IF NOT EXISTS transportista (
  cod_transportista CHAR(9) NOT NULL,
  cod_empleado CHAR(9) NOT NULL,
  num_licencia VARCHAR(45) NULL DEFAULT NULL,
  estado VARCHAR(45) NULL DEFAULT NULL,
  tipo_licencia VARCHAR(45) NULL DEFAULT NULL,
  fecha_vencimiento_licencia DATE NULL DEFAULT NULL,
  fecha_ultimo_traslado DATE NULL DEFAULT NULL,
  PRIMARY KEY (cod_transportista),
  CONSTRAINT cod_empleado_transportista
    FOREIGN KEY (cod_empleado)
    REFERENCES empleado (cod_empleado));
	
CREATE TABLE IF NOT EXISTS vehiculo (
  cod_vehiculo CHAR(9) NOT NULL,
  estado VARCHAR(45) NULL DEFAULT NULL,
  anio_fabricacion VARCHAR(45) NULL DEFAULT NULL,
  fecha_ultimo_mantenimiento VARCHAR(45) NULL DEFAULT NULL,
  fecha_ultimo_viaje VARCHAR(45) NULL DEFAULT NULL,
  capacidad_carga VARCHAR(45) NULL DEFAULT NULL,
  modelo VARCHAR(45) NULL DEFAULT NULL,
  placa VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_vehiculo));


CREATE TABLE IF NOT EXISTS traslado (
  cod_traslado CHAR(9) NOT NULL,
  cod_vehiculo CHAR(9) NOT NULL,
  cod_ruta CHAR(9) NOT NULL,
  cod_transportista CHAR(9) NOT NULL,
  cod_operacion_inicia CHAR(9) NOT NULL,
  cod_operacion_termina CHAR(9) NULL DEFAULT NULL,
  PRIMARY KEY (cod_traslado),
  CONSTRAINT cod_operacion_inicia
    FOREIGN KEY (cod_operacion_inicia)
    REFERENCES operacion (cod_operacion),
  CONSTRAINT cod_operacion_termina
    FOREIGN KEY (cod_operacion_termina)
    REFERENCES operacion (cod_operacion),
  CONSTRAINT cod_ruta_traslado
    FOREIGN KEY (cod_ruta)
    REFERENCES ruta (cod_ruta),
  CONSTRAINT cod_transportista
    FOREIGN KEY (cod_transportista)
    REFERENCES transportista (cod_transportista),
  CONSTRAINT cod_vehiculo_traslado
    FOREIGN KEY (cod_vehiculo)
    REFERENCES vehiculo (cod_vehiculo));
	

CREATE TABLE IF NOT EXISTS incidencia (
  cod_incidencia CHAR(9) NOT NULL,
  cod_traslado CHAR(9) NOT NULL,
  descripcion VARCHAR(45) NULL DEFAULT NULL,
  tipo VARCHAR(45) NULL DEFAULT NULL,
  fecha_ocurrencia DATE NULL DEFAULT NULL,
  PRIMARY KEY (cod_incidencia),
  CONSTRAINT fk_cod_traslado
    FOREIGN KEY (cod_traslado)
    REFERENCES traslado (cod_traslado));
	
CREATE TABLE IF NOT EXISTS catalogo_contigencia (
  cod_catalogo_contigencia CHAR(9) NOT NULL,
  cod_incidencia CHAR(9) NOT NULL,
  comentario VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_catalogo_contigencia),
  CONSTRAINT fk_cod_incidencia
    FOREIGN KEY (cod_incidencia)
    REFERENCES incidencia (cod_incidencia));
	
CREATE TABLE IF NOT EXISTS elemento_catalogo (
  cod_elemento_catalogo CHAR(9) NOT NULL,
  nombre VARCHAR(120) NULL DEFAULT NULL,
  categoria INT NOT NULL,
  segmento INT NOT NULL,
  descripcion VARCHAR(256) NULL DEFAULT NULL,
  unidad VARCHAR(45) NULL DEFAULT NULL,
  temperatura_minima INT NULL DEFAULT NULL,
  temperatura_maxima INT NULL DEFAULT NULL,
  vida_util INT NULL DEFAULT NULL,
  peso_unitario INT NOT NULL,
  PRIMARY KEY (cod_elemento_catalogo));
  
CREATE TABLE IF NOT EXISTS representante (
  cod_representante CHAR(9) NOT NULL,
  cod_cliente CHAR(9) NOT NULL,
  dni CHAR(9) NOT NULL,
  tipo_representante VARCHAR(45) NULL DEFAULT NULL,
  num_telefono VARCHAR(20) NULL DEFAULT NULL,
  correo_empresarial VARCHAR(45) NULL DEFAULT NULL,
  cargo VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_representante),
  CONSTRAINT cod_cliente_representante
    FOREIGN KEY (cod_cliente)
    REFERENCES cliente (cod_cliente),
  CONSTRAINT dni_representante
    FOREIGN KEY (dni)
    REFERENCES persona (dni));
	
CREATE TABLE IF NOT EXISTS pedido (
  cod_pedido CHAR(9) NOT NULL,
  cod_representante CHAR(9) NOT NULL,
  fecha_registro DATE NULL DEFAULT NULL,
  tipo_pedido VARCHAR(45) NULL DEFAULT NULL,
  descripcion VARCHAR(45) NULL DEFAULT NULL,
  estado_pedido VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_pedido),
  CONSTRAINT cod_representante
    FOREIGN KEY (cod_representante)
    REFERENCES representante (cod_representante));
	
CREATE TABLE IF NOT EXISTS detalle_pedido_producto (
  pedido_cod_pedido CHAR(9) NOT NULL,
  elemento_catalogo_cod_elemento_catalogo CHAR(9) NOT NULL,
  PRIMARY KEY (pedido_cod_pedido, elemento_catalogo_cod_elemento_catalogo),
  CONSTRAINT fk_pedido_has_elemento_catalogo_elemento_catalogo1
    FOREIGN KEY (elemento_catalogo_cod_elemento_catalogo)
    REFERENCES elemento_catalogo (cod_elemento_catalogo),
  CONSTRAINT fk_pedido_has_elemento_catalogo_pedido1
    FOREIGN KEY (pedido_cod_pedido)
    REFERENCES pedido (cod_pedido));
	
CREATE TABLE IF NOT EXISTS detalle_pedido_traslado (
  traslado_cod_traslado CHAR(9) NOT NULL,
  pedido_cod_pedido CHAR(9) NOT NULL,
  PRIMARY KEY (traslado_cod_traslado, pedido_cod_pedido),
  CONSTRAINT fk_detalle_pedido_traslado_pedido1
    FOREIGN KEY (pedido_cod_pedido)
    REFERENCES pedido (cod_pedido),
  CONSTRAINT fk_pedido_has_traslado_traslado1
    FOREIGN KEY (traslado_cod_traslado)
    REFERENCES traslado (cod_traslado));
	
CREATE TABLE IF NOT EXISTS evidencia (
  cod_evidencia CHAR(9) NOT NULL,
  cod_cliente_interno CHAR(9) NOT NULL,
  nombre_evidencia VARCHAR(45) NULL DEFAULT NULL,
  tipo_evidencia VARCHAR(45) NULL DEFAULT NULL,
  tipo_archivo VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_evidencia),
  CONSTRAINT cod_cliente_interno_evidencia
    FOREIGN KEY (cod_cliente_interno)
    REFERENCES cliente_interno (cod_area));

CREATE TABLE IF NOT EXISTS ubicacion (
  cod_ubicacion CHAR(9) NOT NULL,
  longitud VARCHAR(45) NULL DEFAULT NULL,
  latitud VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_ubicacion));
  
CREATE TABLE IF NOT EXISTS gps (
  cod_gps CHAR(9) NOT NULL,
  cod_ubicacion CHAR(9) NOT NULL,
  cod_vehiculo CHAR(9) NOT NULL,
  fecha_ubicacion DATE NULL DEFAULT NULL,
  hora_ubicacion VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_gps),
  CONSTRAINT cod_ubicacion_gps
    FOREIGN KEY (cod_ubicacion)
    REFERENCES ubicacion (cod_ubicacion),
  CONSTRAINT cod_vehiculo
    FOREIGN KEY (cod_vehiculo)
    REFERENCES vehiculo (cod_vehiculo));
	

CREATE TABLE IF NOT EXISTS local (
  cod_local CHAR(9) NOT NULL,
  cod_cliente CHAR(9) NOT NULL,
  cod_ubicacion CHAR(9) NOT NULL,
  tipo_local VARCHAR(45) NULL DEFAULT NULL,
  distrito VARCHAR(45) NULL DEFAULT NULL,
  calle VARCHAR(45) NULL DEFAULT NULL,
  numero VARCHAR(45) NULL DEFAULT NULL,
  region VARCHAR(45) NULL DEFAULT NULL,
  pais VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_local),
  CONSTRAINT cod_cliente
    FOREIGN KEY (cod_cliente)
    REFERENCES cliente (cod_cliente),
  CONSTRAINT cod_ubicacion_local
    FOREIGN KEY (cod_ubicacion)
    REFERENCES ubicacion (cod_ubicacion));
	
CREATE TABLE IF NOT EXISTS mercancia (
  cod_mercancia CHAR(9) NOT NULL,
  cod_operacion_picking CHAR(9) NOT NULL,
  cantidad_productos INT NOT NULL DEFAULT 0,
  nro_precinto CHAR(10) NULL DEFAULT NULL,
  peso_total INT NOT NULL DEFAULT 0,
  PRIMARY KEY (cod_mercancia),
  CONSTRAINT fk_cod_operacion_picking
    FOREIGN KEY (cod_operacion_picking)
    REFERENCES operacion (cod_operacion));
	
CREATE TABLE IF NOT EXISTS norma (
  cod_norma CHAR(9) NOT NULL,
  cod_catalogo_contigencia CHAR(9) NOT NULL,
  fecha_emision DATE NULL DEFAULT NULL,
  fecha_vigencia DATE NULL DEFAULT NULL,
  tipo VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_norma),
  CONSTRAINT fk_cod_catalogo_contigencia
    FOREIGN KEY (cod_catalogo_contigencia)
    REFERENCES catalogo_contigencia (cod_catalogo_contigencia));
	
CREATE TABLE IF NOT EXISTS procedimiento (
  cod_procedimiento CHAR(9) NOT NULL,
  cod_catalogo_contigencia CHAR(9) NOT NULL,
  tipo VARCHAR(45) NULL DEFAULT NULL,
  descripcion VARCHAR(45) NULL DEFAULT NULL,
  duracion VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_procedimiento),
  CONSTRAINT fk_cod_catalogo_contigencia_procedimiento
    FOREIGN KEY (cod_catalogo_contigencia)
    REFERENCES catalogo_contigencia (cod_catalogo_contigencia));
	
CREATE TABLE IF NOT EXISTS paso (
  cod_paso CHAR(9) NOT NULL,
  cod_procedimiento CHAR(9) NOT NULL,
  descripcion VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_paso),
  CONSTRAINT fk_cod_procedimiento
    FOREIGN KEY (cod_procedimiento)
    REFERENCES procedimiento (cod_procedimiento));
	
CREATE TABLE IF NOT EXISTS programacion_reporte (
  cod_programacion_reporte CHAR(9) NOT NULL,
  cod_empleado CHAR(9) NOT NULL,
  formato VARCHAR(45) NULL DEFAULT NULL,
  estado VARCHAR(45) NULL DEFAULT NULL,
  frecuencia VARCHAR(45) NULL DEFAULT NULL,
  filtros VARCHAR(45) NULL DEFAULT NULL,
  fecha_inicio DATE NULL DEFAULT NULL,
  fecha_fin DATE NULL DEFAULT NULL,
  PRIMARY KEY (cod_programacion_reporte),
  CONSTRAINT cod_empleado
    FOREIGN KEY (cod_empleado)
    REFERENCES empleado (cod_empleado));
	
CREATE TABLE IF NOT EXISTS seguimiento (
  cod_seguimiento CHAR(9) NOT NULL,
  cod_cliente_interno CHAR(9) NOT NULL,
  tipo_accion VARCHAR(45) NULL DEFAULT NULL,
  comentario VARCHAR(45) NULL DEFAULT NULL,
  fecha_resolucion VARCHAR(45) NULL DEFAULT NULL,
  numero_caso VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_seguimiento),
  CONSTRAINT cod_cliente_interno_seguimiento
    FOREIGN KEY (cod_cliente_interno)
    REFERENCES cliente_interno (cod_area));
	

CREATE TABLE IF NOT EXISTS reclamo (
  cod_reclamo CHAR(9) NOT NULL,
  cod_evidencia CHAR(9) NOT NULL,
  cod_empleado CHAR(9) NOT NULL,
  cod_representante CHAR(9) NOT NULL,
  cod_pedido CHAR(9) NOT NULL,
  cod_seguimiento CHAR(9) NOT NULL,
  tipo_reclamo VARCHAR(45) NULL DEFAULT NULL,
  nivel_urgencia VARCHAR(45) NULL DEFAULT NULL,
  estado VARCHAR(45) NULL DEFAULT NULL,
  comentario VARCHAR(45) NULL DEFAULT NULL,
  fecha_suceso DATE NULL DEFAULT NULL,
  PRIMARY KEY (cod_reclamo),
  CONSTRAINT cod_empleado_reclamo
    FOREIGN KEY (cod_empleado)
    REFERENCES empleado (cod_empleado),
  CONSTRAINT cod_evidencia
    FOREIGN KEY (cod_evidencia)
    REFERENCES evidencia (cod_evidencia),
  CONSTRAINT cod_pedido
    FOREIGN KEY (cod_pedido)
    REFERENCES pedido (cod_pedido),
  CONSTRAINT cod_representante_reclamo
    FOREIGN KEY (cod_representante)
    REFERENCES representante (cod_representante),
  CONSTRAINT cod_seguimiento
    FOREIGN KEY (cod_seguimiento)
    REFERENCES seguimiento (cod_seguimiento));
	
	
CREATE TABLE IF NOT EXISTS reporte (
  cod_reporte CHAR(9) NOT NULL,
  cod_programacion_reporte CHAR(9) NOT NULL,
  fecha_generacion DATE NULL DEFAULT NULL,
  hora_generacion VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_reporte),
  CONSTRAINT cod_programacion_reporte
    FOREIGN KEY (cod_programacion_reporte)
    REFERENCES programacion_reporte (cod_programacion_reporte));
	
CREATE TABLE IF NOT EXISTS stock (
  cod_stock CHAR(9) NOT NULL,
  cod_elemento_catalogo CHAR(9) NOT NULL,
  cod_mercancia CHAR(9) NULL DEFAULT NULL,
  nro_lote INT NULL DEFAULT NULL,
  tipo_stock INT NOT NULL,
  fecha_caducidad DATE NULL DEFAULT NULL,
  PRIMARY KEY (cod_stock),
  CONSTRAINT fk_mercancia_has_elemento_catalogo_elemento_catalogo1
    FOREIGN KEY (cod_elemento_catalogo)
    REFERENCES elemento_catalogo (cod_elemento_catalogo),
  CONSTRAINT fk_mercancia_has_elemento_catalogo_mercancia1
    FOREIGN KEY (cod_mercancia)
    REFERENCES mercancia (cod_mercancia));
	
CREATE TABLE IF NOT EXISTS tramo (
  cod_tramo CHAR(9) NOT NULL,
  cod_ruta CHAR(9) NOT NULL,
  distancia VARCHAR(45) NULL DEFAULT NULL,
  tiempo_estimado VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (cod_tramo),
  CONSTRAINT cod_ruta
    FOREIGN KEY (cod_ruta)
    REFERENCES ruta (cod_ruta));
	
CREATE TABLE IF NOT EXISTS detalle_local_tramo (
  local_cod_local CHAR(9) NOT NULL,
  tramo_cod_tramo CHAR(9) NOT NULL,
  tipo_punto VARCHAR(45) NULL,
  PRIMARY KEY (local_cod_local, tramo_cod_tramo),
  CONSTRAINT fk_local_has_tramo_local1
    FOREIGN KEY (local_cod_local)
    REFERENCES "local" (cod_local),
  CONSTRAINT fk_local_has_tramo_tramo1
    FOREIGN KEY (tramo_cod_tramo)
    REFERENCES tramo (cod_tramo));

```

## 5. Poblamiento inicial de datos

```sql

-- Poblamiento de datos para la entidad Elemento_catalogo
INSERT INTO elemento_catalogo (cod_elemento_catalogo, nombre, categoria, segmento, descripcion, unidad, temperatura_maxima, temperatura_minima, vida_util, peso_unitario) VALUES
('123456789', 'Filete de pechuga de pollo San Fernando congelado', 31, 4, 'Filete de pechuga de pollo San Fernando congelado, listo para su uso en la preparación de platos.', 'unidad', -18, -20, 90, 900),
('223456789', 'Pierna de pollo San Fernando congelada', 31, 4, 'Pierna de pollo San Fernando congelada, perfecta para su uso en la elaboración de diversos platos.', 'unidad', -18, -20, 90, 1200),
('323456789', 'Ala de pollo San Fernando congelada', 31, 4, 'Ala de pollo San Fernando congelada, ideal para recetas fáciles y deliciosas.', 'unidad', -18, -20, 90, 800),
('423456789', 'Muslo de pollo San Fernando congelado', 31, 4, 'Muslo de pollo San Fernando congelado, versátil y sabroso para preparaciones culinarias.', 'unidad', -18, -20, 90, 1000),
('523456789', 'Pechuga entera de pollo San Fernando congelada', 31, 4, 'Pechuga entera de pollo San Fernando congelada, fresca y de alta calidad para diversas recetas.', 'unidad', -18, -20, 90, 1500),
('623456789', 'Pierna con encuentro San Fernando fresca', 32, 4, 'Pierna con encuentro de pollo San Fernando fresca, perfecta para asados y platos principales.', 'unidad', 0, -2, 7, 1300),
('723456789', 'Muslo de pollo San Fernando fresco', 32, 4, 'Muslo de pollo San Fernando fresco, jugoso y listo para su uso en una amplia variedad de platos.', 'unidad', 0, -2, 7, 1100),
('823456789', 'Pechuga especial de pollo San Fernando fresca', 32, 4, 'Pechuga especial de pollo San Fernando fresca, de la más alta calidad para platos gourmet.', 'unidad', 0, -2, 7, 1200),
('923456789', 'Pechuga entera de pollo San Fernando fresca', 32, 4, 'Pechuga entera de pollo San Fernando fresca, versátil y perfecta para diversas preparaciones culinarias.', 'unidad', 0, -2, 7, 1400),
('123456719', 'Carne molida de pollo San Fernando fresca', 32, 4, 'Carne molida de pollo San Fernando fresca, ideal para hamburguesas, albóndigas y más.', 'unidad', 0, -2, 7, 900),
('112456719', 'Especias y condimentos Jardín del Sabor para pollo', 11, 1, 'Mezcla de especias y condimentos Jardín del Sabor especialmente seleccionados para realzar el sabor del pollo.', 'gramo', NULL, NULL, 180, 80),
('223456719', 'Aceite de oliva Aceitunas del Sur para cocinar', 13, 1, 'Aceite de oliva Aceitunas del Sur de alta calidad, perfecto para cocinar y aderezar platos.', 'mililitro', NULL, NULL, 365, 1000),
('323456719', 'Harina de trigo Trigomar para empanizar', 14, 1, 'Harina de trigo Trigomar ideal para empanizar y darle un acabado crujiente a tus platillos favoritos.', 'gramo', NULL, NULL, 180, 500),
('423456719', 'Huevo fresco Granja Real para rebozar', 15, 1, 'Huevo fresco Granja Real para rebozar y darle un toque especial a tus recetas.', 'unidad', NULL, NULL, 30, 50),
('523456719', 'Conservante natural Biolife para prolongar la vida útil del producto', 16, 1, 'Conservante natural Biolife para prolongar la vida útil del producto, sin aditivos artificiales.', 'gramo', NULL, NULL, 365, 30),
('623456719', 'Colorante natural Chroma para mejorar la apariencia del producto', 17, 1, 'Colorante natural Chroma para mejorar la apariencia del producto, seguro y confiable.', 'gramo', NULL, NULL, 365, 20),
('723456719', 'Emulsionante Quality para mejorar la textura del producto', 18, 1, 'Emulsionante Quality para mejorar la textura del producto, ideal para aplicaciones culinarias.', 'gramo', NULL, NULL, 365, 40),
('923456720', 'Detergente SuperClean', 23, 2, 'Detergente SuperClean para uso industrial, ideal para limpieza profunda y desengrase de equipos y superficies.', 'litro', NULL, NULL, NULL, 1000);


-- Poblamiento de datos para la entidad Mercancía
INSERT INTO mercancia (cod_mercancia, cod_operacion_picking, nro_precinto)
VALUES 
  ('987654321', '000000001', 'N123456789'),
  ('987654322', '000000001', 'N223456789'),
  ('987654323', '000000001', 'N323456789'),
  ('987654324', '000000008', 'N423456789'),
  ('987654325', '000000008', 'N523456789'),
  ('987654326', '000000013', NULL);

-- Funciones para el cálculo de atributos en la tabla Mercancía
CREATE OR REPLACE FUNCTION calcular_peso_total()
RETURNS TRIGGER AS $$
BEGIN
    UPDATE mercancia m
    SET peso_total = (
        SELECT SUM(ec.peso_unitario)
        FROM stock s
        INNER JOIN elemento_catalogo ec ON s.cod_elemento_catalogo = ec.cod_elemento_catalogo
        WHERE s.cod_mercancia = NEW.cod_mercancia
    )
    WHERE m.cod_mercancia = NEW.cod_mercancia;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION calcular_cantidad_producto()
RETURNS TRIGGER AS $$
BEGIN
    UPDATE mercancia m
    SET cantidad_productos = (
        SELECT COUNT(*)
        FROM stock s
        WHERE s.cod_mercancia = NEW.cod_mercancia
    )
    WHERE m.cod_mercancia = NEW.cod_mercancia;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Asociación de los triggers con la tabla Stock
CREATE TRIGGER actualizar_peso_total
AFTER INSERT OR UPDATE ON stock
FOR EACH ROW
EXECUTE FUNCTION calcular_peso_total();

CREATE TRIGGER actualizar_cantidad_producto
AFTER INSERT OR UPDATE ON stock
FOR EACH ROW
EXECUTE FUNCTION calcular_cantidad_producto();

-- Poblamiento de datos para la entidad Stock
INSERT INTO stock (cod_stock, cod_elemento_catalogo, cod_mercancia, nro_lote, tipo_stock, fecha_caducidad) VALUES
('987654321', '123456789', '987654321', 123, 3, '2024-04-01'),
('987654322', '223456789', '987654321', 124, 3, '2024-04-02'),
('987654323', '323456789', '987654321', 125, 3, '2024-04-03'),
('987654324', '423456789', '987654322', 126, 3, '2024-04-04'),
('987654325', '523456789', '987654322', 127, 3, '2024-04-05'),
('987654326', '623456789', '987654323', 128, 3, '2024-04-06'),
('987654327', '723456789', '987654323', 129, 3, '2024-04-07'),
('987654328', '823456789', '987654324', 130, 3, '2024-04-08'),
('987654329', '923456789', '987654324', 131, 3, '2024-04-09'),
('987654330', '123456789', '987654324', 132, 3, '2024-04-10'),
('887654321', '112456719', '987654325', 223, 1, '2024-04-01'),
('887654322', '112456719', '987654325', 224, 1, '2024-04-02'),
('887654323', '223456719', '987654325', 225, 1, '2024-04-03'),
('887654324', '223456719', '987654326', 226, 1, '2024-04-04'),
('887654325', '323456719', '987654326', 227, 1, '2024-04-05'),
('887654326', '423456719', NULL, 228, 1, '2024-04-06'),
('887654327', '523456719', NULL, 229, 1, '2024-04-07'),
('887654328', '623456719', NULL, 230, 1, '2024-04-08'),
('887654329', '723456719', NULL, 231, 1, '2024-04-09'),
('887654330', '923456720', NULL, 232, 2, '2024-04-10');

-- Poblamiento de datos para la entidad Traslado
INSERT INTO traslado (cod_traslado, cod_vehiculo, cod_ruta, cod_transportista, cod_operacion_inicia, cod_operacion_termina)
VALUES 
  ('100000001', '111111111', '222222222', '333333333', '000000005', '000000006'),
  ('100000002', '444444444', '555555555', '666666666', '000000012', NULL);



-- Poblamiento de datos para la entidad Ubicación
INSERT INTO public.ubicacion (cod_ubicacion, longitud, latitud) 
VALUES  
(822168312, -11.556595, -77.203523),
(822168313, -11.501818, -77.226304), 
(822168314, -11.872139, -77.127159), 
(822168315, -11.866499, -77.073656), 
(822168316, -11.518728, -77.205331), 
(822168317, -11.547767, -77.203855), 
(822168318, -11.593654, -77.201504), 
(822168319, -11.728288, -77.165746), 
(822168320, -11.834073, -77.112874), 
(822168321, -11.928733, -77.072607), 
(822168322, -12.007750, -77.056319), 
(822168323, -11.993166, -77.063375), 
(822168324, -12.059688, -77.041633), 
(822168325, -12.089659, -77.023307), 
(822168326, -12.028432, -77.084411), 
(822168327, -12.058004, -77.037207), 
(822168328, -12.051560, -77.031446), 
(822168329, -12.173548, -76.990706), 
(822168330, -11.999995, -77.093605), 
(822168331, -12.029196, -77.047394), 
(822168332, -12.066141, -77.065247), 
(822168333, -12.064119, -77.008580), 
(822168334, -12.042161, -77.110275), 
(822168335, -12.002656, -77.001044), 
(822168336, -12.179313, -77.003369), 
(822168337, -12.162875, -77.024370), 
(822168338, -11.932476, -77.055643), 
(822168339, -12.085938, -77.032969);

-- Poblamiento de datos para la entidad Local

INSERT INTO public.local (cod_local, cod_cliente, cod_ubicacion, pais, region, distrito, calle, numero, tipo_local) 
VALUES  
(452408433, 'CLT000001', 822168312, 'Perú', 'Lima', 'Huaral', 'Panamericana Norte', NULL, 'Almacén'), 
(452408434, 'CLT001235', 822168313, 'Perú', 'Lima', 'Huaral', 'Av. El solar', NULL, 'Recepción'), 
(452408435, 'CLT001236', 822168314, 'Perú', 'Lima', 'Ventanilla', 'Av. Nestor Gambeta', 7036, 'Recepción'), 
(452408436, 'CLT001237', 822168315, 'Perú', 'Lima', 'Puente Piedra', 'Av. Puente Piedra', 266, 'Recepción'), 
(452408437, 'CLT001238', 822168321, 'Perú', 'Lima', 'Independencia', 'Av. Tomás Valle', 1400, 'Recepción'), 
(452408438, 'CLT001239', 822168323, 'Perú', 'Lima', 'Independencia', 'Av. Alfredo Mendiola', 3698, 'Recepción'), 
(452408439, 'CLT001240', 822168326, 'Perú', 'Lima', 'Lima', 'Jr. Iquitos', 347, 'Venta'), 
(452408440, 'CLT001241', 822168327, 'Perú', 'Lima', 'Lima', 'Av. España', 1337, 'Recepción'), 
(452408441, 'CLT001242', 822168328, 'Perú', 'Lima', 'Lima', 'Jr. Puno', 370, 'Distribuidora'), 
(452408442, 'CLT000002', 822168329, 'Perú', 'Lima', 'Chorrillos', 'C. Constelación Austral', 135, 'Almacén'), 
(452408443, 'CLT001244', 822168330, 'Perú', 'Lima', 'San Martín de Porres', 'Tomas Cochrane', NULL, 'Distribuidora'), 
(452408444, 'CLT001245', 822168331, 'Perú', 'Lima', 'San Martín de Porres', 'Jr. Mártir Olaya', 413, 'Distribuidora'), 
(452408445, 'CLT001246', 822168332, 'Perú', 'Lima', 'Pueblo Libre', 'Av. Simón Bolívar', 1149, 'Distribuidora'), 
(452408446, 'CLT001247', 822168333, 'Perú', 'Lima', 'Lima', 'Jr. 3 de Febrero', 1234, 'Distribuidora'), 
(452408447, 'CLT001248', 822168334, 'Perú', 'Callao', 'Callao', 'Av. Argentina', 3093, 'Venta'), 
(452408448, 'CLT001249', 822168335, 'Perú', 'Lima', 'San Juan de Lurigancho', 'Av. 13 de Enero', 1592, 'Distribuidora'), 
(452408449, 'CLT001250', 822168336, 'Perú', 'Lima', 'Chorrillos', 'Av. Los Faisanes', 179, 'Almacén'), 
(452408450, 'CLT001251', 822168337, 'Perú', 'Lima', 'Chorrillos', 'Jr. Justo Naveda', 136, 'Distribuidora'), 
(452408451, 'CLT001252', 822168338, 'Perú', 'Lima', 'Comas', 'Av. Universitaria', 7718, 'Venta'), 
(452408452, 'CLT001253', 822168339, 'Perú', 'Lima', 'Lince', 'Av. Petit Thouars', 2260, 'Venta'); 

-- Poblamiento de datos para la entidad GPS

INSERT INTO public.gps (cod_gps, cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) 
VALUES  
(784609771, 822168312, 345678901, '2024-04-20', '04:53:21'), 
(784609772, 822168326, 345678901, '2024-04-21', '09:10:53'), 
(784609773, 822168328, 345678901, '2024-04-22', '11:33:14'), 
(784609774, 822168329, 345678901, '2024-04-23', '13:45:11'), 
(784609775, 822168312, 345678901, '2024-04-22', '05:13:55'), 
(784609776, 822168316, 345678901, '2024-04-22', '07:34:25'), 
(784609777, 822168315, 345678901, '2024-04-22', '10:45:30'), 
(784609778, 822168319, 345678901, '2024-04-22', '11:20:10'), 
(784609779, 822168323, 345678901, '2024-04-22', '11:54:31'), 
(784609780, 822168321, 345678901, '2024-04-22', '12:29:30'), 
(784609781, 822168324, 345678901, '2024-04-22', '13:04:10'), 
(784609782, 822168325, 345678901, '2024-04-22', '13:38:50'); 

-- Poblamiento de datos para la entidad detalle_local_tramo

INSERT INTO public.detalle_local_tramo (tramo_cod_tramo, local_cod_local, tipo_punto) 
VALUES  
(523320469, 822168323, 'Origen'), 
(523320469, 822168321, 'Destino'), 
(523320470, 822168312, 'Origen'), 
(523320470, 822168315, 'Destino'), 
(523320471, 822168328, 'Origen'), 
(523320471, 822168329, 'Destino'), 
(523320472, 822168326, 'Origen'), 
(523320472, 822168328, 'Destino'), 
(523320473, 822168321, 'Origen'), 
(523320473, 822168327, 'Destino'); 

-- Poblamiento de datos para la entidad Tramo

INSERT INTO public.tramo (cod_tramo, cod_ruta, distancia, tiempo_estimado) 
VALUES  
(523320469, 310954917, 70.2, 1.56), 
(523320470, 310954917, 37.1, 0.82), 
(523320471, 310954917, 87.3, 1.94), 
(523320472, 310954918, 12.3, 0.27), 
(523320473, 310954918, 5.9, 0.13), 
(523320474, 310954918, 68.9, 1.53), 
(523320475, 310954918, 20.4, 0.45), 
(523320476, 310954920, 91.6, 2.04), 
(523320477, 310954920, 29.1, 0.65), 
(523320478, 310954921, 25.7, 0.57); 

-- Poblamiento de datos para la entidad Ruta

INSERT INTO public.ruta (cod_ruta, punto_origen, punto_destino, distancia_total, tipo_ruta, duracion) 
VALUES  
(222527951, 822168312, 822168332, 18.2, 'Urbana', 0.4), 
(222527952, 822168312, 822168336, 89.7, 'Urbana', 2.0), 
(222527953, 822168312, 822168315, 26.3, 'Urbana', 0.6), 
(222527954, 822168312, 822168331, 38.4, 'Urbana', 0.9), 
(222527955, 822168312, 822168321, 12.9, 'Urbana', 0.3), 
(222527956, 822168312, 822168333, 53.7, 'Urbana', 1.2), 
(222527957, 822168329, 822168330, 27.5, 'Urbana', 0.6), 
(222527958, 822168329, 822168339, 34.8, 'Urbana', 0.8), 
(222527959, 822168329, 822168336, 44.8, 'Urbana', 1.0), 
(222527960, 822168329, 822168338, 9.3, 'Urbana', 0.2);

```
```sql
-- Poblamiento de datos 

INSERT INTO cliente (cod_cliente, estado, prioridad, fecha_registro) 
VALUES 
('CLT001234', 'Activo', 'Alta', '2023-05-15'),
('CLT002345', 'Inactivo', 'Media', '2022-11-28'),
('CLT003456', 'Activo', 'Baja', '2024-02-10'),
('CLT004567', 'Activo', 'Alta', '2023-09-07'),
('CLT005678', 'Inactivo', 'Baja', '2022-12-20'),
('CLT006789', 'Activo', 'Media', '2023-07-03'),
('CLT007890', 'Activo', 'Alta', '2022-08-18'),
('CLT008901', 'Inactivo', 'Baja', '2024-01-25'),
('CLT009012', 'Activo', 'Media', '2023-04-30'),
('CLT010123', 'Activo', 'Alta', '2022-10-12'),
('CLT011234', 'Inactivo', 'Baja', '2023-03-08'),
('CLT012345', 'Activo', 'Media', '2024-06-21');

INSERT INTO cliente_interno (cod_area, cod_cliente, nombre_area) 
VALUES 
('AREA001', 'CLT001234', 'Ventas'),
('AREA002', 'CLT002345', 'Recursos Humanos'),
('AREA003', 'CLT003456', 'Tecnología'),
('AREA004', 'CLT004567', 'Marketing'),
('AREA005', 'CLT005678', 'Finanzas'),
('AREA006', 'CLT006789', 'Operaciones'),
('AREA007', 'CLT007890', 'Desarrollo de Producto'),
('AREA008', 'CLT008901', 'Servicio al Cliente'),
('AREA009', 'CLT009012', 'Legal'),
('AREA010', 'CLT010123', 'Logística'),
('AREA011', 'CLT011234', 'Calidad'),
('AREA012', 'CLT012345', 'Comunicaciones');

INSERT INTO cliente_externo (ruc, cod_cliente, nombre_empresa, razon_social) 
VALUES 
('123456789', 'CLT001234', 'Empresa A', 'Razón A'),
('234567890', 'CLT002345', 'Empresa B', 'Razón B'),
('345678901', 'CLT003456', 'Empresa C', 'Razón C'),
('456789012', 'CLT004567', 'Empresa D', 'Razón D'),
('567890123', 'CLT005678', 'Empresa E', 'Razón E'),
('678901234', 'CLT006789', 'Empresa F', 'Razón F'),
('789012345', 'CLT007890', 'Empresa G', 'Razón G'),
('890123456', 'CLT008901', 'Empresa H', 'Razón H'),
('901234567', 'CLT009012', 'Empresa I', 'Razón I'),
('012345678', 'CLT010123', 'Empresa J', 'Razón J'),
('123456780', 'CLT011234', 'Empresa K', 'Razón K'),
('234567801', 'CLT012345', 'Empresa L', 'Razón L');

INSERT INTO ruta (cod_ruta, punto_origen, punto_destino, distancia_total, tipo_ruta, duracion) 
VALUES 
('RUTA001', 'Ciudad A', 'Ciudad B', 150.5, 'Carretera', '3 horas'),
('RUTA002', 'Ciudad B', 'Ciudad C', 200.2, 'Autopista', '4 horas'),
('RUTA003', 'Ciudad C', 'Ciudad D', 180.7, 'Carretera', '3.5 horas'),
('RUTA004', 'Ciudad D', 'Ciudad E', 220.9, 'Autopista', '5 horas'),
('RUTA005', 'Ciudad E', 'Ciudad F', 300.1, 'Carretera', '6 horas'),
('RUTA006', 'Ciudad F', 'Ciudad G', 250.8, 'Autopista', '5.5 horas'),
('RUTA007', 'Ciudad G', 'Ciudad H', 400.3, 'Carretera', '8 horas'),
('RUTA008', 'Ciudad H', 'Ciudad I', 350.6, 'Autopista', '7 horas'),
('RUTA009', 'Ciudad I', 'Ciudad J', 420.0, 'Carretera', '8.5 horas'),
('RUTA010', 'Ciudad J', 'Ciudad K', 380.4, 'Autopista', '7.5 horas');

INSERT INTO persona (dni, direccion, estado_civil, nacionalidad, genero, primer_apellido, segundo_apellido, prenombre) 
VALUES 
('123456789', 'Calle 123, Ciudad A', 'Soltero/a', 'Peruana', 'Masculino', 'Pérez', 'Gómez', 'Juan'),
('234567890', 'Avenida XYZ, Ciudad B', 'Casado/a', 'Mexicana', 'Femenino', 'González', 'López', 'María'),
('345678901', 'Calle Principal, Ciudad C', 'Viudo/a', 'Colombiana', 'Masculino', 'Martínez', 'Rodríguez', 'Carlos'),
('456789012', 'Carrera 456, Ciudad D', 'Divorciado/a', 'Argentina', 'Femenino', 'López', 'Martínez', 'Laura'),
('567890123', 'Avenida Central, Ciudad E', 'Casado/a', 'Chilena', 'Masculino', 'García', 'Hernández', 'Pedro'),
('678901234', 'Calle Secundaria, Ciudad F', 'Soltero/a', 'Ecuatoriana', 'Femenino', 'Hernández', 'González', 'Ana'),
('789012345', 'Avenida Sur, Ciudad G', 'Casado/a', 'Boliviana', 'Masculino', 'Díaz', 'Pérez', 'Luis'),
('890123456', 'Calle Norte, Ciudad H', 'Viudo/a', 'Venezolana', 'Femenino', 'Ramírez', 'Sánchez', 'Lucía'),
('901234567', 'Calle Este, Ciudad I', 'Divorciado/a', 'Uruguaya', 'Masculino', 'Fernández', 'López', 'Diego'),
('012345678', 'Avenida Oeste, Ciudad J', 'Soltero/a', 'Paraguaya', 'Femenino', 'Suárez', 'Martínez', 'Mariana'),
('123456780', 'Avenida Este, Ciudad K', 'Casado/a', 'Costarricense', 'Masculino', 'Gómez', 'Fernández', 'Roberto'),
('234567801', 'Calle Este, Ciudad L', 'Viudo/a', 'Panameña', 'Femenino', 'Pérez', 'García', 'Isabel');


INSERT INTO empleado (cod_empleado, cod_area, dni, cargo, fecha_contrato) 
VALUES 
('EMP001234', 'AREA001', '123456789', 'Gerente de Ventas', '2022-03-15'),
('EMP002345', 'AREA002', '234567890', 'Recursos Humanos', '2023-01-20'),
('EMP003456', 'AREA003', '345678901', 'Ingeniero de Software', '2024-05-10'),
('EMP004567', 'AREA004', '456789012', 'Especialista en Marketing', '2022-09-05'),
('EMP005678', 'AREA005', '567890123', 'Analista Financiero', '2023-11-12'),
('EMP006789', 'AREA006', '678901234', 'Supervisor de Operaciones', '2024-02-28'),
('EMP007890', 'AREA007', '789012345', 'Desarrollador de Producto', '2022-07-08'),
('EMP008901', 'AREA008', '890123456', 'Representante de Servicio al Cliente', '2023-04-25'),
('EMP009012', 'AREA009', '901234567', 'Abogado', '2024-08-17'),
('EMP010123', 'AREA010', '012345678', 'Coordinador de Logística', '2022-12-10'),
('EMP011234', 'AREA011', '123456780', 'Inspector de Calidad', '2023-06-30'),
('EMP012345', 'AREA012', '234567801', 'Especialista en Comunicaciones', '2024-10-15');

INSERT INTO operacion (cod_operacion, cod_operacion_previa, cod_empleado_ejecutor, cod_empleado_supervisor, fecha, hora_inicio, hora_fin, tipo_operacion) 
VALUES 
('OP001234', NULL, 'EMP001234', 'EMP002345', '2022-03-15', '09:00:00', '13:00:00', 1),
('OP002345', 'OP001234', 'EMP003456', 'EMP004567', '2022-03-16', '10:30:00', '14:30:00', 2),
('OP003456', 'OP002345', 'EMP005678', 'EMP006789', '2022-03-17', '11:15:00', '15:45:00', 1),
('OP004567', 'OP003456', 'EMP007890', 'EMP008901', '2022-03-18', '08:45:00', '12:30:00', 2),
('OP005678', 'OP004567', 'EMP009012', 'EMP010123', '2022-03-19', '07:30:00', '11:00:00', 1),
('OP006789', 'OP005678', 'EMP011234', 'EMP012345', '2022-03-20', '09:45:00', '13:15:00', 2);

INSERT INTO operacion (cod_operacion, cod_operacion_previa, cod_empleado_ejecutor, cod_empleado_supervisor, tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES 
  ('000000001', NULL, 'EMP001234', 'EMP012345', 1, '2024-04-01', '08:00:00', '08:30:00'), -- Picking
  ('000000002', '000000001', 'EMP001234', 'EMP012345', 2, '2024-04-01', '08:45:00', '09:15:00'), -- Precintado
  ('000000003', '000000002', 'EMP001234', 'EMP012345', 3, '2024-04-01', '09:30:00', '10:30:00'), -- Paletizado
  ('000000004', '000000003', 'EMP001234', 'EMP012345', 4, '2024-04-01', '10:45:00', '11:15:00'), -- Carga
  ('000000005', '000000004', 'EMP001234', 'EMP012345', 5, '2024-04-01', '11:30:00', '12:00:00'), -- Salida
  ('000000006', '000000005', 'EMP001234', 'EMP012345', 6, '2024-04-01', '14:00:00', '14:30:00'), -- Recepción
  ('000000007', '000000006', 'EMP001234', 'EMP012345', 7, '2024-04-01', '14:45:00', '15:15:00'), -- Descarga
  ('000000008', NULL, 'EMP004567', 'EMP01234', 1, '2024-04-02', '08:00:00', '08:35:00'), -- Picking
  ('000000009', '000000008', 'EMP004567', 'EMP012345', 2, '2024-04-02', '08:45:00', '09:15:00'), -- Precintado
  ('000000010', '000000009', 'EMP004567', 'EMP012345', 3, '2024-04-02', '09:30:00', '10:30:00'), -- Paletizado
  ('000000011', '000000010', 'EMP004567', 'EMP012345', 4, '2024-04-02', '10:45:00', '11:15:00'), -- Carga
  ('000000012', '000000011', 'EMP004567', 'EMP012345', 5, '2024-04-02', '11:30:00', '12:00:00'), -- Salida
  ('000000013', NULL, 'EMP004567', '987654321', 1, '2024-04-02', '11:36:00', '11:52:00'); -- Picking

INSERT INTO transportista (cod_transportista, cod_empleado, num_licencia, estado, tipo_licencia, fecha_vencimiento_licencia, fecha_ultimo_traslado) 
VALUES 
('TRN001234', 'EMP001234', '123456789', 'Activo', 'Tipo A', '2025-05-15', '2024-04-20'),
('TRN002345', 'EMP003456', '234567890', 'Activo', 'Tipo B', '2024-12-28', '2024-04-18'),
('TRN003456', 'EMP005678', '345678901', 'Inactivo', 'Tipo C', '2023-09-10', '2024-04-19'),
('TRN004567', 'EMP007890', '456789012', 'Activo', 'Tipo A', '2023-11-07', '2024-04-20'),
('TRN005678', 'EMP009012', '567890123', 'Activo', 'Tipo B', '2025-03-25', '2024-04-21'),
('TRN006789', 'EMP011234', '678901234', 'Inactivo', 'Tipo C', '2024-08-12', '2024-04-22'),
('TRN007890', 'EMP002345', '789012345', 'Activo', 'Tipo A', '2024-10-30', '2024-04-23'),
('TRN008901', 'EMP004567', '890123456', 'Inactivo', 'Tipo B', '2023-07-20', '2024-04-24'),
('TRN009012', 'EMP006789', '901234567', 'Activo', 'Tipo C', '2025-01-15', '2024-04-25'),
('TRN010123', 'EMP008901', '012345678', 'Activo', 'Tipo A', '2024-05-30', '2024-04-26'),
('TRN011234', 'EMP010123', '123456780', 'Inactivo', 'Tipo B', '2023-10-10', '2024-04-27'),
('TRN012345', 'EMP012345', '234567801', 'Activo', 'Tipo C', '2025-04-05', '2024-04-28');

INSERT INTO vehiculo (cod_vehiculo, estado, anio_fabricacion, fecha_ultimo_mantenimiento, fecha_ultimo_viaje, modelo, placa)
VALUES
('VEH001234', 'Activo', '2019', '2023-03-15', '2024-04-20', 'Sedán', 'ABC123'),
('VEH002345', 'Activo', '2020', '2023-05-20', '2024-04-18', 'Camioneta', 'DEF456'),
('VEH003456', 'Inactivo', '2018', '2022-12-10', '2024-04-19', 'Furgoneta', 'GHI789'),
('VEH004567', 'Activo', '2021', '2023-11-07', '2024-04-20', 'SUV', 'JKL012'),
('VEH005678', 'Activo', '2020', '2023-09-05', '2024-04-21', 'Camión', 'MNO345'),
('VEH006789', 'Inactivo', '2019', '2023-06-30', '2024-04-22', 'Sedán', 'PQR678'),
('VEH007890', 'Activo', '2022', '2024-04-08', '2024-04-23', 'Camioneta', 'STU901'),
('VEH008901', 'Inactivo', '2017', '2022-10-30', '2024-04-24', 'Furgoneta', 'VWX234'),
('VEH009012', 'Activo', '2018', '2023-08-17', '2024-04-25', 'SUV', 'YZA567'),
('VEH010123', 'Activo', '2023', '2024-01-05', '2024-04-26', 'Camión', 'BCD890'),
('VEH011234', 'Inactivo', '2016', '2022-11-30', '2024-04-27', 'Sedán', 'EFG123'),
('VEH012345', 'Activo', '2017', '2023-07-25', '2024-04-28', 'Furgoneta', 'HIJ456');

INSERT INTO traslado (cod_traslado, cod_vehiculo, cod_ruta, cod_transportista, cod_operacion_inicia, cod_operacion_termina)
VALUES
('TRSL001234', 'VEH001234', 'RUTA001', 'TRN001234', 'OP001234', 'OP002345'),
('TRSL002345', 'VEH002345', 'RUTA002', 'TRN002345', 'OP002345', 'OP003456'),
('TRSL003456', 'VEH003456', 'RUTA003', 'TRN003456', 'OP003456', 'OP004567'),
('TRSL004567', 'VEH004567', 'RUTA004', 'TRN004567', 'OP004567', 'OP005678'),
('TRSL005678', 'VEH005678', 'RUTA005', 'TRN005678', 'OP005678', 'OP006789'),
('TRSL006789', 'VEH006789', 'RUTA006', 'TRN006789', 'OP006789', NULL),
('TRSL007890', 'VEH007890', 'RUTA007', 'TRN007890', 'OP007890', NULL),
('TRSL008901', 'VEH008901', 'RUTA008', 'TRN008901', 'OP008901', NULL),
('TRSL009012', 'VEH009012', 'RUTA009', 'TRN009012', 'OP009012', NULL),
('TRSL010123', 'VEH010123', 'RUTA010', 'TRN010123', 'OP010123', NULL),
('TRSL011234', 'VEH011234', 'RUTA011', 'TRN011234', 'OP011234', NULL),
('TRSL012345', 'VEH012345', 'RUTA012', 'TRN012345', 'OP012345', NULL);

INSERT INTO incidencia (cod_incidencia, cod_traslado, descripcion, tipo, fecha_ocurrencia)
VALUES
('INC001234', 'TRSL001234', 'Fallo en el motor', 'Mecánica', '2024-04-20'),
('INC002345', 'TRSL002345', 'Ruta bloqueada por accidente', 'Operativa', '2024-04-18'),
('INC003456', 'TRSL003456', 'Retraso por condiciones climáticas adversas', 'Clima', '2024-04-19'),
('INC004567', 'TRSL004567', 'Daño en la carga durante el traslado', 'Operativa', '2024-04-20'),
('INC005678', 'TRSL005678', 'Pérdida de comunicación con el vehículo', 'Tecnológica', '2024-04-21'),
('INC006789', 'TRSL006789', 'Incumplimiento del tiempo de entrega', 'Operativa', '2024-04-22'),
('INC007890', 'TRSL007890', 'Ruta cerrada por obras en la carretera', 'Operativa', '2024-04-23'),
('INC008901', 'TRSL008901', 'Problema con el sistema de navegación', 'Tecnológica', '2024-04-24'),
('INC009012', 'TRSL009012', 'Retraso por congestión de tráfico', 'Operativa', '2024-04-25'),
('INC010123', 'TRSL010123', 'Fallo en el sistema de frenos', 'Mecánica', '2024-04-26'),
('INC011234', 'TRSL011234', 'Robo de mercancía durante el traslado', 'Seguridad', '2024-04-27'),
('INC012345', 'TRSL012345', 'Accidente de tráfico', 'Seguridad', '2024-04-28');

INSERT INTO catalogo_contigencia (cod_catalogo_contigencia, cod_incidencia, comentario)
VALUES
('CAT001234', 'INC001234', 'Se realizó cambio de vehículo y se reanudó el traslado'),
('CAT002345', 'INC002345', 'Se modificó la ruta para evitar el bloqueo y se reprogramó el traslado'),
('CAT003456', 'INC003456', 'Se detuvo temporalmente el traslado hasta mejorar las condiciones climáticas'),
('CAT004567', 'INC004567', 'Se efectuó la descarga de la carga dañada y se procedió con el traslado'),
('CAT005678', 'INC005678', 'Se restableció la comunicación y se continuó con el monitoreo del vehículo'),
('CAT006789', 'INC006789', 'Se gestionó una compensación por el retraso con el cliente'),
('CAT007890', 'INC007890', 'Se buscó una ruta alternativa y se retomó el traslado'),
('CAT008901', 'INC008901', 'Se actualizó el sistema de navegación y se reanudó el traslado'),
('CAT009012', 'INC009012', 'Se coordinó con las autoridades para agilizar el tráfico y reducir el retraso'),
('CAT010123', 'INC010123', 'Se realizó un mantenimiento de emergencia y se continuó con el traslado'),
('CAT011234', 'INC011234', 'Se reportó el incidente a las autoridades correspondientes y se procedió con las medidas de seguridad'),
('CAT012345', 'INC012345', 'Se prestó asistencia médica a los involucrados y se coordinó con las autoridades para la atención del incidente');

INSERT INTO representante (cod_representante, cod_cliente, dni, tipo_representante, num_telefono, correo_empresarial, cargo)
VALUES
('REP001234', 'CLT001234', '123456789', 'Gerente de Ventas', '+1234567890', 'gerente@empresa.com', 'Gerente'),
('REP002345', 'CLT002345', '234567890', 'Jefe de Recursos Humanos', '+2345678901', 'jefe_rrhh@empresa.com', 'Jefe de Recursos Humanos'),
('REP003456', 'CLT003456', '345678901', 'Director de Tecnología', '+3456789012', 'director_tecnologia@empresa.com', 'Director de Tecnología'),
('REP004567', 'CLT004567', '456789012', 'Jefe de Marketing', '+4567890123', 'jefe_marketing@empresa.com', 'Jefe de Marketing'),
('REP005678', 'CLT005678', '567890123', 'Director Financiero', '+5678901234', 'director_finanzas@empresa.com', 'Director Financiero'),
('REP006789', 'CLT006789', '678901234', 'Director de Operaciones', '+6789012345', 'director_operaciones@empresa.com', 'Director de Operaciones'),
('REP007890', 'CLT007890', '789012345', 'Gerente de Desarrollo', '+7890123456', 'gerente_desarrollo@empresa.com', 'Gerente de Desarrollo'),
('REP008901', 'CLT008901', '890123456', 'Jefe de Servicio al Cliente', '+8901234567', 'jefe_servicio_cliente@empresa.com', 'Jefe de Servicio al Cliente'),
('REP009012', 'CLT009012', '901234567', 'Abogado General', '+9012345678', 'abogado_general@empresa.com', 'Abogado General'),
('REP010123', 'CLT010123', '012345678', 'Gerente de Logística', '+0123456789', 'gerente_logistica@empresa.com', 'Gerente de Logística'),
('REP011234', 'CLT011234', '123456780', 'Gerente de Calidad', '+1234567801', 'gerente_calidad@empresa.com', 'Gerente de Calidad'),
('REP012345', 'CLT012345', '234567801', 'Director de Comunicaciones', '+2345678012', 'director_comunicaciones@empresa.com', 'Director de Comunicaciones');


INSERT INTO pedido (cod_pedido, cod_representante, fecha_registro, tipo_pedido, descripcion, estado_pedido)
VALUES
('PED001234', 'REP001234', '2024-04-20', 'Venta', 'Pedido de productos para el cliente X', 'En proceso'),
('PED002345', 'REP002345', '2024-04-18', 'Compra', 'Pedido de suministros para el departamento de RRHH', 'En proceso'),
('PED003456', 'REP003456', '2024-04-19', 'Venta', 'Pedido de equipo de TI para la empresa', 'En proceso'),
('PED004567', 'REP004567', '2024-04-20', 'Venta', 'Pedido de material promocional para campaña de marketing', 'En proceso'),
('PED005678', 'REP005678', '2024-04-21', 'Compra', 'Pedido de suministros de oficina para el departamento financiero', 'En proceso'),
('PED006789', 'REP006789', '2024-04-22', 'Venta', 'Pedido de equipo de logística para operaciones', 'En proceso'),
('PED007890', 'REP007890', '2024-04-23', 'Venta', 'Pedido de desarrollo de software para proyecto X', 'En proceso'),
('PED008901', 'REP008901', '2024-04-24', 'Compra', 'Pedido de atención al cliente para mejorar servicio', 'En proceso'),
('PED009012', 'REP009012', '2024-04-25', 'Venta', 'Pedido de servicios legales para asesoramiento', 'En proceso'),
('PED010123', 'REP010123', '2024-04-26', 'Venta', 'Pedido de equipo de logística para operaciones', 'En proceso'),
('PED011234', 'REP011234', '2024-04-27', 'Compra', 'Pedido de equipo de control de calidad para planta', 'En proceso'),
('PED012345', 'REP012345', '2024-04-28', 'Venta', 'Pedido de servicios de comunicación para campaña', 'En proceso');

INSERT INTO detalle_pedido_producto (pedido_cod_pedido, elemento_catalogo_cod_elemento_catalogo)
VALUES
('PED001234', 'ELM001234'),
('PED002345', 'ELM002345'),
('PED003456', 'ELM003456'),
('PED004567', 'ELM004567'),
('PED005678', 'ELM005678'),
('PED006789', 'ELM006789'),
('PED007890', 'ELM007890'),
('PED008901', 'ELM008901'),
('PED009012', 'ELM009012'),
('PED010123', 'ELM010123'),
('PED011234', 'ELM011234'),
('PED012345', 'ELM012345');

INSERT INTO detalle_pedido_traslado (traslado_cod_traslado, pedido_cod_pedido)
VALUES
('TRSL001234', 'PED001234'),
('TRSL002345', 'PED002345'),
('TRSL003456', 'PED003456'),
('TRSL004567', 'PED004567'),
('TRSL005678', 'PED005678'),
('TRSL006789', 'PED006789'),
('TRSL007890', 'PED007890'),
('TRSL008901', 'PED008901'),
('TRSL009012', 'PED009012'),
('TRSL010123', 'PED010123'),
('TRSL011234', 'PED011234'),
('TRSL012345', 'PED012345');

INSERT INTO evidencia (cod_evidencia, cod_cliente_interno, nombre_evidencia, tipo_evidencia, tipo_archivo)
VALUES
('EVD001234', 'CLI001234', 'Informe de Proyecto', 'Informe', 'PDF'),
('EVD002345', 'CLI002345', 'Presentación de Ventas', 'Presentación', 'PPT'),
('EVD003456', 'CLI003456', 'Documento de Reclutamiento', 'Documento', 'DOC'),
('EVD004567', 'CLI004567', 'Fotografía de Producto', 'Fotografía', 'JPG'),
('EVD005678', 'CLI005678', 'Grabación de Llamada', 'Audio', 'MP3'),
('EVD006789', 'CLI006789', 'Informe de Logística', 'Informe', 'PDF'),
('EVD007890', 'CLI007890', 'Prototipo de Software', 'Software', 'ZIP'),
('EVD008901', 'CLI008901', 'Respuesta de Atención al Cliente', 'Documento', 'DOC'),
('EVD009012', 'CLI009012', 'Contrato Legal', 'Contrato', 'PDF'),
('EVD010123', 'CLI010123', 'Informe de Entrega', 'Informe', 'PDF'),
('EVD011234', 'CLI011234', 'Informe de Calidad', 'Informe', 'PDF'),
('EVD012345', 'CLI012345', 'Comunicado de Prensa', 'Comunicado', 'PDF');

INSERT INTO ubicacion (cod_ubicacion, longitud, latitud)
VALUES
('UBC001234', '40.7128', '-74.0060'),
('UBC002345', '34.0522', '-118.2437'),
('UBC003456', '41.8781', '-87.6298'),
('UBC004567', '51.5074', '-0.1278'),
('UBC005678', '48.8566', '2.3522'),
('UBC006789', '35.6895', '139.6917'),
('UBC007890', '37.7749', '-122.4194'),
('UBC008901', '19.4326', '-99.1332'),
('UBC009012', '55.7558', '37.6176'),
('UBC010123', '22.3193', '114.1694'),
('UBC011234', '43.6532', '-79.3832'),
('UBC012345', '37.9838', '23.7275');

INSERT INTO gps (cod_gps, cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion)
VALUES
('GPS001234', 'UBC001234', 'VEH001234', '2024-04-20', '09:30:00'),
('GPS002345', 'UBC002345', 'VEH002345', '2024-04-21', '10:45:00'),
('GPS003456', 'UBC003456', 'VEH003456', '2024-04-22', '11:20:00'),
('GPS004567', 'UBC004567', 'VEH004567', '2024-04-23', '12:15:00'),
('GPS005678', 'UBC005678', 'VEH005678', '2024-04-24', '13:30:00'),
('GPS006789', 'UBC006789', 'VEH006789', '2024-04-25', '14:40:00'),
('GPS007890', 'UBC007890', 'VEH007890', '2024-04-26', '15:55:00'),
('GPS008901', 'UBC008901', 'VEH008901', '2024-04-27', '16:10:00'),
('GPS009012', 'UBC009012', 'VEH009012', '2024-04-28', '17:25:00'),
('GPS010123', 'UBC010123', 'VEH010123', '2024-04-29', '18:30:00'),
('GPS011234', 'UBC011234', 'VEH011234', '2024-04-30', '19:45:00'),
('GPS012345', 'UBC012345', 'VEH012345', '2024-05-01', '20:55:00');

INSERT INTO "local" (cod_local, cod_cliente, cod_ubicacion, tipo_local, distrito, calle, numero, region, pais)
VALUES
('LOC001234', 'CLI001234', 'UBC001234', 'Almacén', 'Miraflores', 'Av. Larco', '123', 'Lima', 'Perú'),
('LOC002345', 'CLI002345', 'UBC002345', 'Oficina', 'Santa Monica', 'Main St', '456', 'California', 'Estados Unidos'),
('LOC003456', 'CLI003456', 'UBC003456', 'Centro de Distribución', 'Chicago', 'Michigan Ave', '789', 'Illinois', 'Estados Unidos'),
('LOC004567', 'CLI004567', 'UBC004567', 'Tienda', 'Londres', 'Oxford St', '1011', 'Londres', 'Reino Unido'),
('LOC005678', 'CLI005678', 'UBC005678', 'Oficina', 'París', 'Champs-Élysées', '1213', 'Île-de-France', 'Francia'),
('LOC006789', 'CLI006789', 'UBC006789', 'Almacén', 'Tokio', 'Shibuya', '1415', 'Tokio', 'Japón'),
('LOC007890', 'CLI007890', 'UBC007890', 'Oficina', 'San Francisco', 'Market St', '1617', 'California', 'Estados Unidos'),
('LOC008901', 'CLI008901', 'UBC008901', 'Centro de Distribución', 'Ciudad de México', 'Paseo de la Reforma', '1819', 'CDMX', 'México'),
('LOC009012', 'CLI009012', 'UBC009012', 'Oficina', 'Moscú', 'Tverskaya St', '2021', 'Moscú', 'Rusia'),
('LOC010123', 'CLI010123', 'UBC010123', 'Almacén', 'Hong Kong', 'Nathan Rd', '2223', 'Kowloon', 'Hong Kong'),
('LOC011234', 'CLI011234', 'UBC011234', 'Tienda', 'Toronto', 'Yonge St', '2425', 'Ontario', 'Canadá'),
('LOC012345', 'CLI012345', 'UBC012345', 'Oficina', 'Atenas', 'Syntagma Square', '2627', 'Ática', 'Grecia');


INSERT INTO mercancia (cod_mercancia, cod_operacion_picking, cantidad_productos, nro_precinto, peso_total)
VALUES
('MRC001234', 'OPC001234', 100, 'PRECINTO123', 5000),
('MRC002345', 'OPC002345', 200, 'PRECINTO234', 10000),
('MRC003456', 'OPC003456', 150, 'PRECINTO345', 7500),
('MRC004567', 'OPC004567', 120, 'PRECINTO456', 6000),
('MRC005678', 'OPC005678', 180, 'PRECINTO567', 9000),
('MRC006789', 'OPC006789', 220, 'PRECINTO678', 11000),
('MRC007890', 'OPC007890', 130, 'PRECINTO789', 6500),
('MRC008901', 'OPC008901', 240, 'PRECINTO890', 12000),
('MRC009012', 'OPC009012', 170, 'PRECINTO901', 8500),
('MRC010123', 'OPC010123', 200, 'PRECINTO012', 10000),
('MRC011234', 'OPC011234', 160, 'PRECINTO123', 8000),
('MRC012345', 'OPC012345', 190, 'PRECINTO234', 9500);

INSERT INTO norma (cod_norma, cod_catalogo_contigencia)
VALUES
('NRM001234', 'CNTG001234'),
('NRM002345', 'CNTG002345'),
('NRM003456', 'CNTG003456'),
('NRM004567', 'CNTG004567'),
('NRM005678', 'CNTG005678'),
('NRM006789', 'CNTG006789'),
('NRM007890', 'CNTG007890'),
('NRM008901', 'CNTG008901'),
('NRM009012', 'CNTG009012'),
('NRM010123', 'CNTG010123'),
('NRM011234', 'CNTG011234'),
('NRM012345', 'CNTG012345');

INSERT INTO procedimiento (cod_procedimiento, cod_catalogo_contigencia, tipo, descripcion, duracion)
VALUES
('PROC001234', 'CNTG001234', 'Procedimiento 1', 'Descripción del procedimiento 1', '2 horas'),
('PROC002345', 'CNTG002345', 'Procedimiento 2', 'Descripción del procedimiento 2', '1.5 horas'),
('PROC003456', 'CNTG003456', 'Procedimiento 3', 'Descripción del procedimiento 3', '3 horas'),
('PROC004567', 'CNTG004567', 'Procedimiento 4', 'Descripción del procedimiento 4', '2.5 horas'),
('PROC005678', 'CNTG005678', 'Procedimiento 5', 'Descripción del procedimiento 5', '1 hora'),
('PROC006789', 'CNTG006789', 'Procedimiento 6', 'Descripción del procedimiento 6', '4 horas'),
('PROC007890', 'CNTG007890', 'Procedimiento 7', 'Descripción del procedimiento 7', '2 horas'),
('PROC008901', 'CNTG008901', 'Procedimiento 8', 'Descripción del procedimiento 8', '3 horas'),
('PROC009012', 'CNTG009012', 'Procedimiento 9', 'Descripción del procedimiento 9', '1.5 horas'),
('PROC010123', 'CNTG010123', 'Procedimiento 10', 'Descripción del procedimiento 10', '2 horas'),
('PROC011234', 'CNTG011234', 'Procedimiento 11', 'Descripción del procedimiento 11', '1 hora'),
('PROC012345', 'CNTG012345', 'Procedimiento 12', 'Descripción del procedimiento 12', '2.5 horas');

INSERT INTO paso (cod_paso, cod_procedimiento, descripcion)
VALUES
('PASO001234', 'PROC001234', 'Descripción del paso 1'),
('PASO002345', 'PROC002345', 'Descripción del paso 2'),
('PASO003456', 'PROC003456', 'Descripción del paso 3'),
('PASO004567', 'PROC004567', 'Descripción del paso 4'),
('PASO005678', 'PROC005678', 'Descripción del paso 5'),
('PASO006789', 'PROC006789', 'Descripción del paso 6'),
('PASO007890', 'PROC007890', 'Descripción del paso 7'),
('PASO008901', 'PROC008901', 'Descripción del paso 8'),
('PASO009012', 'PROC009012', 'Descripción del paso 9'),
('PASO010123', 'PROC010123', 'Descripción del paso 10'),
('PASO011234', 'PROC011234', 'Descripción del paso 11'),
('PASO012345', 'PROC012345', 'Descripción del paso 12');


INSERT INTO programacion_reporte (cod_programacion_reporte, cod_empleado, formato, estado, frecuencia, filtros, fecha_inicio, fecha_fin)
VALUES
('PR001234', 'EMP001234', 'PDF', 'Activo', 'Semanal', 'Filtro1=Filtro1', '2024-04-01', '2024-04-30'),
('PR002345', 'EMP002345', 'Excel', 'Inactivo', 'Mensual', 'Filtro2=Filtro2', '2024-05-01', '2024-05-31'),
('PR003456', 'EMP003456', 'CSV', 'Activo', 'Diario', 'Filtro3=Filtro3', '2024-04-20', '2024-04-30'),
('PR004567', 'EMP004567', 'PDF', 'Activo', 'Trimestral', 'Filtro4=Filtro4', '2024-04-01', '2024-06-30'),
('PR005678', 'EMP005678', 'Excel', 'Inactivo', 'Semanal', 'Filtro5=Filtro5', '2024-04-01', '2024-04-30'),
('PR006789', 'EMP006789', 'CSV', 'Activo', 'Mensual', 'Filtro6=Filtro6', '2024-04-01', '2024-04-30'),
('PR007890', 'EMP007890', 'PDF', 'Inactivo', 'Anual', 'Filtro7=Filtro7', '2024-01-01', '2024-12-31'),
('PR008901', 'EMP008901', 'Excel', 'Activo', 'Semanal', 'Filtro8=Filtro8', '2024-04-01', '2024-04-30'),
('PR009012', 'EMP009012', 'CSV', 'Inactivo', 'Diario', 'Filtro9=Filtro9', '2024-04-20', '2024-04-30'),
('PR010123', 'EMP010123', 'PDF', 'Activo', 'Trimestral', 'Filtro10=Filtro10', '2024-04-01', '2024-06-30'),
('PR011234', 'EMP011234', 'Excel', 'Inactivo', 'Mensual', 'Filtro11=Filtro11', '2024-05-01', '2024-05-31'),
('PR012345', 'EMP012345', 'CSV', 'Activo', 'Semanal', 'Filtro12=Filtro12', '2024-04-01', '2024-04-30');

INSERT INTO seguimiento (cod_seguimiento, cod_cliente_interno, tipo_accion, comentario, fecha_resolucion, numero_caso)
VALUES
('SGM001234', 'CLI001234', 'Llamada', 'Se realizó seguimiento por teléfono.', '2024-04-05', 'CASO001'),
('SGM002345', 'CLI002345', 'Correo Electrónico', 'Se envió un correo electrónico para seguimiento.', '2024-04-10', 'CASO002'),
('SGM003456', 'CLI003456', 'Visita', 'Se realizó una visita para seguimiento en persona.', '2024-04-15', 'CASO003'),
('SGM004567', 'CLI004567', 'Llamada', 'Se realizó seguimiento por teléfono.', '2024-04-20', 'CASO004'),
('SGM005678', 'CLI005678', 'Correo Electrónico', 'Se envió un correo electrónico para seguimiento.', '2024-04-25', 'CASO005'),
('SGM006789', 'CLI006789', 'Visita', 'Se realizó una visita para seguimiento en persona.', '2024-04-30', 'CASO006'),
('SGM007890', 'CLI007890', 'Llamada', 'Se realizó seguimiento por teléfono.', '2024-05-05', 'CASO007'),
('SGM008901', 'CLI008901', 'Correo Electrónico', 'Se envió un correo electrónico para seguimiento.', '2024-05-10', 'CASO008'),
('SGM009012', 'CLI009012', 'Visita', 'Se realizó una visita para seguimiento en persona.', '2024-05-15', 'CASO009'),
('SGM010123', 'CLI010123', 'Llamada', 'Se realizó seguimiento por teléfono.', '2024-05-20', 'CASO010'),
('SGM011234', 'CLI011234', 'Correo Electrónico', 'Se envió un correo electrónico para seguimiento.', '2024-05-25', 'CASO011');


INSERT INTO reclamo (cod_reclamo, cod_evidencia, cod_empleado, cod_representante, cod_pedido, cod_seguimiento, tipo_reclamo, nivel_urgencia, estado, comentario, fecha_suceso) 
VALUES
('REC001234', 'EVD001234', 'EMP001234', 'REP001234', 'PED001234', 'SGM001234', 'Calidad', 'Alto', 'Pendiente', 'El producto recibido estaba dañado', '2024-04-05'),
('REC002345', 'EVD002345', 'EMP002345', 'REP002345', 'PED002345', 'SGM002345', 'Entrega', 'Medio', 'En Proceso', 'El pedido no llegó en la fecha acordada', '2024-04-10'),
('REC003456', 'EVD003456', 'EMP003456', 'REP003456', 'PED003456', 'SGM003456', 'Calidad', 'Bajo', 'Pendiente', 'La mercancía recibida no coincide con lo solicitado', '2024-04-15'),
('REC004567', 'EVD004567', 'EMP004567', 'REP004567', 'PED004567', 'SGM004567', 'Entrega', 'Alto', 'Resuelto', 'El pedido se entregó incompleto', '2024-04-20'),
('REC005678', 'EVD005678', 'EMP005678', 'REP005678', 'PED005678', 'SGM005678', 'Calidad', 'Medio', 'En Proceso', 'La mercancía recibida está en mal estado', '2024-04-25'),
('REC006789', 'EVD006789', 'EMP006789', 'REP006789', 'PED006789', 'SGM006789', 'Entrega', 'Bajo', 'Pendiente', 'El pedido no se entregó', '2024-04-30'),
('REC007890', 'EVD007890', 'EMP007890', 'REP007890', 'PED007890', 'SGM007890', 'Calidad', 'Alto', 'Resuelto', 'El producto recibido está defectuoso', '2024-05-05'),
('REC008901', 'EVD008901', 'EMP008901', 'REP008901', 'PED008901', 'SGM008901', 'Entrega', 'Medio', 'Pendiente', 'El pedido se entregó con retraso', '2024-05-10'),
('REC009012', 'EVD009012', 'EMP009012', 'REP009012', 'PED009012', 'SGM009012', 'Calidad', 'Bajo', 'En Proceso', 'El producto recibido no es el solicitado', '2024-05-15'),
('REC010123', 'EVD010123', 'EMP010123', 'REP010123', 'PED010123', 'SGM010123', 'Entrega', 'Alto', 'Pendiente', 'El pedido nunca llegó', '2024-05-20'),
('REC011234', 'EVD011234', 'EMP011234', 'REP011234', 'PED011234', 'SGM011234', 'Calidad', 'Medio', 'Resuelto', 'La mercancía recibida está dañada', '2024-05-25'),
('REC012345', 'EVD012345', 'EMP012345', 'REP012345', 'PED012345', 'SGM012345', 'Entrega', 'Bajo', 'Pendiente', 'El pedido llegó tarde', '2024-05-30');



INSERT INTO reporte (cod_reporte, cod_programacion_reporte, fecha_generacion, hora_generacion)
VALUES
('REP001234', 'PR001234', '2024-04-05', '08:30:00'),
('REP002345', 'PR002345', '2024-04-10', '09:45:00'),
('REP003456', 'PR003456', '2024-04-15', '10:15:00'),
('REP004567', 'PR004567', '2024-04-20', '11:00:00'),
('REP005678', 'PR005678', '2024-04-25', '12:30:00'),
('REP006789', 'PR006789', '2024-04-30', '13:45:00'),
('REP007890', 'PR007890', '2024-05-05', '14:20:00'),
('REP008901', 'PR008901', '2024-05-10', '15:00:00'),
('REP009012', 'PR009012', '2024-05-15', '16:10:00'),
('REP010123', 'PR010123', '2024-05-20', '17:20:00'),
('REP011234', 'PR011234', '2024-05-25', '18:30:00'),
('REP012345', 'PR012345', '2024-05-30', '19:40:00');

INSERT INTO tramo (cod_tramo, cod_ruta, distancia, tiempo_estimado)
VALUES
('TRM001234', 'RTA001234', '100 km', '2 horas'),
('TRM002345', 'RTA002345', '150 km', '3 horas'),
('TRM003456', 'RTA003456', '200 km', '4 horas'),
('TRM004567', 'RTA004567', '120 km', '2.5 horas'),
('TRM005678', 'RTA005678', '180 km', '3.5 horas'),
('TRM006789', 'RTA006789', '90 km', '2 horas'),
('TRM007890', 'RTA007890', '160 km', '3 horas'),
('TRM008901', 'RTA008901', '140 km', '2.5 horas'),
('TRM009012', 'RTA009012', '110 km', '2.2 horas'),
('TRM010123', 'RTA010123', '130 km', '2.8 horas');

INSERT INTO detalle_local_tramo (local_cod_local, tramo_cod_tramo, tipo_punto)
VALUES
('LOC001234', 'TRM001234', 'Origen'),
('LOC002345', 'TRM002345', 'Origen'),
('LOC003456', 'TRM003456', 'Origen'),
('LOC004567', 'TRM004567', 'Origen'),
('LOC005678', 'TRM005678', 'Origen'),
('LOC006789', 'TRM006789', 'Origen'),
('LOC007890', 'TRM007890', 'Origen'),
('LOC008901', 'TRM008901', 'Origen'),
('LOC009012', 'TRM009012', 'Origen'),
('LOC010123', 'TRM010123', 'Origen');



