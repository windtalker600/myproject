package com.max.student

import java.util.*

fun main(args: Array<String>) {
//    userInout()
    val stu = Student("Jack_KT", 60, 99)
    stu.print();
    val test =123
    println("There is : $test")
    println("Highest score: ${stu.highest()}" )
    println("Highest score: " + stu.highest())
    }

class Student(var name:String?, var english:Int, var math:Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        /*print(name +"\t"+english +"\t" +math+"\t"+getAverage() + "\t" + passOrFailed())
        println("\t" + grading())*/
    }
    fun passOrFailed() = if(getAverage()>=60) "PASS" else "failed"
    fun grading() = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
          }
    fun getAverage() = (english+math)/2;

    fun highest()  = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        };
//    if (english > math) {
//        max = english;
//    } else {
//        max = math;
//    }

    fun nameCheck()= name?.length

}



private fun userInput() {
    val scanner = Scanner(System.`in`)
    println("Enter name:")
    var name = null
//    var name = scanner.next()
    print("Enter englih's score=")
    var english = scanner.nextInt()
    print("Enter math's score=")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print();
    stu.nameCheck();
}

