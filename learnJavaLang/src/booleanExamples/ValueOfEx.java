package booleanExamples;

public class ValueOfEx {
    public static void main(String[] args) {

        Boolean b1, b2, b3, b4;

        boolean bool1 = true;
        boolean bool2 = false;
        String s1 = null;
        String s2 = "false";

        b1 = Boolean.valueOf(bool1);
        b2 = Boolean.valueOf(bool2);
        b3 = Boolean.valueOf(s1);
        b4 = Boolean.valueOf(s2);

        String str1 = "Boolean instance of primitive " + bool1 + " is "  + b1;
        String str2 = "Boolean instance of primitive " + bool2 + " is "  + b2;
        String str3 = "Boolean instance of string " + s1 + " is "  + b3;
        String str4 = "Boolean instance of string " + s2 + " is "  + b4;

        System.out.println( str1 );
        System.out.println( str2 );
        System.out.println( str3 );
        System.out.println( str4 );
    }
}
