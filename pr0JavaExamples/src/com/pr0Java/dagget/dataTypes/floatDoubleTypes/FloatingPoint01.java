package com.pr0Java.dagget.dataTypes.floatDoubleTypes;

import static util.Print.*;

public class FloatingPoint01 {
    public static void main(String[] args) {
        double inf = 1.0/0.0;
        double neginf = -1.0/0.0;
        double negzero = -1.0/inf;
        double plszero = 1.0/inf;
        double Nan1 = 0.0/0.0;
        double Nan2 = 0.0*inf;

        println("inf = " + inf);
        println("negzero = " + neginf);
        println("inf == neginf is" + (inf == neginf));
        println("\nnegzero = " + negzero);
        println("plszero = " + plszero);
        println("negzero = plszero " + (negzero == plszero));
        println("\nNaN1 = " + Nan1);
        println("NaN2 = " + Nan2);
        println("NaN1 == NaN2 is " + (Nan1 == Nan2));
        println("NaN1 != NaN2 is " + (Nan1 != Nan2));

        double de = 0.125e4;
        println("\nde = " + de);
        double he = 0xFp2;
        println("he = " + he);
        double a = 5.0;
        double b = 3.0;
        println("\na = " + a + "   d = " + b);
        println("a / b = " + a/b);
        println("a % b = " + a%b);
        println("a = ((long)(a/b))*b+(a%b) = " + ((long)(a/b))*b+(a%b));
        double sqrt = Math.sqrt(a);
        println("\nКвадратний корінь з " + a + " рівний " + sqrt);
    }
}
