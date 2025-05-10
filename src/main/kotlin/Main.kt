package org.example

fun main() {

    //Ejemplo sumando
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }
    //cuando una funcion tiene un solo return, se puede simplificar
    fun sumar2(a: Int, b: Int) = a + b
    //la funciones tambien devuelven nada
    fun imprimir() {
        println("Hola")
    }


}