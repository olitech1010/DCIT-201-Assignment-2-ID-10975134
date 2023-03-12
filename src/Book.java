import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String publicationDate;
    private int numberOfPages;
    
    // Constructor
    public Book(String title, String author, String ISBN, String publicationDate, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String getPublicationDate() {
        return publicationDate;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    // Check if book is a long book
    public boolean isLongBook() {
        return numberOfPages > 500;
    }
    
    // Check if book is a recent publication
    public boolean isRecentPublication() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate publicationLocalDate = LocalDate.parse(publicationDate, formatter);
        LocalDate currentDate = LocalDate.now();
        LocalDate fiveYearsAgo = currentDate.minusYears(5);
        return publicationLocalDate.isAfter(fiveYearsAgo);
    }
}
