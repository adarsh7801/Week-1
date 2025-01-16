import java.util.*;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user inputs
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;

        // Display percentage
        System.out.println("Percentage: " + percentage + "%");

        //  grade and level
        if (percentage >= 80) {
            System.out.println("Grade: A - Level 4, above agency-normalized standards");
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Grade: B - Level 3, agency-normalized standards");
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Grade: C - Level 2, below but approaching agency-normalized standards");
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Grade: D - Level 1, well below agency-normalized standards");
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Grade: E - Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R - Remedial standards");
        }

        sc.close();
    }
}