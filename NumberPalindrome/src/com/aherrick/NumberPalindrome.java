package com.aherrick;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {

        int initialValue = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = (number - lastDigit) / 10;
        }
        return initialValue == reverse;
    }
}
