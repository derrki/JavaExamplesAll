package com.pr0Java.dagget.dataTypes.StringType;

import java.util.Arrays;

import static util.Print.*;

public class RegularExpressionsEx {
    public static void main(String[] args) {
        String expression = "This is Java - expression";
        String[] expr = expression.split("\\s");
        print(Arrays.toString(expr));

        String stringNumber = "Number 25, is 5+20, or 15and10";
        println(stringNumber);
        println("replaceAll -> "
                + stringNumber.replaceAll("(-|\\+)?\\d+", "NUMBER"));
        println("replaceFirst -> "
                + stringNumber.replaceFirst("(-|\\+)?\\d+", "NUMBER"));
    }
}
