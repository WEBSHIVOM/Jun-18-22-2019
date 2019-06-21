package com.examples;

public interface Shape {
	void draw();
	
	default void erase() {
		System.out.println("Erasing shape");
	}
	
	static void printInfo() {
		System.out.println("Shape printinfo");
	}
}
