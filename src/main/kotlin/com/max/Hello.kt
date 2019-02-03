package com.max

fun main(args: Array<String>) {
//    println("Hello Kotlin World")
//    Human().hello()
    val h = Human();
    h.hello();
}

class Human{
    fun hello(){
        println("Hello Kotlin!")
    }
}