package com.algorithms.dagget.idioms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static util.Print.*;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        println("Введіть величину початкового масиву");
        int lenghtMain = scanner.nextInt();
        println("Введіть величину вихідного масиву масиву");
        int lenghtChild = scanner.nextInt();

        int[] numbersMain = new int[lenghtMain];
        int[] numbersChild = new int[lenghtChild];

        for (int i = 0; i<lenghtMain; i++){
            numbersMain[i] = i+1;
        }

        for (int i = 0; i<lenghtChild; i++){
            int index = (int) (Math.random()*lenghtMain);
            numbersChild[i] = numbersMain[index];
            numbersMain[index] = numbersMain[lenghtMain-1];
            lenghtMain--;
        }

        println(Arrays.toString(numbersMain));
        println(Arrays.toString(numbersChild));
        Arrays.sort(numbersChild);
        println(Arrays.toString(numbersChild));
    }
}