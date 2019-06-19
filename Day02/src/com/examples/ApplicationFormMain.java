package com.examples;

public class ApplicationFormMain {

	public static void main(String[] args) {
		ApplicationForm appForm = new ApplicationForm();
		appForm.setName("Sam");
		appForm.setAge(12);
		appForm.setEmail("sam@gmail.com");
		appForm.setPhone("39048324134");
		
		ApplicationForm appForm2 = new ApplicationForm();
		
		appForm2
			.setName("Sam")
			.setAge(12)
			.setEmail("sam@yahoo.com")
			.setPhone("343244324");
		
	}

}
