package com.max

import com.max.studentKT.StudentKT

fun main(args: Array<String>) {

    val stu = StudentKT("Hank",80,80)
    stu.grading()
    var s:String? = "abcdef" //除非string定義有個?號
    s = null //Kotlin內定為不可為null
    println(s!!.length) //需要出現Exception
    println(s?.get(3))
    println(s?.substring(3))
//    println("Hello Kotlin World")
//    Human().hello()
    val h = Human( weight=68.5f, height=1.7f);
    println(h.bmi())
    println(h.name)
    val score = 88
    println(score > 60)
    val c:Char = 'A'
    println(c.toInt()>60)
    /*var age  = 19; //static
    age=21;
    var weight : Float = 66.5f;
    var name : String;
    name = "Hank";*/
}

class Human(var name: String ="L", var weight : Float, var height :Float){
    init{
        println("test " + weight)
        println("test again $weight")
    }
    //constructor(name:String, weight: Float, height: Float):this(weight, height)

    fun bmi():Float{
        val bmi = weight / (height*height)
        return bmi;
    }

    fun hello(){
        println("Hello Kotlin!")
    }
}