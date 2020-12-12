package com.aherrick;

import static com.aherrick.TeenNumberChecker.hasTeen;
import static com.aherrick.TeenNumberChecker.isTeen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // true in range 13 - 19
        System.out.println(hasTeen(23, 15, 42)); // true in range 13 - 19
        System.out.println(hasTeen(22, 23, 34)); // false not in range 13 - 19

        System.out.println(isTeen(9)); // false not in range 13-19
        System.out.println(isTeen(13)); // true in range 13 - 19
    }
}
