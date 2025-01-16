import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
		
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initialize the total to 0
        int total = 0;

        while (true) {
            // Ask the user for input
            System.out.print("Enter a number (0 or negative to stop): ");
            int userInput = sc.nextInt();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }

            // Add the input value to the total
            total += userInput;
        }

        // Print the total sum after the loop ends
        System.out.println("The total sum is: " + total);

        // Close the scanner
        sc.close();
    }
}