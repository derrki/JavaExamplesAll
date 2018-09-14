package booleanExamples;

public class ParseBooleanEx {

    public static void main(String[] args) {

        String s1 = "TRue";
        String s2 = "yes";

        boolean bool1, bool2;

        bool1 = Boolean.parseBoolean(s1);
        bool2 = Boolean.parseBoolean(s2);

        String str1 = "Parse boolean on " + s1 + " gives "  + bool1;
        String str2 = "Parse boolean on " + s2 + " gives "  + bool2;

        System.out.println( str1 );
        System.out.println( str2 );
    }
}
