package com.max

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    Thread({
        for (i in 1..10){
            println("Thread: ${i}")
            Thread.sleep(50)
        }
    }).start()

    thread {
        for (i in 1..10){
            println("thread() ${i}")
            Thread.sleep(50)
        }
    }
    //做完開IE找kotlin coroutines gradle, 找到Gradle的新增1.1.1.....,複製下來
    //貼到左邊的build.gradle中的dependencies{內}
    //下面新增的GlobalScope別選到JAVA那個, 要選擇coroutines
    GlobalScope.launch {
        for (i in 1..10) {
            println("Coroutines:  ${i}")
            delay(50L) //L表示Long值
        }
    }
}