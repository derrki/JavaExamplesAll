package com.pr0Java.dagget.dataTypes.BigIntegetAndBidDecimal;

import java.math.BigDecimal;

import static util.Print.*;

public class BigDecimalClass {
    public static void main(String[] args) {
        //проблема з точністю в double
        double d1 = 2;
        double d2 = 1.1;
        println("d1 = " + d1 + "  d2 = " + d2);
        println("d1-d2 = " + (d1 - d2));

        //вирішення проблеми з точністю в BigDecimal
        BigDecimal bd1 = BigDecimal.valueOf(2);
        BigDecimal bd2 = BigDecimal.valueOf(1.1);
        println("bd1 = " + bd1 + "  bd2 = " + bd2);
        println("bd1-bd2 = " + (bd1.subtract(bd2)));
    }
}
