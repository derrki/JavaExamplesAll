package com.pr0Java.dagget.dataTypes.BigIntegetAndBidDecimal;

import java.math.BigInteger;

import static util.Print.*;

public class BigIntegerClass {
    public static void main(String[] args) {

        String bigIntegetStringValue = String.valueOf(Integer.MAX_VALUE);
        BigInteger bigInteger1 = new BigInteger(bigIntegetStringValue);
        println("bigInteger1 = " + bigInteger1);

        BigInteger bigInteger2 = new BigInteger("-9223372036854775807");  // Long.MAX_VALUE
        println("bigInteger2 = " + bigInteger2);

        long value = bigInteger1.longValue();
        println(value);

        BigInteger bigInteger3 = new BigInteger("10101", 2);
        println("bigInteger3 = " + bigInteger3);

        byte[] bytes = new byte[] {(byte) 0xFF, 0x00, 0x00}; // -65536
        BigInteger bigInteger4 = new BigInteger(bytes);
        println("bigInteger4 = " + bigInteger4);

        bytes = new byte[] { 0x1, 0x00, 0x00 }; // 65536
        BigInteger bigInteger5 = new BigInteger(bytes);
        println("bigInteger5 = " + bigInteger5);

    }
}
