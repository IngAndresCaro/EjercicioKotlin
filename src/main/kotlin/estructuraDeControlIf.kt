package org.example

fun main() {
    val nombre = "Juan"

    if (nombre.isNotEmpty()){
        println("El nombre no está vacío su cantidad de caracteres es ${nombre.length}" )
    } else {
        println("El nombre está vacío")
    }

    val mensaje : String = if (nombre.length > 4) {
         "El nombre es largo"
    } else if (nombre.isEmpty()) {
        "El nombre no tiene caracteres"
    }
    else {
        "El nombre es corto"
    }
    println(mensaje)

}