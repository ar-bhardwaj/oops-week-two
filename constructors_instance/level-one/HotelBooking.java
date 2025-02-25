public class HotelBooking {
    // Attributes
    public String guestName;
    public String roomType;
    public int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Aditi";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking:");
        booking1.displayBooking();

        System.out.println();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("Parameterized Booking:");
        booking2.displayBooking();

        System.out.println();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copied Booking:");
        booking3.displayBooking();
    }
}
