package com.pr0Java.dagget.dataTypes.integerType;

import static util.Print.*;

public class IntegralTypes01 {

    public static void main(String[] args) {
        //long iLong = 2147483648 // не скомпілюється
        long iLong = 2147483648L;
        println("iLong = " + iLong);
        byte a, b;
        a = 5;
        b = 3;
        println("a = " + a + "    b = " + b);
        println("a + b = " + (a + b));
        println("a - b = " + (a - b));
        println("a * b = " + (a * b));
        println("a / b = " + (a / b));
        print("a % b = " + (a % b));
        println(" те ж саме що a-(a/b)*b = " + (a-(a/b)*b));
        println("a = " + a + "    b = " + b);
        println("a++ -> a = " + a++);
        println("a = " + a);
        println("a-- -> a = " + a--);
        println("a = " + a);
        println("a++ -> a = " + ++a);
        println("a = " + a);
        println("a-- -> a = " + --a);
        println("a = " + a);
        a+=b; // a = a + b;
        println("a+=b -> a  = " + a);
        a-=b; // a = a - b;
        println("a-=b -> a  = " + a);
        byte c = 127;
        ++c;
        ++c;
        println("Переповнення с = " + c);
    }

}
