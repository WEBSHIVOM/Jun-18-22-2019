package com.examples;

import java.util.Arrays;
import java.util.List;

public class WorkingOfStream {

	public static void main(String[] args) {
		List<String> langs = 
				Arrays.asList("Java", "Ruby", "JavaScript", "Scala", "Clojure");
		
		//Print all the languages that begin with J
		//And length greater than 5
		
		langs
			.stream()
			.filter(e -> {
				System.out.println("****J filter called for " + e);
				return e.startsWith("J");	
			})
			.filter(e -> {
				System.out.println("----Length filter called for " + e);
				return e.length() > 5;	
			})
			.forEach(e -> {
				System.out.println(e);
			});
	}

}





