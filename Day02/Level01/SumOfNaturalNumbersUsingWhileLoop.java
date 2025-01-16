import java.util.Scanner;

public class SumOfNaturalNumbersUsingWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //taking input from the user
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Compute the sum using a while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Print the result
            System.out.println("Sum using the while loop: " + loopSum);
        }

        // Close the scanner
        scanner.close();
    }
}