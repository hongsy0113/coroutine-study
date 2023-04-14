package com.coroutine.study.chapter3.job

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

fun main(args: Array<String>) = runBlocking {
    val exceptionHandler = CoroutineExceptionHandler {
            _: CoroutineContext, throwable: Throwable ->
        println("Job cancelled due to ${throwable.message}")
    }

    GlobalScope.launch(exceptionHandler) {
        TODO("Not implemented yet!")
    }

    delay(2000)

}
// delay 안 걸면 그냥 에러 메시지 출력전에 어플리케이션이 종료된다
