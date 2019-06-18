package com.examples;

public class Lambda1 {
	
	public static void main(String[] args) {
		//Lambda1$1.class generated
		Greeting greeting1 = new Greeting() {
			public void greet() {
				System.out.println("Hi");
			}
		};	
		greeting1.greet();
		
		//A new anonymous inner class is "Synthesized"
		Greeting greeting2 = () -> System.out.println("Hello Lambda");
		greeting2.greet();
		System.out.println(greeting2.getClass().getName());
		
		//Shape square = () -> System.out.println("");
		Car car1 = (int speed) -> System.out.println("Driving at a speed of " + speed + "kmph");
		Car car2 = (speed) -> System.out.println("Driving at a speed of " + speed + "kmph");
		
		car1.drive(100);
		car2.drive(200);
	}

}

interface Car {
	void drive(int speed);
}

interface Shape {
	void draw();
	void erase();
}

class GreetingImpl implements Greeting {
	public void greet() {
		System.out.println("Hello");
	}
}

interface Greeting {
	void greet();
}
