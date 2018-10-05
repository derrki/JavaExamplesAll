package com.oopExampls;

import static util.Print.*;

public class Ferma {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.name = "Burca";
        cow.age = 4;

        println("Cow name = " + cow.name + ", age = " + cow.age);
        println(cow.getThis());

        Cow cow2 = new Cow("Zirka", 5);
        println("Cow2 name = " + cow2.name + ", age = " + cow2.age);
        println(cow2.getThis());

        cow2 = cow;

        System.out.println(new Cow());
        System.out.println(new Cow("Zirca"));
        System.out.println(new Cow("Zirca", 5));

    }
}
