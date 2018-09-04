package com.pr0Java.dagget.dataTypes;

import static com.pr0Java.dagget.dataTypes.Print.*;

public class Main {
    public static void main(String[] args) {

        print("Hello ");
        println("world !");
        printf("Hello %s", "world !");
        println("");

        //------------------------------------------

        println("Приклад примітивних і ссилочних типів даних в ava");
        println("");
        println("Примітивні типи");

        //змінні примітивних тпів передаються по значенню

        int i = 4;
        int j = i;
        println("i = " + i + "   j = " + j);
        ++j;
        println("Після інкременту ++j");
        println("i = " + i + "   j = " + j);

        //змінні ссилочних типів даних передаються по посиланню

        println("");
        println("силочні типи");
        Dog thisDog = new Dog("Sparky");
        Dog thetDog = thisDog;
        println("thisDog = " + thisDog.getDogName() + "   thatDog = " + thetDog.getDogName());
        println("");
        thetDog.setDogName("Wolfie");
        println("Після присвоєння thetDog Wolfie");
        println("");
        println("thisDog = " + thisDog.getDogName() + "   thatDog = " + thetDog.getDogName());


    }
}
