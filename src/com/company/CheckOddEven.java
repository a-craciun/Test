package com.company;

public class CheckOddEven {
    // Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
    // The program shall always print “bye!” before exiting.

    public static void main(String[] args) {
        int number = 31;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
