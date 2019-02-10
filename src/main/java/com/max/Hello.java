package com.max;

//import com.max.student.Student;

import com.max.studentKT.StudentKT;

public class Hello {
    public static void main(String[] args) {
        StudentKT stu = new StudentKT("Hank",60,70);

        System.out.println("Hello JAVA world");
       String s = new String("abcdef");
//        String s = null;
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(1,4));
        Person p = new Person( "MaxLiou",66.5f,1.7f);
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score > 80 || score < 90);
        char c = 'A';
        System.out.println(c > 'a');
        /*int age = 19;
        Integer age2 =19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        float weight2 = 68.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";*/ //Reference data type
    }
}

