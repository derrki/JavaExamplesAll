package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators04ReturnMain {
    public static void main(String[] args) {
        println("Викликаємо vReturn(3)");
        Operators04ReturnMethod.vReturn(3);
        println("Викликаємо vReturn(7)");
        Operators04ReturnMethod.vReturn(7);
        println();

        println("Викликаємо strReturn(7)" + Operators04ReturnMethod.strReturn(7));
        println("Викликаємо strReturn(3)" + Operators04ReturnMethod.strReturn(3));
        println("Викликаємо strReturn(5)" + Operators04ReturnMethod.strReturn(5));
    }
}
