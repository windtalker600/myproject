package com.max.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum=0;
        for (int i = 5; i >= 1; i--) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(sum);*/
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("輸入數字:(" +i+"/4): ");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次" + number);
            if(number > secret){
                System.out.println("lower");
            }else if(number < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Right!, number is " + number);
                break;
            }
        }
        System.out.println("END");
    }
}
