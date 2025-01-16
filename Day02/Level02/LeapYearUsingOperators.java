import java.util.Scanner;

public class LeapYearUsingOperators {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is valid (greater than or equal to 1582)
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
        } else {
            // Determine if the year is a Leap Year using a single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the scanner
        sc.close();
    }
}