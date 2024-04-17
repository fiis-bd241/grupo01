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

| Secuencia | Actividad                                          | Descripción         | Responsable  |
| --------- | -------------------------------------------------- | ------------------- | ------------ |
| 1         |  Evaluacion de actividades |  Se evalúa las necesidades de cada área interna para seguir con la operatividad de los procesos | Supervisor
| 2         |  Elaboracion de requerimientos                         | Se crea una solicitud formal de las necesidades del área para la carga en el sistema SAP | Almacenero
| 3         |  Cargar requerimientos al WMS | Subida de requerimientos mediante el programa SAP con el requerimiento MRP | Asistente de almacén |
| 4         |  Recepcion de solicitud de requerimientos | El almacen se encarga de recibir y verificar las solicitudes del software SAP| Tecnico de almacén |
| 5         |  Segmentación de requerimientos | Posteriormente, se hace segmentación de estos pedidos, específicamente en 3 segmentaciones: la primera  segmentación es todo lo que necesita la planta y que son nocivos, como detergentes industriales, químicos; la segunda corresponde a suministros, repuestos; y el tercero corresponde a insumos, etiquetas, bolsas, galleta molida, sacos, cajas de cartón, etc. | Gestor de compras |
| 6         |  Requerimiento de Transporte | De acuerdo a la segmentación previa se solicita un transporte adecuado al área correspondiente  para una adecuada inocuidad y evitar cualquier peligro. | Técnico de logística |
| 7         |  Evaluación de requerimiento | Cada producto puede requerir medios de transporte especifico | Asistente Operativo |
| 8         | Asignacion de vehiculo y conductor | El vehículo debe tener las características adecuadas para el trasnporte del pedido y el conductor para estar apto para el trabajo no debe estar en cuarentena | Transportista |
| 9         | Elaboracion de guía de remision electronica | Se documenta el horario de entrega, placa del vehículo, tip de vehículo, datos del conductor, capacidad de carga, peso, etc. para mandar por correo a la planta solicitante para que puedan verificar el transporte cuando lo recepcionen | Encargado de Almacén |
| 10        | Picking, precintado y carga de productos | Recogida de los productos del pedido, un precintado por cuestión de seguridad que tiene un número y carga de los productos al transporte | Almacenero |
| 11        | Verificación de recibimiento | Subida al sistema de elementos de comprobación de la conformidad de la entrega |Transportista y Encargado de Almacén |

| Secuencia | Actividad                                          | Descripción         | Responsable  |
| --------- | -------------------------------------------------- | ------------------- | ------------ |
| 1         | Requerimiento de compra   | En el sistema se detalla las cantidades, especificaciones y fechas de entrega requeridas para asegurar el cumplimiento eficiente del pedido del cliente. | Encargado de Planeación |
| 2         | Distribución de Requerimientos  |  Descarga de todas las solicitudes de pedido de los clientes, para poder distribuirlo de forma adecuada basándose en la especialización de cada planta de San Fernando. | Encargado de Almacén |
| 3         | Requerimiento de Transporte   |  Solicitud de la presencia del área de transporte que se encarga de elegir al conductor, vehiculo y todo lo relacionado | Encargado de Almacén|
| 4         | Evaluación de requerimiento   |  Cada pedido del cliente se evalúa meticulosamente. Dado que estos pedidos suelen ser mixtos, se requiere la selección de productos de varias plantas, así como la asignación de un vehículo adecuado para garantizar la entrega segura y eficiente de los productos solicitados. | Asistente Operativo |
| 5         | Asignación de vehículo y conductor | El conductor y vehculo seleccionado debe pasar por un proceso de cuarentena, que garantice que puedan cumplir sus labores de manera adecudada, además de que este procedmiento forma parte de las politicas de la empresa. | Transportista |
| 6         | Picking, precintado y carga de productos   | Toda esta información migra al  área de gestión documentaria y despacho,  que crean las guías de remisión que son electrónicas a la vez que crea las respectivas facturas electrónicas asignadas para cada cliente, también incluye el proceso de precintado, picking y carga de productos. | Almacenero |
| 7         | Verificación de entrega   |  El proceso de verificación de la entrega del pedido se realiza a través del sistema SAP. En caso de incidentes, San Fernando se comunica directamente con el cliente para validar el reclamo mediante el departamento de calidad. Si el reclamo es procedente, se reemplaza el producto en un plazo máximo de 24 horas desde su registro. | Transportista y Encargado de Almacén |

### 3. Diagrama del proceso de negocio

a. Diagrama AS-IS

![Diagrama sin título drawio](../entregables%20parciales/entregable%203/imagenes/diagramas/proceso.png)

Proceso de negocio: Elaboración de despacho. Elaboración propia.

Link del diagrama: https://app.diagrams.net/?src=about#G1dXQysSmCzSni56V_scq2cCQqn8lhpNzT#%7B%22pageId%22%3A%22prtHgNgQTEPvFCAcTncT%22%7D

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

- Proporcionar confirmación inmediata al usuario después de realizar el pedido, y permitirle hacer seguimiento del estado de su pedido, incluyendo la preparación, envío y entrega, mediante actualizaciones en tiempo real dentro del sistema. 
- Utilizar tecnología GPS para proporcionar un seguimiento en tiempo real de la ubicación del pedido mientras se encuentra en tránsito, permitiendo a los usuarios visualizar la ubicación exacta del transporte en un mapa interactivo. 
- Registrar automáticamente las horas de salida y llegada del transporte en relación con el pedido 
- Almacenar y gestionar datos importantes del transportista, como información de contacto, detalles del vehículo de transporte, licencias y certificaciones relevantes, para garantizar la seguridad y la trazabilidad del proceso de entrega. 
- Enviar notificaciones y alertas automáticas a los usuarios pertinentes sobre eventos importantes relacionados con los pedidos, como cambios en el estado del pedido, retrasos en la entrega, o problemas con la disponibilidad de productos, para facilitar una respuesta rápida y eficiente. 

Interacción con otros módulos: 

- Requiere del módulo de pedidos el identificador del pedido para realizar el seguimiento. 
- Brinda al módulo de Control la información necesaria sobre el estado del pedido para realizar las verificaciones respectivas. 


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
- Permitir la identificación y gestión proactiva de incidencias durante la entrega, como retrasos en el transporte, cambios en la ruta planificada, o problemas imprevistos que puedan afectar la entrega puntual, y proporcionar comunicación transparente al cliente sobre cualquier cambio en el plan de entrega.
- Registrar un historial completo de las entregas realizadas, con detalles como fecha y hora de entrega, y observaciones relevantes, además de un registro de los reportes de desempeño para evaluar la eficiencia y calidad del servicio de entrega. 

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


## Requerimientos

### 1. Requerimientos del módulo de Pedidos

2.1. Requerimientos funcionales

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

2.2. Requerimientos de atributos de calidad.

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

2.3. Requerimientos de restricciones.

1. Base de datos:
- El sistema de pedidos se implementará utilizando el sistema de gestión de base de datos PostgreSQL.

2. Tecnologías de backend:
- El backend del sistema se desarrollará utilizando el lenguaje de programación Java.
- Se empleará el framework Angular, Node y Express para el desarrollo del backend.

3. Tecnologías de frontend:
- El frontend del sistema se desarrollará utilizando HTML, CSS, JavaScript y Bootstrap.

### 2. Requerimientos del módulo de Seguimiento

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
|Actor Secundario|-|
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
|Actor Secundario||
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
|Actor Secundario||
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


### 5. Requerimientos del módulo de Reportes

### 6. Requerimientos del módulo de Reclamos

### Prototipos
### Módulo 1: Pedidos

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/069a79c8-4a00-48db-8e46-652a0ab06f8d"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/821d9171-5559-4bca-a751-5f86b46dca10"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/49dfc0e5-710d-490c-b201-58bd785044da"></p>

<p align="center" width="90%"><img width="90%" src=""></p>

[Prototipo en Figma](https://www.figma.com/file/KQ34ScwxvuSCmmvHqfIPRP/Untitled?type=design&node-id=88-59745&mode=design&t=03oJT67oaRqSUxFI-0)


### Módulo 2: Seguimiento

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/seguimiento-1.jpeg"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/seguimiento-2.jpeg"></p>

<p align="center" width="90%"><img width="90%" src="../entregables%20parciales/entregable%203/imagenes/prototipo/seguimiento-3.jpeg"></p>

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

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/6aef7713-0319-46e1-b543-0c244cbaddf1"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/77bf2785-e6ea-47e2-a090-749c42d3b934"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/fda9824a-c546-4d64-96c2-5584c177c168"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/d604cddb-4f37-4e7b-b77b-dcc19b403b89"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/8a8cae18-726b-44be-b6c7-4667eecac03f"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/161625149/cd480806-9a03-4282-b8af-d0d6d471ce65"></p>

### Módulo 6: Reclamos

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/6a54fabb-9fa0-49ae-951d-8ae66687e68b"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/a9f229d4-b4c1-42b0-ae0b-fca8a0976e45"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/09f6360d-4671-4515-8a6e-b9b5a13bbf7d"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/90edd206-2f40-4b35-8226-604e00e682ca"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/eeea2e9b-1559-470b-92ac-245324178beb"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/7270a60b-abf0-4b84-8c93-bf903aae1235"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/07287c54-cdc5-421b-8b3f-c06f2947fb90"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/9beb1d0a-569b-400d-9db0-f4f34059f099"></p>

[Prototipo en Figma](https://www.figma.com/file/kZLR8sf4PPRQyQf9dsDxDp/PROTOTIPO-DE-RECLAMOS?type=design&node-id=0-1&mode=design&t=7KtYyZiyPe04xOE2-0)

## Modelo Conceptual

(Imagen representativa)

[Modelo Cheng en Draw.io](https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B"pageId"%3A"R2lEEEUBdFMjLlhIrx00"%7D)

## Entrevista
A continuación, se muestra la grabación de la entrevista realizada a la ingeniera Joselin Alexandra Torres Robles, supervisora del área de almacén de la planta Huaral de San Fernando.

[![Entrevista](../entregables%20parciales/entregable%202/imagenes/video_preview.png)](http://www.youtube.com/watch?v=DPxvZC3R6Ws "Entrevista a Joselin Torres")

Los detalles de la reunión fueron registrados en la [acta](../entregables%202parciales/entregable%2022/acta-entrevista-20240401.md) respectiva, así como también se elaboró una [transcripción](../entregables%202parciales/entregable%2022/transcripcion-entrevista-20240401.md) de las preguntas y respuestas realizadas durante la entrevista, además se generó un [resumen](../entregables%202parciales/entregable%2022/Resumen-transcripcion.md) donde se sintetiza los procesos más importantes con un cierto orden, con el fin de comprender mejor los procesos de San Fernando.

## Avance de Diagramas Entidad-Relación
Se tomó como referencia el siguiente gráfico que identifica la relación de algunas variables de la empresa San Fernando:
![guía](../entregables%20parciales/entregable%203/imagenes/diagramas/mr.jpeg)


La siguiente imagen nos muestra un fragmento de los diagramas Entidad-Relación:
![Entidad Relacion](../entregables%20parciales/entregable%203/imagenes/diagramas/mer.png)

Finalmente adjuntamos un link donde se ven los diagramas de cada una de las variables registradas hasta el momento:
https://app.diagrams.net/#Wb!B6iW_HyZ9Uu006YT7wrOYtAgE85DSMBNgtvqP4jjpusfjQlxbKwHQbw161ArWf7P%2F01ZOJ7WU2RUCTY52DUKFEJ4FQ5DCEEUOK2#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D



[Regresar al índice](../../../README.md)
