package com.coroutine.study.chapter4.extracontext

import kotlinx.coroutines.*

// 컨텍스트 조합
fun main(args: Array<String>) = runBlocking {
    val dispatcher = newSingleThreadContext("myDispatcher")
    val handler = CoroutineExceptionHandler({ _, throwable ->
        println("Error Captured")
        println("Messaged: ${throwable.message}")
    })

    GlobalScope.launch(dispatcher + handler) {
        println("Running in ${Thread.currentThread().name}")
        TODO("Not implemented!")
    }.join()

}