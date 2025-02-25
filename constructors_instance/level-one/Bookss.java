public class Bookss {
    // Attributes
    public String title;
    public String author;
    public double price;
    public boolean isAvailable;

    // Constructor
    public Bookss(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book
        Bookss book1 = new Bookss("The Alchemist", "Paulo Coelho", 299.99);

        // Display book info
        book1.displayBookInfo();
        System.out.println();

        // Borrowing the book
        book1.borrowBook();
        System.out.println();

        // Trying to borrow again
        book1.borrowBook();
        System.out.println();

        // Display book info after borrowing
        book1.displayBookInfo();
    }
}
