package com.company;

public class AverageValueOfAnArray {
    //Write a program to compute the average value of an array of integers except the largest and smallest values.

    public static void main(String[] args)
    {
        int[] arr = {1, 15, 4, 6, 3};
        double min, max, sum;
        min = max = sum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            double total = arr[i];
            sum += total;
            min = Math.min(min, total);
            max = Math.max(max, total);
        }
        sum -= min + max;
        double average = sum / (arr.length - 2);
        System.out.printf("The average value of an array of integers except the largest and smallest values is %.2f ", average);

    }
}

