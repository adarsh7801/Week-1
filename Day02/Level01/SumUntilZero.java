import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total to 0.0
        double total = 0.0;

        // Variable to store the user's input
        double userInput;

        // Prompt the user for the first input
        System.out.print("Enter a number (or 0 to stop): ");
        userInput = scanner.nextDouble();

        // While the user doesn't enter 0, keep looping
        while (userInput != 0) {
            total += userInput; // Add the input value to the total

            // Ask for the next input
            System.out.print("Enter another number (or 0 to stop): ");
            userInput = scanner.nextDouble();
        }

        // Print the total sum after the loop ends
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}