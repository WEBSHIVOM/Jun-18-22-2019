package com.lab02;

public class Calculator {
	private int num1, num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int compute(Operation operation) {
		return operation.perform(num1, num2);
	}
}
@FunctionalInterface
interface Operation {
	int perform(int a, int b);
}
