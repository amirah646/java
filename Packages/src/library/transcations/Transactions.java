package library.transcations;

import library.books.Book;
import library.members.Members;

import java.util.Date;

public class Transactions {
    private Members member;
    private Book book;
    private Date date;

    public Transactions(Members member, Book book) {
        this.member = member;
        this.book = book;
        this.date = new Date();
        book.borrow();
    }

    public void returnBook() {
        book.returnBook();
    }

    public void printTransaction() {
        System.out.println(member + " borrowed \"" + book.getTitle() + "\" on " + date);
    }
}
