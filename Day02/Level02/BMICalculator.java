import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        // Converting height to meters
        double heightInMeters = heightInCm / 100;

        // Calculating BMI
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determining BMI category
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("You are: " + status);
    }
}