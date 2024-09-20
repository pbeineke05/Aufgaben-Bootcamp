package com.btcag.bootcamp;

import java.util.Scanner;

public class Supermarkt {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte alle gekauften Produkte in Cent eingeben und mit 0 die Liste beenden:");
        long price = 0, temp = scanner.nextLong(), priceCounter;

        while(temp > 0){
            price += temp;
            temp = scanner.nextLong();
        }

        long priceInEuro = price / 100, priceInCent = price % 100;

        System.out.println("Die Summe aller gekauften Produkte beträgt " + priceInEuro + "€ und " + priceInCent + "Cent.");
        System.out.println();
        System.out.println("Wie viel Geld hat der Kunde gezahlt (in Cent)?");

        price = scanner.nextLong() - price;
        priceInEuro = price / 100;
        priceInCent = price % 100;

        System.out.println("Bitte folgendes Geld zurückgeben: " + priceInEuro + "€ " + priceInCent + "Cent.");

        priceCounter = Divisionscheck.division(price, 20000);
        price -= 20000 * priceCounter;
        System.out.println(priceCounter + " x 200€");
        priceCounter = Divisionscheck.division(price, 10000);
        price -= 10000 * priceCounter;
        System.out.println(priceCounter + " x 100€");
        priceCounter = Divisionscheck.division(price, 5000);
        price -= 5000 * priceCounter;
        System.out.println(priceCounter + " x 50€");
        priceCounter = Divisionscheck.division(price, 2000);
        price -= 2000 * priceCounter;
        System.out.println(priceCounter + " x 20€");
        priceCounter = Divisionscheck.division(price, 1000);
        price -= 1000 * priceCounter;
        System.out.println(priceCounter + " x 10€");
        priceCounter = Divisionscheck.division(price, 500);
        price -= 500 * priceCounter;
        System.out.println(priceCounter + " x 5€");
        priceCounter = Divisionscheck.division(price, 200);
        price -= 200 * priceCounter;
        System.out.println(priceCounter + " x 2€");
        priceCounter = Divisionscheck.division(price, 100);
        price -= 100 * priceCounter;
        System.out.println(priceCounter + " x 1€");
        priceCounter = Divisionscheck.division(price, 50);
        price -= 50 * priceCounter;
        System.out.println(priceCounter + " x 50 Cent");
        priceCounter = Divisionscheck.division(price, 20);
        price -= 20 * priceCounter;
        System.out.println(priceCounter + " x 20 Cent");
        priceCounter = Divisionscheck.division(price, 10);
        price -= 10 * priceCounter;
        System.out.println(priceCounter + " x 10 Cent");
        priceCounter = Divisionscheck.division(price, 5);
        price -= 5 * priceCounter;
        System.out.println(priceCounter + " x 5 Cent");
        priceCounter = Divisionscheck.division(price, 2);
        price -= 2 * priceCounter;
        System.out.println(priceCounter + " x 2 Cent");
        priceCounter = Divisionscheck.division(price, 1);
        System.out.println(priceCounter + " x 1 Cent");
    }
}
