package booleanExamples;

public class EqualsEx {
    public static void main(String[] args) {
        Boolean mBoolean1, mBoolean2;
        boolean res;

        mBoolean1 = new Boolean(true);
        mBoolean2 = new Boolean(false);

        res = mBoolean1.equals(mBoolean2);

        String str = "mBoolean1: " + mBoolean1 + " and mBoolean2: " + mBoolean2 + " are equal is " + res;

        System.out.println(str);
    }
}
