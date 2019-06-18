package com.lab04;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		Function<Input, Input> aSquare = 
				(ip) -> new Input(ip.getA(), ip.getB(), ip.getResult() + (ip.getA() * ip.getA()));
		
		Function<Input, Input> bSquare = 
				(ip) -> new Input(ip.getA(), ip.getB(), ip.getResult() + (ip.getB() * ip.getB()));
		
		Function<Input, Input> _2ab = 
				(ip) -> new Input(ip.getA(), ip.getB(), ip.getResult() + (ip.getA() * ip.getB() * 2));
		
		Input formula = 
				aSquare
					.andThen(bSquare)
					.andThen(_2ab)
					.apply(new Input(10, 12, 0));
		
		Input formula2 = 
				bSquare
					.andThen(_2ab)
					.andThen(aSquare)
					.apply(new Input(10, 12, 0));
		
		System.out.println(formula2.getResult());
	}

}
