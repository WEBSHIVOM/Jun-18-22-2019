package com.labs.lab02;

public class Lab02Main {

	public static void main(String[] args) {
		/*
		Logger logger = new Logger();
		if (logger.isDebugEnabled()) {
			logger.debug("Look at this horrible error");
		}
		*/
		
		Logger logger = new Logger();	
		logger.debug(() -> "Look at this horrible error");
		
		logger.debug(() -> {
			System.out.println("I am sending out an email to the LEAD");
			return "Look at this horrible error";
		});
		
		logger.debug(() -> {
			System.out.println("SMS the team");
			return "Look at this horrible error";
		});
	}

}
