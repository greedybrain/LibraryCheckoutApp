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

            if (user.getCheckouts().contains(books.get(bookNumber - 1))) {
                System.out.println("You already checked that book out, try another");
                continue;
            }
            else {
                user.getCheckouts().add(books.get(--bookNumber));
                System.out.println(user.getCheckouts());
            }
            if (canCheckoutNewBook(user)) continue;
            else {
                displayOfTransactionInfo(user);
                break;
            }
        }
    }

    private static boolean canCheckoutNewBook(User user) {
        Scanner scanner2 = new Scanner(System.in);
        if (user.getCheckouts().size() != 5) {
            System.out.printf("Add another book? (y/n): %n");
            var decision = scanner2.nextLine().toLowerCase(Locale.ROOT);
            return decision.equals("y");
        } else {
            System.out.println();
            System.out.println("You've reached your limit for checkouts. Please check a book in to check out another.");
            System.out.println();
        }
        return false;
    }

    private static void displayOfTransactionInfo(User user) {
        var userBooks = user.getCheckouts();
        String bookOrBooks = (userBooks.size() == 0 || userBooks.size() > 1) ? "books" : "book";
        System.out.printf("%s checked out %d %s %n", user.getFullName(), userBooks.size(), bookOrBooks);
        System.out.println("============================");
        for (int i = 0; i < userBooks.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, userBooks.get(i).getTitle());
        }
        System.out.println();
    }
}
