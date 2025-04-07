
import library.books.Book;
import library.members.Members;
import library.transcations.Transactions;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "123456");
        Members member1 = new Members("Alice", 101);

        Transactions txn1 = new Transactions(member1, book1);
        txn1.printTransaction();

        txn1.returnBook();
        System.out.println("Is the book available now? " + book1.isAvailable());
    }
}