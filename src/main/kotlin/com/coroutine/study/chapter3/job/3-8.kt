package com.coroutine.study.chapter3.job

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 3-7 과 같은 코드
fun main(args: Array<String>) = runBlocking<Unit> {
    GlobalScope.launch {
        TODO("Not implemented yet!")
    }.invokeOnCompletion { cause ->
        cause?.let {
            println("Job cancelled due to ${it.message}")
        }
    }

    delay(2000)
}

// 근데 이코드에서는 에러 내용이 출력이됨
// 구체적으로 3-6과 왜 같은지 확인 필요
