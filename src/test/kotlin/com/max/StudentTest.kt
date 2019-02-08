package com.max.kotlin


import com.max.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest() {
        val student = Student("Hank", 60, 80)
        Assertions.assertEquals(80, student.highest())
    }

    @Test
    fun averageTest() {
        val student = Student("Hank", 60, 80)
        Assertions.assertEquals((60 + 80) / 2, student.getAverage())

    }
//回頭再來找問題點
    @Test
    fun gradingTest() {
        val stud = Student("Hank", 60, 80)
        Assertions.assertEquals('C', stud.grading())
    }
}

