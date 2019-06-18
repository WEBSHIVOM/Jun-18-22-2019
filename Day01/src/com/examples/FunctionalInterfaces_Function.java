package com.examples;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionalInterfaces_Function {

	public static void main(String[] args) {
		//Takes data of one type and returns data of another type
		//map is a HO function that takes Function as argument
		
		Function<Integer, Integer> inc = (num) -> num + 1;
		int result = inc.apply(12);
		System.out.println(result);
		
		
		IntFunction<Integer> increment = (num) -> num + 1;
		increment.apply(13);
		
		BiFunction<Integer, Integer, Boolean> divisibleBy 
				= (num, divisor) -> num % divisor == 0;
		divisibleBy.apply(100, 5);
		
		
		
		Function<Integer, Boolean> isEven = (num) -> num % 2 == 0;
		
		//pass a number X
		//square it
		//double it
		//decrement by 1
		
		Function<Integer, Integer> squareIt = num -> num * num;
		Function<Integer, Integer> doubleIt = num -> num + num;
		Function<Integer, Integer> decrementIt = num -> num - 1;
		
		int result2 = squareIt
			.andThen(doubleIt)
			.andThen(decrementIt)
			.apply(10);
		
		System.out.println(result2);
		
		
		
		
	}

}
