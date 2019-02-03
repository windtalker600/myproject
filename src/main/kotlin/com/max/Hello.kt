package com.max

fun main(args: Array<String>) {
//    println("Hello Kotlin World")
//    Human().hello()
    val h = Human();
    h.hello();
    var age  = 19; //static
    age=21;
    var weight : Float = 66.5f;
    var name : String;
    name = "Hank";



}

class Human{
    fun hello(){
        println("Hello Kotlin!")
    }
}