package com.aherrick;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(!barking) {
            return false;
        }
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (!barking ||hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }
}
