package org.example

fun main() {
    val listaDeFrutas = listOf("Maçã", "Banana", "Pera", "Uva", "Melancia")

    //for clasico
    for (fruta in listaDeFrutas) {println("Hoy voy a comer la fruta llamada $fruta")    }
    
    //funciones anonimas o lambdas
    listaDeFrutas.forEach { fruta -> println("Hoy voy a comer la fruta llamada $fruta") }
    
    //funciones anonimas o lambdas 
    val caracteresDeFrutas: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
    println(caracteresDeFrutas)

    //funciones anonimas o lambdas
    val frutasConA: List<String> = listaDeFrutas.filter { fruta -> fruta.contains("e") }
    println(frutasConA)
}