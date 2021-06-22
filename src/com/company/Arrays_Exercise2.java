package com.company;

import java.util.HashSet;

public class Arrays_Exercise2 {
    //Write a Java program to find the common elements between two arrays (string values). Use two for loops to cover every element in the arrays.

    public static void main(String[] args) {
        String[] names1 = {"Ion", "Maria", "Nicu", "Ana", "Vasile", "Mircea"};
        String[] names2 = {"Gheorghe", "Maria", "Liviu", "Ana", "Bogdan", "Mircea"};
        findCommonElements(names1, names2);
    }

    private static void findCommonElements(String[] names1, String[] names2) {
        HashSet<String> commonNames = new HashSet<>();

        for(int i = 0; i < names1.length; i++ ) {
            for (int j = 0; j < names2.length; j++) {
                if (names1[i] == names2[j]) {
                    commonNames.add(names1[i]);
                    break;
                }
            }
        }
        for (String i : commonNames) {
            System.out.println(i);
        }
    }
}

