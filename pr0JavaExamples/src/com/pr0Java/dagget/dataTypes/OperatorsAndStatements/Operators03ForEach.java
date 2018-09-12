package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators03ForEach {
    public static void main(String[] args) {
        int[] data = {2, 8, 15, 45, 150};
        int i = 0, sum = 0;
        for (int d: data) {
            println("data [" + i +"] = " + d);
            sum+=d;
        }
        println("sum = " + sum);
    }
}
