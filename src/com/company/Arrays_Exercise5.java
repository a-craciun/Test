package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_Exercise5 {
 // Write a Java program to reverse elements in a array list. Check available methods in Collections class.

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println("My list before reverse " + myList);

        Collections.reverse(myList);
        System.out.println("My list after reverse " + myList);
    }
}

