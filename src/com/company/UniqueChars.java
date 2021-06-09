package com.company;

import java.util.Arrays;

public class UniqueChars {
    // Write a program to check if a given string has all unique characters. Return the result as a boolean value.

    public static void main(String[] args) {
        String myString = "This string does not have unique characters";
        System.out.println("My string has unique characters is " + isUniqueString(myString));
    }

    public static boolean isUniqueString(String myString) {
        char[] chars = myString.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}