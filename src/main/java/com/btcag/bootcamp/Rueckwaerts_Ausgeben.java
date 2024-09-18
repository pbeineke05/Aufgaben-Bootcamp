package com.btcag.bootcamp;

import java.util.Scanner;

public class Rueckwaerts_Ausgeben {
    /*
    Durch die Eingabe der Zahl "01234" als Typ Long wird die 0 zu Beginn automatisch entfernt, da sie für eine Speicherung als
    Zahl irrelevant ist. Auch nach der Umwandlung in einen String wird diese 0 also nicht wieder auftauchen und in der Ausgabe
    fehlen.
     */

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte Zahl eingeben (String):");
        System.out.println(stringVersion(scanner.nextLine()));

        System.out.println("Bitte Zahl eingeben (Long):");
        System.out.println(longVersion(scanner.nextLong()));
    }

    private static String stringVersion(String input){
        int i = input.length();
        String returnString = "";

        while(i != 0){
            returnString += input.charAt(i);
            i--;
        }

        return returnString;
    }

    private static String longVersion(Long input){
        String inputString = String.valueOf(input);
        int i = inputString.length();
        String returnString = "";

        while(i != 0){
            returnString += inputString.charAt(i);
            i--;
        }

        return returnString;
    }
}
