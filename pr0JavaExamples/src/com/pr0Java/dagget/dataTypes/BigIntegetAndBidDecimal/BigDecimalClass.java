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

        //приклади заокруглення
        bd3 = new BigDecimal(0.3);
        //bd3.setScale(1); //уде помилка
        println("ROUND_CEILING bd3 = " + bd3.setScale(1, BigDecimal.ROUND_CEILING));

        // ROUND_CEILING: В більшу сторону
        println();
        println("ROUND_CEILING: В більшу сторону");
        BigDecimal bdr = new BigDecimal("0.333");
        print("bdr =  " + bdr);
        println("   ROUND_CEILING bdr =  " + bdr.setScale(2, BigDecimal.ROUND_CEILING));
        bdr = new BigDecimal("-0.333");
        print("bdr = " + bdr);
        println("   ROUND_CEILING bdr = " + bdr.setScale(2, BigDecimal.ROUND_CEILING));

        // ROUND_DOWN: В меншу сторону по модулю
        println();
        println("ROUND_DOWN: Заокруглення в меншу сторону по модулю");
        bdr = new BigDecimal("0.333");
        print("bdr =  " + bdr);
        println("   ROUND_DOWN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_DOWN));
        bdr = new BigDecimal("-0.333");
        print("bdr = " + bdr);
        println("   ROUND_DOWN bdr = " + bdr.setScale(2, BigDecimal.ROUND_DOWN));

        // ROUND_UP: В більшу сторону по модулю
        println();
        println("ROUND_UP: В більшу сторону по модулю");
        bdr = new BigDecimal("0.333");
        print("bdr =  " + bdr);
        println("   ROUND_UP bdr =  " + bdr.setScale(2, BigDecimal.ROUND_UP));
        bdr = new BigDecimal("-0.333");
        print("bdr = " + bdr);
        println("   ROUND_UP bdr = " + bdr.setScale(2, BigDecimal.ROUND_UP));

        // ROUND_FLOOR: В меншу сторону
        println();
        println("ROUND_FLOOR: В меншу сторону");
        bdr = new BigDecimal("0.333");
        print("bdr =  " + bdr);
        println("   ROUND_FLOOR bdr =  " + bdr.setScale(2, BigDecimal.ROUND_FLOOR));
        bdr = new BigDecimal("-0.333");
        print("bdr = " + bdr);
        println("   ROUND_FLOOR bdr = " + bdr.setScale(2, BigDecimal.ROUND_FLOOR));

        // ROUND_HALF_UP: Заокруглення вгору, якщо число после коми >= .5
        println();
        println("ROUND_HALF_UP: Заокруглення вгору, якщо число после коми >= .5");
        bdr = new BigDecimal("0.335");
        print("bdr =  " + bdr);
        println("   ROUND_HALF_UP bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));
        bdr = new BigDecimal("-0.335");
        print("bdr = " + bdr);
        println("   ROUND_HALF_UP bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));
        bdr = new BigDecimal("0.333");
        print("bdr =  " + bdr);
        println("   ROUND_HALF_UP bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));
        bdr = new BigDecimal("-0.333");
        print("bdr = " + bdr);
        println("   ROUND_HALF_UP bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_UP));

        // ROUND_HALF_DOWN: Заокруглення вгору, якщо число после коми > .5
        println();
        println("ROUND_HALF_DOWN: Заокруглення вгору, якщо число после коми > .5");
        bdr = new BigDecimal("0.335");
        print("bdr =  " + bdr);
        println("   ROUND_HALF_DOWN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        bdr = new BigDecimal("-0.335");
        print("bdr = " + bdr);
        println("   ROUND_HALF_DOWN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        bdr = new BigDecimal("0.336");
        print("bdr =  " + bdr);
        println("   ROUND_HALF_DOWN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));
        bdr = new BigDecimal("-0.336");
        print("bdr = " + bdr);
        println("   ROUND_HALF_DOWN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_DOWN));

        // ROUND_HALF_EVEN: Заокруглення по парності
        println();
        println("ROUND_HALF_EVEN: Заокруглення по парності");
        bdr = new BigDecimal("0.335");
        print("bdr =  " + bdr);
        println("  ROUND_HALF_EVEN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        bdr = new BigDecimal("0.325");
        print("bdr =  " + bdr);
        println("  ROUND_HALF_EVEN bdr =  " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));

        bdr = new BigDecimal("-0.335");
        print("bdr = " + bdr);
        println("  ROUND_HALF_EVEN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));
        bdr = new BigDecimal("-0.325");
        print("bdr = " + bdr);
        println("  ROUND_HALF_EVEN bdr = " + bdr.setScale(2, BigDecimal.ROUND_HALF_EVEN));
    }
}
