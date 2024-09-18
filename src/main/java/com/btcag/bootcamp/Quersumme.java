package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {

    static String returnString = "Die Quersumme ist: ";

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahl eingeben (String):");
        System.out.println(stringVersion(scanner.nextLine()));

        System.out.println("Bitte Zahl eingeben (Long):");
        System.out.println(longVersion(scanner.nextLong()));
    }

    private static String stringVersion(String input){
        int i = input.length() - 1;
        int temp = 0;

        while(i >= 0){
            temp += Integer.parseInt("" + input.charAt(i));
            i--;
        }

        return returnString + temp;
    }

    private static String longVersion(Long input){
        String inputString = String.valueOf(input);
        int i = inputString.length() - 1;
        int temp = 0;

        while(i >= 0){
            temp += Integer.parseInt("" + inputString.charAt(i));
            i--;
        }

        return returnString + temp;
    }
}
