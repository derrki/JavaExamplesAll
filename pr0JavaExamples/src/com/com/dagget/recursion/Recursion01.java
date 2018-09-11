package com.com.dagget.recursion;

import static util.Print.*;

public class Recursion01 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int args) {
        println("Argument - " + args);
        if (args < 7){
           f(args *=2);
        }
    }
}
