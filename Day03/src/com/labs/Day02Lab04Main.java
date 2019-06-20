package com.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day02Lab04Main {

	private static List<String> places;
	public static void main(String[] args) throws IOException {
		places = loadPlacesFile();
		save(line -> line.split(",")[0], "./cities.txt");
		save(line -> line.split(",")[1], "./states.txt");
		
		printListOfCitiesByState();
		savePlacesAsJSON();
		
	}
	
	private static void savePlacesAsJSON() throws IOException{
		String json = places
			.stream()
			.skip(1)
			.map(line -> "{\"city\":\"" + line.split(",")[0] + "\",\"state\":\"" + line.split(",")[1] + "\"}")
			.collect(Collectors.joining(","));
		json = "{ \"places\":[" + json + "]}";
		Files.write(Paths.get("./places.json"), json.getBytes());
	}
	
	private static void printListOfCitiesByState() {
		Map<String, List<String>> stateWithCities = 
		places
			.stream()
			.skip(1)
			.collect(Collectors.groupingBy(line -> line.split(",")[1]));
		stateWithCities.forEach((state, cities) -> {
			System.out.println(state + ": " + cities.size());
		});
	}
	
	private static void save(Function<String, String> logic, String fileName) throws IOException{
		Set<String> set = places
			.stream()
			.skip(1)
			.map(logic)
			.collect(Collectors.toSet());
		String items = 	set
							.stream()
							.collect(Collectors.joining("\n"));
		
		Files.write(Paths.get(fileName), items.getBytes());
	}
	
	public static List<String> loadPlacesFile() throws IOException {
		return Files.readAllLines(Paths.get("./places.txt"));
	}
}
