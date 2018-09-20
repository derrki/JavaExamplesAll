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

        double d3 = 10;
        double d4 = 0.0825;
        println("d3*d4 = " + (d3 * d4));

        //обєкти краще створювати з рядка, або через valueOf()
        BigDecimal bd3 = new BigDecimal(0.3);
        println("bd3 = " + bd3);
        bd3 = new BigDecimal("0.3");
        println("bd3 = " + bd3);
        bd3 = BigDecimal.valueOf(0.3);
        println("bd3 = " + bd3);
    }
}
