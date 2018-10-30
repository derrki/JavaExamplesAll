package com.ExamplsHorsman;

public class Main {
    public static void main(String[] args) {
        maxValue(-18.0 , 28.8, 39.7, 4.8, -6.0);
    }
    
    public static void maxValue(Double ... val){
        double result = Double.MIN_VALUE;
        for (double value: val) {
            if (result < value){
                result = value;
            }
        }
        System.out.println(result);
    }
}
