package com.labs.lab01;
import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

public class Data {

    public static Actor amitabh = new Actor("Amitabh Bachchan", 75, "India");
    public static Actor aamir = new Actor("Aamir Khan", 50, "India");
    public static Actor cruise = new Actor("Tom Cruise", 56, "US");
    public static Actor rowan = new Actor("Rowan Atkinson", 62, "UK");
    public static Actor hugh = new Actor("Hugh Jackman", 50, "Australia");
	
	
	public static Actor supportingActor1 = new Actor("SA 1", 32, "India");
	public static Actor supportingActor2 = new Actor("SA 2", 28, "India");
	public static Actor supportingActor3 = new Actor("SA 3", 43, "UK");
	public static Actor supportingActor4 = new Actor("SA 4", 18, "UK");
	public static Actor supportingActor5 = new Actor("SA 5", 65, "US");
	public static Actor supportingActor6 = new Actor("SA 6", 35, "US");
	public static Actor supportingActor7 = new Actor("SA 7", 25, "Australia");
	public static Actor supportingActor8 = new Actor("SA 8", 76, "Australia");


	public static Movie thugs = new Movie("ToH", 2018, asList(amitabh, aamir, supportingActor1, supportingActor2, supportingActor8), "Hindi");
	public static Movie xmen = new Movie("X-Men", 2012, asList(hugh, supportingActor7, supportingActor8, supportingActor1), "English");
	public static Movie bean = new Movie("Mr.Bean", 2010, asList(rowan, supportingActor1, supportingActor2, supportingActor3, supportingActor4), "Hindi");
	public static Movie lagaan = new Movie("Lagaan", 2001, asList(aamir, supportingActor1, supportingActor2, supportingActor3, supportingActor4, supportingActor5, supportingActor6), "Hindi");
	public static Movie lor = new Movie("Lord of the Rings", 2002, asList(supportingActor1, supportingActor2, supportingActor3, supportingActor4, supportingActor5, supportingActor6, supportingActor7, supportingActor8), "English");	
	public static Movie mi = new Movie("Mission Impossible", 1998, asList(cruise, supportingActor1, supportingActor2, supportingActor3, supportingActor4), "English");
	

    public static List<Movie> getMovies() {
        return Arrays.asList(thugs, xmen, bean, lagaan, lor, mi);
    }

}
