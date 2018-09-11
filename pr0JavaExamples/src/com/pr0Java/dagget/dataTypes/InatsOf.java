package com.pr0Java.dagget.dataTypes;

import java.util.Date;

import static util.Print.*;

public class InatsOf {
    public static void main(String[] args) {
        int [] mas = new int[5];

        Date date = new Date();
        long time = 0;


        if(date instanceof Date)
            time = date.getTime();
        if(date instanceof java.sql.Date)
            time = 2000;
        println((mas instanceof int[])? "Yes": "No");
        println((mas instanceof Object)? "Yes": "No");
        println(time);
    }
}
