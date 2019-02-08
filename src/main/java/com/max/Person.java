package com.max;

public class Person {
    String name;
    float weight;
    float height;//屬性 property

    public Person(float weight, float height){
    this.weight = weight;
    this.height = height;
    }
    public Person(String name,float weight, float height ){
        this(weight, height); //沿用上一段定義
        this.name = name;
//        this.weight = weight;
//        this.height = height;

    }
    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello World! JAVA");
    }
}
