package com.pr0Java.dagget.dataTypes.StringType;

import static util.Print.*;

public class StringBuilderInsert {
    public static void main(String[] args) {
        StringBuilder stringBuilderOne = new StringBuilder("This is big string.");
        String string = "not ";
        stringBuilderOne.insert(8, string);
        println("stringBuilderOne - " + stringBuilderOne);
        string = null;
        stringBuilderOne.insert(stringBuilderOne.length(), " ");
        stringBuilderOne.insert(stringBuilderOne.length(), string);
        println("stringBuilderOne - " + stringBuilderOne);

        Person person = new Person();
        stringBuilderOne.insert(0, person);
        println("stringBuilderOne - " + stringBuilderOne);


    }
}
