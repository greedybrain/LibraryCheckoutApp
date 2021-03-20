package tut.java.library_app;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Librarian extends Person {
    private static final List<Book> books = Inventory.all();

    public Librarian(String fullName) { super(fullName); }

    public void handleCheckoutFor(User user) {
        Scanner scanner1 = new Scanner(System.in);

        while(true) {
            Inventory.showOptions();
            var bookNumber = scanner1.nextInt();
            if ((bookNumber < 1 || bookNumber > books.size())) {
                System.out.println("Enter a valid choice number\n");
                continue;
            }

            displayMoreBookDetails();

            var userCheckouts = user.getCheckouts();
            if (userCheckouts.contains(books.get(bookNumber - 1))) {
                System.out.println("You already checked that book out, try another");
                continue;
            }
            else {
                userCheckouts.add(books.get(--bookNumber));
                System.out.println(userCheckouts);
            }
            if (!canCheckoutNewBook(user)) break;
        }
    }

    private static void displayMoreBookDetails() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the number of the book you wish to see more details about: ");
            var selection = scanner1.nextInt();
            if (selection < 1 || selection > 10) {
                System.out.println("Enter a valid choice number\n");
                continue;
            } else {
                var book = books.get(--selection);
                System.out.printf("Title: %s%n", book.getTitle());
                System.out.printf("Author: %s%n", book.getAuthor());
                System.out.printf("ISBN: %s%n", book.getISBN());
                System.out.printf("Summary%n");
                System.out.println("==============");
                System.out.printf("%s%n", book.getSummary());
                System.out.println();
                System.out.println("View details about another? (y/n): ");
                var decision = scanner2.nextLine().toLowerCase(Locale.ROOT);
                if (decision.equals("y")) continue;
                else break;
            }
        }
    }

    private static boolean canCheckoutNewBook(User user) {
        Scanner scanner1 = new Scanner(System.in);
        if (user.getCheckouts().size() != 5) {
            System.out.printf("Add another book? (y/n): %n");
            var decision = scanner1.nextLine().toLowerCase(Locale.ROOT);
            return decision.equals("y");
        }
        System.out.println();
        System.out.println("You've reached your limit for checkouts. Please check a book in to check out another.");
        System.out.println();
        return false;
    }
}
