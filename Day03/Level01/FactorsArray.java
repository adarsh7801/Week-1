import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
		
		//creating scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.println("Enter a number to find its factors:");
        int number = sc.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }

                // Add the factor to the array
                factors[index++] = i;
            }
        }

        // printing the output
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        
		sc.close();
    }
}
