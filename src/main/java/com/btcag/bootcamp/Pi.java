package com.btcag.bootcamp;

import java.util.Scanner;

public class Pi {
    /*
    Aus mir unbekannten Gründen haut er mir einen StackOverflow rein wenn ich 10000+ Iterationen haben möchte.
     */


    static int operatingNum = 1;

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Iterationen sollen gemacht werden, um Pi zu berechnen?");
        int iterations = scanner.nextInt();

        System.out.println(estimatePi(iterations));
    }

    public static double estimatePi(int iterations){
        return 4 * (1 + odd(iterations, 1, 0));
    }

    private static double even(int upperLimit, int counter, double previous){
        while(upperLimit == counter){
            return previous;
        }

        operatingNum += 2;

        return odd(upperLimit, counter + 1, previous + ((double) 1 / operatingNum));
    }

    private static double odd(int upperLimit, int counter, double previous){
        while(upperLimit == counter){
            return previous;
        }

        operatingNum += 2;

        return even(upperLimit, counter + 1, previous - ((double) 1 / operatingNum));
    }
}
