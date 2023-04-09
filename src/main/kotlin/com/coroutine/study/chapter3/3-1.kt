package com.coroutine.study.chapter3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val job = GlobalScope.launch {
        // Do background task here
    }
}