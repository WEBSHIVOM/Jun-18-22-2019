import java.util.ArrayList;
import java.util.List;

public class Movie {
    
    private String name;
	private int yearOfRelease;
    private List<Actor> actors;
	private String language;

	
    public Movie(String name, int yearOfRelease, List<Actor> actors, String language) {
        this.name = name;
		this.yearOfRelease = yearOfRelease;
        this.actors = new ArrayList<>(actors);
        this.language = language;
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYearOfRelease() {
		return yearOfRelease;
	}


	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}


	public List<Actor> getActors() {
		return actors;
	}


	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}
    
}
