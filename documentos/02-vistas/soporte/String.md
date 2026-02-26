# String

Cadenas de caracteres: secuencias de caracteres de cualquier longitud.

## Lo esencial

Una cadena se escribe entre dobles comillas:

```java
String nombre = "Ana García";
```

Se concatena con `+`, combinable con cualquier tipo:

```java
String saludo = "Hola, " + nombre;
String mensaje = "Edad: " + 21;
```

Se compara con `equals`, nunca con `==`:

```java
boolean mismo = nombre.equals("Ana García");
```

Se conoce su longitud con `length()`:

```java
int longitud = nombre.length();
```

### Literales

<div align=center>

|||
|-|-|
`String` es la única clase cuyos objetos pueden presentarse en forma literal: una secuencia de caracteres encerrada entre dobles comillas.|Un literal es un objeto `String` cuya evaluación devuelve la dirección del objeto que representa.

</div>

`String` es también la única clase que disfruta de un operador (`+`) para la concatenación:

```java
String serie = (0 + 1) + "," + (1 + 1) + "," + (2 + 1) + ".";
```

### Igualdad: `==` vs `equals`

```java
String esperado = "si";
String respuesta = console.readString("¿Continuar? ");
boolean falla = respuesta == esperado;
boolean funciona = respuesta.equals(esperado);
```

`==` compara si dos referencias apuntan al mismo objeto. `equals` compara si dos objetos tienen el mismo contenido. Para comparar cadenas, siempre `equals`.

## Métodos (selección)

|Método|Retorno|Descripción|
|---|---|---|
|`length()`|`int`|Número de caracteres|
|`isEmpty()`|`boolean`|Si la longitud es cero|
|`charAt(int)`|`char`|Carácter en la posición indicada|
|`equals(String)`|`boolean`|Igualdad de contenido|
|`equalsIgnoreCase(String)`|`boolean`|Igualdad ignorando mayúsculas/minúsculas|
|`compareTo(String)`|`int`|Orden lexicográfico (negativo, cero, positivo)|
|`startsWith(String)`|`boolean`|Si comienza con el prefijo|
|`endsWith(String)`|`boolean`|Si termina con el sufijo|
|`indexOf(String)`|`int`|Posición de la primera aparición (-1 si no existe)|
|`lastIndexOf(String)`|`int`|Posición de la última aparición|
|`substring(int)`|`String`|Subcadena desde la posición hasta el final|
|`substring(int, int)`|`String`|Subcadena entre dos posiciones|
|`concat(String)`|`String`|Concatenación (equivalente a `+`)|
|`replace(char, char)`|`String`|Reemplaza todas las apariciones de un carácter|
|`toLowerCase()`|`String`|Conversión a minúsculas|
|`toUpperCase()`|`String`|Conversión a mayúsculas|
|`trim()`|`String`|Eliminación de espacios al inicio y al final|
|`toCharArray()`|`char[]`|Conversión a vector de caracteres|
|`toString()`|`String`|La propia cadena|

## Tópicos avanzados

### Inmutable vs mutable

Java distingue dos tipos de cadenas:

- **Constantes (inmutables):** cuyos caracteres no varían una vez creados. Clase `String`.
- **Variables (mutables):** cuyos caracteres pueden variar. Clase `StringBuffer`.

Todos los métodos de `String` que parecen "modificar" la cadena devuelven un `String` nuevo. El original nunca cambia. Eso es la inmutabilidad.

### StringBuffer

Cuando se necesita modificar una cadena (insertar, eliminar, reemplazar caracteres), se usa `StringBuffer`:

```java
StringBuffer buffer = new StringBuffer("caracteres");
buffer.insert(0, "cadena de ");
```

### Métodos de StringBuffer (selección)

|Método|Retorno|Descripción|
|---|---|---|
|`length()`|`int`|Número de caracteres|
|`charAt(int)`|`char`|Carácter en la posición|
|`setCharAt(int, char)`|`void`|Modifica un carácter|
|`append(String)`|`StringBuffer`|Añade al final|
|`insert(int, String)`|`StringBuffer`|Inserta en la posición|
|`delete(int, int)`|`StringBuffer`|Elimina un rango|
|`deleteCharAt(int)`|`StringBuffer`|Elimina un carácter|
|`replace(int, int, String)`|`StringBuffer`|Reemplaza un rango|
|`reverse()`|`StringBuffer`|Invierte la cadena|
|`substring(int)`|`String`|Subcadena desde la posición|
|`substring(int, int)`|`String`|Subcadena entre dos posiciones|
|`toString()`|`String`|Conversión a String|

A diferencia de `String`, los métodos de `StringBuffer` modifican el propio objeto. `append`, `insert`, `delete`, `replace` y `reverse` devuelven el mismo `StringBuffer`, lo que permite encadenar llamadas:

```java
StringBuffer buffer = new StringBuffer("cadena ");
buffer.insert(0, "de ").insert(0, "cadena ");
```

## Conversión entre String y StringBuffer

```java
String cadena = "texto";
StringBuffer buffer = new StringBuffer(cadena);
String resultado = buffer.toString();
```

## Ejemplo

```java
String cadena = "caracteres";
int longitud = cadena.length();
boolean vacia = cadena.isEmpty();
boolean empieza = cadena.startsWith("car");
String mayusculas = cadena.toUpperCase();

StringBuffer buffer = new StringBuffer(cadena);
buffer.insert(0, "de ").insert(0, "cadena ");
boolean iguales = ("cadena de " + cadena).contentEquals(buffer);
```
