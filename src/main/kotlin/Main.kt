package org.example

const val Pi = 3.1416;//valor que no cambia en tiempo de ejecución

fun main() {
    println("Hello World!")
    var dinero = 10;
    println(dinero);

    dinero = 5;
    println(dinero);

    val nombre = "Juan";
    println(nombre);
    // nombre = "Pedro"; // Error variable de solo lectura no es posible reasignar

    println(Pi)

}