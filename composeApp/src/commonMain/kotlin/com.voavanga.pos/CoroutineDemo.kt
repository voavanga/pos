package com.voavanga.pos

import kotlinx.coroutines.*

val myCoroutineScope = CoroutineScope(Dispatchers.Default + SupervisorJob())

fun demoCoroutines() {
    println("Starting demoCoroutines")

    // Launch a coroutine within the scope
    myCoroutineScope.launch {
        delay(1000L) // Simulate some work
        println("Hello from Coroutine!")
    }

    println("Ending demoCoroutines")
}
