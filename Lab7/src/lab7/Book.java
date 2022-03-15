package lab7;

public class Book {
    private String title;
    private String authors;
    private int numberOfPages;
    private String publishedDate;
    private String publisher;

    public Book(String title, String authors, int numberOfPages, String publishedDate, String publisher) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.publishedDate = publishedDate;
        this.publisher = publisher;
    }

    public String getInfo() {
        return "Title: " + title + "\n" +
                "Author: " + authors + "\n" +
                "# of pages: " + numberOfPages + "\n" +
                "Date Published: " + publishedDate + "\n" +
                "Publisher: " + publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }
}
