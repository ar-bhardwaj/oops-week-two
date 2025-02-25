
public class Book {
    public String title;
    public String author;
    public double price;

    public Book() {
        title = "Who moved my cheese";
        author = "Dr.Spencer Johnson";
        price = 399;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title of the Book: " + title);
        System.out.println("Author name: " + author);
        System.out.println("price of book: " + price + "/-");
    }

    public static void main(String[] args) {
        Book b = new Book();
        Book bb = new Book("Fake Love", "Arvind Girdhari", 2);
        b.display();
        bb.display();
    }

}
