package tut.java.library_app;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Hi, what's your name: ");
        var willis = new User(scanner.nextLine());
        var librarian = new Librarian("Mary Campbell");
        librarian.handleCheckoutFor(willis);
    }
}

// TODO - Create a library application
// A user can sample a book before checking it out.
// A user can checkout a book (up to 5 at a time)
// A user can check in a book
// TODO - BONUS > The same book cannot be checked out by another user
