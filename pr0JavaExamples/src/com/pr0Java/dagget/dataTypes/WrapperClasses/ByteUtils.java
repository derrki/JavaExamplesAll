package com.pr0Java.dagget.dataTypes.WrapperClasses;

import static util.Print.*;

public class ByteUtils {
    public static void main(String[] args) {
        byte b = (byte) 0b1000_0001;
        Integer mInt = new Integer(b);
        byte resultOne = (byte) (b ^ 1<< 0);
        byte resultTwo = (byte) (b ^ 1<< 7);
        printlnByte(resultOne);
        printlnByte(resultTwo);
        printlnByte((byte) (b<<(Byte.SIZE-7-1)));
        printlnByte((byte) (b<<(Byte.SIZE-6-1)));
        printlnByte((byte) (b<<(Byte.SIZE-5-1)));
        printlnByte((byte) (b<<(Byte.SIZE-4-1)));
        printlnByte((byte) (b<<(Byte.SIZE-3-1)));
        printlnByte((byte) (b<<(Byte.SIZE-2-1)));
        printlnByte((byte) (b<<(Byte.SIZE-1-1)));
        printlnByte((byte) (b<<(Byte.SIZE-0-1)));
       // byte result = byteShift(b, 0, 1);
       // printlnByte(result);
    }

//    private static byte byteShift(byte b, int i, int j){
//
//        if(i<Byte.SIZE & j < Byte.SIZE) {
//            if (b << Byte.SIZE - i == b << Byte.SIZE - j)
//                return b;
//        }else {
//
//
//            b = (byte) (b ^ 1 << j);
//            b = (byte) (b ^ 1 << i);
//            return b;
//
//    }
}
