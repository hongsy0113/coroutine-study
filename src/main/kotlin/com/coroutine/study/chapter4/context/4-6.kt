package com.coroutine.study.chapter4.context

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// Non-cancellable
fun main(args: Array<String>) = runBlocking {
    val duration = measureTimeMillis {
        val job = launch {
            try {
                while (isActive) {
                    delay(500)

                    println("still running")
                }
            } finally {
                withContext(NonCancellable) {
                    println("cancelled, will delay finalization now")
                    delay(5000)
                    println("delay completed, bye bye")
                }

            }
        }

        delay(12000)
        job.cancelAndJoin()
    }
    println("Took $duration ms")

}