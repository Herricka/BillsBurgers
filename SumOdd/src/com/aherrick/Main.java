package com.aherrick;

import static com.aherrick.SumOddRange.sumOdd;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100)); // 2500
        System.out.println(sumOdd(-1, 100)); // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(100, -100)); // -1
        System.out.println(sumOdd(100, 1000)); // 247500
    }
}
