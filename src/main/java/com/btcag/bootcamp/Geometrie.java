package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrie {
    static Scanner scanner = new Scanner(System.in);

    public static void kreis(){
        System.out.println("Gib den Radius deines Kreises ein (>0):");
        Long radius = scanner.nextLong();

        System.out.println("Die Fläche deines Kreises beträgt: " + Math.PI * (radius ^ 2));
        //Falls Math.PI illegal ist hier auch nochmal legal:
        //System.out.println("Die Fläche deines Kreises beträgt: " + Pi.estimatePi(1000) * (radius ^ 2));
    }

    public static void rechteck(){
        System.out.println("Gib die Länge deines Kreises ein (>0):");
        Long length = scanner.nextLong();

        System.out.println("Gib die Breite deines Kreises ein (>0):");
        Long width = scanner.nextLong();

        System.out.println("Die Fläche deines Rechtecks beträgt: " + length * width);
    }
}
