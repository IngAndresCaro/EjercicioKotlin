package org.example

fun main() {
    val numerosDeLoteria = listOf(11, 22, 43, 56, 78, 90)
    val numerosSorteo = numerosDeLoteria.sorted() // Ordena de menor a mayor
    println(numerosSorteo)

    val numerosSorteoDescendente = numerosDeLoteria.sortedDescending() // Ordena de mayor a menor
    println(numerosSorteoDescendente)

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 } // Ordena por múltiplos de 50
    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled() // Mezcla los números
    println(numerosAleatorios)

    val numerosEnReversa = numerosDeLoteria.reversed() // Invierte el orden de la lista
    println(numerosEnReversa)

    val mensajeDeNumeros = numerosDeLoteria.map{ numero -> "Tu número de lotería es: $numero" } // Mapea los números
    println(mensajeDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 } // Filtra los números
    println(numerosFiltrados)
}