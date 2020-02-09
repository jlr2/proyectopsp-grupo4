# uCalendar

![Portada](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Calendario.jpg)

Este trabajo está realizado por **José Palacios Montes y Carlos Trujillo García** para la asignatura de **Programación de Servicios y Procesos**, curso 2019 - 2020. Este proyecto está bajo una licencia de *Creative Commons Reconocimiento-NoComercial-CompartirIgual 4.0 Internacional*. 

![Licencia](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Licencia.png)

# Índice

[1. Definición del problema.](#1)
<br>
[2. Análisis de requisitos funcionales.](#2)
<br>
[3. Modelo de objetos de negocio](#3)
<br>
[4. Interfaz gráfica](#4)
<br>
[5. Diagramas de secuencia](#5)

<a name="1"></a>
# Definición del problema.

Nuestra aplicación consistirá en un entorno que englobará calendarios en función de la cantidad de cursos que le darán uso a la app. También estaría la opción de añadir calendarios propios de las asignaturas del curso. En éstos, los profesores podrán añadir a los días lo siguiente: tareas, exámenes, trabajos, excursiones, días en los que el profesor o profesora no va a asistir por x cuestión, etcétera. Los alumnos, por otro lado, podrán visualizar los cambios que realicen los profesores al momento. Habrá una opción de correo/chat para preguntar dudas o proponer algún cambio.

<a name="2"></a>
# Análisis de requisitos funcionales.

## Casos de uso.

![Casos de uso](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Casos%20de%20uso%20modificado%202.png)

## Anexo.

| Datos | Descripción. |
| -- | -- |
| Nombre | Enviar dudas o preguntas. |
| ID | EnviarYConsultar |
| Descripción | Recogerá cuando un alumno pregunte dudas o preguntas al profesor que sea dueño del calendario. |
| Actores | Alumno |
| Precondicones | Ser alumno. |
| Curso normal | 1.- Iniciar sesión.|
|              | 2.- Seleccionar "Enviar dudas o preguntas".| 
|              | 3.- Se abre una nueva ventana con un apartado para escribir la duda y un botón para enviarla. |
|              | 4.- Enviar duda o pregunta.
| Postcondicionales | La duda le llega al profesor correspondiente. |
| Alternativas/Exepciones | Si se envía una duda en blanco, saltará una excepcion en el paso número 4 que dice que no se puede enviar una duda en blanco. |
 
![Separador](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Separador.png)

| Datos | Descripción. |
| -- | -- |
| Nombre | Consultar y responder dudas. |
| ID |ConsultarResponder |
| Descripción | Visualizar las preguntas recibidas por los alumnos y poder responderlas. |
| Actores | Profesor |
| Precondicones | Ser profesor. |
| Curso normal | 1.- Iniciar sesión.|
|              | 2.- Seleccionar "Enviar dudas y consultar".|
|              | 3.- Seleccionar una y responder. |
| Postcondicionales | La respuesta del profesor le llegará al alumno. |
| Alternativas/Exepciones | Si se envía la respuesta en blanco, saltará una excepción en el paso número 3 que dice que no se puede enviar ésta en blanco. |

![Separador](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Separador.png)

| Datos | Descripción. |
| -- | -- |
| Nombre | Ver tareas más próximas. |
| ID | TareasProximas |
| Descripción | Muestra en una lista las tareas próximas en un margen de 7 días. |
| Actores | Alumno. |
| Precondicones | El profesor tiene que haber propuesto tareas. |
| Curso normal | 1.- Iniciar sesión.|
|              | 2.- Visualizar el apartado con las tareas de los próximos 7 días (título de la tarea, asignatura correspondiente y fecha, con su correspondiente descripción). |
| Postcondicionales | El alumno y el profesor quedan informados de las tareas a realizar. |
| Alternativas/Exepciones | A la hora de visualizarlas en el paso número 2, si no hay ninguna, saldrá un mensaje mostrando: '¡Estás libre! Por ahora…' |

![Separador](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Separador.png)

| Datos | Descripción. |
| -- | -- |
| Nombre | Iniciar sesión. |
| ID | IniciarSesion |
| Descripción | Introduces el usuario y contraseña para acceder a los calendarios. |
| Actores | Alumno y profesor. |
| Precondicones | Tener una cuenta creada. |
| Curso normal | 1.- Saber cuál es el nombre de usuario y contraseña, ya que éstos se encuentran en una base de datos. Éstos se darán a través del tutor. |
|              | 2. Introducir el nombre de usuario y contraseña
|              | 3.- La base de datos comprobará que los datos introducidos son correctos. |
|              | 4. El usuario accederá a la aplicacón.
| Postcondicionales | El usuario o profesor entran en la aplicación. |
| Alternativas/Exepciones | Si la cuenta introducida no existe en la base de datos o el usuario se ha equivocado con sus datos en el paso número 2, sale un mensaje diciendo "Nombre y/o contraseña erróneos". |

![Separador](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Separador.png)

| Datos | Descripción. |
| -- | -- |
| Nombre | Leer calendario. |
| ID | LeerCalendar |
| Descripción | Te muestra en pantalla el calendario completo con todas la informacion necesaria que necesita saber el alumno o el profesor.(ej: exámenes, proyectos etc.). |
| Actores | Alumno y profesor. |
| Precondicones | Que el profesor haya creado el calendario. |
| Curso normal | 1.- Iniciar sesión.|
|              | 2.- Acceder a los calendarios disponibles y escoger uno. |
|              | 3.- Mostrar el calendario seleccionado y se visualizarán el título de las tareas que haya en éste con sus respecivas fechas. |
| Postcondicionales | El alumno y profesor quedan informados. |
| Alternativas/Exepciones | Si en el paso 2 se comprueba que no hay ningún calendario saldrá un mensaje diciendo que no hay un calendario creado y si quieres crear uno (si eres profesor); si eres alumno, saldrá un mensaje diciendo que deberás esperar. |

![Separador](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Separador.png)

| Datos | Descripción. |
| -- | -- |
| Nombre | Modificar calendario. |
| ID | CambiarCalendar |
| Descripción | Nos permite agregar o quitar información a un calendario ya creado. |
| Actores | Profesor. |
| Precondicones | Iniciar sesión como profesor y tener mínimo un calendario creado. |
| Curso normal | 1.- Iniciar sesión. |
|              | 2.- Acceder al calendario que ha creado. |
|              | 3.- Seleccionar "Añadir", "Modificar" o "Eliminar". |
|              | 3.1.- Si pulsa "Añadir", creará una nueva tarea en la que tendrá que elegir su fecha y dentro de ésta, su nombre y su descripción. |
|              | 3.2.- Si pulsa "Modificar", se consultarán en la base de datos las tareas ya existentes y se modificará una de ellas, ya sea su fecha, nombre o descripción. |
|              | 3.3.- Si pulsa "Eliminar", se consultarán en la base de datos las tareas ya existentes y podrá eliminar la/s que desee. |
| Postcondicionales | El calendario se actualiza dependiendo de la acción realizada. |
| Alternativas/Exepciones | Si no hay un calendario creado, como se ha indicado en el paso 2, no podrá ni modificar ni eliminar; tendrá que crear el calendario previamente. |

![Separador](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Separador.png)

| Datos | Descripción. |
| -- | -- |
| Nombre | Crear calendario. |
| ID | CrearCalendar |
| Descripción | Poder crear más de un calendario, dependiendo de las materias impartidas. |
| Actores | Profesor. |
| Precondicones | Iniciar sesión como profesor. |
| Curso normal | 1.- Iniciar sesión. |
|              | 2.- Seleccionar "Crear nuevo calendario". |
|              | 3. Crear un nuevo calendario en el base de datos con los alumnos ya existentes y añadirlos, comprobando a su vez que existen previamente. |
| Postcondicionales | El calendario se ha creado. |
| Alternativas/Exepciones | 1.- Si en el paso 3 se intenta crear un calendario sin título, saldrá una excepción diciendo que no puede estar en blanco.|
|              | 2.- Si en el paso 3 se intenta crear un calendario sin alumnos, se crea un calendario sin alumnos, saldrá una excepción diciendo que el calendario necesita al menos un alumno. |
|              |3.- Si en el paso 3 se intenta crear un calendario con un nombre ya existente, saldrá una excepción diciendo que ya existe. |

<a name="3"></a>
# Modelo de objetos del negocio

<a name="3.1"></a>
## Diagrama de clases 

![Diagrama de clases](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Diagrama%20de%20clases%20modificado%202.png)

<a name="3.2"></a>
## Modelo entidad-relación

![Modelo entidad-relación](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/Modelo%20entidad-relaci%C3%B3n-modificado.png)

<a name="4"></a>
# Interfaz gráfica

## Iniciar sesión en uCalendar

![Iniciar sesión](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/InicioCalendario.PNG)

## Vista del profesor

![Vista del profesor](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/InterfazProfesor.PNG)

## Crear calendario

![Crear calendario](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/CrearCalendario.PNG)

## Vista del alumno

![Vista del alumno](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/VistaAlumno.PNG)

## Vista de calendario

![Vista calendario](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/VistaCalendario.PNG)

## Vista de envío de dudas

![Vista de dudas](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/VistaDudas2.PNG)

## Consultar dudas

![Consulta de dudas](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/VistaConsultaDudas.PNG)

<a name="5"></a>
# Diagramas de Secuencia

## Enviar duda

![DS - Enviar duda](https://github.com/Ctrusan/proyectopsp-grupo4/blob/documentacion/Im%C3%A1genes/DS%20-%20Enviar%20Dudas.png)
