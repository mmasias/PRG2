<div align=right>

<sub>[Introducción](introduccion.md) / [Bases de la programación](basesProgramacion.md) / [Evolución](evolucion.md) / [POO](poo.md)</sub>

</div>

# Evolución de los lenguajes de programación

La historia de los lenguajes de programación es, en esencia, la historia de cómo los programadores han luchado contra la complejidad del software. A medida que los programas crecían en tamaño y ambición, las herramientas disponibles resultaban insuficientes, lo que impulsó la búsqueda de nuevos paradigmas.

Esta evolución puede analizarse a través de cuatro conceptos fundamentales: la abstracción, que permite operar con ideas en lugar de detalles; la encapsulación, que protege la información ocultando su representación interna; la modularización, que divide el sistema en unidades manejables e independientes; y la jerarquización, que organiza esas unidades en estructuras que reflejan relaciones de dependencia o clasificación.

Cada paradigma ha supuesto un avance en uno o varios de estos pilares, hasta culminar en la Programación Orientada a Objetos, que los integra de forma coherente bajo el concepto de clase.

## Código máquina

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|{0,1}|
|**ENCAPSULACIÓN**|Nula|
|**MODULARIZACIÓN**|Nula|
|**JERARQUIZACIÓN**|Nula|

</div>

El programador trabaja directamente sobre la arquitectura física. No existe ninguna herramienta conceptual que medie entre la idea y la máquina.

## Ensamblador

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Identificadores|
|**ENCAPSULACIÓN**|Nula|
|**MODULARIZACIÓN**|Macros|
|**JERARQUIZACIÓN**|Nula|

</div>

Los identificadores dan nombre a las instrucciones y las macros permiten reutilizar secuencias, pero el código sigue siendo un reflejo directo del hardware.

## Programación de alto nivel

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Subprogramas|
|**ENCAPSULACIÓN**|Reglas de Ámbito|
|**MODULARIZACIÓN**|Subprogramas|
|**JERARQUIZACIÓN**|Expresiones, Registros y Subprogramas|

</div>

Los subprogramas son el primer gran salto: permiten abstraer operaciones y reutilizarlas. Las reglas de ámbito introducen por primera vez una noción de visibilidad de la información.

## Programación estructurada

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Estructuras de control del flujo|
|**ENCAPSULACIÓN**|Control del flujo de ejecución|
|**MODULARIZACIÓN**|Control del flujo de ejecución|
|**JERARQUIZACIÓN**||

</div>

El foco se desplaza al control del flujo de ejecución, ganando legibilidad y predictibilidad. Sin embargo, la gestión de los datos sigue siendo primitiva.

## Programación modular

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Espacios de nombre|
|**ENCAPSULACIÓN**|Privacidad en módulos|
|**MODULARIZACIÓN**|Módulos|
|**JERARQUIZACIÓN**|Jerarquías de dependencia entre módulos|

</div>

El módulo es la primera unidad que agrupa datos y operaciones con visibilidad controlada. Emergen las primeras jerarquías explícitas de dependencia entre componentes.

## TAD: tipo abstracto de datos

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Vista pública|
|**ENCAPSULACIÓN**|Vista privada|
|**MODULARIZACIÓN**|TAD's|
|**JERARQUIZACIÓN**|Jerarquías de composición y dependencia|

</div>

La separación formal entre interfaz pública y representación privada es el salto conceptual más profundo de esta evolución. Un TAD es un contrato, no una implementación.

## Programación orientada a objetos

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Herencia y Polimorfismo|
|**ENCAPSULACIÓN**|Vista pública / Vista privada|
|**MODULARIZACIÓN**|Clases|
|**JERARQUIZACIÓN**|Jerarquías de clasificación|

</div>

**OO = TAD + Herencia & Polimorfismo**

> [POO](poo.md)
