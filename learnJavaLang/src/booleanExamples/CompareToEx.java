package booleanExamples;

public class CompareToEx {
    public static void main(String[] args) {
        Boolean mBoolean1, mBoolean2;
        int res;

        mBoolean1 = new Boolean(true);
        mBoolean2 = new Boolean(false);

        res = mBoolean1.compareTo(mBoolean2);

        String str1 = "Both values are equal ";
        String str2 = "Object value is true";
        String str3 = "Argument value is true";

        if (res == 0) {
            System.out.println(str1);
        } else if (res > 0) {
            System.out.println(str2);
        } else if (res < 0) {
            System.out.println(str3);
        }

    }
}
