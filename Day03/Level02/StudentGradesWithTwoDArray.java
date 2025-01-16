import java.util.Scanner;

public class StudentGradesWithTwoDArray{
    public static void main(String[] args) {
        
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();

        // Creating arrays to store marks, percentages, and grades
        int[][] marks = new int[numStudents][3];
        double[] percentage = new double[numStudents];
        String[] grades = new String[numStudents];

        // Loop to take input
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            // Taking marks for Physics
            System.out.println("Enter marks in Physics:");
            marks[i][0] = sc.nextInt();
            
            // Taking marks for Chemistry
            System.out.println("Enter marks in Chemistry:");
            marks[i][1] = sc.nextInt();
            
            // Taking marks for Maths
            System.out.println("Enter marks in Maths:");
            marks[i][2] = sc.nextInt();
            
            // Calculating percentage for the student
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Calculating grade based on percentage
            if (percentage[i] >= 80) {
                grades[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percentage[i] >= 70) {
                grades[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percentage[i] >= 60) {
                grades[i] = "C (Level 2, below but approaching agency-normalized standards)";
            } else if (percentage[i] >= 50) {
                grades[i] = "D (Level 1, well below agency-normalized standards)";
            } else if (percentage[i] >= 40) {
                grades[i] = "E (Level 1-, too below agency-normalized standards)";
            } else {
                grades[i] = "F (Remedial standards)";
            }
        }

        // printing the marks, percentage, and grades of all students
        for (int i = 0; i < numStudents; i++) {
		System.out.println("Student " +(i+1)+ "scored "+marks[i][0]+" in physics, " +marks[i][1]+" in chemistry and " +marks[i][2]+" in  maths and scored "+percentage[i]+" percentage and the grade is "+grades[i]);
        }

        // Closing the scanner
        sc.close();
    }
}
