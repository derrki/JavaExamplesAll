package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;

public class BooleanWrapper {
    public static void main(String[] args) {
        Boolean wBoolean = false;
        if (args.length > 0)
            wBoolean = Boolean.parseBoolean(args[0]);
        println("wBoolean = " + wBoolean);
    }
}
