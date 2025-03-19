package Constructors;

import ClassandObjects.MovieDTO;

public class Movie extends MovieDTO {

	public Movie(String moviename, String actor, String journal, String director) {
		super(moviename, actor, journal, director);
	}

	public static void main(String[] args) {
		MovieDTO[] movie=new MovieDTO[10];
		int moviecount=0;
		movie[moviecount++]=new MovieDTO("Aashiqui2","Adhithya Roy Kapoor","Romance","Mohit Suri");
		for(int i=0;i<moviecount;i++){
			System.out.print(movie[i]);
		}
	}

}
