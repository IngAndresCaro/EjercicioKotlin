package org.example

fun main() {
    var contador = 10
    //mientras contador sea mayor a 0
    while (contador > 0) {
        println("Contador while: $contador")
        contador--
    }
    //hacer mientras contador sea mayor a 0
    contador = 10
    do {
        println("Contador doWhile: $contador")
        contador--
    } while (contador > 0)

    //ejerccio 1
    do{
        println("Generando numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println(" El numero generado es: $numeroAleatorio")
    } while (numeroAleatorio > 50)

}