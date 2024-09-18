package com.btcag.bootcamp;

import java.util.Scanner;

public class Ex1 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nenne mir deine Zahl im Dezimalsystem. Ich rechne sie dann in das Binärsystem um.");

        long userNum = scanner.nextLong();

        StringBuilder returnBinary = new StringBuilder();

        while(userNum != 0){
            returnBinary.append(userNum%2);
            userNum /= 2;
        }

        System.out.println("Deine Zahl im Binärsystem lautet '" + returnBinary.reverse() + "'.");
    }
}
