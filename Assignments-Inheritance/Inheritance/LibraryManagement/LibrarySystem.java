package Inheritance.LibraryManagement;

public class LibrarySystem {

	public static void main(String[] args) {
		LibraryManagementSystem system = new LibraryManagementSystem("Student", "Alice", "password123");
        system.register();
        system.login();
        
        User student = new Student("Alice", 101, "CS");
        student.verify();
        student.checkAccount();
        
        Librarian librarian = new Librarian("Mr. Smith", 201, "libpass");
        librarian.verifyLibrarian();
        
        LibraryDatabase db = new LibraryDatabase();
        Book book1 = new Book("Java Programming", "John Doe", "12345", "Tech Press");
        Book book2 = new Book("Data Structures", "Jane Smith", "67890", "CS Press");
        
        db.addBook(book1);
        db.addBook(book2);
        
        db.displayBooks();
        librarian.searchBook(db, "Java Programming");
        
        system.logout();

	}

}
