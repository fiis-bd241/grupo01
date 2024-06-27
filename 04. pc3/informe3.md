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
|1| El empleado accede a la interfaz de registro de pedido.|
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
|Objetivo | Permitir al empleado ver los detalles completos de un pedido específico. |
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
|Descripción | El usuario verifica en base a los datos del vehículo como número de placa, marca,año de fabricación, capacidad de carga, fecha de último mantenimiento, fecha y hora de última de actividad, para registrar su disponibilidad y poder asignarle como medio de traslado de un pedido. |
|Actor Primario | Transportista|
|Actor Secundario|N/A |
|Precondiciones|Registro de vehículos en sistema|
|Paso|Acción|
|1|El usuario selecciona la opción "Transporte" y le da a segunda opción "Vehículo"|
|2|Verifica los atributos específicos del vehículo como: número de placa, marca,año de fabricación, capacidad de carga, fecha de último mantenimiento, fecha y hora de última de actividad |
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

Caso de Uso #4: Registro de estado de atención a la incidencia
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
| Requerimientos relacionados         | [R201](#R201), [R202](#R202), [R203](#R203), [R204](#R204), [R205](#R205), [R206](#R206)    |
| Código      | I201 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/02e80a46-9583-48c4-b577-a8f3f46c9d97)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R201](#R201), [R203](#R203)     |
| Código      | I202 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/36a58d38-da47-4099-8b76-62fbdd8a1aa3)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R203](#R203)    |
| Código      | I202-E1 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/552f8a68-c84e-4bfb-85b8-b41c0b86f939)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R202](#R202) |
| Código      | I203 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/c70bad45-74df-49f6-890c-e3561ef854c8) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R202](#R202) |
| Código      | I203-E1 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/70abd943-3efc-487b-82f2-854105fda36a) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R202](#R202) |
| Código      | I203-E2 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/26e8d430-e929-4bed-87c2-701db6305f32) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R202](#R202) |
| Código      | I203-E3 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/294f2c25-ea2e-42dd-995d-6ad992b1abcb) |

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R204](#R204)    |
| Código      | I204 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/efb7b544-926b-4410-a17a-f3a926a42a0f)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R204](#R204)    |
| Código      | I204-E1 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/4196ac9d-f4c2-4382-a8a5-6d6af60659a7)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R205](#R205)   |
| Código      | I205 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/d9a1ce6b-d68b-4686-88d1-5ac69dcbb9a0)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R205](#R205)     |
| Código      | I205-E1 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/f880dea2-3e18-4f93-92b8-272e4b8ec627)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R206](#R206)    |
| Código      | I206 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/94c187d0-597b-466a-8472-4b690a9e8347)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | [R206](#R206)    |
| Código      | I206-E1 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/df1b66eb-7f89-4736-9512-c228a7ce6286)|

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
| Prototipo   | ![image](https://github.com/Alexclb0/Holamundo/assets/164266999/19f371dd-9641-432a-be42-277e3a5aeff5)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R402       |
| Código      | I402 |
| Prototipo   | ![image](https://github.com/Alexclb0/Holamundo/assets/164266999/d60ac6e0-63a1-442b-a8ad-cb4c5f553f57)
|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I403 |
| Prototipo   | ![image](https://github.com/Alexclb0/Holamundo/assets/164266999/b3f27df0-6695-4dea-9ffd-e92b6dde286f)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I404 |
| Prototipo   | ![image](https://github.com/Alexclb0/Holamundo/assets/164266999/daa1d0bb-037f-431b-85c7-b8c02fc70725)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I405 |
| Prototipo   | ![image](https://github.com/Alexclb0/Holamundo/assets/164266999/9076b0dd-ac6e-4d68-a282-e7b3456107f0)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403       |
| Código      | I406 |
| Prototipo   | ![image](https://github.com/Alexclb0/Holamundo/assets/164266999/b96ec223-9a34-4d13-8ab2-387a5b8aa16e)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403, R404   |
| Código      | I407 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164266999/131f03bd-4127-4173-aab2-8901efaf9d4c)|

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R403, R404   |
| Código      | I408 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164266999/802d2a56-4398-4f13-b630-d6fa83a6fa0a)|


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
    p.cod_ticket,
    pe.estado_pedido
FROM
    pedido p
    INNER JOIN ticket t ON p.cod_ticket = t.cod_ticket
    INNER JOIN representante r ON p.cod_representante = r.cod_representante
    INNER JOIN persona rp ON r.cod_persona = rp.cod_persona
    INNER JOIN cliente c ON r.cod_cliente = c.cod_cliente
    INNER JOIN empleado e ON p.cod_empleado = e.cod_empleado
    INNER JOIN persona ep ON e.cod_persona = ep.cod_persona
    LEFT JOIN pedido_tipo pt ON p.cod_pedido_tipo = pt.cod_pedido_tipo
    INNER JOIN pedido_estado pe ON p.cod_pedido_estado = pe.cod_pedido_estado;

```

2. Carga de informacion de los productos: El usuario tambien obtendra informacion mas especifica de los productos solicitados por cada pedido.

``` sql
SELECT 
    dtp.id_elemento_catalogo, 
    ec.nombre, 
    dtp.cantidad,
    ecu.descripcion AS unidad
FROM 
    detalle_ticket_producto AS dtp
    INNER JOIN elemento_catalogo AS ec ON dtp.id_elemento_catalogo = ec.id_elemento_catalogo
    INNER JOIN elemento_catalogo_unidad AS ecu ON ec.cod_unidad = ecu.cod_unidad;
```
### 2. Sentencias SQL módulo de Seguimiento
#### Caso 1
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R201, R203      |
| Código      | I202 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/7ca92fdd-cdf6-42c0-98f1-ab701a118166)|

Eventos:
1.	Carga de página: Se llenarán los traslados en proceso:
``` sql
SELECT 
	t.cod_guia_remision, 
	lo.denominacion AS origen, 
	ld.denominacion AS destino
FROM traslado t
JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
JOIN paradero po ON t.cod_ruta = po.cod_ruta AND po.cod_paradero_tipo = 1
JOIN "local" lo ON po.cod_local = lo.cod_local
JOIN paradero pd ON t.cod_ruta = pd.cod_ruta AND pd.cod_paradero_tipo = 3
JOIN "local" ld ON pd.cod_local = ld.cod_local;
```
2.	Al seleccionar uno de los traslados de la lista en la pantalla se cargará:
``` sql
SELECT 
    p.prenombre || ' ' || p.primer_apellido || ' ' || p.segundo_apellido AS conductor, v.placa AS placa_vehiculo,  lo.denominacion AS origen, os.hora_fin AS hora_salida, ld.denominacion AS destino
FROM 
    traslado t
    JOIN operacion os ON t.id_operacion_inicia = os.id_operacion AND os.cod_tipo_operacion = (SELECT cod_tipo_operacion FROM operacion_tipo WHERE descripcion = 'Salida')
    JOIN transportista tr ON t.cod_transportista = tr.cod_transportista
    JOIN empleado e ON tr.cod_empleado = e.cod_empleado
    JOIN persona p ON e.cod_persona = p.cod_persona
    JOIN vehiculo v ON t.cod_vehiculo = v.cod_vehiculo
    JOIN ruta r ON t.cod_ruta = r.cod_ruta
    JOIN paradero po ON r.cod_ruta = po.cod_ruta AND po.orden = 1
    JOIN "local" lo ON po.cod_local = lo.cod_local
    JOIN paradero pd ON r.cod_ruta = pd.cod_ruta AND pd.orden = (SELECT MAX(orden) FROM paradero WHERE cod_ruta = r.cod_ruta)
    JOIN "local" ld ON pd.cod_local = ld.cod_local
WHERE 
    t.cod_guia_remision = '<2>'
```
#### Caso 2
|                  |                                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R203      |
| Código      | I202-E1 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/a63abbf8-f498-4698-a9f3-99d4d39d0066)|

Eventos:
1.	Al hacer click en el botón “Registrar Entrega” de la interfaz I202 se inicializa esta ventana emergente que muestra una tabla que trabaja con la sentencia:
``` sql
SELECT
    t.cod_guia_remision,
    p.cod_pedido,
    pt.tipo_pedido,
    osa.fecha AS fecha_salida,
    ore.fecha AS fecha_llegada,
    ld.denominacion AS destino,
    p.cod_pedido_estado
FROM
    traslado t
    JOIN detalle_ticket_traslado dtt ON t.id_traslado = dtt.id_traslado
    JOIN ticket tk ON dtt.cod_ticket = tk.cod_ticket
    JOIN pedido p ON tk.cod_ticket = p.cod_ticket
    JOIN pedido_tipo pt ON p.cod_pedido_tipo = pt.cod_pedido_tipo
    JOIN operacion osa ON t.id_operacion_inicia = osa.id_operacion AND osa.cod_tipo_operacion = (SELECT cod_tipo_operacion FROM operacion_tipo WHERE descripcion = 'Salida')
    JOIN operacion ore ON t.id_operacion_termina = ore.id_operacion AND ore.cod_tipo_operacion = (SELECT cod_tipo_operacion FROM operacion_tipo WHERE descripcion = 'Recepción')
    JOIN ruta r ON t.cod_ruta = r.cod_ruta
    JOIN paradero pd ON r.cod_ruta = pd.cod_ruta AND pd.orden = (SELECT MAX(orden) FROM paradero WHERE cod_ruta = r.cod_ruta)
    JOIN "local" ld ON pd.cod_local = ld.cod_local
WHERE
    t.cod_guia_remision = '<1>'
```
2.	Al presionar el botón “Registrar” asociado a un pedido del traslado
``` sql
UPDATE pedido
SET cod_pedido_estado = 'E'
WHERE cod_pedido = <2>;
```
#### Caso 3
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R202      |
| Código      | I203 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/6d351b1e-5907-436e-8a6e-eff2df4b8da2)|

Eventos:
1.	Al cargar la página deben aparecer una lista de traslados programados (que no tienen hora final en la operación de tipo “Salida”):
``` sql
SELECT 
    t.cod_guia_remision,
    lo.denominacion AS origen,
    ld.denominacion AS destino,
    o.hora_inicio,
    o.
FROM 
    traslado t
    JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
    JOIN ruta r ON t.cod_ruta = r.cod_ruta
    JOIN paradero po ON r.cod_ruta = po.cod_ruta AND po.cod_paradero_tipo = 1
    JOIN "local" lo ON po.cod_local = lo.cod_local
    JOIN paradero pd ON r.cod_ruta = pd.cod_ruta AND pd.orden = (SELECT MAX(orden) FROM paradero WHERE cod_ruta = r.cod_ruta)
    JOIN "local" ld ON pd.cod_local = ld.cod_local
WHERE
    o.hora_fin IS NULL;
```
2.	Se cargan los datos a editar en función de la guía de remisión elegida de la lista anterior
``` sql
SELECT 
    t.cod_guia_remision,
    p.prenombre || ' ' || p.primer_apellido || ' ' || p.segundo_apellido AS conductor,
    v.placa AS placa_vehiculo,
    lo.denominacion AS origen,
    os.hora_inicio AS hora_salida,
    ld.denominacion AS destino
FROM 
    traslado t
    JOIN operacion os ON t.id_operacion_inicia = os.id_operacion AND os.cod_tipo_operacion = (SELECT cod_tipo_operacion FROM operacion_tipo WHERE descripcion = 'Salida')
    JOIN transportista tr ON t.cod_transportista = tr.cod_transportista
    JOIN empleado e ON tr.cod_empleado = e.cod_empleado
    JOIN persona p ON e.cod_persona = p.cod_persona
    JOIN vehiculo v ON t.cod_vehiculo = v.cod_vehiculo
    JOIN ruta r ON t.cod_ruta = r.cod_ruta
    JOIN paradero po ON r.cod_ruta = po.cod_ruta AND po.orden = 1
    JOIN "local" lo ON po.cod_local = lo.cod_local
    JOIN paradero pd ON r.cod_ruta = pd.cod_ruta AND pd.orden = (SELECT MAX(orden) FROM paradero WHERE cod_ruta = r.cod_ruta)
    JOIN "local" ld ON pd.cod_local = ld.cod_local
WHERE 
    t.cod_guia_remision = '<2>'
```
3.	Al presionar el botón de actualización se realiza una actualización de la base de datos.
``` sql
UPDATE traslado
SET cod_ruta = <3>,
    cod_transportista = <4>,
    cod_vehiculo = <5>
WHERE cod_guia_remision = '<2>';
```
#### Caso 4
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R204      |
| Código      | I204 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/cdd5ab10-85a0-436d-ab42-3154ffa05b78)|

Eventos:
1.	Al inicializar la página se muestran todos los registros de rutas de la base de datos:
``` sql
SELECT 
    r.cod_ruta,
    rt.descripcion AS tipo_ruta,
    r.distancia_total,
    lo.denominacion AS origen,
    ld.denominacion AS destino
FROM 
    ruta r
    JOIN ruta_tipo rt ON r.cod_ruta_tipo = rt.cod_ruta_tipo
    JOIN paradero po ON r.cod_ruta = po.cod_ruta AND po.orden = 1
    JOIN "local" lo ON po.cod_local = lo.cod_local
    JOIN paradero pd ON r.cod_ruta = pd.cod_ruta AND pd.orden = (SELECT MAX(orden) FROM paradero WHERE cod_ruta = r.cod_ruta)
    JOIN "local" ld ON pd.cod_local = ld.cod_local;
```
2.	Al seleccionar alguno de los registros de la tabla generada
``` sql
SELECT 
    p.orden,
    l.denominacion AS local,
    pt.descripcion AS tipo_paradero
FROM 
    paradero p
    JOIN "local" l ON p.cod_local = l.cod_local
    JOIN paradero_tipo pt ON p.cod_paradero_tipo = pt.cod_paradero_tipo
WHERE
    p.cod_ruta = <1>
ORDER BY 
    p.orden;
```
3.	Al presionar el botón “Eliminar Ruta” 
``` sql
DELETE FROM ruta WHERE cod_ruta = <1>
```
#### Caso 5
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R204      |
| Código      | I204-E1 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/c16fe820-8154-4f36-a87a-8b092d8c2814)|

Eventos:
1.	Al presionar el botón “Registrar Ruta” se ejecutaría una sentencia de ingreso de datos:
Primero se crea la ruta nueva
``` sql
-- Insertar la nueva ruta
INSERT INTO ruta (distancia_total, cod_ruta_tipo, duracion)
VALUES (<8>, <7>, <8> / 60 );
```
Se introducen los paraderos correspondientes a dicha ruta
``` sql
INSERT INTO paradero (cod_ruta, cod_local, cod_paradero_tipo, orden)
VALUES 
(SELECT MAX(cod_ruta), <1>, <4>, 1)
(SELECT MAX(cod_ruta), <2>, <5>, 1)
(SELECT MAX(cod_ruta), <3>, <6>, 1)
--- Esto se repite con n paraderos
```
#### Caso 6
|                  |                                                                                     		 |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R205     |
| Código      | I205 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/e40cc8f1-91b1-496b-a58b-215fc89fc974)|

Eventos:
1.	Al inicializar la página
``` sql
SELECT
    v.cod_vehiculo,
    v.placa,
    vm.cod_vehiculo_marca,
    vm.descripcion AS marca,
    v.anio_fabricacion,
    v.capacidad_carga,
    v.fecha_ultimo_viaje,
    v.fecha_ultimo_mantenimiento,
    ve.cod_vehiculo_estado,
    ve.descripcion AS estado
    vt.cod_vehiculo_tipo,
    vt.descripcion
FROM vehiculo v
JOIN vehiculo_marca vm ON v.cod_vehiculo_marca = vm.cod_vehiculo_marca
JOIN vehiculo_estado ve ON v.cod_vehiculo_estado = ve.cod_vehiculo_estado
JOIN vehiculo_tipo vt ON v.cod_vehiculo_tipo = vt.cod_vehiculo_tipo;
```

2.	Al seleccionar uno de los registros de Vehículos
``` sql
SELECT
    v.cod_vehiculo,
    vm.descripcion,
    ve.descripcion,
    v.anio_fabricacion,
    v.placa,
    vt.descripcion,
    v.capacidad_carga,
    v.fecha_ultimo_mantenimiento
FROM vehiculo v
JOIN vehiculo_marca vm ON v.cod_vehiculo_marca = vm.cod_vehiculo_marca
JOIN vehiculo_estado ve ON v.cod_vehiculo_estado = ve.cod_vehiculo_estado
JOIN vehiculo_tipo vt ON v.cod_vehiculo_tipo = vt.cod_vehiculo_tipo
WHERE v.cod_vehiculo = <1>;
```
3.	Al presionar el botón “Actualizar Datos”
``` sql
UPDATE vehiculo
SET
    cod_vehiculo_marca = SELECT vm.cod_vehiculo_marca FROM vehiculo_marca vm WHERE vm.descripcion = <2>,
    cod_vehiculo_estado = SELECT ve.cod_vehiculo_estado FROM vehiculo_estado ve WHERE ve.descripcion = <3>,
    anio_fabricacion = <4>,
    placa = <5>,
    cod_vehiculo_tipo = SELECT vt.cod_vehiculo_tipo FROM vehiculo_marca vt WHERE vt.descripcion = <6>,
    capacidad_carga = <7>,
    fecha_ultimo_mantenimiento = <8>
WHERE cod_vehiculo = <1>;
```
#### Caso 7
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R205      |
| Código      | I205-E1 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/eb007177-ed71-4c47-b8de-8db543097b21)|

Eventos:
1.	Al inicializar la pantalla
``` sql
SELECT
	vm.descripcion
FROM vehiculo_marca vm;
SELECT
	vt.descripcion
FROM vehiculo_tipo vt;
SELECT
	ve.descripcion
FROM vehiculo_estado ve;
```
2.	Al presionar el botón "Registrar Vehículo"
``` sql
INSERT INTO vehiculo ( cod_vehiculo_marca, cod_vehiculo_estado, anio_fabricacion, placa, cod_vehiculo_tipo, capacidad_carga, fecha_ultimo_mantenimiento)
VALUES ( <1>, <2>, <3>, <4>, <5>, <6>, <7> );
```
#### Caso 8
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R206      |
| Código      | I206 |
| Prototipo   |  ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/9ae3653b-e604-4503-af38-5c53c9199703)|

Eventos:
1.	Al inicializar la página:
``` sql
SELECT
    t.cod_transportista,
    CONCAT(p.prenombre, ' ', p.primer_apellido, ' ', p.segundo_apellido) AS nombre,
    t.num_licencia AS licencia,
    lt.descripcion AS tipo_licencia,
    t.fecha_vencimiento_licencia AS vencimiento_licencia,
    te.descripcion AS estado
FROM transportista t
JOIN empleado e ON t.cod_empleado = e.cod_empleado
JOIN persona p ON e.cod_persona = p.cod_persona
JOIN licencia_tipo lt ON t.cod_tipo_licencia = lt.cod_tipo_licencia
JOIN transportista_estado te ON t.cod_estado_transportista = te.cod_estado_transportista;
```
2.	Seleccionar uno de los registros de Transportistas
``` sql
SELECT
    t.cod_transportista,
    CONCAT(p.prenombre, ' ', p.primer_apellido, ' ', p.segundo_apellido) AS nombre,
    p.dni AS dni,
    t.num_licencia AS licencia,
    lt.descripcion AS tipo_licencia,
    t.fecha_vencimiento_licencia AS vencimiento_licencia,
    te.descripcion AS estado
FROM transportista t
JOIN empleado e ON t.cod_empleado = e.cod_empleado
JOIN persona p ON e.cod_persona = p.cod_persona
JOIN licencia_tipo lt ON t.cod_tipo_licencia = lt.cod_tipo_licencia
JOIN transportista_estado te ON t.cod_estado_transportista = te.cod_estado_transportista
WHERE t.cod_transportista = <1>;
```
3.	Al presionar el botón “Actualizar Datos”
``` sql
UPDATE transportista
SET
    num_licencia = '<2>',     
    cod_tipo_licencia = <3>, 
    fecha_vencimiento_licencia = '<4>', 
    cod_estado_transportista = <5> 
WHERE cod_transportista = <1>;  -- Código del transportista a actualizar
```
#### Caso 9
|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R206      |
| Código      | I206-E1 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/164358065/c37a4d1d-2f9b-4f32-af37-90166878b2a3)|

Eventos:
1.	Al inicializar la pantalla
``` sql
SELECT
	lt.descripcion
FROM licencia_tipo lt;
SELECT
	te.descripcion
FROM transportista te;
```
2.	Al presionar el botón “Registrar Transportista”
``` sql

INSERT INTO transportista (cod_empleado, cod_estado_transportista, cod_tipo_licencia, num_licencia, fecha_vencimiento_licencia)
VALUES (SELECT e.cod_empleado FROM empleado e JOIN persona p ON p.cod_persona = e.cod_persona WHERE p.dni = <1>,
	<5>, SELECT lt.cod_tipo_licencia FROM licencia_tipo lt WHERE lt.descripcion= <3>, <4>,  <5>);
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

Pero antes, se realizan las siguientes validaciones (dependiendo del tipo de búsqueda):

Validación del número de precinto:

``` sql
SELECT EXISTS (SELECT * FROM mercancia WHERE nro_precinto = <1>)
```

Validación del código de guía de remisión:

``` sql
SELECT EXISTS (SELECT * FROM traslado WHERE cod_guia_remision = <1>)
```

Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se procede con la búsqueda.

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

4. **Botón "Registrar operación":** Lleva al usuario a la pantalla adecuada para registrar una operación adicional del proceso encontrado. Es decir, si la última operación registrada del proceso encontrado es de tipo "Picking", se lleva al usuario a la pantalla I304; si es de tipo "Precintado", a la pantalla I305; si es de tipo "Paletizado", a la pantalla I306; si es de tipo "Carga", a la pantalla I307; si es de tipo "Salida", a la pantalla I309; y si es de tipo "Recepción", a la pantalla I310. Si es de tipo "Descarga", el botón "Registrar operación" no se habilita. Toda esta lógica descrita se implementa en el frontend. Además, el valor del atributo "id_operacion" de la primera operación (de tipo "picking") se pasa como un parámetro llamado "id_operacion_picking" a esta nueva pantalla. 

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

3. **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <6>)
```

Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

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
UPDATE stock SET cantidad_disponible = cantidad_disponible - <cantidad> WHERE id_stock = <id_stock>
```

Se exporta en PDF los números de precinto generados con los detalles de cada mercancía.

Finalmente, se lleva al usuario a la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R301           |
| Código      | I303 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/bb65ce7e-6483-478e-acc1-372cec7aa13b) |

1. **Botón "Buscar":** Se busca el código de stock ingresado por el usuario. Se muestra en pantalla la información de este stock usando la siguiente consulta:

``` sql
SELECT st.id_stock as id, ec.nombre as nombre, ect.descripcion as categoria,
ep.descripcion as tipo, se.descripcion as segmento, ecu.descripcion as unidad
FROM stock st
INNER JOIN elemento_catalogo ec ON st.id_elemento_catalogo = ec.id_elemento_catalogo
INNER JOIN elemento_catalogo_tipo ect ON ec.id_elemento_catalogo_tipo = ect.id_elemento_catalogo_tipo
INNER JOIN elemento_produccion ep ON ect.id_elemento_produccion = ep.id_elemento_produccion
INNER JOIN elemento_catalogo_unidad ecu ON ec.cod_unidad = ecu.cod_unidad
INNER JOIN segmento se ON ect.id_segmento = se.id_segmento
WHERE st.cod_stock = <1>
```

2. **Botón "Ingresar":** Ingresa el código de stock especificado a la pantalla I302. Lleva al usuario de vuelta a la pantalla I302.

3. **Botón "Cerrar":** Lleva al usuario de vuelta a la pantalla I302. 

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R302           |
| Código      | I304 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/c3c802ca-5d15-412d-811f-d41d80b8db65) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking". El campo "Fecha" se autocompleta con la fecha actual.

2.  **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <4>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```
Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

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

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking". El campo "Fecha" se autocompleta con la fecha actual.

2.  **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <4>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```
Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
3,
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

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking". El campo "Fecha" se autocompleta con la fecha actual.

2.  **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <4>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```
Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
4,
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
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/1dd1d070-1790-4e0d-bea9-bb417b755f72) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking". El campo "Fecha" se autocompleta con la fecha actual.

2. **Botón "Agregar pedido":** Identificado con el número 6 en la imagen. Lleva al usuario a la pantalla I308. Retorna un código de pedido que se agrega en pantalla.

3. **Botón "Eliminar pedido":** Identificado con el número 7 en la imagen. Elimina un código de pedido.

4.  **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <4>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```

Validación del código de ruta:

``` sql
SELECT EXISTS (SELECT * FROM ruta WHERE cod_ruta = <8>)
```

Validación de la placa del vehículo:

``` sql
SELECT EXISTS (SELECT * FROM vehiculo WHERE placa = <9>)
```

Validación del DNI del transportista:

``` sql
SELECT EXISTS (SELECT *
FROM transportista t
INNER JOIN empleado e ON t.cod_empleado = e.cod_empleado
INNER JOIN persona p ON e.cod_persona = p.cod_persona
WHERE p.dni = <10>)
```

Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
5,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```

El valor retornado por esta sentencia se almacena en una variable en el backend. Sea esta variable "id_operacion". Esta operación de tipo "Salida" marca el inicio de un traslado. Con la siguiente sentencia se inserta la fila respectiva en la tabla traslado con el id de la operación registrada.

``` sql
INSERT INTO traslado (cod_vehiculo, cod_ruta, cod_transportista, id_operacion_inicia)
VALUES
((SELECT cod_vehiculo FROM vehiculo WHERE placa = <9>),
<8>,
(SELECT t.cod_transportista
FROM transportista t
INNER JOIN empleado e on t.cod_empleado = e.cod_empleado
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <10>),
<id_operacion>)
RETURNING id_traslado;
```

El valor retornado por esta sentencia se almacena en una variable en el backend. Sea esta variable "id_traslado". Con la siguiente sentencia se genera el código de guía remisión de 21 dígitos usando las variables "id_traslado" e "id_operacion".

``` sql
SELECT LPAD(CAST(<id_traslado> AS TEXT), 5, '0') ||
TO_CHAR(o.fecha, 'YYYYMMDD') || TO_CHAR(o.hora_inicio, 'HH24MI') || TO_CHAR(o.hora_fin, 'HH24MI')
FROM operacion o WHERE o.id_operacion = <id_operacion>
```

El valor retornado por esta sentencia se almacena en una variable en el backend. Sea esta variable "cod_guia_remision". Con la siguiente sentencia se actualiza en la fila de la tabla traslado insertada este código de guía remisión:

``` sql
UPDATE traslado SET cod_guia_remision = <cod_guia_remision> WHERE id_traslado = <id_traslado>
```

En la parte del frontend, se almacena en una estructura de datos los códigos de pedido ingresados por el usuario. Sea cada uno de estos códigos representado por la variable "cod_pedido". Para cada uno de estos valores se ejecuta la siguiente sentencia:

``` sql
INSERT INTO detalle_ticket_traslado(id_traslado, cod_ticket)
VALUES (
id_traslado>,
(SELECT t.cod_ticket
FROM ticket t
INNER JOIN pedido p ON t.cod_ticket = p.cod_ticket
WHERE p.cod_pedido = <cod_pedido>)
);
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R305           |
| Código      | I308 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/708bd7b5-63fb-4515-a478-a3ac052d7301) |

1. **Botón "Agregar":** Se realiza la siguiente validación:

Validación del código de pedido:

``` sql
SELECT EXISTS (SELECT * FROM pedido WHERE cod_pedido = <1>)
```

Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se agrega el código de pedido agregado en el campo `<1>`. Regresa al usuario a la pantalla I307.

2. **Botón "Cerrar":** Regresa al usuario a la pantalla I307.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R306           |
| Código      | I309 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/dc002a04-4c28-4deb-bb7d-2da7d3f92294) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking". El campo "Fecha" se autocompleta con la fecha actual.

2.  **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <4>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```
Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
6,
<1>,
<2>,
<3>
)
RETURNING id_operacion;
```
El valor retornado por esta sentencia se almacena en una variable en el backend. Sea esta variable "id_operacion". Esta operación de tipo "Recepción" marca el fin de un traslado. Con la siguiente sentencia se actualiza la fila respectiva de la tabla traslado con el id de la operación registrada.

``` sql
UPDATE traslado
SET id_operacion_termina = <id_operacion>
FROM traslado t
INNER JOIN operacion o ON t.id_operacion_inicia = o.id_operacion
WHERE o.id_operacion_picking = <id_operacion_picking>;
```

Se muestra al usuario la pantalla I311.

|                  |                                                                                     |
| ---------------- | --------------------------------------------------------------------------------------------------- |
| Requerimientos relacionados         | R307           |
| Código      | I310 |
| Prototipo   | ![image](https://github.com/fiis-bd241/grupo01/assets/130816094/895a7907-cb6d-41d8-ba74-0d42f367bc5c) |

1.  **Carga de página:** Para llegar a esta pantalla, necesariamente se debe partir desde la pantalla I301 o I311. En ambos casos, se asigna el valor pasado como parámetro a la variable "id_operacion_picking". El campo "Fecha" se autocompleta con la fecha actual.

2.  **Botón "Ingresar":** Se realizan las siguientes validaciones:

Validación del DNI del empleado ejecutor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <4>)
```

Validación del DNI del empleado supervisor:

``` sql
SELECT EXISTS (SELECT *
FROM empleado e
INNER JOIN persona p on p.cod_persona = e.cod_persona
WHERE p.dni = <5>)
```
Si alguna validación falla, se muestra un mensaje de error describiendo el problema. De lo contrario, se ingresan a la base de datos los valores ingresados por medio de la siguiente sentencia SQL:

``` sql
INSERT INTO operacion (id_operacion_picking, cod_empleado_ejecutor, cod_empleado_supervisor, cod_tipo_operacion, fecha, hora_inicio, hora_fin)
VALUES (
<id_operacion_picking>,
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <4>),
(SELECT e.cod_empleado FROM empleado e JOIN persona p ON e.cod_persona = p.cod_persona WHERE p.dni = <5>),
7,
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

1. **Botón "Volver a vista de procesoss":** Lleva al usuario a la pantalla I301.

2. **Botón "Continuar siguiente operación":** Lleva al usuario a la pantalla adecuada para registrar una operación adicional del proceso en cuestión. Es decir, si la pantalla actual es de tipo "Picking", se lleva al usuario a la pantalla I304; si es de tipo "Precintado", a la pantalla I305; si es de tipo "Paletizado", a la pantalla I306; si es de tipo "Carga", a la pantalla I307; si es de tipo "Salida", a la pantalla I309; y si es de tipo "Recepción", a la pantalla I310. Si es de tipo "Descarga", el botón "Continuar siguiente operación" no se habilita. Toda esta lógica descrita se implementa en el frontend. Además, el valor del atributo "id_operacion_picking" de la pantalla actual se pasa como un parámetro llamado "id_operacion_picking" a esta nueva pantalla. 

En el caso de que la pantalla actual sea de tipo "Salida", en el mensaje de confirmación se muestra el código de guía de remisión generado, como se ve en la imagen a continuación.

![Captura de Pantalla 2024-06-04 a la(s) 23 58 50](https://github.com/fiis-bd241/grupo01/assets/130816094/f6356122-ad6b-43c2-bd22-aafe36a1622b)

En el caso de que la pantalla actual sea de tipo "Descarga", como se mencionó, este botón no se habilita, como se ve en la imagen a continuación.

![Captura de Pantalla 2024-06-05 a la(s) 00 00 37](https://github.com/fiis-bd241/grupo01/assets/130816094/96817a5a-28b2-4a37-a0c5-ccc1b4994a06)

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
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/5468b073-0253-46e4-9c92-a86ee9ddae30">
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
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/a36b2b4b-8654-44ec-a3ba-df7ff85c4d1e">
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
UPDATE Transportista SET cod_estado_transportista = <1> WHERE cod_estado_transportista = 2 AND cod_transportista = <2>
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
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/41c637e5-bdc6-4ed0-8dd5-562eeef707cb">
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
    v.cod_vehiculo AS "Código Vehículo",
    v.año_fabricacion AS "Año Fabricación",
    v.fecha_ultimo_mantenimiento AS "Fecha Último Mantenimiento",
    v.capacidad_carga AS "Capacidad de Carga",
    vm.descripcion AS "Marca",
    v.placa AS "Placa",
    v.fecha_ultimo_viaje AS "Fecha Último Viaje",
    ve.descripcion AS "Estado del Vehículo"
FROM 
    vehiculo v
JOIN 
    vehiculo_modelo vm ON v.cod_vehiculo_modelo = vm.cod_vehiculo_modelo
JOIN 
    vehiculo_estado ve ON v.cod_vehiculo_estado = ve.cod_vehiculo_estado

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
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/edd1ee65-2adb-45c4-9058-8d5c27c0e206">
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
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/a54903b4-1a59-4620-bf74-38885420d54e">
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/7721353f-20f2-41e9-a837-bc1c2005fd9c">
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/617f5b07-1d3c-4370-ab8c-39bd08ad88d3">
         <img src="https://github.com/Alexclb0/Holamundo/assets/164266999/e95d453b-0427-48ee-8a46-e54368231569">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Nueva incidencia: 
El administrador podrá registrar una nueva incidencia seleccionando primero el tipo de incidencia que se presenta. Dependiendo de la opción elegida, se determinará un tipo de procedimiento específico, cuya selección dependerá del empleado y del contexto de la situación. Este procedimiento elegido se basará en un tipo de norma aplicable.

1. Se llenará la lista de tipos de incidencia según el contexto que se presentase.

``` sql 
SELECT * FROM incidencia_tipo;
```

2. Se seleccionará el tipo de procedimiento a efectuar en base a determinado tipo de incidencia. 

``` sql 
SELECT * FROM procedimiento_tipo;
```

3. Se seleccionará el tipo de norma en las cuales se basa cada procedimiento.

``` sql 
SELECT * FROM norma_tipo;
```

4. Al apretar el botón Registrar se actualiza el código del tipo de incidencia, el tipo de procedimiento, la descripción detallada de la incidencia, tipo de norma, fecha de ocurrencia, hora de ocurrencia, tiempo estimado de procedimiento (en horas).

``` sql 
UPDATE incidencia
SET cod_tipo_incidencia = <1>, cod_tipo_procedimiento =<2>, descripcion = <3>, cod_norma_tipo = <4>, fecha_ocurrencia=<5>, hora_ocurrencia=<6>, id_traslado=<7>, tiempo_estimado=<8> 
WHERE incidencia.cod_incidencia = <9>
```
Donde <1> es el código del tipo de incidencia escogido por el empleado, tomando en cuenta el contexto presentado. 

Donde <2> es el código del tipo de procedimiento escogido por el empleado, tomando en cuenta el contexto presentado. 

Donde <3> es la descripción a detalle de la incidencia, escrita por el empleado.

Donde <4> es el código del tipo de norma escogido por el empleado, tomando en cuenta el contexto presentado. 

Donde <5> es la fecha en la que ocurrió la incidencia, registrada por el empleado. 

Donde <6> es la hora exacta en la que ocurrió la incidencia, registrada por el empleado. 

Donde <7> es el código del traslado, en el cual se presentó determinada incidencia. 

Donde <8> es el tiempo estimado en horas de la duración del procedimiento.

Donde <9> es el código de la incidencia actual. 


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
         <img src="https://github.com/fiis-bd241/grupo01/assets/164266999/dfd1cd46-edc9-4934-a378-9dac58e0f49a">
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
    i.cod_incidencia AS "Código Incidencia",
    i.id_traslado AS "Código Traslado",
    it.descripcion AS "Tipo de Incidencia",
    i.fecha_ocurrencia AS "Fecha de Ocurrencia",
    i.hora_ocurrencia AS "Hora de Ocurrencia",
    i.cod_estado_incidencia AS "Estado Incidencia"
FROM 
    incidencia i
JOIN 
    incidencia_tipo it ON i.cod_tipo_incidencia = it.cod_tipo_incidencia;

```

### Caso 7
<table>
   <tr>
      <td>Código Requerimiento</td>
      <td>I408</td>
   </tr>
   <tr>
      <td>Código interfaz</td>
      <td>I402</td>
   </tr>
   <tr>
      <td>Imagen interfaz</td>
      <td>
         <img src="https://github.com/fiis-bd241/grupo01/assets/164266999/98f05098-900c-4e63-9d0b-eab06cd2cac9">
      </td>
   </tr>
   <tr>
      <td colspan="2">Sentencias SQL</td>
   </tr>
</table>

## Evento:
### Botón estado: 
El botón sirve para que el administrador pueda cambiar el estado de atención de la incidencia  que puede ser Solucionado o Pendiente. 
``` sql
UPDATE incidencia SET cod_estado_incidencia = <1> WHERE cod_estado_incidencia = 2 AND cod_incidencia = <2>

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
Los archivos para el ingreso masivo de datos se encuentran en el folder de Anexos.
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
DROP TABLE IF EXISTS reporte_frecuencia;
DROP TABLE IF EXISTS reporte_tipo;
DROP TABLE IF EXISTS archivo_tipo;
DROP TABLE IF EXISTS evidencia_tipo;
DROP TABLE IF EXISTS nivel_urgencia;
DROP TABLE IF EXISTS estado_reclamo;
DROP TABLE IF EXISTS reclamo_tipo;
DROP TABLE IF EXISTS accion_tipo;
DROP TABLE IF EXISTS norma_tipo;
DROP TABLE IF EXISTS procedimiento_tipo;
DROP TABLE IF EXISTS incidencia_estado;
DROP TABLE IF EXISTS incidencia_tipo;
DROP TABLE IF EXISTS pedido_estado;
DROP TABLE IF EXISTS pedido_tipo;
DROP TABLE IF EXISTS paradero_tipo;
DROP TABLE IF EXISTS local_ubigeo;
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
DROP TABLE IF EXISTS vehiculo_marca;
DROP TABLE IF EXISTS vehiculo_tipo;
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

CREATE TABLE IF NOT EXISTS vehiculo_marca (
 cod_vehiculo_marca INT,
 descripcion VARCHAR(20),
 PRIMARY KEY (cod_vehiculo_marca)
);

CREATE TABLE IF NOT EXISTS vehiculo_tipo (
 cod_vehiculo_tipo CHAR(1),
 descripcion VARCHAR(20),
 PRIMARY KEY (cod_vehiculo_tipo)
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

CREATE TABLE IF NOT EXISTS local_ubigeo (
    cod_local_ubigeo INT NOT NULL,
    departamento VARCHAR(50),
    provincia VARCHAR(50),
    distrito VARCHAR(50),
    capital VARCHAR(50),
    cod_region_natural INT NOT NULL,
    region_natural VARCHAR(50),
    PRIMARY KEY (cod_local_ubigeo)
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

CREATE TABLE IF NOT EXISTS incidencia_estado (
    cod_estado_incidencia CHAR(1) PRIMARY KEY,
    descripcion VARCHAR(50)
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

CREATE TABLE IF NOT EXISTS reporte_frecuencia (
    cod_reporte_frecuencia INT PRIMARY KEY,
    descripcion VARCHAR(50) NOT NULL,
    cantidad_tiempo INT NOT NULL,
    unidad_tiempo VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS reporte_formato (
 cod_reporte_formato INT NOT NULL,
 descripcion VARCHAR(32),
 PRIMARY KEY (cod_reporte_formato)
);

CREATE TABLE IF NOT EXISTS reporte_tipo (
    cod_reporte_tipo INT PRIMARY KEY,
    descripcion VARCHAR(50) NOT NULL
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
 fecha_ultimo_viaje DATE,
 capacidad_carga FLOAT NOT NULL CHECK (capacidad_carga > 0),
 cod_vehiculo_marca INT NOT NULL,
 cod_vehiculo_tipo CHAR(1) NOT NULL,
 placa CHAR(7) NOT NULL,
 PRIMARY KEY (cod_vehiculo),
 CONSTRAINT cod_vehiculo_estado
 FOREIGN KEY (cod_vehiculo_estado)
 REFERENCES vehiculo_estado (cod_vehiculo_estado),
 CONSTRAINT cod_vehiculo_marca
 FOREIGN KEY (cod_vehiculo_marca)
 REFERENCES vehiculo_marca (cod_vehiculo_marca),
 CONSTRAINT cod_vehiculo_tipo
 FOREIGN KEY (cod_vehiculo_tipo)
 REFERENCES vehiculo_tipo (cod_vehiculo_tipo)
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
num_licencia CHAR(9) NULL DEFAULT NULL,
fecha_vencimiento_licencia DATE NOT NULL,
fecha_ultimo_traslado DATE DEFAULT NULL,
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
 nro_precinto CHAR(20) NULL DEFAULT NULL,
 PRIMARY KEY (id_mercancia),
 CONSTRAINT id_operacion_picking
 FOREIGN KEY (id_operacion_picking)
 REFERENCES operacion (id_operacion),
 CONSTRAINT uk_nro_precinto UNIQUE (nro_precinto)
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
 cod_local_ubigeo INT NOT NULL,
 calle VARCHAR(64) NULL,
 numero INT NULL,
 denominacion VARCHAR(64) NULL DEFAULT NULL,
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
 CONSTRAINT cod_local_ubigeo
 FOREIGN KEY (cod_local_ubigeo)
 REFERENCES local_ubigeo (cod_local_ubigeo)
);

CREATE TABLE IF NOT EXISTS paradero (
 cod_paradero SERIAL NOT NULL,
 cod_local INT NOT NULL,
 cod_ruta INT NOT NULL,
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
 cantidad_disponible INT NOT NULL CHECK (cantidad_disponible > 0),
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
 cod_vehiculo INT NOT NULL,
 cod_ruta INT NOT NULL,
 cod_transportista INT NOT NULL,
 id_operacion_inicia INT NOT NULL,
 id_operacion_termina INT NULL DEFAULT NULL,
 cod_guia_remision CHAR(21) NULL,
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
 fecha_ocurrencia DATE NOT NULL,
 hora_ocurrencia TIME NOT NULL,
 cod_estado_incidencia CHAR(1) NOT NULL,
 PRIMARY KEY (cod_incidencia),
 CONSTRAINT id_traslado
 FOREIGN KEY (id_traslado)
 REFERENCES traslado (id_traslado),
 CONSTRAINT cod_tipo_incidencia
 FOREIGN KEY (cod_tipo_incidencia)
 REFERENCES incidencia_tipo (cod_tipo_incidencia),
 CONSTRAINT cod_estado_incidencia
 FOREIGN KEY (cod_estado_incidencia)
 REFERENCES incidencia_estado (cod_estado_incidencia)
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
 comentario VARCHAR(500) NULL DEFAULT NULL,
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
 cod_reporte_estado INT NOT NULL,
 cod_reporte_tipo INT NOT NULL,
 cod_reporte_frecuencia INT NOT NULL,
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
 REFERENCES reporte_estado (cod_reporte_estado),
 CONSTRAINT cod_reporte_tipo
 FOREIGN KEY (cod_reporte_tipo)
 REFERENCES reporte_tipo (cod_reporte_tipo),
 CONSTRAINT cod_reporte_frecuencia
 FOREIGN KEY (cod_reporte_frecuencia)
 REFERENCES reporte_frecuencia (cod_reporte_frecuencia)
);

CREATE TABLE IF NOT EXISTS reporte (
 cod_reporte SERIAL NOT NULL,
 cod_representante INT NOT NULL,
 cod_reporte_formato INT NOT NULL,
 cod_reporte_tipo INT NOT NULL,
 fecha_generacion DATE NOT NULL,
 hora_generacion TIME NOT NULL,
 PRIMARY KEY (cod_reporte),
 CONSTRAINT cod_reporte_representante
 FOREIGN KEY (cod_representante)
 REFERENCES representante (cod_representante),
 CONSTRAINT cod_reporte_formato_fk
 FOREIGN KEY (cod_reporte_formato)
 REFERENCES reporte_formato (cod_reporte_formato),
 CONSTRAINT cod_reporte_tipo_fk
 FOREIGN KEY (cod_reporte_tipo)
 REFERENCES reporte_tipo (cod_reporte_tipo)
);

/* LLENAR TABLAS */

DO $$
DECLARE
    base_path TEXT := '/Users/Joaquín/dbd/csv/'; --Cambiar a la ruta donde se almacenan los csv
BEGIN
    EXECUTE 'COPY estado_civil FROM ' || quote_literal(base_path || 'Estado_civil.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY nacionalidad FROM ' || quote_literal(base_path || 'Nacionalidad.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY genero FROM ' || quote_literal(base_path || 'Genero.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY cliente_estado FROM ' || quote_literal(base_path || 'Cliente_estado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY cliente_tipo FROM ' || quote_literal(base_path || 'Cliente_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY vehiculo_estado FROM ' || quote_literal(base_path || 'Vehiculo_estado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY vehiculo_tipo FROM ' || quote_literal(base_path || 'Vehiculo_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY vehiculo_marca FROM ' || quote_literal(base_path || 'Vehiculo_marca.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY elemento_produccion FROM ' || quote_literal(base_path || 'Elemento_produccion.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY segmento FROM ' || quote_literal(base_path || 'Segmento.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY elemento_catalogo_tipo FROM ' || quote_literal(base_path || 'Elemento_catalogo_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY elemento_catalogo_unidad FROM ' || quote_literal(base_path || 'Elemento_catalogo_unidad.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY ruta_tipo FROM ' || quote_literal(base_path || 'Ruta_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY empleado_cargo FROM ' || quote_literal(base_path || 'Empleado_cargo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY transportista_estado FROM ' || quote_literal(base_path || 'Transportista_estado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY licencia_tipo FROM ' || quote_literal(base_path || 'Licencia_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY operacion_tipo FROM ' || quote_literal(base_path || 'Operacion_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY local_tipo FROM ' || quote_literal(base_path || 'Local_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY local_ubigeo FROM ' || quote_literal(base_path || 'UBIGEOS_2022_1891_distritos.csv') || ' DELIMITER '';'' CSV HEADER';
    EXECUTE 'COPY paradero_tipo FROM ' || quote_literal(base_path || 'Paradero_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY pedido_tipo FROM ' || quote_literal(base_path || 'Pedido_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY pedido_estado FROM ' || quote_literal(base_path || 'Pedido_estado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY incidencia_tipo FROM ' || quote_literal(base_path || 'Incidencia_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY incidencia_estado FROM ' || quote_literal(base_path || 'Incidencia_estado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY procedimiento_tipo FROM ' || quote_literal(base_path || 'Procedimiento_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY norma_tipo FROM ' || quote_literal(base_path || 'Norma_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY accion_tipo FROM ' || quote_literal(base_path || 'Accion_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reclamo_tipo FROM ' || quote_literal(base_path || 'Reclamo_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY estado_reclamo FROM ' || quote_literal(base_path || 'Estado_reclamo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY nivel_urgencia FROM ' || quote_literal(base_path || 'Nivel_urgencia.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY evidencia_tipo FROM ' || quote_literal(base_path || 'Evidencia_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY archivo_tipo FROM ' || quote_literal(base_path || 'Archivo_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reporte_frecuencia FROM ' || quote_literal(base_path || 'Reporte_frecuencia.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reporte_formato FROM ' || quote_literal(base_path || 'Reporte_formato.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reporte_tipo FROM ' || quote_literal(base_path || 'Reporte_tipo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reporte_estado FROM ' || quote_literal(base_path || 'Reporte_estado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY persona FROM ' || quote_literal(base_path || 'Persona.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY cliente FROM ' || quote_literal(base_path || 'Cliente.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY ubicacion FROM ' || quote_literal(base_path || 'Ubicacion.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY ticket FROM ' || quote_literal(base_path || 'Ticket.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY vehiculo FROM ' || quote_literal(base_path || 'Vehiculo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY elemento_catalogo FROM ' || quote_literal(base_path || 'Elemento_catalogo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY ruta FROM ' || quote_literal(base_path || 'Ruta.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY empleado FROM ' || quote_literal(base_path || 'Empleado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY transportista FROM ' || quote_literal(base_path || 'Transportista.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY operacion FROM ' || quote_literal(base_path || 'Operacion.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY mercancia FROM ' || quote_literal(base_path || 'Mercancia.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY representante FROM ' || quote_literal(base_path || 'Representante.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY gps FROM ' || quote_literal(base_path || 'Gps.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY "local" FROM ' || quote_literal(base_path || 'Local.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY paradero FROM ' || quote_literal(base_path || 'Paradero.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY stock FROM ' || quote_literal(base_path || 'Stock.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY detalle_mercancia_stock FROM ' || quote_literal(base_path || 'Detalle_mercancia_stock.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY pedido FROM ' || quote_literal(base_path || 'Pedido.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY traslado FROM ' || quote_literal(base_path || 'Traslado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY detalle_ticket_traslado FROM ' || quote_literal(base_path || 'Detalle_ticket_traslado.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY detalle_ticket_producto FROM ' || quote_literal(base_path || 'Detalle_ticket_producto.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY incidencia FROM ' || quote_literal(base_path || 'Incidencia.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY procedimiento FROM ' || quote_literal(base_path || 'Procedimiento.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY norma FROM ' || quote_literal(base_path || 'Norma.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY seguimiento FROM ' || quote_literal(base_path || 'Seguimiento.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reclamo FROM ' || quote_literal(base_path || 'Reclamo.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY evidencia FROM ' || quote_literal(base_path || 'Evidencia.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY programacion_reporte FROM ' || quote_literal(base_path || 'Programacion_reporte.csv') || ' DELIMITER '','' CSV HEADER';
    EXECUTE 'COPY reporte FROM ' || quote_literal(base_path || 'Reporte.csv') || ' DELIMITER '','' CSV HEADER';
END $$;

/* ACTUALIZAMOS VALORES DE LAS SECUENCIAS */

-- Actualizar la secuencia para la tabla "persona"
SELECT setval('persona_cod_persona_seq', (SELECT MAX(cod_persona) FROM persona));

-- Actualizar la secuencia para la tabla "cliente"
SELECT setval('cliente_cod_cliente_seq', (SELECT MAX(cod_cliente) FROM cliente));

-- Actualizar la secuencia para la tabla "ubicacion"
SELECT setval('ubicacion_cod_ubicacion_seq', (SELECT MAX(cod_ubicacion) FROM ubicacion));

-- Actualizar la secuencia para la tabla "ticket"
SELECT setval('ticket_cod_ticket_seq', (SELECT MAX(cod_ticket) FROM ticket));

-- Actualizar la secuencia para la tabla "vehiculo"
SELECT setval('vehiculo_cod_vehiculo_seq', (SELECT MAX(cod_vehiculo) FROM vehiculo));

-- Actualizar la secuencia para la tabla "elemento_catalogo"
SELECT setval('elemento_catalogo_id_elemento_catalogo_seq', (SELECT MAX(id_elemento_catalogo) FROM elemento_catalogo));

-- Actualizar la secuencia para la tabla "ruta"
SELECT setval('ruta_cod_ruta_seq', (SELECT MAX(cod_ruta) FROM ruta));

-- Actualizar la secuencia para la tabla "empleado"
SELECT setval('empleado_cod_empleado_seq', (SELECT MAX(cod_empleado) FROM empleado));

-- Actualizar la secuencia para la tabla "transportista"
SELECT setval('transportista_cod_transportista_seq', (SELECT MAX(cod_transportista) FROM transportista));

-- Actualizar la secuencia para la tabla "operacion"
SELECT setval('operacion_id_operacion_seq', (SELECT MAX(id_operacion) FROM operacion));

-- Actualizar la secuencia para la tabla "mercancia"
SELECT setval('mercancia_id_mercancia_seq', (SELECT MAX(id_mercancia) FROM mercancia));

-- Actualizar la secuencia para la tabla "representante"
SELECT setval('representante_cod_representante_seq', (SELECT MAX(cod_representante) FROM representante));

-- Actualizar la secuencia para la tabla "gps"
SELECT setval('gps_cod_gps_seq', (SELECT MAX(cod_gps) FROM gps));

-- Actualizar la secuencia para la tabla "local"
SELECT setval('"local_cod_local_seq"', (SELECT MAX(cod_local) FROM "local"));

-- Actualizar la secuencia para la tabla "paradero"
SELECT setval('paradero_cod_paradero_seq', (SELECT MAX(cod_paradero) FROM paradero));

-- Actualizar la secuencia para la tabla "stock"
SELECT setval('stock_id_stock_seq', (SELECT MAX(id_stock) FROM stock));

-- Actualizar la secuencia para la tabla "pedido"
SELECT setval('pedido_cod_pedido_seq', (SELECT MAX(cod_pedido) FROM pedido));

-- Actualizar la secuencia para la tabla "traslado"
SELECT setval('traslado_id_traslado_seq', (SELECT MAX(id_traslado) FROM traslado));

-- Actualizar la secuencia para la tabla "incidencia"
SELECT setval('incidencia_cod_incidencia_seq', (SELECT MAX(cod_incidencia) FROM incidencia));

-- Actualizar la secuencia para la tabla "procedimiento"
SELECT setval('procedimiento_cod_procedimiento_seq', (SELECT MAX(cod_procedimiento) FROM procedimiento));

-- Actualizar la secuencia para la tabla "norma"
SELECT setval('norma_cod_norma_seq', (SELECT MAX(cod_norma) FROM norma));

-- Actualizar la secuencia para la tabla "seguimiento"
SELECT setval('seguimiento_cod_seguimiento_seq', (SELECT MAX(cod_seguimiento) FROM seguimiento));

-- Actualizar la secuencia para la tabla "reclamo"
SELECT setval('reclamo_cod_reclamo_seq', (SELECT MAX(cod_reclamo) FROM reclamo));

-- Actualizar la secuencia para la tabla "evidencia"
SELECT setval('evidencia_cod_evidencia_seq', (SELECT MAX(cod_evidencia) FROM evidencia));

-- Actualizar la secuencia para la tabla "programacion_reporte"
SELECT setval('programacion_reporte_cod_programacion_reporte_seq', (SELECT MAX(cod_programacion_reporte) FROM programacion_reporte));

-- Actualizar la secuencia para la tabla "reporte"
SELECT setval('reporte_cod_reporte_seq', (SELECT MAX(cod_reporte) FROM reporte));

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

### 2. Funcionalidad Primaria del Módulo de Seguimiento
**Funcionalidad primaria elegida:** Registrar entregas en el proceso de traslado y actualizar el estatus del pedido. <br>
**Sustentación:** Registrar las entregas en el proceso de traslado es una de las necesidades más importantes que aborda el módulo y que registra el mismo transportista; esto es parte de la evolución del estado del pedido para pasar a una fase en la que ya no tiene influencia de traslados. 
Esta funcionalidad permite cubrir el requerimiento R203 desde la entrada al módulo, realización de búsqueda, visualización de datos y registro de cambios sobre atributos de productos, además, deberá incluir una interfaz dinámica para la busqueda de otras guías de remisión que requieran el registro de de entregas por  lo que la implementación aborta las pantallas I201, I202 y I202-E1.
Como agregado adicional se debe realizar una restricción de registro de entregas solo a los transportistas que están realizando dicho traslado para evitar conflictos de responsabilidades, lo cual requiere un control de accesos en todo el sistema.

### 3. Funcionalidad Primaria del Módulo de Almacén
**Funcionalidad primaria elegida:** Registrar la información de todos los procesos por los que pasan las mercancías a transportar, desde el picking hasta la descarga. <br>
**Sustentación:** Esta funcionalidad es de suma importancia dentro del proceso de negocio elegido, ya que abarca la información respectiva al traslado que es usada por los otros módulos. Por ejemplo, permite tener un control sobre la secuencia de operaciones que acontecen sobre una mercancía por medio de la trazabilidad, lo cual permite proveer la información necesaria al módulo de control para cumplir sus requerimientos. Además, esta funcionalidad permite establecer la relación entre los pedidos y los traslados, lo cual permite al módulo de seguimiento cumplir con su funcionalidad. En definitiva, la funcionalidad elegida provee la información que es la base para los demás módulos y permite soportar las demás etapas del proceso de negocio, ya que provee información de antes, durante y después del traslado en términos de las operaciones realizadas. Esta funcionalidad abarca todos los requerimientos desde R301 hasta R307.

### 4. Funcionalidad Primaria del Módulo de Control

**Funcionalidad primaria elegida:** Registrar una nueva incidencia durante el traslado de un pedido y verificar el estado de atención de las incidencia. <br>
**Sustentación:** Registrar una nueva incidencia permite una rápida identificación y registro de problemas que ocurren durante el proceso de traslado, asegurando que sean abordados de manera oportuna. Análogamente, verificar el estado de atención de una incidencia es esencial para monitorizar el progreso de la resolución, garantizando que se tomen las acciones necesarias y se mantenga la transparencia en el proceso de gestión de incidencias.
Esta funcionalidad permitirá cumplir con los requerimientos de Registrar Nueva Incidencia (R403), Pantalla de Incidencias (I407), Registrar Nuevo Estado de Atención de Incidencia (I408),  Mostrar Incidencias filtradas los cuales se encuentran relacionados con las interfaces I401,I402,I403, I404, I405, I406, I407, I408. Habrá dos apartados: uno para registrar una nueva incidencia y otro para verificar el estado de atención de las incidencias. Una vez completados estos pasos, se registrará en el historial del listado de todas las incidencias registradas hasta la fecha en San Fernado. 

### 5. Funcionalidad Primaria del módulo de reportes

**Funcionalidad primaria elegida:** Programar la generación de un tipo de reporte en un intervalo de tiempo definido. <br>
**Sustentación:** La generación automática de informes permite un acceso eficiente a información crítica sin intervención manual. De manera análoga a cómo el registro de reclamos facilita la identificación oportuna de problemas, la generación automática de informes asegura que los datos relevantes estén disponibles cuando se necesiten, sin retrasos ni esfuerzos adicionales. Así como la visualización del estado de un reclamo es esencial para monitorear el progreso de su resolución, la capacidad de programar y personalizar informes garantiza que la información se presente en los formatos y frecuencias adecuados para respaldar la toma de decisiones basada en datos dentro de la empresa. Esta funcionalidad permitirá cumplir con los requerimientos de Generar reporte (R501) y Programar reporte (R502), los cuales se encuentran relacionados con las interfaces I501 y I503. Contará con dos secciones principales: una para programar la generación de nuevos informes y otra para visualizar y acceder a los informes generados automáticamente.

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

### 1. Módulo de pedidos
Miguel Anderson Inocente Caro

<div align="center">
    <a href="https://www.youtube.com/watch?v=RnyEoHbUCNg" target="_blank">
        <img src="http://img.youtube.com/vi/RnyEoHbUCNg/0.jpg" alt="Modulo de Control" width="500" height="auto" border="10" />
    </a>
</div>

### 2. Módulo de Seguimiento
Integrante: [Dennis Leopoldo Campos Herrera](https://github.com/fiis-bd241/grupo01/blob/e11964c8d98cf930b2a1f7a0ef1d839365c7b5ca/01.%20integrantes/Dennis%20Campos%20/Dennis%20Campos.md)

<div align="center">
    <a href="http://www.youtube.com/watch?feature=player_embedded&v=_u1CBCqJ6Z0" target="_blank">
        <img src="http://img.youtube.com/vi/_u1CBCqJ6Z0/0.jpg" alt="Modulo de Seguimiento" width="500" height="auto" border="10" />
    </a>
</div>

### 3. Módulo de Almacén
José Joaquín Alvarado Usucachi

[![Almacén](https://github.com/fiis-bd241/grupo01/assets/130816094/3384df56-01cd-44e4-ba59-666440a257f6)](https://www.youtube.com/watch?v=EJHsDP4KYko)

### 4. Módulo de Control 
Alex Espinoza Cerna

<div align="center">
    <a href="https://www.youtube.com/watch?v=49ex4_ZWXF4" target="_blank">
        <img src="http://img.youtube.com/vi/49ex4_ZWXF4/0.jpg" alt="Modulo de Control" width="500" height="auto" border="10" />
    </a>
</div>

### 5. Módulo de Reportes
Cristhian Samir Cruz Mamani

<div align="center">
    <a href="https://www.youtube.com/watch?v=YLxhekfsW98" target="_blank">
        <img src="http://img.youtube.com/vi/YLxhekfsW98/0.jpg" alt="Modulo de Reportes" width="500" height="auto" border="10" />
    </a>
</div>

### 6. Módulo de Reclamos
Leonardo Gustavo Cárdenas Palacios

[![Reclamos](https://github.com/fiis-bd241/grupo01/assets/130238034/1d0ebf09-f1c0-49b8-b806-a27a4e71395d)](https://www.youtube.com/watch?v=YM5b_5PBoSk)

