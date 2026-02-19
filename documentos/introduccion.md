<div align=right>

<sub>[Introducción](introduccion.md) / [Bases de la programación](basesProgramacion.md) / [Evolución](evolucion.md) / [POO](poo.md)</sub>

</div>

# Introducción

## ¿Por qué?

La orientación a objetos ha sido tanto celebrada como malentendida:

|*X es bueno; Orientado a objetos es bueno; ergo X es Orientado a objetos*|*Mi conjetura es que la orientación a objetos será en los 80 lo que la programación estructurada en los 70. Todo el mundo estará a favor suyo. Cada productor prometerá que sus productos lo soportan. Cada director pagará con la boca pequeña el servirlo. Cada programador lo practicará. Y nadie sabrá exactamente lo que es*|
|-|-|
|Stoupstrup, 88|Rentsch, 82|

Más allá del debate, su aportación real puede resumirse en un equilibrio entre **procesos** y **datos** aplicando un **enfoque antropomórfico**.

Para entender qué aporta la Orientación a Objetos, hay que partir de una pregunta más fundamental: ¿qué es aquello que debemos modelar?

## ¿Qué?

### Sistema

Un sistema es un conjunto de componentes interactuando o interdependientes formando un todo integrado. Cada sistema está delimitado por sus límites espacio/temporales e influenciado por su entorno, descrito por su estructura y propósito y expresado en su funcionamiento

### Sistema complejo

Es aquel cuya complejidad excede la capacidad intelectual humana — [Grady Booch](https://es.wikipedia.org/wiki/Grady_Booch)

|Sistema|conjunto de componentes interactuando o interdependientes formando un todo integrado|delimitado por sus límites espacio / temporales|e influenciado por su entorno,|descrito por su estructura|y propósito|y expresado en su funcionamiento.
|-|-|-|-|-|-|-|
|Sistema respiratorio|Nariz, laringe, faringe, traquea, pulmones, alveolos, …​|fechas y lugares de la vida del ser vivo que contiene el sistema respiratorio|lo que respira: aire limpio vs contaminado, …​|la nariz se conecta con la laringe, la laringe con la traquea, …​|inyectar oxigeno al sistema circulatorio extrayendo monóxido de carbono, …​|inspiración y expiración|
|Película de amor|personajes|fechas y lugares de los personajes|la sociedad, las familias, una ex-pareja, …​|argumento que relaciona los personajes de la historia|transmitir emociones|reproducción de la película|
|Sistema de manufactura|Maquinaria, operarios, materia prima, procesos de producción|En la planta de producción donde se fabrican los productos|Tecnología disponible, normativas de seguridad y salud, demanda del producto, …​|Secuencia de operaciones y procesos para transformar materias primas en productos finales|Producir bienes de calidad de manera eficiente y segura|Conversión de materias primas en productos finales mediante procesos como mecanizado, ensamblaje, …​|

## ¿Para qué?

Gestionar fenómenos de esta complejidad va más allá de las capacidades humanas.

De ahí la necesidad del software —y la exigencia de que sea efectivo: eficaz y eficiente.


### Efectividad

```
+-------------+----------------------+----------------------------+
|             |       +              |             +              |
|             | (A) EFICAZ e         | (B) EFICAZ y               |
|             |     INEFICIENTE      |     EFICIENTE              |
|      +      |                      |                            |
|             | Haber alcanzado los  | Haber alcanzado los retos  |
|      E      | retos sin cumplir    | con los recursos dispuestos|
|      F      | con las pautas       |                            |
|      I      +----------------------+----------------------------+
|      C      |       -              |             -              |
|      A      | (C) INEFICAZ e       | (D) INEFICAZ y             |
|      C      |     INEFICIENTE      |     EFICIENTE              |
|      I      |                      |                            |
|      A      | Haber fracasado en   | Haber utilizado bien los   |
|             | el cumplimiento de   | recursos disponibles sin   |
|      -      | objetivos pese a     | alcanzar retos             |
|             | extralimitar el uso  |                            |
|             | de los medios        |                            |
+-------------+----------------------+----------------------------+
| EFECTIVIDAD |         -        EFICIENCIA        +              |
+-------------+----------------------+----------------------------+
```

### Las personas

- No son efectivas con tamaños elevados de elementos a gestionar por imposibilidad, agotamiento, desmotivación, distracción, …​
- No son eficaces por errores (¿nunca te has equivocado?, …​)
- No son eficientes por consumo de tiempo (calcula los primos del primer billón, a relación de un segundo por cálculo de si un número es primo, no hay segundos en la vida de una persona, …​)
- No son eficiente por consumo de espacio (calcula con lapiz y papel los posibles caminos entre todas las poblaciones de tu tierra natal, suponiendo que habrá miles, no hay hojas en el planeta, …​)

La solución no es hacer a las personas más capaces, sino entender cómo se organiza la complejidad por sí misma —y aprovechar esa estructura.

## ¿Cómo?

### Características de los sistemas complejos

<div align=center>

|Característica|Descripción|
|-|-|
Estructura jerárquica|Frecuentemente, la complejidad adquiere una forma jerárquica donde el sistema complejo está compuesto de subsistemas interrelacionados que a su vez tienen sus propios subsistemas y así hasta que se alcanza algún elemento del más bajo nivel.|**Organismos vivos**: Los seres humanos tienen sistemas (circulatorio, respiratorio, etc.), que a su vez tienen órganos, tejidos, células, orgánulos, y así sucesivamente.
Patrones comunes|Los sistemas jerárquicos se componen generalmente de sólo unos pocos tipos diferentes de subsistemas en varias combinaciones y órdenes.
Separación de asuntos|Las intra-conexiones de componentes son más fuertes que las inter-conexiones de componentes. Este hecho tiene el efecto de separar los componentes con dinámica de alta frecuencia (involucrando la interacción entre componentes) de los de dinámica de baja frecuencia. En términos sencillos, hay una clara separación de asuntos entre las partes de diferentes niveles de abstracción
Elementos primitivos relativos|La elección de qué componentes en un sistema son primitivos es relativamente arbritraria y mayormente está a discrección del observador del sistema
Formas intermedias estables|Un sistema complejo que funciona invariablemente se encuentra que ha evolucionado a partir de un sistema sencillo que funcionó. Un sistema complejo diseñado desde cero no funciona y no puede ser remendado para hacer que funcione. Usted tiene que comenzar de nuevo, a partir de un sistema sencillo de trabajo

</div>

Para lidiar con estas características, la ingeniería del software ha desarrollado cuatro conceptos fundamentales:

|Característica del sistema complejo|Concepto|Rol|
|-|:-:|-|
|Patrones comunes|**Abstracción**|Identificar lo esencial, ignorar lo irrelevante|
|Separación de asuntos|**Encapsulación**|Ocultar los detalles de la implementación|
|Elementos primitivos relativos|**Modularización**|Dividir en piezas independientes y cohesivas|
|Estructura jerárquica|**Jerarquización**|Organizar las abstracciones en niveles|

> [Bases de la programación](basesProgramacion.md)
