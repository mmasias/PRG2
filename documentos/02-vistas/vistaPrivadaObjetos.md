<div align=right>

<sup>[INTRODUCCIÓN](/documentos/01-introduccion/README.md) / **VISTAS** / COLABORACIÓN / POO</sup><br>
<sub>[Clases y objetos](clasesObjetos.md) / [Vistas](introVistas.md) / [Vista pública de clases](vistaPublicaClases.md) / [Vista pública de objetos](vistaPublicaObjetos.md) / [Vista privada de clases](vistaPrivadaClases.md) / **Vista privada de objetos**</sub>

</div>

# Vista privada de los objetos

## ¿Por qué?

||||
|-|-|-|
Las tres vistas anteriores son estáticas: describen la estructura del código tal como se escribe.|Pero los objetos no existen en el código: existen en la ejecución.|Se crean dinámicamente con `new`, viven mientras alguien los referencia y desaparecen cuando el recolector de basura los reclama.

## ¿Qué?

La vista privada de un objeto sería el conjunto de valores concretos de sus atributos en un instante dado y la traza de mensajes internos que se desencadenan al recibir un mensaje externo.

Pero esta vista **no es observable desde fuera del objeto**. Eso no es una limitación: es exactamente lo que la encapsulación garantiza.

## ¿Para qué?

<div align=center>

|Desde fuera del objeto|Desde dentro del objeto|
|-|-|
|Solo se conoce su interfaz pública|Se accede a los atributos y métodos privados|
|Se envían mensajes|Se desencadenan mensajes internos|
|Se observa comportamiento|Se ejecuta implementación|
|Se conoce el estado a través de lo que el objeto permita|Se conoce el estado a través de su representación|
|No se puede conocer la representación del estado|Se puede cambiar la representación sin afectar a nadie|

</div>

Esta separación es la que permite cambiar la representación interna sin afectar a ningún cliente. Si la vista privada de los objetos fuera observable, cualquier cambio interno sería un cambio externo.

## ¿Cómo?

No hay sintaxis que enseñar. No hay código que escribir.

La vista privada de los objetos se manifiesta exclusivamente en tiempo de ejecución:

- Al crear un objeto (`new`), se **desencadena la instanciación** de sus atributos según el constructor.
- Al recibir un mensaje, se **desencadenan mensajes internos** a los atributos y a `this`, según la definición de los métodos.

<div align=center>

|![](/images/modelosUML/vistaPrivadaObjetos.svg)
|-:
|<sub>[Código fuente](/modelosUML/vistaPrivadaObjetos.puml)</sub>

</div>

Todo lo que ocurre dentro del receptor es **invisible** para el emisor. El emisor solo sabe que envió un mensaje y obtuvo una respuesta (o un cambio de estado observable a través de otros mensajes públicos).

### Consecuencia directa

Dos objetos de la misma clase pueden tener representaciones internas completamente distintas — y el cliente no tiene forma de distinguirlos si su comportamiento público es idéntico.

Esto es lo que se demostró con la clase `Intervalo`: la representación (inferior, superior) y la representación (puntoMedio, longitud) producen objetos indistinguibles desde fuera.

La vista privada de los objetos existe. Pero su existencia solo tiene sentido precisamente porque no se puede ver.
