package com.examples;

public class Lambda3 {

	public static void main(String[] args) {
		
		Worker sam = () -> System.out.println("Writing code");
		doSomething(sam);
		
		doSomething(() -> System.out.println("Eating all the time"));
		doSomething(() -> System.out.println("Sleeping"));
		doSomething(() -> System.out.println("Feel hungry"));
		
	}
	//Higher Order Function
	public static void doSomething(Worker worker) {
		worker.work();
	}
}

@FunctionalInterface
interface Worker {
	void work();
}


