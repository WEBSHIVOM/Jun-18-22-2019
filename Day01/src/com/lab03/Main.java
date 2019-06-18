package com.lab03;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		//Given a user name, 
		//validate if it's blank and not null and empty and length > 6

		String userName = "kllkdfs";
		Predicate<String> nullValidation = (value) -> value != null;
		Predicate<String> blank = (value) -> !value.isEmpty();
		Predicate<String> length = (value) -> value.length() > 6;
		
		boolean result = nullValidation
								.and(blank)
								.and(length)
								.test(userName);
		System.out.println(result);
		
	}

}


