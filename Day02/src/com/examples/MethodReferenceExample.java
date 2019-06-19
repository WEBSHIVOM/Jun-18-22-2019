package com.examples;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "JS", "Ruby", "Scala");
		
		languages.forEach(lang -> System.out.println(lang));
		languages.forEach(System.out::println);
		
		languages.forEach(MethodReferenceExample::printLanguage);
		
		languages
			.stream()
			.filter(lang -> lang.startsWith("J"))
			.forEach(lang -> System.out.println(lang));

		MethodReferenceExample mre = new MethodReferenceExample();

		languages
			.stream()
			.filter(mre::startsWithLetterJ)
			.forEach(MethodReferenceExample::printLanguage);
		
	}
	
	public boolean startsWithLetterJ(String language) {
		return language.startsWith("J");
	}
	
	public static boolean startsWithJ(String language) {
		return language.startsWith("J");
	}
	
	public static void printLanguage(String language) {
		System.out.println(language);
	}

}
