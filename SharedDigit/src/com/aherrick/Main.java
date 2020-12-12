package com.aherrick;

import static com.aherrick.SharedDigit.hasSharedDigit;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99));  // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }
}
