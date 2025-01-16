import java.util.*;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  user input
        System.out.print("Enter a number to check if it's prime: ");
        int number = sc.nextInt();

        // Initialize isPrime  (assuming the number is prime)
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to the number-1 to check divisibility
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; 
                    break; // Exit the loop number is not prime
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}
