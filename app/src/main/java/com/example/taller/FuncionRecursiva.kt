package com.example.taller

fun divisionPorRestas(dividendo: Int, divisor: Int): Int {
    // Caso base: cuando el dividendo es menor que el divisor, retornamos 0.
    if (dividendo < divisor) {
        return 0
    }
    // Llamada recursiva: restamos el divisor del dividendo y llamamos nuevamente a la función con el nuevo dividendo.
    return 1 + divisionPorRestas(dividendo - divisor, divisor)
}
fun main() {
    val dividendo = 12
    val divisor = 3
    val resultado = divisionPorRestas(dividendo, divisor)
    println("$dividendo / $divisor = $resultado")
}