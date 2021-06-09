package com.company;

import java.util.Arrays;

public class RemoveIntFromArray {
    //Write a program to remove all occurrences of a specified value in a given array of integers and return the new array. There can be duplicates in the array.

    public static int[] removeElements(int[] arr, int key)
    {
        int index = 0;
        for (int i=0; i < arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];

        return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args)
    {
        int[] array = { 1, 4, 6, 2, 4, 4, 4 };
        int key = 4;
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array));
    }
}

