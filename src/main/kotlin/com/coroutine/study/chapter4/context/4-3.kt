package com.coroutine.study.chapter4.context

import kotlinx.coroutines.*

// 단일 스레드 컨텍스트
fun main(args: Array<String>) = runBlocking {
    val dispatcher = newSingleThreadContext("myThread")

    GlobalScope.launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.join()
}