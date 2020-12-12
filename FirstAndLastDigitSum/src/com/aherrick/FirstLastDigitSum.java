package com.aherrick;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;
            number = number / 10;
        }
        return lastDigit + firstDigit;
    }
}
