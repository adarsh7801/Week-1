import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
		
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();

        // Performing operations
        double result = 0;
        boolean validOperator = true;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                validOperator = false;
                System.out.println("Invalid Operator.");
        }

        //Print the result
        if (validOperator) {
            System.out.println("The result is: " + result);
        }
		
		//closing scanner
		sc.close();
    }
}
