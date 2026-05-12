<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / [Herencia por extensión](porExtension.md) / [Clases abstractas](clasesAbstractas.md) / **Herencia por implementación** / [Consideraciones adicionales](consideracionesAdicionales.md) / [Polimorfismo](polimorfismo.md) / [Conversión de tipos](conversionDeTipos.md) / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Herencia por implementación: interfaces

Las interfaces son **clases abstractas puras**: no contienen atributos de instancia ni implementaciones de métodos, únicamente declaraciones de métodos.

Mediante la palabra reservada `implements`.

## Sintaxis

```java
interface <InterfazBase> {
  <tipoRetorno> <método>( <parámetros> );
  ...
}

class <Clase> implements <InterfazBase> {
  // debe implementar todos los métodos declarados en la interfaz
}

class <Clase> extends <ClaseBase> implements <Interfaz1>, <Interfaz2> {
  // extensión y implementación se pueden combinar
}

interface <InterfazDerivada> extends <InterfazBase> {
  // una interfaz puede extender otra interfaz
}

interface <InterfazDerivada> extends <Interfaz1>, <Interfaz2> {
  // una interfaz puede extender varias interfaces (herencia múltiple)
}
```

Todos los métodos declarados en una interfaz son implícitamente `public` y `abstract`. Los atributos son implícitamente `public static final` (constantes).

## Relación entre interfaces y clases

<div align=center>

|Una interfaz|Una clase|Herencia múltiple|
|-|-|-|
|NO puede heredar de una clase de ninguna manera|SÍ puede heredar de una clase por extensión|La herencia por extensión NO la permite|
|SÍ puede extender otra interfaz|SÍ puede implementar varios interfaces|La herencia por implementación SÍ la permite|

</div>

## Diferencias con las clases abstractas

<div align=center>

|Clases abstractas|Interfaces|
|-|-|
|Pueden tener atributos de instancia|Solo constantes (`public static final`)|
|Pueden tener métodos implementados|Solo cabeceras|
|Una clase solo puede extender una clase abstracta|Una clase puede implementar múltiples interfaces|
|Adecuadas cuando las clases hijas comparten estado y comportamiento|Adecuadas para garantizar un contrato común entre clases no relacionadas|

</div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
