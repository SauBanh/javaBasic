package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("1 Book found: \n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        }else {
            System.out.println("0 Book found.");
        }
        System.out.println("\n\n");
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Searching for books Title %s.\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s", books.size() > 0 ? ":" : ".");
        for (Book book : books) {
            System.out.printf("Title: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println();
    }

    public void checkOutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkOut()) {
                System.out.println("Book checked out successfully.");
                System.out.printf("Title: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
            }else {
                System.out.println("Check out failed.");
                System.out.printf("Title: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
                System.out.println("Reason: More books checked out than recorded quantity.");
            }
        }else {
            System.out.println("Failed to check out book.\n");
            System.out.printf("Reason: There is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println();
    }

    public void checkInBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            book.checkIn();
            System.out.println("Book checked in successfully.");
        }else {
            System.out.println("Failed to check in book.\n");
            System.out.printf("Reason: There is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println();
    }
}
