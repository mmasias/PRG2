# Una aproximación intuitiva a la colaboración entre objetos

## ¿Por qué?

El estudiante que llega de programación estructurada ya sabe descomponer en métodos. Sin embargo, esos métodos son estáticos y los datos viajan como parámetros o viven en variables externas: cualquier método puede tocar cualquier dato, y nadie es responsable de nada.

La transición a OO exige un cambio de modelo mental: dejar de pensar en *operaciones sobre datos* y empezar a pensar en *objetos que saben cosas y saben hacer cosas*.

## ¿Qué?

"Flipping on the Beach" es una metodología de diseño que adapta los principios del Diseño Orientado a Objetos Jerárquico (HOOD) de manera simplificada e intuitiva.

Propone diseñar el sistema de manera descendente (top-down), comenzando por la visión global y refinando progresivamente cada componente. "Flipping" hace referencia al acto de imaginar colaboradores y sus responsabilidades; "on the beach", a hacerlo sin presión de formalismo, con libertad creativa.

Como señala L. Fernández: "*En programación tradicional, se definirían todas las estructuras de datos necesarias para que las manipulen todos los subprogramas. En programación orientada a objetos, se recurre a atributos que son objetos de otras clases responsables de los detalles del soporte y manipulación de esos datos*".

## ¿Para qué?

- **Main limpio**: el código principal expresa QUÉ hace el sistema,   sin mezclar el CÓMO.
- **Responsabilidades distribuidas**: cada clase encapsula sus datos y   comportamientos; nadie toca lo que no le corresponde.
- **Modelo mental transferible**: los objetos colaboran como entidades   del mundo real, lo que hace el diseño más intuitivo y comunicable.
- **Base para escalar**: añadir funcionalidad nueva no obliga a   reescribir lo existente.

Como señala Booch: "*Un objeto en sí mismo no es interesante. Los objetos contribuyen al comportamiento de un sistema colaborando con otros objetos*".

## ¿Cómo?

|||
|-|-|
|**Tomar una clase**|Al inicio, la clase que engloba todo el sistema. Posteriormente, las clases que se vayan identificando durante el desarrollo.|
|**Definir el comportamiento**|Las cabeceras de los métodos públicos, especialmente el método principal que dispara toda la funcionalidad (`jugar()`, `ejecutar()`, etc.)|
|**Definir los atributos**|Los datos necesarios para que la clase cumpla sus responsabilidades, generalmente objetos de otras clases colaboradoras.|
|**Codificar los métodos**|La lógica delegando tareas a los colaboradores. No debe ser impedimento invocar métodos que aún no existen.|
|**Recapitular**|Las nuevas clases que han surgido y los mensajes enviados a objetos de estas clases.|