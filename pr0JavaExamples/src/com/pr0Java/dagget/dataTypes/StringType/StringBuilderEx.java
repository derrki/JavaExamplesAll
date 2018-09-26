package com.pr0Java.dagget.dataTypes.StringType;

import static util.Print.*;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder stringBuilderOne = new StringBuilder();
        println("stringBuilderOne.length() = " + stringBuilderOne.length());
        println("stringBuilderOne.capacity() = " + stringBuilderOne.capacity());

        StringBuilder stringBuilderTwo = new StringBuilder(10);
        println("\nstringBuilderTwo.length() = " + stringBuilderTwo.length());
        println("stringBuilderTwo.capacity() = " + stringBuilderTwo.capacity());

        StringBuilder stringBuilderThree = new StringBuilder("Hello");
        println("\nstringBuilderThree.length() = " + stringBuilderThree.length());
        println("stringBuilderThree.capacity() = " + stringBuilderThree.capacity());

    }
}


