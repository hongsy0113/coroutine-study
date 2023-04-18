package com.coroutine.study.chapter4.context

import kotlinx.coroutines.*

// Unconfined 디스패처
fun main(args: Array<String>) = runBlocking {
    GlobalScope.launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(500)
        println("Resuming in ${Thread.currentThread().name}")
    }.join()
}