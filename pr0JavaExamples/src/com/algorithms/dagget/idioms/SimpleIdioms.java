package com.algorithms.dagget.idioms;

import static util.Print.*;

public class SimpleIdioms {

    public static int a = 5;
    public static int b = 3;

    public static void main(String[] args) {

        println("Перестановка значень");
        println("до перестановки :");
        println("a = " + a + "   b = " + b);
        println("після перестановки :");
        resettingValues01(a, b);
        resettingValues02(a, b);
        resettingValues03(a, b);
    }

    public static void resettingValues01(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        print("a = " + a);
        println("  b = " + b);
    }

    public static void resettingValues02(int a, int b){
        a = a + b; //8
        b = a - b; //5
        a = a - b; //3
        print("a = " + a);
        println("  b = " + b);
    }

    public static void resettingValues03(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        print("a = " + a);
        println("  b = " + b);
    }
}
