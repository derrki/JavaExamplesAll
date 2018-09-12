package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operator03ForAdv {
    public static void main(String[] args) {

        String [] name = {"Jon", "Bob", "Ron"};
        int i = 0;
        for (boolean b = (name.length > 0)? true: false; b; println("Iteration end")){
            println("\nHello " + name[i]);
            b = (name.length > ++i ? true: false);
        }
    }
}
