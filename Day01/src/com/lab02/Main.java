package com.lab02;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 20);
		
		int sum = calc.compute((a, b) -> a + b);
		System.out.println("Sum: " + sum);
		
		int diff = calc.compute((a, b) -> a - b);
		System.out.println("Difference: " + diff);
		
		int product = calc.compute((a, b) -> a * b);
		System.out.println("Product: " + product);
		
		int quot = calc.compute((a, b) -> a / b);
		System.out.println("Quotient: " + quot);
	
		//(a + b)^2
		
	}

}
