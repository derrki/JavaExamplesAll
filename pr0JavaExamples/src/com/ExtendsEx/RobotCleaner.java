package com.ExtendsEx;

public class RobotCleaner extends Robot {

    String name = "Cleener";

    RobotCleaner(){
        this("CleenreParam");
    }

    RobotCleaner(String name) {
        super(name);
    }

    void printName(){
        System.out.println(name);
        System.out.println(super.getName());
    }
}
