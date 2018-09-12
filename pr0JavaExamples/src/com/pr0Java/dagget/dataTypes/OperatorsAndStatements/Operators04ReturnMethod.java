package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators04ReturnMethod {

    public static void vReturn(int i) {
        if (i > 5)
            return;
        print("Now in method vReturn. i = " + i);
    }

    public static String strReturn(int i) {
        if (i >= 5)
            return i + " >= 5";
        return i + " < 5";
    }
}
