package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {

    public static void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein:");
        long userNum = scanner.nextLong();

        System.out.println("Fibonacci Zahlen bis " + userNum + ":");

        long prevPrev = 0L;
        long prev = 1L;
        long temp = 0L;

        while(prev < userNum){
            System.out.print(prevPrev + " ");
            temp = prev;
            prev += prevPrev;
            prevPrev = temp;
        }

        System.out.print(prevPrev + " ");
    }
}
