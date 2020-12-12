package com.aherrick;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sumEvenNumbers = 0;
        int lastDigit = 0;
        while(number > 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEvenNumbers = sumEvenNumbers + lastDigit;
            }
            number = number / 10;

        }
        return sumEvenNumbers ;
    }
}
