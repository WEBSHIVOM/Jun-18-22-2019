package com.examples;

import java.util.Arrays;
import java.util.List;

public class WorkingOfStream {

	public static void main(String[] args) {
		List<String> langs = 
				Arrays.asList("Java", "Joomla", "Ruby", "JavaScript", "Scala", "Clojure");
		
		//Print only one language that begin with J
		//And length greater than 5
		
		//Lazy evaluation
		String lang = langs
			.stream()
			.filter(e -> {
				System.out.println("****J filter called for " + e);
				return e.startsWith("J");	
			})
			.filter(e -> {
				System.out.println("----Length filter called for " + e);
				return e.length() > 5;	
			})
			.findAny()
			.get();
		
		System.out.println(lang);
		
//			.forEach(e -> {
//				System.out.println(e);
//			});
	}

}





