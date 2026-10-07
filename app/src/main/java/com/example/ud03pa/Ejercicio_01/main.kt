package com.example.ud03pa.Ejercicio_01

fun main() {
    // Declarar los objetos de la clase SerVivo
    // Objeto X tiene 3 años, Objeto Y tiene 5 años
    var objetoX = SerVivo(3.toByte())
    var objetoY = SerVivo(5.toByte())

    // Declaro los objestos de la clase Humano y asigno variables
    // Objeto X: nombre Homero, 34 años, Objeto Y: nombre Bart, 9 años
    objetoX = Humano(34.toByte(), "Homero")
    objetoY = Humano(9.toByte(), "Bart")

    // imprimir mayor SerVivo
    println("\n--- Comparacion de SerVivo ---")
    val mayorSerVivo = objetoX.mayor(objetoY)
    println("\nEl mayor SerVivo tiene: $mayorSerVivo")

    // Imprimir el mayor Humano
    println("\n--- Comparacion de Humano ---")
    val mayorHumano = (objetoX as Humano).mayor(objetoY as Humano)
    println("\nEl mayor Humano es: $mayorHumano")
}