class Item {
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price+"/-");
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        // Creating an Item object
        Item item1 = new Item(101, "Wireless Mouse", 25.50);

        // Displaying item details
        item1.displayDetails();

        // Calculating total cost for a given quantity
        int quantity = 3;
        System.out.println("Total cost for " + quantity + " units: " + item1.calculateTotalCost(quantity)+"/-");
    }
}
