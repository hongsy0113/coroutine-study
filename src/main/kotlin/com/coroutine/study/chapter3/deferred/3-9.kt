package com.coroutine.study.chapter3.deferred

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

// async 로 deferred 생성하기
fun main(args: Array<String>) = runBlocking {
    val headlinesTask = GlobalScope.async {
        getHeadlines()
    }

    print(headlinesTask.await())
}

fun getHeadlines(): String {
    println("getting headlines,,,,")
    println("getting headlines,,,,")
    println("getting headlines,,,,")

    Thread.sleep(3000)

    return "오늘의 헤드라인은 oo 입니다"
}
