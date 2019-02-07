package com.max.student;

import java.util.Scanner; //會自動加上 import語法

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Hank", 7, 99);
        stu.print();
        System.out.println("Highest score: " + stu.highest());
    }

    private static void userInput() {
        System.out.print("Please enter name:");
        Scanner scanner = new Scanner(System.in); //從使用者的keyboard取資料
        String name = scanner.next();
        System.out.println("Enter english score=");
        int english = scanner.nextInt();
        System.out.println("Math english score=");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("Highest score: " + stu.highest());
    }
}
