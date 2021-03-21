package tut.java.library_app;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Librarian extends Person {
    private static final List<Book> BOOKS = Inventory.all();

    public Librarian(String fullName) { super(fullName); }

    public void handleCheckoutFor(User user) {
        Scanner scanner1 = new Scanner(System.in);

        while(true) {
            Inventory.showOptions();

            var selection = scanner1.nextInt();
            if (!isValidSelection(selection)) continue;

            var userCheckouts = user.getCheckouts();
            if (userCheckouts.contains(BOOKS.get(selection - 1))) {
                System.out.println("You already checked that book out, try another");
                continue;
            }
            else {
                var thisBook = BOOKS.get(--selection);
                userCheckouts.add(thisBook);
                alertNewBookAddedThenDisplayCheckoutCart(thisBook, userCheckouts);
            }
            if (!canCheckoutNewBook(user)) break;
        }
    }

    private static boolean canCheckoutNewBook(User user) {
        Scanner scanner1 = new Scanner(System.in);
        if (user.getCheckouts().size() != 5) {
            System.out.printf("%nAdd another book? (y/n): %n");
            var decision = scanner1.nextLine().toLowerCase(Locale.ROOT);
            return decision.equals("y");
        }
        System.out.println();
        System.out.println("You've reached your limit for checkouts. Please check a book in to check out another.");
        System.out.println();
        return false;
    }

    private static boolean isValidSelection(int selection) {
        if (selection > 0 && selection <= BOOKS.size()) { return true; }
        System.out.println("Enter a valid choice number\n");
        return false;
    }

    private static void formatBookDetails(Book book) {
        System.out.printf("Title: %s%n", book.getTitle());
        System.out.printf("Author: %s%n", book.getAuthor());
        System.out.printf("ISBN: %s%n", book.getISBN());
        System.out.printf("Summary - %s%n", book.getSummary());
        System.out.println();
    }

    private static void alertNewBookAddedThenDisplayCheckoutCart(Book thisBook, List<Book> userCheckouts) {
        System.out.println("\n===============");
        System.out.println("New book added!");
        System.out.println("===============");
        formatBookDetails(thisBook);
        System.out.println("Your Checkout List");
        System.out.println("==================");
        userCheckouts.forEach(book -> System.out.printf("%s%n", book.getTitle()));
    }
}
