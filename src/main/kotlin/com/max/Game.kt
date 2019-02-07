package com.max

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10) +1;
    println(secret)
//    val scanner = Scanner(System.`in`)
    var number=0
    while(number != secret) {
        print("please guess a number: ")
//        number = scanner.nextInt()
        number = readLine()!!.toInt() //readline可能是null
        if (number < secret) {
            println("Guess higher")
        } else if (number > secret) {
            println("guess lower")
        } else {
            println("Great! the number is $number")
        }
    }
}