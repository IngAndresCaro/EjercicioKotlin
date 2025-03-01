package org.example

fun main() {
    val edadDeSuperHeroes = mapOf(
        "Superman" to 35,
        "Batman" to 43,
        "Capitan America" to 99,
        "Spiderman" to 21
    )
    println(edadDeSuperHeroes)

    val edadDeSuperHeroesMutable = mutableMapOf(
        "Superman" to 35,
        "Batman" to 43,
        "Capitan America" to 99,
        "Spiderman" to 21
    )

    edadDeSuperHeroesMutable["Superman"] = 36
    edadDeSuperHeroesMutable.put("IronMan", 48)
    edadDeSuperHeroesMutable.remove("Batman")

    println(edadDeSuperHeroesMutable)

    edadDeSuperHeroesMutable["Storm"] = 30
    println(edadDeSuperHeroesMutable)

    val edadIroman = edadDeSuperHeroesMutable["IronMan"]
    println(edadIroman)

    println(edadDeSuperHeroesMutable.keys)
    println(edadDeSuperHeroesMutable.values)


}