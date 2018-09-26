package com.pr0Java.dagget.dataTypes.StringType;

import java.util.Date;

import static util.Print.*;

public class StringBuilderAppendEx {
    public static void main(String[] args) {
        int i1 = 10;
        StringBuilder stringBuilderOne = new StringBuilder("String");
        stringBuilderOne.append(i1);
        println(stringBuilderOne);

        char[] ch1 = {'c', 'h', 'a', 'r'};
        stringBuilderOne.append(ch1);
        println(stringBuilderOne);

        StringBuilder stringBuilderTwo = new StringBuilder().appendCodePoint(128640);
        println("stringBuilderTwo = " + stringBuilderTwo);
        println("stringBuilderTwo.length() = " + stringBuilderTwo.length());
        println("stringBuilderTwo.capacity() = " + stringBuilderTwo.capacity());

        StringBuilder stringBuilderThree = new StringBuilder().append(new Date());
        println("stringBuilderThree = " + stringBuilderThree);

        Person person = new Person();
        StringBuilder stringBuilderFour = new StringBuilder().append(person);
        println("stringBuilderFour = " + stringBuilderFour);


    }
}
