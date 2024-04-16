# Primera práctica calificada - Informe

## Descripción del Proceso de Negocio

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


### 2. Diagrama del proceso de negocio

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

### 1. Requerimientos funcionales

a. Usuarios y casos de uso

- Perfil de usuario de Planta de Beneficio Huaral (Supervisor de Almacén, Asistente de Almacén, etc.)

   - Realizar pedidos de materiales (suministros, repuestos, insumos, etiquetas, etc.)
   - Verificar pedidos en tránsito y recepcionar pedidos entrantes
   - Gestionar devoluciones de productos terminados
   - Visualizar estadísticas de recepción/despacho de productos

- Perfil de usuario de Almacén Central

   - Gestionar pedidos de las distintas plantas
   - Asignar vehículos y conductores para el despacho
   - Realizar despachos hacia las plantas
   - Gestionar devoluciones de plantas
   - Visualizar estadísticas de despachos

- Perfil de usuario de Área de Transporte

   - Gestionar flota de vehículos y conductores
   - Asignar vehículos y conductores para despachos
   - Realizar seguimiento de entregas
   - Visualizar estadísticas de transporte

- Perfil de usuario de Área de Programación

   - Planificar producción diaria/semanal
   - Coordinar con granjas para envío de aves
   - Visualizar estadísticas de producción
  
- Perfil de usuario de Área de Producción

   - Gestionar proceso de producción (recepción de aves, viscerado, corte, marinado, etc.)
   - Coordinar con despacho para cumplir ventanas horarias
   - Visualizar estadísticas de producció
  
- Perfil de usuario de Área de Calidad

   - Gestionar devoluciones de clientes
   - Analizar causas de devoluciones
   - Visualizar estadísticas de calidad
  
- Perfil de usuario de Proveedor

   - Visualizar pedidos de Almacén Central
   - Confirmar fechas de entrega
   - Realizar seguimiento de pedidos

### 2. Requerimientos de atributos de calidad
- Rendimiento: El sistema debe ser capaz de manejar grandes volúmenes de transacciones y datos, especialmente en áreas como despacho y producción, donde se manejan operaciones críticas con ventanas de tiempo limitadas.
- Procesos batch: Ciertos procesos, como la planificación de producción y la generación de pedidos, pueden requerir ejecuciones periódicas (diarias, semanales, mensuales) de acuerdo con los ciclos de negocio.
- Integración con sistemas existentes: El sistema debe integrarse con el sistema SAP existente para intercambiar información de pedidos, inventarios, entregas, etc.
- Trazabilidad y auditoría: El sistema debe mantener un registro detallado de todas las transacciones y operaciones realizadas, permitiendo la trazabilidad y auditoría de los procesos.
- Seguridad y control de acceso: El sistema debe implementar medidas de seguridad adecuadas, como control de acceso basado en roles y perfiles de usuario, para proteger la información confidencial de la empresa.
- Mantenibilidad: El sistema debe estar diseñado de manera modular para facilitar la incorporación de nuevas funcionalidades y correcciones de errores.
- Usabilidad: La interfaz de usuario debe ser intuitiva y de fácil aprendizaje, con procesos guiados y retroalimentación clara para los usuarios.
- Eficiencia: El sistema debe procesar los pedidos de manera eficiente para minimizar los tiempos de espera.

### 3. Restricciones

- El diseño del modelo relacional de datos debe ser compatible con las características y funcionalidades de PostgreSQL.
- El acceso a la base de datos desde el backend debe realizarse utilizando sentencias SQL nativas de PostgreSQL.
- La base de datos del sistema se implementará utilizando PostgreSQL como sistema de gestión de base de datos.
- Para el desarrollo del backend de la aplicación se utilizará el lenguaje de programación Java, junto con el framework Spring Boot, y para la implementación del frontend de la aplicación se utilizará el framework Angular, debido a que los integrantes del equipo tienen un mayor conocimiento y experiencia con estas tecnologías.
- La comunicación entre el frontend y el backend se realizará a través de una API RESTful, siguiendo los principios de diseño de APIs modernas.
- Se deberá hacer uso de las convenciones y mejores prácticas establecidas por los frameworks Spring Boot y Angular para garantizar la consistencia y mantenibilidad del código.

### Prototipos
### Módulo 1: Pedidos

![image](../entregables%20parciales/entregable%202/imagenes/prototipo-1.png)


![image](../entregables%20parciales/entregable%202/imagenes/prototipo-2.png)


![image](../entregables%20parciales/entregable%202/imagenes/prototipo-3.png)

### Módulo 2: Seguimiento

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/seguimiento-1.jpeg)


![image](../entregables%20parciales/entregable%203/imagenes/prototipo/seguimiento-2.jpeg)


![image](../entregables%20parciales/entregable%203/imagenes/prototipo/seguimiento-3.jpeg)

### Módulo 3: Almacén

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-1.png)

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-2.png)

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-3.png)

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-4.png)

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-5.png)

![image](../entregables%20parciales/entregable%203/imagenes/prototipo/almacen-6.png)

[Figma](https://www.figma.com/file/nnoiQDwJ9WstLLZmVisdpw/Untitled?type=design&node-id=0-1&mode=design&t=ztZFDIkEuNp6ykcn-0)

### Módulo 4: Control
![figma 1](https://github.com/fiis-bd241/grupo01/assets/164266999/651613ad-ddf6-4944-a55e-7d3b2e321051)

![figma 2](https://github.com/fiis-bd241/grupo01/assets/164266999/5ccfc679-16d9-425b-9d93-3a7b09ef6e9f)

![figma 3](https://github.com/fiis-bd241/grupo01/assets/164266999/1df37adb-5e43-4da9-85e0-4fa9fc754d71)

![figma 4](https://github.com/fiis-bd241/grupo01/assets/164266999/b07618fc-3915-401b-a3aa-ee89c369919c)

![figma 5](https://github.com/fiis-bd241/grupo01/assets/164266999/dc5589dd-1e80-4d45-9f79-6bf5eff4d08e)

![figma 6](https://github.com/fiis-bd241/grupo01/assets/164266999/960ce6b6-906f-4389-b970-b19b511758b6)

![figma 7](https://github.com/fiis-bd241/grupo01/assets/164266999/c8c21cc8-f7f0-4374-8828-8d11ea403bad)

### Módulo 5: Reportes

![modulo-5f](../entregables%20parciales/entregable%203/imagenes/prototipo/reportes.png)

### Módulo 6: Reclamos

![modulo-6](../entregables%20parciales/entregable%203/imagenes/prototipo/reclamos.png)

Elaboracion propia.

Link del Figma: https://www.figma.com/file/KQ34ScwxvuSCmmvHqfIPRP/Untitled?type=design&node-id=0-1&mode=design&t=Hbv9cdOoQzm0mQQy-0

## Entrevista
A continuación, se muestra la grabación de la entrevista realizada a la ingeniera Joselin Alexandra Torres Robles, supervisora del área de almacén de la planta Huaral de San Fernando.

[![Entrevista](../entregables%20parciales/entregable%202/imagenes/video_preview.png)](http://www.youtube.com/watch?v=DPxvZC3R6Ws "Entrevista a Joselin Torres")

Los detalles de la reunión fueron registrados en la [acta](../entregable%202/acta-entrevista-20240401.md) respectiva, así como también se elaboró una [transcripción](../entregable%202/transcripcion-entrevista-20240401.md) de las preguntas y respuestas realizadas durante la entrevista, además se generó un [resumen](../entregable%202/Resumen-transcripcion.md) donde se sintetiza los procesos más importantes con un cierto orden, con el fin de comprender mejor los procesos de San Fernando.

## Avance de Diagramas Entidad-Relación
Se tomó como referencia el siguiente gráfico que identifica la relación de algunas variables de la empresa San Fernando:
![guía](../entregables%20parciales/entregable%203/imagenes/diagramas/mr.jpeg)


La siguiente imagen nos muestra un fragmento de los diagramas Entidad-Relación:
![Entidad Relacion](../entregables%20parciales/entregable%203/imagenes/diagramas/mer.png)

Finalmente adjuntamos un link donde se ven los diagramas de cada una de las variables registradas hasta el momento:
https://app.diagrams.net/#Wb!B6iW_HyZ9Uu006YT7wrOYtAgE85DSMBNgtvqP4jjpusfjQlxbKwHQbw161ArWf7P%2F01ZOJ7WU2RUCTY52DUKFEJ4FQ5DCEEUOK2#%7B%22pageId%22%3A%22R2lEEEUBdFMjLlhIrx00%22%7D



[Regresar al índice](../../../README.md)
