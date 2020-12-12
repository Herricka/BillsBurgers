package com.aherrick;

import static com.aherrick.LastDigitChecker.hasSameLastDigit;
import static com.aherrick.LastDigitChecker.isValid;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(23, 32, 42)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false

        System.out.println(isValid(10)); // true
        System.out.println(isValid(468)); // true
        System.out.println(isValid(1051)); // false
    }
}
