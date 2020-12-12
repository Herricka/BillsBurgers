package com.aherrick;

import static com.aherrick.NumberOfDaysInMonth.getDaysInMonth;
import static com.aherrick.NumberOfDaysInMonth.isLeapYear;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // false
        System.out.println(isLeapYear(1600)); // true
        System.out.println(isLeapYear(2017)); // false
        System.out.println(isLeapYear(2000)); // true

        System.out.println(getDaysInMonth(1, 2020)); // 31
        System.out.println(getDaysInMonth(2,2020)); // 29
        System.out.println(getDaysInMonth(2, 2018)); // 28
        System.out.println(getDaysInMonth(-1, 2020)); // -1
        System.out.println(getDaysInMonth(1, -2020)); // -1
    }
}
