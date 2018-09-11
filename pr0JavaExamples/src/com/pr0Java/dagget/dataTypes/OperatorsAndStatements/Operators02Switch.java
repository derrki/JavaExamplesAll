package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators02Switch {
    public static void main(String[] args) {

        switch (args.length) {
            case 0: {
                println("No arguments");
                break;
            }

            case 1: {
                println("One argument");
                break;
            }

            case 2: {
                println("Two arguments");
                break;
            }
            case 3: {
                println("Three arguments");
                break;
            }
            default:
                println("More three arguments");
                break;

        }

    }
}
