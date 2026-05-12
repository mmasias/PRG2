<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / [Por extensión](porExtension.md) / [Clases abstractas](clasesAbstractas.md) / [Por implementación](porImplementación.md) / [Consideraciones adicionales](consideracionesAdicionales.md) / [Polimorfismo](polimorfismo.md) / **Conversión de tipos** / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Conversión de tipos

<div align=center>

|Conversión ascendente (*upcast*)|Conversión descendente (*downcast*)|
|-|-|
|Transformar la dirección de un objeto a una referencia de una clase ascendente (padre, abuela, …).|Transformar la dirección de un objeto a una referencia de una clase derivada (hija, nieta, …).|
|**Implícita**: ocurre automáticamente al asignar a una referencia de clase ascendente.|**Explícita**: requiere el operador de conversión `(<tipo>)`; puede producir error en ejecución si el objeto no es de esa clase.|

</div>

## Sintaxis

```java
(<tipo>) <dirección>
```

```java
Lista lista     = new Lista();
Conjunto conj   = new Conjunto();
Lista coleccion = new Conjunto();             // upcast implícito: OK

Conjunto resultado;
resultado = conj.interseccion(coleccion);             // ERROR: tipo incompatible
resultado = conj.interseccion((Conjunto) coleccion);  // downcast explícito: OK

((Conjunto) lista).interseccion(conj);  // ERROR DE EJECUCIÓN: lista no es Conjunto
```

## Clase `Object`

Toda clase que no extiende explícitamente ninguna otra hereda implícitamente de la clase predefinida `Object`.

```java
class Object {
  public boolean equals(Object o)
  public String toString()
  public int hashCode()
  protected Object clone()
  protected void finalize()
  ...
}
```

`Object` proporciona un conjunto de métodos comunes a todas las clases, algunos susceptibles de ser redefinidos según las necesidades de cada clase.

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
