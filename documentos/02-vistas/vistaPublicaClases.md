# Vista pública de las Clases

## Sintaxis

```java
class  <NombreClase> {

}
```

## Cabecera de métodos de la clase

```java
  public <tipo1> <nombreMetodo> ({<tipo2> <parametro>, ...}*)

```

- Tipo1 indica el tipo del valor devuelto, que puede ser:

  |||
  |-|-|
  `void`|Nada, dado que el efecto será un cambio de estado en el objeto y/o sistema
  `<primitivo/Clase>`|Un valor de tipo primitivo o una referencia a un objeto de una clase
  `<primitivo/Clase>[]`|Una referencia a un vector de valores de tipos primitivos o de referencias a objetos
  `<primitivo/Clase>[][]`|Una referencia a una matriz de valores de tipos primitivos o de referencias a objetos
  etc...

- el nombre del método ***debe*** comenzar con minúscula
- el tipo2 ***puede ser*** igual que tipo1 excepto void
- Todos los parámetros son pasados ***por valor***

||||
|-|-|-|
|**Tipos primitivos**|**Referencias a objetos**|**La clave**|
|Cuando pasas un parámetro primitivo (`int`, `double`, `boolean`, etc.) a un método, Java copia su valor. Si el método modifica ese valor, el original permanece intacto.|Cuando pasas un objeto a un método, Java copia la **referencia** (la "dirección" donde está el objeto). Como la referencia copiada apunta al mismo objeto, el método **sí puede modificar el contenido del objeto**.|Pero el método **no puede cambiar la referencia original** para que apunte a otro objeto. La copia de la referencia y la original apuntan al mismo sitio, pero son independientes.

> NOTA: Un método void debe cambiar el estado. Un método que devuelve algo no debe cambiar el estado

## Sobrecarga de métodos

Varios métodos pueden tener el mismo nombre con las siguientes restricciones:

- Si están en la misma clase, deben diferenciarse en el número o tipo de parámetros comparados dos a dos.
- Si están en distintas clases, no existe restricción.

## Constructores

Son métodos que reúnen las tareas de inicialización (no construyen) y se lanzan automáticamente en la construcción de objetos.

- `public NombreDeLaClase()`
- Deben coincidir su nombre con el de la clase;
- No devuelven nada (ni void);
- No se pueden lanzar mensajes que se correspondan con los constructores de la clase.

## Destructores

Son métodos que reúnen las tareas de liberación de recursos y se lanzarían automáticamente en la destrucción de objetos.

- `protected void finalize()` era la cabecera del destructor
- **Están obsoletos (deprecated)** — no deben usarse en código moderno
- En su lugar, Java tiene:
  - **Garbage collector** que libera automáticamente la memoria dinámica no referenciada
  - **try-with-resources** para gestionar recursos que deben cerrarse (ficheros, conexiones, etc.)
  