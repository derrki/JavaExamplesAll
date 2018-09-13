package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;

public class IntegerWrapper {
    public static void main(String[] args) {
        println(Byte.MAX_VALUE);
        println(Integer.MAX_VALUE);

        String sNum = "55";
        int a = Integer.parseInt(sNum);
        println("a = " + a);
        print(a + " binary format: ");
        printInt(a);
        println("\nbitCount in a is: " + Integer.bitCount(a));
    }
}
