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
  origen VARCHAR(45) NULL DEFAULT NULL,
  fin VARCHAR(45) NULL DEFAULT NULL,
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
INSERT INTO Elemento_catalogo (cod_elemento_catalogo, nombre, categoria, segmento, descripcion, unidad, temperatura_maxima, temperatura_minima, vida_util, peso_unitario) VALUES
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
('723456719', 'Emulsionante Quality para mejorar la textura del producto', 18, 1, 'Emulsionante Quality para mejorar la textura del producto, ideal para aplicaciones culinarias.', 'gramo', NULL, NULL, 365, 40);
('923456720', 'Detergente SuperClean', 23, 2, 'Detergente SuperClean para uso industrial, ideal para limpieza profunda y desengrase de equipos y superficies.', 'litro', NULL, NULL, NULL, 1000);

-- Poblamiento de datos para la entidad Operación
INSERT INTO Operación (cod_operacion, cod_operacion_previa, cod_empleado_ejecutor, cod_empleado_supervisor, tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES 
  ('000000001', NULL, '123456789', '987654321', 1, '2024-04-01', '08:00:00', '08:30:00'), -- Picking
  ('000000002', '000000001', '123456789', '987654321', 2, '2024-04-01', '08:45:00', '09:15:00'), -- Precintado
  ('000000003', '000000002', '123456789', '987654321', 3, '2024-04-01', '09:30:00', '10:30:00'), -- Paletizado
  ('000000004', '000000003', '123456789', '987654321', 4, '2024-04-01', '10:45:00', '11:15:00'), -- Carga
  ('000000005', '000000004', '123456789', '987654321', 5, '2024-04-01', '11:30:00', '12:00:00'), -- Salida
  ('000000006', '000000005', '123456789', '987654321', 6, '2024-04-01', '14:00:00', '14:30:00'), -- Recepción
  ('000000007', '000000006', '123456789', '987654321', 7, '2024-04-01', '14:45:00', '15:15:00'); -- Descarga
  ('000000008', NULL, '123456789', '987654321', 1, '2024-04-02', '08:00:00', '08:35:00'), -- Picking
  ('000000009', '000000008', '123456789', '987654321', 2, '2024-04-02', '08:45:00', '09:15:00'), -- Precintado
  ('000000010', '000000009', '123456789', '987654321', 3, '2024-04-02', '09:30:00', '10:30:00'), -- Paletizado
  ('000000011', '000000010', '123456789', '987654321', 4, '2024-04-02', '10:45:00', '11:15:00'), -- Carga
  ('000000012', '000000011', '123456789', '987654321', 5, '2024-04-02', '11:30:00', '12:00:00'), -- Salida
  ('000000013', NULL, '123456789', '987654321', 1, '2024-04-02', '11:36:00', '11:52:00'), -- Picking

-- Poblamiento de datos para la entidad Mercancía
INSERT INTO Mercancía (cod_mercancia, cod_operacion_picking, numero_precinto)
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
    UPDATE Mercancía m
    SET peso_total = (
        SELECT SUM(ec.peso_unitario)
        FROM Stock s
        INNER JOIN Elemento_catalogo ec ON s.cod_elemento_catalogo = ec.cod_elemento_catalogo
        WHERE s.cod_mercancia = NEW.cod_mercancia
    )
    WHERE m.cod_mercancia = NEW.cod_mercancia;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION calcular_cantidad_producto()
RETURNS TRIGGER AS $$
BEGIN
    UPDATE Mercancía m
    SET cantidad_producto = (
        SELECT COUNT(*)
        FROM Stock s
        WHERE s.cod_mercancia = NEW.cod_mercancia
    )
    WHERE m.cod_mercancia = NEW.cod_mercancia;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Asociación de los triggers con la tabla Stock
CREATE TRIGGER actualizar_peso_total
AFTER INSERT OR UPDATE ON Stock
FOR EACH ROW
EXECUTE FUNCTION calcular_peso_total();

CREATE TRIGGER actualizar_cantidad_producto
AFTER INSERT OR UPDATE ON Stock
FOR EACH ROW
EXECUTE FUNCTION calcular_cantidad_producto();

-- Poblamiento de datos para la entidad Stock
INSERT INTO Stock (cod_stock, cod_elemento_catalogo, cod_mercancia, nro_lote, tipo_stock, fecha_caducidad) VALUES
('987654321', '123456789', '987654321', 123, 3, '2024-04-01'),
('987654322', '223456789', '987654321', 124, 3, '2024-04-02'),
('987654323', '323456789', '987654321', 125, 3, '2024-04-03'),
('987654324', '423456789', '987654322', 126, 3, '2024-04-04'),
('987654325', '523456789', '987654322', 127, 3, '2024-04-05'),
('987654326', '623456789', '987654323', 128, 3, '2024-04-06'),
('987654327', '723456789', '987654323', 129, 3, '2024-04-07'),
('987654328', '823456789', '987654324', 130, 3, '2024-04-08'),
('987654329', '923456789', '987654324', 131, 3, '2024-04-09'),
('987654330', '123456789', '987654324', 132, 3, '2024-04-10');
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
INSERT INTO Traslado (cod_traslado, cod_vehiculo, cod_ruta, cod_transportista, cod_operacion_inicia, cod_operacion_termina)
VALUES 
  ('100000001', '111111111', '222222222', '333333333', '000000005', '000000006'),
  ('100000002', '444444444', '555555555', '666666666', '000000012', NULL);

```
