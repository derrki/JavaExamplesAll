package com.pr0Java.dagget.dataTypes.BigIntegetAndBidDecimal;

import java.math.BigInteger;
import java.util.Random;

import static util.Print.*;

public class BigIntegerClass {
    public static void main(String[] args) {

        String bigIntegetStringValue = String.valueOf(Integer.MAX_VALUE);
        BigInteger bigInteger1 = new BigInteger(bigIntegetStringValue);
        println("bigInteger1 = " + bigInteger1);

        BigInteger bigInteger2 = new BigInteger("9223372036854775807");  // Long.MAX_VALUE
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

        byte[] barSign = { 5, 7 }; // 1287
        BigInteger bigInteger6 = new BigInteger(barSign);
        println("bigInteger6 = " + bigInteger6);
        println("BigInteger(-1,barSign) = " + new BigInteger(-1, barSign));

        int bitLength = 8; // 8 bits ( 0 до 255)
        Random rnd = new Random();
        int certainty = 5; // 1 - 1/2(5) certainty
        BigInteger birnd1 = new BigInteger(bitLength, certainty, rnd);
        BigInteger birnd2 = new BigInteger(bitLength, rnd);
        println("birnd1 = " + birnd1);
        println("birnd2 = " + birnd2);

        BigInteger bigInteger7 = BigInteger.valueOf(42);
        println("bigInteger7 = " + bigInteger7);

        println("BigInteger.ONE = " + BigInteger.ONE);
        println("BigInteger.TEN = " + BigInteger.TEN);
        println("BigInteger.ZERO = " + BigInteger.ZERO);

        println("bigInteger1+bigInteger2 = " + (bigInteger1.add(bigInteger2))); // +
        println("bigInteger1 = " + bigInteger1 + "   bigInteger2 = " + bigInteger2);
        BigInteger bigInteger8 = bigInteger5.subtract(bigInteger3); // -
        println("bigInteger8 = " + bigInteger8);
        println("bigInteger3*bigInteger7 = " + (bigInteger3.multiply(bigInteger7))); // *
        println("bigInteger5/10 = " + (bigInteger5.divide(BigInteger.TEN)));



    }
}
