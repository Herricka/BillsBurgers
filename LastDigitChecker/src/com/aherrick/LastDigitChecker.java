package com.aherrick;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }

        num1 = num1 % 10;
        num2 = num2 % 10;
        num3 = num3 % 10;

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid (int num1) {
        if(num1 < 10 || num1 > 1000) {
            return false;
        }
        return true;
    }
}
