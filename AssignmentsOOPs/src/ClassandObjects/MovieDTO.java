package ClassandObjects;

public class MovieDTO {
	private String moviename;
	private String actor;
	private String journal;
	private String director;
	public MovieDTO(String moviename, String actor, String journal,
			String director) {
		this.moviename = moviename;
		this.actor = actor;
		this.journal = journal;
		this.director = director;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString(){
		return "{MovieDTO:"+
					" MovieName: "+moviename+
					",Actor: "+actor+
					",MovieJournal: "+journal+
					",Director:"+director+
					"}";
	}
}
