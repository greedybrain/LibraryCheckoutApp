package tut.java.library_app;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Hi, what's your name: ");
        var willis = new User(scanner.nextLine());
        var librarian = new Librarian("Mary Campbell");
        var receipt = new Receipt();

        librarian.handleCheckoutFor(willis);
        receipt.displayOfTransactionInfo(willis, librarian); // everyone involved in transaction
    }
}

// TODO - Create a library application
// A user can check in a book
