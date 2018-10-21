package com.ExtendsEx;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotCleaner robotCleaner = new RobotCleaner();
        robotCleaner.setName("rc");
        System.out.println(robot.getName());
        System.out.println(robotCleaner.getName());
    }
}
