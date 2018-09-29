package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;

public class IntegerUtils {
    public static void main(String[] args) {
        int x = 0b00000001_00000000_00000000_00000000;
        for(int i = 0; i<31; i++){
            x = leftShift(x);
            printlnInt(x);
        }

    }
    private static int leftShift(int arg) {

        return (arg << 1) | (arg >>> 31);

    }
}
