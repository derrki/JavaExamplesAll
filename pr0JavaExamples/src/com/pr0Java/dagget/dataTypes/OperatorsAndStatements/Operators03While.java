package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators03While {
    public static void main(String[] args) {
        int i = args.length;
        while (i > 0) {
            --i;
            println("Hello " + args[i]);
        }

        int l = 100;
        int m = 200;
        while(++l < --m);
        println("Середнє значення = " + l);
    }
}
