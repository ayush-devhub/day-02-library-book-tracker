package dev.ayush.library;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public boolean checkoutBook(String isbn){
        for (Book book : books) {
            if (book.getIsbn() == isbn && book.isAvailable()){
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String isbn){
        for (Book book : books) {
            if (book.getIsbn() == isbn && !book.isAvailable()){
                return true;
            }
        }
        return false;
    }

    public void listAvailableBooks(){
        for (Book book : books) {
            if (book.isAvailable()){
                System.out.println(book);
            }
        }
    }

    public void listCheckedOutBooks(){
        for (Book book : books) {
            if (!book.isAvailable()){
                System.out.println(book);
            }
        }
    }
}
