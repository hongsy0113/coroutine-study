package com.coroutine.study.chapter3.job

import kotlinx.coroutines.*

@OptIn(InternalCoroutinesApi::class)
fun main(args: Array<String>) = runBlocking {
    val job = GlobalScope.launch {
        // Do some work here
        delay(5000)
    }

    delay(2000)
    // cancel with a cause
    job.cancel(cause = CancellationException("Timeout!"))

    val cancellation = job.getCancellationException()
    println(cancellation.message)
}
// 2초뒤에 잡이 취소되고
// 취소 원인인 exception의 message가 출력됨