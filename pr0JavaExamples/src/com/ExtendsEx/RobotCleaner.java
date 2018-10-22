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

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        //викликавши метод super.equals() перевірено чи
        //належить обєкт параметра цьому ж класу
        RobotCleaner otherCleaner = (RobotCleaner) otherObject;
        return name == otherCleaner.name;
    }
}
