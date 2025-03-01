package org.example

fun main() {
    //Lista no mutable
    val listDeNombres = listOf<String>("Juan", "Pedro", "Luis", "Carlos", "Juan", "Pedro", "Luis", "Carlos")
    println(listDeNombres)
    //lista mutable
    val listaVasia = mutableListOf<String>()
    println(listaVasia)
    listaVasia.add("Mateo")
    println(listaVasia)

    val valorUsandoGet = listaVasia.get(0)
    println(valorUsandoGet)

    val valorUsadoOperador = listaVasia[0]
    println(valorUsadoOperador)

    val primerValor = listDeNombres.firstOrNull()
    println(primerValor)

    listaVasia.removeAt(0)
    println(listaVasia)

    listaVasia.add("Atena")
    listaVasia.add( "Hades")
    listaVasia.add( "Zeu")
    listaVasia.removeIf { caracteres -> caracteres.length > 4 }
    println(listaVasia)

    val myArray = arrayOf(1, 2, 3, 4, 5)
    println("Nuestro array $myArray")
    println("Nuestro array como lista ${myArray.toList()}")
}