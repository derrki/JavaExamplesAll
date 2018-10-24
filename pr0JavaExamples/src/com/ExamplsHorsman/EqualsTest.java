package com.ExamplsHorsman;

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
    }
}
