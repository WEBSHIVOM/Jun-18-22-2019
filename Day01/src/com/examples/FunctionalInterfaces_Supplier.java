package com.examples;

import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class FunctionalInterfaces_Supplier {

	public static void main(String[] args) {
		//Supplier supplies data of given type
		//It does not take any input
		
		
		Supplier<Double> randomNo = () -> Math.random() * 100;
		System.out.println(randomNo.get());
		
		DoubleSupplier randomNo2 = () -> Math.random() * 1000;
		System.out.println(randomNo2.getAsDouble());
		
		Supplier<Date> now = () -> new Date();
		System.out.println(now.get());
		
	}

}

