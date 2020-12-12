package com.aherrick;

import static com.aherrick.NumberToWords.*;

public class Main {

    public static void main(String[] args) {
        getDigitCount(0); // 1
        getDigitCount(123); // 3
        getDigitCount(-12); // -1
        getDigitCount(5200); // 4

        reverse(-121); // -121
        reverse(1212); // 2121
        reverse(1234); // 4321
        reverse(100); // 1

        numberToWords(123); // One Two Three
        numberToWords(1010); // One Zero One Zero
        numberToWords(1000); // One Zero Zero Zero
        numberToWords(-12); // Invalid value


    }
}
