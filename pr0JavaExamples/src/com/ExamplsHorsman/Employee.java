package com.ExamplsHorsman;

import java.time.*;
import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent/100;
        this.salary += raise;
    }

    public boolean equals(Object otherObject){
        //перевіряємо обєкти на ідентичність
        if (this == otherObject) return true;

        //якщо явний параметр має порожню ссилку null,
        //має бути повернено false
        if(otherObject == null) return false;

        //якщо класи не співпадають вони не є рівні
        if(getClass() != otherObject.getClass()) return false;

        //оли відомо що otherObject -
        //це непорожній обєкт типу Employee
        Employee other = (Employee) otherObject;

        //Перевіряємо чи  містять поля однакові значення
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode()
    {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString(){
        return getClass().getName() + "[name = " + name
                + ", salary = " + salary + ", hireDay = " + hireDay + "]";
    }

}
