package com.btcag.bootcamp;

import java.util.Scanner;

public class Alles_Gross {

    public static void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte String eingeben:");
        String userInput = scanner.nextLine(), result = "";

        long charASCII = 0L, temp = 0L;
        int i = -1;
        boolean allowed;

        while(i++ < userInput.length() - 1){
            charASCII = userInput.charAt(i);
            temp = charASCII;
            allowed = false;
            while(temp > 96){
                while(temp < 123){
                    allowed = true;
                    temp = 123L;
                }
                temp = 0L;
            }
            while(allowed){
                charASCII -= 32;
                allowed = false;
            }
            result += (char) charASCII;
        }

        System.out.println(result);
    }
}
