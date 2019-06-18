package com.examples;

import java.util.Arrays;
import java.util.List;

public class DeclarativeStyle {

	static List<String> cities = 
			Arrays.asList("Chennai", "Delhi", "Cochin", "Pune", "Mumbai");
	public static void main(String[] args) {
		//find the list of cities that begin with letter C
		findCitiesBeginningWith("C");

		//check if a given city say Bangalore exists
		findCity("Bangalore");
	}
	
	//Declarative style
	private static void findCity(String city) {
		String message = cities
			.stream()
			.filter(item -> item.equalsIgnoreCase(city))
			.findAny()
			.orElse(city + " is not present");
		
		System.out.println(message);
		
	}

	//No external iterators
	//Concise
	//What to do?
	//Chain functions
	//No mutability
	//Declarative style
	private static void findCitiesBeginningWith(String letter) {
		cities
			.stream()
			.filter(city -> city.startsWith("C"))
			.forEach(System.out::println);
	}
	
	
	
	
	

}
