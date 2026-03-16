<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / **VISTAS** / COLABORACIÓN / POO</sup><br>
<sub>[Clases y objetos](clasesObjetos.md) / **Vistas** / [Vista pública de clases](vistaPublicaClases.md) / [Vista pública de objetos](vistaPublicaObjetos.md) / [Vista privada de clases](vistaPrivadaClases.md) / [Vista privada de objetos](vistaPrivadaObjetos.md)</sub>

</div>

# Vistas

Determinan el ámbito donde se puede referenciar la declaración de un miembro de la clase: atributo o método.

- **Pública**: conocido en cualquier punto de la aplicación (antes de la declaración, después y en cualquier otro fichero)
- **Privada**: conocido en cualquier punto de la clase (antes y después de la declaración pero en la implementación de la clase)

<div align=center>

||Clases|Objetos|
|-|-|-|
||<sub>Descripción de los datos y de las operaciones que describen el comportamiento de un cierto conjunto de elementos homogéneos.</sub>|<sub>Ejemplar concreto (instancia) de una clase, que responde al comportamiento definido por las operaciones de la clase a la que pertenece, adecuándose al estado de sus datos particulares.</sub>
|||
Vista pública|***[INTERFAZ](vistaPublicaClases.md)***:<br>Nombre de la Clase<br>Cabecera de los Métodos|Creación de Objetos<br>Paso de Mensajes<br>Destrucción de Objetos
Vista privada|***IMPLEMENTACIÓN***:<br>Definición de Atributos<br>Desencadenamiento de Objetos|Definición de Métodos<br>Desencadenamiento de Mensajes

</div>

## Dependencias

- Al crear objetos y lanzarles mensajes, se debe respetar la interfaz de sus clases =>

  - 1º **[Vista pública de las Clases](vistaPublicaClases.md)**

  - 2º **[Vista pública de los Objetos](vistaPublicaObjetos.md)**

- Al definir atributos de una clase (generalmente, objetos de otras clases) y definir sus métodos (generalmente, lanzando mensajes a los objetos atributos), se debe respetar, transitivamente, la interfaz de otras clases =>

  - 3º **[Vista privada de las Clases](vistaPrivadaClases.md)**

- Al crear un objeto se produce un desencadenamiento de instanciaciones y al lanzar un mensaje se produce un desencadenamiento de mensajes, acorde a la definición de atributos y de métodos de la clase del objeto =>

  - 4º **[Vista privada de Objetos](vistaPrivadaObjetos.md)**
