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

    }
}
