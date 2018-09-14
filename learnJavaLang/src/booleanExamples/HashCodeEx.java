package booleanExamples;

public class HashCodeEx {
    public static void main(String[] args) {
        Boolean b1, b2;

        b1 = new Boolean(true);
        b2 = new Boolean(false);

        int i1, i2;

        // assign the hash code of b1, b2 to i1, i2
        i1 = b1.hashCode();
        i2 = b2.hashCode();

        String str1 = "Hash code of " + b1 + " is "  +i1;
        String str2 = "Hash code of " + b2 + " is "  +i2;

        System.out.println( str1 );
        System.out.println( str2 );
    }
}
