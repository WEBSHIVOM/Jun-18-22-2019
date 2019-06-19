package com.lab03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Main {
	static List<Integer> numbers = 
			Arrays.asList(11, 42, 3, 4, 15, 6, 7, 8, 9, 10);
	
	public static void main(String[] args) {
		final int largest = find((i, j) -> i > j ? i : j);
		System.out.println("Largest: " + largest);
		
		final int smallest = find((i, j) -> i < j ? i : j);
		System.out.println("Smallest: " + smallest);
		
		int min = IntStream.of(11, 42, 3, 4, 15, 6, 7, 8, 9, 10)
					.min()
					.getAsInt();
		System.out.println("Min: " + min);
		
		int max = IntStream.of(11, 42, 3, 4, 15, 6, 7, 8, 9, 10)
					.max()
					.getAsInt();
		System.out.println("Max: " + max);
		
		//Find the double of the first even number 
		//greater than 3 
		//or else return -1.
		int output = numbers
			.stream()
			.filter(e -> e % 2 == 0)
			.filter(e -> e > 3)
			.map(e -> e * 2)
			.findFirst()
			.orElse(-1);
		System.out.println(output);
	}
	
	private static int find(BinaryOperator<Integer> logic) {
		return numbers
			.stream()
			.reduce(logic)
			.get();
	}

}
