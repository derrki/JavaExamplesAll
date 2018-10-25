package com.ExamplsHorsman;

import java.util.ArrayList;

public class EqualsTest {
    public static void main(String[] args) {

        Employee alise1 =
                new Employee("Alice Adams", 75000, 1987, 12, 15);

        Employee alise2 = alise1;
        Employee alise3 =
                new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob =
                new Employee("Bob Brandson", 50000, 1989, 10, 1);

        System.out.println("alise1==alise2: " + (alise1==alise2));
        System.out.println("alise1==alise3: " + (alise1==alise3));
        System.out.println("alise1.equals(alise3): " + alise1.equals(alise3));
        System.out.println("alise1.equals(bob): " + alise1.equals(bob));

        System.out.println("bob.toString(): " + bob.toString());

        Manager carl =
                new Manager("Carl Cracker", 8000, 1987, 12, 15);
        Manager boss =
                new Manager("Carl Cracker", 8000, 1987, 12, 15);

        boss.setBonus(5000);
        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alise1.hashCode(): " + alise1.hashCode());
        System.out.println("alise3.hashCode(): " + alise3.hashCode());
        System.out.println("boss.hashCode(): " + boss.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());

        ArrayList<Employee> staff = new ArrayList<>(10);
        //staff.ensureCapacity(10);
        staff.add(new Employee("Jo", 5000, 1985, 12, 13));
        staff.add(new Employee("Ron", 5000, 1990, 10, 01));
        staff.add(new Employee("Eddy", 5000, 1985, 12, 13));
        System.out.println(staff.size());

        for (Employee e: staff) {
            System.out.println(e);
        }

        for (Employee e: staff) {
         e.raiseSalary(1000);
        }

        for (Employee e: staff) {
            System.out.println(e);
        }

        staff.set(2, new Employee("Ja Junior", 4000, 1995, 01, 19));
        System.out.println(staff.size());
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i));
        }
        
        staff.add(2 ,new Employee("Eddy", 5000, 1985, 12, 13));

        System.out.println(staff.size());
        for (Employee e: staff) {
            System.out.println(e);
        }

        System.out.println("");
        System.out.println(staff.remove(2));
        System.out.println(staff.size());
        for (Employee e: staff) {
            System.out.println(e);
        }
    }
}