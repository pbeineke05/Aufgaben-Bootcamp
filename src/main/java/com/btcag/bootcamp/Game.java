package com.btcag.bootcamp;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        int userNum = -1;

        System.out.println("Wie groß soll die Zahl in Bits sein?");

        int bitCount = scanner.nextInt(), tempBinary = 1;

        int rndNum = new Random().nextInt();
        while (bitCount-- > 0) {
            tempBinary *= 2;
        }
        while (rndNum < 0) {
            rndNum += 2 * rndNum;
        }
        while (rndNum > tempBinary) {
            rndNum = rndNum>>1;
        }

        int fails = 0;

        System.out.println("Ich habe mir eine Nummer zwischen 1 und " + tempBinary + " ausgesucht. Lasset die Spiele beginnen!");

        while(userNum != rndNum){
            userNum = scanner.nextInt();
            long temp = userNum;

            while (temp < rndNum){
                System.out.println("Versuch " + fails + ". Deine Zahl ist kleiner als meine. Versuch es erneut");
                temp = rndNum;
                fails++;
            }

            temp = userNum;

            while (temp > rndNum){
                System.out.println("Versuch " + fails + ". Deine Zahl ist größer als meine. Versuch es erneut");
                temp = rndNum;
            }
        }

        System.out.println("Du hast meine Zahl '" + rndNum + "' erraten. Herzlichen Glückwunsch!");
    }
}
