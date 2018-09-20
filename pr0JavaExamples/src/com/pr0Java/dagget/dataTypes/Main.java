package com.pr0Java.dagget.dataTypes;

import static util.Print.*;

public class Main {
    public static void main(String[] args) {

        //Приклад виводу "Hello world!" різними методами
        AdvancedHello.advancedHello();

        println();
        //Приклад роботи з примітивними типами даних та типами "посилання"
        WorkWithDataTypes.printHead();
        WorkWithDataTypes.workWithPrimitiveTypes();
        WorkWithDataTypes.workWithLinkTypes();

        println();
        //Приклад присвоєння значень за замовчуванням різним типам даних
        DataTypesValues.defaultValues();
        println();
        //Діапазони допустимих значень з обємом використовуваної памяті
        DataTypesValues.sizeAndDiapasonValues();

        Integer integer = new Integer(10);
        Integer.valueOf(5);
        System.out.println("\n" + integer.compareTo(8));
        System.out.println("\n" + integer.compareTo(10));
        System.out.println("\n" + integer.compareTo(50));

    }
}
