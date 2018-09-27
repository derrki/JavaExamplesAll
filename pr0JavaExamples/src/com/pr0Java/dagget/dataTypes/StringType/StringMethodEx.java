package com.pr0Java.dagget.dataTypes.StringType;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import static util.Print.*;

public class StringMethodEx {
    public static void main(String[] args) {
        char[] chr = new char[10];
        byte[] bte = new byte[10];

        String stк0 = null;
        String str1 = "";
        String str2 = "abc";
        String str3 = "Привіт !";
        String str4 = "Це стрічка";
        String str5 = "Україна";
        String str6 = "стрічки";
        String str7 = " пробіли навкруги ";

        println("str1 is empty? " + str1.isEmpty());
        println("str2 is empty? " + str2.isEmpty());

        println("символ 6 в str3 = " + str3.charAt(6));

        println("str4.length() = " + str4.length());
        str4.getChars(4, 10, chr, 2);
        println("chr = " + Arrays.toString(chr));

        bte = str2.getBytes();
        println("bte (str2) = " + Arrays.toString(bte));

        try {
            bte = str5.getBytes("Cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        println("bte (str5) = " + Arrays.toString(bte));

        boolean b = str4.regionMatches(4, str6, 0, 5);
        println("пошук str6  в str4 " + b);

        b = str4.startsWith("Це");
        println("str4 починається на чк" + b);
        b = str4.startsWith("чк", 7);
        println("str4 в позиції 7 починається з чк " + b);

        b = str4.endsWith("чка");
        println("str4 закінчується на чка " + b);


        println(String.join("-", "Java", "это", "круто!"));

        println("str6.toUpperCase() " + str6.toUpperCase());
        println("str3.toLowerCase() " + str3.toLowerCase());

        println("-" + str7.trim() + "-");

    }
}
