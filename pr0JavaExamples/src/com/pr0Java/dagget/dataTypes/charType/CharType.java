package com.pr0Java.dagget.dataTypes.charType;

import static util.Print.*;

public class CharType {
    public static void main(String[] args) {
        char om = '\u0950';
        char tab1 = '\t';
        char tab2 = 9;
        char tab3 = '\u0009';
        print(tab1);
        println(om);
        char ї = 'ї';
        print(tab2);
        print(ї);
        print('\t');
        println("\"Hello\n\t World!\"");
        ++ї;
        print('\t');
        print(ї);
    }
}
