import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
		
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // taking input to start the countdown
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Validate the input
        if (counter <= 0) {
            System.out.println("Please enter a positive number for the countdown.");
        } else {
			
            // Perform the countdown using a while loop
            System.out.println("Countdown begins!");
			
            while (counter >= 1) {
				
                // Print the current value of the counter
                System.out.println(counter);

                // Decrement the counter
                counter--;
            }
        }

        // Close the scanner
        scanner.close();
    }
}