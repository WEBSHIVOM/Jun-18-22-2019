package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample1 {

	public static void main(String[] args) {
		//Stream is an abstraction of a collection
		//You create a stream on a collection so that you can access
		//its methods in a declarative style
		
		List<String> langs = 
				Arrays.asList("Java", "Ruby", "JS", "Clojure");
		Stream<String> stream = langs.stream();
		System.out.println(stream);
		
		IntStream numbersStream = IntStream.range(1, 100);
		
		Stream<String> langStream = 
				Stream.of("Java", "Groovy", "Scala", "Python");
		langs
			.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		langs
			.forEach(System.out::println);
		
		DoubleStream doubleStream = DoubleStream.of(1.23, 3.4, 5.6);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
