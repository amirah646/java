package Inheritance.LibraryManagement;

public class Book {
	 private String title, author, isbn, publication;

	    public Book(String title, String author, String isbn, String publication) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.publication = publication;
	    }

	    public void showDueDate() {
	        System.out.println("Due date for book " + title + " is in 14 days.");
	    }
	    
	    public String getDetails() {
	        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Publication: " + publication;
	    }
}
