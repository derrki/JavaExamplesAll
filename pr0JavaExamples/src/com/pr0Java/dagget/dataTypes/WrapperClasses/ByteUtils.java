package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;

public class ByteUtils {
    public static void main(String[] args) {
        byte b = 0b0010_0100;
        printlnByte(b);
        byte result = byteShift(b, 5, 1);
        printlnByte(result);

        byte b1 = 0b0000_0000;
        printlnByte(b1);
        result = byteShift(b1, 5, 1);
        printlnByte(result);

        byte b2 = (byte) 0b1111_1111;
        printlnByte(b2);
        result = byteShift(b2, 5, 1);
        printlnByte(result);

        byte b3 = (byte) 0b1111_1111;
        printlnByte(b3);
        result = byteShift(b3, 9, 1);
        printlnByte(result);
    }

    private static byte byteShift(byte b, int i, int j){

        if(i<Byte.SIZE & j < Byte.SIZE) {
            byte tempBete = b;
            if (b << Byte.SIZE - i == b << Byte.SIZE - j)
                return b;
            else {

            }
            b = (byte) (b ^ 1 << i);
            b = (byte) (b ^ 1 << j);
            return b;
        } else {
            println("Один з параметрів більшй чи рівний максимальному діапазону для Byte = " + Byte.SIZE + ". Перестановка неможлива.");
            println("i = " + i + "   j = " + j);
            return b;
        }
    }
}
