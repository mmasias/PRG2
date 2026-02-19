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

### Elementos de la programación orientada a objetos

***Clase:*** descripción de los datos y de las operaciones que describen el comportamiento de un cierto conjunto de elementos homogéneos.

Ej. Clase Intervalo

- datos: extremos inferior y superior;
- operaciones: intersección, longitud, desplazar, …

***Objeto:*** ejemplar concreto (instancia) de una clase, que responde al comportamiento definido por las operaciones de la clase a la que pertenece, adecuándose al estado de sus datos particulares.

Ej. Objetos de la clase Intervalo :

- constantes: (8,10), (-100,100),…
- variables: misHorasDeTrabajo, miPresiónArterial, …

***Mensaje:*** invocación de una operación sobre un objeto. Un objeto es el agente activo que lanza el mensaje y otro objeto es el agente pasivo que recibe el mensaje. El objeto receptor del mensaje debe contemplar dicha operación entre las definidas en su clase.

Ej. Mensajes a objetos de la Clase Intervalo

- (8,10).longitud = 2; (-100,100).desplazar(3) => (-97,103),…
- misHorasDeTrabajo.interseccion(tusHorasDeTrabajo), …

***Método:*** definición de una operación de una clase.

Ej. Métodos de la Clase Intervalo

- longitud: extremo superior menos extremo inferior;
- desplazar: acumular cantidad a ambos extremos;

***Atributo:*** cada uno de los datos de una clase, y por tanto, presente en todos los objetos de esa clase.

Ej. Atributos de la clase Intervalo

- extremos inferior y superior

***Estado:*** conjunto de los valores de los atributos que tiene un objeto, por pertenecer a una clase, en un instante dado.

Ej. Estados de objetos de la clase Intervalo

- 8 en el extremo inferior y 14 en el extremo superior de presiónArterial;
- 9 en el extremo inferior y 18 en el extremo superior de misHorasDeTrabajo;

### Relación entre los elementos de la POO

Las ***clases*** asumen el principio de ***encapsulación***: cuando se describe una clase, se debe describir tanto su vista pública o interfaz como su vista privada o implantación.

La ***vista pública*** o ***interfaz*** describe qué operaciones responden los objetos de esta clase, o sea, su comportamiento.

La ***vista privada*** o ***implantación*** describe las estructuras de datos de la clase y cómo manipulan las operaciones los datos. De esta forma, se conjugan la abstracción inherente en la clase con la encapsulación de sus datos y de su forma de operar

Las clases que conjugan de forma equilibrada atributos (datos) y métodos (operaciones) son el único bloque de construcción de programas: ***módulos***.

Esta modularidad exige que:

- Los datos y operaciones de una clase sean elementos estrechamente relacionados favoreciendo que “una clase se entiende por sí misma” –***cohesión***-.
- Las clases se relacionen -***acoplamiento***- al colaborar en jerarquías de composición, clasificación, … para constituir los programas

***Herencia***: transmisión de atributos y métodos de una clase a otra clase.

Ej. A partir de la Clase Intervalo

- IntervaloCerradoCerrado [x,x], IntervaloAbiertoCerrado (x,x],…

***Polimorfismo***: enlace dinámico de expresiones a clases y/o de mensajes a métodos.

Ej. Objetos intercambiables de las clases Intervalo, IntervaloCerradoCerrado, …

La clase hija hereda los atributos y métodos de la clase padre y se especializa añadiendo y/o redefiniendo atributos y métodos.

En el polimorfismo, el objeto activo sólo necesita conocer qué mensajes puede aceptar el objeto pasivo, no qué clase de objeto cree que es y, por tanto, qué método ejecuta en cada instante.
