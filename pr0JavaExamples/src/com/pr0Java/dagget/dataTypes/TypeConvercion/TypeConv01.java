package com.pr0Java.dagget.dataTypes.TypeConvercion;

import static util.Print.*;

public class TypeConv01 {
    public static void main(String[] args) {

        //приклад не явного приведення типів
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        println("b = " + b + " s = " + s + " i = " + i + " l = " + l + " f = " + f + " d = " + d);
        char c = 0x401;
        i = c;
        l = c;
        f = c;
        d = c;
        println("c = " + c + " i = " + i + " l = " + l + " f = " + f + " d = " + d);
        println("\nПриведення типів з втратою точності");
        i = 0b11_1111_1111_1111_1111_1111_1111;
        f = i;
        println("i = " + i);
        println("f = " + f);
    }
}
