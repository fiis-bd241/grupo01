# Segunda práctica calificada - Informe

## 1. Modelo conceptual

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/686b13d6-0c06-4b49-8a5d-efe548bdecb0"></p>

[Diagrama Chen](https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B"pageId"%3A"R2lEEEUBdFMjLlhIrx00"%7D)

<a href='https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B"pageId"%3A"R2lEEEUBdFMjLlhIrx00"%7D' target="_blank">Abrir enlace en una nueva ventana</a>
## 2. Modelo lógico

![modelo-logico (1)](https://github.com/fiis-bd241/grupo01/assets/161625149/119543cd-1eae-4ffc-a8c6-bbda8890d068)

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
| tipo_elemento  | INT  | 9 | NO NULL | TAB  | - | Tipo de elemento según su relación con el proceso de producción. |
| segmento | INT  | 9 | NO NULL | TAB  | - | Es la segmentación del material y las materias primas |
| categoría | CHAR | X(32) | - | - | - | Es la forma de categorizar los productos | 
| descripcion | CHAR| X(256) | NO NULL | -  | - | Descripción del elemento en el catálogo. | 
| unidad  | CHAR  | X(32) | NO NULL | -  | - | Unidad de medida del elemento en el catálogo. | 
| temperatura_maxima | INT | 999 | - | Grados Celsius | - | Temperatura máxima permitida para la materia prima | 
| temperatura_mínima | INT | 999 | - | Grados Celsius | - | Temperatura mínima permitida para la materia prima |
| vida_util | INT | 999 | - | Días | - | Vida útil de la materia prima | 
| peso_unitario | CHAR | X(64) | - | - | - | Segmento al que pertenece el material en el catálogo|

TAB: Tipo de elemento
|Código|Semántica|
|------|---------|
|1|Materia prima|
|2|Material|
|3|Producto|

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
| tipo | CHAR | X(32) | Producto, Material, Materia Prima | - | - | Clasificación de elemento por su relación del proceso de producción| 

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
## 5. Poblamiento inicial de datos
