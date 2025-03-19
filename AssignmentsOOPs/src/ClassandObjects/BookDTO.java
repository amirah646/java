package ClassandObjects;

public class BookDTO {
	private static int count=0;
	private String title;
	private String author;
	private double price;
	private String isbn;
	private int publicationyear;
	
	public BookDTO(String title, String author, String isbn, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publicationyear = publicationYear;
        count++; // Increment book count when a new book is created
    }
	
	
	public static int getCount() {
		return count;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublicationyear() {
		return publicationyear;
	}

	public void setPublicationyear(int publicationyear) {
		this.publicationyear = publicationyear;
	}
	@Override
	public String toString(){
		return "BookDTO{" +
                "Title=" + title +
                ", Author=" + author +
                ", ISBN=" + isbn + 
                ", Price=$" + price +
                ", Publication Year=" + publicationyear +
                '}';
	}
}
