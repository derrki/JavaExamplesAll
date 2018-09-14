package booleanExamples;

public class BooleanValueEx {
    public static void main(String[] args) {
        Boolean mBooleanWrapper;
        boolean mBooleanPrimitive;

        mBooleanWrapper = new Boolean(true);
        mBooleanPrimitive = mBooleanWrapper.booleanValue();



        String str = "Primitive value of Boolean object " + mBooleanWrapper + " is " + mBooleanPrimitive;
        System.out.println(str);

    }

}
