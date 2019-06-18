package com.examples;

import java.util.Arrays;
import java.util.List;

public class WarmUp {

	static List<String> cities = 
			Arrays.asList("Chennai", "Delhi", "Cochin", "Pune", "Mumbai");
	public static void main(String[] args) {
		
		
		//find the list of cities that begin with letter C
		findCitiesBeginningWith("C");
		
		//check if a given city say Bangalore exists
		findCity("Bangalore");
		
	}
	
	//Declarative Style or functional style
	//Specify what to do AND NOT how to do?
	//Concise
	//Easily make it run in parallel
	//No External Iteration
	//Treat functions as first class citizens
	//Chain or compose functions; pass functions as arguments
	

	//Imperative Style
	//Specify What to do and also How to do?
	
	//Pros
	//Job security
	
	//Cons
	//Too many lines; Verbose
	//Difficult to parallelize the code
	
	private static void findCity(String city) {
		boolean found = false;
		for (int i = 0; i < cities.size(); i++) {
			if(cities.get(i).equalsIgnoreCase(city)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println(city + " is present in the list");
		}
		else {
			System.out.println(city + " is not present in the list");
		}
	}

	private static void findCitiesBeginningWith(String letter) {
		for (int i = 0; i < cities.size(); i++) {
			String city = cities.get(i);
			if(city.startsWith(letter)) {
				System.out.println(city);
			}
		}
	}

}
