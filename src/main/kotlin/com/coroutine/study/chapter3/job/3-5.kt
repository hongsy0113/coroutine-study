package com.coroutine.study.chapter3.job

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 취소 중 상태
fun main(args: Array<String>) = runBlocking {
    val job = GlobalScope.launch {
        // Do some work here
        delay(9000)
    }

    delay(3000)
    job.cancel()
}
// 잡은 3초 뒤 취소된다.