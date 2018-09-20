package com.algorithms.dagget.idioms;

import java.util.Arrays;

import static util.Numbers.*;
import static util.Print.*;

public class BoobleSort {
    public static void main(String[] args) {
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomInRange(1, 20);
        }

        origynalArray(array);

        boobleSortOne(array);

        origynalArray(array);

        boobleSortTwo(array);
    }

    private static void origynalArray(int[] array) {
        println("масив до сортування");
        for (int dataArray: array) {
            print(" " + dataArray);
        }
    }

    private static void boobleSortOne(int[] array) {
        println("\nмасив після сортування метод 1");
        int[] copyArray = Arrays.copyOf(array, array.length);
        int temp;
        int count = 0;
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length-1; j++) {
                if (copyArray[j] > copyArray[j+1]){
                    count ++;
                    temp = copyArray[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = temp;
                    println(" " + Arrays.toString(copyArray) + " - i = " + i + "  j = " + j + "  + count = " + count);
                }
            }
        }
    }
    private static void boobleSortTwo(int[] array) {
        println("\nмасив після сортування метод 2");
        int[] copyArray = Arrays.copyOf(array, array.length);
        int temp;
        int count = 0;
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length-1-i; j++) {
                if (copyArray[j] > copyArray[j+1]){
                    count ++;
                    temp = array[j];
                    copyArray[j] = copyArray[j+1];
                    copyArray[j+1] = temp;
                    println(" " + Arrays.toString(copyArray) + " - i = " + i + "  j = " + j + "  + count = " + count);
                }
            }
        }
    }
}

