package com.coroutine.study.chapter2

import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    val dispatcher = newSingleThreadContext(name = "ServiceCall")
    val task = GlobalScope.launch(dispatcher) {
        printCurrentThread()
    }
    task.join()
}

fun printCurrentThread() {
    println("Running in thread [${Thread.currentThread().name}]")
}

fun asyncLoadNews():Job = GlobalScope.launch(newSingleThreadContext(name = "ServiceCall")) {
    launch(Dispatchers.Main) {
        println("test")
    }
}