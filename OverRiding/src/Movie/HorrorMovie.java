package Movie;

public class HorrorMovie extends Movie{
	String director;
	
	public HorrorMovie(String title,int releaseyear,String director){
		super(title,releaseyear);
		this.director=director;
	}
	
	public String getMovieDetails(){
		return "HorrorMovie--> "+super.getMovieDetails()+" DirectorName: "+director;
	}
}
