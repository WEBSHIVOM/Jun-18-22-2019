package com.examples;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	public void erase() {
		Shape.super.erase();
		System.out.println("Overriden erase");
	}

}
