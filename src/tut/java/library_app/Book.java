package tut.java.library_app;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String summary;

    public Book(String title, String author, String ISBN, String summary) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.summary = summary;

    }

    // getters below
    public String getTitle() { return title; }
    public String getSummary() { return summary; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}
