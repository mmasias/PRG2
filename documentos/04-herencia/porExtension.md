<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / **Herencia por extensión** / [Clases abstractas](clasesAbstractas.md) / [Por implementación](porImplementación.md) / [Consideraciones adicionales](consideracionesAdicionales.md) / [Polimorfismo](polimorfismo.md) / [Conversión de tipos](conversionDeTipos.md) / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Herencia por extensión

Mediante la palabra reservada `extends`

```java

class <claseDerivada> extends <claseBase> {
   ...
}

class Abuela {
  ...
}
class Padre extends Abuela {
  ...
}
class Hija extends Padre {
  ...
}

```

## Especialización por adición

|||
|-|-|
|**Atributos**|Los atributos añadidos en la clase hija tienen las mismas reglas sintácticas y semánticas que en una clase que no sea derivada
|**Métodos**|Los métodos añadidos en la clase hija tienen las mismas reglas sintácticas y semánticas que en una clase que no sea derivada
||Excepto que **no tienen acceso a los atributos y métodos privados transmitidos desde la clase padre**, si no es a través de los métodos públicos transmitidos desde la clase padre
||Esto permite la contención del mantenimiento, dado que, si se modifica la implantación de la clase padre, no repercute sobre la implantación de la clase hija y se obtiene un mínimo acoplamiento entre ambas clases.
|**Constructores**|Mediante **super**, donde debe ser la primera sentencia de los constructores de la clase derivada y sus argumentos deben coincidir en número y tipo con la lista de parámetros de algún constructor público o protegido de la clase padre
||Se puede omitir para el caso del constructor de la clase padre con una lista vacía de parámetros

### Implicaciones

|Los objetos de la clase padre|Los objetos de la clase hija|
|-|-|
|No sufren ninguna alteración por la presencia de clases derivadas.|Tienen todos los atributos transmitidos desde la clase padre junto con los atributos añadidos en la clase hija.
||Responden a mensajes que corresponden con los métodos públicos transmitidos desde la clase padre junto con los métodos públicos añadidos en la clase derivada.

## Miembros protegidos

Cuando la clase padre no transmite los métodos públicos necesarios para manipular los atributos privados transmitidos desde la clase padre en los métodos añadidos en la clase hija:

|||
|-|-|
|**¿Haciéndolos publicos?**|No es solución, puesto que rompe el principio de encapsulación ya que, para la implantación de una clase hija, los objetos de la clase padre dan a conocer más allá de lo que se les solicitaba previamente a la existencia de la clase derivada.
|**Haciéndolos protegidos**|Visibilidad protegida (protected), donde los miembros (atributos y/o métodos) son accesibles en la implantación de la clase y en cualquier clase derivada.
||**Atributos protegidos**: Dentro del cuerpo de los métodos de la clase derivada se tiene acceso a los atributos protegidos heredados, a los atributos añadidos, a los parámetros del método y a las declaraciones locales, ley flexible de Demeter.<br>***Pero***: desbordamiento del mantenimiento dado que si se modifica la implantación de la clase padre SI repercute sobre la implantación de la clase hija y se obtiene un máximo acoplamiento entre ambas clases
||**Métodos get/set protegidos** son métodos para obtener el valor y asignar un valor a los atributos privados transmitidos desde la clase padre, posibilitando cualquier manipulación por parte de la clase hija futura. <br> ***Implicación:*** contención del mantenimiento dado que si se modifica la implantación de la clase padre no repercute sobre la implantación de la clase hija y se obtiene un mínimo acoplamiento entre ambas clases

## Especialización por redefinición

Donde la cabecera del método es exactamente igual a la cabecera del método no privado de la clase padre, excepto su visibilidad, que puede ampliarse. En caso contrario, sería sobrecarga y no redefinición

Sus implicaciones son:

- Se anula la transmisión del método de la clase padre.
- Los objetos de la clase padre responden al mensaje con el comportamiento dado en la clase padre.
- Los objetos de la clase hija responden al mensaje con el comportamiento dado en la clase hija.

### super

|||
|-|-|
En la implantación de cualquier clase derivada, es una referencia constante que guarda la dirección del objeto que recibe el mensaje correspondiente al método que se está redefiniendo, pero con el comportamiento de la clase padre.|Su utilidad será para la reutilización del método de la clase padre, anulado en la transmición, desde la redefinición del método de la clase hija.

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
