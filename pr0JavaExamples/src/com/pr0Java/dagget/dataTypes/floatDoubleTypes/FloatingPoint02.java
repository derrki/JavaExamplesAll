package com.pr0Java.dagget.dataTypes.floatDoubleTypes;

import static util.Print.*;

public class FloatingPoint02 {
    public static void main(String[] args) {
        double d = 0.1 + 0.1 +  0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        float f = 0.1f + 0.1f +  0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;

        println("d = " + d);
        println("f = " + f);
        println("--------------");
        println("0.35 + 0.33 = " + (0.35 + 0.33));
        println("--------------");
        double d01 = 0.1;
        double d00 = 0;
        for (int i = 0; i < 10; i++){
            d00 += d01;
            println("Ітерація " + (i + 1) + " " +d00);
        }

        println("------------");
        double d1 = .1;
        double d2 = .2;
        double d3 = .3;
        println("d1 = " + d1 + " d2 = " + d2 + " d3 " + d3);
        println("Пряме порівняння");
        println("d1 + d2 = d3 " + ((d1 + d2) == d3));
        println("Перевірка на дозволену похибку -0.0001");
        println("d1 + d2 = d3 " + (Math.abs(d1 + d2 - d3) < 1E4));

        double dOne = 1.0;
        int count = 0;
        println("Приклад коли d+x=d");
        for (double dd = 0; dd <= 4.9E-323; dd = Math.nextUp(dd)){
            if((dOne + dd) == dOne){
                println("dd = " + dd);
                count++;
            }
        }
        println("В заданім відрізку є " + count + " чисел");
        println("при додаванні з якими dOne буде рівне dOne");

        double dPlus = 4.9E-324;
        println("Наприклад dPlus = " + dPlus + " dOne = " + dOne);
        println("dOne + dPlus = " + (dPlus + dOne));
        dOne = dOne + dPlus;
        println("dOne = dOne + dPlus і після цього dOne == " + dOne);




    }
}
