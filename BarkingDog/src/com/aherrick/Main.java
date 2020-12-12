package com.aherrick;

import static com.aherrick.BarkingDog.shouldWakeUp;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); // true
        System.out.println(shouldWakeUp(false, 2)); // false dog not barking
        System.out.println(shouldWakeUp(true, 8)); // false not before 8
        System.out.println(shouldWakeUp(true, -1)); // false out of range
    }
}
