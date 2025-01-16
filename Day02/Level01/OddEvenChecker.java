import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the entered number is a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            System.out.println("Odd and Even Numbers from 1 to " + number + ":");

            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        scanner.close();
    }
}
