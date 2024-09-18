package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine Zahl für den Primtest eingeben (Long:)");
        long userNum = scanner.nextLong();
        boolean temp = false;
        long i = 2L;
        String faktorPatchworkArray = "";

        while(i < userNum){
            temp = userNum % i == 0;
            while(temp){
                temp = isNumPrime(i);
                while(temp){
                    faktorPatchworkArray += " " + i;
                    temp = false;
                }
            }
            i++;
        }

        System.out.println("Die Zahl " + userNum + " lässt sich in folgende Faktoren zerlegen:" + faktorPatchworkArray);
    }

    private static Boolean isNumPrime(Long num){
        boolean isPrime = true, temp;
        long i = 2L;

        while(i < num){
            temp = num % i == 0;
            while(temp){isPrime = false; temp = false;}
            i++;
        }

        return isPrime;
    }
}
