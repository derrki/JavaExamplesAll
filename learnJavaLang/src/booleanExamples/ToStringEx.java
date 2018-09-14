package booleanExamples;

public class ToStringEx {
    public static void main(String[] args) {

        Boolean b1, b2;
        boolean bool1, bool2;

        b1 = new Boolean(true);
        b2 = new Boolean(null);

        bool1 = true;
        bool2 = false;

        String s1, s2, s3, s4;

        s1 = b1.toString();
        s2 = b2.toString();
        s3 = Boolean.toString(bool1);
        s4 = Boolean.toString(bool2);

        String str1 = "String value of boolean object " + b1 + " is "  + s1;
        String str2 = "String value of boolean object " + b2 + " is "  + s2;
        String str3 = "String value of boolean primitive " +bool1+ " is "  +s3;
        String str4 = "String value of boolean primitive " +bool2+ " is "  +s4;

        System.out.println( str1 );
        System.out.println( str2 );
        System.out.println( str3 );
        System.out.println( str4 );
    }
}
