<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>**Herencia** / [Por extensión](porExtension.md) / [Clases abstractas](clasesAbstractas.md) / [Por implementación](porImplementación.md) / [Consideraciones adicionales](consideracionesAdicionales.md) / [Polimorfismo](polimorfismo.md) / [Conversión de tipos](conversionDeTipos.md) / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Herencia

**Transmisión**: La herencia en todos los ámbitos (derecho, biología, …​) tiene connotaciones de transmisión

En Programación Orientada a Objetos es la transmisión de todos los miembros (atributos y métodos públicos y privados) de una clase a otra.


## Terminología

<div align=center>

<table>
<tr>
<td>

||La que transmite|La que recibe la transmisión
|-|:-:|:-:|
||Clase base|Clase derivada|
|*también llamadas*|padre|hija|
|*también llamadas (aunque en desuso)*|Superclase|Subclase|

</td>
<td>

![](/images/modelosUML/transmision.svg)
</td>
</tr>
</table>

</div>

## Implicaciones en la colaboración

<div align=center>

|Composición, asociación y dependencia|Herencia|
|-|-|
|Relaciones binarias que devienen de la colaboración entre objetos: envío de mensajes entre objetos.|Es una relación binaria entre clases, pero **no es necesario** que exista una colaboración entre los objetos de sus clases ***aunque*** tampoco lo impide|

</div>

*Por tanto, los objetos de las clases de una relación de herencia son, a priori, **independientes**.*

## Tipos

<div align=center>

|Simple|Múltiple|
|-|-|
Cuando una clase derivada hereda de una única clase base.|Cuando una clase derivada hereda de varias clases base.

</div>

## Jerarquías de clasificación

### Definición

Una jerarquía por grado de clasificación es aquélla donde cada nodo (clases) de la jerarquía establece un dominio de elementos (conjuntos de objetos de la clase) incluido en el dominio de los nodos padre e incluye a los dominios de cada nodo hijo

> La relación de herencia permite establecer jerarquías por grado de clasificación

<div align=center>

|||
|-|-|
![](/images/modelosUML/jerarquiaClasificacion001.svg)|![](/images/modelosUML/jerarquiaClasificacion002.svg)|

</div>

### Características

- Eminentemente subjetivas
  - Ej. paciente de un hospital: publica/privada, por especialidad,…​
- Contemplan elementos que son dificilmente categorizables
  - Ej. Ornitorrinco, pingüino, mula,…​
- Dificultad para establecer una clasificación "perfecta"
- Esqueleto fundamental de un programa junto con la jerarquía de composición

### Reglas de construcción

<div align=center>

|Generalización/Especialización|¿Es un...? (Is a...?)|
|-|-|
Cuando existen unas características específicas de un subconjunto de elementos de un determinado conjunto más amplio, que pese a que mantienen las características esenciales e identificativas del conjunto al que pertenecen, también son lo suficientemente relevantes como para ser rasgos distintivos de dicho subconjunto de elementos.|Poder responder afirmativamente que un objeto de la clase hija es un objeto de la clase padre.

![](/images/modelosUML/jerarquiaAnimales.svg)

</div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
