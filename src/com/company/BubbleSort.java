package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    //Write a program to sort an array of given integers using the Bubble sorting Algorithm.
    //The principle of bubble sort is to scan the elements from left-to-right, and whenever two adjacent elements are out-of-order, they are swapped.

    public static void main(String []args) {
        int[] arr = {23, 56, 12, 98, 4, 36};
        bubbleSort(arr);

    }

    public static  void bubbleSort (int[] arr){
        System.out.println("Unsorted array : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if( arr[j-1] > arr[j] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            System.out.println("Sorted array : " + Arrays.toString(arr));
        }
    }
}


