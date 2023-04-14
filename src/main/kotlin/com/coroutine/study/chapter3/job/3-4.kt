package com.coroutine.study.chapter3.job

import kotlinx.coroutines.*

// 생성상태에 있는 잡 시작하기

// job.start()
// 실행을 일시중단하지 않으므로 애플리케이션이 job이 완료되는 것을 기다리지 않고 실행을 끝낸다.
fun main2() {
    val job = GlobalScope.launch(start = CoroutineStart.LAZY) {
        delay(5000)
    }

    job.start()
}


// job.join()
fun main() = runBlocking {
    val job = GlobalScope.launch(start = CoroutineStart.LAZY) {
        delay(5000)
    }

    job.join()
}
