package com.company;

import java.util.Scanner;

public class CountVowelsDigits {
    //Write a program called CountVowelsDigits, which prompts the user for a String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U)
    // and digits (0-9) contained in the string, and prints the counts.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The string is ");
        String str = in.nextLine();

        System.out.print("Number of Vowels in the string: " + count_Vowels(str));
        System.out.print("Number of Digits in the string: " + count_Digits(str));
    }

    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int count_Digits(String str) {
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits++;
            }
        }
        return digits;
    }
}