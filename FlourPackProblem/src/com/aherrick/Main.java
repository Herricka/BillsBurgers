package com.aherrick;

import static com.aherrick.FlourPacker.canPack;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4)); // false bC = 1(5 kilos) and goal is 4 kilos
        System.out.println(canPack(1,0,5)); // true bC = 1(5 kilos) and goal is 5 kilos
        System.out.println(canPack(0,5,4)); // true bC = 0(5 kilos) and sC = 5 goal is 4 kilos with a bag left over
        System.out.println(canPack(2,2,11)); // true bC = 2(5 kilos) and sC = 2 goal is 11 kilos
        System.out.println(canPack(-3,2,12)); // false bC = negative

    }
}
