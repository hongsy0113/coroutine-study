package com.coroutine.study.chapter3.job

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//fun main(args: Array<String>) = runBlocking {
//    val job = GlobalScope.launch {
//        // Do background task here
//    }
//}

fun main(args: Array<String>) = runBlocking {
    val job = Job()
}