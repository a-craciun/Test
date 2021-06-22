package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays_Exercise4 {
 // Write a Java program to iterate through all elements in a array list and print them.
    public static void main(String[] args) {

        //create the array
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("horse");
        animals.add("cow");
        animals.add("pig");

        //get the iterator
        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

