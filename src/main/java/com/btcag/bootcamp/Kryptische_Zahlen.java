package com.btcag.bootcamp;

import java.util.Scanner;

public class Kryptische_Zahlen {

    public static void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte die Zahl eingeben:");
        long userNum = scanner.nextLong();

        System.out.println("Bitte Passwort (ZAHL) eingeben:");
        long passNum = scanner.nextLong();

        System.out.println(userNum ^ passNum);
    }
}
