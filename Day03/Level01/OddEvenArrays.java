import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
		
		//creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking input
        System.out.println("Enter a natural number:");
        int number = sc.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }

        // Initialize arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        
        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop to separate odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // Add to even array
            } else {
                oddNumbers[oddIndex++] = i; // Add to odd array
            }
        }

        // Print odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
		
		//closing scanner
		sc.close();
    }
}
