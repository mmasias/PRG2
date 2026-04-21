# HOOD - Una aproximación intuitiva al diseño descendente

## ¿Por qué?

La programación de sistemas complejos presenta diversos desafíos que dificultan su desarrollo:

- Se genera código difícil de leer y mantener cuando no existe una estructura clara de responsabilidades.
- Los desarrolladores tienden a mezclar detalles de implementación con la lógica principal del programa.
- La transición desde la programación estructurada hacia la orientada a objetos resulta confusa para muchos estudiantes.
- El main suele convertirse en un método extenso y complejo que asume demasiadas responsabilidades.
- La identificación de clases y sus responsabilidades se realiza frecuentemente de manera arbitraria.
- Existe una tendencia a que un único objeto "controlador" asuma la responsabilidad de todo el sistema.

Como señala L. Fernández: "*En programación tradicional, se definirían todas las estructuras de datos necesarias para que las manipulen todos los subprogramas. En programación orientada a objetos, se recurre a atributos que son objetos de otras clases responsables de los detalles del soporte y manipulación de esos datos*".

## ¿Qué?

"Flipping on the Beach" es una metodología de diseño que adapta los principios del Diseño Orientado a Objetos Jerárquico (HOOD) de manera simplificada e intuitiva.

Esta metodología propone diseñar el sistema de manera descendente (top-down), comenzando por la visión global del programa y refinando progresivamente cada componente. El término "flipping" (o "flipar") hace referencia al proceso creativo de imaginar o visualizar los componentes necesarios y sus responsabilidades.

## ¿Para qué?

La aplicación de "Flipping on the Beach" ofrece múltiples beneficios:

- **Claridad**: El código principal se mantiene limpio y legible, expresando claramente QUÉ hace sin mezclarlo con CÓMO lo hace.
- **Mantenibilidad**: Cada componente tiene una responsabilidad clara y bien definida, facilitando la localización y corrección de errores.
- **Escalabilidad**: Es más sencillo añadir nuevas funcionalidades sin afectar al código existente gracias a la separación de responsabilidades.
- **Transición natural a POO**: Prepara el terreno para la programación orientada a objetos, facilitando la comprensión del paradigma.
- **Colaboración natural**: Los objetos colaboran de manera similar a cómo entendemos el mundo real, mejorando la intuición sobre el diseño.
- **Encapsulación efectiva**: Cada clase encapsula sus datos y comportamientos, reduciendo el acoplamiento entre componentes.
- **Identificación temprana de relaciones**: Permite reconocer los distintos tipos de relaciones entre clases desde las primeras fases del diseño.

Como señala Booch: "*Un objeto en sí mismo no es interesante. Los objetos contribuyen al comportamiento de un sistema colaborando con otros objetos*".

## ¿Cómo?

|||
|-|-|
|**Tomar una clase**|Al inicio del desarrollo, será la clase que engloba todo el sistema. Posteriormente, serán las clases que se vayan identificando durante el desarrollo.|
|**Definir el comportamiento**|Se determinan las cabeceras de los métodos públicos, especialmente el método principal que dispara toda la funcionalidad (como `jugar()`, `ejecutar()`, etc.)|
|**Definir los atributos**|Se identifican los datos necesarios para que la clase cumpla sus responsabilidades, generalmente como atributos que son objetos de otras clases.|
|**Codificar los métodos**|Se implementa la lógica delegando tareas a los colaboradores. No debe ser impedimento incluir mensajes a métodos que aún no existen.|
|**Recapitular**|Se identifican las nuevas clases que han surgido y los mensajes enviados a objetos de estas clases.|

### 1. El main limpio

Se comienza con una clase que será la que consuma nuestra implementación, con un main que exprese claramente QUÉ hace el programa, sin entrar en CÓMO lo hace:

```java
public class Juego{
  public static void main(String[] args) {
      TresEnRaya tresEnRaya = new TresEnRaya();
      tresEnRaya.jugar();
  }
}
```

### 2. Primera "flipada": Las responsabilidades principales

Para la clase principal, se define su comportamiento general:

```java
public class TresEnRaya {
    public void jugar() {
        do {
            tablero.mostrar();
            if (!tablero.estaCompleto(jugadores[turno.leToca()])) {
                jugadores[turno.leToca()].ponerFicha(tablero);
            } else {
                jugadores[turno.leToca()].moverFicha(tablero);
            }
            turno.cambiar();
        } while (!tablero.hayTresEnRaya());
        jugadores[turno.noLeToca()].celebrar();
    }
}
```

### 3. Segunda "flipada": Los colaboradores

Se identifican las clases colaboradoras y sus responsabilidades:

```java
class Tablero {

    private char[][] casillas;

    public Tablero() {
        casillas = new char[3][3];

        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j] = '_';
            }
        }
    }

    public void mostrar() {
        cleanScreen();
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                System.out.print(" " + casillas[i][j]);
            }
            System.out.println();
        }
    }
}
```

### 4. Aplicación sistemática del método

Para cada nueva clase identificada, se repite el proceso cíclicamente:

1. **Tomar la clase**: Seleccionar una de las clases identificadas previamente
2. **Definir comportamiento**: Establecer la interface pública
3. **Definir atributos**: Identificar datos y colaboradores necesarios
4. **Codificar métodos**: Implementar delegando tareas a colaboradores
5. **Recapitular**: Identificar nuevas clases y métodos necesarios

### Visiones

La aplicación de "Flipping on the Beach" supone trabajar simultáneamente con las visiones estática y dinámica del programa:

#### Visión estática: Las clases y sus relaciones

En la visión estática, se construye -se va construyendo- la jerarquía de clases relacionadas entre sí. Por ejemplo:

```
Aplicacion
    ├─TresEnRaya
    ├── - tablero: Tablero
    ├── - jugadores: Jugador[]
    └── - turno: Turno

```

Cada clase ofrece un nombre y una interfaz pública de métodos que permite la abstracción de un concepto: esencialmente qué es y qué puede hacer. La vista privada encapsula los detalles: cómo se soportan los datos y cómo se manipulan.

#### Visión dinámica: Los objetos y su colaboración

En la visión dinámica, se crea un universo jerarquizado de objetos construido "automáticamente" mediante instanciaciones, que colaboran entre sí mediante mensajes:

```
main:
  crea una aplicacion que:
    crea TresEnRaya que:
      crea Tablero que:
        crea char[][] casillas
      crea Jugador[2] que:
        crea Jugador(x) que:
          almacena color 'x'
        crea Jugador(o) que:
          almacena color 'o'
      crea Turno que:
        inicializa valor aleatoriamente (0 o 1)
      ...
```
