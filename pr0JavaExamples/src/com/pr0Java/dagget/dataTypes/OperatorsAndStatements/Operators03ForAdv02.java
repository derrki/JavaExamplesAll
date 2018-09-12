package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators03ForAdv02 {

    static int i;

    public static void initTest(){
        println("initialisation i = " + i);
    }

    public static boolean condTest() {
        println("i = " + i + " bicous i < 4 this " + (i < 4 ? true : false ));
        return i < 4 ? true : false;
    }

    public static void recTest(){
        println("Повторення. До збільшення i = " + i++);
        println("Повторення. Після збільшення i = " + i);
    }

    public static void main(String[] args) {
        for (initTest(); condTest(); recTest()){
            println("Body loop");
        }
    }
}
