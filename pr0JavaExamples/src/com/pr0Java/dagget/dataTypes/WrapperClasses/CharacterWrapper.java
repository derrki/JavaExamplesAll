package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;

public class CharacterWrapper {
    public static void main(String[] args) {
        if (args.length > 0){
            for (char ch: args[0].toCharArray()){
                if(Character.isDigit(ch)){
                    print(ch + " - this a number\n");
                    continue;
                }
                print(ch + " - this a symbol\n");
            }
        }
    }
}
