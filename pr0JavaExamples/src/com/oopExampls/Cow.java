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
}
