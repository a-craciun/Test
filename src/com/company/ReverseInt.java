package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInt {
    //Write a program that prompts user for a positive integer.
    //The program shall read the input as int; and print the "reverse" of the input integer. (input: 12345 reverse: 54321)

    public static void main(String[] args) {
        int reversed = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = in.nextInt();

         while(num != 0) {
             int digit = num % 10;
             reversed = reversed * 10 + digit;

             num /= 10;

         }
        System.out.println("Reversed number is : " + reversed);
    }
}