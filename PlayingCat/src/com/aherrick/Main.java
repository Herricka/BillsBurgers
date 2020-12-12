package com.aherrick;

import static com.aherrick.PlayingCat.isCatPlaying;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10)); // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
    }
}
