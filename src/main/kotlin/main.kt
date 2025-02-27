package org.example

fun main() {
    val nombreColor = "Amarillo"

    when (nombreColor) {
        "Amarillo" -> {
            println("El amarillo es el color del sol")
        }
        "Azul" -> println("El azul es el color del cielo")
        "Rojo","Carmesi" -> println("El rojo es el color de la pasion")

        else -> println("No tengo información sobre el color")
    }

    val code = 200
    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 300..399 -> println("Redirección")
        in 400..499 -> println("Error del cliente")
        in 500..599 -> println("Error del servidor")
        else -> println("Código desconocido")
    }

    val tallaDeZapatos = 41
    val mensaje = when (tallaDeZapatos) {
        41, 42 -> "Tenemos disponible"
        44, 45 -> "Casi no tenemos!"
        46 -> "No tenemos disponible"
        else -> "No tenemos disponible"
    }
    println(mensaje)


}