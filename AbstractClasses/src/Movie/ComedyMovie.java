package Movie;

class ComedyMovie extends Movie {
    public ComedyMovie(String title, int durationInMinutes) {
        super(title, durationInMinutes);
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }

    @Override
    public String getRating() {
        return "PG";
    }
}