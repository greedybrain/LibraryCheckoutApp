package tut.java.library_app;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static final List<Book> BOOKS = new ArrayList<>();

    // todo: init books / get all books
    public static List<Book> all() {
        BOOKS.add(new Book("To Kill a Mockingbird", "Harper Lee", "1111"));
        BOOKS.add(new Book("1984", "George Orwell", "2222"));
        BOOKS.add(new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling", "3333"));
        BOOKS.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "4444"));
        BOOKS.add(new Book("The Great Gatsby", "Scott Fitzgerald", "5555"));
        BOOKS.add(new Book("Pride and Prejudice", "Jane Austen", "6666"));
        BOOKS.add(new Book("The Diary Of A Young Girl", "Ann Frank", "7777"));
        BOOKS.add(new Book("The Book Thief", "Markus Zusak", "8888"));
        BOOKS.add(new Book("The Hobbit", "J.R.R. Tolkien", "9999"));
        BOOKS.add(new Book("Little Women", "Louisa May Alcott", "0000"));

        return BOOKS;
    }

    public static void showOptions() {
        System.out.println("Which book do you want to check out?");
        System.out.println("====================================");
        System.out.printf("1 for \"To Kill a Mockingbird\"%n");
        System.out.printf("2 for \"1984\"%n");
        System.out.printf("3 for \"Harry Potter and the Philosopher’s Stone\"%n");
        System.out.printf("4 for \"The Lord of the Rings\"%n");
        System.out.printf("5 for \"The Great Gatsby\"%n");
        System.out.printf("6 for \"Pride and Prejudice\"%n");
        System.out.printf("7 for \"The Diary Of A Young Girl\"%n");
        System.out.printf("8 for \"The Book Thief\"%n");
        System.out.printf("9 for \"The Hobbit\"%n");
        System.out.printf("10 for \"Little Women\"%n");
        System.out.print("> ");
    }
}
