package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators03For {
    public static void main(String[] args) {

        String [] name = {"Jon", "Bob", "Ron"};
        int i;
        for (i = 0; i < name.length ; i++) {
            println("Now i = " + i);
            println("Hello " + name[i]);
        }
        println("Now i = " + i);
        println();


        int a, b;
        for (a = 1, b = 4; a < b; a++, b--){
            println("Start iteration");
            println("a = " + a);
            println("b = " + b);
            println("end iteration");
        }
    }
}
