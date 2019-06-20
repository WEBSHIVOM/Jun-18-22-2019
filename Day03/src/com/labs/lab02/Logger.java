package com.labs.lab02;

import java.util.function.Supplier;

class Logger {
	private int level = 1;

	public Logger() {
	}
	
	public Logger(int level) {
		this.level = level;
	}
	
	private boolean isDebugEnabled() {
		return level == 1;
	}
	
	private void debug(String message) {
		System.out.println(message);
	}
	
	public void debug(Supplier<String> supplier) {
		if(isDebugEnabled()) {
			String message = supplier.get();
			debug(message);
		}
	}
}