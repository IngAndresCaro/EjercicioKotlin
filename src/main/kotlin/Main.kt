package org.example

fun main() {
    var nombre: String? = null
    val caracteresDeNombre: Int = nombre?.length ?: 0 // Elvis operator
    println(caracteresDeNombre)

}