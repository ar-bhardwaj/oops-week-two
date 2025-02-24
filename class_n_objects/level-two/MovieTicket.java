import java.util.Scanner;

// Class to model a movie ticket booking system
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    // Constructor to initialize movie ticket details
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket
    void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at seat number " + seatNumber
                    + " for Rs. " + price);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked!");
        }
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs. " + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }

    // Main method to simulate ticket booking
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();

        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        // Creating a movie ticket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Display ticket details before booking
        ticket.displayTicket();

        // Booking the ticket
        ticket.bookTicket();

        // Display ticket details after booking
        ticket.displayTicket();

        scanner.close();
    }
}
