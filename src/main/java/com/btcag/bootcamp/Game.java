package com.btcag.bootcamp;

import java.util.Scanner;

public class Game {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        int userNum = -1;

        System.out.println("Nenne die untere Schranke");

        int min = scanner.nextInt();

        System.out.println("Nenne die obere Schranke");

        int max = scanner.nextInt();

        int rndNum = min + (int)(Math.random() * ((max - min) + 1));

        System.out.println("Ich habe mir eine Nummer ausgesucht. Lasset die Spiele beginnen!");

        while(userNum != rndNum){
            userNum = scanner.nextInt();

            if(userNum < rndNum){
                System.out.println("Deine Zahl ist kleiner als meine. Versuch es erneut");
            } else if (userNum > rndNum){
                System.out.println("Deine Zahl ist größer als meine. Versuch es erneut");
            }
        }

        System.out.println("Du hast meine Zahl '" + rndNum + "' erraten. Herzlichen Glückwunsch!");
    }
}
