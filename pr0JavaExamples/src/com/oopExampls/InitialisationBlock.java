package com.oopExampls;

import static util.Print.*;

public class InitialisationBlock {
    String str1, str2, str5;
    String str3 = "Hello world!";

    static String str4, str6;

    {
        println("В ініціалізаційному блоці");
        str1 = "Hello";
    }

     static {
        println("В статичному ініціалізаційному блоці 1");
        str4 = "STATIC1";
    }

    static {
        println("В статичному ініціалізаційному блоці 2");
        str6 = "STATIC2";
    }

    InitialisationBlock(){
        println("В конструкторі по замовчуванню");
        str2 = "constructor";
    }
}
