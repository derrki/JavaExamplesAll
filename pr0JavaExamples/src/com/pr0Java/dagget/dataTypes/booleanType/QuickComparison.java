package com.pr0Java.dagget.dataTypes.booleanType;

import static util.Print.*;

public class QuickComparison {

    static boolean compare1(int val) {
        print("compare1 ( " + val + " ) ");
        println("зезультат = " + (val < 7) + " тому що " + val + " < 7 це " + (val<7));
        return val < 7;
    }

    static boolean compare2(int val) {
        print("compare2 ( " + val + " ) ");
        println("зезультат = " + (val > 7) + " тому що " + val + " > 7 це " + (val<7));
        return val > 7;
    }

    public static void main(String[] args) {
        println("\n відносне І &&");
        boolean a = compare1(5) && compare2(3);
        println("a = " + a);
        println();
        a = compare1(9) && compare2(9);
        println("a = " + a);
        println();
        println("\n відносне або ||");
        a = compare1(9) || compare2(3);
        println("a = " + a);
        println();
        a = compare1(3) && compare2(9);
        println("a = " + a);
        println();
    }
}
