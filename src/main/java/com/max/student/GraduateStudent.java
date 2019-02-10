package com.max.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;


    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;

    }

    @Override
    public void print() {

            int average = getAverage();
            System.out.print(name + "\t" + english +"\t" + math + "\t" + thesis +
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
}
