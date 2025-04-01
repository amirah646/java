package Inheritance.LibraryManagement;

public class Librarian {
	 private String name;
	    private int id;
	    private String password;

	    public Librarian(String name, int id, String password) {
	        this.name = name;
	        this.id = id;
	        this.password = password;
	    }

	    public void verifyLibrarian() {
	        System.out.println("Librarian " + name + " verified.");
	    }

	    public void searchBook(LibraryDatabase db, String title) {
	        db.searchBook(title);
	    }
}
