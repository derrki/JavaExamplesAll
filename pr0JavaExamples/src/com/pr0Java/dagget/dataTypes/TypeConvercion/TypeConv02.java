package com.pr0Java.dagget.dataTypes.TypeConvercion;

import static util.Print.*;

public class TypeConv02 {
    public static void main(String[] args) {
        double d = 123.321;
        byte b = (byte) d; // відкинули дробову частину
        println("d = " + d);
        println("b = " + b);
        println("---------------");
        d = 454.874;
        b = (byte) d; // b = -58
        println("d = " + d);
        println("b = " + b);
        println("---------------");
        println("454 % 256 = " + (454 % 256));
        print("454 в двійковому форматі = ");
        printlnInt(454);
        print("198 в двійковому форматі = ");
        printlnInt(454%256);
        b = (byte) (454 % 256);
        print("b десяткове = " + b + "  b двійкове = ");
        printlnByte(b);
        println("---------------");
        float bFloat = 10_000_000_000f;
        println("bFloat = " + bFloat);
        int bInt = (int) bFloat;
        println("bInt = " + bInt);
        bFloat = -10_000_000_000f;
        bInt = (int) bFloat;
        println("bFloat = " + bFloat);
        println("bInt = " + bInt);
        println("---------------");
        byte b2 = 50;
        //b2 = b2 *2; //не скомпілюється
        b2 *= 2;
        println("b2 = " + b2);
        println("---------------");
        int i3 = 0;
        i3 += 1_000_000_000_000L;
        println("i3 десяткове = " + i3);
        print ("i3 двійкове = ");
        printlnInt(i3);
        println("---------------");
        Byte myB;
        myB = b2;
        println("myB = " + (myB++));
        b2 = myB;
        println("b2 = " + b2);
        i3 = myB;
        println("i3 = " + i3);
    }
}
