package com.aherrick;

import static com.aherrick.LeapYear.isLeapYear;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // false
        System.out.println(isLeapYear(1600)); // false
        System.out.println(isLeapYear(2017)); // false
        System.out.println(isLeapYear(2000)); // false
        System.out.println(isLeapYear(1924)); // true
    }
}
