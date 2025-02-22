package org.example

const val Pi = 3.1416;//valor que no cambia en tiempo de ejecución

fun main() {
    println("Hello World!")
    var dinero = 10;
    println(dinero);

    dinero = 5;
    println(dinero);

    val nombre = "Juan";
    println(nombre);
    // nombre = "Pedro"; // Error variable de solo lectura no es posible reasignar

    println(Pi)

    val boolean = true;
    val numeroLargo: Long = 3000000000L;
    val numeroDecimal: Double = 3.1416;
    val numeroDecimal2: Float = 3.1416f;
    val numeroHexadecimal: Int = 0x0F;
    val numeroBinario: Int = 0b00001011;

    val primerValor = 10;
    primerValor.toDouble();
    primerValor.toFloat();
    primerValor.toLong();
    primerValor.toShort();

    val segundoValor = 25;

    val tercerValor =primerValor.minus(segundoValor) //minus resta es lo mismo que primerValor - segundoValor
    println(tercerValor)

    val cuartoValor = primerValor.plus(segundoValor) //plus suma es lo mismo que primerValor + segundoValor

    val apellito = "Caro"
    val name = "Andres"

    val nombreCompleto = "Mi nombre es $name y mi apellido es $apellito"
    println(nombreCompleto)
}