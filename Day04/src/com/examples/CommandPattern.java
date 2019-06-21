package com.examples;

public class CommandPattern {

	public static void main(String[] args) {
		TV sony = new TV("Sony");
		Remote remote = new Remote();
		
		TVOnCommand sonyOnCommand = new TVOnCommand(sony);
		TVOffCommand sonyOffCommand = new TVOffCommand(sony);
		
		remote.setTVOnCommand(sonyOnCommand);
		remote.setTVOffCommand(sonyOffCommand);

		
		remote.turnOn();
		remote.turnOff();
		
		TV micromax = new TV("Micromax");
		TVOnCommand micromaxOnCommand = new TVOnCommand(micromax);
		TVOffCommand micromaxOffCommand = new TVOffCommand(micromax);
		
		remote.setTVOnCommand(micromaxOnCommand);
		remote.setTVOffCommand(micromaxOffCommand);
		
		remote.turnOn();
		remote.turnOff();
	}

}
class Remote {
	private TVOnCommand tvOnCommand;
	private TVOffCommand tvOffCommand;
	
	public void setTVOnCommand(TVOnCommand tvOnCommand) {
		this.tvOnCommand = tvOnCommand;
	}
	
	public void setTVOffCommand(TVOffCommand tvOffCommand) {
		this.tvOffCommand = tvOffCommand;
	}
	
	public void turnOn() {
		tvOnCommand.doSomething();
	}
	public void turnOff() {
		tvOffCommand.doSomething();
	}
}

interface Command {
	void doSomething();
}

class TVOnCommand implements Command {
	private TV tv;
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}
	
	public void doSomething() {
		tv.turnOn();
	}
}

class TVOffCommand implements Command {
	private TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}
	
	public void doSomething() {
		tv.turnOff();
	}
}

class TV {
	private String model;
	public TV(String model) {
		this.model = model;
	}
	
	public void turnOn() {
		System.out.println(model + " turned on");
	}
	
	public void turnOff() {
		System.out.println(model + " turned off");
	}
}
