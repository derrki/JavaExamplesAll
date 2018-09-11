package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators02IfElse {
    public static void main(String[] args) {

        if(args.length == 0)
            println("No arguments");

        if(args.length == 0)
            println("No arguments");
        else
            println("Arguments - " + args.length);

        if(args.length == 1)
            println("One argument");
        else if (args.length == 2)
            println("Two arguments");
        else if (args.length > 3)
            println("More three arguments");
    }
}
