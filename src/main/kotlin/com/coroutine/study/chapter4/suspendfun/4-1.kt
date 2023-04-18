package com.coroutine.study.chapter4.suspendfun

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {
        greetDelayed(5000)
    }
}

suspend fun greetDelayed(delayMillis: Long) {
    delay(delayMillis)
    println("Hello, World!")
}