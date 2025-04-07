package Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new ActionMovie("Avengers: Endgame", 181);
        Movie movie2 = new ComedyMovie("The Mask", 101);

        printMovieInfo(movie1);
        System.out.println();
        printMovieInfo(movie2);
    }

    public static void printMovieInfo(Movie movie) {
        movie.getDetails();
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Rating: " + movie.getRating());
    }
}

