<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / [Por extensión](porExtension.md) / [Clases abstractas](clasesAbstractas.md) / [Por implementación](porImplementación.md) / [Consideraciones adicionales](consideracionesAdicionales.md) / [Polimorfismo](polimorfismo.md) / [Conversión de tipos](conversionDeTipos.md) / **Herencia y enumerados**</sub>

</div>

# Herencia y enumerados

Un enumerado en Java es azúcar sintáctico sobre un patrón de herencia: una clase abstracta con un conjunto fijo de subclases anónimas instanciadas como constantes estáticas.

<div align=center>

|Sin enumerados|Con enumerados|
|-|-|
|Clase abstracta + subclases explícitas con nombre|`enum` con cuerpos de constante|

</div>

## Sin enumerados

```java
abstract class Enum {
    public static Enum OBJECT_1 = new Object_1("OBJECT_1");
    public static Enum OBJECT_2 = new Object_2("OBJECT_2");
    public static Enum OBJECT_3 = new Object_3("OBJECT_3");

    public static Enum[] values() {
        return new Enum[] { Enum.OBJECT_1, Enum.OBJECT_2, Enum.OBJECT_3 };
    }

    private String name;

    protected Enum(String name) { this.name = name; }

    public String name() { return this.name; }

    public void transmitedMethod() { Console.instance().writeln("General"); }

    public abstract void redefinedMethod();
}

class Object_1 extends Enum {
    protected Object_1(String name) { super(name); }
    public void redefinedMethod() { Console.instance().writeln(this.name()); }
}

class Object_2 extends Enum {
    protected Object_2(String name) { super(name); }
    public void redefinedMethod() { Console.instance().writeln(this.name()); }
    public void transmitedMethod() { Console.instance().writeln("Particular"); }
}

class Object_3 extends Enum {
    protected Object_3(String name) { super(name); }
    public void redefinedMethod() { Console.instance().writeln(this.name()); }
    public void addedMethod() { Console.instance().writeln("addedMethod"); }
}
```

## Con enumerados

```java
enum Enum {
    OBJECT_1 {
        public void redefinedMethod() { Console.instance().writeln(OBJECT_1.name()); }
    },
    OBJECT_2 {
        public void redefinedMethod() { Console.instance().writeln(OBJECT_2.name()); }
        public void transmitedMethod() { Console.instance().writeln("Particular"); }
    },
    OBJECT_3 {
        public void redefinedMethod() {
            Console.instance().writeln(OBJECT_3.name());
            this.addedMethod();
        }
        public void addedMethod() { Console.instance().writeln("addedMethod"); }
    };

    public void transmitedMethod() { Console.instance().writeln("General"); }
    public abstract void redefinedMethod();
}
```

## Uso

```java
for (Enum current : Enum.values()) {
    current.transmitedMethod();
    current.redefinedMethod();
    // current.addedMethod();       ERROR: no está en la interfaz de Enum
}
// Enum.OBJECT_3.addedMethod();     posible accediendo directamente a la constante
```

La llamada a `addedMethod()` a través de la referencia polimórfica no es posible: el método no está en la interfaz de `Enum`. Solo es accesible referenciando directamente la constante, lo que rompe el tratamiento polimórfico.

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
