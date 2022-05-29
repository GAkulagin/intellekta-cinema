package cinema;

public class Cinema {
	private String name;
	private String genre;
	private double time;
	
	public String getName() {
		return name;
	}
	public String getGenre() {
		return genre;
	}
	public double getTime() {
		return time;
	}
	
	public void setName(String name) {
		this.name = (name == null || name == "")? "default" : name;
	}
	public void setGenre(String genre) {
		this.genre = (genre == null || genre == "")? "default" : genre;
	}
	public void setTime(double time) {
		this.time = (time < 0)? 0 : time;	
	}
	
	public Cinema(String name, String genre, double time) {
		setName(name);
		setGenre(genre);
		setTime(time);
	}
}
