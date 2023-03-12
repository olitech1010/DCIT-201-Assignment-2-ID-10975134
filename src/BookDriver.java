
public class BookDriver {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0", "04/10/1925", 180);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-446-31078-1", "07/11/1960", 336);
        Book book3 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "978-0-7475-3269-6", "06/26/1997", 223);
        
        // Set and get book properties
        book1.setTitle("The Great Gatsby (Revised)");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getISBN());
        System.out.println(book1.getPublicationDate());
        System.out.println(book1.getNumberOfPages());
        
        // Check if book is a long book and a recent publication
        System.out.println(book1.isLongBook());
        System.out.println(book1.isRecentPublication());
        System.out.println(book2.isLongBook());
        System.out.println(book2.isRecentPublication());
        System.out.println(book3.isLongBook());
        System.out.println(book3.isRecentPublication());
    }
}
