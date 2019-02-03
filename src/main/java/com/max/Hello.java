package com.max;

public class Hello {
    public static void main(String[] args) {
//       System.out.println("Hello JAVA world");
        Person p = new Person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());
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

