package com.recursiveDataStructures;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        f(10);
    }

   static void f (int i)
    {
        if(i > 0){
            System.out.println(i--);
            f(i);
        }

    }
}
