package com.pr0Java.dagget.dataTypes.StringType;

import static util.Print.*;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder stringBuilderOne = new StringBuilder("Підстрічка");
        println("stringBuilderOne.substring(int) = " + stringBuilderOne.substring(3));
        println("stringBuilderOne.substring(int, int) = " + stringBuilderOne.substring(0, 3));

        StringBuilder stringBuilderTwo = new StringBuilder().appendCodePoint(128640);
        stringBuilderTwo.append("-----");
        stringBuilderTwo.appendCodePoint(128648);
        println("\nstringBuilderTwo = " + stringBuilderTwo.toString());
        println("stringBuilderTwo.length() = " + stringBuilderTwo.length());
        println("stringBuilderTwo.codePointCount = " + stringBuilderTwo.codePointCount(0, stringBuilderTwo.length()));

        println("codePointAt 5 = " + stringBuilderTwo.codePointAt(5));
        println("codePointBefore 6 = " + Integer.toHexString(stringBuilderTwo.codePointBefore(6)));
        println("codePointAt 5 = " + Integer.toHexString(stringBuilderTwo.codePointAt(5)));
        println("\nstringBuilderTwo.capacity() = " + stringBuilderTwo.capacity());
        stringBuilderTwo.trimToSize();
        println("after");
        println("\nstringBuilderTwo.capacity() = " + stringBuilderTwo.capacity());



    }
}
