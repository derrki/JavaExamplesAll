package com.pr0Java.dagget.dataTypes.floatDoubleTypes;

import static util.Print.*;

public class FloatingPoint03 {
    public static void main(String[] args) {

        double dd = 3.33;
        float ff = (float) dd;
        println("dd = " +dd);
        println("ff = " + ff);
        println("ff == dd is " + (ff == dd));
        println("------------");
        dd = ff;
        println("dd = " + dd);
        println("ff = " + ff);
        println("ff == dd is " + (ff == dd));

    }
}
