package com.lab02;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lab02Main {

	public static void main(String[] args) {
		/*Library library = new Library();
		
		List<Integer> evenNumbers = library.findEvenNumbers();
		List<Integer> oddNumbers = library.findOddNumbers();
		
		List<Integer> squares = library.findSquares();
		List<Integer> cubes = library.findCubes();
		*/
		
		StreamLibrary library = new StreamLibrary();
		
		Predicate<Integer> even = e -> e % 2 == 0;
		List<Integer> evenNumbers = library.find(even);
		List<Integer> oddNumbers = library.find(even.negate());
		
		List<Integer> squares = library.compute(e -> e * e);
		List<Integer> cubes = library.compute(e -> e * e * e);
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		System.out.println(squares);
		System.out.println(cubes);
	}

}
