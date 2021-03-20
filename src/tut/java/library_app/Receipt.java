package tut.java.library_app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Receipt {

    public void displayOfTransactionInfo(User user, Librarian librarian) { formatTransactionInfo(user, librarian); }

    private void formatTransactionInfo(User user, Librarian librarian) {
        var userBooks = user.getCheckouts();
        var bookOrBooks = (userBooks.size() != 1) ? "books" : "book";
        System.out.printf("%s checked out %d %s %n", user.getFullName(), userBooks.size(), bookOrBooks);
        System.out.println("============================");
        for (int i = 0; i < userBooks.size(); i++) {
            var book = userBooks.get(i);
            System.out.printf("%d. %s, by %s%n", i + 1, book.getTitle(), book.getAuthor());
        }
        System.out.println();
        System.out.printf("Signed out by: %s%n", librarian.fullName);
        System.out.printf("Time: %s%n", getDate());
    }

    public String getDate() {
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss");

        return dateObj.format(dateFormat);
    }

}
