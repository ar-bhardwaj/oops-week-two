public class CarRental {
    // Attributes
    public String customerName;
    public String carModel;
    public int rentalDays;
    public double dailyRate;

    // Default constructor
    public CarRental() {
        customerName = "Aditi";
        carModel = "Standard Car";
        rentalDays = 1;
        dailyRate = 100.0; // Default rate per day
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental:");
        rental1.displayRentalInfo();

        System.out.println();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Alice", "Toyota Camry", 5, 150.0);
        System.out.println("Parameterized Rental:");
        rental2.displayRentalInfo();

        System.out.println();

        // Using copy constructor
        CarRental rental3 = new CarRental(rental2);
        System.out.println("Copied Rental:");
        rental3.displayRentalInfo();
    }
}
