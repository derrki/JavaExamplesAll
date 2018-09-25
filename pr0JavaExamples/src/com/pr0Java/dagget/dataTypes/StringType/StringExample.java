package com.pr0Java.dagget.dataTypes.StringType;
import com.pr0Java.dagget.dataTypes.Dog;

import static util.Print.*;
import static util.Sys.*;
public class StringExample {
    public static void main(String[] args) {
        println("Hello World!");
        println("Дана стрічка містить " + "Hello World!".length() + " символів");
        println("Перший символ в стрічці буква " + "Hello World!".charAt(0));
        println("Hello World!".subSequence(0,6));

        String s1 = "Hi world!!!";
        String s2 = "Hi world!!!";
        String s3 = s2;
        String s4 = new String("Hi world!!!");
        String s5 = new String("Hi world!!!");
        String s6 = s5;
        println("хеш обєкта s1 " + iHash(s1) + "  хеш стрічки  " + s1 +" = " + s1.hashCode());
        println("хеш обєкта s2 " + iHash(s2) + "  хеш стрічки  " + s2 +" = " + s2.hashCode());
        println("хеш обєкта s3 " + iHash(s3) + "  хеш стрічки  " + s3 +" = " + s3.hashCode());
        println("хеш обєкта s4 " + iHash(s4) + "  хеш стрічки  " + s4 +" = " + s4.hashCode());
        println("хеш обєкта s5 " + iHash(s5) + "  хеш стрічки  " + s5 +" = " + s5.hashCode());
        println("хеш обєкта s6 " + iHash(s6) + "  хеш стрічки  " + s6 +" = " + s6.hashCode());

        s3 = "World";
        println("\nстрічка s1 = " + s1);
        println("хеш обєкта s3 " + iHash(s3) + "  хеш стрічки  " + s3 +" = " + s3.hashCode());

        println();
        s6 = "Hi world!!!";
        println("хеш обєкта s6 " + iHash(s6) + "  хеш стрічки  " + s6 +" = " + s6.hashCode());

        println();
        s4 = s4.intern();//пошук посилання на існуючий обєкт в string pool
        println("хеш обєкта s4 " + iHash(s4) + "  хеш стрічки  " + s4 +" = " + s4.hashCode());

        println();

        println("World" + " = " + System.identityHashCode("World"));
        String s7 = "World";
        println("s7 = " + System.identityHashCode(s7));

        String s8 = new String("World").intern();
        println("s8 = " + System.identityHashCode(s8));

    }
}
