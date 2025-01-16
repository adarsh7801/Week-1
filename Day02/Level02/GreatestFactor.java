import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter a number to find its greatest factor (besides itself): ");
        int number = sc.nextInt();

        // Initialize greatestFactor
        int greatestFactor = 1;

        // Find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop once the greatest factor is found
            }
        }

        // Printing
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

        sc.close();
    }
}
