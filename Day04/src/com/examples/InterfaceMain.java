package com.examples;

public class InterfaceMain {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.draw();
		circle1.erase();
		
		Shape.printInfo();
	}

}
