package com.ExtendsEx;

public class Robot {
    private int serialNumber;
    private String name = "NoNaMe";
    private String color = "red";

    Robot(){
        System.out.println("Robot()");
    }

    Robot(String name){
        this.name = name;
        System.out.println("Robot(String)");
    }

    protected int getSerialNumber() {
        return serialNumber;
    }

    protected void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object otherObject){
        //перевірка на ідентичність
        if (this == otherObject) return true;
        //повернути значення false,
        //якщо явний параметр має пусте значення null
        if(otherObject==null) return false;
        //якщо класи не співпадають то вони не рівні
        if(getClass() != otherObject.getClass()) return false;

        Robot otherRobot = (Robot) otherObject;

        return  name.equals(otherRobot.name)
                && color.equals(otherRobot.color);
    }
}
