package com.pr0Java.dagget.dataTypes.booleanType;

import static util.Print.*;

public class BooleanTypes {
    //приклад роботи з примітивним типом boolean

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        println("a = " + a + "   b = " + b);
        println("a|b " + (a | b));
        println("a&b " + (a & b));
        println("a^b " + (a ^ b));
        println("!a = " + !a);
        println("now a = " + a +  "   b = " + b);
        println("after b|=a    b = " + (b|=a)); //b=b|a;
        println("now a = " + a +  "   b = " + b);
        println("after a^=b    a = " + (a^=b)); //a=a^b;
        println("now a = " + a +  "   b = " + b);
        println("after b&=a    b = " + (b&=a)); //b=b&a;
        println("now a = " + a +  "   b = " + b);
        println();

        int x = 5;
        int y = 3;
        int z = 5;
        println("x = " + x + "  y = " + y + "  z = " + z);
        println("x > y" + (x > y));
        println("x < y" + (x < y));
        println("x != z" + (x != z));
        println("x == z" + (x == z));
        println("x >= z" + (x >= z));
        println("y <= x" + (y <= x));
    }
}
