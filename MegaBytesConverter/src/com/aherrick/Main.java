package com.aherrick;

import static com.aherrick.MegaBytesConverter.printMegaBytesAndKiloBytes;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2500); // "2500 KB = 2 MB and 452 KB
        printMegaBytesAndKiloBytes(-1024); // "Invalid Value"
        printMegaBytesAndKiloBytes(5000); // "5000 KB = 4 MB and 904 KB


    }
}
