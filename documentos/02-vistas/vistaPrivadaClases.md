# Vista privada de las clases

## Definición de atributos

- **Datos constantes**
- **Variables de tipos primitivos**
- **Referencias a objetos y/o vectores de objetos**

Se declaran variables y/o constantes de tipos primitivos, referencias a objetos o vectores de éstos, anteponiendo la palabra **private**

En cualquer punto de la implementación de la clase pero lo lógico es **al principio de la declaración de la clase**.

```java
    class <class> {

        private <declaration>
        private <declaration>
        ...
}
```

```java
class Intervalo {

    private double inicio;
    private double fin;       

}
```

## Definición de constructores

### Inicialización de los atributos de la clase

Reservado para las tareas de inicialización de los atributos del objeto, evitando la creación de objetos inconsistentes

A falta de inicialización explícita, **no recomendado**, se inicializan a valores por defecto, dependiendo de su tipo (0 para tipos numéricos, *false* para el tipo *boolean*, *caracter nulo* para tipo *char* y *null* para referencias);

```java
class Intervalo {

    private double superior;
    private double inferior;

    public Intervalo (double inferior, double superior) {
        this.inferior = inferior;
        this.superior = superior;
    }

    public Intervalo () {
        this(0,0);
    }

            ...
}
```

## Definición de métodos

***Métodos***: Operaciones con sentencias secuenciales, alternativos, iterativas, expresiones (asignación) y/o de retorno

En cualquier punto de la implementación de la clase, se define el cuerpo de las cabeceras de los métodos acompañándolos de una sentencia secuencial que contiene las declaraciones locales y sentencias que se consideren oportunas

Dentro del cuerpo del método se tiene acceso a:

- Los atributos.
- Los parámetros del método.
- Las declaraciones locales desde las expresiones de la anidación jerárquica de sentencias.

La notación punto para el paso de mensajes sirve también para acceder a los atributos de un objeto de la misma clase

```java
    clase <class> {

        public <methodHeader> <sequentialSentence>
        public <methodHeader> <sequentialSentence>
        ...
    }
```

Si el tipo devuelto *no es* void, se determinará el valor devuelto por el método con la siguiente sentencia:

```java

  return <expression>;

```

```java

class Intervalo {

    public void desplazar(double desplazamiento) {
        inferior = inferior + desplazamiento;
        superior = superior + desplazamiento;
    }

}

```

## Referencia this

### Para la resolución de colisión de identificadores y reutilización de métodos dentro de la clase

***this*** es una referencia constante que guarda la dirección del objeto que recibe el mensaje correspondiente al método que se está definiendo, implícitamente existe en todas las clases:

```java

  private final <class> this;

```

### Para evitar la multiplicidad de identificadores innecesarios

Sirve para resolución de ambigüedades en la colisión de parámetros o declaraciones locales con el mismo nombre que los atributos;

```java

    public Intervalo (double inferior, double superior) {
        this.inferior = inferior;
        this.superior = superior;
    }

```

### Para la reutilización de constructures

Sirve para la reutilización de contructores en la definición de otros constructores, siendo la primera sentencia del constructor, mediante la sintaxis:

```java

    this([ <expression> {, <expression> }]);

```

```java

    public Intervalo (double inferior, double superior) {
        this.inferior = inferior;
        this.superior = superior;
    }

    public Intervalo (double superior) {
        this(0,superior);
    }

    public Intervalo () {
        this(0,0);
    }

```

### Para la reutilización de métodos

Sirve para la reutilización de métodos en la codificación de otros métodos

```java

    public Intervalo clone() {
        return new Intervalo(this);

    }

    public Intervalo desplazado(double desplazamiento) {

        Intervalo intervalo = this.clone();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

```

## Métodos privados

### Para la reutilización de métodos dentro de la clase

Sirve para la reutilización de métodos en la codificación de otros métodos

Dado que puede ser conveniente disponer de métodos que no han sido solicitados para implementar otros métodos, cabe la posibilidad de definir métodos de ámbito privado que **sólo se pueden usar en la implementación de la clase**

```java

    class <class> {
        private <methodHeader> <sequentialSentence>
        private <methodHeader> <sequentialSentence>
        ...
    }

```

```java

// PENDIENTE PONER EJEMPLOS

```
