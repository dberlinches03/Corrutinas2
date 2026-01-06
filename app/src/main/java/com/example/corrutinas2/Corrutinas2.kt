package com.example.corrutinas2
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        var segundos = 0
        while (isActive) {
            delay(1000)
            segundos++
            println("Tiempo: $segundos s")
        }
    }

    delay(5000)
    println("Cancelando temporizador")
    job.cancelAndJoin()
    println("Temporizador detenido")
}