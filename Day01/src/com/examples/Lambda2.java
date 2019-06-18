package com.examples;

//Lambda is used ONLY on Functional Interfaces
//Functional interfaces can have only ONE abstract method
//Explicitly make an interface functional by adding @FunctionalInterface
public class Lambda2 {

	public static void main(String[] args) {
		Operation op1 = (num) -> num + 1;
		
		int result = op1.increment(12);
		System.out.println(result);
		
		Operation op2 = (num) -> {
			if(num > 0) {
				return num + 1;
			}
			else {
				return 0;
			}
		};
		
	}
}

@FunctionalInterface
interface Operation {
	int increment(int number);
	//int decrement(int number);
}
