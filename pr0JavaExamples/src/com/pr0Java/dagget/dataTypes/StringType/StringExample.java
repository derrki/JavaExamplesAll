package com.pr0Java.dagget.dataTypes.StringType;
import static util.Print.*;
public class StringExample {
    public static void main(String[] args) {
        println("Hello World!");
        println("Дана стрічка містить " + "Hello World!".length() + " символів");
        println("Перший символ в стрічці буква " + "Hello World!".charAt(0));
        println("Hello World!".subSequence(0,6));
    }
}
