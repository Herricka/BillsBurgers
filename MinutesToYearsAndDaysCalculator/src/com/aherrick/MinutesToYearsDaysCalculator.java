package com.aherrick;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years = (int)minutes/525600;
            int remainder = (int)minutes % 525600;
            int days = remainder / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }
    }
}
