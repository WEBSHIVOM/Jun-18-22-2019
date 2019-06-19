package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

	static Map<Integer, String> romanNumerals = new HashMap<>();
	public static void main(String[] args) {
		romanNumerals.put(1, "I");
		romanNumerals.put(2, "II");
		romanNumerals.put(3, "III");

//		String roman1 = getRomanNumeral(1);
//		if(roman1 != null) {
//			System.out.println(roman1);	
//		}
//		else {
//			System.out.println("Roman for 1 is not available");
//		}
//		String roman21 = getRomanNumeral(21);
//		if(roman21 != null) {
//			System.out.println(roman21);	
//		}
//		else {
//			System.out.println("Roman for 21 is not available");
//		}
		
		Optional<String> roman1 = getRomanNumeral2(1);
		if(roman1.isPresent()) {
			System.out.println(roman1.get());
		}
		else {
			System.out.println("1 not present");
		}
		Optional<String> roman21 = getRomanNumeral2(21);
		//System.out.println(roman21.get());
		if(roman21.isPresent()) {
			System.out.println(roman21.get());
		}
		else {
			System.out.println("21 is not present");
		}
		
	}
	
	static Optional<String> getRomanNumeral2(int number) {
		//Optional<String> result = Optional.empty();
		Optional<String> result = Optional.ofNullable(romanNumerals.get(number));

		return result;
	}
	
	static String getRomanNumeral(int number) {
		return romanNumerals.get(number);
	}

}
