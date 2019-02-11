package com.max

import java.io.File

fun main(args: Array<String>) {

    //write_method()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)  //比JAVA簡潔許多
    }






}

private fun write_method() {
    //File("output_kt.txt").writeText("abc123")

    File("output2.txt").bufferedWriter().use {
        it.write("1st buffered line \n") //要自己跳行
        it.write("2nd buffered line\n") //要自己跳行
        it.write("3rd buffered line\n") //要自己跳行
        //可以省掉Java的flush()與close()

    }
    /*File("output2.txt").printWriter().use {
       it.println("1st line")
       it.println("2nd line")
       it.println("3rd line") //可以省掉Java的flush()與close()
   }*/
}