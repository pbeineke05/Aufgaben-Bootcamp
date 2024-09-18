package com.btcag.bootcamp;

import java.util.Scanner;

public class Prime_Is_Not_A_Crime {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine Zahl für den Primtest eingeben (Long:)");
        long userNum = scanner.nextLong();
        boolean isPrime = true, temp = false;
        long i = 2L;

        while(i < userNum){
            temp = userNum % i == 0;
            while(temp){isPrime = false; temp = false;}
            i++;
        }

        System.out.println("Ergebnis: " + isPrime);
    }
}
