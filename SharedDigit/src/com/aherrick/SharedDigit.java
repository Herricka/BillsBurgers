package com.aherrick;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int lastDigit = 0; // 2
        int originalNum2 = num2;
        while( num1 > 0) {
            lastDigit = num1 %10; // 2
            num2 = originalNum2; // 23
            int lastNum2Digit = 0;
            while( num2 > 0) {
                lastNum2Digit = num2 % 10; // 3 , 2
                if (lastDigit == lastNum2Digit) { // 2 != 3 , 2 ==2
                    return true; // skip if 2 != 3
                }
                num2 = num2 / 10; // 2
            }
            num1 = num1 / 10; // 1
        }
        return false;
    }
}
