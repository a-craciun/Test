package com.company;

import java.util.Arrays;

public class Arrays_Exercise1 {
    //Write a Java program to sort a numeric array and a string array. Check and use available Arrays methods.

    public static void main(String[] args)
    {
        int[] numericArray = {34, 6, 67, 12, 45, 90, 36, 8, 22};
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " +Arrays.toString(numericArray));

        String[] stringArray = {"Ion", "Maria", "Ana", "Vlad", "Vasile", "Ioana", "Claudiu"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " +Arrays.toString(stringArray));
    }
}

