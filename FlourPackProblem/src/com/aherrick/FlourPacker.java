package com.aherrick;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // big count = 5 kilos
        bigCount *= 5;
        if ((bigCount + smallCount) >= goal) { // 5 + 0 >= goal 5 > 4 (possible)
            for (int i = 0; i <= bigCount; i++) {
                if ((i % 5 == 0) && (i + smallCount >= goal) && (i <= goal)) { // (0 % 5 == 0) && (0 + 0 >= 4) && (0 <= 4) = false 0 + 0 = 0
                    return true;
                }
            }
        }

        return false; // (1,0,4 = false)
    }
}

