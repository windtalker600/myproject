package com.max;

public class Person {
    String name;
    float weight;
    float height;//屬性 property
    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello World! JAVA");
    }
}
