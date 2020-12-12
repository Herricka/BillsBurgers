package com.aherrick;

import static com.aherrick.IntEqualityPrinter.printEqual;

public class Main {

    public static void main(String[] args) {
	    printEqual(1, 1, 1); // equal
        printEqual(1, 1, 2); // neither equal or different
        printEqual(-1,-1,-1); // invalid value
        printEqual(1,2,3); // All numbers different
    }
}
