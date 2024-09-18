package com.btcag.bootcamp;

public class Arithmetische_Operationen {
    /*
    Der Unterschied besteht darin, dass bei var2 = var++ var2 auf den Ursprungswert von var gesetzt wird und var nun var += 1 ist.
    Bei var2 = ++var werden beide genannten Variablen zu var += 1.
    Siehe hier:
     */

    public static void start() {
        int var = 1;
        int var2 = var++;

        System.out.println("var++: " + var);
        System.out.println("var2++: " + var2);

        var = 1;
        var2 = ++var;

        System.out.println("++var: " + var);
        System.out.println("++var2: " + var2);
    }
}
