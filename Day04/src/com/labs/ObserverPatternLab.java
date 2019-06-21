package com.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ObserverPatternLab {

	public static void main(String[] args) throws Exception{
		CricketMatch cricketMatch = new CricketMatch();
		SoftwareEngineer sam = new SoftwareEngineer();
		NewsWebsite toi = new NewsWebsite();
		
		cricketMatch.addObserver(sam::wasteTime);
		cricketMatch.addObserver(toi::displayInNews);
		cricketMatch.addObserver((info) -> System.out.println("WTH: " + info));
		
		cricketMatch.provideMatchStatus("Virat is out");
		Thread.sleep(3000);
		cricketMatch.provideMatchStatus("MS is out");
		Thread.sleep(3000);
		cricketMatch.provideMatchStatus("Pandya hit a six");

	}

}

class CricketMatch {
	private List<Consumer<String>> observers = new ArrayList<>();

	public void addObserver(Consumer<String> cricketMatchObserver) {
		observers.add(cricketMatchObserver);
	}
	public void provideMatchStatus(String info) {
		observers.forEach(ob -> ob.accept(info));
	}

}


class NewsWebsite {
	public void displayInNews(String matchInformation) {
		System.out.println("***BREAKING NEWS*** " + matchInformation);
	}
}
class SoftwareEngineer {
	public void wasteTime(String matchInformation) {
		System.out.println("---KILLING TIME---" + matchInformation);
	}
}




