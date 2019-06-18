package com.examples;

public interface Person {
	default String name() {
		return null;
	}
	default int age() {
		return 0;
	}
}

class PersonImpl implements Person {
	
}