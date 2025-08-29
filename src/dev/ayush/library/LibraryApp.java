package dev.ayush.library;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            showMenu();
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            System.out.println();
            handleUserInput(choice, library, scanner);
            System.out.println();
        }
    }

    public static void showMenu() {
        System.out.println("===== Library Book Tracker =====\n" +
                "1. Add Book\n" +
                "2. Checkout Book\n" +
                "3. Return Book\n" +
                "4. List Available Books\n" +
                "5. List Checked Out Books\n" +
                "6. Exit");
    }


    public static void handleUserInput(int choice, Library library, Scanner scanner) {
        scanner.nextLine();
        switch (choice){
            case 1:{
                String isbn, author, title;
                System.out.print("Enter Title: ");
                title = scanner.nextLine();
                System.out.print("Enter Author: ");
                author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                isbn = scanner.nextLine();
                library.addBook(new Book(title, author, isbn));
                System.out.println("Book added successfully!");
                break;
            }
            case 2:{
                System.out.print("Enter isbn: ");
                String isbn = scanner.nextLine();
                library.checkoutBook(isbn);
                break;
            }

            case 3:{
                System.out.print("Enter isbn: ");
                String isbn = scanner.nextLine();
                library.returnBook(isbn);
                break;
            }

            case 4:{
                library.listAvailableBooks();
                break;
            }

            case 5:{
                library.listCheckedOutBooks();
                break;
            }

            case 6:{
                System.exit(0);
            }
        }
    }
}
