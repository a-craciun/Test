package com.company;

import java.util.Scanner;

public class SumProductMinMax {
    //Write a program called SumProductMinMax that prompts user for three integers.
    //The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results.

    public static void main(String[] args) {

        int sum, product, max, min;
        int num1, num2, num3;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first int: ");
        num1 = in.nextInt();

        System.out.print("Enter second int: ");
        num2 = in.nextInt();

        System.out.print("Enter third int: ");
        num3 = in.nextInt();

        in.close();

        sum = num1 + num2 + num3;
        System.out.println("The sum is " + sum);

        product = num1 * num2 * num3;
        System.out.println("The product is " + product);

        //updated code using Mihai's suggestion
        min = Math.min(num1, Math.min(num2, num3));
        System.out.println("The min is " + min);

        max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The max is " + max);

    }
}
