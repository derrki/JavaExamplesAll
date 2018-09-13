package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;
import static util.Sys.*;


public class CompareWrapper {

    public static void main(String[] args) {
        // приклад на розуміння різниці між примітивними та ссилочними типами даних
        int inta = 500;
        int intb = inta;
        println("До зміни");
        println("inta = " + inta + "  intb = " + intb);
        println("inta == intb " + (inta == intb));
        intb = 500;
        println("Після зміни");
        println("inta = " + inta + "  intb = " + intb);
        print("inta == intb " + (inta == intb));
        printLnLineLn();

        Integer intA = 500;
        Integer intB = intA;
        println("До зміни");
        println("intA = " + intA + "  intB = " + intB);
        println("intA == intA " + (intA == intB));
        intB = 500;
        println("Після зміни");
        println("intA = " + intA + "  intB = " + intB);
        print("intA == intB " + (intA == intB));
        printLnLineLn();

        intA = Integer.valueOf(500);
        intB = Integer.valueOf(500);
        println("Посля присвоєння через valueOf");
        println("intA = " + intA + "  intB = " + intB);
        print("intA == intB " + (intA == intB));
        printLnLineLn();

        intA = new Integer(5);
        intB = new Integer(5);
        println("Після присвоєння через new");
        println("intA = " + intA + "  intB = " + intB);
        print("intA == intB " + (intA == intB));
        printLnLineLn();

        print("Порівняння через equals() intA і intB дає " + intA.equals(intB));

        printLnLineLn();
        intA = 5;
        intB = 5;
        println("intA = " + intA + " hash = " + iHash(intA));
        println("intB = " + intB + " hash = " + iHash(intB));
        intA = 500;
        intB = 500;
        println("intA = " + intA + " hash = " + iHash(intA));
        println("intB = " + intB + " hash = " + iHash(intB));
        intA = 5;
        intB = 5;
        println("intA = " + intA + " hash = " + iHash(intA));
        println("intB = " + intB + " hash = " + iHash(intB));
        intA = 500;
        intB = 500;
        println("intA = " + intA + " hash = " + iHash(intA));
        println("intB = " + intB + " hash = " + iHash(intB));

    }

}
