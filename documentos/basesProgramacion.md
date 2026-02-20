<div align=right>

<sub>[Introducción](introduccion.md) / [Bases de la programación](basesProgramacion.md) / [Evolución](evolucion.md) / [POO](poo.md)</sub>

</div>

# Bases de la programación

En la introducción se identificaron cuatro características inherentes a los sistemas complejos —patrones comunes, separación de asuntos, elementos primitivos relativos y estructura jerárquica— y se mapearon a cuatro conceptos de la ingeniería del software que permiten gestionarlas.

A continuación se desarrollan cada uno de estos conceptos en profundidad.

## Abstracción

La abstracción es el proceso mental de extracción de las características esenciales de algo, ignorando los detalles superfluos — Booch

La abstracción surge de un reconocimiento de similitudes entre ciertos objetos, situaciones o procesos en el mundo real, y la decisión de concentrarse en estas similitudes e ignorar por el momento, las diferencias — Dahl, Dijkstra y Hoare

La abstracción es una descripción simplificada o especificación de un sistema que hace hincapié en algunos de los detalles o propiedades mientras que suprime otros del sistema. Una buena abstracción es la que hace hincapié en los detalles que son importantes para el lector o usuario y suprime detalles que son, al menos por ahora, de distracción — Shaw

|||||
|-|-|-|-|
Una abstracción denota las **características esenciales** de un objeto que lo distinguen de todos los otros tipos de objetos y por lo tanto proporciona límites conceptuales nítidamente definidos, en relación con la perspectiva del espectador.|Una abstracción se centra en la **visión exterior de un objeto** y sirve para separar el comportamiento esencial de un objeto de su implantación|La abstracción es **eminentemente subjetiva**, dependiendo del interés del observador|Nos esforzamos para construir abstracciones de las entidades porque son **directamente paralelos al vocabulario del dominio de un determinado problema**.

## Encapsulación

La encapsulación es proceso por el que se ocultan los detalles del soporte de las características esenciales de una abstracción — Booch

Principio de Ocultación de la información: todo aquello que no sea necesario dar a conocer, no se debe dar a conocer

No se trata de ocultar la información en sí misma sino de ocultar los detalles del soporte de dicha información.

||||
|-|-|-|
La encapsulación se logra con mayor frecuencia a través de ocultación de información, que es el proceso de **ocultar todos los secretos de un objeto que no contribuyen a sus características esenciales**|La encapsulación proporciona barreras explícitas entre las diferentes abstracciones y por lo tanto conduce a una clara **separación de asuntos**.|El beneficio inmediato será la posibilidad de **cambiar los soportes de las características de una abstracción sin afectar a todos los elementos que dependan de esas características** porque ni los conocen, ni los mencionan

### Implicaciones

Una vez realizada cierta abstracción hay que “trasladarlas” al lenguaje de programación.

- Esto conlleva decidir entre diversas estructuras de datos (estáticas o dinámicas, en memoria principal o secundaria, etc.) y/o diversos algoritmos (¿con variables auxiliares o no? ¿recursivo o iterativo?, etc.), siendo diversas las alternativas que recogen dichas características esenciales.
- Una vez que se selecciona una implantación, debe ser tratado como un secreto de la abstracción y oculta a la mayoría de los clientes. 

En la práctica, esto significa que cada clase debe tener dos partes:

|La interfaz|La implementación|
|-|-|
Capta sólo su vista exterior, que abarca nuestra abstracción del comportamiento común a todas las instancias de la clase.|La implementación de una clase comprende la representación de la abstracción, así como los mecanismos para conseguir el comportamiento deseado.
Es el único lugar donde establecemos todas los suposiciones que un cliente puede hacer sobre cualquier instancia de la clase|La implementación encapsula detalles sobre los qué ningún cliente puede hacer suposiciones.

- La abstracción de un objeto debe preceder a las decisiones acerca de su implantación.
- Ninguna parte de un sistema complejo debe depender de los detalles internos de cualquier otra parte.

Mientras que la abstracción ayuda a las personas a pensar en lo que están haciendo, la encapsulación permite hacer cambios fiables en el programa con un esfuerzo limitado.

## Modularización

***La modularidad es el proceso de descomposición de un sistema en un conjunto de piezas poco acoplados y cohesivos*** — Booch 96

|Acoplamiento|Cohesión|
|-|-|
El acoplamiento “[…​] es la medida de fuerza de la asociación establecida por una conexión ente un módulo -elemento- y otro. El acoplamiento fuerte complica un sistema porque los módulos son más difíciles de comprender, cambiar o corregir por sí mismos si están muy interrelacionados con otros módulos|La cohesión mide el grado de conectividad entre los elementos de un solo módulo

Al diseñar un sistema de software complejo, ***es esencial descomponerlo en partes más pequeñas y más pequeñas***, cada una de las cuales podemos entonces refinar independientemente. De esta manera, satisfacemos la restricción muy real que existe sobre la capacidad del canal de la cognición humana: para entender cualquier nivel dado de un sistema, sólo necesitamos comprender algunas partes (en lugar de todas las partes) a la vez.

||||
|-|-|-|
Para modularizar hay que minimizar las dependencias entre módulos (acoplamiento) que deben tener significado propio por sí mismo agrupando abstracciones lógicamente relacionadas (cohesión).|El bajo acoplamiento de un modulo se basa en la abstracción que limita su interfaz a lo esencial y en la encapsulación que oculta todos los detalles necesarios para su implantación pero innecesarios para otros módulos que se relacionen con éste.|Dividir un programa en una serie de límites documentados bien definidos dentro del programa es de gran valor en la comprensión del programa

## Jerarquización

Jerarquía es una clasificación u ordenamiento de las abstracciones — Booch

La jerarquización es el proceso de estructuración por el que se produce una organización de un conjunto de elementos en grados o niveles de responsabilidad, de clasificación o de composición, …​ entre otros

||||
|-|-|-|
**La abstracción** es una buena cosa pero en todos los casos, excepto las aplicaciones más triviales, podemos encontrar muchas más abstracciones diferentes de lo que podemos comprender a la vez.|**La encapsulación** ayuda a gestionar esta complejidad al ocultar el interior de la vista de nuestras abstracciones.|**La modularidad** ayuda también, por que nos da una manera de agrupar abstracciones relacionados lógicamente.

Aún así, esto no es suficiente. Un conjunto de abstracciones a menudo forma una jerarquía, y mediante la identificación de estas jerarquías en nuestro diseño se simplifica enormemente nuestra comprensión del problema.

|||
|-|-|
La identificación de las jerarquías dentro de un sistema de software complejo a menudo no es fácil.|Si no revelamos la estructura de clases de un sistema, tendríamos que multiplicar nuestro conocimiento sobre las propiedades de cada parte individual.
Una vez que se exponen esas jerarquías, la estructura de un sistema complejo se vuelve muy simple y obtenemos la comprensión de la misma.|Con la inclusión de la estructura de clases, captamos estas propiedades comunes en un solo lugar.

> [Evolución](evolucion.md)

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>