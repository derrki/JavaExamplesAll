package com.oopExampls;

import static util.Print.*;

public class Cow {
    String name = "Noname";
    int age;
    double milcValue;

    public Cow (){
      println("constructor Cow()");
    }

    public Cow (String name){
        this();
        println("constructor Cow(String)");
        this.name = name;
    }


    public Cow (String name, int age){
        this("Zirca");
        println("constructor Cow(String, Int)");
        this.name = name;
        this.age = age;
    }

    Cow getThis(){
        return this;
    }

    public void changeArgsPrimitive(int arg){
        print("зміна переданого примітивного аргументу - ");
        arg = 6;
    };

    public void changeArgsReferens(Cow cow){
        print("зміна переданого ссилочного аргументу - ");
        cow.milcValue = 9.9;
    };

    public void changeArgsReferensTwo(Cow cow){
        println("переприсвоєння переданого ссилочного аргументу - ");
        cow = new Cow();
        cow.milcValue = 19.9;
    };
}
