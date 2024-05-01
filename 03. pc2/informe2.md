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

Semántica: Representa los productos ofrecidos por San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN | 
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| id_elemento_catalogo | INT | 999999999 | NO NULL | --  | --  | Identificador del elemento en el catálogo. | 
| id_elemento_catalogo_tipo | INT  | 99 | NO NULL | TAB  | - | Es la forma de categorizar los elementos |
| nombre | CHAR | X(128) | NO NULL  | - | - | Nombre del elemento en el catálogo. |
| unidad  | INT  | 99 | NO NULL | TAB  | - | Unidad de medida del elemento en el catálogo. | 
| peso_unitario | FLOAT |  | NO NULL | - | - | Peso en gramos de una existencia del elemento. |
| temperatura_maxima | INT | 999 | - | Grados Celsius | - | Temperatura máxima permitida para la materia prima | 
| temperatura_minima | INT | 999 | - | Grados Celsius | - | Temperatura mínima permitida para la materia prima |
| vida_util | INT | 999 | - | Días | - | Vida útil de la materia prima | 
| descripcion | CHAR| X(256) | NO NULL | -  | - | Descripción del elemento en el catálogo. | 

TAB: Categoría de elemento
| Categoría                 | Tipo                   | Segmento    | Descripción           |
|---------------------------|------------------------|-------------|-----------------------|
| 11                        | 1                      | 3           | Especias y condimentos|
| 12                        | 1                      | 3           | Aditivos alimentarios|
| 13                        | 1                      | 3           | Aceites y grasas      |
| 14                        | 1                      | 3           | Harinas               |
| 15                        | 1                      | 3           | Huevos                |
| 16                        | 1                      | 3           | Conservantes          |
| 17                        | 1                      | 3           | Colorantes            |
| 18                        | 1                      | 3           | Emulsionantes         |
| 19                        | 1                      | 3           | Otras materias primas|
| 21                        | 2                      | 2           | Herramientas          |
| 22                        | 2                      | 2           | Repuestos             |
| 23                        | 2                      | 1           | Químicos              |
| 24                        | 2                      | 1           | Detergentes industriales|
| 25                        | 2                      | 3           | Etiquetas             |
| 26                        | 2                      | 2           | Otros materiales      |
| 31                        | 3                      | 4           | Pollo congelado       |
| 32                        | 3                      | 4           | Pollo fresco          |
| 33                        | 3                      | 4           | Saborizado            |

TAB: Tipo de elemento
Tipo de elemento en relación con el proceso de producción

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

TAB: Unidad
| Unidad     | Descripción  |
|------------|--------------|
| 1          | Kilogramo    |
| 2          | Gramo        |
| 3          | Litro        |
| 4          | Mililitro    |
| 5          | Metro        |
| 6          | Centímetro   |
| 7          | Unidad       |
| 8          | Docena       |
| 9          | Caja         |
| 10         | Bolsa        |
| 11         | Envase       |
| 12         | Bandeja      |
| 13         | Paquete      |
| 14         | Saco         |
| 15         | Barril       |
| 16         | Galón        |

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

**Entidad:** Mercancía  

 Semántica: Representar los diferentes productos que una empresa tiene en su inventario para la venta o distribución.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| id_mercancia | INT | 9999 | NO NULL | - | - | Identificador de la mercancía |  
| id_operacion_picking | INT | 9999 | NO NULL | - | - | Identificador de la operación picking asociada |  
| nro_precinto | CHAR | X(20) | 20 dígitos | - | - | Número de precinto asociado a la mercancía |  
| peso_total | FLOAT | 99999.99 | >=0 | - | - | Peso total de la mercancía, en gramos |    

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


**Entidad:** Operación  

Semántica: Entidad que representa las diferentes transacciones o movimientos de mercancía que se realizan dentro de la empresa San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| id_operacion | INT | 999999999 | NO NULL | - | - | Identificador único de la operación. |
| cod_operacion_picking | INT | 999999999 | - | - | - | Identificador único de la operación previa. |
| cod_empleado_ejecutor | INT | 999999999 | NO NULL | - | - | Identificador único del empleado que ejecuta la operación. |
| cod_empleado_supervisor | INT | 999999999 | NO NULL | - | - | Identificador único del empleado que supervisó la ejecución de la operación. |
| cod_tipo_operacion | INT | 9 | TAB | - | - | Indica el tipo de movimiento realizado en la operación. |  
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

**Entidad:** Stock  

Semántica: Se refiere a la representación de los productos físicos recibidos en el inventario de un determinado elemento en catálogo y lote.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| id_stock | INT | 999999999 | NO NULL | - | - | Código único de identificación del registro de stock |
| id_elemento_catalogo | INT | 999999999 | NO NULL | - | - |  Identificador del elemento en catálogo que describe las características generales del stock |
| nro_lote | INT | 999 | >=0 | - | - | Número de lote asociado al stock |
| cantidad | INT | 999999999 | >0 | - | - |  Cantidad de existencias recibidas de un determinado elemento en catálogo y lote |
| fecha_caducidad | DATE | AAAAMMDD | - | - | - | Fecha en que el producto pierde su valor o propiedades |

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


**Entidad:** Traslado  

Semántica: Entidad que representa los movimientos de mercancía realizados tanto dentro de la empresa San Fernando.  

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| id_traslado | INT | 9999999999 | NO NULL | - | - | Identificador único del traslado realizado. |
| cod_vehiculo | INT | 9999999999 | NO NULL | - | - | Identificador único del vehículo asignado para el traslado. |
| cod_ruta | INT | 9999999999 | NO NULL | - | - | Identificador único de la ruta asignada para el traslado. |
| cod_transportista | INT | 9999999999 | NO NULL | - | - | Identificador único del transportista asignado para el traslado. |
| id_operacion_inicia | INT | 9999999999 | NO NULL | - | - | Identificador único de la operación tipo ¨Salida¨ mediante la cual se inicia el traslado. |
| id_operacion_termina | INT | 9999999999 | - | - | - | Identificador único de la operación tipo ¨Recepción¨ mediante la cual se finaliza el traslado. |
| cod_guia_remision | CHAR | X(21) | 21 caracteres | - | - | Identificador único de la guía de remisión asociada al evento del traslado. |

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
DROP TABLE IF EXISTS paradero;
DROP TABLE IF EXISTS "local";
DROP TABLE IF EXISTS gps;
DROP TABLE IF EXISTS representante;
DROP TABLE IF EXISTS mercancia;
DROP TABLE IF EXISTS operacion;
DROP TABLE IF EXISTS transportista;
DROP TABLE IF EXISTS empleado;
DROP TABLE IF EXISTS ruta;
DROP TABLE IF EXISTS elemento_catalogo;
DROP TABLE IF EXISTS vehiculo;
DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS ubicacion;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS persona;
DROP TABLE IF EXISTS reporte_estado;
DROP TABLE IF EXISTS reporte_formato;
DROP TABLE IF EXISTS archivo_tipo;
DROP TABLE IF EXISTS evidencia_tipo;
DROP TABLE IF EXISTS nivel_urgencia;
DROP TABLE IF EXISTS estado_reclamo;
DROP TABLE IF EXISTS reclamo_tipo;
DROP TABLE IF EXISTS accion_tipo;
DROP TABLE IF EXISTS norma_tipo;
DROP TABLE IF EXISTS procedimiento_tipo;
DROP TABLE IF EXISTS incidencia_tipo;
DROP TABLE IF EXISTS pedido_estado;
DROP TABLE IF EXISTS pedido_tipo;
DROP TABLE IF EXISTS paradero_tipo;
DROP TABLE IF EXISTS local_distrito;
DROP TABLE IF EXISTS local_region;
DROP TABLE IF EXISTS local_tipo;
DROP TABLE IF EXISTS operacion_tipo;
DROP TABLE IF EXISTS licencia_tipo;
DROP TABLE IF EXISTS transportista_estado;
DROP TABLE IF EXISTS empleado_cargo;
DROP TABLE IF EXISTS ruta_tipo;
DROP TABLE IF EXISTS elemento_catalogo_unidad;
DROP TABLE IF EXISTS elemento_catalogo_tipo;
DROP TABLE IF EXISTS segmento;
DROP TABLE IF EXISTS elemento_produccion;
DROP TABLE IF EXISTS vehiculo_modelo;
DROP TABLE IF EXISTS vehiculo_estado;
DROP TABLE IF EXISTS cliente_tipo;
DROP TABLE IF EXISTS cliente_estado;
DROP TABLE IF EXISTS genero;
DROP TABLE IF EXISTS nacionalidad;
DROP TABLE IF EXISTS estado_civil;

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

CREATE TABLE IF NOT EXISTS elemento_produccion (
 id_elemento_produccion INT NOT NULL PRIMARY KEY,
 descripcion VARCHAR(15) NOT NULL
);

CREATE TABLE IF NOT EXISTS segmento (
 id_segmento INT NOT NULL PRIMARY KEY,
 descripcion VARCHAR(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS elemento_catalogo_tipo (
 id_elemento_catalogo_tipo INT NOT NULL PRIMARY KEY,
 id_elemento_produccion INT NOT NULL,
 id_segmento INT NOT NULL,
 descripcion VARCHAR(30) NOT NULL,
 FOREIGN KEY (id_elemento_produccion) REFERENCES elemento_produccion (id_elemento_produccion),
 FOREIGN KEY (id_segmento) REFERENCES segmento (id_segmento)
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
 cantidad INT NOT NULL CHECK (cantidad > 0),
 PRIMARY KEY (id_stock),
 CONSTRAINT id_elemento_catalogo
 FOREIGN KEY (id_elemento_catalogo)
 REFERENCES elemento_catalogo (id_elemento_catalogo)
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

/* LLENAR TABLAS */

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

INSERT INTO reporte_formato (cod_reporte_formato,descripcion) VALUES
  ( 1,  'DOCX'),
  ( 2,  'PDF'), 
  ( 3,  'XLSX'),
  ( 4,  'CSV');
  
INSERT INTO reporte_estado (cod_reporte_estado,descripcion) VALUES
  ( 1,  'Activo'),
  ( 2,  'Inactivo');  
  
INSERT INTO persona(cod_persona, cod_estado_civil, cod_nacionalidad, cod_genero, dni, primer_apellido, segundo_apellido, prenombre, direccion ) VALUES 
  ( 1, 1,  1,  1,  '77688137',   'López',       'García',     'Juan',      'AV BENAVIDES 1015 MIRAFLORES, Lima'),
  ( 2, 1,  1,  1,  '52359123',   'Mendoza',     'Mendoza',    'Luis',      'Av. Alameda Del Corregidor 3023, Lima'),
  ( 3, 1,  1,  1,  '76464764',   'Rodríguez',   'Valdés',     'Pedro',     'Avenida Heroes Del Cenepa, Lt. 120, Lima'),
  ( 4, 2,  1,  2,  '46729764',   'Martínez',    'Perez',      'Ana',       '2450, Of. 602, Edificio El Dorado, Lima, Trujillo'),
  ( 5, 1,  1,  1,  '79641337',   'Hernández',   'Flores',     'Luis',      'Avenida Los Alamos 345, Chiclayo'),
  ( 6, 3,  1,  2,  '45424873',   'González',    'Martinez',   'Laura',     'Santa Iluminata, Mz. A Lt. 6, Lima'),
  ( 7, 1,  1,  1,  '73283354',   'Ramírez',     'Ramírez',    'Carlos',    'AV DOLORES 119, JOSE LUIS BUSTAMANTE Y RIVERO, Lima'),
  ( 8, 3,  1,  2,  '43783734',   'Vargas',      'Guerrero',   'Diana',     'Avenida Los Cerezos 234, Iquitos'),
  ( 9, 2,  1,  1,  '45373782',   'Paredes',     'Osvaldo',    'Roberto',   'Calle Las Palmeras 567, Tacna'),
  (10, 1,  1,  2,  '43787671',   'Torres',      'Lopez',      'Sandra',    'Avenida Los Pinos 890, Puno'),
  (11, 2,  1,  1,  '78978464',   'Pérez',       'Alvarez',    'Juan',      'Calle Víctor Reynel, 766, Lima'),
  (12, 3,  1,  2,  '75696723',   'García',      'Ruiz',       'Ana',       'Cl 2 Lt 17, Bellavista, Callao'),
  (13, 5,  1,  1,  '45396782',   'Rodríguez',   'Jiménez',    'Pedro',     'Cl De La Colina, Narciso Nro 911, Lima'),
  (14, 2,  1,  2,  '16786781',   'Fernández',   'Hernández',  'Laura',     'Avenida Trinidad Morán, Mz. J Lt. 2 León Xvi, Arequipa'),
  (15, 1,  1,  1,  '16877361',   'Gómez',       'Quispe',     'Miguel',    'Gutiérrez De La Fuente,119,Iv Centenario, Arequipa'),
  (16, 2,  1,  2,  '16786455',   'Díaz',        'Navarro',    'Elena',     'LT 25, URB MANUEL AREVALO ETAPA III, LA ESPERANZA, La Libertad'),
  (17, 1,  1,  1,  '74524324',   'Sánchez',     'Pérez',      'David',     'AV 13 DE NOVIEMBRE 994 OF 202, EL TAMBO, Junin'),
  (18, 4,  1,  2,  '43787353',   'Martín',      'Velázquez',  'Sara',      'Jirón Moquegua, 140, Huanuco'),
  (19, 1,  1,  1,  '65775732',   'Ruiz',        'Ruíz',       'Javier',    'Calle Santa Catalina, 384, Cuzco'),
  (20, 2,  1,  2,  '86876711',   'Gutiérrez',   'Arroyo',     'Paula',     'AV NICOLAS DE PIEROLA 1518, LA ESPERANZA, La Libertad'),
  (21, 3,  1,  1,  '14242781',   'López',       'Cruzado',    'Daniel',    'Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa'),
  (22, 2,  1,  2,  '42343272',   'Hernández',   'Flores',     'Lucía',     'CA SANTA MARTA 302 INT 25, AREQUIPA, Arequipa'),
  (23, 1,  1,  1,  '78943713',   'Pérez',       'Espinoza',   'Alejandro', 'Av Joaquín Madrid Nro 141, Lima'),
  (24, 1,  1,  1,  '78567231',   'Sánchez',     'Chávez',     'David',     'Jirón Sinchi Roca, 310, 376, La Libertad'),
  (25, 2,  1,  2,  '20220002',   'Martín',      'Cruz',       'Sara',      'Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa');
 
INSERT INTO cliente (cod_cliente, cod_cliente_tipo, cod_cliente_estado, nombre , ruc , razon_social, fecha_registro) VALUES 
  ( 1, 'I', 'A',   'Almacen', '20100154308','SAN FERNANDO S.A.', '2002-06-01'), 
  ( 2, 'I', 'A' ,'Atencion al cliente' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'), 
  ( 3, 'I', 'A' ,'Produccion' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'), 
  ( 4, 'I', 'A' ,'Mantenimiento' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'), 
  ( 5, 'E', 'A' ,'PLAZA VEA' , '20100070970', 'SOCIEDAD ANONIMA O S.P.S.A.', '2023-05-15'), 
  ( 6, 'E', 'A' ,'Tottus Hipermercado-Tottus' , '20508565934', 'HIPERMERCADOS TOTTUS S.A', '2022-11-28'), 
  ( 7, 'E', 'A' ,'Wong & Metro' , '20109072177', 'Cencosud Retail Peru S.A.', '2023-07-03'), 
  ( 8, 'E', 'A' ,'Kentucky Fried Chicken' , '20100123330', 'DELOSI S.A.', '2022-10-12'), 
  ( 9, 'E', 'A' ,'Pardos Chicken-Planet-Pasquale' , '20510885229', 'SANGUCHES DEL PERU S.A.C', '2024-01-25'), 
  (10, 'E', 'A' ,'Rockys' , '20513427710', 'Grupo Rokys S.A.C.', '2023-03-08'); 
  
INSERT INTO ubicacion (cod_ubicacion, longitud, latitud) VALUES
  (1, -11.556595, -77.203523),
  (2, -11.501818, -77.226304),
  (3, -11.872139, -77.127159),
  (4, -11.866499, -77.073656),
  (5, -11.518728, -77.205331),
  (6, -11.547767, -77.203855),
  (7, -11.593654, -77.201504),
  (8, -11.728288, -77.165746),
  (9, -11.834073, -77.112874),
  (10, -11.928733, -77.072607),
  (11, -12.007750, -77.056319),
  (12, -11.993166, -77.063375),
  (13, -12.059688, -77.041633),
  (14, -12.089659, -77.023307),
  (15, -12.028432, -77.084411),
  (16, -12.058004, -77.037207),
  (17, -12.051560, -77.031446),
  (18, -12.173548, -76.990706),
  (19, -12.004222, -77.093759),
  (20, -12.034577, -77.047632),
  (21, -12.072477, -77.065383),
  (22, -12.072888, -77.008987),
  (23, -12.049493, -77.112024),
  (24, -12.006146, -77.001076),
  (25, -12.180751, -77.002283),
  (26, -12.169918, -77.023956),
  (27, -11.933034, -77.054910),
  (28, -12.086610, -77.033145);
  
INSERT INTO ticket (cod_ticket, fecha_entrega) VALUES
  ( 1, '2019-04-27'), 
  ( 2, '2021-04-22'), 
  ( 3, '2022-01-20'), 
  ( 4, '2022-01-22'), 
  ( 5, '2022-05-22'), 
  ( 6, '2022-11-18'), 
  ( 7, '2023-01-20'), 
  ( 8, '2023-01-22'), 
  ( 9, '2023-03-20'), 
  (10, '2023-04-20'), 
  (11, '2023-05-20'), 
  (12,'2023-05-22'), 
  (13,'2023-06-20'), 
  (14,'2023-09-16'), 
  (15,'2023-11-22'), 
  (16,'2023-12-19'), 
  (17,'2024-01-22'), 
  (18,'2024-02-22'), 
  (19,'2024-04-20'), 
  (20,'2024-04-22'); 
  
INSERT INTO vehiculo (cod_vehiculo, cod_vehiculo_estado,cod_vehiculo_modelo,anio_fabricacion, capacidad_carga, fecha_ultimo_mantenimiento,fecha_ultimo_viaje, placa) VALUES
  ( 1, 'D', 'F', 2008, 850, '2022-01-10', '2024-01-24', 'A4E-123'),
  ( 2, 'N', 'C', 2009, 620.5, '2023-02-12', '2024-02-24', 'D3F-756'),
  ( 3, 'C', 'S', 2020, 440.2, '2022-03-05', '2024-03-15', 'G5I-789'), 
  ( 4, 'D', 'S', 2015, 550, '2021-04-08', '2024-04-14', 'J4L-223'),
  ( 5, 'N', 'F', 2012, 650, '2023-05-15', '2024-05-27', 'M9O-456'),
  ( 6, 'C', 'C', 2021, 600, '2023-06-02', '2024-06-24', 'P3R-789'),
  ( 7, 'C', 'S', 2006, 620.4, '2021-07-18', '2024-07-24', 'S5U-123'),
  ( 8, 'D', 'F', 2017, 620.2, '2022-08-10', '2024-08-24', 'V4X-456'),
  ( 9, 'N', 'F', 2020, 220, '2023-09-05','2024-09-05', 'Y7A-789'),
  (10, 'C', 'C', 2018, 430, '2022-10-15', '2024-10-22', 'B8D-413');
  
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

INSERT INTO ruta (cod_ruta, distancia_total, cod_ruta_tipo, duracion) VALUES  
  (1, 70.9, 1, 2.4),
  (2, 23.5, 1, 0.8),
  (3, 12.3, 1, 0.4),
  (4, 70.9, 1, 2.4),
  (5, 5.6, 1, 0.2),
  (6, 11.2, 1, 0.4),
  (7, 23, 1, 0.8),
  (8, 16.4, 1, 0.5),
  (9, 7.3, 1, 0.2),
  (10, 34.8, 1, 1.2);
  
INSERT INTO empleado( cod_empleado, cod_cliente, cod_persona, cod_empleado_cargo, fecha_contrato ) VALUES 
  ( 1, 1, 11, 1, '2021-04-09'),
  ( 2, 1, 12, 1, '2021-06-17'),
  ( 3, 1, 13, 2, '2022-03-20'),
  ( 4, 1, 14, 3, '2021-01-20'),
  ( 5, 1, 15, 4, '2022-01-07'),
  ( 6, 1, 16, 5, '2021-08-09'),  
  ( 7, 1, 17, 6, '2021-11-06'),  
  ( 8, 1, 18, 6, '2021-07-09'),
  ( 9, 3, 19, 7, '2021-01-09'),
  ( 10, 4, 20, 8, '2021-02-09'),
  ( 11, 4, 21, 3, '2021-05-18'),
  ( 12, 1, 22, 5, '2021-05-18'),
  ( 13, 1, 23, 5, '2021-05-18');

INSERT INTO transportista (cod_transportista,cod_empleado,cod_estado_transportista,cod_tipo_licencia, num_licencia, fecha_vencimiento_licencia,fecha_ultimo_traslado) VALUES
  ( 1, 6,  'D', 'X','E567890', '2027-01-23', '2024-04-15'),
  ( 2, 12, 'N', 'Y','R487236','2025-01-08', '2024-04-24');
  
INSERT INTO representante (cod_representante,num_telefono,correo_empresarial,cargo,cod_cliente,cod_persona) VALUES
  ( 1, '(+51) 943 567 890',              'juan.lopez@sanfernando.com',                 'Gerente de Almacén',  1,  1),
  ( 2, '(+51) 976 345 678',            'diana.vargas@sanfernando.com', 'Supervisora de Atención al Cliente',  2,  2),
  ( 3, '(+51) 983 912 345',         'roberto.paredes@sanfernando.com',              'Gerente de Producción',  3,  3),
  ( 4, '(+51) 944 567 891',           'sandra.torres@sanfernando.com',       'Supervisora de Mantenimiento',  4,  4),
  ( 5, '(+51) 981 234 567',  'luis.mendoza@supermercadosperuanos.com',               'Supervisor de Ventas',  5,  5),
  ( 6, '(+51) 957 890 123', 'pedro.rodriguez@hipermercadostottus.com',                 'Gerente de Compras',  6,  6),
  ( 7, '(+51) 992 456 789',     'ana.martinez@CencosudRetailPeru.com',           'Supervisora de Logística',  7,  7),
  ( 8, '(+51) 945 678 901',               'luis.hernandez@delosi.com',             'Gerente de Operaciones',  8,  8),
  ( 9, '(+51) 965 123 456',     'laura.gonzalez@sanguchesdelperu.com',             'Supervisora de Compras',  9,  9),
  (10, '(+51) 954 789 012',           'carlos.ramirez@gruporokys.com',               'Gerente de Logística', 10, 10);

-- Trigger para generar cod_stock
CREATE OR REPLACE FUNCTION generar_cod_stock()
RETURNS TRIGGER AS $$
DECLARE
    cod_stock CHAR(17);
BEGIN
    cod_stock := LPAD(NEW.id_stock::TEXT, 5, '0') || '-' || LPAD(NEW.id_elemento_catalogo::TEXT, 5, '0') || '-' || LPAD(NEW.nro_lote::TEXT, 5, '0');
    NEW.cod_stock := cod_stock;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_stock
BEFORE INSERT ON stock
FOR EACH ROW
EXECUTE FUNCTION generar_cod_stock();

INSERT INTO stock (id_elemento_catalogo, nro_lote, fecha_caducidad, cantidad) VALUES
  (1, 123, '2024-04-01', 1000),
  (2, 124, '2024-04-02', 2000),
  (3, 125, '2024-04-03', 5000),
  (4, 126, '2024-04-04', 3000),
  (5, 127, '2024-04-05', 4000),
  (6, 128, '2024-04-06', 6000),
  (7, 129, '2024-04-07', 7000),
  (8, 130, '2024-04-08', 8000),
  (9, 131, '2024-04-09', 9000),
  (1, 132, '2024-04-10', 2500),
  (11, 223, '2024-04-01', 1000),
  (11, 224, '2024-04-02', 2000),
  (12, 225, '2024-04-03', 1000),
  (12, 226, '2024-04-04', 1050),
  (13, 227, '2024-04-05', 1010),
  (14, 228, '2024-04-06', 1000),
  (15, 229, '2024-04-07', 8000),
  (16, 230, '2024-04-08', 7000),
  (17, 231, '2024-04-09', 3000),
  (10, 232, '2024-04-10', 4000),
  (9, 233, '2024-04-11', 1500),
  (8, 234, '2024-04-12', 1700),
  (7, 235, '2024-04-13', 1600),  
  (7, 236, '2024-04-14', 1200),  
  (7, 237, '2024-04-15', 1030);  

-- Trigger para calcular el peso total de una mercancia
 
CREATE OR REPLACE FUNCTION calcular_peso_total()
RETURNS TRIGGER AS $$
DECLARE
    peso_mercancia NUMERIC;
BEGIN
    SELECT SUM(ec.peso_unitario * NEW.cantidad)
    INTO peso_mercancia
    FROM stock s
    INNER JOIN elemento_catalogo ec ON s.id_elemento_catalogo = ec.id_elemento_catalogo
    WHERE s.id_stock = NEW.id_stock;
 
    UPDATE mercancia
    SET peso_total = peso_mercancia
    WHERE id_mercancia = NEW.id_mercancia;
 
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;
 
CREATE TRIGGER calcular_peso_total_trigger
AFTER INSERT ON detalle_mercancia_stock
FOR EACH ROW
EXECUTE FUNCTION calcular_peso_total();
 
-- Trigger para generar el código de precinto de una mercancia
 
CREATE OR REPLACE FUNCTION generar_codigo_precinto()
RETURNS TRIGGER AS $$
DECLARE
    id_picking INT;
    fecha_op DATE;
    hora_ini TIME;
    codigo_precinto CHAR(20);
BEGIN
    -- Obtener el id_operacion_picking de la fila recién insertada
    SELECT id_operacion_picking
    INTO id_picking
    FROM operacion
    WHERE id_operacion = NEW.id_operacion AND cod_tipo_operacion = 2;
 
    -- Consultar la fila correspondiente en la tabla operacion utilizando id_operacion_picking
    SELECT id_operacion, fecha, hora_inicio
    INTO id_picking, fecha_op, hora_ini
    FROM operacion
    WHERE id_operacion = id_picking;
 
    -- Generar el código de longitud fija basado en el id, fecha_inicio y hora_inicio
    codigo_precinto := LPAD(NEW.id_operacion::TEXT, 5, '0') ||
                       TO_CHAR(NEW.fecha, 'YYYYMMDD') ||
                       TO_CHAR(NEW.hora_inicio, 'HHMMSS');
    codigo_precinto := LEFT(codigo_precinto, 20);
 
    -- Actualizar el atributo nro_precinto en la fila correspondiente de la tabla mercancia
    UPDATE mercancia
    SET nro_precinto = codigo_precinto
    WHERE id_operacion_picking = id_picking;
 
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;
 
CREATE TRIGGER generar_codigo_precinto_trigger
AFTER INSERT ON operacion
FOR EACH ROW
WHEN (NEW.cod_tipo_operacion = 2)
EXECUTE FUNCTION generar_codigo_precinto();
 
-- Trigger para generar el código de remision
 
CREATE OR REPLACE FUNCTION generar_cod_guia_remision()
RETURNS TRIGGER AS $$
DECLARE
    cod_guia_remision CHAR(21);
BEGIN
    SELECT CONCAT(
        LPAD(NEW.id_traslado::TEXT, 5, '0'),
        TO_CHAR(o.fecha, 'YYYYMMDD'),
        TO_CHAR(o.hora_inicio, 'HH24MI'),
        TO_CHAR(o.hora_fin, 'HH24MI')
    ) INTO cod_guia_remision
    FROM operacion o
    WHERE o.id_operacion = NEW.id_operacion_inicia;
 
    NEW.cod_guia_remision := cod_guia_remision;
 
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;
 
CREATE TRIGGER trigger_generar_cod_guia_remision
BEFORE INSERT ON traslado
FOR EACH ROW
EXECUTE FUNCTION generar_cod_guia_remision();
 
-- Poblamiento de datos para la entidad operacion y mercancia
 
DO $$
DECLARE
    variable_id_picking INT;
    variable_id_mercancia INT;
    variable_cod_salida INT;
    variable_cod_recepcion INT;
    variable_cod_remision CHAR(21);
BEGIN

    /* Empezamos un traslado */
 
    -- Ingresamos una operación de picking
    INSERT INTO operacion (cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (1, 4, 1, '2024-04-01', '08:00:00', '08:30:00') RETURNING id_operacion INTO variable_id_picking;
    
    -- Ingresamos las mercancias creadas en el proceso de picking
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia; -- Ingresamos una mercancia
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 1, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 2, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 3, 15);
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia; -- Ingresamos otra mercancia
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 4, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 5, 5);
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia; -- Ingresamos otra mercancia
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 6, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 7, 5);
 
    -- Continuamos con las fases posteriores al picking
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 1, 4, 2, '2024-04-01', '08:45:00', '09:15:00'), -- Precintado
    (variable_id_picking, 1, 4, 3, '2024-04-01', '09:30:00', '10:30:00'), -- Paletizado
    (variable_id_picking, 1, 4, 4, '2024-04-01', '10:45:00', '11:15:00'); -- Carga
 
    -- Salida
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 1, 4, 5, '2024-04-01', '11:30:00', '12:00:00') RETURNING id_operacion INTO variable_cod_salida;
    INSERT INTO traslado (cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia) VALUES
    (2, 2, 2, variable_cod_salida) RETURNING cod_guia_remision INTO variable_cod_remision;
  
    -- Recepción
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 1, 4, 6, '2024-04-01', '14:00:00', '14:30:00') RETURNING id_operacion INTO variable_cod_recepcion;
    UPDATE traslado SET id_operacion_termina = variable_cod_recepcion WHERE cod_guia_remision = variable_cod_remision;
 
    /* Empezamos otro traslado */
 
    -- Se realiza el picking
    INSERT INTO operacion (cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (13, 4, 1, '2024-04-02', '08:00:00', '08:35:00') RETURNING id_operacion INTO variable_id_picking;
 
    -- Ingresamos las mercancias creadas en el proceso de picking
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia;
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 8, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 9, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 10, 15);
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia;
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 11, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 12, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 13, 15);
 
    -- Continuamos con las fases posteriores al picking
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 13, 4, 2, '2024-04-02', '08:45:00', '09:15:00'), -- Precintado
    (variable_id_picking, 13, 4, 3, '2024-04-02', '09:30:00', '10:30:00'), -- Paletizado
    (variable_id_picking, 13, 4, 4, '2024-04-02', '10:45:00', '11:15:00'); -- Carga
 
    -- Salida
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 13, 4, 5, '2024-04-02', '11:30:00', '12:00:00') RETURNING id_operacion INTO variable_cod_salida;
    INSERT INTO traslado (cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia) VALUES
    (3, 3, 2, variable_cod_salida) RETURNING cod_guia_remision INTO variable_cod_remision;
  
    -- Recepción
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 1, 4, 6, '2024-04-02', '17:00:00', '17:18:00') RETURNING id_operacion INTO variable_cod_recepcion;
    UPDATE traslado SET id_operacion_termina = variable_cod_recepcion WHERE cod_guia_remision = variable_cod_remision;
 
    /* Empezamos otro traslado */
 
    -- Se realiza el picking
    INSERT INTO operacion (cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (13, 4, 1, '2024-04-02', '09:15:00', '09:30:00') RETURNING id_operacion INTO variable_id_picking;
 
    -- Ingresamos las mercancias creadas en el proceso de picking
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia;
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 14, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 15, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 16, 15);
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia;
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 17, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 18, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 19, 15);
 
    -- Continuamos con las fases posteriores al picking
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 12, 4, 2, '2024-04-02', '09:42:00', '10:10:00'), -- Precintado
    (variable_id_picking, 12, 4, 3, '2024-04-02', '10:20:00', '11:10:00'), -- Paletizado
    (variable_id_picking, 12, 4, 4, '2024-04-02', '12:15:00', '12:05:00'); -- Carga
 
    -- Salida
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 12, 4, 5, '2024-04-02', '12:20:00', '12:56:00') RETURNING id_operacion INTO variable_cod_salida;
    INSERT INTO traslado (cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia) VALUES
    (3, 3, 1, variable_cod_salida) RETURNING cod_guia_remision INTO variable_cod_remision;
  
    -- Recepción
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 1, 4, 6, '2024-04-02', '18:20:00', '18:56:00') RETURNING id_operacion INTO variable_cod_recepcion;
    UPDATE traslado SET id_operacion_termina = variable_cod_recepcion WHERE cod_guia_remision = variable_cod_remision;
 
    /* Empezamos otro traslado */
 
    -- Se realiza el picking
    INSERT INTO operacion (cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (13, 4, 1, '2024-04-02', '10:00:00', '10:35:00') RETURNING id_operacion INTO variable_id_picking;
 
    -- Ingresamos las mercancias creadas en el proceso de picking
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia;
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 20, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 21, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 22, 15);
    INSERT INTO mercancia (id_operacion_picking) VALUES (variable_id_picking) RETURNING id_mercancia INTO variable_id_mercancia;
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 23, 10);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 24, 5);
    INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (variable_id_mercancia, 25, 15);
 
    -- Continuamos con las fases posteriores al picking
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 13, 4, 2, '2024-04-02', '10:45:00', '10:15:00'), -- Precintado
    (variable_id_picking, 13, 4, 3, '2024-04-02', '10:30:00', '11:30:00'), -- Paletizado
    (variable_id_picking, 13, 4, 4, '2024-04-02', '11:45:00', '12:15:00'); -- Carga
 
    -- Salida
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 13, 4, 5, '2024-04-02', '12:30:00', '13:00:00') RETURNING id_operacion INTO variable_cod_salida;
    INSERT INTO traslado (cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia) VALUES
    (3, 3, 2, variable_cod_salida) RETURNING cod_guia_remision INTO variable_cod_remision;
  
    -- Recepción
    INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin) VALUES
    (variable_id_picking, 1, 4, 6, '2024-04-02', '18:20:00', '18:56:00') RETURNING id_operacion INTO variable_cod_recepcion;
    UPDATE traslado SET id_operacion_termina = variable_cod_recepcion WHERE cod_guia_remision = variable_cod_remision;
END $$;
 
 
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

INSERT INTO gps (cod_gps, cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) VALUES  
  (1, 1, 4, '2024-04-20', '04:53:21'),
  (2, 15, 4, '2024-04-20', '09:10:53'),
  (3, 17, 4, '2024-04-20', '11:33:14'),
  (4, 18, 4, '2024-04-20', '13:45:11'),
  (5, 1, 7, '2024-04-22', '05:13:55'),
  (6, 5, 7, '2024-04-22', '07:34:25'),
  (7, 4, 7, '2024-04-22', '10:45:30'),
  (8, 8, 7, '2024-04-22', '11:20:10'),
  (9, 12, 7, '2024-04-22', '11:54:31'),
  (10, 10, 7, '2024-04-22', '12:29:30'),
  (11, 13, 7, '2024-04-22', '13:04:10'),
  (12, 14, 7, '2024-04-22', '13:38:50');

INSERT INTO local (cod_local, cod_cliente, cod_ubicacion, pais, cod_local_region, cod_local_distrito, calle, numero, cod_local_tipo) VALUES  
  (1, 1, 1, 'PER', 15, 44, 'Panamericana Norte', NULL, 1),
  (2, 8, 2, 'PER', 15, 44, 'Av. El Solar', NULL, 2),
  (3, 8, 3, 'PER', 7, 45, 'Av. Néstor Gambetta', 7036, 2),
  (4, 8, 4, 'PER', 15, 25, 'Av. Puente Piedra', 266, 2),
  (5, 7, 10, 'PER', 15, 11, 'Av. Tomás Valle', 1400, 2),
  (6, 6, 12, 'PER', 15, 11, 'Av. Alfredo Mendiola', 3698, 2),
  (7, 2, 15, 'PER', 15, 15, 'Jr. Iquitos', 347, 3),
  (8, 10, 16, 'PER', 15, 15, 'Av. España', 1337, 2),
  (9, 2, 17, 'PER', 15, 15, 'Jr. Puno', 370, 4),
  (10, 3, 18, 'PER', 15, 7, 'C. Constelación Austral', 135, 1),
  (11, 2, 19, 'PER', 15, 35, 'Tomas Cochrane', NULL, 4),
  (12, 2, 20, 'PER', 15, 35, 'Jr. Mártir Olaya', 413, 4),
  (13, 2, 21, 'PER', 15, 24, 'Av. Simón Bolívar', 1149, 4),
  (14, 2, 22, 'PER', 15, 15, 'Jr. 3 de Febrero', 1234, 4),
  (15, 2, 23, 'PER', 7, 46, 'Av. Argentina', 3093, 3),
  (16, 2, 24, 'PER', 15, 32, 'Av. 13 de Enero', 1592, 4),
  (17, 3, 25, 'PER', 15, 7, 'Av. Los Faisanes', 179, 1),
  (18, 2, 26, 'PER', 15, 7, 'Jr. Justo Naveda', 136, 4),
  (19, 2, 27, 'PER', 15, 9, 'Av. Universitaria', 7718, 3),
  (20, 2, 28, 'PER', 15, 16, 'Av. Petit Thouars', 2260, 3);

INSERT INTO paradero (cod_paradero, cod_ruta, cod_local, cod_paradero_tipo, orden) VALUES  
  (1, 1, 1, 1, 1),
  (2, 1, 2, 2, 2),
  (3, 1, 4, 2, 3),
  (4, 1, 17, 3, 4),
  (5, 2, 1, 1, 1),
  (6, 2, 16, 3, 2),
  (7, 3, 1, 1, 1),
  (8, 3, 4, 2, 2),
  (9, 3, 5, 2, 3),
  (10, 3, 6, 2, 4),
  (11, 4, 17, 1, 1),
  (12, 4, 1, 3, 2);
  
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

INSERT INTO incidencia (id_traslado,cod_tipo_incidencia,descripcion,fecha_ocurrencia) VALUES
  ( 1, 'A', 'La fecha de entrega no coincide con la fecha establecida de llegada','2024-04-24'),
  ( 2, 'B', 'Hay paquetes que no están sellados correctamente', '2024-05-03'),
  ( 2, 'C', 'El transportista no se le dio la documentación correspondiente', '2024-05-05'),
  ( 1, 'D', 'El vehículo asignado no enciende', '2024-04-28'),
  ( 2, 'E', 'La direccion no coincide con el pedido del cliente', '2024-05-08'),
  ( 2, 'C', 'La documentación presenta datos erróneos', '2024-05-10'),
  ( 1, 'D', 'El vehiculo sufrió derrame de aceite ', '2024-04-30'),
  ( 2, 'E', 'La direccion asignada presenta demasiado tráfico', '2024-05-12'),
  ( 1, 'B', 'El sello del paquete está dañado', '2024-04-30'),
  ( 1, 'A', 'Ocurrió un accidente en la carretera que retrasó la entrega del pedido', '2024-05-02');
  
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
  
INSERT INTO norma (cod_norma, cod_incidencia, cod_norma_tipo, fecha_emision, fecha_vigencia) VALUES
  (1, 1, 'X', '2019-01-24', '2025-01-24'),
  (2, 2, 'Y', '2021-02-21', '2029-02-21'),
  (3, 3, 'Z', '2020-02-17', '2026-02-17'),
  (4, 4, 'W', '2017-03-28', '2027-03-28'),
  (5, 5, 'X', '2005-03-15', '2025-01-24'),
  (6, 6, 'Y', '2027-03-21', '2029-02-21'),
  (7, 7, 'W', '2018-02-17', '2026-02-17'),
  (8, 8, 'X', '2015-06-11', '2027-03-28'),
  (9, 9, 'Y', '2018-02-17', '2026-02-17'),
  (10, 10,'X', '2019-01-24', '2025-01-24');

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

```



