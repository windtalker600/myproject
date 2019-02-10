package com.max

import java.lang.Math.random
import kotlin.random.Random

data class Ticket(val origin:Int, val destination:Int, val price:Int)

fun main(args: Array<String>) {
    var ticket = Ticket(20,51,420)
    val s = "abcde"
    println(s.validate())
    println("Ticket Done")
    println((1..10).random())
}

fun String.validate() : Boolean {
    return this.length >= 6
}

fun IntRange.random(): Int {
    val r = Random(2).nextInt(endInclusive-start)+start
    return r
}
