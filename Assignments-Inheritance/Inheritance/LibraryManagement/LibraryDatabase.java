package Inheritance.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
	private List<Book> books;

    public LibraryDatabase() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getDetails());
    }

    public void deleteBook(String title) {
        books.removeIf(book -> book.getDetails().contains(title));
        System.out.println("Book removed: " + title);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }
    
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getDetails().contains(title)) {
                System.out.println("Book found: " + book.getDetails());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
