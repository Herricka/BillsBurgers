package com.aherrick;

public class IntEqualityPrinter {
    public static void printEqual(int val1, int val2, int val3){
        if((val1 < 0) || (val2 < 0) || (val3 < 0)) {
            System.out.println("Invalid Value");
        } else if((val1 == val2) && (val2 == val3) && (val1 == val3)) {
            System.out.println("All numbers are equal");
        } else if((val1 != val2) && (val2 != val3) && (val1 != val3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
