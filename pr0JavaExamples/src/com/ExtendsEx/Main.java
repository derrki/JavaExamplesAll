package com.ExtendsEx;

public class Main {

    public static void main(String[] args) {
        Object object1 = new Robot();
        Object object2 = new Robot();
        Object object3 = object2;
        boolean result = object1.equals(object2);
        boolean result2 = object2.equals(object3);
        boolean result3 = object3.equals(object2);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(object1==object2);
        System.out.println(object2==object3);


//        Robot robot = new Robot("Robot");
//        System.out.println(robot.getName());
//
//        RobotCleaner robotCleaner = new RobotCleaner();
//        System.out.println(robotCleaner.getName());
//        robotCleaner.printName();
    }
}
