package com.pr0Java.dagget.dataTypes.charType;

import static util.Print.*;

public class SurrogateChar {
    public static void main(String[] args) {
        char ch1 = 0xd83d;
        char ch2 = 0xde80;

        if (Character.isSurrogatePair(ch1, ch2)) {
            println("ch1 та ch2 є коректними сурогатними парами");
            //присвоєння кодової точки сурогатної пари ch1 та ch2 змінній
            //типу int
            int codePoint = Character.toCodePoint(ch1, ch2);
            println("Кодова точка ch1 та ch2 рівна " + codePoint);

            char ch[];
            ch = Character.toChars(codePoint);
            for (int i = 0; i < ch.length; i++) {
                print(ch[i]);
            }
        } else {
            println("ch1 та ch2 не є коректними сурогатними парами");
        }
    }
}
