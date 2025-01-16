import java.util.Scanner;

public class SumOfNaturalNumbersUsingForLoop {
    public static void main(String[] args) {
        // Creating the Scanner object
        Scanner scanner = new Scanner(System.in);

        // taking input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print the result from the for loop
            System.out.println("Sum using the for loop: " + loopSum);
        }

        // Close the scanner
        scanner.close();
    }
}