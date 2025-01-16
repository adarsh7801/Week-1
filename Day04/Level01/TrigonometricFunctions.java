import java.util.Scanner;

public class TrigonometricFunctions {

    // creating method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculating sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Returning the results as an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter the angle in degrees:");
        double angle = sc.nextDouble();

        // calculating trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // printing the results
        System.out.println("Sine = " + results[0]);
        System.out.println("Cosine = " + results[1]);
        System.out.println("Tangent = " + results[2]);

        // closing scanner
        sc.close();
    }
}
