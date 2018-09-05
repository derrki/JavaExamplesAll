package com.pr0Java.dagget.dataTypes.charType;

import static util.Print.*;

public class UnicodeTable {

    public static final int CHARACTER_MAX_VALUE = Character.MAX_VALUE;

    public static void main(String[] args) {

        char[] unicodeCodeNumbers = new char[CHARACTER_MAX_VALUE+1];
        int [] newLineNumber = new int[CHARACTER_MAX_VALUE];

        for (int i = 0; i < unicodeCodeNumbers.length; i++) {
            unicodeCodeNumbers[i] = (char) i;
        }

        for (int i = 0; i < newLineNumber.length; i+=15) {
            newLineNumber[i] = i;
        }

        for (int i = 0; i < newLineNumber.length; i++) {
            print(i + "-" + unicodeCodeNumbers[i] + ";  ");
            if(unicodeCodeNumbers[i] == (char) newLineNumber[i]){
                println();
            }
        }

    }
}
