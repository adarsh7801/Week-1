import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
		
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //taking input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n < 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            // Compute the factorial using a for loop
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}