package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators04Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) continue;
            println("Число " + i + " ціле");
        }


        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    println();
                    continue outer;
                }
                print("*");
            }
        }
    }
}
