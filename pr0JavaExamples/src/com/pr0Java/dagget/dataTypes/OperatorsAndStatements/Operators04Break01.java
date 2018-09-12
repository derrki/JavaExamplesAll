package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators04Break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5)
                break;
            println("i = " + i);
        }
    }
}
