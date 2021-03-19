package tut.java.library_app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {

    public void displayOfTransactionInfo(User user, Librarian librarian) {
        var userBooks = user.getCheckouts();
        String bookOrBooks = (userBooks.size() == 0 || userBooks.size() > 1) ? "books" : "book";
        System.out.printf("%s checked out %d %s %n", user.getFullName(), userBooks.size(), bookOrBooks);
        System.out.println("============================");
        for (int i = 0; i < userBooks.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, userBooks.get(i).getTitle());
        }
        System.out.println();
        System.out.printf("Signed off by: %s%n", librarian.fullName);
        System.out.printf("Time: %s%n", getDate());
    }

    public String getDate() {
        LocalDateTime dateObj = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss");

        String formattedDate = dateObj.format(dateFormat);
        return formattedDate;
    }

}
