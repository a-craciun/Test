package com.company;

import java.util.Arrays;
import java.util.List;

public class Arrays_Exercise3 {
    // Write a Java program to convert an array to ArrayList.

    public static void main(String[] args) {
        Integer[] list = {3, 5, 4, 6, 88};
        List myList = Arrays.asList(list);
        System.out.println(myList);
    }
}

