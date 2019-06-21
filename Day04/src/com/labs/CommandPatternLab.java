package com.labs;

public class CommandPatternLab {

	public static void main(String[] args) {
		TV sony = new TV("Sony");
		Remote remote = new Remote();
		
//		remote.setTVOnCommand(sony::turnOn);
//		remote.setTVOffCommand(sony::turnOff);
		
		remote.setTVOnCommand(() -> sony.turnOn());
		remote.setTVOffCommand(() -> sony.turnOff());
		
		remote.turnOn();
		remote.turnOff();
		
		TV micromax = new TV("Micromax");
		
		remote.setTVOnCommand(micromax::turnOn);
		remote.setTVOffCommand(micromax::turnOff);
		
		remote.turnOn();
		remote.turnOff();
	}

}
class Remote {
	private Command tvOnCommand;
	private Command tvOffCommand;
	
	public void setTVOnCommand(Command tvOnCommand) {
		this.tvOnCommand = tvOnCommand;
	}
	
	public void setTVOffCommand(Command tvOffCommand) {
		this.tvOffCommand = tvOffCommand;
	}
	
	public void turnOn() {
		tvOnCommand.doSomething();
	}
	public void turnOff() {
		tvOffCommand.doSomething();
	}
}

@FunctionalInterface
interface Command {
	void doSomething();
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
