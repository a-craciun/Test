package com.company;

import java.util.*;

public class Arrays_Exercise7 {
    // First, generate 10 1-100 random numbers, then put them in an array.
    // Put the numbers from the array greater than or equal to 10 into a list collection and print them to the console.

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumbers.nextInt(100) + 1;
        }
        System.out.println("Generated numbers are: " + Arrays.toString(numbers));

        displayList(numbers);
    }

    public static void displayList(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            if (i >= 10)
                Collections.addAll(list, i);
        }
        System.out.println("Numbers higher than or equal to 10 are: " + list);

    }
}











