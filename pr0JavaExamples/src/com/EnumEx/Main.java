package com.EnumEx;

public class Main {
    public static void main(String[] args) {
        Pronoun pronoun = Pronoun.I;
        switch (pronoun) {
            case I:
                System.out.println("I work");
                break;
            case HE:
                System.out.println("He works");
                break;
            default:
                System.out.println("!!!");
        }
//*********************************************
        for (Pronoun pr: Pronoun.values()) {
            System.out.println(pr.getTranslation());
        }
        //*********************

        System.out.println(pronoun.getTranslation());
    }
}
