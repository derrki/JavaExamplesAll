package com.algorithms.dagget.idioms;

import java.util.Arrays;

import static util.Numbers.*;
import static util.Print.*;

public class SortAlgoritms {
    public static void main(String[] args) {
        createArray();
    }

    private static void createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInRange(1, 20);
        }
    }

    public static void boobleSortUp(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        int temp;
        int count = 0;
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length - 1 - i; j++) {
                if (copyArray[j] > copyArray[j + 1]) {
                    count++;
                    temp = copyArray[j];
                    copyArray[j] = copyArray[j + 1];
                    copyArray[j + 1] = temp;
                }
            }
        }
        println(" " + Arrays.toString(copyArray) + "  count = " + count);
    }

    public static void selectionSort(int[] array){
        int[] copyArray = Arrays.copyOf(array, array.length);
        int temp;
        int count = 0;
        for (int i = 0; i < copyArray.length-1; i++) {
            for (int j = i+1; j < copyArray.length; j++) {
                if (copyArray[i] > copyArray[j]) {
                    count++;
                    temp = copyArray[j];
                    copyArray[j] = copyArray[i];
                    copyArray[i] = temp;
                }
            }
        }
        println(" " + Arrays.toString(copyArray) + "  count = " + count);
    }
}

