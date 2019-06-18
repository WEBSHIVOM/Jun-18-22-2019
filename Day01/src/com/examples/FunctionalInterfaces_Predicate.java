package com.examples;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class FunctionalInterfaces_Predicate {

	public static void main(String[] args) {
		//Predicate is a FunctionalInterface
		//takes any type as input and returns boolean as output
		
		//filter methods used in Stream
		//filter takes in a Predicate as parameter
		
		Predicate<String> startsWithC = (city) -> city.startsWith("C");
		startsWithC.test("Chennai");
		
		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		System.out.println(isEven.test(12));
		System.out.println(isEven.test(121));
		
		
		Predicate<Integer> isOdd = (num) -> num % 2 != 0;
		isOdd.test(11);
		isEven.negate().test(11);
		
		NumberCheck check1 = (num) -> num % 2 == 0;
		check1.isEven(12);
		check1.isEven(14);
	}

}

@FunctionalInterface
interface NumberCheck {
	boolean isEven(int num);
}
