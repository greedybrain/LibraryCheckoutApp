package tut.java.library_app;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    // Fields
    private final List<Book> checkouts = new ArrayList<>();

    // Constructor
    public User(String fullName) { super(fullName); }

    // getters and setters
    public String getFullName() { return fullName; }
    public List<Book> getCheckouts() { return checkouts; }
}
