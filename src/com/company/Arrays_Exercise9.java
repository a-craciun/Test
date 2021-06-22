package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays_Exercise9 {
// Write a function that takes an arbitrary number of integers as arguments and returns a collection of them stored in reverse order.

    public static void main(String[] args) {
        int[] integers = new int[]{1, 2, 3, 4, 5};
        varArgs(integers);
    }

    public static void varArgs(int... integers) {
        List<Integer> list = new ArrayList<>();
        for (int i : integers) {
            Collections.addAll(list, i);
        }
        System.out.println("My list is : " + list);

        Collections.reverse(list);
        System.out.println("My reversed list is " + list);

    }
}






