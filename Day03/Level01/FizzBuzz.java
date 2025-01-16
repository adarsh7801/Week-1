import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
		
		//creating scanner object
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();

        // Validate if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create a String array to save the results
        String[] results = new String[number + 1];

        // Loop from 0 to the number and determine FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results in the format "Position X = Y"
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
		
		//closing scanner
		sc.close();
    }
}
