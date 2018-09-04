package com.pr0Java.dagget.dataTypes;

import static util.Print.*;

public class DataTypesValues {

    static boolean defBoolean;
    static char defChar;
    static byte defByte;
    static short defShort;
    static int defInt;
    static long defLong;
    static float defFloat;
    static double defDouble;
    static String defString;

    public static void printHead() {
        println("Приклади дефолтних даних типів Java та діапазонів допустимих значень з обємом використовуваної памяті");
        println();
    }

    //друк значень змінних різних типів даних присвояних за замовчуванням
    public static void defaultValues() {
        println("Дефолтні дані типів даних");
        println("boolean defBoolean = " + defBoolean);
        println("char defChar = " + defChar);
        println("byte defByte = " + defByte);
        println("short defShort = " + defShort);
        println("int defInt = " + defInt);
        println("long defLong = " + defLong);
        println("float defFloat = " + defFloat);
        println("double defDouble = " + defDouble);
        println("String defString = " + defString);
    }

    public static void sizeAndDiapasonValues(){

        println("Діапазони допустимих значень з обємом використовуваної памяті");
        println("boolead - " + "значення " + Boolean.FALSE + " та " + Boolean.TRUE);
        println("char - " + "використовує памяті процесора - " +  Character.SIZE +
                "; діапазон значень від " + Character.MIN_VALUE + " до " + Character.MAX_VALUE);
        println("byte - " + "використовує памяті процесора - " +  Byte.SIZE +
                "; діапазон значень від " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        println("short - " + "використовує памяті процесора - " +  Short.SIZE +
                "; діапазон значень від " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        println("int - " + "використовує памяті процесора - " +  Integer.SIZE +
                "; діапазон значень від " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        println("long - " + "використовує памяті процесора - " +  Long.SIZE +
                "; діапазон значень від " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        println("float - " + "використовує памяті процесора - " +  Float.SIZE +
                "; діапазон значень від " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        println("double - " + "використовує памяті процесора - " +  Double.SIZE +
                "; діапазон значень від " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
    }
}
