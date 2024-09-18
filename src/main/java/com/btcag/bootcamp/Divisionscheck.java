package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcher Divisor soll geprüft werden?");
        long divisor = scanner.nextLong();

        System.out.println("Bis zu welcher Zahl?");
        long userNum = scanner.nextLong();

        long temp = 0L;

        while(temp < userNum){
            System.out.println(temp);
            temp += divisor;
        }
    }
}
