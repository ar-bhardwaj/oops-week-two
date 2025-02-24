import java.util.ArrayList;
import java.util.Scanner;

// Class to model a shopping cart item
public class CartItem {
    String itemName; // Name of the item
    double price; // Price of a single unit
    int quantity; // Quantity of the item in the cart

    // Constructor to initialize cart item details
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of the item based on quantity
    double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    void displayItem() {
        System.out.println(itemName + " - Rs. " + price + " x " + quantity + " = Rs. " + getTotalCost());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>(); // List to store cart items
        boolean shopping = true; // Flag to control the loop

        while (shopping) {
            // Display menu options
            System.out.println("1. Add item to cart\n2. Remove item from cart\n3. Display total cost\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Adding an item to the cart
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.add(new CartItem(itemName, price, quantity));
                    System.out.println("Item added to cart!\n");
                    break;

                case 2:
                    // Removing an item from the cart by name
                    System.out.print("Enter item name to remove: ");
                    String removeItem = scanner.nextLine();
                    cart.removeIf(item -> item.itemName.equalsIgnoreCase(removeItem));
                    System.out.println("Item removed (if found)\n");
                    break;

                case 3:
                    // Displaying all items in the cart and calculating total cost
                    double totalCost = 0;
                    System.out.println("Cart Items:");
                    for (CartItem item : cart) {
                        item.displayItem();
                        totalCost += item.getTotalCost();
                    }
                    System.out.println("Total Cost: Rs. " + totalCost + "\n");
                    break;

                case 4:
                    // Exiting the shopping cart system
                    shopping = false;
                    System.out.println("Exiting shopping cart.\n");
                    break;

                default:
                    // Handling invalid input
                    System.out.println("Invalid choice! Try again.\n");
            }
        }
        scanner.close(); // Closing scanner to avoid memory leaks
    }
}
