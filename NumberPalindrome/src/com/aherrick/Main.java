package com.aherrick;

import static com.aherrick.NumberPalindrome.isPalindrome;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false
    }
}
