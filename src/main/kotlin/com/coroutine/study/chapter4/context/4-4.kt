package com.coroutine.study.chapter4.context

import kotlinx.coroutines.*

// 스레드 풀
fun main(args: Array<String>) = runBlocking {
    val dispatcher = newFixedThreadPoolContext(4, "myPool")

    GlobalScope.launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(500)
        println("Resuming in ${Thread.currentThread().name}")
    }.join()
}