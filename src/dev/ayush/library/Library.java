package dev.ayush.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public boolean checkoutBook(String isbn){
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()){
                book.setAvailable(false);
                System.out.println("Book with isbn " + isbn + " checkout successful");
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String isbn){
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()){
                book.setAvailable(true);
                System.out.println("Book with isbn " + isbn + " returned successfully");
                return true;
            }
        }
        return false;
    }

    public void listAvailableBooks(){
        if (!books.isEmpty()){
            for (Book book : books) {
                if (book.isAvailable()){
                    System.out.println(book);
                }
            }
        }else {
            System.out.println("No books available!");
        }
    }

    public void listCheckedOutBooks(){
        if (!books.isEmpty()){
            for (Book book : books) {
                if (!book.isAvailable()){
                    System.out.println(book);
                }
            }
        }else {
            System.out.println("No books available in the library.");
        }
    }
}
