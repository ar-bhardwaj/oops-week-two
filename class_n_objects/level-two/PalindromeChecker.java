import java.util.*;

public class PalindromeChecker {
    String text;

    // Constructor to initialize the text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean check() {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversedText);
    }

    // Method to display the result
    public void displaycheck() {
        if (check()) {
            System.out.println("String " + text + " is Pallindrome!");
        } else {
            System.out.println(text + " is not a Pallindrome!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String str = sc.nextLine();

        PalindromeChecker p = new PalindromeChecker(str);
        p.displaycheck();
        sc.close();
    }

}
