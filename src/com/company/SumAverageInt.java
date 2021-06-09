package com.company;

public class SumAverageInt {
    // Write a program called SumAverageInt to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.

    public static void main(String[] args) {
        int sum = 0;
        double average = 0;

        final int x = 1;
        final int y = 100;

        for (int i = x; i <= y; ++i) {
            sum += i;
            average = sum / i;
        }
        
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}

