package Constructors;

import ClassandObjects.BookDTO;

public class ArrayBooks extends BookDTO{

	public ArrayBooks(String title, String author, String isbn, double price,
			int publicationYear) {
		super(title, author, isbn, price, publicationYear);
	}

	public static void main(String[] args) {
		BookDTO[] bookArray=new BookDTO[10];
		int bookCount=0;
		bookArray[bookCount++] = new BookDTO("The Silent Patient", "Alex Michaelides", "978-1250301697", 14.99, 2019);
        bookArray[bookCount++] = new BookDTO("Where the Crawdads Sing", "Delia Owens", "978-0735219090", 16.99, 2018);
        bookArray[bookCount++] = new BookDTO("Project Hail Mary", "Andy Weir", "978-0593135204", 18.00, 2021);
        bookArray[bookCount++] = new BookDTO("The Midnight Library", "Matt Haig", "978-0525594701", 15.99, 2020);
        bookArray[bookCount++] = new BookDTO("Dune", "Frank Herbert", "978-0441172719", 12.50, 1965);
        bookArray[bookCount++] = new BookDTO("The Hobbit", "J.R.R. Tolkien", "978-0547928227", 11.00, 1937);
        bookArray[bookCount++] = new BookDTO("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "978-0062316255", 20.00, 2014);
        bookArray[bookCount++] = new BookDTO("The Girl with the Dragon Tattoo", "Stieg Larsson", "978-0307454546", 13.50, 2005);
        bookArray[bookCount++] = new BookDTO("Life of Pi", "Yann Martel", "978-0156027322", 14.00, 2001);
        bookArray[bookCount++] = new BookDTO("The Book Thief", "Markus Zusak", "978-0375831003", 15.50, 2005);

        System.out.println("Books in the library:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(bookArray[i]);
        }
		
	}

}
