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

![Diagrama de flujo](https://github.com/fiis-bd241/grupo01/assets/130238034/2b98a310-210d-4c32-b5f9-8c5140f74d0f)

Proceso de negocio mejorado: Elaboración de despacho. Elaboración propia.

| Secuencia | Actividad                  | Descripción                                                                   | Responsable          | Entrada                           | Salida                               |
|-----------|----------------------------|-------------------------------------------------------------------------------|----------------------|-----------------------------------|--------------------------------------|
| 1         | Crear Pedido   | Ingresar detalles de un pedido, como productos, cantidades y cliente ya sea interno o externo para generar una solicitud de compra | Técnico de almacén           | Información como la lista de productos o insumos solicitados cantidades, detalles del cliente | Generación de un pedido completo, que puede incluir un número de pedido único, la lista de productos, precios, fechas de entrega, y cualquier otra información relacionada con el pedido |
| 2         | Seguimiento de Traslado    | Consulta de ubicación de los vehículos que transportan los pedidos             | Supervisor           | Código de pedido / Código de Traslado | Ubicación geográfica del pedido       |
| 3         | Reporte de incidencias    | Registro de problemas, describiendo el incidente, su impacto, responsable y estado actual.      | Encargado de almacén  | Evidencias de reclamos o problemas durante los procesos internos  | Creación de un registro de incidencias  |
| 4         | Reclamo   | El representante de un cliente adjunta evidencias a una queja respecto al pedido recibido | Cliente | Evidencias del reclamo / Motivo de queja | Inicio de proceso de seguimiento de la queja y derivación a una evaluación de calidad |
| 5         | Toma de decisiones         | Elección de ruta de acción en base a las evidencias mostradas y las condiciones del pedido | Encargado de Planeación | Evaluación de calidad / Evidencias de reclamo | Acción para realizar a partir del reclamo |


Link de los diagramas: [Diagramas](https://drive.google.com/file/d/1dXQysSmCzSni56V_scq2cCQqn8lhpNzT/view?usp=sharing)

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

![DIAGRAMA DE PAQUETES drawio (5)](https://github.com/fiis-bd241/grupo01/assets/121084712/e5882403-6ffb-4619-8b42-e2475458b200)

[Diagrama de paquetes](https://app.diagrams.net/#G1nwVLNkUNbD_joILjk6pRH49kTC3cYcXy#%7B%22pageId%22%3A%22c4acf3e9-155e-7222-9cf6-157b1a14988f%22%7D)

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
- Usuario Almacén General (Pedido cliente interno): Permisos de administrador, acceso a los documentos y vínculos adjuntos y registro de incidencias.
- Usuario Transportista: Actualizar el estatus del transporte, registrar incidencias y entregas solo de traslados realizados por ellos mismos.
- Supervisor de Transportista: Creación y asignación de rutas, vehículos y transportistas
b. Casos de uso

Caso de Uso #1: Ver Guía de Remisión
<a name="R201"></a>
| Código | R201 | 
|----------|----------|
|Objetivo | Permitir al usuario acceder a una versión pdf de la guía de remisión |
|Descripción | El encargado ingresa al módulo, accede a la sección de Traslados en Proceso, verifica los datos del traslado y da click al botón correspondiente. |
|Actor Primario | Transportista |
|Actor Secundario | N/A |
|Precondiciones | El transportista debe estar registrado en el sistema y haber validado su ingreso | 
|Paso | Acción | 
|1 | El usuario ingresa al módulo y accede a la sección de Traslados en Proceso |
|2 | El sistema muestra una serie de pedidos cuyo estatus se encuentra clasificado como “en proceso” | 
|3 | El usuario busca a través de la herramienta de búsqueda el código del traslado y selecciona el que corresponde con lo que busca. |
|4 | El sistema muestra toda la información detallada del proceso de traslado en cuestion. |
|5 | El encargado puede dar click en el botón de “Ver guía de Remisión” para acceder a una versión digital del documento que consigna los detalles del traslado. |

Caso de Uso #2: Registrar Datos de Traslado programado
<a name="R202"></a>
| Código | R202 | 
|----------|----------|
|Objetivo | Permitir al supervisor asignar los recursos y responsables necesarios para realizar un traslado. |
|Descripción | El supervisor toma un traslado programado y usa la interfaz para asignar la ruta, vehículo y transportista encargado de cada traslado. |
|Actor Primario | Supervisor del transportista |
|Actor Secundario | Encargado de almacén planta Huaral |
|Precondiciones | Usuario logeado con los permisos necesarios | 
|Paso | Acción | 
|1 | El supervisor ingresa a la sección Traslados Programados desde la pantalla de inicio. |
|2 | El supervisor asigna la ruta que se ajusta a los requerimientos de origen y destino seleccionando la herramienta de edición y usando la ventana emergente para elegir la ruta. | 
|3 | El supervisor asigna el vehículo que se ajusta a los requerimientos capacidad y disponibilidad seleccionando la herramienta de edición y usando la ventana emergente para elegir el vehículo. |
|4 | El supervisor asigna el transportista que se ajusta a los requerimientos de disponibilidad y licencia válida seleccionando la herramienta de edición y usando la ventana emergente para elegir el transportista. |
|5 | El usuario guarda los datos y genera el documento de tralsado a través del botón "Generar Guía de Remisión" |

Caso de Uso #3: Registrar la entrega de un pedido
<a name="R203"></a>
| Código | R203 | 
|----------|----------|
|Objetivo | Permitir al transportista cambiar el estatus de un pedido a "Entregado" |
|Descripción | El encargado ingresa al sistema y dentro se dirige al traslado que realiza, una vez ahí usa el boton de registro de entrega para seleccionar el pedido que está entregando. |
|Actor Primario | Transportista |
|Actor Secundario | Encargado de almacén planta Huaral, Supervisor de Transportista |
|Precondiciones | Usuario logeado que cuenta con el código de traslado y pedido | 
|Paso | Acción | 
|1 | El usuario entra a la pantalla de Traslados en proceso. |
|2 | El usuario ingresa los datos del Traslado en el buscador y selecciona el correspondiente. | 
|3 | El sistema muestra los datos correspondientes al traslado. |
|4 | El usuario accede al botón "registrar entrega" y el sistema muestra una ventana emergente con la información de todos los pedidos correspondientes a ese traslado. |
|5 | El usuario elige el pedido que se está entregando, el sistema actualiza el estatus de ese pedido y la base de datos. |

Caso de Uso #4: Generar nueva ruta
<a name="R204"></a>
| Código | R204 | 
|----------|----------|
|Objetivo | Permitir la generación de nuevas rutas para traslados |
|Descripción | El usuario ingresa al módulo, accede a la herramienta de creación de ruta, agrega los paraderos de la ruta y la guarda. |
|Actor Primario | Supervisor de Transportista |
|Actor Secundario | Encargado de almacén planta Huaral |
|Precondiciones | El usuario debe estar logeado y tener los permisos necesarios | 
|Paso | Acción | 
|1 | El usuario accede al módulo y da click al botón "Crear Ruta Nueva". |
|Caso alternativo| --- |
|1.1| El usuario entra a "Rutas disponibles" y el sistema le muestra las rutas existentes. |
|1.2| El usuario realiza una busqueda de la ruta que necesita, de no existir hace click en el boton "Crear Ruta Nueva".|
|Fin del caso alternativo| --- |
|2 | El sistema abre una ventana emergente con una tabla que registrará los paraderos de la nueva ruta. |
|3 | El usuario accede los paraderos que debe cubrir esa ruta uno por uno (mínimo 2) y da click en Registrar Ruta. | 
|4 | El sistema agrega el registro en la base de datos y actualiza la pantalla de rutas. |

Caso de Uso #5: Registrar nuevo Vehículo
<a name="R205"></a>
| Código | R205 | 
|----------|----------|
|Objetivo | Permitir el registro de nuevo vehículos |
|Descripción | El usuario ingresa al módulo, accede a la herramienta de Nuevo Vehículo, agrega los datos del vehículo y guarda la información. |
|Actor Primario | Supervisor de Transportista |
|Actor Secundario | Encargado de almacén planta Huaral |
|Precondiciones | El usuario debe estar logeado y tener los permisos necesarios | 
|Paso | Acción | 
|1 | El usuario accede al módulo y da click al botón "Nuevo Vehículo". |
|Caso alternativo| --- |
|1.1| El usuario entra a "Vehículos Disponibles" y el sistema le muestra los vehículos en existencia. |
|1.2| El usuario verifica la inexistencia del vehículo nuevo en los registros y da click en "Nuevo Vehículo".|
|Fin del caso alternativo| --- |
|2 | El sistema abre una ventana emergente con campos que registrarán los datos necesarios del nuevo vehículo. |
|3 | El usuario accede la información solicitdada y da click en Registrar Vehículo. | 
|4 | El sistema agrega el registro en la base de datos y actualiza la pantalla de vehículos. |

Caso de Uso #6: Registrar nuevo Transportista
<a name="R206"></a>
| Código | R206 | 
|----------|----------|
|Objetivo | Permitir el registro de nuevo Transportista |
|Descripción | El usuario ingresa al módulo, accede a la herramienta de Nuevo Transportista, agrega los datos del transportista y guarda. |
|Actor Primario | Supervisor de Transportista |
|Actor Secundario | Encargado de almacén planta Huaral |
|Precondiciones | El usuario debe estar logeado y tener los permisos necesarios | 
|Paso | Acción | 
|1 | El usuario accede al módulo y da click al botón "Nuevo Transportista". |
|Caso alternativo| --- |
|1.1| El usuario entra a "Transportistas" y el sistema le muestra los registros de todos los transportistas registrados. |
|1.2| El usuario verifica la inexistencia del nuevo Transportista en los registros y da click en "Nuevo Transportista".|
|Fin del caso alternativo| --- |
|2 | El sistema abre una ventana emergente con una campos de ingreso de datos para registrar toda la información necesaria del nuevo transportista. |
|3 | El usuario accede la información solicitdada y da click en Registrar Transportista. | 
|4 | El sistema agrega el registro en la base de datos y actualiza la pantalla de transportistas. |

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

Caso de Uso #1:  Registro de disponibilidad de conductores
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

Caso de Uso #2: Registro de disponibilidad de vehículos
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

Caso de Uso #3: Registro de incidencias internas  
| Código | R405 | 
|----------|----------|
|Objetivo |Gestionar a nivel interno los procesos de traslado de productos o insumos de San Fernando |
|Descripción | El usuario ingresa los datos del incidente como descripción detallada del incidente, fecha incidente, hora incidente, tipo de incidencia, además de tener la opción de adjuntar alguna foto para más detalle.|
|Actor Primario | Encargado de almacén|
|Actor Secundario|Almacenero y Transportista|
|Precondiciones|Comunicación con cada módulo sobre incidencias en sus procesos internos|
|Paso|Acción|
|1|El usuario selecciona la opción "Incidencia"|
|2|Ingresa la información del incidente: descripción detallada del incidente,fecha incidente,hora de incidente, tipo de incidencia,etc|
|3|Verifica los datos y confirma el registro|
|4|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #4: Empleo de procedimientos frente incidencias
| Código | R405 | 
|----------|----------|
|Objetivo |Aglizar el proceso de toma de decisiones y acciones frente a un incidente presentado |
|Descripción | El usuario adopta una serie de procedimientos registrados en sistema que le permite acceder a una serie de pasos con solo ingresar el código y el tipo de incidencia que se le ha presentado|
|Actor Primario | Encargado de almacén|
|Actor Secundario|Almacenero y Transportista|
|Precondiciones|Comunicación con cada módulo sobre incidencias en sus procesos internos|
|Paso|Acción|
|1|El usuario selecciona la opción "Procedimiento", incluido en la opción "Incidencia"|
|2|Ingresa el código y el tipo de incidente en base al registro anterior|
|3|Accede al procedimiento que incluye pasos con sus respectivos códigos|
|4| Verifica los datos y confirmar el registro |
|5|El sistema actualiza el registro con el nuevo ingreso|


#### 4.2. Requerimientos de atributos de calidad

1. Registro de disponibilidad de conductores:
- Actualización en Tiempo Real de la Disponibilidad de Conductores
- Asignación Equitativa y Eficiente de Conductores a Tareas y Rutas
- Seguimiento de Horarios de Trabajo y Descanso de Conductores
  
2. Registro de disponibilidad de vehículos:
- Mantenimiento Preventivo de la Flota de Vehículos
- Registro de Kilometraje y Estado de los Vehículos
- Disponibilidad de Vehículos adecuados para las Tareas y Rutas planificadas

3. Registro de incidencias internas:
- Reporte Inmediato y Preciso de Incidencias en Procesos Internos 
- Seguimiento de Acciones Correctivas y Preventivas para Resolver Incidencias
- Análisis de Causa Raíz de las Incidencias para evitar su recurrencia

4. Empleo de procedimiento frente a incidencias:
- Los procedimientos deben resolver la incidencia de manera satisfactoria y oportuna.
- Deben minimizar el uso de recursos, incluyendo tiempo y costos.
- Deben adherirse a las regulaciones internacionales, nacionales y políticas internas.
- Deben ser comprensibles para el personal, facilitando su implementación.
- Deben ajustarse a diferentes situaciones y necesidades.
- Deben documentar todas las acciones para su revisión y mejora.


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


#### Pantalla para solicitar los productos
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/821d9171-5559-4bca-a751-5f86b46dca10"></p>
Entidades:

-Pedido

-ElementoCatalogo

#### Pantalla para ver la orden de pedido
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/121084712/49dfc0e5-710d-490c-b201-58bd785044da"></p>

Entidades:

-Pedido

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
Requerimiento asociado: [R201](#R201) - [R202](#R202) - [R204](#R204)

Al elegir el vínculo a “Pedidos en progreso” se dirigirá a la pantalla principal del módulo, donde no le aparecerán los datos hasta que escriba el código del traslado o el código del pedido en sus respectivos cuadros de búsqueda. 
Si por ejemplo el usuario solo cuenta con el código del pedido basta con buscarlo y automáticamente se completará el código del traslado debido a la relación entre ambas entidades.
En esta pantalla también están incluidas las funciones de inicio de Incidente y visualización de la guía de remisión, pero esto está sujeto al nivel de acceso del usuario.
<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/f00dc926-ce6e-4098-8100-607abf265f7f"></p>

Para evitar manejar una cantidad grande de datos se plantea generar una actualización de la ubicación en el momento en el que se ingresa a esta pantalla y en periodos específicos de tiempo durante la permanencia del usuario en la pantalla (alrededor de 1 minuto de intervalo entre actualización y actualización).

Entidades involucradas:
- Traslados
- Pedidos
- Vehículos
- Ubicación
- GPS
- Ruta
- Locales

#### Pantalla Detalles de Traslado:
Requerimiento asociado: [R205](#R205) - [R206](#R206)

Se puede llegar a la pantalla de Detalles de Traslado desde el Menú principal o desde la pantalla Pedidos en Progreso; la diferencia radica que al usar la pantalla de Pedidos en Progreso el rellenado del campo “Código de traslado” sería automático y proveniente de lo último que se esté viendo en la otra pantalla. 
Una vez colocado el código respectivo el usuario tendrá acceso a la información del conductor y el automóvil con la finalidad de corroboración o en el intento de contactar con el conductor a través de su número celular.

Interfaz: 

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/95ef1cc0-4498-4372-aec9-654c03fb9d91"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/6bf7441d-e3d2-4d43-8e15-c240548a8242"></p>

Entidades involucradas:
- Traslado
- Transportista
- Vehículo
- Rutas
- Tramos
- Locales

#### Pantalla Pedidos Pendientes:
Requerimiento asociado: [R203](#R203)

Esta pantalla, al igual que la anterior, es accesible desde la pantalla principal y la de Pedidos en progreso, aunque está restringida a ciertos usuarios. Su función es mostrar los pedidos de un traslado en particular que aún no han sido entregados, esto le permite a un supervisor verificar los pedidos que faltan entregar y al transportista a registrar cuando realiza una entrega, para eso se genera un botón con el vínculo al modulo de control para verificar el proceso de entrega. Una vez culminado el proceso en ese otro modulo el sistema se actualizará y generará una notificación para los usuarios asignados.

Interfaz:

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/164358065/d04fc44c-ef3b-4682-9c31-7912a648c48e"></p>

Entidades Involucradas:
- Pedidos
- Dirección
- Operación
- Transportista

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

Para explicar de manera más sencilla la relación entre los casos de uso, las interfaces y el modelado conceptual, se presenta a continuación un ejemplo de poblamiento de datos preliminar de las entidades ProductoStock, Mercancía y Operación (los atributos están dados de manera representativa, no necesariamente coinciden con el formato especificado en el diccionario):

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

|IDOperación|Tipo|IDOpPrevia|Fecha|HoraInicio|HoraFin|IDEmpEjecutor|IDEmpSupervisor|
|----------|----------|----------|----------|----------|----------|----------|----------|
|OP-001|Picking|NULL|20240415|12:00|12:32|EMP-001|EMP-102|
|OP-002|Precintado|OP-001|20240415|12:35|13:10|EMP-002|EMP-102|
|OP-003|Paletizado|OP-002|20240415|13:12|13:30|EMP-003|EMP-102|
|OP-004|Carga|OP-003|20240415|13:31|13:45|EMP-004|EMP-105|
|OP-005|Salida|OP-004|20240416|13:45|13:47|EMP-008|EMP-118|
|OP-006|Recepción|OP-005|20240416|10:01|10:06|EMP-008|EMP-118|
|OP-007|Descarga|OP-006|20240416|10:12|10:30|EMP-009|EMP-118|
|OP-008|Picking|NULL|20240417|10:05|10:12|EMP-001|EMP-102|

Traslado

| CodTraslado | CodVehiculo | CodOperacionSalida | CodOperacionRecepcion |
|--------------|--------------|----------------------|-------------------------|
| 111111    | 001          | OP-005           | OP-006              |

Las existencias de un producto (instancias de ProductoStock) se agrupan en mercancías mediante una operación conocida como picking (el ID de esta operación tipo "Picking" va en el campo IDOperación de la entidad Mercancía). La secuencia de las operaciones es la siguiente: picking -> precintado -> paletizado -> carga -> salida -> recepción -> descarga. Cada una de estas operaciones tiene un campo IDOpAfectada con el ID de la operación que le precede, excepto las operaciones tipo "Picking" que no les precede ninguna operación. Cuando se realiza una operación tipo "Precintado", el campo "NúmeroPrecinto" de las instancias de Mercancía asociadas a la operación tipo "Picking" que le precede se actualizan con su respectivo código de precinto.

Tomar en cuenta también que la entidad Traslado tiene un campo referido a un identificador de una instancia de Operación tipo "Salida" que sirve para dar información sobre la salida de la mercancía (esto también permite obtener información de la mercancía que se está trasladando, consultando la operación que le precede con el atributo IDOpPrevia sucesivamente hasta llegar a la operación tipo "Picking" y consultar con la tabla de Mercancía las mercancías asociadas), y un identificador de una instancia de Operación tipo "Recepción" que sirve para dar información sobre la verificación de la recepción de la mercancía.

### Módulo 4: Control
#### Pantalla principal
El prototipo del módulo de Control consta de una pantalla central dividida en dos secciones principales. La primera sección aborda el transporte, desglosado en dos subcategorías: conductor y vehículo. Esta división permite gestionar la disponibilidad de ambos aspectos y, posteriormente, transmitir esta información al módulo de seguimiento. De esta manera, el personal asignado puede trabajar eficientemente con conductores y vehículos disponibles para los traslados.
La segunda sección se centra en las incidencias relacionadas con los traslados antes de que los productos lleguen a manos del cliente. Esta área se encarga de registrar todos los incidentes internos que puedan surgir durante el proceso de transporte.

![pantalla](https://github.com/fiis-bd241/grupo01/assets/164266999/3b4fd6cd-e68d-490e-b279-f1467d76d75c)

Entidades involucradas:
- Incidencia
- Vehículo
- Transportista

#### Pantalla de disponibilidad de conductores

El siguiente prototipo aborda la disponibilidad de los conductores, basándose en sus atributos y las políticas de negocio establecidas por San Fernando. Por ejemplo, para prevenir la fatiga y reducir el riesgo de accidentes, la empresa implementó una política que requiere que los conductores permanezcan inactivos durante dos días después de completar un traslado. Esta información se recopila en nuestro sistema, donde destacan atributos como la fecha de vencimiento de la licencia, el tipo de licencia y la fecha del último traslado. Estos datos son fundamentales para facilitar la toma de decisiones y determinar la disponibilidad de los conductores.

![transportista](https://github.com/fiis-bd241/grupo01/assets/164266999/d31345d9-736e-4fca-ac9d-69f86f45adfe)


Entidades involucradas:
- Trasportista
- Empleado
  

#### Pantalla de disponibilidad de vehículos

Siguiendo la línea del prototipo anterior, en este nos enfocaremos en la disponibilidad de los vehículos, considerando sus atributos y las políticas establecidas por la empresa. Por ejemplo, en términos de inocuidad, si un vehículo ha estado en planta realizando un traslado, debe someterse a un proceso de desinfección antes de poder ser utilizado nuevamente para otro pedido. Este proceso suele tomar alrededor de un día. Sin embargo, si el traslado no implica visitar la planta, el vehículo puede realizar traslados de manera continua, con la única variación siendo el conductor asignado.

![vehiculo](https://github.com/fiis-bd241/grupo01/assets/164266999/077851e6-df94-4735-a16d-6dbdf6882b51)


Entidades involucradas:
- Vehículo
- Ubicación
- Empleado
  

#### Pantalla de registro de incidencias internas
El siguiente prototipo aborda las incidencias internas a nivel de traslado, dividido en dos secciones. La primera sección registra la incidencia de traslado en sí misma, mientras que la segunda proporciona una visión general del proceso de la incidencia y los pasos o procedimientos que se seguirán. Estos procedimientos se basan en normativas tanto internacionales como nacionales, establecidas por la empresa San Fernando, con el objetivo de garantizar una cierta uniformidad y tener un plan de contingencia para cada incidente.

Se observa los atributos de la incidencia como el encargado de registrar la incidencia, la fecha y hora del incidente, el tipo de incidencia, etc.
![FIGMA 3](https://github.com/fiis-bd241/grupo01/assets/164266999/45eeb8e5-beca-41b1-a463-65fa050519c9)

Después de registrar adecuadamente la incidencia, procedemos a la etapa de procedimientos, donde se establecen las acciones a tomar frente a este tipo de incidente. Esto se basa en el tipo de incidencia, una breve descripción y los pasos con sus códigos correspondientes registrados en el sistema para resolver el problema. Nos guiamos tanto por normativas extranjeras como nacionales, dependiendo del tipo de incidente al que nos enfrentamos.
![FIGMA 4](https://github.com/fiis-bd241/grupo01/assets/164266999/fa36fe66-bf5e-4011-88ff-87df7a7d21ee)

Entidades involucradas:
- Incidencia
- Empleado
- Traslado
- Transportista
- Vehículo
- Catálogo contingencias
- Procedimiento
- Pasos
- Normas

#### Cuestionario

1. ¿Existe alguna consideración especial en cuanto a rendimiento? Por ejemplo, en sistemas que llegan a usuario final, un bajo rendimiento puede tener como consecuencia la pérdida de una venta.

Considero que en sistemas que llegan al usuario final, el rendimiento es crítico. Un bajo rendimiento puede afectar la experiencia del cliente y, en última instancia, resultar en la pérdida de ventas o insatisfacción. Además es crucial evaluar el tiempo de respuesta de las consultas y procesos. Si las operaciones de verificación de pedidos o registro de incidencias son lentas, podríamos considerar optimizarlas mediante procesos batch o índices eficientes en la base de datos.

2. ¿El volumen de información con el que trata la opción del sistema es significativo? En esos casos, por ejemplo, podríamos tener procesos batch que permitan optimizar estas consultas (¿hemos considerado ello en nuestros módulos?).

Efectivamente, al tratar con la parte de logística de una empresa como San Fernando estamos obligados a trabajar con un gran número de datos. Por lo tanto, como grupo y teniendo en cuenta mi módulo de Control donde debo verificar el estado de los procesos ya sea del almacén central a la planta, como de la planta al cliente final, así como observar la disponibilidad de conductores, vehículos y los registros de incidencias, me he planteado utilizar los procesos batch con ese fin y orientarlo hacia tareas intensivas en datos que pueden ayudar a reducir la carga en tiempo real y mejorar el rendimiento general.


### Módulo 5: Reportes
#### Pantalla Principal
![Frame 5](https://github.com/fiis-bd241/grupo01/assets/161625149/bbe265ae-5dde-480a-a845-42621a6c23b9)
![Frame 6](https://github.com/fiis-bd241/grupo01/assets/161625149/7ba7b92e-1e4e-43aa-8840-4846fa8fc678)
![Frame 7](https://github.com/fiis-bd241/grupo01/assets/161625149/108fb15a-82e4-42ad-a7d3-783416d7e096)
![Frame 8](https://github.com/fiis-bd241/grupo01/assets/161625149/b4acf8b1-9c9b-4e00-8049-bce671e82451)

Entidades involucradas:
- Local
- Elemento catalogo
- Stock

#### Pantalla para Programar reporte
![Frame 2](https://github.com/fiis-bd241/grupo01/assets/161625149/8c82367f-cc94-4e3b-b20c-d19be4aa7cfa)
Entidades involucradas:
- Empleado
- Programacion reporte
- Reporte

#### Pantalla para Generar reporte
![Frame 1](https://github.com/fiis-bd241/grupo01/assets/161625149/cba33736-7a25-4785-b1d2-4a97eea92108)

#### Pantalla para Enviar reporte
![Frame 3](https://github.com/fiis-bd241/grupo01/assets/161625149/af40bc08-873c-48f9-bf28-2e77cac46e1a)

### Módulo 6: Reclamos

#### Pantalla Principal

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/9c1efe3a-53a9-4c79-976c-2e318365dda9"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/604d3a42-835f-4150-8a74-8711842dfe7c"></p>

Entidades Involucradas:
- Reclamo
- Estado_reclamo
- Representante
- Cliente
- Cliente_tipo
- Reclamo_tipo
- Seguimiento

#### Pantalla de Visor de Reclamo

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/c3c70195-a4af-43f0-8da5-b865dce6aa19"></p>

Entidades Involucradas:

- Persona
- Representante
- Cliente
- Ticket
- Pedido
- Evidencia
- Cliente_tipo
- Reclamo_tipo
- Seguimiento
- Reclamo
- Estado_reclamo

#### Pantallas de Crear o Registrar el Reclamo de un Cliente

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/76aaf4cd-b4a2-4be4-bb6c-425372f02f1a
"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/ef3faac0-a5ec-4d4a-89de-46bd954fb732"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/154a535c-0c6d-4d6d-afd9-b94fc5775345"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/f3ff6da2-d23a-475b-bedf-bd24a47d3d4c"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/94a1f437-0ff4-4eb9-952f-c1db9e3594aa"></p>

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130238034/b1878d03-f029-428d-96f7-5534caddb825"></p>

Entidades Involucradas:

- Persona
- Representante
- Cliente
- Ticket
- Pedido
- Evidencia
- Cliente_tipo
- Reclamo_tipo
- Seguimiento
- Reclamo
- Estado_reclamo

[Prototipo en Figma](https://www.figma.com/file/kZLR8sf4PPRQyQf9dsDxDp/PROTOTIPO-DE-RECLAMOS?type=design&node-id=0-1&mode=design&t=7KtYyZiyPe04xOE2-0)

## Modelo Conceptual

### Planta Huaral Diagrama Cheng

<p align="center" width="90%"><img width="90%" src="https://github.com/fiis-bd241/grupo01/assets/130816094/686b13d6-0c06-4b49-8a5d-efe548bdecb0"></p>


[Diagrama Cheng](https://app.diagrams.net/#G1sYHbkonVotVIohr2sUkFBC17Pi2aDmhR#%7B"pageId"%3A"R2lEEEUBdFMjLlhIrx00"%7D)

#### Diccionario de datos:

##### Entidades

**Entidad:** Catálogo_contingencias 

Semántica: Recurso que enumera y describe posibles situaciones de emergencia o riesgos, junto con las estrategias o procedimientos diseñados para responder a cada una de ellas de manera efectiva. 

| ATRIBUTO | NATURALEZA | FORMATO | VALORES VÁLIDOS | UNIDAD | DERIVADA DE | DESCRIPCIÓN |  
|----------------|------------|-----------|-----------------|--------|-------------|--------------------------------------------------| 
| código_catalogo_contiengencias | CHAR | 999999999 | 9 dígitos | --- | --- | Identificador del catálogo de contingencias |  
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
| descripcion | CHAR| X(256) | NO NULL | -  | - | Descripción del elemento en el catálogo. | 
| unidad  | CHAR  | X(32) | NO NULL | -  | - | Unidad de medida del elemento en el catálogo. | 
| temperatura_maxima | INT | 999 | - | Grados Celsius | - | Temperatura máxima permitida para la materia prima | 
| temperatura_mínima | INT | 999 | - | Grados Celsius | - | Temperatura mínima permitida para la materia prima | 
| categoría | CHAR | X(32) | - | - | - | Es la forma de categorizar los productos | 
| segmento | CHAR | X(32) | - | - | - | Es la segmentación del material y las materias primas | 
| tipo | CHAR | X(32) | Producto, Material, Materia Prima | - | - | Clasificación de elemento por su relación del proceso de producción| 
| vida_util | INT | 999 | - | Días | - | Vida útil de la materia prima | 
| peso_unitario | CHAR | X(64) | - | - | - | Segmento al que pertenece el material en el catálogo| 

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
| cod_incidencia | INT | 9 | >0 | - | - | - | Código único que identifica la incidencia.|  
| cod_tipo_incidencia | CHAR | X| - | - | - | Tipo de incidencia que ha ocurrido |  
| descripcion | CHAR | x(128) | - | - | - | Descripción detallada de la incidencia.|  
| fecha_ocurrencia | DATE | AAAAMMDD | NO NULL | - | - | Fecha en la que ocurrió la incidencia. |  

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
| tipo_operacion | CHAR | X(32) | "Picking", "Precintado", "Paletizado", "Carga", "Salida", "Recepción", "Descarga" | - | - | Indica el tipo de movimiento realizado en la operación. |  
| fecha | DATE | AAAAMMDD | NO NULL | - | - | Fecha en que la operación se realizó. |
| hora_inicio | TIME| HHMMSS | NO NULL | - | - |  Hora en que la operación inició. | 
| hora_fin | TIME| HHMMSS | NO NULL | - | - |  Hora en que la operación finalizó. | 

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
| nro_lote | INT | 999 | >=0 | - | - | Número de lote asociado al stock | 
| tipo_stock | CHAR | X(32) | - | - | - | Tipo de producto asociado a un stock | 
| fecha_caducidad | DATE | AAAAMMDD |NO NULL | - | - | Fecha en que el producto pierde su valor o propiedades | 
| tipo | CHAR | X(32) | Producto, Material, Materia Prima | - | - | Clasificación de elemento por su relación del proceso de producción| 

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

## Entrevista
A continuación, se muestra la grabación de la entrevista realizada a la ingeniera Joselin Alexandra Torres Robles, supervisora del área de almacén de la planta Huaral de San Fernando.

[![Entrevista](../entregables%20parciales/entregable%202/imagenes/video_preview.png)](http://www.youtube.com/watch?v=DPxvZC3R6Ws "Entrevista a Joselin Torres")

Los detalles de la reunión fueron registrados en la [acta](../entregables%20parciales/entregable%202/acta-entrevista-20240401.md) respectiva, así como también se elaboró una [transcripción](../entregables%20parciales/entregable%202/transcripcion-entrevista-20240401.md) de las preguntas y respuestas realizadas durante la entrevista, además se generó un [resumen](../entregables%20parciales/entregable%202/Resumen-transcripcion.md) donde se sintetiza los procesos más importantes con un cierto orden, con el fin de comprender mejor los procesos de San Fernando.

## Videos individuales
A continuación, se muestra los links de los videos invididuales de cada módulo realizados por los integrantes.

### Módulo 1
Integrante: [Inocente Caro Miguel Anderson](../../01.%20integrantes/Miguel%20Inocente/Miguel-Inocente.md)

<a href="http://www.youtube.com/watch?feature=player_embedded&v=fToWdVgMKb4
" target="_blank"><img src="http://img.youtube.com/vi/fToWdVgMKb4/0.jpg" 
alt="IMAGE ALT TEXT HERE" width="800" height="500" border="30" /></a>

### Módulo 2
Integrante: [Campos Herrera Dennis](../../01.%20integrantes/Dennis%20Campos%20/Dennis%20Campos.md)

<div align="center">
    <a href="http://www.youtube.com/watch?feature=player_embedded&v=QgKg1K2R5Wc" target="_blank">
        <img src="http://img.youtube.com/vi/QgKg1K2R5Wc/0.jpg" alt="Hola k ase" width="700" height="400" border="10" />
    </a>
</div>


### Módulo 3
Integrante: [Alvarado Usucachi José Joaquín](../../01.%20integrantes/Joaquín%20Alvarado/Joaquín%20Alvarado.md)

[![Almacén](https://github.com/fiis-bd241/grupo01/assets/130816094/014486c9-402b-4489-8824-227f871970d8)](https://www.youtube.com/watch?v=kWeuiXoDFiI)

### Módulo 4
Integrante: [Espinoza Cerna Alex](../../01.%20integrantes/Alex%20Espinoza/alex.md)

<div align="center">
    <a href="http://www.youtube.com/watch?feature=player_embedded&v=6ixwsKJIGqA" target="_blank">
        <img src="http://img.youtube.com/vi/6ixwsKJIGqA/0.jpg" alt="Hola k ase" width="700" height="400" border="10" />
    </a>
</div>

### Módulo 5
Integrante: [Cruz Mamani Cristhian Samir](../../01.%20integrantes/Cristhian%20Cruz/Cristhian%20Cruz.md)

[![miniatura-reporte](https://github.com/fiis-bd241/grupo01/assets/161625149/29a79e7f-28f3-4f48-b41d-d8d7d9a766ba)
](https://www.youtube.com/watch?v=NrOYQeA2n-I)

### Módulo 6
Integrante: [Cárdenas Palacios Leonardo Gustavo](../../01.%20integrantes/Leonardo%20Cárdenas/Leonardo%20Cárdenas.md)

[![Hola1](https://github.com/fiis-bd241/grupo01/assets/130238034/ff3458e7-57f3-42f0-8f22-06675b4c6723)](https://www.youtube.com/watch?v=3Sji5_U5_JA)



## Avance de Diagramas Entidad-Relación

![modelo-logico (1)](https://github.com/fiis-bd241/grupo01/assets/161625149/119543cd-1eae-4ffc-a8c6-bbda8890d068)

Link del diagrama:
[https://app.diagrams.net/#Wb!B6iW_HyZ9Uu006YT7wrOYtAgE85DSMBNgtvqP4jjpusfjQlxbKwHQbw161ArWf7P%2F01ZOJ7WU2RUCTY52DUKFEJ4FQ5DCEEUOK2#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D](https://drive.google.com/file/d/1GrupzXPfoShdgRXzAIGe09sujAwB4f1J/view?usp=sharing)

[Regresar al índice](../../README.md)
