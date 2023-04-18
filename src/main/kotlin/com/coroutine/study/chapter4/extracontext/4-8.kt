package com.coroutine.study.chapter4.extracontext

import kotlinx.coroutines.*

// 컨텍스트 분리
fun main(args: Array<String>) = runBlocking {
    val dispatcher = newSingleThreadContext("myDispatcher")
    val handler = CoroutineExceptionHandler({_, throwable ->
        println("Error Captured")
        println("Message: ${throwable.message}")
    })

    // 두 컨텍스트를 결합
    val context = dispatcher + handler

    // 컨텍스트에서 하나의 요소 제거
    val tmpCtx = context.minusKey(dispatcher.key)

    GlobalScope.launch(tmpCtx) {
        println("Running in ${Thread.currentThread().name}")
        TODO("Not implemented!")
    }.join()

}