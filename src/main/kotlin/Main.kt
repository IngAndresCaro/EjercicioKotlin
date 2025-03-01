package org.example

fun main() {

    val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vocalesRepetidas)

    val numerosFavoritosMutables = mutableSetOf(1, 2, 3, 4, 5)
    println(numerosFavoritosMutables)
    numerosFavoritosMutables.add(5)
    numerosFavoritosMutables.add(6)
    println(numerosFavoritosMutables)

    numerosFavoritosMutables.remove(5)
    println(numerosFavoritosMutables)

    val valorDelSet: Int?  = numerosFavoritosMutables.firstOrNull(){numero -> numero > 2}
    println(valorDelSet)

}