package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalInterfaces_Consumer {

	public static void main(String[] args) {
		//Consumer takes an input of any type
		//doesn't return anything
		//forEach method takes a Consumer as argument
		
		BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
		add.accept(12, 14);

		Consumer<Integer> print = num -> System.out.println(num);
		print.accept(12);
		
		Consumer<List<String>> printCollection = lst -> {
			for(String item : lst){
				System.out.println(item);
			}
		};
		printCollection.accept(Arrays.asList("Java", "Scala", "Ruby", "Python"));
	}

}

