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
    }
}
