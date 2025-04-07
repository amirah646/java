package Movie;

public class Movie {
	String title;
	int releaseyear;
	
	public Movie(String title,int releaseyear){
		this.title=title;
		this.releaseyear=releaseyear;
	}
	
	public String getMovieDetails(){
		return "Title: "+title+"Release Year: "+releaseyear;
	}
}
