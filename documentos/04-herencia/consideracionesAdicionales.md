<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / [VISTAS](/documentos/02-vistas/clasesObjetos.md) / [COLABORACIÓN](/documentos/03-colaboracion/README.md) / **POO**</sup><br>
<sub>[Herencia](README.md) / [Herencia por extensión](porExtension.md) / [Clases abstractas](clasesAbstractas.md) / [Por implementación](porImplementación.md) / **Consideraciones adicionales** / [Polimorfismo](polimorfismo.md) / [Conversión de tipos](conversionDeTipos.md) / [Herencia y enumerados](herenciaYEnumerados.md)</sub>

</div>

# Consideraciones adicionales

## Beneficios de la herencia

### Integridad de la Arquitectura del Software

La herencia favorece la comprensión de la arquitectura del software.

La jerarquía de clasificación de las clases establece los niveles de generalización que reducen significativamente el número de clases al estudiar en un diseño.

### Reusabilidad de código

Utilización del código de la clase padre previamente escrito, probado y documentado

No es necesario duplicar código similar, todo el código común se "factoriza" en la clase padre


## Cómo "limitar" la herencia

<div align=center>

|Clases `final`|Enumerados|Métodos `final`|
|-|-|-|
|No permiten ningún tipo de herencia posterior.|Son siempre `final` implícitamente: **no pueden heredar de una clase por extensión**. Sí pueden implementar interfaces.|No permiten ningún tipo de redefinición posterior.|

</div>

```java
final class <clase> {
  ...
}

class <clase> {
  ...
  final <tipo> <metodo>( <parámetros> ) {
    ...
  }
  ...
}
```

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>