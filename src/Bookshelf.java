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
