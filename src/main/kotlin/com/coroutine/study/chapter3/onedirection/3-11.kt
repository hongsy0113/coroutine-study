package com.coroutine.study.chapter3.onedirection

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) = runBlocking {
    val time = measureTimeMillis {
        val job = GlobalScope.launch {
            delay(2000)
        }
        // Wait for it to complete once
        job.join()

        // Restart the job
        job.start()
        job.join()
    }

    println("Took $time ms")
}

// 약 2000ms 가 출력된다
// job이 다시 start되어 4000ms가 출력될 것 같지만 그렇지 않다
// Job은 완료됨 상태에 도달했으므로 start()를 호출해도 아무런 변화가 없다