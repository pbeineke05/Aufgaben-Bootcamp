package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcher Divisor soll geprüft werden?");
        long divisor = scanner.nextLong();

        System.out.println("Bis zu welcher Zahl?");
        long userNum = scanner.nextLong();

        division(userNum, divisor);
    }

    public static long division(long max, long divisor) {
        long temp = 0L, counter = 0L;
        temp += divisor;
        while(temp <= max){
            counter++;
            temp += divisor;
        }

        return counter;
    }
}
