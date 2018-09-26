package com.pr0Java.dagget.dataTypes.StringType;

import static util.Print.*;

public class StringBuilderDeleteEx {
    public static void main(String[] args) {

        StringBuilder stringBuilderOne = new StringBuilder();
        stringBuilderOne.append("Hello !!!");
        Person person = new Person();
        stringBuilderOne.insert(0, person);
        stringBuilderOne.insert(4, "_");
        println("stringBuilderOne - " + stringBuilderOne);
        stringBuilderOne.delete(0, 4);
        println(stringBuilderOne);
        stringBuilderOne.deleteCharAt(0);
        println(stringBuilderOne);
    }
}
