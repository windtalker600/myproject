package com.max.studentKT

import java.util.*

fun main(args: Array<String>) {
//    userInout()
    StudentKT.pass = 50
    val stu = StudentKT("Jack_KT", 60, 99)
    val stu1 = StudentKT("Jane_KT", 45, 68)
    val stu2 = StudentKT("Jamie_K", 30, 52)
    val gstu = GraduateStudentKT("Kimmer",55,65,60)
    gstu.print();
    stu.print();
    stu1.print();
    stu2.print();
    val test =123
    println("There is : $test")
    println("Highest score: ${stu.highest()}" )
    println("Highest score: " + stu.highest())
    }

class GraduateStudentKT(name: String?,english: Int,math: Int, var thesis: Int) : StudentKT(name, english, math){
    companion object {
        var pass = 70
    }

    override fun print() {

        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override  fun passOrFailed() = if(getAverage()>= pass) "PASS" else "failed"
    }


open class StudentKT(var name:String?, var english:Int, var math:Int){
    companion object {
        var pass = 60
        fun test(){
            println("testing")
        }

    }


open    fun print(){

        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
        /*print(name +"\t"+english +"\t" +math+"\t"+getAverage() + "\t" + passOrFailed())
        println("\t" + grading())*/
    }
open    fun passOrFailed() = if(getAverage()>= pass) "PASS" else "failed"
internal    fun grading() = when(getAverage()) {
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

    val stu = StudentKT(name, english, math)
    stu.print();
    stu.nameCheck();
}

