package com.aherrick;

import static com.aherrick.EqualSumChecker.hasEqualSum;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1)); // false 1+1!=1
        System.out.println(hasEqualSum(1, 1, 2)); // true 1+1=2
        System.out.println(hasEqualSum(1, -1, 0)); // true 1+(-1) is 1=1 and is equal to 0
    }
}
