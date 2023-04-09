package com.coroutine.study

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudyApplication

//fun main(args: Array<String>) {
////	runApplication<StudyApplication>(*args)
//}

fun main(args: Array<String>) = runBlocking {
    val task = launch {
        printCurrentThread()
    }
    task.join()
}

fun printCurrentThread() {
    println("Running in thread [${Thread.currentThread().name}]")
}