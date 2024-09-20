package com.btcag.bootcamp;

import java.util.Scanner;

public class Subnetting {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        long uno, dos, tres, quattro, sub, sub1 = 0, sub2 = 0, sub3 = 0, sub4 = 0;

        System.out.println("Bitte gebe das erste Oktett der IP-Adresse an:");
        uno = scanner.nextLong();

        System.out.println("Bitte gebe das zweite Oktett der IP-Adresse an:");
        dos = scanner.nextLong();

        System.out.println("Bitte gebe das dritte Oktett der IP-Adresse an:");
        tres = scanner.nextLong();

        System.out.println("Bitte gebe das vierte Oktett der IP-Adresse an:");
        quattro = scanner.nextLong();

        System.out.println("Bitte gebe die Subnetzmaske an:");
        sub = scanner.nextLong();

        long adder = 128;
        while (sub > 24) {
            sub1 += adder;
            adder /= 2;
            sub--;
        }
        adder = 128;
        while (sub > 16) {
            sub2 += adder;
            adder /= 2;
            sub--;
        }
        adder = 128;
        while (sub > 8) {
            sub3 += adder;
            adder /= 2;
            sub--;
        }
        adder = 128;
        while (sub > 0) {
            sub4 += adder;
            adder /= 2;
            sub--;
        }

        System.out.println("Die Netzwerkadresse lautet: " +
                (uno & sub4) + "." +
                (dos & sub3) + "." +
                (tres & sub2) + "." +
                (quattro & sub1));

        System.out.println("Die Broadcastadresse lautet: " +
                ((uno & sub4) | (~sub4 & 255)) + "." +
                ((dos & sub3) | (~sub3 & 255)) + "." +
                ((tres & sub2) | (~sub2 & 255)) + "." +
                ((quattro & sub1) | (~sub1 & 255)));
    }
}
