package com.pr0Java.dagget.dataTypes.OperatorsAndStatements;

import static util.Print.*;

public class Operators04Break02 {
    public static void main(String[] args) {
        blok1:
        {
            println("Blok 1 start");
            blok2:
            {
                println("Blok 2 start");
                blok3:
                {
                    println("Blok 3 start");
                    switch (args.length) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            break blok1;
                        }
                        case 2: {
                            break blok2;
                        }
                        case 3: {
                            break blok3;
                        }
                    }
                    println("Blok 3 end");
                }
                println("Blok 2 end");
            }
            println("Blok 1 end");
        }
    }
}
