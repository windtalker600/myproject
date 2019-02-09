package com.max.student;

public class Student {
    String id; //initial value =null
    String name;
    int english; //initial value=0;
    int math;
    static int pass = 60;
    public Student(){
        super();
    }

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){

//        int max = (english > math) ? english : math;
//        if (english > math){
//            max=english;
//        } else {
//            max=math;
//        }
       return (english > math) ? english : math;
//        return max;
    }

    public void print(){
        int average = getAverage();
        System.out.print(name + "\t" + english +"\t" + math +
                "\t" + getAverage()+ "\t" + ((getAverage()>=pass) ? "PASS" : "Failed"));
        char grading = 'F';
        switch (average/10){ //小數點後會去除
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        /*if (average >=90 && average <=100) {
            grading = 'A';
        }else if (average>=80 && average<=89){
            grading= 'B';
        }else if (average>=70 && average<=79) {
            grading = 'C';
        }else if (average>=60 && average<=69) {
            grading = 'D';
        }*/
        System.out.println("\tgrading is:" + grading);
        /*if (getAverage()>=60){
            System.out.println("\tPASS");
        }else{
            System.out.println("\tFailed");
        }*/
    }
//    public Student(String name  , int english, int math) {
//        this.name = name;//把區域變數放到屬性身上
//        this.english = english;
//        this.math = math;
//    }
    public int getAverage(){
        return (english+math)/2;
    }
}
