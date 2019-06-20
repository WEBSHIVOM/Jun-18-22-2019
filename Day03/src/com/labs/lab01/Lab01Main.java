package com.labs.lab01;

import java.util.List;
import java.util.stream.Collectors;

public class Lab01Main {

	public static String getMovieNamesOf(Movie movie) {
		String movieName = movie.getActors()
			.stream()
			.filter(actor -> actor.getName().contains("Aamir"))
			.map(actor -> movie.getName())
			.findFirst()
			.orElse(null);
		return movieName;	
	}
	public static void main(String[] args) {
		List<Movie> movies = Data.getMovies();
		
		//Print the name of all the movies that Amitabh has acted
		movies
			.stream()
			.map(movie -> movie.getActors()
									.stream()
									.filter(actor -> actor.getName().contains("Aamir"))
									.map(e -> movie.getName())
									.findFirst()
									.orElse(null))
								.filter(moviename -> moviename != null)
								.forEach(System.out::println);
		
		
		
		//Print the nationality of all actors who have acted in movies in between 2000 - 2010
		movies
			.stream()
			.filter(movie -> movie.getYearOfRelease() >= 2000)
			.filter(movie -> movie.getYearOfRelease() <= 2010)
			.map(movie -> movie.getActors())
			.flatMap(lst -> lst.stream())
			.map(actor -> actor.getName() + ": " + actor.getNationality())
			.distinct()
			.forEach(System.out::println);
			
		
		//Print the name of all the movies 
		//grouped by actor and supporting actors
		System.out.println();
		movies
			.stream()
			.map(movie -> movie.getActors()
							.stream()
							.map(actor -> movie.getName() + ";" + actor.getName())
							.collect(Collectors.toList()))
			.flatMap(lst -> lst.stream())
			.collect(Collectors.groupingBy(item -> item.split(";")[1]))
			.forEach((actor, moviesList) -> {
				System.out.println("** " + actor + " **");
				moviesList
					.stream()
					.map(it -> it.split(";")[0])
					.forEach(System.out::println);
			});
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
