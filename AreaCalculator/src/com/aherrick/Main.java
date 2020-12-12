package com.aherrick;

import static com.aherrick.AreaCalculator.area;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0)); //78.53975
        System.out.println(area(-1)); // -1
        System.out.println(area(5.0, 4.0)); //20.0
        System.out.println(area(-1.0, 4.0)); //-1
    }
}
