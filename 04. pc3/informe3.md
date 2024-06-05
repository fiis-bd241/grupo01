# Tercera práctica calificada - Informe     

## 1. Asignación de Códigos por Requerimientos y Prototipos de Interfaces de Usuario

### Requerimientos

#### 1. Requerimientos del módulo de Pedidos

Caso de Uso #1: Registrar Pedido
| Código | R101 | 
|----------|----------|
|Objetivo| Permitir al empleado de la empresa San Fernando ingresar los datos del cliente, representante y el pedido.|
|Descripción | El empleado ingresa la información del representante, como nombres, apellidos, DNI, teléfono, correo empresarial, empresa, fecha de solicitud y fecha de entrega esperada.|
|Actor Primario| Empleado de la empresa San fernando.|
|Actor Secundario| N/A. | 
|Precondiciones |El empleado debe estar autenticado en el sistema.
|Paso |Acción| 
|1| El representante accede a la interfaz de registro de pedido.|
|2| El sistema muestra un formulario con campos para ingresar los datos del cliente y del pedido.|
|3| El representante completa el formulario con la información requerida.|
|4| El representante selecciona la opción "Siguiente" para continuar con la solicitud de productos.|

Caso de Uso #2: Agregar productos al pedido. 
| Código | R102 | 
|----------|----------|
|Objetivo | Permitir al empleado seleccionar los productos solicitados para el pedido.|
|Descripción | Después de ingresar los datos del representante en el pedido, el empleado puede seleccionar los productos requeridos de una lista de catálogo. | 
|Actor Primario | Empleado. |
|Actor Secundario | N/A. |
|Precondiciones | El empleado debe haber ingresado los datos del pedido correctamente. |
|Paso | Acción |
|1| El sistema muestra una lista de productos disponibles en el catálogo, agrupados por categorías.| 
|2| El empleado selecciona los productos necesarios y las cantidades correspondientes.|
|3| El empleado confirma la selección de productos.|
|4| El sistema actualiza el pedido con los productos seleccionados.|

Caso de Uso #3: Ver lista de pedidos.
| Código | R103 | 
|----------|----------|
|Objetivo |  Permitir al empleado ver todos los pedidos realizados en el software. |
|Descripción | El empleado puede ver una lista de todos los pedidos realizados en el software, junto con su estado actual. |
|Actor Primario | Empleado. |
|Actor Secundario | N/A |
|Precondiciones | Debe haber pedidos registrados previamente en el sistema. |
|Paso | Acción |
|1| El empleado accede a la interfaz de lista de pedidos.|
|2| El sistema muestra una lista de todos los pedidos, incluyendo información como el número de pedido, el nombre del cliente, el encargado, la fecha del pedido y el estado actual.|
|3| El representante puede filtrar la lista por diferentes criterios, como estado del pedido (todos, aceptado, rechazado, otros) o utilizar el campo de búsqueda.|
|4| El representante puede seleccionar un pedido específico para ver más detalles.|

Caso de Uso #4: Ver detalle pedido. 
| Código | R104 | 
|----------|----------|
|Objetivo | | 	Permitir al empleado ver los detalles completos de un pedido específico. |
|Descripción | El empleado puede ver información detallada sobre un pedido, como los datos del cliente (nombre de la empresa), representante, los productos solicitados, las fechas de solicitud y entrega, y el estado actual del pedido. |
|Actor Primario | Empleado |
|Actor Secundario |N/A |
|Precondiciones | Debe haber pedidos registrados previamente en el sistema. |
|Paso | Acción |
|1| El empleado selecciona un pedido de la lista de pedidos.|
|2| El sistema muestra los detalles completos del pedido seleccionado, incluyendo el código del pedido, las fechas de solicitud y entrega, el nombre del cliente, el representante, el empleado que registró el pedido, y el estado actual del pedido.|
|3| El empleado puede ver información adicional, como el tipo de pedido (que en este caso seria venta).|
|4| El empleado puede volver a la lista de pedidos o realizar otras acciones relacionadas con el pedido.|

#### 2. Requerimientos del módulo de Seguimiento
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

#### 3. Requerimientos del módulo de Almacén

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

#### 4. Requerimientos del módulo de Control
Caso de Uso #1:  Registro de disponibilidad de conductores
| Código | R401 | 
|----------|----------|
|Objetivo |Asignarle el traslado de un determinado pedido|
|Descripción | El usuario verifica en base a los datos del conductor como nombre completo, id conductor, número de licencia, fecha de vencimiento de licencia, fecha y hora de última actividad, para registrar su disponibilidad y poder asignarle un pedido. |
|Actor Primario | Transportista|
|Actor Secundario|N/A |
|Precondiciones|Registro de conductores en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Transporte" y luego le da a segunda opción "Conductor"|
|2|Verifica los atributos específicos del conductor como: nombre completo, id conductor,fecha de contratación, fecha de vencimiento de licencia, fecha y hora de último traslado|
|3|Registra su disponibilidad|
|4|Verifica los datos y confirma el registro|
|5|El sistema actualiza el registro con el nuevo ingreso|

Caso de Uso #2: Registro de disponibilidad de vehículos
| Código | R402 | 
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

Caso de Uso #3: Registro de nueva incidencia
| Código | R403 | 
|----------|----------|
|Objetivo |Gestionar los procesos de traslado de productos de San Fernando |
|Descripción | El usuario ingresa los datos del incidente como descripción detallada del incidente, fecha incidente, hora incidente, tipo de incidencia y el estado de atencion frente a determinada incidencia.
|Actor Primario | Encargado de almacén|
|Actor Secundario|Almacenero y Transportista|
|Precondiciones|Comunicación con cada módulo sobre incidencias en sus procesos internos|
|Paso|Acción|
|1|El usuario selecciona la opción "Incidencia"|
|2|El usuario selecciona el apartado "Nuevo"|
|2|Ingresa la información del incidente: descripción detallada del incidente,fecha incidente,hora de incidente, tipo de incidencia así como el procedimiento a realizar y la norma sobre la que se basa.|
|3|Verifica los datos y confirma el registro|
|4|El sistema actualiza el registro con el nuevo ingreso que será enviado al listado general de incidencias|

Caso de Uso #4: Registro de estado de incidencia
| Código | R404 | 
|----------|----------|
|Objetivo |Gestionar y actualizar el estado de las incidencias registradas. |
|Descripción | El usuario actualiza el estado de una incidencia previamente registrada que puede ser "Solucionada" o "Pendiente".|
|Actor Primario | Encargado de almacén|
|Actor Secundario|Almacenero y Transportista|
|Precondiciones|Existencia de incidencias previamente registradas en el sistema.|
|Paso|Acción|
|1|El usuario selecciona la opción "Incidencia"|
|2|El usurario selecciona el apartado "Registro"|
|3|Accede a un listado de incidencias registradas hasta el momento|
|4| Selecciona el estado de atención de determinada incidencia |
|5|El sistema actualiza el registro con el nuevo ingreso|

#### 5. Requerimientos del módulo de Reportes

Caso de Uso #1: Generar reporte

| Código           | R501                                                                                                                                                                       |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Generar un reporte de un tipo específico para cada módulo de forma inmediata                                                                                               |
| Descripción      | Permite generar reportes personalizados para cada módulo de forma instantánea donde el usuario define las características del reporte y lo descarga en el formato deseado. |
| Actor Primario   | Representante de un área                                                                                                                                                   |
| Actor Secundario | -                                                                                                                                                                          |
| Precondiciones   | El representante debió iniciar sesión                                                                                                                                      |
| Paso             | Acción                                                                                                                                                                     |
| 1                | El usuario selecciona el módulo "Reportes"                                                                                                                                 |
| 2                | El usuario presiona el de botón de "Generar reporte"                                                                                                                       |
| 3                | Se muestra una ventana emergente, donde el usuario podrá seleccionar las características del reporte a su preferencia                                                      |
| 4                | El usuario presiona el boton "Generar" y se le descarga el reporte en el formato escogido                                                                                  |

Caso de Uso #2: Programar reporte

| Código           | R502                                                                                                                                                                                                                            |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Programar la generación de un reporte de un tipo específico para cada módulo en intervalos predefinidos                                                                                                                         |
| Descripción      | Permite programar la generación de reportes a intervalos predefinidos específicos por el usuario, que define las características del reporte, la frecuencia de generación y el sistema se encarga de generarlo automáticamente. |
| Actor Primario   | Representante de un área                                                                                                                                                                                                        |
| Actor Secundario | -                                                                                                                                                                                                                               |
| Precondiciones   | El representante debió iniciar sesión                                                                                                                                                                                           |
| Paso             | Acción                                                                                                                                                                                                                          |
| 1                | El usuario selecciona el módulo "Reportes"                                                                                                                                                                                      |
| 2                | El usuario presiona el de botón de "Programar reporte"                                                                                                                                                                          |
| 3                | Se muestra una ventana emergente, donde el usuario podrá seleccionar las características de la programació del reporte a su preferencia                                                                                         |
| 4                | El usuario presiona el boton "Programar" y se añade a la lista de reportes programados                                                                                                                                          |

Caso de Uso #3: Ver nivel de inventario

| Código           | R503                                                                                                                                                                                                        |
| ---------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Proporcionar visibilidad de los niveles de inventario para los productos                                                                                                                                    |
| Descripción      | Permite visualizar en tiempo real los niveles de inventario para todos los productos o un subconjunto específico. El usuario puede filtrar, ordenar y seleccionar productos para ver información detallada. |
| Actor Primario   | Representante de un área                                                                                                                                                                                    |
| Actor Secundario | -                                                                                                                                                                                                           |
| Precondiciones   | El representante debió iniciar sesión                                                                                                                                                                       |
| Paso             | Acción                                                                                                                                                                                                      |
| 1                | El usuario selecciona el módulo "Reportes"                                                                                                                                                                  |
| 2                | Se muestra una tabla con los productos                                                                                                                                                                      |
| 3                | El usuario puede interactuar con la tabla para seleccionar los productos que desea ver los niveles de inventario                                                                                            |

Caso de Uso #4: Ver gráficos de cada módulo

| Código           | R504                                                                                                |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Objetivo         | Visualizar datos utilizando una variedad de gráficos y tablas                                       |
| Descripción      | Permite visualizar datos utilizando gráficos y tablas para una mejor comprensión de la información. |
| Actor Primario   | Representante de un área                                                                            |
| Actor Secundario | -                                                                                                   |
| Precondiciones   | El representante debió iniciar sesión                                                               |
| Paso             | Acción                                                                                              |
| 1                | El usuario selecciona el módulo "Reportes"                                                          |
| 2                | El usuario debe presionar el botón de "Gráficos"                                                    |
| 3                | Se muestran diversos gráficos relacionados con cada módulo                                          |

#### 6. Requerimientos del módulo de Reclamos

Caso de Uso #1: Registrar un reclamo

| Código           | R601                                                                                                                        |
| ---------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Registrar un reclamo realizado por un cliente                                                  |
| Descripción      | Este caso de uso describe el proceso mediante el cual el Encargado de Atención a Reclamos registra a un reclamo generado por un cliente, relacionado con algún problema con el pedido. |
| Actor Primario   | Encargado de Atención a Reclamos|
| Actor Secundario | -                                                                                                                       |
| Precondiciones   | El encargado de Atención a Reclamos tiene acceso al sistema de registro de reclamos.                                                                                                                                      |
| Paso             | Acción                                                                                                                     |
| 1                | El usuario selecciona el módulo "Reclamos"                                                       |
| 2                | El usuario presiona el de botón de "Crear" y selecciona el tipo de cliente           |
| 3                | Identificar los datos del cliente                                                      |
| 4                | Identificar el producto problemático                                        |
| 5              | Identificar la naturaleza del reclamo                                                                                  |
| 6              | Identificar la evidencia del reclamo                                                                                 |
| 7              | Identificar la resolución deseada para el reclamo                                        |
| 8              | Confirmar el seguimiento del reclamo|

Caso de Uso #2: Visualizar y editar el estado de un reclamo

| Código           | R602                                                                                                                        |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Objetivo         | Visualizar la información detallada y editar el estado de un reclamo registrado en el sistema. |
| Descripción      | Este caso de uso describe el proceso mediante el cual el Encargado de Atención a Reclamos puede acceder y visualizar todos los detalles de un reclamo específico registrado en el sistema, incluyendo la descripción, estado, fecha de registro, y acciones tomadas.|
| Actor Primario   | Encargado de Atención a Reclamos|
| Actor Secundario | -                                                                                                                       |
| Precondiciones   | El encargado de Atención a Reclamos tiene acceso al sistema de registro de reclamos.                                                                                                                                      |
| Paso             | Acción                                                                                                                     |
| 1                | El usuario selecciona el módulo "Reclamos"                                                       |
| 2                | Buscar el reclamo en la lista editando los diferentes campos. |
| 3                | Seleccionar el reclamo a visualizar |
| 4                | Visualizar los datos asociados al reclamo|
| 5              | Posibilidad de editar el estado del reclamo en ciertos casos|

### Prototipos

#### 1. Prototipos del módulo de Pedidos

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R101  |
| Código      | I101 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/121084712/f0561a61-b1f5-4a3f-b805-1b2a2b2f0d0a) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R102  |
| Código      | I102 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/121084712/a5969b9b-6586-4600-9741-8adf84bc025e) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R103   |
| Código      | I103 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/121084712/79ecb0c5-f800-4578-89aa-168b1e0b3ccd)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R104  |
| Código      | I104 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/121084712/2cb398f1-654b-4c5a-b4b0-8d1007bd5a27) |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/121084712/0d1d5575-3acd-4e03-aa29-e1facebba757) |



#### 2. Prototipos del módulo de Seguimiento

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R201, R202, R203, R204, R205, R206     |
| Código      | I201 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/02e80a46-9583-48c4-b577-a8f3f46c9d97)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R202     |
| Código      | I202 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/36a58d38-da47-4099-8b76-62fbdd8a1aa3)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R203|
| Código      | I203 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/78d998b0-889a-4668-895d-b5ccccddd7cb)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R204     |
| Código      | I204 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/efb7b544-926b-4410-a17a-f3a926a42a0f)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R205     |
| Código      | I205 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/d9a1ce6b-d68b-4686-88d1-5ac69dcbb9a0)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R206    |
| Código      | I206 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/94c187d0-597b-466a-8472-4b690a9e8347)|

#### 3. Prototipos del módulo de Almacén

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301, R302, R303, R304, R305, R306, R307       |
| Código      | I301 |
| Prototipo   |  ![Captura de Pantalla 2024-06-04 a la(s) 23 41 49](https://github.com/fiis-bd241/grupo01/assets/130816094/3fe88474-f72e-40ed-94e7-71000489e492) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301           |
| Código      | I302 |
| Prototipo   |  ![Captura de Pantalla 2024-06-04 a la(s) 23 48 17](https://github.com/fiis-bd241/grupo01/assets/130816094/e93f318d-f9bb-4e21-84d1-0821946d0f0b) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301           |
| Código      | I303 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 48 53](https://github.com/fiis-bd241/grupo01/assets/130816094/855539c9-cbd2-4d66-9219-567d27dc8b70) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R302           |
| Código      | I304 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 56 04](https://github.com/fiis-bd241/grupo01/assets/130816094/1aca11e7-41d9-4699-88ab-e5d634186122) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R303           |
| Código      | I305 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 56 28](https://github.com/fiis-bd241/grupo01/assets/130816094/d4cf7cfa-51df-4f7e-8d7a-d244a05ef89f) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R304           |
| Código      | I306 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 56 54](https://github.com/fiis-bd241/grupo01/assets/130816094/b6fb1a6c-452e-4180-aa3a-48accfefbeb2) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R305           |
| Código      | I307 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 58 39](https://github.com/fiis-bd241/grupo01/assets/130816094/d0d74edb-dbe2-4fb6-8335-da9dd5d0bbcf) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R305           |
| Código      | I308 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 58 27](https://github.com/fiis-bd241/grupo01/assets/130816094/5699b0bf-7787-4912-a833-61eaeb90bfc3) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R306           |
| Código      | I309 |
| Prototipo   | ![Captura de Pantalla 2024-06-05 a la(s) 00 00 04](https://github.com/fiis-bd241/grupo01/assets/130816094/80d60d08-f3e0-4886-807b-482fbedad15c) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R307           |
| Código      | I310 |
| Prototipo   | ![Captura de Pantalla 2024-06-05 a la(s) 00 00 29](https://github.com/fiis-bd241/grupo01/assets/130816094/76dbd489-d054-4e6d-ba74-5c2581f8c69c) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301, R302, R303, R304, R305, R306, R307       |
| Código      | I311 |
| Prototipo   | ![Captura de Pantalla 2024-06-04 a la(s) 23 55 12](https://github.com/fiis-bd241/grupo01/assets/130816094/fe07d02e-b301-4048-800a-3e43986904e9) |

#### 4. Prototipos del Módulo de Control

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R401          |
| Código      | I401 |
| Prototipo   | ![R401](https://github.com/Alexclb0/Holamundo/assets/164266999/9cdf7c07-27b2-4cc3-b576-9ac2389683b7)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R402       |
| Código      | I402 |
| Prototipo   | ![R402](https://github.com/Alexclb0/Holamundo/assets/164266999/24619fd5-47ed-4a3d-bba8-b5b3b7d63904)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I403 |
| Prototipo   | ![I403](https://github.com/Alexclb0/Holamundo/assets/164266999/45c1ca0e-3ef6-4144-90cc-b59abe11e684)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I404 |
| Prototipo   | ![I404](https://github.com/Alexclb0/Holamundo/assets/164266999/b466e32e-4415-4f81-bf46-35f6e0b22c18)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I405 |
| Prototipo   | ![I405](https://github.com/Alexclb0/Holamundo/assets/164266999/013d3635-7659-4656-8e46-75d7d298ede3)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I406 |
| Prototipo   | ![I406](https://github.com/Alexclb0/Holamundo/assets/164266999/84b912d9-8e3e-43ef-8daa-cc4835a6b450)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403, R404   |
| Código      | I407 |
| Prototipo   | ![I407](https://github.com/Alexclb0/Holamundo/assets/164266999/3bc9ccdb-40e9-4dda-bea0-03a954c754b0)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R404   |
| Código      | I408 |
| Prototipo   | ![I408](https://github.com/Alexclb0/Holamundo/assets/164266999/6808cc05-3860-4f85-8c8d-91d7226a1ea2)|


#### 5. Prototipos del módulo de Reportes

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R501, R502, R503, R504           |
| Código      | I501 |
| Prototipo   |     ![P501](https://github.com/fiis-bd241/grupo01/assets/161625149/eb29ab8b-8fb7-4e69-88ad-926acf086307)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R501           |
| Código      | I502 |
| Prototipo   | ![P502](https://github.com/fiis-bd241/grupo01/assets/161625149/df005dc5-7ebb-4274-94c4-523000c47962)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R502          |
| Código      | I503 |
| Prototipo   |  ![P503](https://github.com/fiis-bd241/grupo01/assets/161625149/3adf13d0-7cb1-4e1d-902d-fe408ea98340) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R504          |
| Código      | I504 |
| Prototipo   |   ![P504](https://github.com/fiis-bd241/grupo01/assets/161625149/752ac55b-51b6-4da6-be8e-dbd6c56e554c) ![P504](https://github.com/fiis-bd241/grupo01/assets/161625149/8ca6ae08-eea2-42dd-b6e9-449054f24593)|

#### 6. Prototipos del módulo de Reclamos

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R602 |
| Código      | I601 |
| Prototipo   | ![I601](https://github.com/fiis-bd241/grupo01/assets/130238034/2880446e-18ba-45af-8d75-c0b165603315)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I602 |
| Prototipo   | ![I602](https://github.com/fiis-bd241/grupo01/assets/130238034/add169b8-bfb8-47bb-9c4d-56f00d445f3b) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R602 |
| Código      | I603 |
| Prototipo   |![I603](https://github.com/fiis-bd241/grupo01/assets/130238034/1c2338c5-bdd6-4afd-baec-8f42b68b1477)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I604 |
| Prototipo   | ![I604](https://github.com/fiis-bd241/grupo01/assets/130238034/554a9bc4-410f-4269-b617-9148fe4d4799)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I605 |
| Prototipo   | ![I605](https://github.com/fiis-bd241/grupo01/assets/130238034/fd1e1566-9fd2-4ad8-9c23-70314b252ecc)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I606 |
| Prototipo   | ![I606](https://github.com/fiis-bd241/grupo01/assets/130238034/9100cf84-e206-4eae-8900-cf3a1b0ec3f3)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I607 |
| Prototipo   | ![I607](https://github.com/fiis-bd241/grupo01/assets/130238034/0a5d19b2-cc50-4d99-9a02-44b4f981e8ad)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I608|
| Prototipo   | ![I608](https://github.com/fiis-bd241/grupo01/assets/130238034/8bd3693d-1266-4adc-8e45-efb1dee2d7b8)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R601 |
| Código      | I609 |
| Prototipo   | ![I609](https://github.com/fiis-bd241/grupo01/assets/130238034/e437114d-973c-445a-98f2-3a5639cdc758)|


## 2. Sentencias SQL por cada prototipo

### 1. Sentencias SQL módulo de Pedidos

#### Caso 1

<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R101</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I101</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/df7eafa2-113d-4cc3-98fa-2096f674661b">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

11. Bóton siguiente: Cuando el usuario con el mouse da click el en botón siguiente, se generará el llenado del formulario para la solicitud de pedido.
``` sql

INSERT INTO persona(cod_persona, cod_estado_civil, cod_nacionalidad, cod_genero, dni, primer_apellido, segundo_apellido, prenombre, direccion )
VALUES
(? , ? , ? , ? , <3> , <4> , <2> , ?);

INSERT INTO representante (cod_representante,num_telefono,correo_empresarial,cargo,cod_cliente,cod_persona)
VALUES
(? , <6> , <7> , ? , ?)

INSERT INTO cliente (cod_cliente, cod_cliente_tipo, cod_cliente_estado, nombre , ruc , razon_social, fecha_registro)
VALUES
(?, ? , ? , <8> , ? , ? , ?)

INSERT INTO pedido (cod_representante, cod_empleado, cod_pedido_tipo,cod_pedido_estado,fecha_registro, cod_ticket)
VALUES
(?, <1> , ? , ? , <9> , ?)

INSERT INTO ticket (cod_ticket, fecha_entrega)
VALUES
(?, <10>)
```
Donde: 

`<1>` corresponde al código del usuario del inicio de sesión.

`?` corresponde a valores que se asigna al momento del registro del pedido y informacion de la base datos.

#### Caso 2

<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R102</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I102</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/85710bc2-57a4-452e-8732-94f30f191810">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de los productos: Cuando el usuario continue con el llenado del formulario , se cargara todos los productos que ofrece san fernando para la venta y los productos que necesita para el abastecimiento
``` sql

SELECT 
    ec.id_elemento_catalogo, 
    ec.nombre, 
    ec.descripcion,
    ect.descripcion AS tipo,
    ec.id_elemento_catalogo_tipo, 
    ec.peso_unitario, 
    ecu.descripcion AS unidad
FROM 
    elemento_catalogo AS ec
LEFT JOIN 
    elemento_catalogo_tipo AS ect 
    ON ect.id_elemento_catalogo_tipo = ec.id_elemento_catalogo_tipo
INNER JOIN 
    elemento_catalogo_unidad AS ecu 
    ON ecu.cod_unidad = ec.cod_unidad;
```
5. Bóton confirmar: Cuando el usuario con el mouse da click el en botón confirmar, se generará el llenado de los productos para la solicitud de pedido.
``` sql
INSERT INTO elemento_catalogo (nombre, id_elemento_catalogo_tipo, descripcion, cod_unidad, temperatura_maxima, temperatura_minima, vida_util, peso_unitario) VALUES
(<3>, <3> , <3> , <3>, <3> ,<3> ,<3> ,<3>)

INSERT INTO detalle_ticket_producto (cod_ticket, id_elemento_catalogo, cantidad)
VALUES 
(?, ? , <4>)
```

Donde: 

`<1>` corresponde al código del usuario del inicio de sesión.

`?` corresponde a valores que estan en la base de datos.

#### Caso 3

<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R103</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I103</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/48b1ea73-0db9-4686-bc98-20bf501296c0">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Carga de todos los pedidos: Cuando el usuario entre al modulo de pedidos, se mostrara todos los pedidos realizados a traves del software.
``` sql

SELECT 
    pd.cod_pedido, 
    c.nombre, 
    pr.prenombre, 
    pr.primer_apellido, 
    pr.segundo_apellido, 
    pd.fecha_registro, 
    pde.estado_pedido 
FROM 
    pedido AS pd
    INNER JOIN pedido_estado AS pde ON pde.cod_pedido_estado = pd.cod_pedido_estado
    INNER JOIN representante AS r ON r.cod_representante = pd.cod_representante
    INNER JOIN empleado AS e ON e.cod_empleado = pd.cod_empleado
    INNER JOIN persona AS pr ON pr.cod_persona = e.cod_persona
    INNER JOIN cliente AS c ON c.cod_cliente = r.cod_cliente;
```

#### Caso 4

<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R104</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I104</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/4ef1753e-bab0-4254-96be-8c48d2148341">
      </td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/876e17e1-53ad-480b-af5e-7bb6582e1798">
      </td>
   </tr>	
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Carga de informacion detalle de pedido: El usuario al dar click en detalles, obtendra informacion mas especifica o detallada del pedido.
``` sql
SELECT
    p.cod_pedido,
    p.fecha_registro AS fecha_registro_pedido,
    t.fecha_entrega,
    c.nombre AS nombre_cliente,
    CONCAT(rp.prenombre, ' ', rp.primer_apellido, ' ', rp.segundo_apellido) AS nombre_representante,
    CONCAT(ep.prenombre, ' ', ep.primer_apellido, ' ', ep.segundo_apellido) AS nombre_empleado_registro,
    pt.tipo_pedido,
    p.cod_ticket
FROM
    pedido p
    INNER JOIN ticket t ON p.cod_ticket = t.cod_ticket
    INNER JOIN representante r ON p.cod_representante = r.cod_representante
    INNER JOIN persona rp ON r.cod_persona = rp.cod_persona
    INNER JOIN cliente c ON r.cod_cliente = c.cod_cliente
    INNER JOIN empleado e ON p.cod_empleado = e.cod_empleado
    INNER JOIN persona ep ON e.cod_persona = ep.cod_persona
    LEFT JOIN pedido_tipo pt ON p.cod_pedido_tipo = pt.cod_pedido_tipo;

```

2. Carga de informacion de los productos: El usuario tambien obtendra informacion mas especifica de los productos solicitados por cada pedido.

``` sql
SELECT 
    dtp.id_elemento_catalogo, 
    ec.nombre, 
    dtp.cantidad 
FROM 
    detalle_ticket_producto AS dtp
    INNER JOIN elemento_catalogo AS ec ON dtp.id_elemento_catalogo = ec.id_elemento_catalogo;
```

### 3. Sentencias SQL módulo de Almacén

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301, R302, R303, R304, R305, R306, R307       |
| Código      | I301 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/2d94b52d-2399-4b9c-a0ef-335f1055378e) |

**Flujo 1**
1. **Botón "Iniciar nuevo proceso":** Lleva al usuario a la pantalla I302.

**Flujo 2**
2. **Selección de tipo búsqueda:** El usuario elige entre realizar la búsqueda del proceso asociado a una mercancía por medio del número de precinto o a un traslado por medio del código de guía de remisión. En base a esto, se ingresa en el campo `<3>` el tipo de entrada elegido por el usario.
3. **Botón "Buscar":** Se realiza la búsqueda usando el valor ingresado por el usuario.

El resultado mostrado se divide en tres secciones: Proceso, Mercancías y Traslado (de existir uno en curso).

Las consultas SQL a ejecutarse son las siquientes, en cada uno de los dos tipos de búsqueda:

**Búsqueda por número de precinto**
Las operaciones asociadas se obtienen con la siguiente consulta:

``` sql
WITH op_picking_cte AS (
SELECT o.id_operacion AS id_op_picking
FROM mercancia m
INNER JOIN operacion o ON m.id_operacion_picking = o.id_operacion
WHERE m.nro_precinto = <3>
)
SELECT o.id_operacion, o.fecha, o.hora_inicio, o.hora_fin,
ot.descripcion AS tipo_operacion,
p1.dni AS dni_emp_ejecutor, p2.dni AS dni_emp_supervisor
FROM operacion o
INNER JOIN operacion_tipo ot ON o.cod_tipo_operacion = ot.cod_tipo_operacion
INNER JOIN empleado e1 ON o.cod_empleado_ejecutor = e1.cod_empleado
INNER JOIN persona p1 ON e1.cod_persona = p1.cod_persona
INNER JOIN empleado e2 ON o.cod_empleado_supervisor = e2.cod_empleado
INNER JOIN persona p2 ON e2.cod_persona = p2.cod_persona
WHERE o.id_operacion = (SELECT id_op_picking FROM op_picking_cte)
OR o.id_operacion_picking = (SELECT id_op_picking FROM op_picking_cte)
ORDER BY o.cod_tipo_operacion;
```

Las mercancías asociadas (es decir, el grupo de mercancías, incluyendo la correspondiente al número de precinto ingresado, que pasaron por las mismas operaciones) se obtienen con la siguiente consulta:

``` sql
SELECT m1.nro_precinto, st.cod_stock, ec.nombre as nombre_stock, ect.descripcion as categoria,
ep.descripcion as tipo, se.descripcion as segmento, ecu.descripcion as unidad,
dm.cantidad as cantidad_transportar
FROM mercancia m1
INNER JOIN mercancia m2 ON m1.id_operacion_picking = m2.id_operacion_picking
INNER JOIN detalle_mercancia_stock dm ON m1.id_mercancia = dm.id_mercancia
INNER JOIN stock st ON dm.id_stock = st.id_stock
INNER JOIN elemento_catalogo ec ON st.id_elemento_catalogo = ec.id_elemento_catalogo
INNER JOIN elemento_catalogo_tipo ect ON ec.id_elemento_catalogo_tipo = ect.id_elemento_catalogo_tipo
INNER JOIN elemento_produccion ep ON ect.id_elemento_produccion = ep.id_elemento_produccion
INNER JOIN elemento_catalogo_unidad ecu ON ec.cod_unidad = ecu.cod_unidad
INNER JOIN segmento se ON ect.id_segmento = se.id_segmento
WHERE m2.nro_precinto = <3>
ORDER BY m1.id_mercancia;
```

El conjunto de filas obtenidas se agrupan por las que tienen el mismo valor del atributo nro_precinto por medio de la lógica implementada en el backend de la aplicación.

Si la mercancía referida ya ha pasado por una operación de tipo "Carga" o, lo que es lo mismo, si la cantidad de operaciones por las que pasó es mayor a 4, se busca la información de traslado (esta lógica se implementa en el backend). La información del traslado se obtiene con la siguiente consulta:

``` sql
SELECT t.cod_guia_remision, r.cod_ruta, rt.descripcion AS tipo_ruta, r.distancia_total, r.duracion,
p.dni AS dni_transportista,
CONCAT(p.primer_apellido, ' ', p.segundo_apellido, ', ', p.prenombre) AS nombre_completo,
n.descripcion AS nacionalidad, v.placa AS placa_vehiculo, vm.descripcion AS modelo_vehiculo,
v.anio_fabricacion, v.capacidad_carga, v.fecha_ultimo_mantenimiento, v.fecha_ultimo_viaje
FROM traslado t
INNER JOIN transportista tr ON t.cod_transportista = tr.cod_transportista
INNER JOIN empleado e ON tr.cod_empleado = e.cod_empleado
INNER JOIN persona p ON e.cod_persona = p.cod_persona
INNER JOIN nacionalidad n ON p.cod_nacionalidad = n.cod_nacionalidad
INNER JOIN ruta r ON t.cod_ruta = r.cod_ruta
INNER JOIN ruta_tipo rt ON r.cod_ruta_tipo = rt.cod_ruta_tipo
INNER JOIN vehiculo v ON t.cod_vehiculo = v.cod_vehiculo
INNER JOIN vehiculo_modelo vm ON v.cod_vehiculo_modelo = vm.cod_vehiculo_modelo
INNER JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
INNER JOIN mercancia m ON o.id_operacion_picking = m.id_operacion_picking
WHERE m.nro_precinto = <3>;
```

**Búsqueda por código de guía de remisión**
Las operaciones asociadas se obtienen con la siguiente consulta:

``` sql
WITH op_picking_cte AS(
SELECT o.id_operacion_picking AS id_op_picking
FROM traslado t
INNER JOIN operacion o on t.id_operacion_inicia = o.id_operacion
WHERE t.cod_guia_remision = <3>
)
SELECT o.id_operacion, o.fecha, o.hora_inicio, o.hora_fin,
ot.descripcion AS tipo_operacion,
p1.dni AS dni_emp_ejecutor, p2.dni AS dni_emp_supervisor
FROM operacion o
INNER JOIN operacion_tipo ot ON o.cod_tipo_operacion = ot.cod_tipo_operacion
INNER JOIN empleado e1 ON o.cod_empleado_ejecutor = e1.cod_empleado
INNER JOIN persona p1 ON e1.cod_persona = p1.cod_persona
INNER JOIN empleado e2 ON o.cod_empleado_supervisor = e2.cod_empleado
INNER JOIN persona p2 ON e2.cod_persona = p2.cod_persona
WHERE o.id_operacion = (SELECT id_op_picking FROM op_picking_cte)
OR o.id_operacion_picking = (SELECT id_op_picking FROM op_picking_cte)
ORDER BY o.cod_tipo_operacion;
```

Las mercancías asociadas al traslado referido se obtienen con la siguiente consulta:

``` sql
SELECT m.nro_precinto, st.cod_stock, ec.nombre as nombre_stock, ect.descripcion as categoria,
ep.descripcion as tipo, se.descripcion as segmento, ecu.descripcion as unidad,
dm.cantidad as cantidad_transportar
FROM traslado t
INNER JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
INNER JOIN mercancia m ON o.id_operacion_picking = m.id_operacion_picking
INNER JOIN detalle_mercancia_stock dm ON m.id_mercancia = dm.id_mercancia
INNER JOIN stock st ON dm.id_stock = st.id_stock
INNER JOIN elemento_catalogo ec ON st.id_elemento_catalogo = ec.id_elemento_catalogo
INNER JOIN elemento_catalogo_tipo ect ON ec.id_elemento_catalogo_tipo = ect.id_elemento_catalogo_tipo
INNER JOIN elemento_produccion ep ON ect.id_elemento_produccion = ep.id_elemento_produccion
INNER JOIN elemento_catalogo_unidad ecu ON ec.cod_unidad = ecu.cod_unidad
INNER JOIN segmento se ON ect.id_segmento = se.id_segmento
WHERE t.cod_guia_remision = <3>
ORDER BY m.id_mercancia;
```

El conjunto de filas obtenidas se agrupan por las que tienen el mismo valor del atributo nro_precinto por medio de la lógica implementada en el backend de la aplicación.

La información del traslado se obtiene con la siguiente consulta:

``` sql
SELECT t.cod_guia_remision, r.cod_ruta, rt.descripcion AS tipo_ruta, r.distancia_total, r.duracion,
p.dni AS dni_transportista,
CONCAT(p.primer_apellido, ' ', p.segundo_apellido, ', ', p.prenombre) AS nombre_completo,
n.descripcion AS nacionalidad, v.placa AS placa_vehiculo, vm.descripcion AS modelo_vehiculo,
v.anio_fabricacion, v.capacidad_carga, v.fecha_ultimo_mantenimiento, v.fecha_ultimo_viaje
FROM traslado t
INNER JOIN transportista tr ON t.cod_transportista = tr.cod_transportista
INNER JOIN empleado e ON tr.cod_empleado = e.cod_empleado
INNER JOIN persona p ON e.cod_persona = p.cod_persona
INNER JOIN nacionalidad n ON p.cod_nacionalidad = n.cod_nacionalidad
INNER JOIN ruta r ON t.cod_ruta = r.cod_ruta
INNER JOIN ruta_tipo rt ON r.cod_ruta_tipo = rt.cod_ruta_tipo
INNER JOIN vehiculo v ON t.cod_vehiculo = v.cod_vehiculo
INNER JOIN vehiculo_modelo vm ON v.cod_vehiculo_modelo = vm.cod_vehiculo_modelo
WHERE t.cod_guia_remision = <3>;
```

La información obtenida de esta búsqueda (en cualquiera de los dos tipos) se muestra en pantalla de la siguiente forma:

![Captura de Pantalla 2024-06-04 a la(s) 23 42 25](https://github.com/fiis-bd241/grupo01/assets/130816094/f21b91f3-6815-45e0-b428-7541b48b2d23)
![Captura de Pantalla 2024-06-04 a la(s) 23 42 41](https://github.com/fiis-bd241/grupo01/assets/130816094/004eff8e-4a0e-41df-9be1-df70fbad82cf)
![Captura de Pantalla 2024-06-04 a la(s) 23 43 13](https://github.com/fiis-bd241/grupo01/assets/130816094/7d6d8ff5-7f65-4f7d-9d41-65183f76c654)
![Captura de Pantalla 2024-06-04 a la(s) 23 43 22](https://github.com/fiis-bd241/grupo01/assets/130816094/f1ca591b-c45d-4224-95e6-de6d5207876f)

Los estados del Proceso y del Traslado se obtienen según la cantidad de operaciones registradas. Esta lógica se implementa en el backend.

4. **Botón "Registrar operación":** Lleva al usuario a la pantalla adecuada para registrar una operación adicional del proceso encontrado. Es decir, si la última operación registrada del proceso encontrado es de tipo "Picking", se lleva al usuario a la pantalla I304; si es de tipo "Precintado", a la pantalla I305; si es de tipo "Paletizado", a la pantalla I306; si es de tipo "Carga", a la pantalla I307; si es de tipo "Salida", a la pantalla I309; y si es de tipo "Recepción", a la pantalla I310. Si es de tipo "Descarga", el
botón "Registrar operación" no se habilita. Toda esta lógica descrita se implementa en el frontend. Además, el valor del atributo "id_operacion" de la primera operación (de tipo "picking") se pasa como un parámetro llamado "id_operacion_picking" a esta nueva pantalla. 

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301           |
| Código      | I302 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/78136d2c-1f37-4b1f-a89d-61edf840dbbb) |

1.  **Carga de página:** El campo "Fecha" se autocompleta con la fecha actual.

2. **Botón "Agregar mercancía":** Al presionar este botón, se muestra la pantalla I303. Se retorna con un código de stock y su cantidad a transportar, que forman una mercancía. Al hacer esto, se crean dos tipos de botones por cada mercancía, los cuales identificaremos como "*" y "**", como se muestra en la siguiente imagen:

![image](https://github.com/fiis-bd241/grupo01/assets/130816094/00796911-bc32-45a2-b0f0-d3b594f5c973)

*. Este botón lleva al usuario a la pantalla I303. Se realiza el mismo proceso, con la única diferencia de que el código de stock y su cantidad a transportar se ingresan en una mercancía determinada.
**. Este botón elimina el código de stock y su cantidad a transportar en una mercancía y fila determinadas.

La lógica descrita se implementa en el frontend.

3. **Botón "Ingresar":** Se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
NULL,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <6>),
1,
<2>,
<3>,
<4>
)
RETURNING id_operacion;
```
El valor retornado por esta sentencia se almacena en una variable en el backend. Sea esta variable "id_operacion_picking".

Para cada "mercancía", conformada por varios pares de valores de id_stock y su cantidad a transportar, se ejecuta la siguiente sentencia SQL:

``` sql
INSERT INTO mercancia (id_operacion_picking) VALUES (<id_operacion_picking>) RETURNING id_mercancia
```

Sea "id_mercancia" el valor retornado por esta sentencia. Mediante un método implementado en el backend que toma como entradas los valores de las variables "id_operacion_picking" e "id_mercancia" se genera el valor del número de precinto de esta mercancía y se almacena en la variable "nro_precinto". Para cada mercancía se ejecuta la siguiente sentencia SQL:

``` sql
UPDATE mercancia SET nro_precinto = <nro_precinto> WHERE id_mercancia = <id_mercancia>
```

Para cada par de valores id_stock y cantidad de esta mercancía se ejecutan las siguientes sentencias SQL:

``` sql
INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES (<id_mercancia>, <id_stock>, <cantidad>)
```

``` sql
UPDATE stock SET cantidad_disponible = cantidad_disponible - ? WHERE id_stock = <id_stock>
```

Finalmente, se lleva al usuario a la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301           |
| Código      | I303 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/bb65ce7e-6483-478e-acc1-372cec7aa13b) |



|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R302           |
| Código      | I304 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/c3c802ca-5d15-412d-811f-d41d80b8db65) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking".
2.  **Botón "Ingresar":** Se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
2,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R303           |
| Código      | I305 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/67a7b049-5fbb-48b6-85ac-07ca889511ff) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking".
2.  **Botón "Ingresar":** Se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
2,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R304           |
| Código      | I306 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/df11747a-b3a6-488b-aff9-914c9bef5058) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking".
2.  **Botón "Ingresar":** Se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
2,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R305           |
| Código      | I307 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/0d0514fe-217d-49d3-b1e8-04c8ecdec204) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R305           |
| Código      | I308 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/708bd7b5-63fb-4515-a478-a3ac052d7301) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R306           |
| Código      | I309 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/dc002a04-4c28-4deb-bb7d-2da7d3f92294) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking".
2.  **Botón "Ingresar":** Se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
2,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R307           |
| Código      | I310 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/895a7907-cb6d-41d8-ba74-0d42f367bc5c) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking".
2.  **Botón "Ingresar":** Se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
2,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301, R302, R303, R304, R305, R306, R307       |
| Código      | I311 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/aa2aaad7-735b-4a08-a67f-9777d4b7651f) |


### 4. Sentencias SQL módulo de Control

### Caso 1
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R401</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I401</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/7e011093-b923-4e2f-bcd7-b79752030cca">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Ver conductores: 
Se mostrará en pantalla la lista de todos los conductores para poder registrar su disponibilidad en base a los datos correspondiente a cada uno.
``` sql
SELECT 
    t.cod_transportista AS "Código del Conductor",
    t.cod_empleado AS "Código del Empleado",
    lt.descripcion AS "Tipo de Licencia",
    t.fecha_vencimiento_licencia AS "Fecha de Vencimiento de Licencia",
    t.fecha_ultimo_traslado AS "Fecha Último Traslado",
    t.hora_ultimo_traslado AS "Hora Último Traslado",
    te.descripcion AS "Estado del Conductor"
FROM 
    transportista t
JOIN 
    licencia_tipo lt ON t.cod_tipo_licencia = lt.cod_tipo_licencia
JOIN 
    transportista_estado te ON t.cod_estado_transportista = te.cod_estado_transportista;
```

### Caso 2
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R401</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I401</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/bd878778-adab-451b-bc31-8941ec9f724d">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Botón Estado: 
El botón sirve para que el administrador pueda cambiar el estado de disponibilidad del conductor  que puede ser Disponible, No Disponible y Cuarentena.
``` sql
UPDATE Conductor SET cod_estado_transportista = <1> WHERE cod_estado_transportista = 2 AND cod_transportista = <2>
```

### Caso 3
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R402</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I402</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/60d1f8e1-606a-4945-9a68-7de18b34573a">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Ver Vehículos: 
Se mostrará en pantalla la lista de todos los vehículos para poder registrar su disponibilidad en base a los datos correspondiente a cada uno.
``` sql
SELECT 
    v.cod_vehiculo AS "Código del Vehículo",
    v.año_fabricacion AS "Año de Fabricación",
    v.fecha_ultimo_mantenimiento AS "Fecha de Último Mantenimiento",
    v.capacidad_carga AS "Capacidad de Carga",
    vm.descripcion AS "Modelo",
    v.placa AS "Placa",
    pt.tipo_pedido AS "Tipo de Pedido",
    v.fecha_ultimo_viaje AS "Fecha Último Viaje",
    v.hora_ultimo_viaje AS "Hora Último Viaje",
    ve.descripcion AS "Estado del Vehículo"
FROM 
    vehiculo v
JOIN 
    vehiculo_modelo vm ON v.cod_vehiculo_modelo = vm.cod_vehiculo_modelo
JOIN 
    vehiculo_estado ve ON v.cod_vehiculo_estado = ve.cod_vehiculo_estado
JOIN 
    pedido_tipo pt ON v.cod_pedido_tipo = pt.cod_pedido_tipo;

```

### Caso 4
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R402</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I402</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/667ef75e-8da5-4687-8098-1134ab6a3791">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Botón estado: 
El botón sirve para que el administrador pueda cambiar el estado de disponibilidad del vehículo  que puede ser Disponible, No Disponible y Cuarentena.
``` sql
UPDATE Vehículo SET cod_estado_vehiculo = <1> WHERE cod_estado_vehiculo = 2 AND cod_vehiculo = <2>

```

### Caso 5
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R403</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I403,I404,I405,I406,I407</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/df6a3f0e-8aa9-4057-8a2e-e6883df7b452">
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/ba0aba03-5d69-4d5c-8bce-a7fb805b1b7d">
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/4555d051-cfc8-4429-b148-a9baeae1fc67">
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/53e66fca-232a-4d5f-b750-3e882732056b">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Nueva incidencia: 
El administrador podrá registrar una nueva incidencia primero seleccionando el tipo de incidencia que se presenta, dependiendo de la opción del tipo de incidencia que elija le corresponderá un tipo de procedimiento específico basado en un tipo de norma respectivamente.
### Opción 1
Al elegirse esta opción, se está eligiendo un tipo de incidencia relacionado con retraso en la entrega, por ello el tipo de procedimiento también debe ser correspondiente al tipo de incidencia, es decir de tipo A; análogamente sucede con el tipo de norma en el cual se basa el procedimiento para posteriormente darle a registrar. 
``` sql
INSERT INTO incidencia VALUES (cod_incidencia, <6>, fecha_ocurrencia , hora_ocurrencia , <1>, <7> ,<12>)

```
### Opción 2
Al elegirse esta opción, se está eligiendo un tipo de incidencia relacionado con errores en el etiquetado o embalaje, por ello el tipo de procedimiento también debe ser correspondiente al tipo de incidencia, es decir de tipo B; análogamente sucede con el tipo de norma en el cual se basa el procedimiento para posteriormente darle a registrar. 
``` sql
INSERT INTO incidencia VALUES (cod_incidencia,<6>, fecha_ocurrencia , hora_ocurrencia , <2>, <8> ,<12>)

```
### Opción 3
Al elegirse esta opción, se está eligiendo un tipo de incidencia relacionado con fallas en la documentación, por ello el tipo de procedimiento también debe ser correspondiente al tipo de incidencia, es decir de tipo C; análogamente sucede con el tipo de norma en el cual se basa el procedimiento para posteriormente darle a registrar. 
``` sql
INSERT INTO incidencia VALUES (cod_incidencia,<6>, fecha_ocurrencia , hora_ocurrencia , <3>, <9> ,<13>)

```
### Opción 4
Al elegirse esta opción, se está eligiendo un tipo de incidencia relacionado con problemas mecánicos del vehículo, por ello el tipo de procedimiento también debe ser correspondiente al tipo de incidencia, es decir de tipo D; análogamente sucede con el tipo de norma en el cual se basa el procedimiento para posteriormente darle a registrar. 
``` sql
INSERT INTO incidencia VALUES (cod_incidencia,<6>, fecha_ocurrencia , hora_ocurrencia , <4>, <10> ,<14>)

```
### Opción 5
Al elegirse esta opción, se está eligiendo un tipo de incidencia relacionado con error en la asignación de la ruta, por ello el tipo de procedimiento también debe ser correspondiente al tipo de incidencia, es decir de tipo E; análogamente sucede con el tipo de norma en el cual se basa el procedimiento para posteriormente darle a registrar. 
``` sql
INSERT INTO incidencia VALUES (cod_incidencia,<6>, fecha_ocurrencia , hora_ocurrencia , <5>, <11> ,<15>)

```

### Caso 6
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R403</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I407</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/233260db-d6b7-44d9-867c-23bcf10d1257">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Ver Incidencias: 
Se mostrará en pantalla la lista de todas las incidencias para poder registrar el grado de atención brindado en base a los datos correspondiente a cada uno.

``` sql
SELECT 
    i.cod_incidencia AS "Código de Incidencia",
    i.id_traslado AS "Código de Traslado",
    it.descripcion AS "Descripción del Tipo de Incidencia",
    i.fecha_ocurrencia AS "Fecha de Ocurrencia",
    i.hora_ocurrencia AS "Hora de Ocurrencia",
    i.cod_estado_incidencia AS "Código de Estado de Incidencia"
FROM 
    incidencia i
JOIN 
    incidencia_tipo it ON i.cod_tipo_incidencia = it.cod_tipo_incidencia;

```

### Caso 7
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R404</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I408</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/6c2860f5-ae9d-4816-9465-e2ef1818c52c">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Botón Estado: 
El botón sirve para que el administrador pueda cambiar el estado de atención de la incidencia  que puede ser Solucionado o Pendiente. 

``` sql
UPDATE incidencia SET cod_estado_incidencia = <1> WHERE cod_estado_incidencia = 2 AND cod_incidencia = <2>

```

### Caso 8
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R404</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I409</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/02de333f-76ab-493f-a5d7-f57006eb0581">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Mostrar incidencias filtradas: 
Se mostrará en pantalla el listado de incidencias filtradas por determinado periodo. 

``` sql
SELECT 
    cod_incidencia AS "Código de Incidencia",
    id_traslado AS "Código de Traslado",
    (SELECT descripcion FROM incidencia_tipo WHERE incidencia_tipo.cod_tipo_incidencia = incidencia.cod_tipo_incidencia) AS "Descripción del Tipo de Incidencia",
    fecha_ocurrencia AS "Fecha de Ocurrencia",
    hora_ocurrencia AS "Hora de Ocurrencia",
    cod_estado_incidencia AS "Código de Estado de Incidencia"
FROM 
    incidencia
WHERE 
    fecha_ocurrencia >= <1> AND fecha_ocurrencia <  <1>;

```


### 5. Sentencias SQL módulo de Reportes

#### Caso 1
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R503</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I501</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/e2477c32-ac19-4a19-932b-ab8a4c5217a2">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de reportes programados: Cuando el usuario entre al modulo de reportes, se llenará la tabla de reportes programados según su id.
``` sql 
SELECT 
	pr.cod_programacion_reporte,
	rfo.descripcion formato,
	rt.descripcion tipo,
	rfe.descripcion frecuencia,
	pr.fecha_inicio, 
	pr.fecha_fin 
FROM programacion_reporte AS pr
INNER JOIN reporte_formato AS rfo ON rfo.cod_reporte_formato = pr.cod_reporte_formato
INNER JOIN reporte_tipo AS rt ON rt.cod_reporte_tipo = pr.cod_reporte_tipo
INNER JOIN reporte_frecuencia AS rfe ON rfe.cod_reporte_frecuencia = pr.cod_reporte_frecuencia
WHERE pr.cod_reporte_estado = 1 AND pr.cod_representante = <1>
ORDER BY pr.cod_programacion_reporte;
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.
El cod_reporte_estado = 1 corresponde a "Activo".

3. Carga de inventario: Cuando el usuario entre al modulo de reportes, se llenará la tabla de elementos catálogo.
``` sql 
SELECT 
	ec.id_elemento_catalogo, 
	ec.nombre,
	ec.peso_unitario,
	ecu.descripcion AS unidad,
	ect.descripcion AS tipo,
	ep.descripcion AS produccion,
	SUM(st.cantidad) AS cantidad
FROM elemento_catalogo AS ec
LEFT JOIN stock AS st ON st.id_elemento_catalogo = ec.id_elemento_catalogo
LEFT JOIN elemento_catalogo_unidad AS ecu ON ecu.cod_unidad = ec.cod_unidad
LEFT JOIN elemento_catalogo_tipo AS ect ON ect.id_elemento_catalogo_tipo = ec.id_elemento_catalogo_tipo
LEFT JOIN elemento_produccion AS ep ON ep.id_elemento_produccion = ect.id_elemento_produccion
GROUP BY ec.id_elemento_catalogo, ecu.cod_unidad, ect.id_elemento_catalogo_tipo, ep.id_elemento_produccion;
```
#### Caso 2
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R501</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I502</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/535c570e-bfca-44c8-bcca-614900b5c099">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de formatos: Se llenará la lista de formatos de reportes a seleccionar.
``` sql 
SELECT cod_reporte_formato, descripcion FROM reporte_formato;
```
3. Carga de tipos: Se llenará la lista de tipos de reportes a seleccionar.

``` sql 
SELECT cod_reporte_tipo, descripcion FROM reporte_tipo; 
```
4. Botón generar: Cuando el usuario presione el botón generar, se generará un reporte.

``` sql 
INSERT INTO reporte
(cod_representante, cod_reporte_formato, cod_reporte_tipo)
VALUES
(<1>, <2>, <3>);
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.

#### Caso 3
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R502</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I503</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/e534c9ea-dca5-44ce-a337-e3b0e4dcf9bc">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

2. Carga de frecuencia: Se llenará la lista de frecuencias para programar reportes.
``` sql
SELECT cod_reporte_frecuencia, descripcion FROM reporte_frecuencia;
```
3. Carga de formatos: Se llenará la lista de formatos de reportes a seleccionar.

``` sql
SELECT cod_reporte_formato, descripcion FROM reporte_formato;
```
4. Carga de tipos: Se llenará la lista de tipos de reportes a seleccionar.

``` sql
SELECT cod_reporte_tipo, descripcion FROM reporte_tipo; 
```
7. Botón programar: Cuando el usuario presione el botón generar, se generará un reporte.

``` sql
INSERT INTO programacion_reporte
(cod_representante, cod_reporte_frecuencia, cod_reporte_formato, cod_reporte_tipo,, fecha_inicio, fecha_fin, cod_reporte_estado ) 
VALUES
(<1>, <2>, <3>, <4>, <5>, <7>, 1);
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.
El cod_reporte_estado = 1 corresponde a "Activo".

#### Caso 4
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R504</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I504</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/a450e6c6-fd86-4fac-8730-46b13ef6402d">
         <img src="https://github.com/fiis-bd241/grupo01/assets/161625149/0d2bc1d4-874c-495d-8059-e85b779a0076">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>
1. Carga de reportes programados: Cuando el usuario entre al modulo de reportes, se llenará la tabla de reportes programados según su id.

``` sql 
SELECT 
    pr.cod_programacion_reporte,
    rfo.descripcion formato,
    rt.descripcion tipo,
    rfe.descripcion frecuencia,
    pr.fecha_inicio, 
    pr.fecha_fin 
FROM programacion_reporte AS pr
INNER JOIN reporte_formato AS rfo ON rfo.cod_reporte_formato = pr.cod_reporte_formato
INNER JOIN reporte_tipo AS rt ON rt.cod_reporte_tipo = pr.cod_reporte_tipo
INNER JOIN reporte_frecuencia AS rfe ON rfe.cod_reporte_frecuencia = pr.cod_reporte_frecuencia
WHERE pr.cod_reporte_estado = 1 AND pr.cod_representante = <1>
ORDER BY pr.cod_programacion_reporte;
```
Donde `<1>` corresponde al código del usuario del inicio de sesión.
El cod_reporte_estado = 1 corresponde a "Activo".

Al haber presionado antes el botón de "Gráficos", se carga otra pantalla con diversos gráficos de:

2. Carga de gráfica de pedidos por mes:
``` sql
WITH meses AS (
    SELECT generate_series(1, 12) AS mes_num
)
SELECT 
    TO_CHAR(TO_DATE(mes_num::text, 'MM'), 'TMMonth') AS mes,
    COUNT(pe.fecha_registro) AS total_pedidos FROM meses
LEFT JOIN 
    pedido AS pe ON EXTRACT(MONTH FROM pe.fecha_registro) = meses.mes_num
    AND EXTRACT(YEAR FROM pe.fecha_registro) = 2024
GROUP BY meses.mes_num
ORDER BY meses.mes_num;
```
3. Carga de productos más pedidos: Aparecerán barras según el límite escogido:
``` sql
SELECT ec.id_elemento_catalogo, ec.nombre, SUM(dtp.cantidad) AS cantidad FROM pedido AS pe
INNER JOIN ticket AS t ON t.cod_ticket = pe.cod_ticket AND pe.cod_pedido_tipo = 'V'
INNER JOIN detalle_ticket_producto AS dtp ON dtp.cod_ticket = t.cod_ticket
INNER JOIN elemento_catalogo AS ec ON ec.id_elemento_catalogo = dtp.id_elemento_catalogo
GROUP BY ec.id_elemento_catalogo
ORDER BY cantidad DESC LIMIT <3>;
```
El `<3>` corresponde a la cantidad escogida de elementos catálogos para mostrar en el gráfico de barras. <br>

4. Cantidad de reclamos por mes:
``` sql
WITH meses AS (
    SELECT generate_series(1, 12) AS mes_num
)
SELECT 
    TO_CHAR(TO_DATE(mes_num::text, 'MM'), 'TMMonth') AS mes,
    COUNT(re.fecha_reclamo) AS total_reclamos FROM meses
LEFT JOIN 
    reclamo AS re ON EXTRACT(MONTH FROM re.fecha_reclamo) = meses.mes_num
    AND EXTRACT(YEAR FROM re.fecha_reclamo) = 2024
GROUP BY meses.mes_num
ORDER BY meses.mes_num;
```
5. Tiempo medio de resolución de reclamos por su nivel de urgencia:
``` sql
SELECT 
    nu.cod_nivel_urgencia, 
    nu.descripcion, 
    COALESCE(SUM(se.fecha_resolucion - re.fecha_reclamo)/COUNT(re.cod_reclamo),0) AS tiempo_medio,
    COUNT(re.cod_reclamo) AS cantidad
FROM nivel_urgencia AS nu
LEFT JOIN reclamo AS re ON re.cod_nivel_urgencia = nu.cod_nivel_urgencia
LEFT JOIN seguimiento AS se ON se.cod_seguimiento = re.cod_seguimiento
GROUP BY nu.cod_nivel_urgencia;
```
6. Cantidad de reclamos por tipo y nivel de urgencia
``` sql
SELECT 
    rt.cod_tipo_reclamo,
    rt.descripcion,
    COUNT(re.cod_reclamo) AS total,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'B' THEN 1 ELSE 0 END) AS urgencia_baja,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'M' THEN 1 ELSE 0 END) AS urgencia_media,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'A' THEN 1 ELSE 0 END) AS urgencia_alta
FROM reclamo_tipo AS rt
LEFT JOIN reclamo AS re ON re.cod_tipo_reclamo = rt.cod_tipo_reclamo
LEFT JOIN nivel_urgencia AS nu ON nu.cod_nivel_urgencia = re.cod_nivel_urgencia
GROUP BY rt.cod_tipo_reclamo
ORDER BY rt.cod_tipo_reclamo;
```
7. Tiempo medio para realizar cada operación en almacén:
``` sql
SELECT 
    ot.cod_tipo_operacion, 
    ot.descripcion, 
    COALESCE(SUM(hora_fin-hora_inicio)/COUNT(*),'00:00:00') as operacion_tipo_tiempo_medio
FROM operacion_tipo AS ot
LEFT JOIN operacion AS o ON o.cod_tipo_operacion = ot.cod_tipo_operacion 
GROUP BY ot.cod_tipo_operacion;
```
8. Descripción de tipos de reclamos: (Se obtiene de la parte 6.)
``` sql
SELECT 
    rt.cod_tipo_reclamo,
		rt.descripcion,
    COUNT(re.cod_reclamo) AS total,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'B' THEN 1 ELSE 0 END) AS urgencia_baja,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'M' THEN 1 ELSE 0 END) AS urgencia_media,
    SUM(CASE WHEN nu.cod_nivel_urgencia = 'A' THEN 1 ELSE 0 END) AS urgencia_alta
FROM reclamo_tipo AS rt
LEFT JOIN reclamo AS re ON re.cod_tipo_reclamo = rt.cod_tipo_reclamo
LEFT JOIN nivel_urgencia AS nu ON nu.cod_nivel_urgencia = re.cod_nivel_urgencia
GROUP BY rt.cod_tipo_reclamo
ORDER BY rt.cod_tipo_reclamo;
```

### 6. Sentencias SQL módulo de Reclamos

#### Caso 1
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I602</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/062cd47b-2932-4d35-a0cb-1d06bda1eea8">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Al presionar el botón clientes internos o externos, esto servirá para llenar la lista desplegable de los nombres de clientes de la interfaz I604.

``` sql
SELECT cl.cod_cliente, cl.nombre FROM cliente AS cl
WHERE cl.cod_cliente_tipo = 'valor1’ 
```
Donde el valor1 puede ser ‘I’ o ‘E’.

2. Al presionar el botón aceptar se crea una fila adicional en la tabla reclamo.

``` sql 
INSERT INTO reclamo (cod_representante) VALUES (null);  
```

#### Caso 2
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I604</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/f270af31-ee31-46ea-acba-55c338a22938">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Al elegir un cliente, se llena la lista desplegable siguiente con los nombres de los representantes asociados al cliente.

``` sql 
SELECT 
	re.cod_representante, 
	CONCAT(pe.prenombre,' ',pe.primer_apellido,' ',pe.segundo_apellido) representante
FROM representante AS re 
INNER JOIN cliente AS cl ON cl.cod_cliente = re.cod_cliente
INNER JOIN persona AS pe ON pe.cod_persona = re.cod_persona
WHERE cl.cod_cliente = valor1;
```
Donde el valor1 es el código del cliente escogido.

2. Al elegir un representante, se llena las casillas de cargo o posición, correo electrónico empresarial y dirección personal automáticamente.

``` sql 
SELECT 
	re.cargo,
	re.correo_empresarial,
	pe.direccion
FROM representante AS re 
INNER JOIN cliente AS cl ON cl.cod_cliente = re.cod_cliente
INNER JOIN persona AS pe ON pe.cod_persona = re.cod_persona
WHERE cl.cod_cliente = valor1 AND re.cod_representante = valor2;
```
Donde el valor1 es el código del cliente escogido.

Donde el valor2 es el código del representante escogido.

3. Al presionar siguiente se inserta el codigo del representante en el reclamo y se llenan los tickets asociados al representante a una lista en la interfaz I605 (siguiente interfaz).

``` sql 
UPDATE reclamo
SET cod_representante = valor2
WHERE reclamo.cod_reclamo = valor3 
```

``` sql 
SELECT ti.cod_ticket FROM pedido AS pe
INNER JOIN representante AS re ON re.cod_representante = pe.cod_representante
INNER JOIN ticket AS ti ON ti.cod_ticket = pe.cod_ticket
WHERE re.cod_representante = valor2;
```
Donde el valor2 es el código del representante escogido.

Donde el valor3 es el código del reclamo actual.

#### Caso 3
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I605</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/89933b6e-44b4-460c-af3f-e83027a88aab">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Al elegir un ticket, se llena la lista desplegable siguiente con los nombres de los productos asociados al ticket.

``` sql 
SELECT ec.id_elemento_catalogo, ec.nombre FROM ticket AS ti  
INNER JOIN detalle_ticket_producto AS dtp ON dtp.cod_ticket = ti.cod_ticket 
INNER JOIN elemento_catalogo AS ec ON ec.id_elemento_catalogo = dtp.id_elemento_catalogo 
WHERE ti.cod_ticket = valor1;
```
Donde valor1 es el código del ticket escogido.

2. Al elegir un producto, se llena las casillas de fecha de adquisición, nro de lote y cantidad adquirida automáticamente.

``` sql 
SELECT ti.fecha_entrega, dtp.cantidad, st.nro_lote, ec.nombre FROM ticket AS ti  
INNER JOIN detalle_ticket_producto AS dtp ON dtp.cod_ticket = ti.cod_ticket 
INNER JOIN elemento_catalogo AS ec ON ec.id_elemento_catalogo = dtp.id_elemento_catalogo 
LEFT JOIN stock AS st ON st.id_elemento_catalogo = ec.id_elemento_catalogo  
WHERE ti.cod_ticket = valor1 AND ec.cod_elemento_catalogo = valor2;
```
Donde valor1 es el código del ticket escogido.

Donde valor2 es el código del producto escogido.

3. Al apretar el botón siguiente se va a actualizar el código del pedido en el reclamo.

``` sql 
UPDATE reclamo
SET cod_pedido = (
    SELECT cod_pedido
    FROM ticket
    INNER JOIN pedido ON pedido.cod_ticket = ticket.cod_ticket
    WHERE ticket.cod_ticket = valor
)
WHERE reclamo.cod_reclamo = valor3;
```
Donde el valor3 es el código del reclamo actual.

#### Caso 4
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I606</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/0fb7177f-64e7-4ef2-b616-34985d9844eb">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Se llenará la lista de tipos de reclamo a seleccionar.

``` sql 
SELECT * FROM reclamo_tipo;
```

2. Se llenará la lista de niveles de urgencia a seleccionar.

``` sql 
SELECT * FROM nivel_urgencia;
```

3. Al apretar el botón siguiente se actualiza el código del tipo, la descripción, el código del nivel de urgencia y la fecha de incidencia en el reclamo.

``` sql 
UPDATE reclamo
SET cod_tipo_reclamo = valor1, comentario = ‘valor2’, cod_nivel_urgencia = valor3, fecha_suceso = ‘valor4’ 
WHERE reclamo.cod_reclamo = valor5
```
Donde el valor1 es el código del tipo de reclamo escogido.

Donde el ‘valor2’ es el comentario escrito.

Donde el valor3 es el código del nivel de urgencia escogido.

Donde el ‘valor4’ es la fecha escogida.

Donde el valor5 código del reclamo actual.

#### Caso 5
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I607</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/bd36776a-fdfe-4236-96a1-0c108270957a">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Al presionar el botón siguiente se crea una evidencia con el valor de código reclamo actual, el código del tipo de evidencia, el código de tipo de archivo y el nombre en evidencia. Todo esto se puede ejecutar “n” veces. (Uno por cada archivo adjuntado).

``` sql 
INSERT INTO evidencia (cod_reclamo, cod_tipo_evidencia, cod_tipo_archivo, nombre_evidencia)
VALUES (valor1, 'valor2', valor3, 'valor4');
```
Donde el valor1 es el código del reclamo actual.

Donde el ‘valor2’ es el tipo de evidencia del adjunto.

Donde el valor3 es el tipo de archivo del adjunto.

Donde el ‘valor4’ es el nombre del adjunto.

#### Caso 6
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I608</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/8dda68d5-18a8-446f-a6e7-d76d379d46a1">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Se llenará la lista de áreas responsables a seleccionar.

``` sql 
SELECT * FROM cliente AS cl WHERE cl.cod_cliente_tipo = 'I';
```

2. Se llenará la lista de acciones a seleccionar.

``` sql 
SELECT * FROM accion_tipo; 
```

3. Al presionar siguiente se crea un seguimiento, insertando el código de cliente interno (área encargada del seguimiento), el código de tipo de acción, el comentario en seguimiento. Además, se actualiza el código seguimiento en el reclamo.

``` sql 
INSERT INTO seguimiento (cod_cliente_interno,cod_tipo_accion,comentario) 
VALUES (valor1,’valor2’,’valor3’);
```
Donde el valor1	 es el código del área elegida.

Donde el ‘valor2’ es el código del tipo de acción elegida.

Donde el ‘valor3’ es el comentario escrito.

``` sql 
UPDATE reclamo
SET cod_seguimiento = valor4
WHERE reclamo.cod_reclamo = valor5
```
Donde el valor4 es el código del seguimiento actual.

Donde el valor5 es el código del reclamo actual.

#### Caso 7
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R601</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I609</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/3e68dad1-074e-401c-b2c9-22fe86555604">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Seleccionar el mayor valor más uno del número de caso de un área.

``` sql 
SELECT MAX(numero_caso) + 1
FROM seguimiento
WHERE cod_cliente_interno = valor1
```
Donde el valor1 es el código del área elegida.

2. Se llenará la lista de estados a seleccionar.

``` sql 
SELECT * FROM estado_reclamo
```

3. Se actualiza la fecha de resolución y el número de caso en evidencia; y el código del estado en reclamo.

``` sql 
UPDATE seguimiento
SET fecha_resolucion = 'valor2', 
    numero_caso = valor3
WHERE cod_seguimiento = valor4 
  AND 'valor2' > (
      SELECT MAX(fecha_resolucion) 
      FROM seguimiento 
      WHERE cod_seguimiento != valor4
  );
```
Donde el ‘valor2’ es la fecha de resolución elegida.

Donde el valor3 es el número de caso.

Donde el valor4 es el código del seguimiento actual.

``` sql 
UPDATE reclamo
SET cod_estado_reclamo = valor4
WHERE reclamo.cod_reclamo = valor5
```
Donde el valor4 es el código del estado del reclamo elegido.

Donde el valor5 es el código reclamo actual.

#### Caso 8
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R602</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I601</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/b35d196f-c59b-4635-bd8d-5b391d3b2808">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Mostrar la lista de reclamos.

``` sql 
SELECT
	r.cod_reclamo,
	er.descripcion,
	r.fecha_reclamo,
	c.nombre || ' (' || c.ruc || ')' AS "cliente (ruc)",
	ct.tipo_cliente,
	rt.cod_tipo_reclamo,
	c1.nombre AS "área responsable"
FROM
	reclamo r
INNER JOIN
	estado_reclamo er ON r.cod_estado_reclamo = er.cod_estado_reclamo
INNER JOIN
	representante re ON r.cod_representante = re.cod_representante
INNER JOIN
	cliente c ON re.cod_cliente = c.cod_cliente
INNER JOIN
	cliente_tipo ct ON c.cod_cliente_tipo = ct.cod_cliente_tipo
INNER JOIN
	reclamo_tipo rt ON r.cod_tipo_reclamo = rt.cod_tipo_reclamo
INNER JOIN
	seguimiento s ON r.cod_seguimiento = s.cod_seguimiento
INNER JOIN
	cliente c1 ON s.cod_cliente_interno = c1.cod_cliente
ORDER BY cod_reclamo;
```

2. Llenar el visor de reclamos

``` sql 
SELECT 
	cl.nombre, 
	CONCAT(pe.prenombre,' ',pe.primer_apellido,' ',pe.segundo_apellido) representante,
	cargo,
	correo_empresarial,
	pe.direccion
FROM reclamo r
INNER JOIN representante AS re ON re.cod_representante = r.cod_representante
INNER JOIN cliente AS cl ON cl.cod_cliente = re.cod_cliente
INNER JOIN persona AS pe ON pe.cod_persona = re.cod_persona
WHERE r.cod_reclamo = valor1;
```
Donde valor1 es el código del reclamo elegido.

``` sql 
SELECT 
	ti.cod_ticket,
	ec.nombre,
	ti.fecha_entrega,
	st.nro_lote,
	dtip.cantidad
FROM reclamo r
INNER JOIN pedido AS pe ON r.cod_pedido = pe.cod_pedido
INNER JOIN ticket AS ti ON pe.cod_ticket = ti.cod_ticket
INNER JOIN detalle_ticket_producto AS dtip ON ti.cod_ticket = dtip.cod_ticket
INNER JOIN elemento_catalogo AS ec ON dtip.cod_elemento_catalogo = ec.cod_elemento_catalogo
INNER JOIN stock AS st ON ec.cod_elemento_catalogo = st.cod_elemento_catalogo
WHERE r.cod_reclamo = valor1;
```
Donde valor1 es el código del reclamo elegido.

``` sql 
SELECT 
	rt.descripcion,
	r.comentario,
	r.fecha_suceso,
	r.fecha_reclamo,
	nu.descripcion
FROM reclamo r
INNER JOIN reclamo_tipo AS rt ON r.cod_tipo_reclamo = rt.cod_tipo_reclamo
INNER JOIN nivel_urgencia AS nu ON r.cod_nivel_urgencia = nu.cod_nivel_urgencia
WHERE r.cod_reclamo = valor1;
```
Donde valor1 es el código del reclamo elegido.

``` sql 
SELECT 
	CONCAT(ev.nombre_evidencia,'.',at.descripcion) evidencia
FROM reclamo r
INNER JOIN evidencia AS ev ON r.cod_reclamo = ev.cod_reclamo
INNER JOIN archivo_tipo AS at ON ev.cod_tipo_archivo = at.cod_tipo_archivo
WHERE r.cod_reclamo = valor1;
```
Donde valor1 es el código del reclamo elegido.

``` sql 
SELECT 
	cl.nombre,
	at.descripcion,
	se.comentario
FROM reclamo r
INNER JOIN seguimiento AS se ON r.cod_seguimiento = se.cod_seguimiento
INNER JOIN accion_tipo AS at ON se.cod_tipo_accion = at.cod_tipo_accion
INNER JOIN cliente AS cl ON se.cod_cliente_interno = cl.cod_cliente
WHERE r.cod_reclamo = valor1;
```
Donde valor1 es el código del reclamo elegido.

``` sql 
SELECT 
	se.fecha_resolucion,
	se.numero_caso,
	er.descripcion
FROM reclamo r
INNER JOIN seguimiento AS se ON r.cod_seguimiento = se.cod_seguimiento
INNER JOIN estado_reclamo AS er ON r.cod_estado_reclamo = er.cod_estado_reclamo
WHERE r.cod_reclamo = valor1;
```
Donde valor1 es el código del reclamo elegido.

#### Caso 9
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>R602</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I603</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/130238034/db5c55fe-47b2-4c0e-8673-87cddf7cdc71">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

1. Se llenará la lista de estados a seleccionar.

``` sql 
SELECT * FROM estado_reclamo
```

2. Se actualizará el estado_reclamo
``` sql 
UPDATE seguimiento s
JOIN reclamo r ON s.cod_seguimiento = r.cod_seguimiento
JOIN estado_reclamo er ON er.cod_estado_reclamo = r.cod_estado_reclamo
SET s.numero_caso = s.numero_caso - 1
WHERE s.numero_caso > 0 
AND s.cod_cliente_interno = valor1
AND er.cod_estado_reclamo = ‘valor2’;
```
Donde el ‘valor2’ es ‘resuelto’ o ‘rechazado’. 

## 3. Carga de Datos

```sql
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

INSERT INTO incidencia_estado (cod_estado_incidencia,descripcion) VALUES
  ( 'S',  'Solucionado'),
  ( 'P',  'Pendiente');    

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


INSERT INTO reporte_frecuencia (cod_reporte_frecuencia,descripcion,cantidad_tiempo,unidad_tiempo) VALUES
  ( 1,  'Diario'    ,         1,  'dia'),
  ( 2,  'Semanal'   ,         7,  'dia'), 
  ( 3,  'Quincenal' ,         15, 'dia'),
  ( 4,  'Mensual'   ,         1,  'mes'),
  ( 5,  'Trimestral',         3,  'mes'),
  ( 6,  'Semestral' ,         6,  'mes'),
  ( 7,  'Prueba (5 seg)'    , 5,  'segundo');

INSERT INTO reporte_formato (cod_reporte_formato,descripcion) VALUES
  ( 1,  'docx'),
  ( 2,  'pdf'), 
  ( 3,  'xlsx'),
  ( 4,  'csv');

INSERT INTO reporte_tipo (cod_reporte_tipo,descripcion) VALUES
  ( 1,  'General'),
  ( 2,  'Reclamos'), 
  ( 3,  'Pedidos'),
  ( 4,  'Almacen'),
  ( 5,  'Seguimiento');

INSERT INTO reporte_estado (cod_reporte_estado,descripcion) VALUES
  ( 1,  'Activo'),
  ( 2,  'Inactivo');  

INSERT INTO persona(cod_estado_civil, cod_nacionalidad, cod_genero, dni, primer_apellido, segundo_apellido, prenombre, direccion ) VALUES
  ( 1,  1,  1,  '77688137',   'López',       'García',     'Juan',      'AV BENAVIDES 1015 MIRAFLORES, Lima'),
  ( 1,  1,  1,  '52359123',   'Mendoza',     'Mendoza',    'Luis',      'Av. Alameda Del Corregidor 3023, Lima'),
  ( 1,  1,  1,  '76464764',   'Rodríguez',   'Valdés',     'Pedro',     'Avenida Heroes Del Cenepa, Lt. 120, Lima'),
  ( 2,  1,  2,  '46729764',   'Martínez',    'Perez',      'Ana',       '2450, Of. 602, Edificio El Dorado, Lima, Trujillo'),
  ( 1,  1,  1,  '79641337',   'Hernández',   'Flores',     'Luis',      'Avenida Los Alamos 345, Chiclayo'),
  ( 3,  1,  2,  '45424873',   'González',    'Martinez',   'Laura',     'Santa Iluminata, Mz. A Lt. 6, Lima'),
  ( 1,  1,  1,  '73283354',   'Ramírez',     'Ramírez',    'Carlos',    'AV DOLORES 119, JOSE LUIS BUSTAMANTE Y RIVERO, Lima'),
  ( 3,  1,  2,  '43783734',   'Vargas',      'Guerrero',   'Diana',     'Avenida Los Cerezos 234, Iquitos'),
  ( 2,  1,  1,  '45373782',   'Paredes',     'Osvaldo',    'Roberto',   'Calle Las Palmeras 567, Tacna'),
  ( 1,  1,  2,  '43787671',   'Torres',      'Lopez',      'Sandra',    'Avenida Los Pinos 890, Puno'),
  ( 2,  1,  1,  '78978464',   'Pérez',       'Alvarez',    'Juan',      'Calle Víctor Reynel, 766, Lima'),
  ( 3,  1,  2,  '75696723',   'García',      'Ruiz',       'Ana',       'Cl 2 Lt 17, Bellavista, Callao'),
  ( 5,  1,  1,  '45396782',   'Rodríguez',   'Jiménez',    'Pedro',     'Cl De La Colina, Narciso Nro 911, Lima'),
  ( 2,  1,  2,  '16786781',   'Fernández',   'Hernández',  'Laura',     'Avenida Trinidad Morán, Mz. J Lt. 2 León Xvi, Arequipa'),
  ( 1,  1,  1,  '16877361',   'Gómez',       'Quispe',     'Miguel',    'Gutiérrez De La Fuente,119,Iv Centenario, Arequipa'),
  ( 2,  1,  2,  '16786455',   'Díaz',        'Navarro',    'Elena',     'LT 25, URB MANUEL AREVALO ETAPA III, LA ESPERANZA, La Libertad'),
  ( 1,  1,  1,  '74524324',   'Sánchez',     'Pérez',      'David',     'AV 13 DE NOVIEMBRE 994 OF 202, EL TAMBO, Junin'),
  ( 4,  1,  2,  '43787353',   'Martín',      'Velázquez',  'Sara',      'Jirón Moquegua, 140, Huanuco'),
  ( 1,  1,  1,  '65775732',   'Ruiz',        'Ruíz',       'Javier',    'Calle Santa Catalina, 384, Cuzco'),
  ( 2,  1,  2,  '86876711',   'Gutiérrez',   'Arroyo',     'Paula',     'AV NICOLAS DE PIEROLA 1518, LA ESPERANZA, La Libertad'),
  ( 3,  1,  1,  '14242781',   'López',       'Cruzado',    'Daniel',    'Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa'),
  ( 2,  1,  2,  '42343272',   'Hernández',   'Flores',     'Lucía',     'CA SANTA MARTA 302 INT 25, AREQUIPA, Arequipa'),
  ( 1,  1,  1,  '78943713',   'Pérez',       'Espinoza',   'Alejandro', 'Av Joaquín Madrid Nro 141, Lima'),
  ( 1,  1,  1,  '78567231',   'Sánchez',     'Chávez',     'David',     'Jirón Sinchi Roca, 310, 376, La Libertad'),
  ( 2,  1,  2,  '20220002',   'Martín',      'Cruz',       'Sara',      'Isla Sta Cruz Mza C Lt41 Los Cedros de Villa - Chorrillos, Arequipa');

INSERT INTO cliente (cod_cliente_tipo, cod_cliente_estado, nombre , ruc , razon_social, fecha_registro) VALUES
  ('I', 'A',   'Almacen', '20100154308','SAN FERNANDO S.A.', '2002-06-01'),
  ('I', 'A' ,'Atencion al cliente' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'),
  ('I', 'A' ,'Produccion' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'),
  ('I', 'A' ,'Mantenimiento' , '20100154308', 'SAN FERNANDO S.A.', '2002-06-01'),
  ('E', 'A' ,'PLAZA VEA' , '20100070970', 'SOCIEDAD ANONIMA O S.P.S.A.', '2023-05-15'),
  ('E', 'A' ,'Tottus Hipermercado-Tottus' , '20508565934', 'HIPERMERCADOS TOTTUS S.A', '2022-11-28'),
  ('E', 'A' ,'Wong & Metro' , '20109072177', 'Cencosud Retail Peru S.A.', '2023-07-03'),
  ('E', 'A' ,'Kentucky Fried Chicken' , '20100123330', 'DELOSI S.A.', '2022-10-12'),
  ('E', 'A' ,'Pardos Chicken-Planet-Pasquale' , '20510885229', 'SANGUCHES DEL PERU S.A.C', '2024-01-25'),
  ('E', 'A' ,'Rockys' , '20513427710', 'Grupo Rokys S.A.C.', '2023-03-08');

INSERT INTO ubicacion (longitud, latitud) VALUES
  (-11.556595, -77.203523),
  (-11.501818, -77.226304),
  (-11.872139, -77.127159),
  (-11.866499, -77.073656),
  (-11.518728, -77.205331),
  (-11.547767, -77.203855),
  (-11.593654, -77.201504),
  (-11.728288, -77.165746),
  (-11.834073, -77.112874),
  (-11.928733, -77.072607),
  (-12.007750, -77.056319),
  (-11.993166, -77.063375),
  (-12.059688, -77.041633),
  (-12.089659, -77.023307),
  (-12.028432, -77.084411),
  (-12.058004, -77.037207),
  (-12.051560, -77.031446),
  (-12.173548, -76.990706),
  (-12.004222, -77.093759),
  (-12.034577, -77.047632),
  (-12.072477, -77.065383),
  (-12.072888, -77.008987),
  (-12.049493, -77.112024),
  (-12.006146, -77.001076),
  (-12.180751, -77.002283),
  (-12.169918, -77.023956),
  (-11.933034, -77.054910),
  (-12.086610, -77.033145);

INSERT INTO ticket (fecha_entrega) VALUES
  ('2019-04-27'),
  ('2021-04-22'),
  ('2022-01-20'),
  ('2022-01-22'),
  ('2022-05-22'),
  ('2022-11-18'),
  ('2023-01-20'),
  ('2023-01-22'),
  ('2023-03-20'),
  ('2023-04-20'),
  ('2023-05-20'),
  ('2023-05-22'),
  ('2023-06-20'),
  ('2023-09-16'),
  ('2023-11-22'),
  ('2023-12-19'),
  ('2024-01-22'),
  ('2024-02-22'),
  ('2024-04-20'),
  ('2024-04-22');

INSERT INTO vehiculo (cod_vehiculo_estado,cod_vehiculo_modelo,anio_fabricacion, capacidad_carga, fecha_ultimo_mantenimiento,cod_pedido_tipo,fecha_ultimo_viaje, hora_ultimo_viaje,placa) VALUES
  ('D', 'F', 2008, 850, '2022-01-10','A','2024-01-24','04:53:21', 'A4E-123'),
  ('N', 'C', 2009, 620.5, '2023-02-12','A','2024-02-24','04:53:21','D3F-756'),
  ('C', 'S', 2020, 440.2, '2022-03-05','V','2024-03-15','04:53:21','G5I-789'), 
  ('D', 'S', 2015, 550, '2021-04-08','V','2024-04-14','04:53:21', 'J4L-223'),
  ('N', 'F', 2012, 650, '2023-05-15','A','2024-05-27','04:53:21','M9O-456'),
  ('C', 'C', 2021, 600, '2023-06-02','V','2024-06-24', '04:53:21','P3R-789'),
  ('C', 'S', 2006, 620.4, '2021-07-18','A','2024-07-24','04:53:21','S5U-123'),
  ('D', 'F', 2017, 620.2, '2022-08-10','V','2024-08-24','04:53:21','V4X-456'),
  ('N', 'F', 2020, 220, '2023-09-05','V','2024-09-05','04:53:21','Y7A-789'),
  ('C', 'C', 2018, 430, '2022-10-15','A','2024-10-22','04:53:21','B8D-413');

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

INSERT INTO ruta (distancia_total, cod_ruta_tipo, duracion) VALUES
  ( 70.9, 1, 2.4),
  ( 23.5, 1, 0.8),
  ( 12.3, 1, 0.4),
  ( 70.9, 1, 2.4),
  ( 5.6, 1, 0.2),
  ( 11.2, 1, 0.4),
  ( 23, 1, 0.8),
  ( 16.4, 1, 0.5),
  ( 7.3, 1, 0.2),
  ( 34.8, 1, 1.2);

INSERT INTO empleado(cod_cliente, cod_persona, cod_empleado_cargo, fecha_contrato ) VALUES
  ( 1, 11, 1, '2021-04-09'),
  ( 1, 12, 1, '2021-06-17'),
  ( 1, 13, 2, '2022-03-20'),
  ( 1, 14, 3, '2021-01-20'),
  ( 1, 15, 4, '2022-01-07'),
  ( 1, 16, 5, '2021-08-09'),
  ( 1, 17, 6, '2021-11-06'),
  ( 1, 18, 6, '2021-07-09'),
  ( 3, 19, 7, '2021-01-09'),
  ( 4, 20, 8, '2021-02-09'),
  ( 4, 21, 3, '2021-05-18'),
  ( 1, 22, 5, '2021-05-18'),
  ( 1, 23, 5, '2021-05-18');

INSERT INTO transportista (cod_empleado,cod_estado_transportista,cod_tipo_licencia, num_licencia, fecha_vencimiento_licencia,fecha_ultimo_traslado) VALUES
  ( 6,  'D', 'X','E567890', '2027-01-23', '2024-04-15'),
  ( 12, 'N', 'Y','R487236','2025-01-08', '2024-04-24');

INSERT INTO representante (num_telefono,correo_empresarial,cargo,cod_cliente,cod_persona) VALUES
  ( '(+51) 943 567 890',              'juan.lopez@sanfernando.com',                 'Gerente de Almacén',  1,  1),
  ( '(+51) 976 345 678',            'diana.vargas@sanfernando.com', 'Supervisora de Atención al Cliente',  2,  2),
  ( '(+51) 983 912 345',         'roberto.paredes@sanfernando.com',              'Gerente de Producción',  3,  3),
  ( '(+51) 944 567 891',           'sandra.torres@sanfernando.com',       'Supervisora de Mantenimiento',  4,  4),
  ( '(+51) 981 234 567',  'luis.mendoza@supermercadosperuanos.com',               'Supervisor de Ventas',  5,  5),
  ( '(+51) 957 890 123', 'pedro.rodriguez@hipermercadostottus.com',                 'Gerente de Compras',  6,  6),
  ( '(+51) 992 456 789',     'ana.martinez@CencosudRetailPeru.com',           'Supervisora de Logística',  7,  7),
  ( '(+51) 945 678 901',               'luis.hernandez@delosi.com',             'Gerente de Operaciones',  8,  8),
  ( '(+51) 965 123 456',     'laura.gonzalez@sanguchesdelperu.com',             'Supervisora de Compras',  9,  9),
  ( '(+51) 954 789 012',           'carlos.ramirez@gruporokys.com',               'Gerente de Logística', 10, 10);

INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, fecha, hora_inicio, hora_fin, cod_tipo_operacion) VALUES
  (NULL, 1, 4, '2024-04-01', '08:00:00', '08:30:00', 1),
  (1, 1, 4, '2024-04-01', '08:45:00', '09:15:00', 2),
  (1, 1, 4, '2024-04-01', '09:30:00', '10:30:00', 3),
  (1, 1, 4, '2024-04-01', '10:45:00', '11:15:00', 4),
  (1, 1, 4, '2024-04-01', '11:30:00', '12:00:00', 5),
  (1, 1, 4, '2024-04-01', '14:00:00', '14:30:00', 6),
  (NULL, 13, 4, '2024-04-02', '08:00:00', '08:35:00', 1),
  (7, 13, 4, '2024-04-02', '08:45:00', '09:15:00', 2),
  (7, 13, 4, '2024-04-02', '09:30:00', '10:30:00', 3),
  (7, 13, 4, '2024-04-02', '10:45:00', '11:15:00', 4),
  (7, 13, 4, '2024-04-02', '11:30:00', '12:00:00', 5),
  (7, 1, 4, '2024-04-02', '17:00:00', '17:18:00', 6),
  (NULL, 13, 4, '2024-04-02', '09:15:00', '09:30:00', 1),
  (13, 12, 4, '2024-04-02', '09:42:00', '10:10:00', 2),
  (13, 12, 4, '2024-04-02', '10:20:00', '11:10:00', 3),
  (13, 12, 4, '2024-04-02', '12:15:00', '12:05:00', 4),
  (13, 12, 4, '2024-04-02', '12:20:00', '12:56:00', 5),
  (13, 1, 4, '2024-04-02', '18:20:00', '18:56:00', 6),
  (NULL, 13, 4, '2024-04-02', '10:00:00', '10:35:00', 1),
  (19, 13, 4, '2024-04-02', '10:45:00', '10:15:00', 2),
  (19, 13, 4, '2024-04-02', '10:30:00', '11:30:00', 3),
  (19, 13, 4, '2024-04-02', '11:45:00', '12:15:00', 4),
  (19, 13, 4, '2024-04-02', '12:30:00', '13:00:00', 5),
  (19, 1, 4, '2024-04-02', '18:20:00', '18:56:00', 6);

INSERT INTO mercancia (id_operacion_picking, nro_precinto, peso_total) VALUES
  (1, '00002202404010800011', 12000),
  (1, '00002202404010800023', 7500),
  (1, '00002202404010800044', 5500),
  (7, '00008202404020800055', 13500),
  (7, '00008202404020800067', 15000),
  (13, '00014202404020900087', 750),
  (13, '00014202404020900098', 600),
  (19, '00020202404021000019', 18000),
  (19, '00020202404021000021', 16500);

INSERT INTO stock (cod_stock, id_elemento_catalogo, nro_lote, fecha_caducidad, cantidad_disponible) VALUES
  ( '00001-00001-00123', 1, 123, '2024-04-01', 1000),
  ( '00002-00002-00124', 2, 124, '2024-04-02', 2000),
  ( '00003-00003-00125', 3, 125, '2024-04-03', 5000),
  ( '00004-00004-00126', 4, 126, '2024-04-04', 3000),
  ( '00005-00005-00127', 5, 127, '2024-04-05', 4000),
  ( '00006-00006-00128', 6, 128, '2024-04-06', 6000),
  ( '00007-00007-00129', 7, 129, '2024-04-07', 7000),
  ( '00008-00008-00130', 8, 130, '2024-04-08', 8000),
  ( '00009-00009-00131', 9, 131, '2024-04-09', 9000),
  ( '00010-00001-00132', 1, 132, '2024-04-10', 2500),
  ( '00011-00011-00223', 11, 223, '2024-04-01', 1000),
  ( '00012-00011-00224', 11, 224, '2024-04-02', 2000),
  ( '00013-00012-00225', 12, 225, '2024-04-03', 1000),
  ( '00014-00012-00226', 12, 226, '2024-04-04', 1050),
  ( '00015-00013-00227', 13, 227, '2024-04-05', 1010),
  ( '00016-00014-00228', 14, 228, '2024-04-06', 1000),
  ( '00017-00015-00229', 15, 229, '2024-04-07', 8000),
  ( '00018-00016-00230', 16, 230, '2024-04-08', 7000),
  ( '00019-00017-00231', 17, 231, '2024-04-09', 3000),
  ( '00020-00010-00232', 10, 232, '2024-04-10', 4000),
  ( '00021-00009-00233', 9, 233, '2024-04-11', 1500),
  ( '00022-00008-00234', 8, 234, '2024-04-12', 1700),
  ( '00023-00007-00235', 7, 235, '2024-04-13', 1600),
  ( '00024-00007-00236', 7, 236, '2024-04-14', 1200),
  ( '00025-00007-00237', 7, 237, '2024-04-15', 1030);

INSERT INTO traslado (cod_guia_remision, cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia, id_operacion_termina) VALUES
  ('000012024040111301200', 2, 2, 2, 5, 6),
  ('000022024040211301200', 3, 3, 2, 11, 12),
  ('000032024040212201256', 3, 3, 1, 17, 18),
  ('000042024040212301300', 3, 3, 2, 23, 24);

INSERT INTO detalle_mercancia_stock (id_mercancia, id_stock, cantidad) VALUES
  (1, 1, 10),
  (1, 2, 5),
  (1, 3, 15),
  (2, 4, 10),
  (2, 5, 5),
  (3, 6, 10),
  (3, 7, 5),
  (4, 8, 10),
  (4, 9, 5),
  (4, 10, 15),
  (5, 11, 10),
  (5, 12, 5),
  (5, 13, 15),
  (6, 14, 10),
  (6, 15, 5),
  (6, 16, 15),
  (7, 17, 10),
  (7, 18, 5),
  (7, 19, 15),
  (8, 20, 10),
  (8, 21, 5),
  (8, 22, 15),
  (9, 23, 10),
  (9, 24, 5),
  (9, 25, 15);

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

INSERT INTO gps (cod_ubicacion, cod_vehiculo, fecha_ubicacion, hora_ubicacion) VALUES
  ( 1, 4, '2024-04-20', '04:53:21'),
  ( 15, 4, '2024-04-20', '09:10:53'),
  ( 17, 4, '2024-04-20', '11:33:14'),
  ( 18, 4, '2024-04-20', '13:45:11'),
  ( 1, 7, '2024-04-22', '05:13:55'),
  ( 5, 7, '2024-04-22', '07:34:25'),
  ( 4, 7, '2024-04-22', '10:45:30'),
  ( 8, 7, '2024-04-22', '11:20:10'),
  ( 12, 7, '2024-04-22', '11:54:31'),
  ( 10, 7, '2024-04-22', '12:29:30'),
  ( 13, 7, '2024-04-22', '13:04:10'),
  ( 14, 7, '2024-04-22', '13:38:50');

INSERT INTO local (cod_cliente, cod_ubicacion, pais, cod_local_region, cod_local_distrito, calle, numero, cod_local_tipo) VALUES
  ( 1, 1, 'PER', 15, 44, 'Panamericana Norte', NULL, 1),
  ( 8, 2, 'PER', 15, 44, 'Av. El Solar', NULL, 2),
  ( 8, 3, 'PER', 7, 45, 'Av. Néstor Gambetta', 7036, 2),
  ( 8, 4, 'PER', 15, 25, 'Av. Puente Piedra', 266, 2),
  ( 7, 10, 'PER', 15, 11, 'Av. Tomás Valle', 1400, 2),
  ( 6, 12, 'PER', 15, 11, 'Av. Alfredo Mendiola', 3698, 2),
  ( 2, 15, 'PER', 15, 15, 'Jr. Iquitos', 347, 3),
  ( 10, 16, 'PER', 15, 15, 'Av. España', 1337, 2),
  ( 2, 17, 'PER', 15, 15, 'Jr. Puno', 370, 4),
  ( 3, 18, 'PER', 15, 7, 'C. Constelación Austral', 135, 1),
  ( 2, 19, 'PER', 15, 35, 'Tomas Cochrane', NULL, 4),
  ( 2, 20, 'PER', 15, 35, 'Jr. Mártir Olaya', 413, 4),
  ( 2, 21, 'PER', 15, 24, 'Av. Simón Bolívar', 1149, 4),
  ( 2, 22, 'PER', 15, 15, 'Jr. 3 de Febrero', 1234, 4),
  ( 2, 23, 'PER', 7, 46, 'Av. Argentina', 3093, 3),
  ( 2, 24, 'PER', 15, 32, 'Av. 13 de Enero', 1592, 4),
  ( 3, 25, 'PER', 15, 7, 'Av. Los Faisanes', 179, 1),
  ( 2, 26, 'PER', 15, 7, 'Jr. Justo Naveda', 136, 4),
  ( 2, 27, 'PER', 15, 9, 'Av. Universitaria', 7718, 3),
  ( 2, 28, 'PER', 15, 16, 'Av. Petit Thouars', 2260, 3);

INSERT INTO paradero (cod_ruta, cod_local, cod_paradero_tipo, orden) VALUES
  ( 1, 1, 1, 1),
  ( 1, 2, 2, 2),
  ( 1, 4, 2, 3),
  ( 1, 17, 3, 4),
  ( 2, 1, 1, 1),
  ( 2, 16, 3, 2),
  ( 3, 1, 1, 1),
  ( 3, 4, 2, 2),
  ( 3, 5, 2, 3),
  ( 3, 6, 2, 4),
  ( 4, 17, 1, 1),
  ( 4, 1, 3, 2);

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

INSERT INTO incidencia (id_traslado,cod_tipo_incidencia,descripcion,fecha_ocurrencia, hora_ocurrencia,cod_estado_incidencia) VALUES
  ( 1, 'A', 'La fecha de entrega no coincide con la fecha establecida de llegada','2024-04-24','04:53:21','S'),
  ( 2, 'B', 'Hay paquetes que no están sellados correctamente', '2024-05-03','04:53:21','P'),
  ( 2, 'C', 'El transportista no se le dio la documentación correspondiente', '2024-05-05','04:53:21','S'),
  ( 1, 'D', 'El vehículo asignado no enciende', '2024-04-28','04:53:21', 'P'),
  ( 2, 'E', 'La direccion no coincide con el pedido del cliente', '2024-05-08','04:53:21','S'),
  ( 2, 'C', 'La documentación presenta datos erróneos', '2024-05-10','04:53:21', 'S'),
  ( 1, 'D', 'El vehiculo sufrió derrame de aceite ', '2024-04-30', '04:53:21', 'S'),
  ( 2, 'E', 'La direccion asignada presenta demasiado tráfico', '2024-05-12','04:53:21','P'),
  ( 1, 'B', 'El sello del paquete está dañado', '2024-04-30','04:53:21','P'),
  ( 1, 'A', 'Ocurrió un accidente en la carretera que retrasó la entrega del pedido', '2024-05-02','04:53:21','S');

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

INSERT INTO norma (cod_incidencia, cod_norma_tipo, fecha_emision, fecha_vigencia) VALUES
  ( 1, 'X', '2019-01-24', '2025-01-24'),
  ( 2, 'Y', '2021-02-21', '2029-02-21'),
  ( 3, 'Z', '2020-02-17', '2026-02-17'),
  ( 4, 'W', '2017-03-28', '2027-03-28'),
  ( 5, 'X', '2005-03-15', '2025-01-24'),
  ( 6, 'Y', '2027-03-21', '2029-02-21'),
  ( 7, 'W', '2018-02-17', '2026-02-17'),
  ( 8, 'X', '2015-06-11', '2027-03-28'),
  ( 9, 'Y', '2018-02-17', '2026-02-17'),
  (10,'X', '2019-01-24', '2025-01-24');

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

INSERT INTO programacion_reporte (cod_representante, cod_reporte_formato, cod_reporte_estado, cod_reporte_tipo, cod_reporte_frecuencia, fecha_inicio, fecha_fin) VALUES
  (1, 1, 1, 1, 1, '2024-01-01', '2024-12-31'),
  (2, 2, 1, 2, 2, '2024-02-01', '2024-10-31'),
  (3, 3, 2, 3, 3, '2024-03-01', '2024-12-31'),
  (4, 4, 1, 4, 4, '2024-04-01', '2024-06-30'),
  (1, 2, 1, 1, 5, '2024-05-01', '2024-08-31'),
  (2, 3, 2, 1, 6, '2024-06-01', '2024-12-31'),
  (3, 4, 1, 2, 7, '2024-07-01', '2024-10-31'),
  (4, 1, 2, 3, 1, '2024-08-01', '2024-11-30'),
  (1, 3, 1, 4, 2, '2024-09-01', '2024-12-31'),
  (2, 4, 2, 2, 3, '2024-10-01', '2024-12-31'),
  (3, 1, 1, 1, 4, '2024-11-01', '2024-12-31'),
  (4, 2, 1, 2, 5, '2024-12-01', '2024-12-31'),
  (1, 4, 2, 3, 6, '2024-01-15', '2024-04-30'),
  (2, 1, 1, 4, 7, '2024-02-15', '2024-12-31'),
  (3, 2, 1, 2, 1, '2024-03-15', '2024-04-30'),
  (4, 3, 2, 1, 2, '2024-04-15', '2024-12-31'),
  (1, 4, 1, 2, 3, '2024-05-15', '2024-05-31'),
  (2, 3, 1, 3, 4, '2024-06-15', '2024-12-31'),
  (3, 1, 2, 4, 5, '2024-07-15', '2024-12-31'),
  (4, 2, 1, 3, 6, '2024-08-15', '2024-09-30'),
  (1, 3, 2, 1, 7, '2024-09-15', '2024-12-31'),
  (2, 4, 1, 2, 1, '2024-10-15', '2024-12-31'),
  (3, 2, 2, 3, 2, '2024-11-15', '2024-12-31'),
  (4, 1, 1, 4, 3, '2024-12-15', '2024-12-31'),
  (1, 2, 1, 4, 4, '2024-01-31', '2024-02-28');

INSERT INTO reporte (cod_representante, cod_reporte_formato, cod_reporte_tipo, fecha_generacion, hora_generacion) VALUES
  (1, 1, 1, '2024-06-01', '08:00:00'),
  (2, 2, 2, '2024-06-02', '09:00:00'),
  (3, 3, 3, '2024-06-03', '10:00:00'),
  (4, 4, 4, '2024-06-04', '11:00:00'),
  (1, 2, 1, '2024-06-05', '12:00:00'),
  (2, 3, 1, '2024-06-06', '13:00:00'),
  (3, 4, 2, '2024-06-07', '14:00:00'),
  (4, 1, 3, '2024-06-08', '15:00:00'),
  (1, 3, 4, '2024-06-09', '16:00:00'),
  (2, 4, 2, '2024-06-10', '17:00:00'),
  (3, 1, 1, '2024-06-11', '18:00:00'),
  (4, 2, 2, '2024-06-12', '19:00:00'),
  (1, 4, 3, '2024-06-13', '20:00:00'),
  (2, 1, 4, '2024-06-14', '21:00:00'),
  (3, 2, 3, '2024-06-15', '22:00:00'),
  (4, 3, 1, '2024-06-16', '23:00:00'),
  (1, 4, 2, '2024-06-17', '00:00:00'),
  (2, 3, 3, '2024-06-18', '01:00:00'),
  (3, 1, 4, '2024-06-19', '02:00:00'),
  (4, 2, 1, '2024-06-20', '03:00:00'),
  (1, 3, 1, '2024-06-21', '04:00:00'),
  (2, 4, 2, '2024-06-22', '05:00:00'),
  (3, 2, 3, '2024-06-23', '06:00:00'),
  (4, 1, 4, '2024-06-24', '07:00:00'),
  (1, 2, 1, '2024-06-25', '08:00:00');
```

## 4. Funcionalidad Primaria Elegida

### 1. Funcionalidad Primaria del Módulo de pedidos

**Funcionalidad primaria elegida:** Registrar un nuevo pedido y agregar Productos al Pedido. Este flujo se considera fundamental para el correcto funcionamiento del sistema, ya que permite al empleado de la empresa San Fernando registrar los pedidos de los clientes, incluyendo la información del representante, la empresa a la que pertenece y los productos solicitados.

**Sustentación:** La elección de la funcionalidad primaria del modulo se basa en un proceso crítico para la operación comercial de la empresa San Fernando, ya que sin la capacidad de registrar correctamente los pedidos de los clientes, la empresa no podría llevar a cabo sus actividades principales de venta y distribución de productos. Involucra el manejo de datos relacionados de múltiples tablas de la base de datos, como clientes, representantes, productos y pedidos, demostrando la capacidad del sistema para mantener la integridad de la información. Representa un flujo de trabajo completo y coherente dentro de la aplicación, abarcando desde la captura de información del cliente y representante (R101) hasta la selección de productos específicos (R102), lo que permite una comprensión integral de su implementación en el sistema. Establece una base sólida para el desarrollo de otras funcionalidades relacionadas, como el seguimiento del estado del pedido, la generación de de guías de remisión, el control de asignacion de trasnporte y la gestión de envíos, facilitando la escalabilidad y el crecimiento futuro del sistema. Implica la interacción directa del empleado con el sistema a través de interfaces de usuario específicas, como el formulario de registro de pedidos y la selección de productos del catálogo, permitiendo evaluar y validar la usabilidad y la experiencia del usuario en el contexto de una tarea crítica. Además, permite validar y comprobar el cumplimiento de los requisitos establecidos en los casos de uso R101 (Registrar Pedido) y R102 (Agregar Productos al Pedido), asegurando que el sistema cumpla con las especificaciones definidas.
<table>
   <tr>
      <th>Actividad</th>
      <th>Descripción</th>
   </tr>
   <tr>
      <td>1</td>
      <td>El empleado accede a la interfaz de registro de pedido.
	<p align="center">
	   <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/1b62a2b4-5243-43b4-9145-c88e83a6f05c">
	</p>
      </td>
   </tr>
   <td>2</td>
      <td>El empleado ingresa los datos del representante y del cliente, como nombres, apellidos, DNI, teléfono, correo empresarial, empresa, fecha de solicitud y fecha de entrega esperada.
	<p align="center">
	   <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/4dae2974-59fd-4d18-93e2-af6533c146a0">
	</p>
      </td>
   </tr>
   <td>3</td>
      <td>Después de ingresar los datos del representante y el cliente, el empleado pasa a la siguiente etapa para seleccionar los productos solicitados.
	<p align="center">
	   <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/ace45da4-0654-4195-b3cb-6e3c921188c0">
	</p>
      </td>
   </tr>
   <td>4</td>
      <td>El sistema muestra una lista de productos disponibles en el catálogo, agrupados por categorías.
	<p align="center">
	   <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/54a478bb-7eee-4605-b35e-73ca85793c21">
	</p>
      </td>
   </tr>
   <td>5</td>
      <td>El empleado selecciona los productos necesarios y las cantidades correspondientes.
	<p align="center">
	   <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/90120b92-d76f-48c8-8f57-03b39d4745e6">
	</p>
      </td>
   </tr>
   <td>6</td>
      <td>El empleado confirma la selección de productos.
	<p align="center">
           <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/bb5d8b15-fdbd-4cb4-8c42-699d83b9c8a0">
	</p>
      </td>
   </tr>
   <td>7</td>
      <td>El sistema actualiza el pedido con los productos seleccionados.
	<p align="center">
	   <img src="https://github.com/fiis-bd241/grupo01/assets/121084712/37f61980-9f61-49f8-9450-48c5f08d94e1">
	</p>
      </td>
   </tr>
</table>



### 4. Funcionalidad Primaria del Módulo de Control

**Funcionalidad primaria elegida:** Registrar una nueva incidencia durante el traslado de un pedido y verificar el estado de atención de las incidencia. <br>
**Sustentación:** Registrar una nueva incidencia permite una rápida identificación y registro de problemas que ocurren durante el proceso de traslado, asegurando que sean abordados de manera oportuna. Análogamente, verificar el estado de atención de una incidencia es esencial para monitorizar el progreso de la resolución, garantizando que se tomen las acciones necesarias y se mantenga la transparencia en el proceso de gestión de incidencias.
Esta funcionalidad permitirá cumplir con los requerimientos de Registrar Nueva Incidencia (R403), Pantalla de Incidencias (I407), Estado de atención a Incidencia (I408), Mostrar Incidencias filtradas (I408) los cuales se encuentran relacionados con las interfaces I401,I402,I403, I404, I405, I406, I407,I408.
Tendrás dos apartados, uno para registrar una nueva incidencia y otro para verificar el estado de atención de las incidencias.

### 5. Funcionalidad Primaria del módulo de reportes

**Funcionalidad primaria elegida:** Programar la generación de un tipo de reporte en un intervalo de tiempo definido. <br>
**Sustentación:** Se automatiza y facilita la generación de informes en intervalos predefinidos, brindando acceso a información crítica sin intervención manual. Además, permite personalizar los tipos, formatos, frecuencias y períodos de los informes según las necesidades específicas, organizando todas las tareas de generación de informes en un solo lugar. Esta funcionalidad se integra con los datos de otros módulos, apoyando la toma de decisiones basada en datos dentro de la empresa. <br>
Esta funcionalidad permitirá cumplir con los requerimientos de Generar reporte (R501) y Programar reporte (R502), los cuales se encuentran relacionados con las interfaces I501 y I503.
Al ingresar al módulo de Reportes (desde un usuario con cargo de representante de algún área), el usuario puede ver todas las opciones de este módulo, donde hay un cuadro que dice opciones y puede presionar el botón de "Programar reporte"
Luego de presionar el botón, saldrá una ventana emergente donde saldrán los valores necesarios para programar el reporte: El tipo de reporte, el formato en el que se va a generar, la frecuencia de creación de los reportes, la fecha desde donde va a comenzar la programación y la fecha en la que termina. Une vez llenado esos campos, se va a presionar el botón "Programar".
Ahora el usuario podrá ver la programación del reporte hecha en la lista de programaciones que está al lado del cuadro de opciones.
Ahora une vez que se llega a la fecha inicio de programación, cada cierto tiempo (indicado en la frecuencia del reporte) se generará el reporte en el backend y será enviado al usuario.

### 6. Funcionalidad Primaria del Módulo de Reclamos
**Funcionalidad primaria elegida:** Registrar un nuevo reclamo sobre un pedido, visualizarlo completamente. <br>
**Sustentación:** Registrar un nuevo reclamo permite una rápida identificación y registro de problemas que ocurren durante cualquier proceso, asegurando que sean abordados de manera oportuna. Análogamente, visualizar el estado de un reclamo es esencial para monitorizar el progreso de la resolución mediante un seguimiento, garantizando que se tomen las acciones necesarias y se mantenga la transparencia en el proceso resolución de reclamos. Esta funcionalidad permitirá cumplir con los requerimientos de Registrar un reclamo realizado por un cliente (R601) relacionado con las interfaces I602, I604, I605, I606, I607, I608, I609. Y el requerimiento Visualizar la información detallada y editar el estado de un reclamo registrado en el sistema. (R602) relacionado con las interfaces I601, I603. Tendrá dos apartados, uno para registrar un nuevo reclamo y otro para poder visualizar el estado del reclamo.


## 5. Stack Tecnológico elegido para su aplicación

### Frontend
   * Framework: Angular
   * UI Components: Primeng
   * Estilos: Primeflex
   * Gráficos: Apache ECharts
   * Íconos: Font Awesome
   * Generación de pdfs: jspdf
### Backend 
   * Patrón de diseño: Dao
   * Lenguaje de programación: Java
   * Dependencias:
     * Springboot
     * Quartz
     * PostgreSQL JDBC Driver
     * Lombok
### Databases
   * Sistema gestor de base de datos: PostgreSQL 
   * Motor de base de datos: PostgreSQL
### Diagrama
![app](https://github.com/fiis-bd241/grupo01/assets/161625149/118087b3-308f-4b84-9770-b74b500291f3)
## 6. Primera Versión de su Aplicación

### Frontend: https://github.com/Cristhian134/sanfernando-app.git
### Backend: https://github.com/Cristhian134/sanfernando.git

## 7. Videos individuales

[![Módulo de control](https://img.youtube.com/vi/49ex4_ZWXF4/mqdefault.jpg)](https://www.youtube.com/watch?v=49ex4_ZWXF4)
