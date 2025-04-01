package Inheritance.LibraryManagement;

public class Account {
	private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private double fineAmount;

    public void calculateFine() {
        fineAmount = noLostBooks * 10.0; // Example fine calculation
        System.out.println("Fine calculated: " + fineAmount);
    }

    public void displayAccountInfo() {
        System.out.println("Borrowed Books: " + noBorrowedBooks);
        System.out.println("Reserved Books: " + noReservedBooks);
        System.out.println("Returned Books: " + noReturnedBooks);
        System.out.println("Lost Books: " + noLostBooks);
        System.out.println("Fine Amount: " + fineAmount);
    }
}
