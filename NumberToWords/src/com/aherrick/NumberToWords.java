package com.aherrick;

import static java.lang.Integer.reverse;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
        int digit = 0;
        int initialDigitCount = getDigitCount(number);
        number = reverse(number);
        do {
            digit = number % 10;
            number /= 10;
            initialDigitCount--;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } while(initialDigitCount > 0);

        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while(Math.abs(number) > 0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }
    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
