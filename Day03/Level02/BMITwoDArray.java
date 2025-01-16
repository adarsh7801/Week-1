import java.util.Scanner;

public class BMITwoDArray {
    public static void main(String[] args) {
        
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.println("Enter the number of people:");
        int number = sc.nextInt();

        // Creating a multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3];

        // Creating an array to store the weight status of each person
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            // Taking height input
            System.out.println("Enter the height of person " + (i + 1) + " in meters:");
            personData[i][0] = sc.nextDouble();

            // Taking weight input
            System.out.println("Enter the weight of person " + (i + 1) + " in kilograms:");
            personData[i][1] = sc.nextDouble();

            // Calculating BMI and storing it in the array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining the weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the details of each person
        System.out.println("\nDetails of all persons:");
        for (int i = 0; i < number; i++) {
            System.out.print("Person " + (i + 1) + " having height " + personData[i][0]+ " meters and weight " + personData[i][1] + " kg has a BMI of " + personData[i][2]+ " and is classified as " + weightStatus[i] + ".");
            System.out.println();
        }

        // Closing scanner
        sc.close();
    }
}
