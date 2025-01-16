import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the employee's salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Initialize the bonus amount
        double bonus = 0;

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            bonus = 0.05 * salary;
        }

        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        scanner.close();
    }
}
