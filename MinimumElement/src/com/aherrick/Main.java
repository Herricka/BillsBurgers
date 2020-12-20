package com.aherrick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findMin(readElements(readInteger()));
    }

    private static int readInteger() {
        System.out.println("Add a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int length) {
        System.out.println("Add " + length + " integers for the array");
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[length];

        for (int i=0; i<length; i++) {
            elements[i] = scanner.nextInt();
            }

            return elements;
        }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        return min;
    }
}
