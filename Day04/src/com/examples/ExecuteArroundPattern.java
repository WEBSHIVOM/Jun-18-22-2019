package com.examples;

public class ExecuteArroundPattern {

	public static void main(String[] args) throws Exception{
		//Java 7
/*		try(Resource resource = new Resource()) {
			resource.doSomething();
			resource.doSomethingElse();
		}
		finally {
			System.out.println("In finally");
		}*/
		
		Resource.use(resource -> {
			resource.doSomething();
			resource.doSomethingElse();
		});
		
		System.out.println("-----End of main");
	}

}

class Resource implements AutoCloseable {

	public Resource() {
		System.out.println("Resource created");
	}
	
	public void doSomething() {
		System.out.println("doSomething called");
	}
	
	public void doSomethingElse() {
		System.out.println("doSomethingElse called");
	}
	
	public void close() throws Exception {
		System.out.println("Resource cleaned up");
	}
	
	
}
