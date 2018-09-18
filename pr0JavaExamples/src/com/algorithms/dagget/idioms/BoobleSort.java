package com.algorithms.dagget.idioms;

import java.util.Random;

import static util.Print.*;

public class BoobleSort {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);
            print(array[i] + " ");
        }
    }
}

