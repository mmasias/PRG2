<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / [Por extensión](porExtension.md) / [Clases abstractas](clasesAbstractas.md) / [Por implementación](porImplementación.md) / [Consideraciones adicionales](consideracionesAdicionales.md) / **Polimorfismo** / [Conversión de tipos](conversionDeTipos.md) / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Polimorfismo

Término de origen griego: "muchas formas".

<div align=center>

|Ejemplos|Aclaración|
|-|-|
|Una persona puede pagar con tarjeta o con efectivo.|No se contempla que algo **cambie de forma** o sea **de dos clases a la vez**.|
|Una empresa de transporte vende billetes por ventanilla o a través de una máquina.|Una persona en ventanilla NO se convierte en máquina expendedora.|
|Un sistema operativo imprime a través de drivers para cada modelo de impresora.|Una persona NO es a la vez una máquina expendedora.|
|Un navegador muestra textos, imágenes, vídeos y formatos muy diversos.|Simplemente, un billete lo puede vender una persona o una máquina en cada momento.|

</div>

## Definición

El polimorfismo es una **relajación del sistema de tipos**, de tal manera que una **referencia declarada de una clase** (atributo, parámetro, declaración local o elemento de un vector) **acepta la asignación de la dirección de un objeto de dicha clase o de alguna de sus clases derivadas**.

```java
Person person;
// person = new Person();  ERROR: clase abstracta
person = new Woman();
person = new Man();

Woman woman;
woman = new Woman();
// woman = new Man();       ERROR: Man no deriva de Woman
```

Por tanto:
- **Exige** la existencia de una jerarquía de clasificación mediante relaciones de herencia.
- Pero las **jerarquías de clasificación NO exigen tratamientos polimórficos**.

## Comportamiento y limitación

<div align=center>

|Comportamiento|Limitación|
|-|-|
|Cuando se lanza un mensaje a un objeto a través de una referencia polimórfica, **se ejecuta el método definido en la clase del objeto**, independientemente de la clase declarada de la referencia.|El mensaje lanzado **debe estar en la interfaz de la clase declarada** de la referencia, sin contemplar métodos añadidos en la clase concreta del objeto.|

</div>

```java
List list;
list = new List();
list.insertFirst(5);   // con repetición
list = new Set();
list.insertFirst(5);   // sin repetición: mismo mensaje, distinto comportamiento

List list1 = new Set();
List list2 = new Set();
// list1.intersection(list2);  ERROR: intersection no está en List
```

## Formalización

Un **enlace** es la asociación entre un elemento del lenguaje y una de sus características.

<div align=center>

|Enlace estático|Enlace dinámico|
|-|-|
|Se resuelve analizando el código, en tiempo de compilación.|No se puede resolver en tiempo de compilación; se resuelve en tiempo de ejecución.|
|Variable y su tipo; expresión y su número de operadores.|Variable y su valor en un instante dado; expresión y su valor evaluado.|

</div>

El **polimorfismo** es un enlace dinámico entre una referencia y la clase del objeto al que apunta en cada instante.

## Polimorfismo vs sobrecarga

La **sobrecarga** es un enlace *estático* entre un mensaje y el método que se ejecuta: se resuelve en compilación según el tipo y número de parámetros.

El **polimorfismo** es un enlace *dinámico*: se resuelve en ejecución según la clase del objeto receptor.

## Beneficios

<div align=center>

|Abstracción|Extensibilidad|
|-|-|
|*"Entonces es el receptor del mensaje el que determina cómo se interpretará el mensaje y no lo hará el emisor. El emisor sólo necesita conocer qué comportamiento puede desarrollar el otro objeto, no qué clase de objeto cree que es [...] sólo tenemos especificado qué ocurre pero no cómo ocurrirá."* — Jacobson, 1992|*"Emplear las consultas de tipo durante la ejecución para implantar un enunciado de conmutación [...] destruye toda la modularidad de un programa y anula los objetivos de la programación orientada a objetos. También es propensa a errores [...] los programadores que se formaron con lenguajes como Pascal o C encuentran esta trampa muy difícil de resistir."* — Stroustrup, 1993|

</div>

> No se puede preguntar por la clase de un objeto polimórfico.

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
