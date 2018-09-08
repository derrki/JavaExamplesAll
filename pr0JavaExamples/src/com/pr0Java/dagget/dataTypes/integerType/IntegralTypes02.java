package com.pr0Java.dagget.dataTypes.integerType;

import static util.Print.*;

public class IntegralTypes02 {

    public static void main(String[] args) {
        println("Приклад побітового НЕ (~)");
        byte b1 = 0b0000_1100;
        byte b2 = (byte)~b1;
        println("b1 як десяткове = " + b1);
        println("b2 як десяткове = " + b2);
        print("b1 як двійкове = ");
        printlnByte(b1);
        print("b2 як двійкове = ");
        printlnByte(b2);
        println("\nПриклад побітового і (&)");
        b1 = 10;
        b2 = 7;
        println("b1 як десяткове = " + b1);
        println("b2 як десяткове = " + b2);
        print("b1 як двійкове = ");
        printlnByte(b1);
        print("b2 як двійкове = ");
        printlnByte(b2);
        byte b3 =(byte)(b1&b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        println("b3 як десяткове = " + b3);
        println("\nПриклад побітового або (|)");
        println("b1 як десяткове = " + b1);
        println("b2 як десяткове = " + b2);
        print("b1 як двійкове = ");
        printlnByte(b1);
        print("b2 як двійкове = ");
        printlnByte(b2);
        b3 =(byte)(b1|b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        println("b3 як десяткове = " + b3);
        println("\nПриклад побітового виключаючого або (^)");
        println("b1 як десяткове = " + b1);
        println("b2 як десяткове = " + b2);
        print("b1 як двійкове = ");
        printlnByte(b1);
        print("b2 як двійкове = ");
        printlnByte(b2);
        b3 =(byte)(b1^b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        println("b3 як десяткове = " + b3);
        println("\nПриклад побітового зсуву в (<<)");
        b1 = 7;
        b2 = 3;
        println("b1 як десяткове = " + b1);
        println("b2 зсуває на " + b2 + " позиції вліво");
        print("b1 як двійкове = ");
        printlnByte(b1);
        b3 =(byte)(b1<<b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        print("b3 як десяткове = " + b3);
        println("\nПриклад побітового зсуву в вліво (<<)");
        b1 = 7;
        b2 = 3;
        println("b1 як десяткове = " + b1);
        println("b2 зсуває на " + b2 + " позиції вліво");
        print("b1 як двійкове = ");
        printlnByte(b1);
        b3 =(byte)(b1<<b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        print("b3 як десяткове = " + b3);

        println("\nПриклад побітового зсуву в право зі знаком (>>)");
        b1 = 27;
        println("b1 як десяткове = " + b1);
        println("b2 зсуває на " + b2 + " позиції вправо");
        print("b1 як двійкове = ");
        printlnByte(b1);
        b3 =(byte)(b1>>b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        print("b3 як десяткове = " + b3);
        println();
        b1 = -50;
        b2 = 2;
        println("b1 як десяткове = " + b1);
        println("b2 зсуває на " + b2 + " позиції вправо");
        print("b1 як двійкове = ");
        printlnByte(b1);
        b3 =(byte)(b1>>b2);
        print("b3 як двійкове = ");
        printlnByte(b3);
        print("b3 як десяткове = " + b3);

    }

}
