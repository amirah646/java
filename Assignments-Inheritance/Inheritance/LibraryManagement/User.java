package Inheritance.LibraryManagement;

public class User {
	public String name;
    public int id;
    public Account account;

    public User(String name, int id) {
    	this.name = name;
        this.id = id;
        this.account = new Account();
	}


	public void verify() {
        System.out.println("User " + name + " verified.");
    }

    public void checkAccount() {
        account.displayAccountInfo();
    }

    public void getBookInfo(Book book) {
        System.out.println("Book Info: " + book.getDetails());
    }
}
