package com.aherrick;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
            int sum = 0;
            double average = 0;
            double avg = 0;
            double count = 0;

        while(true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average += number;
                avg = (sum/count);

            } else {
                break;
            }
        scanner.nextLine();

        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();

    }
}
