<div align=right>

<sup>**Introducción** / [Vistas](/documentos/02-vistas/clasesObjetos.md) / Colaboración / POO</sup><br>
<sub>[Introducción](README.md) / [Bases de la programación](basesProgramacion.md) / [Evolución](evolucion.md) / **POO**</sub>

</div>

# La programación orientada a objetos

## ¿Por qué?

Según va pasando la historia se cumplen dos leyes:

|Primera ley de Lehman|Ley de la complejidad creciente|
|-|-|
Un sistema de software, o cualquier sistema en un entorno real, debe adaptarse continuamente para seguir siendo útil y satisfactorio; de lo contrario, se vuelve progresivamente menos eficaz y obsoleto.|A medida que un programa en evolución cambia, su estructura tiende a ser cada vez más compleja. Se deben dedicar recursos extras para preservar y simplificar su estructura

La OO nació para dar respuesta a esta realidad.

## ¿Qué?

La programación orientada a objetos es un paradigma que modela el software como un conjunto de **objetos** que interactúan enviándose **mensajes**.

Cada objeto es una entidad activa que encapsula **estado** (datos) y **comportamiento** (operaciones), respondiendo a los mensajes según las reglas de su **clase**. Este **enfoque antropomórfico** —tratar las piezas del software como agentes con responsabilidades propias— es el rasgo distintivo de la OO frente a paradigmas anteriores.

Formalmente: **OO = TAD + Herencia + Polimorfismo**

La clase generaliza el TAD añadiendo herencia —para clasificar y reutilizar abstracciones— y polimorfismo —para que el emisor de un mensaje no necesite saber qué objeto concreto lo recibe.

## ¿Para qué?

- El incremento de la abstracción, encapsulación, modularización y jerarquización aumentan la comprensión, escalabilidad y flexibilidad del software.
- El incremento de la comprensión, escalabilidad y flexibilidad del software reduce los costes de mantenimiento del software: mantenimiento correctivo, perfectivo y adaptativo.
- La reducción de costes de mantenimiento reduce drásticamente los costes de desarrollo del software.

## ¿Cómo?

La POO se basa en algunos conceptos fundamentales que desarrollaremos en profundidad en los próximos documentos:

- **Clases y objetos:** Las unidades básicas de construcción del software
- **Mensajes y métodos:** Cómo interactúan los objetos entre sí
- **Encapsulación:** La separación entre interfaz pública e implementación privada
- **Herencia y polimorfismo:** Mecanismos para reutilizar y especializar código

Estos conceptos forman la base de lo que llamaremos **programación basada en objetos**. Más adelante, cuando incorporemos herencia y polimorfismo, entraremos plenamente en la **programación orientada a objetos**.

> **Continúa en:** [Clases y objetos](../02-vistas/clasesObjetos.md)