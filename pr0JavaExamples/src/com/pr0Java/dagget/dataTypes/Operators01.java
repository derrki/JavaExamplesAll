package com.pr0Java.dagget.dataTypes;

import static util.Print.*;
public class Operators01 {
    public static void main(String[] args) {
        println("Total: " + 3 + 4); //....34, npt 7 !!!
        println("Quotient: " + 7 / 3.0f); //....34, npt 7 !!!

        String sYes = "yes";
        String sNo = "no";
        String isArgs = (args.length > 0) ? sYes : sNo;
        println("Argunent " + isArgs);
        println("Argunent is " + args.length);
        String sArgs = null;
        sArgs = (args.length != 0)? args[0] : "unknown";
        println("name = " + sArgs);
    }
}
