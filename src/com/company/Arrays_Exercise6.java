package com.company;

import java.util.ArrayList;

public class Arrays_Exercise6 {
    // Write a Java program to empty an array list and write another program to test if the array list is empty.

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println("My list " + myList);

        //clear the list
        myList.clear();
        System.out.println(myList);

        //verify if the list is empty using isEmpty() method
        boolean list = myList.isEmpty();
        if (list == true)
            System.out.println("The list is empty");
        else System.out.println("The list is not empty");
    }
}

