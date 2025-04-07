package Movie;

class ActionMovie extends Movie {
    public ActionMovie(String title, int durationInMinutes) {
        super(title, durationInMinutes);
    }

    @Override
    public String getGenre() {
        return "Action";
    }

    @Override
    public String getRating() {
        return "PG-13";
    }
}