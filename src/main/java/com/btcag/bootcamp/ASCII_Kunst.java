package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst {

    static Scanner scanner = new Scanner(System.in);
    static Long userNum = 0L;

    public static void rechteck(){
        System.out.println("Groesse des Rechtecks:");
        userNum = scanner.nextLong();

        Long generalCounter = 1L;
        Long lineCounter;

        while(generalCounter <= userNum){
            lineCounter = 0L;
            while(lineCounter < userNum){
                System.out.print("*");
                lineCounter++;
            }
            System.out.println();
            generalCounter++;
        }
    }

    public static void dreieck(){
        System.out.println("Groesse des Dreiecks:");
        userNum = scanner.nextLong();

        Long generalCounter = 1L;
        Long lineCounter;

        while(generalCounter <= userNum){
            lineCounter = 0L;
            while(lineCounter < generalCounter){
                System.out.print("*");
                lineCounter++;
            }
            System.out.println();
            generalCounter++;
        }
    }

    public static void sanduhr(){
        System.out.println("Groesse einer Sanduhrhälfte:");
        userNum = scanner.nextLong();

        long generalCounter = 1L;
        long lineCounter;

        while(generalCounter <= userNum){
            lineCounter = userNum + 1;
            while(lineCounter > generalCounter){
                System.out.print("*");
                lineCounter--;
            }
            System.out.println();
            generalCounter++;
        }

        generalCounter = 1L;
        System.out.println();

        while(generalCounter <= userNum){
            lineCounter = 0L;
            while(lineCounter < generalCounter){
                System.out.print("*");
                lineCounter++;
            }
            System.out.println();
            generalCounter++;
        }
    }
}
