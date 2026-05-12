<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / [Herencia por extensión](porExtension.md) / **Clases abstractas** / [Por implementación](porImplementación.md) / [Consideraciones adicionales](consideracionesAdicionales.md) / [Polimorfismo](polimorfismo.md) / [Conversión de tipos](conversionDeTipos.md) / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Clases abstractas

<div align=center>

|Clases concretas|Clases abstractas|
|-|-|
|Surgen de la descripción de los atributos y métodos que definen el comportamiento de un cierto conjunto de objetos homogéneos.|Son clases **no instanciables** que surgen del factor común del código de otras clases: atributos comunes, métodos comunes y/o cabeceras de métodos comunes sin definición.|

</div>

## Sintaxis

```java
abstract class <ClaseAbstracta> {
  ...
  public abstract void <métodoAbstracto>( <parámetros> );
  protected abstract void <métodoAbstracto>( <parámetros> );
  // private abstract void <métodoAbstracto>( ... ); ERROR
  ...
}
```

Los métodos abstractos declaran solo la cabecera, sin cuerpo. La clase concreta que herede deberá proporcionar la implementación.

## Reglas

<div align=center>

|¿Puede...?|Clase abstracta|Clase concreta|
|-|-|-|
|Ser instanciada directamente|No|Sí|
|Tener métodos no abstractos|Sí|Sí|
|Tener métodos abstractos|Sí|No|
|Tener atributos|Sí|Sí|
|Heredar de una clase abstracta sin redefinir todos sus abstractos|Sí|No|
|Heredar de una clase concreta añadiendo métodos abstractos|Sí|No|

</div>

## Entonces

- Una clase abstracta puede ser hija de otra clase abstracta: se especializa añadiendo atributos y/o métodos y/o redefiniendo métodos, pero NO redefine todos los métodos abstractos transmitidos y/o añade algún método abstracto nuevo.
- Una clase abstracta puede ser hija de una clase concreta si en su especialización añade algún método abstracto.
- Un método no abstracto de una clase abstracta puede apoyarse en métodos abstractos de la misma clase: ese código se transmite hasta las clases concretas, que son las que proporcionan la implementación.

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
