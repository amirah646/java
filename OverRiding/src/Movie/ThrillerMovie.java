package Movie;

public class ThrillerMovie extends Movie {
String leadactor;

public ThrillerMovie(String title,int releaseyear,String leadactor){
	super(title,releaseyear);
	this.leadactor=leadactor;
}

public String getMovieDetails(){
	return "ThrillerMovie--> "+super.getMovieDetails()+" LeadActor: "+leadactor;
}
}
