package tut.java.library_app;

public class Book {
    private final String TITLE;
    private final String AUTHOR;
    private final String ISBN;
    private final String SUMMARY;

    public Book(String title, String author, String ISBN, String summary) {
        this.TITLE = title;
        this.AUTHOR = author;
        this.ISBN = ISBN;
        this.SUMMARY = summary;
    }

    // getters below
    public String getTitle() { return TITLE; }
    public String getSummary() { return SUMMARY; }
    public String getAuthor() { return AUTHOR; }
    public String getISBN() { return ISBN; }
}
