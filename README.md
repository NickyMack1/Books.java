# Books.java
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    // Constructor
    public Book(String title, String author, String publisher, int copyrightDate){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    // toString method
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright Date: " + copyrightDate;
    }
}
public class Bookshelf {
    public static void main(String[] args) {
        // Creating instances of Book
        Book book1 = new Book("The Holy Grail of Investing", "Tony Robbins", "Simon & Schuster", 2024);
        Book book2 = new Book("Untangle Your Emotions", "Jennie Allen", "Waterbrook Press", 2024);

        // Updating Book objects
        book1.setTitle("The Holy Grail of Investing");
        book1.setAuthor("Tony Robbins");
        book2.setPublisher("Water brook Press");

        // Printing book details
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println("\nBook 2:");
        System.out.println(book2);
    }
}
