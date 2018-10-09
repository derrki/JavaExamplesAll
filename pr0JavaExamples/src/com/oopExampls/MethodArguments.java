package com.oopExampls;

import static util.Print.*;

public class MethodArguments {
    public static void main(String[] args) {

        int arg = 10;
        Cow cow = new Cow();
        cow.changeArgsPrimitive(arg);
        print(arg);

        println("\n" + cow.milcValue);
        cow.changeArgsReferens(cow);
        println(cow.milcValue);

        println("\n" + cow.milcValue);
        cow.changeArgsReferensTwo(cow);
        println(cow.milcValue);



    }
}
