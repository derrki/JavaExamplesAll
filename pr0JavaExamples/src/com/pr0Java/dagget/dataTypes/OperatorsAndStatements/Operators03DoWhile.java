package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators03DoWhile {
    public static void main(String[] args) {
        int i = 10;
        do {
            println("-> " + i);
        }while (--i > 0);
    }
}
