package com.coroutine.study.chapter3.job

import kotlinx.coroutines.*

// 생성 상태
fun main() = runBlocking {
    GlobalScope.launch(start = CoroutineStart.LAZY) {
        TODO("Not Implemented yet!")
    }

    delay(5000)
}

// 작업이 생성됐지만 시작된 적이 없으므로 예외 출력되지 않는다.