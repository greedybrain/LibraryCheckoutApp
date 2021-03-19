package tut.java.library_app;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    private List<Book> checkouts = new ArrayList<>();

    public User(String fullName) {
        super(fullName);
    }

    // getters and setters
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getFullName() { return fullName; }
    public List<Book> getCheckouts() { return checkouts; }
}
