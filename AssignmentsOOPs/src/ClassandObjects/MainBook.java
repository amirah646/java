package ClassandObjects;

public class MainBook {
    public static void main(String[] args) {
        // Creating book objects
        BookDTO book1 = new BookDTO("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99, 1925);
        BookDTO book2 = new BookDTO("1984", "George Orwell", "9780451524935", 8.99, 1949);
        // Display book details using getter methods
//        System.out.println("Book 1 Details:");
//        System.out.println("Title: " + book1.getTitle());
//        System.out.println("Author: " + book1.getAuthor());
//        System.out.println("ISBN: " + book1.getIsbn());
//        System.out.println("Price: $" + book1.getPrice());
//        System.out.println("Publication Year: " + book1.getPublicationyear());
//        System.out.println();
//
//        System.out.println("Book 2 Details:");
//        System.out.println("Title: " + book2.getTitle());
//        System.out.println("Author: " + book2.getAuthor());
//        System.out.println("ISBN: " + book2.getIsbn());
//        System.out.println("Price: $" + book2.getPrice());
//        System.out.println("Publication Year: " + book2.getPublicationyear());
//        System.out.println();
        // Display total number of books create
        System.out.println("Total Books Created: " + BookDTO.getCount());
        System.out.println(book1);
        System.out.println(book2);
    }
}
