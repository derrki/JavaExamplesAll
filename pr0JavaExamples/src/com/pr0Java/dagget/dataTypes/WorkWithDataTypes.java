package com.pr0Java.dagget.dataTypes;

import static util.Print.*;

public class WorkWithDataTypes {

    public static void printHead() {
        println("Приклад примітивних і ссилочних типів даних в Java");
        println();
        println("Примітивні типи");
    }

    //змінні примітивних тпів передаються по значенню

    public static void workWithPrimitiveTypes() {
        int i = 4;
        int j = i;
        println("i = " + i + "   j = " + j);
        ++j;
        println("Після інкременту ++j");
        println("i = " + i + "   j = " + j);
    }
    //змінні ссилочних типів даних передаються по посиланню

    public static void workWithLinkTypes() {
        println();
        println("силочні типи");
        Dog thisDog = new Dog("Sparky");
        Dog thetDog = thisDog;
        println("thisDog = " + thisDog.getDogName() + "   thatDog = " + thetDog.getDogName());
        println("thisDog = " + thisDog + "   thatDog = " + thetDog);
        println();
        thetDog.setDogName("Wolfie");
        println("Після присвоєння thetDog Wolfie");
        println();
        println("thisDog = " + thisDog.getDogName() + "   thatDog = " + thetDog.getDogName());
        println("thisDog = " + thisDog + "   thatDog = " + thetDog);
    }

}
