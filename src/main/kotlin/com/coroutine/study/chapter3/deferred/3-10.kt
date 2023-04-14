package com.coroutine.study.chapter3.deferred

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

// 지연된 실패를 갖지만 예외를 전파하지 않음
//fun main(args: Array<String>) = runBlocking {
//    val deferred = GlobalScope.async {
//        TODO("Not implemented yet!")
//    }
//
//    // Wait for it to fail
//    delay(2000)
//}


private fun main(args: Array<String>) = runBlocking {
    val deferred = GlobalScope.async {
        TODO("Not implemented yet!")
    }

    // Let it fail
    deferred.await()
    delay(1)
}

// 예외를 전파하고 어플리케이션을 중단한다
