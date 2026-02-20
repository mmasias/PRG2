<div align=right>

<sub>[Introducción](README.md) / [Bases de la programación](basesProgramacion.md) / **Evolución** / [POO](poo.md)</sub>

</div>

# Evolución de los lenguajes de programación

La historia de los lenguajes de programación es, en esencia, la historia de **cómo los programadores han luchado contra la complejidad del software**. A medida que los programas crecían en tamaño y ambición, las herramientas disponibles resultaban insuficientes, lo que impulsó la búsqueda de nuevos paradigmas.

Esta evolución puede analizarse a través de cuatro conceptos fundamentales: la abstracción, que permite operar con ideas en lugar de detalles; la encapsulación, que protege la información ocultando su representación interna; la modularización, que divide el sistema en unidades manejables e independientes; y la jerarquización, que organiza esas unidades en estructuras que reflejan relaciones de dependencia o clasificación.

Cada paradigma ha supuesto un avance en uno o varios de estos pilares, hasta culminar en la Programación Orientada a Objetos, que los integra de forma coherente bajo el concepto de clase.

## Código máquina

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|{0,1}|
|**ENCAPSULACIÓN**|Nula|
|**MODULARIZACIÓN**|Nula|
|**JERARQUIZACIÓN**|Nula|

</div>

> Programa en lenguaje máquina que rellena toda la pantalla del ZX Spectrum con un patrón de colores

```
00100001b 00000000b 01000000b 00111110b 10100010b 01110111b 00010001b 00000001b 01000000b 00000001b 11111111b 00011010b 11101101b 10110000b 11001001b
```

El programador trabaja directamente sobre la arquitectura física. No existe ninguna herramienta conceptual que medie entre la idea y la máquina.

## Ensamblador

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Identificadores|
|**ENCAPSULACIÓN**|Nula|
|**MODULARIZACIÓN**|Macros|
|**JERARQUIZACIÓN**|Nula|

</div>

> El programa anterior, en ensamblador

```
    ld hl, $4000
    ld a, $a2
    ld (hl), a
    ld de, $4001
    ld bc, $1aff
    ldir
    ret
```

Los identificadores dan nombre a las instrucciones y las macros permiten reutilizar secuencias, pero el código sigue siendo un reflejo directo del hardware.

## Programación de alto nivel

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Subprogramas|
|**ENCAPSULACIÓN**|Reglas de Ámbito|
|**MODULARIZACIÓN**|Subprogramas|
|**JERARQUIZACIÓN**|Expresiones, Registros y Subprogramas|

</div>

> El programa anterior en BASIC

```basic
10 CLEAR 39999
20 DATA 33, 0, 64, 62, 162, 119, 17, 1, 64, 1, 255, 26, 237, 176, 201
30 GOSUB 100
40 RANDOMIZE USR 40000
50 STOP
100 REM --- Cargar rutina en memoria ---
110 FOR n = 0 TO 14
120 READ I
130 POKE (40000 + n), I
140 NEXT n
150 RETURN
```

Los subprogramas son el primer gran salto: permiten abstraer operaciones y reutilizarlas. Las reglas de ámbito introducen por primera vez una noción de visibilidad de la información.

## Programación estructurada

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Estructuras de control del flujo|
|**ENCAPSULACIÓN**|Control del flujo de ejecución|
|**MODULARIZACIÓN**|Control del flujo de ejecución|
|**JERARQUIZACIÓN**||

</div>

> Rellenar la pantalla con un patrón en Java estructurado (*)

```java
class Video {
    static byte[] pantalla = new byte[6912];

    static void rellenarPantalla(byte patron) {
        for (int i = 0; i < pantalla.length; i++) {
            pantalla[i] = patron;
        }
    }

    public static void main(String[] args) {
        rellenarPantalla((byte) 0xA2);
    }
}
```

El foco se desplaza al control del flujo de ejecución, ganando legibilidad y predictibilidad. Sin embargo, la gestión de los datos sigue siendo primitiva.

## Programación modular

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Espacios de nombre|
|**ENCAPSULACIÓN**|Privacidad en módulos|
|**MODULARIZACIÓN**|Módulos|
|**JERARQUIZACIÓN**|Jerarquías de dependencia entre módulos|

</div>

> Módulo de vídeo en Java

```java
public class ModuloVideo {
    private static byte[] pantalla = new byte[6912];

    public static void establecerPatron(byte valor) {
        for (int i = 0; i < pantalla.length; i++) {
            pantalla[i] = valor;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ModuloVideo.establecerPatron((byte) 0xA2);
    }
}
```

El módulo es la primera unidad que agrupa datos y operaciones con visibilidad controlada. Emergen las primeras jerarquías explícitas de dependencia entre componentes.

## TAD: tipo abstracto de datos

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Vista pública|
|**ENCAPSULACIÓN**|Vista privada|
|**MODULARIZACIÓN**|TAD's|
|**JERARQUIZACIÓN**|Jerarquías de composición y dependencia|

</div>

> TAD Pantalla: interfaz vs implementación

```java
interface Pantalla {
    void establecerPatron(byte valor);
    byte obtenerPixel(int x, int y);
}

class PantallaImpl implements Pantalla {
    private byte[] datos = new byte[6912];

    public void establecerPatron(byte valor) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = valor;
        }
    }

    public byte obtenerPixel(int x, int y) {
        return datos[x * 32 + y];
    }
}
```

La separación formal entre interfaz pública y representación privada es el salto conceptual más profundo de esta evolución. Un TAD es un contrato, no una implementación.

## Programación orientada a objetos

<div align=center>

|||
|-|:-:|
|**ABSTRACCIÓN**|Herencia y Polimorfismo|
|**ENCAPSULACIÓN**|Clases|
|**MODULARIZACIÓN**|Clases|
|**JERARQUIZACIÓN**|Jerarquías de clasificación|

</div>

**OO = TAD + Herencia & Polimorfismo**

> Jerarquía de dispositivos gráficos

```java
abstract class DispositivoGrafico {
    protected byte[] buffer;

    abstract void dibujar();
}

class Pantalla extends DispositivoGrafico {
    void dibujar() {
        System.out.println("Dibujando en pantalla hardware");
    }
}

class VentanaVirtual extends DispositivoGrafico {
    void dibujar() {
        System.out.println("Dibujando en ventana virtual");
    }
}

public class Main {
    public static void main(String[] args) {
        DispositivoGrafico[] dispositivos = {
            new Pantalla(),
            new VentanaVirtual()
        };
        for (DispositivoGrafico d : dispositivos) {
            d.dibujar();
        }
    }
}
```

> [POO](poo.md)

(*) *Java no tiene un modo "no orientado a objetos": `class` aquí es un contenedor sintáctico, sin herencia ni polimorfismo.*

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>