package com.algorithms.dagget.idioms;

import java.util.Arrays;

import static util.Print.*;

public class TestSortAlgoritms {

    public static void main(String[] args) {
        int[][] array = {
                {},
                {5},
                {4, 2},
                {8, 2, 7, 1, 9, 6},
                {4, 3, 6, 2, 0, 7, 10, 5, 11, 1},
                {4, 3, 6, 2, 0, 7, 10, 5, 11, 1, 25, 15, 40, 32, 9, 13}
        };

        long t1 = System.nanoTime();
        for (int[] mass : array) {
            print(Arrays.toString(mass) + " ->");
            SortAlgoritms.boobleSortUp(mass);
        }
        System.out.println("A: " + (System.nanoTime() - t1)/100);
        println();
        long t2 = System.nanoTime();
        for (int[] mass : array) {
            print(Arrays.toString(mass) + " ->");
            SortAlgoritms.selectionSort(mass);
        }
        System.out.println("A: " + (System.nanoTime() - t2)/100);
    }

}
