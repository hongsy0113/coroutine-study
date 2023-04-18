package com.coroutine.study.chapter4.context

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    val handler = CoroutineExceptionHandler({ context, throwable ->
        println("Error captured in $context")
        println("Message: ${throwable.message}")
    })

    GlobalScope.launch(handler) {
        TODO("Not implemented yet!")
    }

    // wait for the error to happen
    delay(5000)
}