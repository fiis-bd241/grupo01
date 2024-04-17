# Primera práctica calificada - Informe

## Datos de la Empresa

Nombre de la empresa: San Fernando

Descripción de la empresa: San Fernando S.A. es una empresa peruana dedicada a la producción y comercialización de alimentos de consumo masivo de las líneas pollo, pavo, cerdo, huevo y productos procesados.

RUC: No. 20100154308

Razón Social: SAN FERNANDO S.A

Dirección: Avenida República de Panamá N° 4295, distrito de Surquillo, provincia y departamento de Lima (en adelante, “San Fernando”).

Telefono: 213-5300

Visión: Ser competitivos a nivel mundial, suministrando productos de valor agregado para la alimentación humana.

Misión: Contribuir al bienestar de la humanidad, suministrando alimentos de consumo masivo en el mercado global.

## Organigrama

![Sitemap](https://github.com/fiis-bd241/grupo01/assets/130238034/6b14a490-920e-4a05-9182-d5732f981497)

## Productos y Servicios

Principales productos:
  1. Pollo fresco, congelado y saborizado.
  2. Pavo congelado, horneado y macerado.
  3. Embutidos (chorizos, jamonadas, jamones, hot-dog, especiales).
  4. Congelados (apanado, nuggets).
  5. Cerdo congelado, fresco.
  6. Huevos

Principales servicios:
  1. Distribución y Logística: San Fernando provee servicios de distribución y logística para asegurar que sus productos lleguen frescos y a tiempo a los puntos de venta, incluyendo supermercados, tiendas minoristas, y restaurantes.

## Descripción del Proceso de Negocio

### 1. Roles del proceso de negocio

- Encargado de Almacén
- Supervisor
- Almacenero
- Asistente de Almacén
- Técnico de Almacén
- Gestor de Compras
- Técnico de logística
- Asistente Operativo
- Transportista
- Enargado de Planeación

### 2. Tabla de actividades

| Secuencia | Actividad                                          | Descripción         | Responsable           | Entrada                                | Salida                                 |
| --------- | -------------------------------------------------- | ------------------- | --------------------- | -------------------------------------- | -------------------------------------- |
| 1         |  Evaluacion de actividades                         | Se evalúa las necesidades de cada área interna para seguir con la operatividad de los procesos | Supervisor            | Lista de Actividades                                    | Informe de evaluación de necesidades   |
| 2         |  Elaboracion de requerimientos                     | Se crea una solicitud formal de las necesidades del área para la carga en el sistema SAP | Almacenero            | Informe de evaluación de necesidades   | Requerimientos elaborados              |
| 3         |  Cargar requerimientos al WMS                      | Subida de requerimientos mediante el programa SAP con el requerimiento MRP | Asistente de almacén | Requerimientos elaborados              | Requerimientos cargados en el sistema  |
| 4         |  Recepcion de solicitud de requerimientos          | El almacén se encarga de recibir y verificar las solicitudes del software SAP | Técnico de almacén   | Requerimientos cargados en el sistema  | Solicitudes de requerimientos verificadas |
| 5         |  Segmentación de requerimientos                    | Posteriormente, se hace segmentación de estos pedidos en 3 categorías: nocivos, suministros, insumos | Gestor de compras    | Solicitudes de requerimientos verificadas | Requerimientos segmentados             |
| 6         |  Requerimiento de Transporte                       | De acuerdo a la segmentación previa se solicita un transporte adecuado al área correspondiente | Técnico de logística | Requerimientos segmentados             | Solicitud de transporte enviada        |
| 7         |  Evaluación de requerimiento                       | Se evalúa si cada producto necesita medios de transporte específico | Asistente Operativo  | Solicitud de transporte enviada        | Evaluación de necesidades de transporte |
| 8         |  Asignacion de vehiculo y conductor                | El vehículo y conductor adecuados se asignan para el transporte del pedido | Transportista        | Evaluación de necesidades de transporte | Vehículo y conductor asignados         |
| 9         |  Elaboracion de guía de remision electronica       | Se documenta la información necesaria para el transporte y se envía a la planta solicitante | Encargado de Almacén | Vehículo y conductor asignados         | Guía de remisión electrónica generada  |
| 10        |  Picking, precintado y carga de productos          | Recogida, precintado y carga de los productos al transporte | Almacenero           | Guía de remisión electrónica generada  | Productos recogidos, precintados y cargados |
| 11        |  Verificación de recibimiento                      | Se verifica la conformidad de la entrega y se suben los elementos de comprobación al sistema | Transportista y Encargado de Almacén | Productos recogidos, precintados y cargados | Verificación de conformidad registrada |

| Secuencia | Actividad                                          | Descripción         | Responsable           | Entrada                                               | Salida                                                |
| --------- | -------------------------------------------------- | ------------------- | --------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| 1         | Requerimiento de compra                           | Detalles de cantidades, especificaciones y fechas de entrega para el pedido del cliente | Encargado de Planeación | Necesidades de pedido del cliente                      | Requerimiento de compra generado                        |
| 2         | Distribución de Requerimientos                     | Descarga y distribución de solicitudes de pedido basándose en especialización de plantas | Encargado de Almacén   | Requerimiento de compra generado                        | Requerimientos distribuidos                             |
| 3         | Requerimiento de Transporte                        | Solicitud del área de transporte para conductor, vehículo y logística | Encargado de Almacén   | Requerimientos distribuidos                             | Solicitud de transporte generada                        |
| 4         | Evaluación de requerimiento                       | Evaluación detallada de pedidos mixtos para selección de productos y vehículos | Asistente Operativo    | Solicitud de transporte generada                        | Evaluación de pedidos realizada                         |
| 5         | Asignación de vehículo y conductor                | Proceso de cuarentena para conductor y vehículo seleccionados | Transportista          | Evaluación de pedidos realizada                         | Vehículo y conductor asignados                          |
| 6         | Picking, precintado y carga de productos           | Creación de guías de remisión y facturas electrónicas, junto con precintado, picking y carga | Almacenero             | Vehículo y conductor asignados                          | Guías de remisión y facturas generadas, productos cargados |
| 7         | Verificación de entrega                            | Verificación de entrega a través de SAP y gestión de reclamos con clientes | Transportista y Encargado de Almacén | Guías de remisión y facturas generadas, productos cargados | Verificación de entrega registrada, reclamos gestionados |

### 3. Diagrama del proceso de negocio

a. Diagrama AS-IS

![Diagrama sin título drawio](../entregables%20parciales/entregable%203/imagenes/diagramas/proceso.png)

Proceso de negocio: Elaboración de despacho. Elaboración propia.

b. Diagrama TO-BE

(AGREGAR IMAGEN)

Proceso de negocio mejorado: Elaboración de despacho. Elaboración propia.

Link del diagrama: 

## Módulos del Sistema
El objetivo principal es encontrar una estructura optima de forma que su software pueda cumplir con sus requerimientos.

### Modulo #1: Pedidos

Responsabilidades: 

- Mostrar información detallada de cada pedido, incluyendo número de pedido, productos solicitados, cantidades, fecha de solicitud, cliente, dirección de entrega, y cualquier nota adicional relevante. 
- Registrar los pedidos que hace almacén a planta Huaral. 
- Registrar los pedidos de materia prima que hace planta Huaral a almacén, en base al stock disponible. 
- Mantener actualizado el estado de cada pedido, indicando si está pendiente, en proceso o completado. 
- Permitir la asignación eficiente de recursos necesarios para la entrega de los pedidos, como personal de manejo y entrega, y garantizar que cada pedido tenga los recursos adecuados asignados para su procesamiento. 
- Verificar la disponibilidad en tiempo real de los productos solicitados en el inventario del almacén general y mostrar la disponibilidad al usuario durante el proceso de pedido. 

Interacción con otros módulos: 

- Consulta con el módulo de almacén la cantidad de materia prima que se solicitará. 
- Actualiza en el módulo de almacén el stock de productos finales disponibles luego de registrar un pedido de almacén a planta Huaral. 
- Según la información del módulo de seguimiento se actualiza el estado del pedido como pendiente, en proceso o completado. 
- Registra la información necesaria para realizar un reporte de pedidos en el módulo de Reporte. 

### Modulo #2: Seguimiento

Responsabilidades:  

- Facilitar el desplazamiento entre información de los pedidos en proceso de traslado, los pedidos pendientes de traslado, los conductores y vehículos asignados a cada proceso de traslado
- Presentar información de ubicación satelital de un pedido en específico para proporcionar un seguimiento en tiempo real mientras el vehículo se encuentra realizando el proceso de traslado.
- Mostrar la ruta asignada a un determinado vehículo en su proceso de traslado, así como el conductor asignado, estatus de viaje, detalles del pedido, la hora de salida, hora estimada de llegada, punto de origen y destino.
- Almacenar, gestionar y mostrar datos importantes del transportista, como información de contacto, detalles del vehículo de transporte, licencias y certificaciones relevantes, para garantizar la seguridad y la trazabilidad del proceso de entrega.
- Enviar notificaciones y alertas automáticas a los usuarios pertinentes sobre eventos importantes relacionados con los pedidos, como cambios en el estado del pedido, retrasos en la entrega, o problemas con la disponibilidad de productos, para facilitar una respuesta rápida y eficiente.

Interacción con otros módulos: 

- Conexión con el módulo de pedidos para poder moverse de un módulo a otro dependiendo de si se quiere hacer seguimiento del pedido o se requiere detalles de este.
- Interacción con el módulo de reclamos en caso de alguna observación irregular en el seguimiento del pedido.
- Función de herramienta para el módulo de Control mostrando la información necesaria sobre el estado del pedido durante el proceso de traslado.

### Modulo #3: Almacén

Responsabilidades: 

- Gestionar el proceso de preparación de pedidos.
- Supervisar el proceso de embalaje y sellado de seguridad.
- Coordinar el paletizado de los productos.
- Encargarse del proceso de carga de los pedidos en los vehículos.
- Administrar la generación y registro de guías de remisión.
- Coordinar la recepción de los envíos en el lugar de destino.
- Gestionar el proceso de descarga de los envíos recibidos.

Interacción con otros módulos:

- Brinda la información necesaria al módulo de Control sobre un traslado de mercancía para el registro de una posible incidencia.
- Atiende los pedidos previamente generados por el módulo de Pedidos por medio de traslados de mercancía.
- Mediante el ingreso de información sobre la salida e ingreso de mercancías hace posible que el módulo de Seguimiento realice el seguimiento respectivo en cada ubicación.

### Modulo #4: Control

Responsabilidades: 

- Registrar la hora de salida de los pedidos de la planta hacia los clientes finales, así como actualizar en tiempo real el progreso de la entrega, incluyendo el lugar actual del transporte y las estimaciones de llegada. 
- Permitir el seguimiento de cada uno de los pasos requeridos para llevar un producto desde la planta Huaral hasta el cliente final pasando por los procesos de picking, precintado, cargado, transporte y verificación de llegada.
- Registrar los procesos de verificación necesarios durante el transporte de abastecimiento proveniente de almacén general hacia la planta Huaral, incluyendo los datos relevantes del transporte, información de llegada, verificación de paquetes y registro específico de los materiales entregados.
- Permitir la identificación y gestión proactiva de incidencias internas durante la entrega, como retrasos en el transporte, problemas con procesos(picking,precintado,paletizado,carga),cambios en la ruta planificada, o problemas imprevistos que puedan afectar la entrega puntual, y proporcionar comunicación transparente al cliente sobre cualquier cambio en el plan de entrega.

Interacción con otros módulos: 

- Vínculo directo al módulo de seguimiento del envío en determinado tiempo durante el proceso de control.
- Vínculo con el módulo de pedidos y el de reclamos para generar el registro de incidencias en caso lo verificado no coincida con la documentación.

### Modulo #5: Reportes 

Responsabilidades: 

- Generar y remitir un informe diario detallado de los productos disponibles en almacén interno listos para el proceso de distribución 
- Debe poder programar la generación automática de informes en intervalos regulares, con opciones para enviarlos por correo electrónico o almacenarlos en un lugar designado. 
- El módulo debe ofrecer una visualización interactiva de datos mediante gráficos y tablas dinámicas, capaz de explorar los datos con filtros y darle dinamismo a la forma en la que se generan los reportes. 
- El sistema debe permitir a los usuarios personalizar y generar informes según sus necesidades específicas, incluyendo la selección de métricas, variables y filtros relevantes.

Interacción con otros módulos: 

- Requiere conexión con todos los demás módulos para recopilar, procesar y generar información a partir de sus datos.
- Un botón en cada módulo puede generar resúmenes predefinidos de información diaria o la necesaria para tomar decisiones.

### Modulo #6: Reclamos

Responsabilidades: 

- Permitir a los usuarios registrar reclamos recibidos de clientes finales, incluyendo detalles como la naturaleza del reclamo, el número de pedido afectado, la fecha de recepción y cualquier información relevante adicional.
- Facilitar el seguimiento y la resolución efectiva de reclamos, asignando tareas a los equipos responsables de manejarlos, estableciendo plazos para su resolución y proporcionando una interfaz centralizada para la comunicación y colaboración entre los diferentes departamentos involucrados.
- Permitir la implementación de acciones correctivas para abordar los reclamos de manera oportuna y efectiva, lo que puede incluir el envío de un nuevo paquete para reemplazar un pedido dañado o perdido, o el cambio de la planta proveedora si se identifican problemas recurrentes con la calidad o la entrega.
- Mantener un registro detallado del historial de reclamos y proporcionar herramientas de análisis para identificar tendencias y patrones recurrentes, lo que permite a la empresa tomar medidas proactivas para mejorar la calidad del servicio y prevenir reclamos futuros.

Interacción con otros módulos: 

- Conexión con el módulo de seguimiento y control para registros de incidencias.
- Conexión con el módulo de pedidos para verificación de requerimientos y entregas. 

### Diagrama de paquetes

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/7537e725-235a-413d-9370-229e327a56fc"></p>

Link del diagrama: [https://drive.google.com/file/d/1nwVLNkUNbD_joILjk6pRH49kTC3cYcXy/view?usp=sharing](https://app.diagrams.net/?src=about#G1nwVLNkUNbD_joILjk6pRH49kTC3cYcXy#%7B%22pageId%22%3A%22c4acf3e9-155e-7222-9cf6-157b1a14988f%22%7D)
## Requerimientos

### 1. Requerimientos del módulo de Pedidos

1.1. Requerimientos funcionales

a. Usuarios
- Administrador: Puede realizar todas las operaciones del módulo de pedidos.
- Usuario (Almacenista de cada departamento) de Planta Huaral: Puede registrar los pedidos al almacén general.

b. Casos de uso

Caso de Uso #1: Registrar Pedido
| Código | R101 | 
|----------|----------|
|Objetivo | Permitir a los Representante de cada departamento a registrar un nuevo pedido.|
|Descripción | El almacenista ingresa la información del cliente, como nombre, correo electrónico empresarial y personal, fecha de solicitud, fecha de entrega, DNI, departamento y justificación. |
|Actor Primario | Representante de cada area. |
|Actor Secundario | N/A |
|Precondiciones | El representante debe estar registrado en el sistema SAP | 
|Paso | Acción | 
|1 | El representante selecciona la opción para registrar un nuevo pedido. |
|2 | El sistema muestra un formulario para que el representante ingrese los datos personales y datos del pedido. | 
|3 | El representante completa el formulario y selecciona la opción para agregar productos. |

Caso de Uso #2: Agregar productos al pedido. 
| Código | R102 | 
|----------|----------|
|Objetivo | Permitir al representante (usuario) agregar los productos solicitados al pedido.|
|Descripción | Después de ingresar la información del usuario (representante) en el formulario de registro de pedido, el usuario puede agregar los productos solicitados a través de una tabla. | 
|Actor Primario | representante departamental |
|Actor Secundario | N/A |
|Precondiciones | El usuario debe haber completado el formulario de registro de pedido. |
|Paso | Acción |
|1 | Después de ingresar los datos del usuario y pedido, el usuario selecciona la opción para agregar productos.|
|2 | El sistema muestra una tabla vacía para que el usuario ingrese los detalles de los productos solicitados, como código, nombre, descripción, cantidad, unidad de medida y precio unitario. |
|3 | El usuario ingresa la información de los productos. |
|4 | El usuario revisa la información de los productos ingresados y selecciona la opción para confirmar el pedido. |
|5 | El sistema asigna un número de pedido único al nuevo pedido. |
|6 | El sistema guarda la información del pedido, incluyendo los productos solicitados, y actualiza el estado a "pendiente". |

Caso de Uso #3: Ver detalle pedido. 
| Código | R103 | 
|----------|----------|
|Objetivo | | 	Permitir a los almacenistas de cada area (usuarios) consultar los detalles de un pedido específico. |
|Descripción | Despúes de completar todos los productos solicitados y el sistema muestra la información detallada, incluyendo los datos del usuario, los productos solicitados y sus detalles. |
|Actor Primario | representante de cada departamento. |
|Actor Secundario |N/A |
|Precondiciones | El usuario debio completar la tabla de los productos solicitados. |
|Paso | Acción |
|1 | Después de agregar los productos al pedido, el usuario selecciona la opción para ver el detalle del pedido. |
|2 | El sistema muestra la información detallada del pedido, incluyendo los datos del usario, los productos solicitados y sus detalles (código de producto, unidad de medida, descripción, precio unitario), la fecha de solicitud, la fecha de entrega, el estado del pedido, el tiempo transcurridos (días) del pedido y cualquier otra información relevante.
|3 | El usuario puede confirmar o cancelar el pedido. |

Caso de Uso #4: Ver lista de pedidos.
| Código | R104 | 
|----------|----------|
|Objetivo | | Permitir a los representante (usuarios) consultar la lista de todos los pedidos registrados.
|Descripción | El usuario puede filtrar y ordenar la lista de pedidos según diferentes criterios, como número de pedido, departamento, fecha de solicitud y estado del pedido. |
|Actor Primario | representante de cada departamento. |
|Actor Secundario | N/A |
|Precondiciones | El usuario debe estar registrado en el sistema SAP. |
|Paso | Acción |
|1 | El usuario selecciona la opción para ver la lista de pedidos. |
|2 | El sistema muestra la lista de todos los pedidos registrados, incluyendo el número de pedido, departamento, la fecha de solicitud, la fecha de entrega y el estado del pedido. |
|3 | El usuario puede filtrar y ordenar la lista de pedidos según diferentes criterios, como número de pedido, departamento, fecha de solicitud y estado del pedido. |
|4 | El sistema SAP actualiza la lista de pedidos según los filtros y ordenamiento aplicados por el usuario. |

1.2. Requerimientos de atributos de calidad.

1. Usabilidad:
- El sistema debe ser intuitivo y fácil de usar para los almacenistas de cada departamento, minimizando el esfuerzo y el tiempo requerido para registrar y gestionar los pedidos.
- El sistema debe proporcionar una interfaz de usuario clara y coherente, con un diseño responsivo y adaptable a diferentes dispositivos.

2. Fiabilidad:
- El sistema debe ser confiable y consistente en el registro y procesamiento de los pedidos, evitando errores o pérdida de información.
- El sistema debe tener un mecanismo de recuperación ante fallas, permitiendo a los usuarios continuar con sus tareas en caso de interrupciones.

3. Eficiencia:
- El sistema debe ser lo suficientemente rápido y receptivo al procesar las solicitudes de los usuarios, proporcionando una experiencia fluida y sin demoras.
- El sistema debe optimizar el uso de recursos (CPU, memoria, almacenamiento) para garantizar un rendimiento adecuado, especialmente en momentos de alta carga de trabajo.

4. Mantenibilidad:
- El sistema debe ser fácil de mantener y actualizar, con una arquitectura modular y bien documentada que facilite la incorporación de nuevas funcionalidades o la corrección de problemas.
- El sistema debe contar con herramientas y procesos de monitoreo y registro de eventos que permitan identificar y solucionar problemas de manera oportuna.

5. Seguridad:
- El sistema debe implementar mecanismos de autenticación y autorización robustos, restringiendo el acceso solo a los usuarios autorizados.
- El sistema debe garantizar la integridad y confidencialidad de la información de los pedidos, protegiendo los datos sensibles de los clientes y la empresa.

1.3. Requerimientos de restricciones.

1. Base de datos:
- El sistema de pedidos se implementará utilizando el sistema de gestión de base de datos PostgreSQL.

2. Tecnologías de backend:
- El backend del sistema se desarrollará utilizando el lenguaje de programación Java.
- Se empleará el framework Angular, Node y Express para el desarrollo del backend.

3. Tecnologías de frontend:
- El frontend del sistema se desarrollará utilizando HTML, CSS, JavaScript y Bootstrap.

### 2. Requerimientos del módulo de Seguimiento
#### 2.1. Requerimientos funcionales

a. Usuarios
- Administrador: Puede visualizar todas las pantallas y editar los detalles de traslado.
- Usuario planta Huaral (Pedido cliente interno): Visualización de pedido en progreso y acceso a detalles de traslado y guía de remisión.
- Usuario Almacén General (Pedido cliente interno): Permisos de administrador, acceso a los documentos y vínculos adjuntos y registro de incidencias.
- Usuario de planta Huaral (Pedido de cliente externo): Puede visualizar las pantallas y acceder a los documentos y vínculos adjuntos, registrar incidencias.
- Usuario Transportista: Actualizar el estatus del transporte, registrar incidencias y entregas solo de traslados realizados por ellos mismos.
b. Casos de uso

Caso de Uso #1: Verificar Pedido en Progreso
| Código | R201 | 
|----------|----------|
|Objetivo | Permitir al encargado de almacén revisar los detalles del proceso de traslado de un pedido. |
|Descripción | El encargado ingresa al módulo en la pantalla de Pedidos en progreso y con el número de pedido que le corresponde busca y accede a los detalles del pedido en cuestión. |
|Actor Primario | Encargado de almacén. |
|Actor Secundario | N/A |
|Precondiciones | El encargado debe estar registrado en el sistema SAP | 
|Paso | Acción | 
|1 | El encargado selecciona la pantalla de Pedidos en Progreso en la pantalla Menú. |
|2 | El sistema muestra una serie de pedidos cuyo estatus se encuentra clasificado como “en progreso” | 
|3 | El encargado busca visualmente o a través del buscador el código del pedido del cual desea consultar los detalles y da click sobre el icono de dicho pedido. |
|4 | El sistema muestra toda la información detallada del pedido en cuestión y el proceso de traslado en el que se está realizando. |
|Pasos opcionales | Acciones opcionales |
|5 | El encargado puede dar click en el botón de “Ver guía de Remisión” para acceder a una versión digital del documento que consigna los detalles del traslado. |

Caso de Uso #2: Registrar Incidencia de viaje
| Código | R202 | 
|----------|----------|
|Objetivo | Permitir al transportista reportar alguna incidencia no prevista durante el proceso de traslado. |
|Descripción | El transportista ante una situación no planeada accede al sistema de seguimiento y registra una incidencia respecto al traslado que realiza, informando a los involucrados de la situación. |
|Actor Primario | Transportista. |
|Actor Secundario | Encargado de almacén planta Huaral, Almacenero Almacén General |
|Precondiciones | El transportista debe haber accedido al sistema | 
|Paso | Acción | 
|1 | El transportista entra a la pantalla de Pedidos en progreso. |
|2 | El transportista ingresa los datos del Traslado que está llevando a cabo o el pedido con respecto al cual tuvo una incidencia. | 
|3 | Realiza click sobre el botón “Reportar incidencia que lo redirige al módulo de Control donde realizará el llenado del formato de incidencias. |
|4 | El sistema registra la incidencia y genera una notificación en los usuarios relacionados con los pedidos del traslado. |

Caso de Uso #3: Revisar los pedidos pendientes de un Traslado
| Código | R203 | 
|----------|----------|
|Objetivo | Permitir a los supervisores informarse si un pedido se encuentra aún en proceso de traslado o de si ya fue registrado como entregado |
|Descripción | El supervisor entra al sistema en la pantalla de Pedidos Pendientes, ingresa la información del Traslado que desea consultar y revisa los pedidos de ese traslado que aún faltan entregar. |
|Actor Primario | Supervisor |
|Actor Secundario | Encargado de almacén planta Huaral, Almacenero Almacén General |
|Precondiciones | El supervisor debe estar logeado y tener el código de pedido y de traslado | 
|Paso | Acción | 
|1 | El supervisor entra a la pantalla de Pedidos Pendientes. |
|2 | El supervisor ingresa los datos del Traslado que está lleva el pedido en cuestión. | 
|3 | El sistema muestra los pedidos por entregar de ese Traslado. |
|4 | El supervisor busca visualmente en la tabla o ingresa el código del pedido en la barra de búsqueda para encontrar el pedido del cual quiere realizar el seguimiento. |

Caso de Uso #4: Registrar la entrega de un pedido
| Código | R204 | 
|----------|----------|
|Objetivo | Permitir cambiar el estatus de los pedidos que están siendo transportados en el Traslado |
|Descripción | El transportista ingresa al sistema, busca el traslado que está realizando y cambia el estado de un pedido a entregado. |
|Actor Primario | Transportista |
|Actor Secundario | Encargado de almacén planta Huaral, Almacenero Almacén General |
|Precondiciones | El transportista debe estar logeado y tener el código de pedido y de traslado | 
|Paso | Acción | 
|1 | El Transportista entra a la pantalla de Pedidos en Progreso y escribe el código del traslado actual en la barra respectiva. |
|2 | El transportista da click en “Registrar entrega” y selecciona el pedido de dicho traslado que cambiará de estatus. | 
|3 | El sistema guarda los cambios y se ven reflejados en las otras pantallas. |

Caso de Uso #5: Contactar con el transportista
| Código | R205 | 
|----------|----------|
|Objetivo | Facilitar el proceso de busqueda de contacto con el transportista en caso de incidencias. |
|Descripción | EL supervisor ingresa al sistema, ubica su pedido, visualiza los detalles del proceso de transporte y obtiene la información necesaria para contactar con el transportista o iniciar el registro de una incidencia. |
|Actor Primario | Supervisor de almacen |
|Actor Secundario | Encargado de almacén planta Huaral |
|Precondiciones | El supervisor debe estar logueado y tener la información del pedido del cual necesita información. | 
|Paso | Acción | 
|1 | El supervisor entra a la pantalla de Pedidos en Progreso y escribe el código del pedido en la barra de busqueda respectiva. |
|2 | El supervisor da click en “Detalles de Traslado” y será redirigido a la pantalla Detalle de Traslado con el código del traslado respectivo automáticamente cargado. | 
|3 | El sistema muestra toda la información relacionada con el traslado, incluyendo la información de contacto del transportista, con la cual puede realizar el contacto respectivo. |

#### 2.2. Requerimientos de atributos de calidad
- Seguridad: Dado que el sistema manejará datos de ubicación e información sensible sobre las entregas, la seguridad es de suma importancia. Se debe procurar acceso solo a los trabajadores con las autorizaciones adecuadas para asignar lectura y escritura dependiendo del nivel de acceso.
- Confiabilidad: Es esencial asegurar que las ubicaciones y rutas de entrega registradas sean precisas y consistentes. Ya que los transportistas siguen estas rutas, se debe asegurar que son seguras y confiables para el transporte.
- Usabilidad: Dado que los trabajadores serán los principales usuarios del sistema, es importante que sea fácil de usar y comprender. La interfaz de usuario debe ser intuitiva y amigable, permitiendo a los usuarios acceder rápidamente a la información que necesitan y realizar las acciones requeridas sin dificultad. 
- Eficiencia: La eficiencia del sistema impactará directamente en la productividad y la efectividad de las operaciones de entrega. El sistema debe ser capaz de procesar y mostrar la información de ubicación de manera rápida y eficiente, minimizando los tiempos de espera y optimizando el uso de recursos.

#### 2.3. Requerimientos de restricciones
- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.

### 3. Requerimientos del módulo de Almacén

#### 3.1. Requerimientos funcionales

a. Usuarios
- Almacenero
- Tecnico de almacén
- Asistente Operativo
- Encargado de Almacén
- Supervisor de almacén

b. Casos de uso

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

#### 3.2. Requerimientos de atributos de calidad

Usabilidad:

- El sistema debe ser intuitivo y fácil de usar para los almaceneros de cada departamento, minimizando el esfuerzo y el tiempo requerido para registrar y gestionar los procesos de picking, precintado, paletizado, carga, descarga y envío.
- La interfaz de usuario debe ser clara y coherente, facilitando la navegación y la ejecución de tareas.
- Se debe proporcionar retroalimentación adecuada al usuario durante cada etapa del proceso, informando sobre el progreso y cualquier error que pueda ocurrir.

Fiabilidad:

- El sistema debe ser confiable y consistente en el registro y procesamiento de los procesos de almacén, evitando errores, duplicaciones o pérdida de información.
- Debe contar con mecanismos de validación de datos para garantizar la integridad de la información ingresada por los usuarios.

Eficiencia:

- Debe optimizar el uso de recursos del sistema, como CPU, memoria y almacenamiento, para garantizar un rendimiento óptimo sin comprometer la experiencia del usuario.
- Se deben minimizar los tiempos de espera y los cuellos de botella en el sistema, asegurando una respuesta rápida a las acciones del usuario.

Mantenibilidad:

- El sistema debe ser fácil de mantener y actualizar, con una arquitectura modular y bien documentada que facilite la incorporación de nuevas funcionalidades o la corrección de problemas.
- Debe seguir buenas prácticas de desarrollo de software, como el uso de estándares de codificación, comentarios descriptivos y control de versiones, para facilitar la colaboración entre desarrolladores y mantener un código limpio y legible.

Seguridad:

- El sistema debe implementar medidas robustas de autenticación y autorización, garantizando que solo los usuarios autorizados puedan acceder y realizar acciones en el sistema.


#### 3.3. Restricciones
- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.

### 4. Requerimientos del módulo de Control

#### 4.1. Requerimientos funcionales

a. Usuarios
- Encargado de almacén
- Asistente operativo
- Almacenero
- Transportista
- Técnico de almacén


b. Casos de uso

Caso de Uso #1: Verificar los procesos sobre pedido de abastecimiento 
| Código | R401 | 
|----------|----------|
|Objetivo | Registrar el correcto procedimiento de los pedidos de abastecimiento|
|Descripción | El usuario registra los datos del pedido solicitado por Planta Huaral, como fecha,id del usuario, insumo solicitado, guía de remisión, además de datos generales de cada proceso que atraviesa el pedido como estado, fecha, hora, id encargado, etc. Adicionalmente hay una opción de descarga de la guía de remisión. |
|Actor Primario | Técnico de almacén|
|Actor Secundario|Almacenero|
|Precondiciones|Pedido de abastecimiento registrado en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Usuario" y luego  le da a segunda opción "Abastecimiento"|
|2|Se registra la información del pedido, incluyendo la fecha, ID y el insumo solicitado, así como los detalles de cada etapa del proceso por el que pasa, como el picking, precintado, paletizado y carga. Estos detalles incluyen el estado, fecha, hora y el ID del encargado correspondiente.|
|3|Verifica los datos y confirma el registro|
|4|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #2: Verificar los procesos sobre pedido de venta 
| Código | R402 | 
|----------|----------|
|Objetivo | Registrar el correcto procedimiento de los pedidos de venta|
|Descripción | El usuario ingresa los datos del pedido solicitado por el cliente, incluyendo la fecha, ID del usuario, dirección y tipo de producto. Además, se registran los detalles de cada etapa del proceso del pedido, como su estado, fecha, hora y el ID del encargado correspondiente. También se ofrece la opción de descargar una factura electrónica, junto con la indicación de la fecha y hora de salida, así como la fecha y hora estimadas de llegada. |
|Actor Primario | Encargado de almacén|
|Actor Secundario|Almacenero|
|Precondiciones|Pedido de cliente registrado en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Usuario" y luego le da a segunda opcion "Venta"|
|2|Se registra la información del pedido, incluyendo la fecha, ID y el insumo solicitado, así como los detalles de cada etapa del proceso por el que pasa, como el picking, precintado, paletizado y carga. Estos detalles incluyen el estado, fecha, hora y el ID del encargado correspondiente.|
|3|Verifica los datos y confirma el registro|
|4|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #3:  Registro de disponibilidad de conductores
| Código | R403 | 
|----------|----------|
|Objetivo |Asignarle el traslado de un determinado pedido|
|Descripción | El usuario verifica en base a los datos del conductor como nombre completo, id conductor,fecha de contratación, número de licencia, fecha de vencimiento de licencia, fecha y hora de última actividad, para registrar su disponibilidad y poder asignarle un pedido. |
|Actor Primario | Transportista|
|Actor Secundario|N/A |
|Precondiciones|Registro de conductores en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Transporte" y luego le da a segunda opción "Conductor"|
|2|Verifica los atributos específicos del conductor como: nombre completo, id conductor,fecha de contratación, numero de licencia, fecha de vencimiento de licencia, fecha y hora de última actividad |
|3|Registra su disponibilidad|
|4|Verifica los datos y confirma el registro|
|5|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #4: Registro de disponibilidad de vehículos
| Código | R404 | 
|----------|----------|
|Objetivo |Asignar a un conductor como medio de traslado del pedido|
|Descripción | El usuario verifica en base a los datos del vehículo como número de placa, modelo,año de fabricación, capacidad de carga, fecha de último mantenimiento, fecha y hora de última de actividad, para registrar su disponibilidad y poder asignarle como medio de traslado de un pedido. |
|Actor Primario | Transportista|
|Actor Secundario|N/A |
|Precondiciones|Registro de vehículos en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Transporte" y le da a segunda opción "Vehículo"|
|2|Verifica los atributos específicos del vehículo como: número de placa, modelo,año de fabricación, capacidad de carga, fecha de último mantenimiento, fecha y hora de última de actividad |
|3|Registra su disponibilidad |
|4|Verifica los datos y confirma el registro|
|5|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #5: Registro de incidencias internas
| Código | R405 | 
|----------|----------|
|Objetivo |Gestionar a nivel general el correcto funcionamiento de los procesos internos de San Fernando |
|Descripción | El usuario ingresa los datos del incidente como descripción detallada del incidente, fecha incidente, hora incidente, tipo de incidencia, además de tener la opción de adjuntar alguna foto para más detalle.|
|Actor Primario | Encargado de almacén|
|Actor Secundario|Almacenero y Transportista|
|Precondiciones|Comunicación con cada módulo sobre incidencias en sus procesos internos|
|Paso|Acción|
|1|El usuario selecciona la opción "Incidencia"|
|2|Ingresa la información del incidente: descripción detallada del incidente,fecha incidente,hora de incidente, tipo de incidencia,etc|
|3|Verifica los datos y confirma el registro|
|4|El sistema actualiza el registro con el nuevo ingreso|

#### 4.2. Requerimientos de atributos de calidad

1. Verificación de procesos sobre pedido de abastecimiento:
- Exactitud en la Recepción de Pedidos de Insumos
- Cumplimiento de Especificaciones de Insumos (como calidad, cantidad, fecha de vencimiento)
- Gestión Eficiente de Inventarios en el Almacén General

2. Verificación de procesos sobre pedido de venta:
- Precisión en el Picking de Productos para el Pedido
- Correcto Precintado de Productos para su Seguridad
- Eficiencia en el Paletizado y Carga de Productos para la Entrega
- Cumplimiento de Plazos de Entrega al Cliente
  
3. Registro de disponibilidad de conductores:
- Actualización en Tiempo Real de la Disponibilidad de Conductores
- Asignación Equitativa y Eficiente de Conductores a Tareas y Rutas
- Seguimiento de Horarios de Trabajo y Descanso de Conductores
  
4. Registro de disponibilidad de vehículos:
- Mantenimiento Preventivo de la Flota de Vehículos
- Registro de Kilometraje y Estado de los Vehículos
- Disponibilidad de Vehículos adecuados para las Tareas y Rutas planificadas

5. Registro de incidencias internas:
- Reporte Inmediato y Preciso de Incidencias en Procesos Internos 
- Seguimiento de Acciones Correctivas y Preventivas para Resolver Incidencias
- Análisis de Causa Raíz de las Incidencias para evitar su recurrencia


#### 4.3. Restricciones
- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.


### 5. Requerimientos del módulo de Reportes
#### 5.1. Requerimientos funcionales

a. Usuarios
- Administrador: Puede visualizar todas las pantallas, generar, enviar y programar cualquier reporte.
- Usuario encargado de almacén: Puede visualizar todas las pantallas, generar, enviar y programar cualquier reporte.

b. Casos de uso
Caso de Uso #1: Generar reporte
| Código           | R501                                                                                                                                        |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Generar reporte de los ítems existentes en almacén con filtros personalizados y por tipo de ítem.                                           |
| Descripción      | El encargado de almacén en el módulo de reportes, selecciona las columnas que necesita en el card filtros y genera el reporte con el botón. |
| Actor Primario   | Supervisor de Almacén                                                                                                                       |
| Actor Secundario | N/A                                                                                                                                         |
| Precondiciones   | Productos registrados en almacén                                                                                                            |
| Paso             | Acción                                                                                                                                      |
| 1                | El Supervisor de Almacén selecciona el tipo te ítem que requiere para el reporte.                                                           |
| 2                | Selecciona los filtros en el cuadro del lado izquierdo.                                                                                     |
| 3                | Ingresa a generar reporte en opciones.                                                                                                      |
| 4                | Selecciona el tipo de formato para generar el reporte.                                                                                      |
| 5                | Selecciona confirmar para que se descargue el reporte.                                                                                      |

Caso de Uso #2: Programar reporte
| Código           | R502                                                                                                   |
| ---------------- | ------------------------------------------------------------------------------------------------------ |
| Objetivo         | Programar reportes automáticos con una frecuencia, formato y lugar especificado                        | El encargado de almacén en el módulo de reportes, selecciona las columnas que necesita en el card filtros y genera el reporte con el botón. |
| Actor Primario   | Supervisor de Almacén                                                                                  |
| Actor Secundario | N/A                                                                                                    |
| Precondiciones   | Productos registrados en almacén                                                                       |
| Paso             | Acción                                                                                                 |
| 1                | El Supervisor de Almacén selecciona el tipo te ítem que requiere para programar el reporte.            |
| 2                | Selecciona los filtros en el cuadro del lado izquierdo.                                                |
| 3                | Ingresa a programar reporte en opciones.                                                               |
| 4                | Selecciona el tipo de formato para programar el reporte.                                               |
| 5                | Selecciona la frecuencia de programación que puede ser semanal, quincenal, mensual u otro.             |
| 6                | Registra desde que fecha inicia la programación                                                        |
| 7                | Selecciona la duración de la programación, que puede ser permanente, semestral, anual o personalizado. |
| 8                | Selecciona confirmar para programar el reporte.                                                                                      |

Caso de Uso #3: Enviar reporte

| Código           | R503                                                                                                   |
| ---------------- | ------------------------------------------------------------------------------------------------------ |
| Objetivo         | Enviar un reporte mediante correo electrónico. | Supervisor de Almacén                                                                                  |
| Actor Secundario | N/A                                                                                                    |
| Precondiciones   | Productos registrados en almacén                                                                       |
| Paso             | Acción                                                                                                 |
| 1                | El Supervisor de Almacén selecciona el tipo te ítem que requiere para programar el reporte.            |
| 2                | Selecciona los filtros en el cuadro del lado izquierdo.                                                |
| 3                | Ingresa a programar reporte en opciones.                                                               |
| 4                | Selecciona el tipo de formato para enviar el reporte.                                               |
| 5                | Llena los campos del formulario.             |
| 6                | Selecciona la ubicación de los reportes.             |
| 7                | Selecciona confirmar para programar el reporte.                                                                                      |

#### 5.2. Requerimientos de atributos de calidad

- Confiabilidad:

  Los reportes generados deben ser confiables, reflejando con exactitud la información almacenada en el sistema.
  Las gráficas y visualizaciones deben representar los datos de manera precisa y coherente para facilitar la toma de decisiones informadas.

- Rendimiento:

  El sistema debe ser capaz de generar y mostrar reportes de manera rápida y eficiente, incluso cuando se trabaja con grandes volúmenes de datos.
  Las consultas y operaciones de filtrado en la interfaz de usuario deben ejecutarse de manera ágil, sin demoras significativas.

 - Usabilidad:

    La interfaz de usuario debe ser intuitiva y fácil de usar, con una navegación clara y acceso sencillo a las funcionalidades de generación de reportes, programación y filtrado.
    Las gráficas y visualizaciones deben ser legibles y comprensibles, con opciones para personalizar la visualización según las preferencias del usuario.

 - Seguridad:
    Los datos almacenados y los reportes generados deben estar protegidos mediante medidas de seguridad adecuadas, como el control de acceso.
    El sistema debe cumplir con las regulaciones de privacidad de datos y protección de la informaciónl.

#### 5.3. Requerimientos de restricciones
  - El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
  - El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.


### 6. Requerimientos del módulo de Reclamos

#### 6.1. Requerimientos funcionales

a. Usuarios

- Encargado de Atención a Reclamos

b. Casos de uso

Claro, aquí tienes la tabla completada:

Caso de Uso #1: Crear un reclamo de un cliente interno
| Código | R601 | 
|----------|----------|
|Objetivo | Registrar un reclamo realizado por un cliente interno de la empresa. |
|Descripción | Este caso de uso describe el proceso mediante el cual el Encargado de Atención a Reclamos registra un reclamo generado por un empleado interno de la empresa, relacionado con algún problema o incidencia. |
|Actor Primario | Encargado de Atención a Reclamos|
|Actor Secundario| N/A |
|Precondiciones| El Encargado de Atención a Reclamos tiene acceso al sistema de registro de reclamos. |
|Paso | Acción | 
|1| Ingresar datos del área (cliente) y del representante.|
|2| Ingresar detalladamente el pedido, descripción, fecha de adquisición, etc.|
|3| Ingresar la naturaleza del reclamo.|
|4| Ingresar la documentación y evidencia en formato Word o PDF.|
|5| Ingresar los datos para la resolución deseada.|
|6| Confirmar el seguimiento del reclamo.|


Caso de Uso #2: Crear un reclamo de un cliente externo
| Código | R602 | 
|----------|----------|
|Objetivo | Registrar un reclamo realizado por un cliente externo de la empresa. |
|Descripción | Este caso de uso describe el proceso mediante el cual el Encargado de Atención a Reclamos registra un reclamo generado por un cliente externo de la empresa, relacionado con algún producto, servicio o atención recibida. |
|Actor Primario | Encargado de Atención a Reclamos|
|Actor Secundario| N/A |
|Precondiciones| El Encargado de Atención a Reclamos tiene acceso al sistema de registro de reclamos. |
|Paso | Acción | 
|1| Ingresar datos de la empresa (cliente) y del representante.|
|2| Ingresar detalladamente el pedido, descripción, fecha de compra, etc.|
|3| Ingresar la naturaleza del reclamo.|
|4| Ingresar la documentación y evidencia en formato Word o PDF.|
|5| Ingresar los datos para la resolución deseada.|
|6| Confirmar el seguimiento del reclamo.|

Caso de Uso #3: Visualizar un reclamo
| Código | R603 | 
|----------|----------|
|Objetivo | Visualizar la información detallada de un reclamo registrado en el sistema. |
|Descripción | Este caso de uso describe el proceso mediante el cual el Encargado de Atención a Reclamos puede acceder y visualizar todos los detalles de un reclamo específico registrado en el sistema, incluyendo la descripción, estado, fecha de registro, y acciones tomadas. |
|Actor Primario | Encargado de Atención a Reclamos|
|Actor Secundario| N/A |
|Precondiciones| El Encargado de Atención a Reclamos tiene acceso al sistema de registro de reclamos. |
|Paso | Acción | 
|1| Buscar el reclamo en la lista editando los diferentes campos.|
|2| Seleccionar el reclamo a visualizar|
|3| Visualizar el reclamo, que presenta campos que pueden ser editados. |

#### 6.2. Requerimientos de atributos de calidad

Por supuesto, aquí tienes un resumen de dos líneas para cada requerimiento de calidad:

- Seguridad: Debe tener un acceso seguro con autenticación robusta y control de acceso por rol. Además una protección de datos según regulaciones y registro detallado de actividades para privacidad y trazabilidad.

- Confiabilidad: Debe tener una alta disponibilidad con mínimos tiempos de inactividad. Contar con un sistema de emergencia de resplado de datos.

- Usabilidad: Debe tener una interfaz intuitiva para tareas eficientes y experiencia amigable, con guías integradas y ayuda contextual para navegación fluida.
  
- Eficiencia: Debe ofrecer respuestas rápidas con automatización de tareas y uso optimizado de recursos del sistema. Escalabilidad para manejar volúmenes crecientes de reclamos sin comprometer el rendimiento.

#### 6.3. Restricciones
- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.

## Prototipo
### Módulo 1: Pedidos

#### Pantalla para enviar los datos del usuario
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/069a79c8-4a00-48db-8e46-652a0ab06f8d"></p>
Entidades:

-Cliente interno

-Representante

-Pedido

#### Pantalla para solicitar los productos
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/821d9171-5559-4bca-a751-5f86b46dca10"></p>
Entidades:

-Representante

-Pedido

#### Pantalla para ver la orden de pedido
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/49dfc0e5-710d-490c-b201-58bd785044da"></p>

Entidades:

-Pedido

-Orden de pedido
#### Pantalla para ver todos los pedidos realizados
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/6a3f5696-d896-48f3-bf29-00fba6369d3d"></p>

Entidades:

-Pedido

[Prototipo en Figma](https://www.figma.com/file/KQ34ScwxvuSCmmvHqfIPRP/Untitled?type=design&node-id=85-33763&mode=design&t=t2m1MihV991qcCyH-0)


### Módulo 2: Seguimiento

#### Pantalla Menú Principal:
Al ingresar al módulo el usuario podrá ver una serie de vínculos que lo lleva a las pantallas principales del módulo

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/0dc9d667-3f1c-4c7c-a8d0-3d78e583d0ef"></p>

#### Pantalla Pedidos en Progreso:
Al elegir el vínculo a “Pedidos en progreso” se dirigirá a la pantalla principal del módulo, donde no le aparecerán los datos hasta que escriba el código del traslado o el código del pedido en sus respectivos cuadros de búsqueda. 
Si por ejemplo el usuario solo cuenta con el código del pedido basta con buscarlo y automáticamente se completará el código del traslado debido a la relación entre ambas entidades.
En esta pantalla también están incluidas las funciones de inicio de Incidente y visualización de la guía de remisión, pero esto está sujeto al nivel de acceso del usuario.
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/f00dc926-ce6e-4098-8100-607abf265f7f"></p>
Para evitar manejar una cantidad grande de datos se plantea generar una actualización de la ubicación en el momento en el que se ingresa a esta pantalla y en periodos específicos de tiempo durante la permanencia del usuario en la pantalla (alrededor de 1 minuto de intervalo entre actualización y actualización).

Entidades involucradas:
- Traslados
- Pedidos
- Rutas
- Vehículos
- Ubicación

#### Pantalla Detalles de Traslado:
Se puede llegar a la pantalla de Detalles de Traslado desde el Menú principal o desde la pantalla Pedidos en Progreso; la diferencia radica que al usar la pantalla de Pedidos en Progreso el rellenado del campo “Código de traslado” sería automático y proveniente de lo último que se esté viendo en la otra pantalla. 
Una vez colocado el código respectivo el usuario tendrá acceso a la información del conductor y el automóvil con la finalidad de corroboración o en el intento de contactar con el conductor a través de su número celular.
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/95ef1cc0-4498-4372-aec9-654c03fb9d91"></p>
Este módulo interactúa con las entidades Transportista y Vehículo puesto que toma y muestra sus atributos.

Entidades involucradas:
- Transportista
- Vehículo

#### Pantalla Pedidos Pendientes:
Esta pantalla, al igual que la anterior, es accesible desde la pantalla principal y la de Pedidos en progreso, aunque está restringida a ciertos usuarios. Su función es mostrar los pedidos de un traslado en particular que aún no han sido entregados, esto le permite a un supervisor verificar los pedidos que faltan entregar y al transportista a registrar cuando realiza una entrega, para eso se genera un botón con el vínculo al modulo de control para verificar el proceso de entrega. Una vez culminado el proceso en ese otro modulo el sistema se actualizará y generará una notificación para los usuarios asignados.
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/d04fc44c-ef3b-4682-9c31-7912a648c48e"></p>

Entidades Involucradas:
- Pedidos
- Dirección

[Prototipo en Figma](https://www.figma.com/file/Jfo2z2Mh3c5yoxamTw56gg/Seguimiento?type=design&node-id=0%3A1&mode=design&t=wmoz54XJ5USPhnU3-1)

### Módulo 3: Almacén

#### Pantalla Registro de Picking:

- Requerimiento asociado: Caso de uso R301

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/9c0caabb-f98a-4ce1-a778-86345d20d77a"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/e7f4c736-a0e8-4a97-838d-2749f04bdd6a"></p>

- Entidades involucradas:
  * Mercancía
  * Stock
  * ElementoCatálogo
  * Fecha
  * Empleado
  * Operación

#### Pantalla Registro de Precintado:

- Requerimiento asociado: Caso de uso R302

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/000c1c1d-b480-4d18-9ca5-985d8e4bbd72"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/659780d4-3122-4eec-83fd-1479494f1502"></p>

- Entidades involucradas:
  * Mercancía
  * Stock
  * Fecha
  * Empleado
  * Operación

#### Pantalla Registro de Paletizado:

- Requerimiento asociado: Caso de uso R303

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/6766c399-2161-47ea-896a-2a205689ff42"></p>

- Entidades involucradas:
  * Fecha
  * Empleado
  * Operación

#### Pantalla Registro de Carga:

- Requerimiento asociado: Caso de uso R304

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/55e471b0-dc53-4445-b891-d03e02f15d64"></p>

- Entidades involucradas:
  * Fecha
  * Empleado
  * Operación

#### Pantalla Registro de Guía de Remisión:

- Requerimiento asociado: Caso de uso R305

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/5bcc34f0-55fd-4e55-9be6-473292731a76"></p>

- Entidades involucradas:
  * Operación
  * Pedido
  * Fecha
  * Vehículo
  * Transportista
  * Ruta
  * Empleado

#### Pantalla Registro de Recepción:

- Requerimiento asociado: Caso de uso R306

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/8c4020b9-35b8-409f-aca8-3eb6286ca21c"></p>

- Entidades involucradas:
  * Fecha
  * Empleado
  * Operación

#### Pantalla Registro de Descarga:

- Requerimiento asociado: Caso de uso R307

- Imagen de la interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/1602f66f-2e61-4c04-ae2f-e76494108d00"></p>

- Entidades involucradas:
  * Fecha
  * Empleado
  * Operación

[Prototipo en Figma](https://www.figma.com/file/Lrq1F0qg06qLWHrVxUnk8p/Almac%C3%A9n?type=design&node-id=0%3A1&mode=design&t=tfzkqQTL0uNO9rXI-1)

Para explicar de manera más sencilla la relación entre los casos de uso, las interfaces y el modelado conceptual, se presenta a continuación un ejemplo de poblamiento de datos de las entidades ProductoStock, Mercancía y Operación

ProductoStock

|CodStock|NroLote|FechaCaduc|IDProductCat|IDMercancía|
|----------|----------|----------|----------|----------|
|PS-001|LOTE-001|20240831001|P-001|MC-001|
|PS-002|LOTE-002|20240930002|P-002|MC-001|
|PS-003|LOTE-003|20241031124|P-003|MC-002|
|PS-004|LOTE-004|20241130489|P-004|MC-002|
|PS-005|LOTE-005|20241231125|P-005|MC-003|

Mercancía

|IDMercancía|Cantidad|PesoTotal|NúmeroPrecinto|IDOperación|
|----------|----------|----------|----------|----------|
|MC-001|2|150|PRECINTO-001|OP-001|
|MC-002|2|120|PRECINTO-002|OP-001|
|MC-003|1|75|NULL|OP-006|

Operación

|IDOperación|Tipo|IDOpAfectada|FechaInicio|FechaFin|IDEmpEjecutor|IDEmpSupervisor|
|----------|----------|----------|----------|----------|----------|----------|
|OP-001|Picking|NULL|20240415001|20240415002|EMP-001|EMP-102|
|OP-002|Precintado|OP-001|20240415003|20240415004|EMP-002|EMP-102|
|OP-003|Paletizado|OP-002|20240415005|20240415006|EMP-003|EMP-102|
|OP-004|Carga|OP-003|20240415007|20240415008|EMP-004|EMP-105|
|OP-005|Descarga|OP-004|20240416003|20240416004|EMP-009|EMP-118|
|OP-006|Picking|NULL|20240417001|20240417002|EMP-001|EMP-102|

Las existencias de un producto (instancias de ProductoStock) se agrupan en mercancías mediante una operación conocida como picking (el ID de esta operación tipo "Picking" va en el campo IDOperación de la entidad Mercancía). La secuencia de las operaciones es la siguiente: picking -> precintado -> paletizado -> carga -> descarga. Cada una de estas operaciones tiene un campo IDOpAfectada con el ID de la operación que le precede, excepto las operaciones tipo "Picking" que no les precede ninguna operación. Cuando se realiza una operación tipo "Precintado", el campo "NúmeroPrecinto" de las instancias de Mercancía asociadas a la operación tipo "Picking" que le precede se actualizan con su respectivo código de precinto.

Tomar en cuenta también que la entidad Traslado tiene un campo referido a un identificador de una instancia de Operación tipo "Carga" que sirve para dar información de la mercancía que se está transportando.

### Módulo 4: Control

#### Pantalla principal
![figma 1](https://github.com/fiis-bd241/grupo01/assets/164266999/96c913fd-cbcf-402a-b9eb-3604ea65d8f4)

Entidades involucradas:
- Incidencia
- Vehículo
- Transportista
- Cliente
- Fecha


#### Pantalla de verificación de procesos sobre pedido de abastecimiento

![figma 2](https://github.com/fiis-bd241/grupo01/assets/164266999/df1df8e0-d8e8-46ea-94a3-bc3b572341db)

Entidades involucradas:
- Traslado
- Pedido
- Vehículo
- Empleado
- Seguimiento
- Cliente interno
- Incidencia
- Local
- Fecha

#### Pantalla de verificación de procesos sobre pedido de venta

![figma 3](https://github.com/fiis-bd241/grupo01/assets/164266999/1efa3191-7bec-4e87-93eb-1f6263231dae)

Entidades involucradas:
- Traslado
- Pedido
- Vehículo
- Empleado
- Seguimiento
- Cliente externo
- Incidencia
- Fecha

#### Pantalla de disponibilidad de conductores

![figma 4](https://github.com/fiis-bd241/grupo01/assets/164266999/88de757e-a9e2-429f-809f-a3b8593bbdc1)

Entidades involucradas:
- Trasportista
- Empleado
- Fecha

#### Pantalla de disponibilidad de vehículos

![figma 5](https://github.com/fiis-bd241/grupo01/assets/164266999/a8fe5ec9-9ac9-4995-85c7-8ae945ba7952)

Entidades involucradas:
- Vehículo
- Ubicación
- Empleado
- Fecha

#### Pantalla de registro de incidencias internas

![figma 6](https://github.com/fiis-bd241/grupo01/assets/164266999/d9065ac3-c8fc-4608-b740-ad0a9b763888)

Entidades involucradas:
- Reclamo
- Incidencia
- Empleado
- Traslado
- Cliente interno
- Vehículo
- Seguimiento
- Fecha

#### Cuestionario

1. ¿Existe alguna consideración especial en cuanto a rendimiento? Por ejemplo, en sistemas que llegan a usuario final, un bajo rendimiento puede tener como consecuencia la pérdida de una venta.

Considero que en sistemas que llegan al usuario final, el rendimiento es crítico. Un bajo rendimiento puede afectar la experiencia del cliente y, en última instancia, resultar en la pérdida de ventas o insatisfacción. Además es crucial evaluar el tiempo de respuesta de las consultas y procesos. Si las operaciones de verificación de pedidos o registro de incidencias son lentas, podríamos considerar optimizarlas mediante procesos batch o índices eficientes en la base de datos.

2. ¿El volumen de información con el que trata la opción del sistema es significativo? En esos casos, por ejemplo, podríamos tener procesos batch que permitan optimizar estas consultas (¿hemos considerado ello en nuestros módulos?).

Efectivamente, al tratar con la parte de logística de una empresa como San Fernando estamos obligados a trabajar con un gran número de datos. Por lo tanto, como grupo y teniendo en cuenta mi módulo de Control donde debo verificar el estado de los procesos ya sea del almacén central a la planta, como de la planta al cliente final, así como observar la disponibilidad de conductores, vehículos y los registros de incidencias, me he planteado utilizar los procesos batch con ese fin y orientarlo hacia tareas intensivas en datos que pueden ayudar a reducir la carga en tiempo real y mejorar el rendimiento general.


### Módulo 5: Reportes
#### Pantalla Principal
![reporte-1](https://github.com/fiis-bd241/grupo01/assets/161625149/611afe2d-e585-4362-b0ec-77458d10a393)
![reporte-2](https://github.com/fiis-bd241/grupo01/assets/161625149/8804dc50-eff3-4ab0-906c-3fc0cad4d032)
![reporte-3](https://github.com/fiis-bd241/grupo01/assets/161625149/9d7f02da-e60c-4688-ba0f-c65bcca96d94)
![reporte-4](https://github.com/fiis-bd241/grupo01/assets/161625149/b30a5e5b-fd8a-452d-b498-66d18c6462a7)
Entidades involucradas:
- Local
- Almacén
- Fecha

#### Pantalla para Generar reporte
![reporte-5](https://github.com/fiis-bd241/grupo01/assets/161625149/e7722d15-543b-450e-94d3-96f92eac99be)
Entidades involucradas:
- Empleado
- Reporte
- Fecha
  
#### Pantalla para Programar reporte
![reporte-6](https://github.com/fiis-bd241/grupo01/assets/161625149/7419efe2-fd43-46e7-a8de-a84ffa8a36cb)
Entidades involucradas:
- Empleado
- Programacion reporte
- Fecha
  
#### Pantalla para Enviar reporte
![reporte-7](https://github.com/fiis-bd241/grupo01/assets/161625149/b868a1b1-98b0-450b-93ac-6fd70dce3d31)
Entidades involucradas:
- Empleado
- Envio reporte
- Fecha

### Módulo 6: Reclamos

#### Pantalla Principal

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/2c747c51-3884-4ed8-b26a-6b3ad7328d83"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/593c1895-b88c-4b27-a2fc-7f1e01f1ae56"></p>

Entidades Involucradas:
- Reclamo
- Cliente

#### Pantallas de Crear Reclamo de Cliente Interno

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/c2f43051-d0bb-4d39-a5b0-2b953c7f9c16"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/9fef7f12-466e-4a03-b6ea-c769ab700640"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/b6ff9845-39f9-4e73-9ee2-16bdb016f749"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/7a6bd1f1-494e-43c2-8e9b-2491286c038b"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/d21db883-c515-4f2e-800f-ba75c587a550"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/6742ef99-e2d6-4106-bc2b-dee30bdafce7"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/803d07a8-3d54-4980-9ebe-02d79d5ec990"></p>

Entidades Involucradas:
- Cliente Interno
- Representante
- Pedido
- Reclamo
- Evidencia
- Seguimiento

#### Pantallas de Crear Reclamo de Cliente Externo

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/1e57978b-2aba-4fa5-a26d-ac3a4375c357"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/7f5d7bf1-0108-4b2f-b6e5-35959e933b8c"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/8b1a6ff5-bbde-4ef0-a437-02a6e11f45a5"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/5d95728b-f6ab-449b-919a-90c0fd90aa88"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/d912d7c6-32e3-4306-9c7a-a80bae940abc"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/635b40a4-2d96-4135-9acc-4a0e4c564956"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/fe3f5dfc-a23b-4c96-b78a-02a1ab323225"></p>

Entidades Involucradas:
- Cliente Externo
- Representante
- Pedido
- Reclamo
- Evidencia
- Seguimiento

[Prototipo en Figma](https://www.figma.com/file/kZLR8sf4PPRQyQf9dsDxDp/PROTOTIPO-DE-RECLAMOS?type=design&node-id=0-1&mode=design&t=7KtYyZiyPe04xOE2-0)

## Modelo Conceptual

### Planta Huaral Diagrama Cheng

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/79b14c4c-3a32-484d-b7ac-35edda3e7408"></p>

[Modelo Cheng en Draw.io](https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D)

#### Diccionario de datos:

**Entidad**: Cliente

Semántica: Persona o entidad que utiliza productos o servicios de una empresa.

| ATRIBUTO       | NATURALEZA | FORMATO   | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                      |
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------|
| cod_cliente    | CHAR       | 999999999 | 9 dígitos       | -      | -           | Código único que identifica al cliente.          |
| estado         | CHAR     | x(32)| Activo, Inactivo, Pendiente | - | -           | Estado actual del cliente en la plataforma.      |
| prioridad      | INT  |  9   | 1, 2, 3, ...    | -      | -           | Prioridad asignada al cliente para atención.     |
| cod_fecha_registro | CHAR     | 999999999 | 9 dígitos      | -      | -      | Fecha en que el cliente fue registrado en el sistema. |
| cod_representante | CHAR     | 999999999 | 9 dígitos      | -      | -      | Código único que identifica al representante |

**Entidad**: ClienteInterno

Semántica:

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |

**Entidad**: ClienteExterno

Semántica:

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |

**Entidad:** ElementoCatálogo

Semántica: Representa los productos ofrecidos por sanfernando 

| ATRIBUTO        | NATURALEZA | FORMATO   | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                   |
| --------------- | ---------- | --------- | --------------- | ------ | ----------- | --------------------------------------------- |
| Cod_elementoCat | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del elemento en el catálogo.    |
| Nombre          | CHAR       | X(128)    | No nulo         | --     | --          | Nombre del elemento en el catálogo.           |
| Descripcion     | CHAR       | X(256)    | No nulo         | --     | --          | Descripción del elemento en el catálogo.      |
| Unidad          | CHAR       | X(32)     | No nulo         | --     | --          | Unidad de medida del elemento en el catálogo. |

**Entidad**: Empleado

Semántica: Entidad que representa a los trabajadores de la empresa San fernando.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|codigo Empleado| CHAR | 9999999 | 9 digitos | -  | -  | Identificador único del empleado dentro de la organización. Permite diferenciar a cada empleado de manera inequívoca. |
|codigo Persona | CHAR | 9999999 | 9 digitos | -  | -  | Identificador de la persona dentro de la sociedad | 
| Cargo | CHAR | Texto | X(32) | - | - | Cargo o función que desempeña el empleado en la organización. Describe el rol del empleado dentro de la empresa. |
| codigo Fecha | CHAR | 9999999 | 9 digitos | - | - | Identificador en la que empezo a trabajar el empleado |
| codigo Traslado | CHAR | 9999999 | 9 digitos | - | - | Identificador del pedido de traslado |
| codigo Operacion |  CHAR | 9999999 | 9 digitos | - | - | Identificador de la operacion |
| codigo Reporte | CHAR | 9999999 | 9 digitos | - | - | Identificador del reporte |
| codigo Representante | CHAR | 9999999 | 9 digitos | - | - | Identificador del representante |

**Entidad**: Evidencia

Semántica: Implica la representación de archivos adjuntos que respaldan o documentan reclamos, incidencias o eventos en un sistema o proceso. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| cod_evidencia    |  CHAR     |   9999999    |     -          |   -     |     -        |  Código único de identificación de la evidencia |
| nombre_evidencia |  CHAR     |   X(16)      |     -           |   -     |     -        |  Nombre o descripción de la evidencia. |
| tipo_evidencia   |  CHAR     |   X(16)      |  foto, video, documento, etc  |  -      |      -       |  Tipo de evidencia (formato del archivo).|
| tipo_archivo     |  CHAR     |   X(3)       | jpg, png, mp4, pdf, etc       |    -    |      -       |  Tipo de archivo asociado a la evidencia.|


**Entidad**: Fecha

Semántica: Momento específico en el tiempo.

| ATRIBUTO    | NATURALEZA | FORMATO        | VALORES VÁLIDOS                         | UNIDAD   | DERIVADA DE | DESCRIPCIÓN                                                                                      |
|-------------|------------|----------------|-----------------------------------------|----------|-------------|--------------------------------------------------------------------------------------------------|
| cod_fecha   | CHAR  | Alfanumérico   | -      | -        | -  | Código único que identifica la fecha.|
| tipo        | CHAR  | X(32)  | Laborable, No Laborable, Feriado  | -   | -   | Tipo de día, indicando si es laborable, no laborable o un feriado.|
| segundo     | INT   | 99  | 0-59 | Segundos| -   | Segundos en la hora de la fecha.|
| minuto      | INT   | 99  | 0-59| Minutos  | -   | Minutos en la hora de la fecha.|
| hora        | INT   | 99  | 0-23 | Horas   | -   | Hora del día en la fecha.|
| dia         | INT   | 99  | 1-31 |  Día    | -   | Día del mes en la fecha.|
| mes         | INT   | 99  | 1-12 | Mes     | -   | Mes del año en la fecha.|
| año         | INT   | 9999       | Año calendario       | Año      | -   | Año de la fecha.|

**Entidad**: GPS

Semántica: Registro del momento en el tiempo y ubicación en el que estuvo un vehículo determinado.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| Cod_fecha      | CHAR       | 999999999   | Alfanuméricos     | ---             | ---         | Identificador de la fecha y hora específicas en las que el vehículo se encuentra en la ubicación |
| Cod_vehículo   | CHAR       | 999999999   | Alfanuméricos     | ---             | ---         | Identificador del vehículo cuya ubicación se registra en determinado tiempo              |
| Cod_ubicación  | CHAR       | 999999999   | Alfanuméricos     | ---             | ---         | Identificador de la ubicación que registra un vehículo en un instante |

**Entidad**: Incidencia

Semántica: Problema, situación anormal o evento no planificado.

| ATRIBUTO             | NATURALEZA | FORMATO      | VALORES VÁLIDOS                         | UNIDAD | DERIVADA DE      | DESCRIPCIÓN  |
|----------------------|------------|--------------|-----------------------------------------|--------|------------------|---------------------------------------------------------------------------------------------------|
| cod_incidencia       | CHAR | 999999999 | 9 digitos | -  | -  | -  | Código único que identifica la incidencia.|
| tipo_incidencia      | CHAR | x(32)| - | -  | -  | Tipo de incidencia que ha ocurrido. Puede ser de diferentes categorías, como técnica, operativa, etc. |
| descripcion          | CHAR | x(128) | -  | -  | -  | Descripción detallada de la incidencia.|
| cod_fecha_incidencia | CHAR | 999999999    | 9 digitos | -  | -    | -  | Código de la fecha en la que ocurrió la incidencia. Puede ser el código único de la fecha.          |
| cod_traslado | CHAR | 999999999    | 9 digitos | -  | -    | -  | Código único que identifica un traslado|

**Entidad**: Local

Semántica: Lugar físico que cuenta con una dirección legal registrada.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| Cod_local      | CHAR       | 999999999   | Alfanuméricos           | ---              | ---         | Identificador del local                                                  |
| País           | CHAR       | xxx         | ISO 3166-1 alfa-3       | ---              | ---         | República donde se encuentra el local                                    |
| Región         | CHAR       | xx-xxx      | ISO 3166-2              | ---              | ---         | Departamento / Estado donde se encuentra el local                         |
| Distrito       | CHAR       | X(64)       | Alfanuméricos           | ---              | ---         | Ciudad donde se encuentra el local                                        |
| Calle          | CHAR       | X(64)       | Alfanuméricos           | ---              | ---         | Calle, Jr, Av p Psje donde se encuentra el local                         |
| Numero         | INT        | 9999        | >0                      | ---              | ---         | Identificador numérico de domicilio                                       |
| Cod_ubicacion  | CHAR       | 999999999   | Alfanumérico            | ---              | ---         | Identificador de la longitud y latitud exactas del local                 |

**Entidad**: MaterialCatalágo

Semántica:

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |

**Entidad**: MaterialStock

Semántica:

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |

**Entidad**: MateriaPrimaCatálogo

Semántica:

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |

**Entidad**: MateriaPrimaStock

Semántica:

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |
|          |            |         |                 |        |             |             |


**Entidad**: Mercancía

Semántica: Representar los diferentes productos que una empresa tiene en su inventario para la venta o distribución. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| Cantidad de producto  |     INT       |   9999      |     unidades    |   -     |   -          |    Cantidad de productos disponibles         |
| Número de precinto    |    CHAR       |   999999    |    -         | -       |     -        |   Número de precinto asociado a la mercancía      |
| Descripción  |    CHAR       |   x(100)      |     -            |   -     |   -          |  Nombre o descripción de la mercancía           |
| Peso total             |    INT      |  999       |     >=0            |   -     |      -       | Peso total de la mercancía     |


**Entidad**: Operación

Semántica: Entidad que representa las diferentes transacciones o movimientos de mercancía que se realizan dentro de la empresa San Fernando.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| codigo_operacion | CHAR | 9999999 | 9 digitos | - | - | Identificador único de la operación. |
| Tipo_operación | CHAR | X(32) | "Entrada", "Salida", "Traslado" | - | - | Indica el tipo de movimiento realizado en la operación. |
| codigo_Fecha_Inicio | CHAR | 9999999 | 9 digitos | - | - | codigo de la fecha en la que se realizó la operación. |
| codigo_empleado | CHAR | 9999999 |  9 digitos |  - |  - | identificador unico de la empleado |
| codigo_mercancia | CHAR | 9999999 | 9 digitos | -  |  - |  identificador unico de la mercancia |
| codigo_Fecha_fin | CHAR | 9999999 | 9 digitos | -  |  - |  identificadro unico de la Fecha fin |

**Entidad**: Pedido

Semántica: La entidad que representa las solicitudes de compra o de suministros realizadas por la empresa San Fernando.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| codigo_pedido | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del pedido. |
| Descripcion | CHAR |  texto |  X(32) |  -  |  -  | Descripcion detallada del pedido |
| codigo_Orden_Pedido | CHAR | 9999999 | 9 digitos | - | - | Identificador unico de Orden de pedido| 
| codigo_Fecha_Registro | CHAR | 999999999 | 9 digitos | - | - | Identificador unico de la fecha registro del pedido |
| codigo_Reclamo | CHAR | 999999999 | 9 digitos | - | - | Identificador unico del reclamo asociado al pedido, en caso de que se haya presentado. |
| Estado del pedido | CHAR | Texto | "Pendiente", "En proceso", "Entregado", "Cancelado" | - | - | Indica el estado actual del pedido. |
| codigo_Representante | CHAR | 9999999 | Entero positivo | - | Entidad Representante | Identificador unico del representante que realizó el pedido. |
| codigo_Reclamo | CHAR | 999999999 | 9 digitos | - | - | Identificador unico del reclamo asociado al pedido, en caso de que se haya presentado. |

**Entidad:** PedidoExterno

Semántica: Pedido realizado por un cliente externo

| ATRIBUTO           | NATURALEZA | FORMATO   | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                     |
| ------------------ | ---------- | --------- | --------------- | ------ | ----------- | ----------------------------------------------- |
| Cod_pedidoExterno  | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del pedido externo en el sistema. |
| Cod_pedido         | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del pedido asociado.              |
| Cod_clienteExterno | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del cliente externo asociado.     |

**Entidad:** PedidoInterno

Semántica: Pedido realizado por un cliente interno

| ATRIBUTO           | NATURALEZA | FORMATO   | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                     |
| ------------------ | ---------- | --------- | --------------- | ------ | ----------- | ----------------------------------------------- |
| Cod_pedidoInterno  | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del pedido interno en el sistema. |
| Cod_pedido         | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del pedido asociado.              |
| Cod_clienteInterno | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del cliente interno asociado.     |

**Entidad**: Persona

Semántica: Entidad que interactúan con la empresa San fernando.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|codigo_Persona | CHAR | 9999999 | 9 digitos | - | - | Identificador unico de la Persona|
| Primer_apellido | CHAR | Texto | X(32) | - | - | Apellido paterno de la persona. |
| Segundo_apellido | CHAR | Texto | X(32) | - | - | Apellido materno de la persona. |
| Prenombre | CHAR | Texto | X(32) | - | - | Nombre(s) de la persona. |
| Género | CHAR | Texto | "Masculino" , "Femenino" | - | - | Género de la persona. |
| Nacionalidad | CHAR | Texto | X(32) | - | - | Nacionalidad de la persona. |
| Estado_civil | CHAR | Texto | "Soltero", "Casado", "Divorciado", "Viudo" | - | - | Estado civil de la persona. |
| Dirección | CHAR | Texto | X()32 | - | - | Dirección de residencia de la persona. |


**Entidad:** ProductoCatalogo 

Semántica: Representa a un producto terminado en la planta

| ATRIBUTO           | NATURALEZA | FORMATO   | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                                            |
| ------------------ | ---------- | --------- | --------------- | ------ | ----------- | ---------------------------------------------------------------------- |
| Cod_productoCat    | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador del producto catalogo.                                   |
| Temperatura_maxima | FLOAT      | 99.99     | No nulo         | --     | --          | Máxima temperatura que resiste el producto terminado para preservarlo. |
| Temperatura_mínima | FLOAT      | 99.99     | No nulo         | --     | --          | Mínima temperatura a la quede mantenerse el producto para preservarlo. |
| Categoría          | CHAR       | X(64)     |       Pollo, Pavita, Cerdo, Huevo ...          | --     | --          | Indica a la categoria que pertenece para almacenarlo correctamente     |
| Vida útil          | FLOAT      | 99        | x>0             | --     | --          | Máximo de días en el que el producto es consumible.                    |
| Cod_elementoCat    | CHAR       | 999999999 | 9 dígitos       | --     | --          | Identificador de la entidad elemento categoría                         |

**Entidad**: ProductoStock

Semántica: Se refiere a su función en representar la cantidad de un producto específico disponible en el inventario de una empresa en un momento dado.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|ID_Producto_Stock |   CHAR         |  999999    |    -    |    -    |    -         |  Identificador único del registro de producto en stock |
| Producto_ID      |  CHAR        |   99999      |    -   |    -    |   producto    |  Identificador del producto asociado al stock |
|  Cantidad        |   INT        |    >=0    |   unidades |   -     |     -        |  Cantidad del producto disponible en el stock  |
| Fecha_Ingreso      |   DATE         |   YYYY-MM-DD      |     -            |   -     |   -       |  Fecha de ingreso del producto al stock |
| Fecha_Vencimiento   | DATE        |  YYYY-MM-DD       |      -         |    -    |     -        |   Fecha de vencimiento del producto en stock     |


**Entidad:** ProgramacionReporte 

Semántica: Datos necesarios para la generación automática de cada reporte.

| ATRIBUTO                | NATURALEZA | FORMATO   | VALORES VÁLIDOS  | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                           |
| ----------------------- | ---------- | --------- | ---------------- | ------ | ----------- | ----------------------------------------------------- |
| Cod_ProgramacionReporte | CHAR       | 999999999 | 9 dígitos        | --     | --          | Identificador de la programación del reporte.         |
| Filtros                 | CHAR       | X(128)    | NO NULO          | --     | --          | Filtros necesarios para el reporte guardados.         |
| Frecuencia              | INT        | X(32)     | Activo, Inactivo | --     | --          | Cada cuanto debe generarse automaticamente el reporte |
| Estado                  | CHAR       | X(32)     | Activo, Inactivo | --     | --          | Indica si la programación este activa o inactiva      |
| Cod_empleado            | CHAR       | 999999999 | 9 dígitos        | --     | --          | Empleado que programó el reporte                      |
| Cod_fechaInicio         | CHAR       | 999999999 | 9 dígitos        | --     | --          | Referencia a la fecha donde inicia la programación    |
| Cod_fechaFin            | CHAR       | 999999999 | 9 dígitos        | --     | --          | Referencia a la fecha donde termina la programación   |

**Entidad**: Reclamo

Semántica: Queja formal expresada por un cliente sobre un producto o servicio.

| ATRIBUTO             | NATURALEZA | FORMATO      | VALORES VÁLIDOS                         | UNIDAD | DERIVADA DE      | DESCRIPCIÓN                                                                                            |
|----------------------|------------|--------------|-----------------------------------------|--------|------------------|--------------------------------------------------------------------------------------------------------|
| Cod_reclamo          | CHAR| 999999999 | 9 dígitos     | -      | -                | Código único que identifica el reclamo.|
| tipo_reclamo         | CHAR| X(32) | Tipo 1, Tipo 2, Tipo 3, ...  | -      | -     | Tipo de reclamo, puede ser de diferentes categorías, como técnico, operativo, etc.|
| nivel_urgencia       | CHAR | X(32) | Bajo, Medio, Alto  | -      | -   | Nivel de urgencia del reclamo, indicando la prioridad con la que debe ser atendido.|
| estado               | CHAR| X(32)| Pendiente, En Proceso, Resuelto, Cerrado | -      | -    | Estado actual del reclamo.|
| comentario           | CHAR| X(128) | -      | -      | -      | Comentario detallado sobre el reclamo, describiendo el problema o situación reportada.|
| cod_representante    | CHAR| 999999999 | 9 dígitos    | -      | -    | Código único del representante asignado al reclamo.|
| cod_evidencia    | CHAR| 999999999 | 9 dígitos    | -      | -    | Código único de la evidencia de un reclamo.|
| cod_seguimiento      | CHAR | 999999999 | 9 dígitos   | -      | -    | Código único de seguimiento del reclamo, si aplica.|
| cod_pedido           | CHAR | 999999999 | 9 dígitos   | -      | -    | Código único del pedido asociado al reclamo, si aplica.|
| cod_fecha_incidente  | CHAR | 999999999 | 9 dígitos   | -      | -    | Código único de la fecha en la que el cliente encontró el problema/incidente. Puede ser el código único de la fecha. |

**Entidad**: Reporte

Semántica: Representación de registros que documentan incidentes, eventos o problemas dentro de un sistema, proceso o entorno.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|  ID_reporte        |    CHAR        |   9999999   |    -     |   -     |   -          |  Identificador único del reporte |
|  fecha       |   DATE         | YYYY-MM-DD        |    -     |    -    |    -         | Fecha en que se generó el reporte  |
|  hora        |    TIME        |  HH:MM:SS   |      -    |    -    |      -       |  Hora en que se generó el reporte  |
|  usuario_id        |   CHAR         |  9999999       |   -     |   -     |     -     |   Identificador del usuario que generó el reporte|
|  tipo        |    CHAR        |  X(10)       |     -      |   -     |     -        | Indica el tipo de reporte (por ejemplo, "Incidente", "Error", etc.) |
|  descripción        |   CHAR       |   X(150)     |      -     |   -     |     -      | Descripción detallada del reporte  |
|  prioridad        |   CHAR         |   X(8)      | 1 (Baja), 2 (Media), 3 (Alta)  |   -     |    -      | Nivel de prioridad del reporte  |


**Entidad**: Representante

Semántica: Persona que actúa en nombre de una empresa o entidad en particular.

| ATRIBUTO        | NATURALEZA | FORMATO      | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN|
|-----------------|------------|--------------|-----------------|--------|-------------|--------------------------------------------------------------------------------------------------|
| cod_representante | CHAR | 999999999| 9 dígitos | -      | -           | Código único que identifica al representante.|
| cargo           | CHAR | X(32) | Cargo 1, Cargo 2, Cargo 3, ...       | -      | -           | Cargo o posición del representante en la empresa.|
| correo empresarial | CHAR | X(32) | Cargo 1, Cargo 2, Cargo 3, ...       | -      | -           | Correo de contacto del representante en la empresa.|
| Número de telefono | INT |999999999| 9 dígitos | -      | -           | Número de contacto del representante en la empresa.|
| cod_persona     | CHAR | 999999999 | 9 dígitos | -      | -           | Código de identificación de la persona asociada al representante. |
| cod_pedido      | CHAR | 999999999 | 9 dígitos | -      | -           | Código del pedido asociado al representante, si aplica.|
| cod_cliente     | CHAR | 999999999 | 9 dígitos | -      | -           | Código del cliente asociado al representante, si aplica.|
| cod_reclamo     | CHAR | 999999999 | 9 dígitos | -      | -           | Código del reclamo asociado al representante, si aplica.|
| cod_local       | CHAR | 999999999 | 9 dígitos | -      | -           | Código del local o sucursal asociado al representante.|

**Entidad**: Ruta

Semántica: Conjunto de ubicaciones que va a visitar el vehículo en su transcurso de su origen a su destino.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| Código_ruta    | CHAR       | 999999999  | 9 dígitos       | ---         | ---         | Identificador primario para relacionar y referenciar la ruta en el sistema. |
| Local_origen   | CHAR       | 999999999  | 9 dígitos       | ---         | ---         | Representa la ubicación exacta del local de donde parte el vehículo. |
| Local_destino  | CHAR       | 999999999  | 9 dígitos       | ---         | ---         | Representa la ubicación exacta del local a donde llega el vehículo. |
| Distancia      | INT        | 9999       | >0              | Kilómetros  | ---         | Indica la distancia en unidades específicas entre el punto de origen y el punto de destino. |
| Tipo_ruta      | CHAR       | X(64)      | Urbana, Rural   | ---         | ---         | Clasificación que define la naturaleza y características principales de la ruta. |
| Duracion       | INT        | 999        | >0              | horas       | ---         | Representa la duración estimada de la ruta en el sistema.  |

**Entidad**: Seguimiento

Semántica: Permitir el seguimiento y la gestión de casos, incidencias o eventos dentro de San Fernando.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
|  numero_caso       |   INT       |   9999      |      >0           | -       |     -        |   Número de caso asociado al seguimiento          |
| tipo_acción        |    CHAR     |   X(150)     |      -           |  -      |    -         | Tipo de acción realizada en el seguimiento            |
| area_responsable   |    CHAR     |  X(10)       |    -             |  -      |    -         |  Área responsable del seguimiento           |
|  comentario        |   CHAR      |  X(200)       |       -          |     -   |      -       |Comentario o descripción detallada del seguimiento             |


**Entidad**: Stock

Semántica: Se refiere a la representación de los productos físicos disponibles en el inventario de una empresa en un momento dado

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| Codigo_Stock       |    CHAR        |   9999999      |     -            |  -      |   -          | Código único de identificación del registro de stock |
|    N° Lote      |   INT         | 999        |     >=0      |    -    |     -        |   Número de lote asociado al stock     


**Entidad**: Transportista

Semántica: Entidad que representa a los empleados de la empresa San Fernando que se encargan de realizar los traslados de mercancía.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| codigo_transportista | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del transportista dentro de la organización. |
| codifo_Fecha_última_actividad | CHAR | 999999999 | 9 digitos | - | - | Identificador unico de la fecha en la que el transportista realizó su última actividad. |
| codigo_Empleado| CHAR | 99999999 | 9 digitos | - | - | Identificador unico del empleado en la organización | 
| Estado | CHAR | X(32) | "Activo", "Inactivo" | - | - | Indica si el transportista se encuentra activo o inactivo en este momento. |
| codigo_licencia | CHAR | 9999999999 | 9 digitos | - | - | codigo de la licencia de conducir del transportista. |
| Tipo de licencia | CHAR | X(32) | "Categoría A", "Categoría B", "Categoría C", etc. | - | - | Tipo de licencia de conducir que posee el transportista. |
| codigo_Traslado | CHAR | 9999999999 | 9 digitos | - | - | Identificador unico de traslado que ha realizado el transportista. |

**Entidad**: Traslado

Semántica: Entidad que representa los movimientos de mercancía realizados tanto dentro de la empresa San Fernando.

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| codigo_traslado | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del traslado realizado. |
| codigo_empleado | CHAR | 9999999999 | 9 digitos | - | - | Identificador único del empleado |
| codigo_transportista | CHAR | 99999999 | 9 digitos | - | Identificador unico del transportista |
| codigo_Fecha_inicio | CHAR | 99999999 | 9 digitos | - | - | Identificador unico de la Fecha en la que se inició el traslado. |
| codigo_Fecha_final | CHAR | 99999999 | 9 digitos | - | - | Identificador unico de la Fecha en la que se finalzo el traslado. |
| codigo_incidencias | CHAR | 999999999 | 9 digitos | - | - | Identificador unico de las incidencias |
| codigo_vehiculo | CHAR | 99999999999 | 9 digitos | - | - | Identificador unico del vehiculo de transporte|
| codigo_ruta | CHAR | 99999999999 | 9 digitos | - | - | Identificador unico de la ruta asignada | 
| codigo_operacion | CHAR | 9999999999 |  9 digitos | - | - | Identificador unico de la operacion asociada al traslado| 
| codigo_pedido | CHAR | 99999999999 | 9 digitos | - | - | Identificador unico del pedido asociado al traslado |

**Entidad**: Ubicación

Semántica: Latitud y Longitud de un lugar geográfico

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |
|----------|------------|---------|-----------------|--------|-------------|-------------|
| Cod_ubicacion   | CHAR       | 999999999   | Alfanumérico                  | ---                  | ---         | Identificador de la ubicación                                              |
| Longitud        | FLOAT      | 999.999999  | Positivos y negativos         | ---                  | ---         | Ubicación de un punto respecto al meridiano de Greenwich                   |
| Latitud         | FLOAT      | 999.999999  | Positivos y negativos         | ---                  | ---         | Ubicación de un punto del globo respecto a la línea imaginaria del ecuador |

**Entidad:** Vehículo

Semántica: 

| ATRIBUTO         | NATURALEZA | FORMATO   | VALORES VÁLIDOS  | UNIDAD | DERIVADA DE | DESCRIPCIÓN                                 |
| ---------------- | ---------- | --------- | ---------------- | ------ | ----------- | ------------------------------------------- |
| Cod_vehículo     | CHAR       | 999999999 | 9 dígitos        | --     | --          | Identificador del vehículo en el sistema.   |
| Placa            | CHAR       | XXX999    | Alfanumérico     | --     | --          | Número de placa del vehículo.               |
| Estado           | CHAR       | X(32)     | Activo, Inactivo | --     | --          | Estado actual del vehículo.                 |
| Anio_fabricacion | INTEGER    | 9999      | Año válido       | --     | --          | Año en que fue fabricado el vehículo.       |
| Capacidad_carga  | FLOAT      | 999.99    | x>0              | --     | --          | Capacidad máxima de carga del vehículo.     |
| Modelo           | CHAR       | X(64)     | NO NULO          | --     | --          | Modelo del vehículo.                        |
| Cod_fecha        | CHAR       | 999999999 | 9 dígitos        | --     | --          | Identificador de la entidad fecha asociada. |

## Entrevista
A continuación, se muestra la grabación de la entrevista realizada a la ingeniera Joselin Alexandra Torres Robles, supervisora del área de almacén de la planta Huaral de San Fernando.

[![Entrevista](../entregables%20parciales/entregable%202/imagenes/video_preview.png)](http://www.youtube.com/watch?v=DPxvZC3R6Ws "Entrevista a Joselin Torres")

## Videos individuales
A continuación, se muestra los links de los videos invididuales de cada módulo realizados por los integrantes.

### Módulo 1
Integrante: [Inocente Caro Miguel Anderson](../../01.%20integrantes/Miguel%20Inocente/Miguel-Inocente.md)

<a href="http://www.youtube.com/watch?feature=player_embedded&v=fToWdVgMKb4
" target="_blank"><img src="http://img.youtube.com/vi/fToWdVgMKb4/0.jpg" 
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>

### Módulo 2
Integrante: [Campos Herrera Dennis](../../01.%20integrantes/Dennis%20Campos%20/Dennis%20Campos.md)

<a href="http://www.youtube.com/watch?feature=player_embedded&v=QgKg1K2R5Wc" target="_blank"><img src="http://img.youtube.com/vi/QgKg1K2R5Wc/0.jpg" 
alt="Hola k ase" width="240" height="180" border="10" /></a>

### Módulo 3
Integrante: [Alvarado Usucachi José Joaquín](../../01.%20integrantes/Joaquín%20Alvarado/Joaquín%20Alvarado.md)

(Link 1)

### Módulo 4
Integrante: [Espinoza Cerna Alex](../../01.%20integrantes/Alex%20Espinoza/alex.md)

<a href="http://www.youtube.com/watch?feature=player_embedded&v=6ixwsKJIGqA" target="_blank"><img src="http://img.youtube.com/vi/6ixwsKJIGqA/0.jpg" 
alt="san fernando control" width="240" height="180" border="10" /></a>


### Módulo 5
Integrante: [Cruz Mamani Cristhian Samir](../../01.%20integrantes/Cristhian%20Cruz/Cristhian%20Cruz.md)

(Link 1)

### Módulo 6
Integrante: [Cárdenas Palacios Leonardo Gustavo](../../01.%20integrantes/Leonardo%20Cárdenas/Leonardo%20Cárdenas.md)

<a href="http://www.youtube.com/watch?feature=player_embedded&v=3Sji5_U5_JA" target="_blank"><img src="http://img.youtube.com/vi/3Sji5_U5_JA/0.jpg" alt="Awa de uwu" width="240" height="180" border="10" /></a>

Los detalles de la reunión fueron registrados en la [acta](../entregables%20parciales/entregable%202/acta-entrevista-20240401.md) respectiva, así como también se elaboró una [transcripción](../entregables%20parciales/entregable%202/transcripcion-entrevista-20240401.md) de las preguntas y respuestas realizadas durante la entrevista, además se generó un [resumen](../entregables%20parciales/entregable%202/Resumen-transcripcion.md) donde se sintetiza los procesos más importantes con un cierto orden, con el fin de comprender mejor los procesos de San Fernando.

## Avance de Diagramas Entidad-Relación
Se tomó como referencia el siguiente gráfico que identifica la relación de algunas variables de la empresa San Fernando:
![guía](../entregables%20parciales/entregable%203/imagenes/diagramas/mr.jpeg)

Finalmente adjuntamos un link donde se ven los diagramas de cada una de las variables registradas hasta el momento:
https://app.diagrams.net/#Wb!B6iW_HyZ9Uu006YT7wrOYtAgE85DSMBNgtvqP4jjpusfjQlxbKwHQbw161ArWf7P%2F01ZOJ7WU2RUCTY52DUKFEJ4FQ5DCEEUOK2#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D

[Regresar al índice](../../README.md)
