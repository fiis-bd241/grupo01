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

Link del diagrama: https://app.diagrams.net/?src=about#G1dXQysSmCzSni56V_scq2cCQqn8lhpNzT#%7B%22pageId%22%3A%22prtHgNgQTEPvFCAcTncT%22%7D

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

- Registrar los ingresos y salidas del almacén de la planta Huaral, con información de los productos y las cantidades respectivas, empleado que registró el movimiento de inventario, así como la fecha y hora del movimiento. 
- Permitir tener un registro de la ubicación de los productos. 
- Registrar la información referente al picking, precintado y carga de productos. 
- Mantener un control de los productos próximos a caducar y de existencias bajas. 
- Confirmación inmediata de pedidos y seguimiento del estado dentro del almacén. 
- *Slotting* o colocación de la mercancía y reorganización. 

Interacción con otros módulos: 

- Realizar un pedido a almacén (módulo de Pedido) en caso de existencias bajas. 
- Brindar la información necesaria al módulo de Reporte para generar un reporte de los productos existentes en almacén. 


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

Diagrama de paquetes:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/7537e725-235a-413d-9370-229e327a56fc"></p>

## Requerimientos

### 1. Requerimientos del módulo de Pedidos

1.1. Requerimientos funcionales

a. Usuarios
- Administrador: Puede realizar todas las operaciones del módulo de pedidos.
- Usuario (Almacenista de cada departamento) de Planta Huaral: Puede registrar los pedidos al almacén general.

b. Casos de uso

Caso de Uso #1: Registrar Pedido
| Código | R001 | 
|----------|----------|
|Objetivo | Permitir a los almacenistas de cada departamento a registrar un nuevo pedido.|
|Descripción | El almacenista ingresa la información del cliente, como nombre, correo electrónico empresarial y personal, fecha de solicitud, fecha de entrega, DNI, departamento y justificación. |
|Actor Primario | Almacenista de cada departamento. |
|Actor Secundario | N/A |
|Precondiciones | El almacenista debe estar registrado en el sistema SAP | 
|Paso | Acción | 
|1 | El Almacenista selecciona la opción para registrar un nuevo pedido. |
|2 | El sistema muestra un formulario para que el almacenista ingrese los datos personales y datos del pedido. | 
|3 | El almacenista completa el formulario y selecciona la opción para agregar productos. |

Caso de Uso #2: Agregar productos al pedido. 
| Código | R002 | 
|----------|----------|
|Objetivo | Permitir al almacenista (usuario) agregar los productos solicitados al pedido.|
|Descripción | Después de ingresar la información del usuario (Almacenista) en el formulario de registro de pedido, el usuario puede agregar los productos solicitados a través de una tabla. | 
|Actor Primario | Almacenista departamental |
|Actor Secundario | N/A. |
|Precondiciones | El usuario debe haber completado el formulario de registro de pedido. |
|Paso | Acción |
|1 | Después de ingresar los datos del usuario y pedido, el usuario selecciona la opción para agregar productos.|
|2 | El sistema muestra una tabla vacía para que el usuario ingrese los detalles de los productos solicitados, como código, nombre, descripción, cantidad, unidad de medida y precio unitario. |
|3 | El usuario ingresa la información de los productos. |
|4 | El usuario revisa la información de los productos ingresados y selecciona la opción para confirmar el pedido. |
|5 | El sistema asigna un número de pedido único al nuevo pedido. |
|6 | El sistema guarda la información del pedido, incluyendo los productos solicitados, y actualiza el estado a "pendiente". |

Caso de Uso #3: Ver detalle pedido. 
| Código | R003 | 
|----------|----------|
|Objetivo | | 	Permitir a los almacenistas de cada departamento (usuarios) consultar los detalles de un pedido específico. |
|Descripción | Despúes de completar todos los productos solicitados y el sistema muestra la información detallada, incluyendo los datos del usuario, los productos solicitados y sus detalles. |
|Actor Primario | Almacenista de cada departamento. |
|Actor Secundario | N/A. |
|Precondiciones | El usuario debio completar la tabla de los productos solicitados. |
|Paso | Acción |
|1 | Después de agregar los productos al pedido, el usuario selecciona la opción para ver el detalle del pedido. |
|2 | El sistema muestra la información detallada del pedido, incluyendo los datos del usario, los productos solicitados y sus detalles (código de producto, unidad de medida, descripción, precio unitario), la fecha de solicitud, la fecha de entrega, el estado del pedido, el tiempo transcurridos (días) del pedido y cualquier otra información relevante.
|3 | El usuario puede confirmar o cancelar el pedido. |

Caso de Uso #4: Ver lista de pedidos.
| Código | R004 | 
|----------|----------|
|Objetivo | | Permitir a los almacenista (usuarios) consultar la lista de todos los pedidos registrados.
|Descripción | El usuario puede filtrar y ordenar la lista de pedidos según diferentes criterios, como número de pedido, departamento, fecha de solicitud y estado del pedido. |
|Actor Primario | Almacenista de cada departamento. |
|Actor Secundario | N/A. |
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
|Actor Secundario | N/A. |
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
|1 | El supervisor entra a la pantalla de Pedidos en Progreso y escribe el código del traslado actual en la barra respectiva. |
|2 | El supervisor da click en “Registrar entrega” y selecciona el pedido de dicho traslado que cambiará de estatus. | 
|3 | El sistema guarda los cambios y se ven reflejados en las otras pantallas. |

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

Caso de Uso #1: Registrar ingreso de productos
| Código | R001 | 
|----------|----------|
|Objetivo | Registrar los productos que ingresan al almacén|
|Descripción | El usuario registra los datos del producto, como código, descripción, cantidad, fecha de ingreso, ubicación en el almacén, etc.|
|Actor Primario | Almacenero|
|Actor Secundario|N/A.|
|Precondiciones|Productos disponibles para ser recibidos en almacén|
|Paso|Acción|
|1|El usuario selecciona la opción "Registrar ingreso de productos"|
|2|Ingresa la información del producto: código, descripción, cantidad, fecha de ingreso, ubicación en el almacén, etc.|
|3|Verifica los datos y confirma el registro|
|4|El sistema actualiza el inventario con el nuevo ingreso|

Caso de Uso #2: Consultar disponibilidad de productos
| Código | R002 | 
|----------|----------|
|Objetivo|Verificar la cantidad disponible de un producto específico en el almacén|
|Descripción|El usuario busca un producto por código o descripción y puede ver la cantidad disponible en existencias|
|Actor Primario|Técnico de Almacén|
|Actor Secundario|Asistente Operativo|
|Precondiciones|Productos registrados en el sistema|
|Paso|Acción|	
|1|El usuario selecciona la opción "Consultar disponibilidad de productos"|
|2|Ingresa el código o descripción del producto a buscar|
|3|El sistema muestra la información del producto, incluyendo la cantidad disponible en existencias|
|4|El usuario puede imprimir o descargar el reporte de disponibilidad|

Caso de Uso #3: Realizar picking de pedidos
| Código | R003 | 
|----------|----------|
|Objetivo|Seleccionar y retirar los productos del almacén para atender un pedido|
|Descripción|El usuario verifica el pedido pendiente, ubica los productos en el almacén, retira las cantidades solicitadas y prepara el pedido para despacho|
|Actor Primario|Almacenero|
|Actor Secundario|Encargado de Almacén|
|Precondiciones|Pedidos pendientes de atención|
|Paso|Acción|
|1|El usuario selecciona la opción "Realizar picking de pedidos"|
|2|Visualiza los pedidos pendientes de atención|
|3|Selecciona el pedido a procesar|
|4|Ubica en el almacén los productos solicitados y retira las cantidades indicadas|
|5|Registra el picking realizado en el sistema|
|6|Prepara el pedido para despacho|

Caso de Uso #4: Registrar salida de productos
| Código | R004 | 
|----------|----------|
|Objetivo|Registrar la salida de productos del almacén al momento del despacho|
|Descripción|El usuario registra los datos del producto, cantidad, destino, fecha de salida y el personal a cargo de la entrega|
|Actor Primario|Almacenero|
|Actor Secundario|Encargado de Almacén|
|Precondiciones|Productos preparados para despacho|
|Paso|Acción|	
|1|El usuario selecciona la opción "Registrar salida de productos"|
|2|Ingresa los datos del producto, como código, descripción, cantidad, fecha de salida y destino|
|3|Selecciona el personal a cargo de la entrega|
|4|Verifica la información y confirma el registro|
|5|El sistema actualiza el inventario con la salida del producto|

Caso de Uso #5: Generar reporte de inventario
| Código | R005 | 
|----------|----------|
|Objetivo|Obtener un reporte detallado del estado actual del inventario en el almacén|
|Descripción|El usuario genera un reporte que muestra la cantidad, ubicación y demás información de los productos en el almacén|
|Actor Primario|Supervisor de Almacén|
|Actor Secundario|Asistente Operativo|
|Precondiciones|Productos registrados en el sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Generar reporte de inventario"|
|2|Selecciona los filtros y opciones de visualización deseados|
|3|El sistema genera el reporte detallado del inventario actual|
|4|El usuario puede visualizar, imprimir o descargar el reporte|

Caso de Uso #6: Registrar productos próximos a vencer
| Código | R006 | 
|----------|----------|
|Objetivo|Identificar y registrar los productos con fechas de vencimiento cercanas|
|Descripción|El usuario revisa las fechas de vencimiento de los productos y registra aquellos que están próximos a caducar para su seguimiento|
|Actor Primario|Técnico de Almacén|
|Actor Secundario|Encargado de Almacén|
|Precondiciones|Productos con fecha de vencimiento registrados en el sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Registrar productos próximos a vencer"|
|2|Revisa las fechas de vencimiento de los productos en el sistema|
|3|Selecciona los productos que están próximos a caducar y registra la información|
|4|El sistema guarda el registro de los productos próximos a vencer para su seguimiento|

Caso de Uso #7: Realizar reubicación de productos
| Código | R007 | 
|----------|----------|
|Objetivo|Modificar la ubicación de los productos en el almacén
|Descripción|El usuario cambia la ubicación de los productos en el sistema, ya sea por optimización de espacios, reorganización o nuevos ingresos
|Actor Primario|Asistente Operativo
|Actor Secundario|Encargado de Almacén
|Precondiciones|Productos registrados en el sistema|
|Paso|Acción|	
|1|El usuario selecciona la opción "Realizar reubicación de productos"|
|2|Busca el producto que requiere ser reubicado|
|3|Ingresa la nueva ubicación del producto en el almacén|
|4|Verifica la información y confirma la reubicación|
|5|El sistema actualiza la ubicación del producto en el inventario|

Para explicar de manera más sencilla la relación entre estos casos de uso y el modelado conceptual, se presenta a continuación un ejemplo de poblamiento de datos de las entidades ProductoStock, Mercancía y Operación

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

#### 3.2. Requerimientos de atributos de calidad

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
| Código | R001 | 
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
| Código | R001 | 
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
| Código | R001 | 
|----------|----------|
|Objetivo |Asignarle el traslado de un determinado pedido|
|Descripción | El usuario verifica en base a los datos del conductor como nombre completo, id conductor,fecha de contratación, número de licencia, fecha de vencimiento de licencia, fecha y hora de última actividad, para registrar su disponibilidad y poder asignarle un pedido. |
|Actor Primario | Transportista|
|Actor Secundario|N/A. |
|Precondiciones|Registro de conductores en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Transporte" y luego le da a segunda opción "Conductor"|
|2|Verifica los atributos específicos del conductor como: nombre completo, id conductor,fecha de contratación, numero de licencia, fecha de vencimiento de licencia, fecha y hora de última actividad |
|3|Registra su disponibilidad|
|4|Verifica los datos y confirma el registro|
|5|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #4: Registro de disponibilidad de vehículos
| Código | R001 | 
|----------|----------|
|Objetivo |Asignar a un conductor como medio de traslado del pedido|
|Descripción | El usuario verifica en base a los datos del vehículo como número de placa, modelo,año de fabricación, capacidad de carga, fecha de último mantenimiento, fecha y hora de última de actividad, para registrar su disponibilidad y poder asignarle como medio de traslado de un pedido. |
|Actor Primario | Transportista|
|Actor Secundario|N/A. |
|Precondiciones|Registro de vehículos en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Transporte" y le da a segunda opción "Vehículo"|
|2|Verifica los atributos específicos del vehículo como: número de placa, modelo,año de fabricación, capacidad de carga, fecha de último mantenimiento, fecha y hora de última de actividad |
|3|Registra su disponibilidad |
|4|Verifica los datos y confirma el registro|
|5|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #5: Registro de incidencias internas
| Código | R001 | 
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

#### 3.2. Requerimientos de atributos de calidad

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


#### 3.3. Restricciones
- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.


### 5. Requerimientos del módulo de Reportes

### 6. Requerimientos del módulo de Reclamos

#### 6.1. Requerimientos funcionales

a. Usuarios

- Encargado de Atención a Reclamos

b. Casos de uso

Caso de Uso #1: Crear un reclamo de un cliente interno
| Código | R001 | 
|----------|----------|
|Objetivo | |
|Descripción | |
|Actor Primario | Encargado de Atención a Reclamos|
|Actor Secundario| N/A. |
|Precondiciones||
|Paso||
|1||
|2||
|3||
|4||

Caso de Uso #2: Crear un reclamo de un cliente externo
| Código | R002 | 
|----------|----------|
|Objetivo | |
|Descripción | |
|Actor Primario | Encargado de Atención a Reclamos|
|Actor Secundario| N/A. |
|Precondiciones||
|Paso||
|1||
|2||
|3||
|4||

Caso de Uso #3: Visualizar un reclamo
| Código | R003 | 
|----------|----------|
|Objetivo | |
|Descripción | |
|Actor Primario | Encargado de Atención a Reclamos|
|Actor Secundario| N/A. |
|Precondiciones||
|Paso||
|1||
|2||
|3||
|4||

#### 3.2. Requerimientos de atributos de calidad

#### 3.3. Restricciones
- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.

### Prototipos
### Módulo 1: Pedidos

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/069a79c8-4a00-48db-8e46-652a0ab06f8d"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/821d9171-5559-4bca-a751-5f86b46dca10"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/49dfc0e5-710d-490c-b201-58bd785044da"></p>

<p align="center" width="90%"><img width="90%" src=""></p>

[Prototipo en Figma](https://www.figma.com/file/KQ34ScwxvuSCmmvHqfIPRP/Untitled?type=design&node-id=88-59745&mode=design&t=03oJT67oaRqSUxFI-0)


### Módulo 2: Seguimiento

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/0dc9d667-3f1c-4c7c-a8d0-3d78e583d0ef"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/f00dc926-ce6e-4098-8100-607abf265f7f"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/95ef1cc0-4498-4372-aec9-654c03fb9d91"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/d04fc44c-ef3b-4682-9c31-7912a648c48e"></p>

[Prototipo en Figma](https://www.figma.com/file/Jfo2z2Mh3c5yoxamTw56gg/Seguimiento?type=design&node-id=0%3A1&mode=design&t=wmoz54XJ5USPhnU3-1)

### Módulo 3: Almacén

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-1.png"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-2.png"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-3.png"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-4.png"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-5.png"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-6.png"></p>

[Prototipo en Figma](https://www.figma.com/file/nnoiQDwJ9WstLLZmVisdpw/Untitled?type=design&node-id=0-1&mode=design&t=ztZFDIkEuNp6ykcn-0)

### Módulo 4: Control

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/651613ad-ddf6-4944-a55e-7d3b2e321051"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/5ccfc679-16d9-425b-9d93-3a7b09ef6e9f"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/1df37adb-5e43-4da9-85e0-4fa9fc754d71"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/b07618fc-3915-401b-a3aa-ee89c369919c"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/dc5589dd-1e80-4d45-9f79-6bf5eff4d08e"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/960ce6b6-906f-4389-b970-b19b511758b6"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164266999/c8c21cc8-f7f0-4374-8828-8d11ea403bad"></p>

### Módulo 5: Reportes

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/8682aa22-fa65-428b-80bf-8d341253fc94"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/428b2d2a-c75c-4e8b-910f-3a05e69d70d8"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/c7097a19-584b-4e04-92d3-8cb68bfa554d"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/0510fdec-f74a-4469-9e40-17ec3e5a9298"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/d3c699b6-9060-4e1f-8568-da774d10eba3"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/950b5a85-51c9-4749-a29b-2275f6bb717d"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/169df0b4-d650-4b10-baea-58c37ca83029"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/c4e68d67-1cb2-4645-9668-9678fb2e0e8f"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/4349f40c-fb58-4bda-ab29-63954880c1ec"></p>

### Módulo 6: Reclamos

#### Pantalla Principal

![PROTOTIPO 1](https://github.com/fiis-bd241/grupo01/assets/130238034/2c747c51-3884-4ed8-b26a-6b3ad7328d83)

![PROTOTIPO 2](https://github.com/fiis-bd241/grupo01/assets/130238034/593c1895-b88c-4b27-a2fc-7f1e01f1ae56)

#### Pantallas de Crear Reclamo de Cliente Interno

![PROTOTIPO 3](https://github.com/fiis-bd241/grupo01/assets/130238034/c2f43051-d0bb-4d39-a5b0-2b953c7f9c16)

![PROTOTIPO 4](https://github.com/fiis-bd241/grupo01/assets/130238034/9fef7f12-466e-4a03-b6ea-c769ab700640)

![PROTOTIPO 5](https://github.com/fiis-bd241/grupo01/assets/130238034/e03c0d7d-4e2c-44d2-8d9c-29ffef5bfddf)

![PROTOTIPO 6](https://github.com/fiis-bd241/grupo01/assets/130238034/7a6bd1f1-494e-43c2-8e9b-2491286c038b)

![PROTOTIPO 7](https://github.com/fiis-bd241/grupo01/assets/130238034/d21db883-c515-4f2e-800f-ba75c587a550)

![PROTOTIPO 8](https://github.com/fiis-bd241/grupo01/assets/130238034/6742ef99-e2d6-4106-bc2b-dee30bdafce7)

![PROTOTIPO 9](https://github.com/fiis-bd241/grupo01/assets/130238034/803d07a8-3d54-4980-9ebe-02d79d5ec990)

#### Pantallas de Crear Reclamo de Cliente Externo

![PROTOTIPO 11](https://github.com/fiis-bd241/grupo01/assets/130238034/d094316b-068c-459e-8f83-4960706eee6c)

![PROTOTIPO 12](https://github.com/fiis-bd241/grupo01/assets/130238034/819ad6fa-6454-4550-b615-7fc3c9f38109)

![PROTOTIPO 13](https://github.com/fiis-bd241/grupo01/assets/130238034/48d2bc5c-47f3-49e2-a820-00928274ed08)

![PROTOTIPO 14](https://github.com/fiis-bd241/grupo01/assets/130238034/2c66eb9b-a9bc-409b-8c4f-96496da8b049)

![PROTOTIPO 15](https://github.com/fiis-bd241/grupo01/assets/130238034/f17162cb-025c-43ec-bf51-c5ce79bc3133)

![PROTOTIPO 16](https://github.com/fiis-bd241/grupo01/assets/130238034/0dcb4921-0a5f-41b1-8ec2-2e619f9dfcd4)

![PROTOTIPO 10](https://github.com/fiis-bd241/grupo01/assets/130238034/d6af040b-be23-45fa-9cfe-e610481bec9e)

[Prototipo en Figma](https://www.figma.com/file/kZLR8sf4PPRQyQf9dsDxDp/PROTOTIPO-DE-RECLAMOS?type=design&node-id=0-1&mode=design&t=7KtYyZiyPe04xOE2-0)

## Modelo Conceptual

![Planta Huaral Diagrama Cheng](https://github.com/fiis-bd241/grupo01/assets/130238034/8e2f3f21-a01c-4662-9b16-83f309211b9c)

[Modelo Cheng en Draw.io](https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D)

### Diccionario de datos:

## Entrevista
A continuación, se muestra la grabación de la entrevista realizada a la ingeniera Joselin Alexandra Torres Robles, supervisora del área de almacén de la planta Huaral de San Fernando.

[![Entrevista](../entregables%20parciales/entregable%202/imagenes/video_preview.png)](http://www.youtube.com/watch?v=DPxvZC3R6Ws "Entrevista a Joselin Torres")

Los detalles de la reunión fueron registrados en la [acta](../entregables%20parciales/entregable%202/acta-entrevista-20240401.md) respectiva, así como también se elaboró una [transcripción](../entregables%20parciales/entregable%202/transcripcion-entrevista-20240401.md) de las preguntas y respuestas realizadas durante la entrevista, además se generó un [resumen](../entregables%20parciales/entregable%202/Resumen-transcripcion.md) donde se sintetiza los procesos más importantes con un cierto orden, con el fin de comprender mejor los procesos de San Fernando.

## Avance de Diagramas Entidad-Relación
Se tomó como referencia el siguiente gráfico que identifica la relación de algunas variables de la empresa San Fernando:
![guía](../entregables%20parciales/entregable%203/imagenes/diagramas/mr.jpeg)


La siguiente imagen nos muestra un fragmento de los diagramas Entidad-Relación:
![Entidad Relacion](../entregables%20parciales/entregable%203/imagenes/diagramas/mer.png)

Finalmente adjuntamos un link donde se ven los diagramas de cada una de las variables registradas hasta el momento:
https://app.diagrams.net/#Wb!B6iW_HyZ9Uu006YT7wrOYtAgE85DSMBNgtvqP4jjpusfjQlxbKwHQbw161ArWf7P%2F01ZOJ7WU2RUCTY52DUKFEJ4FQ5DCEEUOK2#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D



[Regresar al índice](../../../README.md)
