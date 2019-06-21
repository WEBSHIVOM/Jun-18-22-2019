package com.examples;

import java.util.ArrayList;
import java.util.List;


public class ObserverPattern {

	public static void main(String[] args) throws Exception{
		CricketMatch cricketMatch = new CricketMatch();
		cricketMatch.addObserver(new NewsWebsite());
		cricketMatch.addObserver(new SoftwareEngineer());
		
		cricketMatch.provideMatchStatus("Virat is out");
		Thread.sleep(3000);
		cricketMatch.provideMatchStatus("MS is out");
		Thread.sleep(3000);
		cricketMatch.provideMatchStatus("Pandya hit a six");
		
	}

}

class CricketMatch {
	private List<CricketMatchObserver> observers = new ArrayList<>();

	public void addObserver(CricketMatchObserver cricketMatchObserver) {
		observers.add(cricketMatchObserver);
	}
	public void provideMatchStatus(String info) {
		observers.forEach(ob -> ob.notify(info));
	}
	
}

interface CricketMatchObserver {
	void notify(String matchInformation); 
}

class NewsWebsite implements CricketMatchObserver {
	public void notify(String matchInformation) {
		System.out.println("***BREAKING NEWS*** " + matchInformation);
	}
}
class SoftwareEngineer implements CricketMatchObserver {
	public void notify(String matchInformation) {
		System.out.println("---KILLING TIME---" + matchInformation);
	}
}




