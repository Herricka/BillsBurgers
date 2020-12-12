package com.aherrick;

public class Main {

    public static void main(String[] args) {
	    SimpleCalculator calculator = new SimpleCalculator();
	    calculator.setFirstNumber(5.0);
	    calculator.setSecondNumber(4.0);
        System.out.println("add = " + calculator.getAdditionResult()); // 9.0
        System.out.println("subtract = " + calculator.getSubtractionResult()); // 1.0
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult()); // 0.0
        System.out.println("divide = " + calculator.getDivisionResult()); // 0.0
    }
}
