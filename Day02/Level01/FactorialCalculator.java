import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
		
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // taking input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Compute the factorial using a while loop
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Print the result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}