package Movie;

public class MovieDemo {

	public static void main(String[] args) {
		Movie thriller=new ThrillerMovie("Sherlock",2010,"Benedict Cumberbatch");
		Movie horror=new HorrorMovie("The NUN II",2023,"Michael Chaves");
		
		System.out.println(thriller.getMovieDetails());
		System.out.println(horror.getMovieDetails());
	}

}
