package com.company;

import java.util.Arrays;

public class InsertArray {
    //Write a program to insert an element (specific position) into an array.

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int Index_position = 0;
        int newValue = 0;

        System.out.println("Original Array : " + Arrays.toString(myArray));

        for(int i = myArray.length - 1; i > Index_position; i-- ) {
            myArray[i] = myArray[i-1];
        }
        myArray[Index_position] = newValue;
        System.out.println("New Array : " + Arrays.toString(myArray));
    }
}
