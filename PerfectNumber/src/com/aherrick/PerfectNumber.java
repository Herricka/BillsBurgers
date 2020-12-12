package com.aherrick;

public class PerfectNumber {
    public static boolean isPerfectNumber (int number) {
        if (number <= 0) {
            return false;
        } else {
           int sum = 0;
           for(int i = 1; i < number; i++) {
               int remainder = number % i;
                if (remainder == 0) {
                    sum = sum + i;
                }
            }
           return sum == number;

        }
    }
}

