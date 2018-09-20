package com.algorithms.dagget.idioms;

import java.util.Arrays;

import static util.Numbers.*;
import static util.Print.*;

public class BoobleSort {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomInRange(1, 20);
        }

        println("масив до сортування");
        for (int dataArray: array) {
            print(" " + dataArray);
        }

        println("\nмасив після сортування");
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    println(" " + Arrays.toString(array));
                }
            }
        }
    }
}

