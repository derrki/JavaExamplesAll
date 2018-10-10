package com.oopExampls;

import static util.Print.*;

public class InitializationEx {
    public static void main(String[] args) {
        println("В методі main()");
        println("InitialisationBlock.str4 = " + InitialisationBlock.str4);
        println("InitialisationBlock.str6 = " + InitialisationBlock.str6);

        InitialisationBlock initialisationBlock = new InitialisationBlock();
        println("initialisationBlock.str1 = " + initialisationBlock.str1);
        println("initialisationBlock.str2 = " + initialisationBlock.str2);
        println("initialisationBlock.str5 = " + initialisationBlock.str5);
    }
}
