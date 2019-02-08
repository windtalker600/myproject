package com.max

fun main(args: Array<String>)  {
    val list = listOf(5,1,2,7)
    println(list)
    val scores = listOf(68,88,77,99,50)
    for (score in scores) {
        println(score)
    }
    //Kotlin的可讀與可寫的類別是不一樣的
    println(list.get(2))
    var mutableList = mutableListOf(5,1,2,7)
    mutableList.add(6)
    println(mutableList)
}