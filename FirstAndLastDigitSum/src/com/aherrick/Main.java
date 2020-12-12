package com.aherrick;

import static com.aherrick.FirstLastDigitSum.sumFirstAndLastDigit;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // 4
        System.out.println(sumFirstAndLastDigit(257)); // 9
        System.out.println(sumFirstAndLastDigit(0));   // 0
        System.out.println(sumFirstAndLastDigit(5));   // 10
        System.out.println(sumFirstAndLastDigit(-10)); // -1
    }
}
