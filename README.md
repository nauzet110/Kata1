# Kata 1 - Familiarización con IntelliJ IDEA y Git

## 1. Objetivo de la entrega
El objetivo de esta práctica no es resolver un algoritmo complejo, sino mecanizar el uso diario de IntelliJ IDEA.
Con este microproyecto se busca reducir la fricción al programar, practicando atajos de teclado, refactorización de código, uso del depurador y el flujo de control de versiones con Git y GitHub.

## 2. Entorno y dependencias
* **Lenguaje:** Java 21
* **Gestor de dependencias:** Maven
* **IDE:** IntelliJ IDEA

## 3. Estructura de la entrega
El proyecto está contenido en el paquete base `software.ulpgc.kata1` y se divide en dos ficheros:
* `Person`: Es un `record` de dominio que almacena el nombre (`name`) y la fecha de nacimiento (`birthday`). Contiene un método de cálculo derivado llamado `age()` que calcula la edad en base a los días vividos, apoyándose en un método auxiliar `toYears()`.
* `Main`: Es el punto de entrada del programa. Su única responsabilidad es orquestar el ejemplo: crea una instancia de `Person` con datos concretos y muestra el resultado final por la consola.

## 4. Flujo Git y dinámica de repetición
Para cumplir con la repetición deliberada que pide la práctica, el ejercicio se ha realizado de la siguiente manera:
1. Se inicializó el repositorio en la rama `master` con la creación del proyecto base.
2. Se creó la rama `develop`, donde se realizó todo el trabajo de implementación.
3. Se repitió la kata 3 veces. En las primeras pasadas, se crearon las clases y luego se borraron  para poder volver a empezar desde cero y mecanizar los atajos del IDE.
4. En la última pasada (la versión final), se realizaron los siguientes commits pequeños y descriptivos:
   * `Class Person created`
   * `Class Person with name Attribute`
   * `Class Person as record`
   * `Class Person with  age attributes`
   * `Main class created`
   * `POM updated`
5. Finalmente, se integró todo el trabajo de `develop` en la rama `master` y se hizo push de ambas ramas a GitHub.

## 5. Compilación, ejecución y pruebas
El proyecto se puede ejecutar directamente desde IntelliJ abriendo la clase `Main` y pulsando `Shift + F10`. 

Durante el desarrollo se ha verificado el correcto funcionamiento utilizando el depurador: se colocaron breakpoints en el constructor de `Person` y en el cálculo de la edad, inspeccionando las variables en memoria con `Shift + F9`.
