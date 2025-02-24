import java.util.Scanner;

// Class representing a bank account and ATM functionality
public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize bank account details
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Method to simulate an ATM system
    void atmMenu() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt(); // Taking user input for menu selection
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount); // Calling deposit method
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount); // Calling withdraw method
                    break;
                case 3:
                    displayBalance(); // Displaying the balance
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM!");
                    scanner.close(); // Closing the scanner
                    return; // Exiting the program
                default:
                    System.out.println("Invalid choice. Please try again."); // Handling invalid input
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aditi", "123456789", 5000);
        account.atmMenu(); // Start the ATM simulation
    }
}
