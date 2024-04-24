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

INSERT INTO cliente (cod_cliente, estado, prioridad, fecha_registro) VALUES
('CLI000001', 'Activo', 'Alta', '2023-01-01'),
('CLI000002', 'Inactivo', 'Media', '2022-05-15'),
('CLI000003', 'Activo', 'Baja', '2021-11-22');

INSERT INTO cliente_interno (cod_area, cod_cliente, nombre_area) VALUES
('ARE000001', 'CLI000001', 'Ventas'),
('ARE000002', 'CLI000001', 'Logística'),
('ARE000003', 'CLI000003', 'Operaciones');

INSERT INTO cliente_externo (ruc, cod_cliente, nombre_empresa, razon_social) VALUES
('RUC000001', 'CLI000002', 'Empresa A', 'Empresa A S.A.C.'),
('RUC000002', 'CLI000003', 'Empresa B', 'Empresa B S.R.L.');

INSERT INTO ruta (cod_ruta, punto_origen, punto_destino, distancia_total, tipo_ruta, duracion) VALUES
('RUT000001', 'Lima', 'Arequipa', 1000.5, 'Terrestre', '18 horas'),
('RUT000002', 'Cusco', 'Trujillo', 1500.2, 'Aérea', '2 horas');

INSERT INTO persona (dni, direccion, estado_civil, nacionalidad, genero, primer_apellido, segundo_apellido, prenombre) VALUES
('DNI000001', 'Av. Larco 123', 'Soltero', 'Peruana', 'Masculino', 'Pérez', 'Gómez', 'Juan'),
('DNI000002', 'Jr. Puno 456', 'Casado', 'Peruana', 'Femenino', 'Flores', 'Ríos', 'María'),
('DNI000003', 'Calle Lima 789', 'Divorciado', 'Venezolana', 'Masculino', 'Rodríguez', NULL, 'Pedro');

INSERT INTO empleado (cod_empleado, cod_area, dni, cargo, fecha_contrato) VALUES
('EMP000001', 'ARE000001', 'DNI000001', 'Vendedor', '2020-03-01'),
('EMP000002', 'ARE000002', 'DNI000002', 'Coordinador', '2018-09-15'),
('EMP000003', 'ARE000003', 'DNI000003', 'Supervisor', '2022-06-20');

INSERT INTO operacion (cod_operacion, cod_operacion_previa, cod_empleado_ejecutor, cod_empleado_supervisor, fecha, hora_inicio, hora_fin, tipo_operacion) VALUES
('OPE000001', NULL, 'EMP000001', 'EMP000003', '2023-04-01', '08:00', '12:00', 1),
('OPE000002', 'OPE000001', 'EMP000002', 'EMP000003', '2023-04-01', '13:00', '18:00', 2),
('OPE000003', NULL, 'EMP000001', 'EMP000003', '2023-04-10', '09:00', '14:00', 1);

INSERT INTO transportista (cod_transportista, cod_empleado, num_licencia, estado, tipo_licencia, fecha_vencimiento_licencia, fecha_ultimo_traslado) VALUES
('TRA000001', 'EMP000002', 'LIC123456', 'Activo', 'Profesional', '2025-12-31', '2023-04-15'),
('TRA000002', 'EMP000003', 'LIC789012', 'Inactivo', 'Profesional', '2024-06-30', '2023-03-20');

INSERT INTO vehiculo (cod_vehiculo, estado, anio_fabricacion, fecha_ultimo_mantenimiento, fecha_ultimo_viaje, modelo, placa) VALUES
('VEH000001', 'Operativo', '2018', '2023-02-15', '2023-04-10', 'Camión', 'ABC123'),
('VEH000002', 'Mantenimiento', '2020', '2023-01-01', '2023-04-01', 'Furgoneta', 'DEF456');

INSERT INTO traslado (cod_traslado, cod_vehiculo, cod_ruta, cod_transportista, cod_operacion_inicia, cod_operacion_termina) VALUES
('TRA000001', 'VEH000001', 'RUT000001', 'TRA000001', 'OPE000001', 'OPE000002'),
('TRA000002', 'VEH000002', 'RUT000002', 'TRA000002', 'OPE000003', NULL);

INSERT INTO incidencia (cod_incidencia, cod_traslado, descripcion, tipo, fecha_ocurrencia) VALUES
('INC000001', 'TRA000001', 'Pinchazo de llanta', 'Mecánica', '2023-04-02'),
('INC000002', 'TRA000002', 'Retraso por tráfico', 'Logística', '2023-04-11');

INSERT INTO catalogo_contigencia (cod_catalogo_contigencia, cod_incidencia, comentario) VALUES
('CAT000001', 'INC000001', 'Revisar procedimientos'),
('CAT000002', 'INC000002', 'Ajustar tiempos estimados');

INSERT INTO elemento_catalogo (cod_elemento_catalogo, nombre, categoria, segmento, descripcion, unidad, temperatura_minima, temperatura_maxima, vida_util, peso_unitario) VALUES
('ELE000001', 'Producto A', 1, 1, 'Descripción del Producto A', 'Unidades', 5, 25, 365, 500),
('ELE000002', 'Producto B', 2, 2, 'Descripción del Producto B', 'Kilogramos', 0, 15, 180, 1000);

INSERT INTO representante (cod_representante, cod_cliente, dni, tipo_representante, num_telefono, correo_empresarial, cargo) VALUES
('REP000001', 'CLI000002', 'DNI000001', 'Comercial', '987654321', 'rep1@empresa.com', 'Gerente Ventas'),
('REP000002', 'CLI000003', 'DNI000002', 'Administrativo', '912345678', 'rep2@empresa.com', 'Asistente Administrativo');

INSERT INTO pedido (cod_pedido, cod_representante, fecha_registro, tipo_pedido, descripcion, estado_pedido) VALUES
('PED000001', 'REP000001', '2023-03-01', 'Compra', 'Pedido de Productos A', 'Procesado'),
('PED000002', 'REP000002', '2023-04-10', 'Devolución', 'Devolución de Productos B', 'Pendiente');

INSERT INTO detalle_pedido_producto (pedido_cod_pedido, elemento_catalogo_cod_elemento_catalogo) VALUES
('PED000001', 'ELE000001'),
('PED000002', 'ELE000002');

INSERT INTO detalle_pedido_traslado (traslado_cod_traslado, pedido_cod_pedido) VALUES
('TRA000001', 'PED000001'),
('TRA000002', 'PED000002');

INSERT INTO evidencia (cod_evidencia, cod_cliente_interno, nombre_evidencia, tipo_evidencia, tipo_archivo) VALUES
('EVD000001', 'ARE000001', 'Factura123.pdf', 'Documento', 'PDF'),
('EVD000002', 'ARE000003', 'Foto_incidencia.jpg', 'Imagen', 'JPG');

INSERT INTO ubicacion (cod_ubicacion, longitud, latitud) VALUES
('UBI000001', '-12.0456789', '-77.0987654'),
('UBI000002', '-13.1234567', '-72.8765432');

INSERT INTO gps (cod_gps, cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) VALUES
('GPS000001', 'UBI000001', 'VEH000001', '2023-04-15', '10:30:00'),
('GPS000002', 'UBI000002', 'VEH000002', '2023-04-15', '12:45:00');

INSERT INTO "local" (cod_local, cod_cliente, cod_ubicacion, tipo_local, distrito, calle, numero, region, pais) VALUES
('LOC000001', 'CLI000001', 'UBI000001', 'Almacén', 'Surquillo', 'Av. Primavera', '123', 'Lima', 'Perú'),
('LOC000002', 'CLI000003', 'UBI000002', 'Oficina', 'Arequipa', 'Jr. Misti', '456', 'Arequipa', 'Perú');

INSERT INTO mercancia (cod_mercancia, cod_operacion_picking, cantidad_productos, nro_precinto, peso_total) VALUES
('MER000001', 'OPE000001', 100, 'PREC123456', 50000),
('MER000002', 'OPE000003', 50, 'PREC789012', 25000);

INSERT INTO norma (cod_norma, cod_catalogo_contigencia) VALUES
('NOR000001', 'CAT000001'),
('NOR000002', 'CAT000002');

INSERT INTO procedimiento (cod_procedimiento, cod_catalogo_contigencia, tipo, descripcion, duracion) VALUES
('PRO000001', 'CAT000001', 'Mecánico', 'Cambio de llanta', '1 hora'),
('PRO000002', 'CAT000002', 'Logístico', 'Ruta alternativa', '2 horas');

INSERT INTO paso (cod_paso, cod_procedimiento, descripcion) VALUES
('PAS000001', 'PRO000001', 'Elevar el vehículo'),
('PAS000002', 'PRO000001', 'Retirar la llanta dañada'),
('PAS000003', 'PRO000002', 'Consultar rutas alternativas');

INSERT INTO programacion_reporte (cod_programacion_reporte, cod_empleado, formato, estado, frecuencia, filtros, fecha_inicio, fecha_fin) VALUES
('PRG000001', 'EMP000002', 'PDF', 'Activo', 'Semanal', 'Área=Logística', '2023-04-01', '2023-04-30'),
('PRG000002', 'EMP000003', 'Excel', 'Inactivo', 'Mensual', 'Área=Operaciones', '2023-03-01', '2023-03-31');

INSERT INTO seguimiento (cod_seguimiento, cod_cliente_interno, tipo_accion, comentario, fecha_resolucion, numero_caso) VALUES
('SEG000001', 'ARE000001', 'Reclamo', 'Producto dañado', '2023-04-20', 'CASO123'),
('SEG000002', 'ARE000003', 'Consulta', 'Demora en entrega', '2023-04-25', 'CASO456');

INSERT INTO reclamo (cod_reclamo, cod_evidencia, cod_empleado, cod_representante, cod_pedido, cod_seguimiento, tipo_reclamo, nivel_urgencia, estado, comentario, fecha_suceso) VALUES
('REC000001', 'EVD000001', 'EMP000001', 'REP000001', 'PED000001', 'SEG000001', 'Calidad', 'Alta', 'Abierto', 'Producto defectuoso', '2023-04-15'),
('REC000002', 'EVD000002', 'EMP000003', 'REP000002', 'PED000002', 'SEG000002', 'Logística', 'Media', 'En proceso', 'Retraso en entrega', '2023-04-20');

INSERT INTO reporte (cod_reporte, cod_programacion_reporte, fecha_generacion, hora_generacion) VALUES
('REP000001', 'PRG000001', '2023-04-08', '10:00:00'),
('REP000002', 'PRG000002', '2023-04-01', '08:30:00');

INSERT INTO stock (cod_stock, cod_elemento_catalogo, cod_mercancia, nro_lote, tipo_stock, fecha_caducidad) VALUES
('STO000001', 'ELE000001', 'MER000001', 1234, 1, '2024-06-30'),
('STO000002', 'ELE000002', 'MER000002', 5678, 2, '2023-12-31');

INSERT INTO tramo (cod_tramo, cod_ruta, distancia, tiempo_estimado) VALUES
('TRA000001', 'RUT000001', 500.0, 8.0),
('TRA000002', 'RUT000001', 500.0, 10.0),
('TRA000003', 'RUT000002', 1000.0, 1.0),
('TRA000004', 'RUT000002', 500.0, 1.0);

INSERT INTO detalle_local_tramo (local_cod_local, tramo_cod_tramo, tipo_punto) VALUES
('LOC000001', 'TRA000001', 'Origen'),
('LOC000002', 'TRA000002', 'Destino'),
('LOC000001', 'TRA000003', 'Origen'),
('LOC000002', 'TRA000004', 'Destino');

INSERT INTO cliente (cod_cliente, estado, prioridad, fecha_registro) VALUES
('CLI000004', 'Activo', 'Alta', '2022-08-15'),
('CLI000005', 'Inactivo', 'Media', '2021-03-10'),
('CLI000006', 'Activo', 'Baja', '2023-01-20');

-- Más áreas internas
INSERT INTO cliente_interno (cod_area, cod_cliente, nombre_area) VALUES
('ARE000004', 'CLI000004', 'Finanzas'),
('ARE000005', 'CLI000004', 'Recursos Humanos'),
('ARE000006', 'CLI000006', 'Compras');

-- Más clientes externos
INSERT INTO cliente_externo (ruc, cod_cliente, nombre_empresa, razon_social) VALUES
('RUC000003', 'CLI000005', 'Empresa C', 'Empresa C S.A.'),
('RUC000004', 'CLI000006', 'Empresa D', 'Empresa D E.I.R.L.');

-- Más rutas
INSERT INTO ruta (cod_ruta, punto_origen, punto_destino, distancia_total, tipo_ruta, duracion) VALUES
('RUT000003', 'Piura', 'Chiclayo', 800.0, 'Terrestre', '12 horas'),
('RUT000004', 'Iquitos', 'Tarapoto', 600.0, 'Aérea', '1 hora');

-- Más personas
INSERT INTO persona (dni, direccion, estado_civil, nacionalidad, genero, primer_apellido, segundo_apellido, prenombre) VALUES
('DNI000004', 'Av. Larco 789', 'Casado', 'Peruana', 'Masculino', 'García', 'Sánchez', 'Luis'),
('DNI000005', 'Jr. Puno 159', 'Soltero', 'Colombiana', 'Femenino', 'Martínez', 'Rojas', 'Ana'),
('DNI000006', 'Calle Lima 456', 'Divorciado', 'Peruana', 'Masculino', 'Torres', NULL, 'Carlos');

-- Más empleados
INSERT INTO empleado (cod_empleado, cod_area, dni, cargo, fecha_contrato) VALUES
('EMP000004', 'ARE000004', 'DNI000004', 'Analista', '2021-07-01'),
('EMP000005', 'ARE000005', 'DNI000005', 'Asistente', '2019-11-15'),
('EMP000006', 'ARE000006', 'DNI000006', 'Comprador', '2022-03-20');

-- Más operaciones
INSERT INTO operacion (cod_operacion, cod_operacion_previa, cod_empleado_ejecutor, cod_empleado_supervisor, fecha, hora_inicio, hora_fin, tipo_operacion) VALUES
('OPE000004', NULL, 'EMP000004', 'EMP000003', '2023-04-20', '09:00', '14:00', 1),
('OPE000005', 'OPE000004', 'EMP000005', 'EMP000003', '2023-04-20', '15:00', '18:00', 2),
('OPE000006', NULL, 'EMP000006', 'EMP000003', '2023-04-25', '10:00', '16:00', 1);

-- Más transportistas
INSERT INTO transportista (cod_transportista, cod_empleado, num_licencia, estado, tipo_licencia, fecha_vencimiento_licencia, fecha_ultimo_traslado) VALUES
('TRA000003', 'EMP000004', 'LIC345678', 'Activo', 'Profesional', '2024-12-31', '2023-04-18'),
('TRA000004', 'EMP000005', 'LIC901234', 'Inactivo', 'Profesional', '2023-09-30', '2023-03-25');

-- Más vehículos
INSERT INTO vehiculo (cod_vehiculo, estado, anio_fabricacion, fecha_ultimo_mantenimiento, fecha_ultimo_viaje, modelo, placa) VALUES
('VEH000003', 'Operativo', '2016', '2023-03-01', '2023-04-15', 'Camioneta', 'GHI789'),
('VEH000004', 'Mantenimiento', '2019', '2023-02-10', '2023-04-10', 'Furgón', 'JKL012');

-- Más traslados
INSERT INTO traslado (cod_traslado, cod_vehiculo, cod_ruta, cod_transportista, cod_operacion_inicia, cod_operacion_termina) VALUES
('TRA000003', 'VEH000003', 'RUT000003', 'TRA000003', 'OPE000004', 'OPE000005'),
('TRA000004', 'VEH000004', 'RUT000004', 'TRA000004', 'OPE000006', NULL);

-- Más incidencias
INSERT INTO incidencia (cod_incidencia, cod_traslado, descripcion, tipo, fecha_ocurrencia) VALUES
('INC000003', 'TRA000003', 'Falla mecánica', 'Mecánica', '2023-04-21'),
('INC000004', 'TRA000004', 'Condiciones climáticas adversas', 'Externa', '2023-04-26');

-- Más catálogos de contingencia
INSERT INTO catalogo_contigencia (cod_catalogo_contigencia, cod_incidencia, comentario) VALUES
('CAT000003', 'INC000003', 'Revisar mantenimiento preventivo'),
('CAT000004', 'INC000004', 'Activar plan de contingencia');

-- Más elementos de catálogo
INSERT INTO elemento_catalogo (cod_elemento_catalogo, nombre, categoria, segmento, descripcion, unidad, temperatura_minima, temperatura_maxima, vida_util, peso_unitario) VALUES
('ELE000003', 'Producto C', 3, 1, 'Descripción del Producto C', 'Litros', -5, 10, 180, 2000),
('ELE000004', 'Producto D', 1, 3, 'Descripción del Producto D', 'Piezas', 15, 30, 365, 100);

-- Más representantes
INSERT INTO representante (cod_representante, cod_cliente, dni, tipo_representante, num_telefono, correo_empresarial, cargo) VALUES
('REP000003', 'CLI000004', 'DNI000004', 'Comercial', '987654321', 'rep3@empresa.com', 'Ejecutivo de Ventas'),
('REP000004', 'CLI000005', 'DNI000005', 'Administrativo', '912345678', 'rep4@empresa.com', 'Asistente Administrativo');

-- Más pedidos
INSERT INTO pedido (cod_pedido, cod_representante, fecha_registro, tipo_pedido, descripcion, estado_pedido) VALUES
('PED000003', 'REP000003', '2023-04-05', 'Compra', 'Pedido de Productos C', 'Procesado'),
('PED000004', 'REP000004', '2023-04-15', 'Devolución', 'Devolución de Productos D', 'Pendiente');

-- Más detalles de pedidos de productos
INSERT INTO detalle_pedido_producto (pedido_cod_pedido, elemento_catalogo_cod_elemento_catalogo) VALUES
('PED000003', 'ELE000003'),
('PED000004', 'ELE000004');

-- Más detalles de pedidos y traslados
INSERT INTO detalle_pedido_traslado (traslado_cod_traslado, pedido_cod_pedido) VALUES
('TRA000003', 'PED000003'),
('TRA000004', 'PED000004');

-- Más evidencias
INSERT INTO evidencia (cod_evidencia, cod_cliente_interno, nombre_evidencia, tipo_evidencia, tipo_archivo) VALUES
('EVD000003', 'ARE000004', 'Reporte_financiero.xlsx', 'Documento', 'XLSX'),
('EVD000004', 'ARE000006', 'Foto_recepcion.jpg', 'Imagen', 'JPG');

-- Más ubicaciones
INSERT INTO ubicacion (cod_ubicacion, longitud, latitud) VALUES
('UBI000003', '-5.1234567', '-80.9876543'),
('UBI000004', '-16.5432109', '-71.5678901');

-- Más registros GPS
INSERT INTO gps (cod_gps, cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) VALUES
('GPS000003', 'UBI000003', 'VEH000003', '2023-04-21', '08:15:00'),
('GPS000004', 'UBI000004', 'VEH000004', '2023-04-26', '11:30:00');

-- Más locales
INSERT INTO local (cod_local, cod_cliente, cod_ubicacion, tipo_local, distrito, calle, numero, region, pais) VALUES
('LOC000003', 'CLI000004', 'UBI000003', 'Oficina', 'Piura', 'Av. Grau', '789', 'Piura', 'Perú'),
('LOC000004', 'CLI000006', 'UBI000004', 'Almacén', 'Cusco', 'Jr. Puno', '246', 'Cusco', 'Perú');

-- Más mercancías
INSERT INTO mercancia (cod_mercancia, cod_operacion_picking, cantidad_productos, nro_precinto, peso_total) VALUES
('MER000003', 'OPE000004', 75, 'PREC345678', 30000),
('MER000004', 'OPE000006', 120, 'PREC901234', 60000);

-- Más normas
INSERT INTO norma (cod_norma, cod_catalogo_contigencia) VALUES
('NOR000003', 'CAT000003'),
('NOR000004', 'CAT000004');

-- Más procedimientos
INSERT INTO procedimiento (cod_procedimiento, cod_catalogo_contigencia, tipo, descripcion, duracion) VALUES
('PRO000003', 'CAT000003', 'Mecánico', 'Reparación de motor', '4 horas'),
('PRO000004', 'CAT000004', 'Logístico', 'Ruta de desvío', '6 horas');

-- Más pasos
INSERT INTO paso (cod_paso, cod_procedimiento, descripcion) VALUES
('PAS000004', 'PRO000003', 'Diagnosticar la falla'),
('PAS000005', 'PRO000003', 'Reemplazar piezas dañadas'),
('PAS000006', 'PRO000004', 'Evaluar rutas alternativas'),
('PAS000007', 'PRO000004', 'Coordinar con destinos');

-- Más programaciones de reportes
INSERT INTO programacion_reporte (cod_programacion_reporte, cod_empleado, formato, estado, frecuencia, filtros, fecha_inicio, fecha_fin) VALUES
('PRG000003', 'EMP000004', 'PDF', 'Activo', 'Mensual', 'Área=Finanzas', '2023-04-01', '2023-04-30'),
('PRG000004', 'EMP000006', 'Excel', 'Inactivo', 'Trimestral', 'Área=Compras', '2023-01-01', '2023-03-31');

-- Más seguimientos
INSERT INTO seguimiento (cod_seguimiento, cod_cliente_interno, tipo_accion, comentario, fecha_resolucion, numero_caso) VALUES
('SEG000003', 'ARE000004', 'Consulta', 'Estado de facturación', '2023-04-28', 'CASO789'),
('SEG000004', 'ARE000006', 'Reclamo', 'Productos dañados', '2023-05-02', 'CASO012');

-- Más reclamos
INSERT INTO reclamo (cod_reclamo, cod_evidencia, cod_empleado, cod_representante, cod_pedido, cod_seguimiento, tipo_reclamo, nivel_urgencia, estado, comentario, fecha_suceso) VALUES
('REC000003', 'EVD000003', 'EMP000004', 'REP000003', 'PED000003', 'SEG000003', 'Administrativo', 'Media', 'Abierto', 'Inconsistencia en factura', '2023-04-22'),
('REC000004', 'EVD000004', 'EMP000006', 'REP000004', 'PED000004', 'SEG000004', 'Calidad', 'Alta', 'En proceso', 'Productos averiados', '2023-04-28');

-- Más reportes
INSERT INTO reporte (cod_reporte, cod_programacion_reporte, fecha_generacion, hora_generacion) VALUES
('REP000003', 'PRG000003', '2023-04-30', '18:00:00'),
('REP000004', 'PRG000004', '2023-04-01', '10:30:00');

-- Más stocks
INSERT INTO stock (cod_stock, cod_elemento_catalogo, cod_mercancia, nro_lote, tipo_stock, fecha_caducidad) VALUES
('STO000003', 'ELE000003', 'MER000003', 9012, 1, '2023-10-31'),
('STO000004', 'ELE000004', 'MER000004', 3456, 2, '2024-03-15');

-- Más tramos
INSERT INTO tramo (cod_tramo, cod_ruta, distancia, tiempo_estimado) VALUES
('TRA000005', 'RUT000003', 400.0, 6.0),
('TRA000006', 'RUT000003', 400.0, 6.0),
('TRA000007', 'RUT000004', 300.0, 0.5),
('TRA000008', 'RUT000004', 300.0, 0.5);

-- Más detalles de locales y tramos
INSERT INTO detalle_local_tramo (local_cod_local, tramo_cod_tramo, tipo_punto) VALUES
('LOC000003', 'TRA000005', 'Origen'),
('LOC000004', 'TRA000006', 'Destino'),
('LOC000003', 'TRA000007', 'Origen'),
('LOC000004', 'TRA000008', 'Destino');

INSERT INTO cliente (cod_cliente, estado, prioridad, fecha_registro) VALUES
('CLI000007', 'Activo', 'Alta', '2022-11-01'),
('CLI000008', 'Inactivo', 'Baja', '2021-06-15'),
('CLI000009', 'Activo', 'Media', '2023-02-10');

-- Más áreas internas
INSERT INTO cliente_interno (cod_area, cod_cliente, nombre_area) VALUES
('ARE000007', 'CLI000007', 'Marketing'),
('ARE000008', 'CLI000007', 'Sistemas'),
('ARE000009', 'CLI000009', 'Producción');

-- Más clientes externos
INSERT INTO cliente_externo (ruc, cod_cliente, nombre_empresa, razon_social) VALUES
('RUC000005', 'CLI000008', 'Empresa E', 'Empresa E S.A.C.'),
('RUC000006', 'CLI000009', 'Empresa F', 'Empresa F S.R.L.');

-- Más rutas
INSERT INTO ruta (cod_ruta, punto_origen, punto_destino, distancia_total, tipo_ruta, duracion) VALUES
('RUT000005', 'Huancayo', 'Ayacucho', 500.0, 'Terrestre', '8 horas'),
('RUT000006', 'Juliaca', 'Puno', 300.0, 'Terrestre', '5 horas');

-- Más personas
INSERT INTO persona (dni, direccion, estado_civil, nacionalidad, genero, primer_apellido, segundo_apellido, prenombre) VALUES
('DNI000007', 'Av. Larco 456', 'Soltero', 'Peruana', 'Femenino', 'Ramírez', 'Guzmán', 'Sofía'),
('DNI000008', 'Jr. Puno 789', 'Casado', 'Chilena', 'Masculino', 'Fuentes', 'Arriagada', 'Diego'),
('DNI000009', 'Calle Lima 123', 'Divorciado', 'Peruana', 'Femenino', 'Castro', NULL, 'Lucía');

-- Más empleados
INSERT INTO empleado (cod_empleado, cod_area, dni, cargo, fecha_contrato) VALUES
('EMP000007', 'ARE000007', 'DNI000007', 'Analista de Marketing', '2020-09-01'),
('EMP000008', 'ARE000008', 'DNI000008', 'Desarrollador de Software', '2021-03-15'),
('EMP000009', 'ARE000009', 'DNI000009', 'Supervisor de Producción', '2019-07-20');

-- Más operaciones
INSERT INTO operacion (cod_operacion, cod_operacion_previa, cod_empleado_ejecutor, cod_empleado_supervisor, fecha, hora_inicio, hora_fin, tipo_operacion) VALUES
('OPE000007', NULL, 'EMP000007', 'EMP000003', '2023-05-02', '09:00', '13:00', 1),
('OPE000008', 'OPE000007', 'EMP000008', 'EMP000003', '2023-05-02', '14:00', '18:00', 2),
('OPE000009', NULL, 'EMP000009', 'EMP000003', '2023-05-05', '08:00', '16:00', 1);

-- Más transportistas
INSERT INTO transportista (cod_transportista, cod_empleado, num_licencia, estado, tipo_licencia, fecha_vencimiento_licencia, fecha_ultimo_traslado) VALUES
('TRA000005', 'EMP000007', 'LIC567890', 'Activo', 'Profesional', '2025-06-30', '2023-04-30'),
('TRA000006', 'EMP000008', 'LIC012345', 'Inactivo', 'Profesional', '2024-03-31', '2023-04-20');

-- Más vehículos
INSERT INTO vehiculo (cod_vehiculo, estado, anio_fabricacion, fecha_ultimo_mantenimiento, fecha_ultimo_viaje, modelo, placa) VALUES
('VEH000005', 'Operativo', '2017', '2023-04-01', '2023-05-01', 'Camión', 'MNO678'),
('VEH000006', 'Mantenimiento', '2021', '2023-03-15', '2023-04-25', 'Furgoneta', 'PQR901');

-- Más traslados
INSERT INTO traslado (cod_traslado, cod_vehiculo, cod_ruta, cod_transportista, cod_operacion_inicia, cod_operacion_termina) VALUES
('TRA000005', 'VEH000005', 'RUT000005', 'TRA000005', 'OPE000007', 'OPE000008'),
('TRA000006', 'VEH000006', 'RUT000006', 'TRA000006', 'OPE000009', NULL);

-- Más incidencias
INSERT INTO incidencia (cod_incidencia, cod_traslado, descripcion, tipo, fecha_ocurrencia) VALUES
('INC000005', 'TRA000005', 'Retraso por control policial', 'Externa', '2023-05-03'),
('INC000006', 'TRA000006', 'Falla en el sistema de refrigeración', 'Mecánica', '2023-05-06');

-- Más catálogos de contingencia
INSERT INTO catalogo_contigencia (cod_catalogo_contigencia, cod_incidencia, comentario) VALUES
('CAT000005', 'INC000005', 'Revisar rutas alternativas'),
('CAT000006', 'INC000006', 'Activar procedimiento de mantenimiento');

-- Más elementos de catálogo
INSERT INTO elemento_catalogo (cod_elemento_catalogo, nombre, categoria, segmento, descripcion, unidad, temperatura_minima, temperatura_maxima, vida_util, peso_unitario) VALUES
('ELE000005', 'Producto E', 2, 2, 'Descripción del Producto E', 'Cajas', 10, 25, 180, 5000),
('ELE000006', 'Producto F', 3, 3, 'Descripción del Producto F', 'Bolsas', -10, 5, 90, 1500);

-- Más representantes
INSERT INTO representante (cod_representante, cod_cliente, dni, tipo_representante, num_telefono, correo_empresarial, cargo) VALUES
('REP000005', 'CLI000007', 'DNI000007', 'Comercial', '987654321', 'rep5@empresa.com', 'Coordinador de Marketing'),
('REP000006', 'CLI000008', 'DNI000008', 'Administrativo', '912345678', 'rep6@empresa.com', 'Asistente Administrativo');

-- Más pedidos
INSERT INTO pedido (cod_pedido, cod_representante, fecha_registro, tipo_pedido, descripcion, estado_pedido) VALUES
('PED000005', 'REP000005', '2023-04-25', 'Compra', 'Pedido de Productos E', 'Procesado'),
('PED000006', 'REP000006', '2023-05-01', 'Devolución', 'Devolución de Productos F', 'Pendiente');

-- Más detalles de pedidos de productos
INSERT INTO detalle_pedido_producto (pedido_cod_pedido, elemento_catalogo_cod_elemento_catalogo) VALUES
('PED000005', 'ELE000005'),
('PED000006', 'ELE000006');

-- Más detalles de pedidos y traslados
INSERT INTO detalle_pedido_traslado (traslado_cod_traslado, pedido_cod_pedido) VALUES
('TRA000005', 'PED000005'),
('TRA000006', 'PED000006');

-- Más evidencias
INSERT INTO evidencia (cod_evidencia, cod_cliente_interno, nombre_evidencia, tipo_evidencia, tipo_archivo) VALUES
('EVD000005', 'ARE000007', 'Informe_campaña.pptx', 'Documento', 'PPTX'),
('EVD000006', 'ARE000009', 'Foto_incidente.png', 'Imagen', 'PNG');

-- Más ubicaciones
INSERT INTO ubicacion (cod_ubicacion, longitud, latitud) VALUES
('UBI000005', '-11.9876543', '-75.1234567'),
('UBI000006', '-15.5678901', '-70.2345678');

-- Más registros GPS
INSERT INTO gps (cod_gps, cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) VALUES
('GPS000005', 'UBI000005', 'VEH000005', '2023-05-03', '14:20:00'),
('GPS000006', 'UBI000006', 'VEH000006', '2023-05-06', '11:45:00');

-- Más locales
INSERT INTO local (cod_local, cod_cliente, cod_ubicacion, tipo_local, distrito, calle, numero, region, pais) VALUES
('LOC000005', 'CLI000007', 'UBI000005', 'Oficina', 'Huancayo', 'Av. Ferrocarril', '567', 'Junín', 'Perú'),
('LOC000006', 'CLI000009', 'UBI000006', 'Almacén', 'Puno', 'Jr. Tacna', '890', 'Puno', 'Perú');

-- Más mercancías
INSERT INTO mercancia (cod_mercancia, cod_operacion_picking, cantidad_productos, nro_precinto, peso_total) VALUES
('MER000005', 'OPE000007', 80, 'PREC567890', 40000),
('MER000006', 'OPE000009', 90, 'PREC012345', 45000);

-- Más normas
INSERT INTO norma (cod_norma, cod_catalogo_contigencia) VALUES
('NOR000005', 'CAT000005'),
('NOR000006', 'CAT000006');

-- Más procedimientos
INSERT INTO procedimiento (cod_procedimiento, cod_catalogo_contigencia, tipo, descripcion, duracion) VALUES
('PRO000005', 'CAT000005', 'Logístico', 'Cambio de ruta', '2 horas'),
('PRO000006', 'CAT000006', 'Mantenimiento', 'Reparación de sistema de refrigeración', '6 horas');

-- Más pasos
INSERT INTO paso (cod_paso, cod_procedimiento, descripcion) VALUES
('PAS000008', 'PRO000005', 'Identificar ruta alternativa'),
('PAS000009', 'PRO000005', 'Notificar a destinos'),
('PAS000010', 'PRO000006', 'Diagnosticar la falla'),
('PAS000011', 'PRO000006', 'Reparar o reemplazar componentes');

-- Más programaciones de reportes
INSERT INTO programacion_reporte (cod_programacion_reporte, cod_empleado, formato, estado, frecuencia, filtros, fecha_inicio, fecha_fin) VALUES
('PRG000005', 'EMP000007', 'PDF', 'Activo', 'Semanal', 'Área=Marketing', '2023-05-01', '2023-05-31'),
('PRG000006', 'EMP000009', 'Excel', 'Inactivo', 'Mensual', 'Área=Producción', '2023-04-01', '2023-04-30');

-- Más seguimientos
INSERT INTO seguimiento (cod_seguimiento, cod_cliente_interno, tipo_accion, comentario, fecha_resolucion, numero_caso) VALUES
('SEG000005', 'ARE000007', 'Consulta', 'Estatus de campaña', '2023-05-10', 'CASO345'),
('SEG000006', 'ARE000009', 'Reclamo', 'Productos vencidos', '2023-05-15', 'CASO678');

-- Más reclamos
INSERT INTO reclamo (cod_reclamo, cod_evidencia, cod_empleado, cod_representante, cod_pedido, cod_seguimiento, tipo_reclamo, nivel_urgencia, estado, comentario, fecha_suceso) VALUES
('REC000005', 'EVD000005', 'EMP000007', 'REP000005', 'PED000005', 'SEG000005', 'Administrativo', 'Baja', 'Abierto', 'Retraso en informes', '2023-05-05'),
('REC000006', 'EVD000006', 'EMP000009', 'REP000006', 'PED000006', 'SEG000006', 'Calidad', 'Alta', 'En proceso', 'Productos vencidos', '2023-05-10');

-- Más reportes
INSERT INTO reporte (cod_reporte, cod_programacion_reporte, fecha_generacion, hora_generacion) VALUES
('REP000005', 'PRG000005', '2023-05-06', '10:00:00'),
('REP000006', 'PRG000006', '2023-04-30', '18:30:00');

-- Más stocks
INSERT INTO stock (cod_stock, cod_elemento_catalogo, cod_mercancia, nro_lote, tipo_stock, fecha_caducidad) VALUES
('STO000005', 'ELE000005', 'MER000005', 6789, 1, '2023-09-30'),
('STO000006', 'ELE000006', 'MER000006', 1011, 2, '2023-07-31');

-- Más tramos
INSERT INTO tramo (cod_tramo, cod_ruta, distancia, tiempo_estimado) VALUES
('TRA000009', 'RUT000005', 250.0, 4.0),
('TRA000010', 'RUT000005', 250.0, 4.0),
('TRA000011', 'RUT000006', 150.0, 2.5),
('TRA000012', 'RUT000006', 150.0, 2.5);

-- Más detalles de locales y tramos
INSERT INTO detalle_local_tramo (local_cod_local, tramo_cod_tramo, tipo_punto) VALUES
('LOC000005', 'TRA000009', 'Origen'),
('LOC000006', 'TRA000010', 'Destino'),
('LOC000005', 'TRA000011', 'Origen'),
('LOC000006', 'TRA000012', 'Destino');
