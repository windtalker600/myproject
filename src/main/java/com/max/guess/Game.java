package com.max.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.println("Enter a nember: ");
            number = scanner.nextInt();
            if (number < secret){
                System.out.println("Guess higher");
            } else if (number > secret){
                System.out.println("guess lower");
            } else {
                System.out.println("Great! the number is "+ number);
            }
        }
       /* int i=0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);*/
    }
}
