package org.example

fun main() {

    var nombre: String? = null

    try {
        nombre?.length  // No forzar una excepción
        nombre!!.length // Forzar una excepción esto saca el error

    } catch (e: NullPointerException) {
        println("Error")
    }finally {
        println("Continua sin importar que")
    }

}