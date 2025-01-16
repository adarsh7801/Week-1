import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        
        // Creating scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();

        // Creating arrays to store marks, percentage, and grades
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentage = new double[numStudents];
        String[] grades = new String[numStudents];

        // Loop to take input
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            // Taking marks for Physics
            System.out.println("Enter marks in Physics:");
            physicsMarks[i] = sc.nextInt();
            
            // Taking marks for Chemistry
            System.out.println("Enter marks in Chemistry:");
            chemistryMarks[i] = sc.nextInt();
            
            // Taking marks for Maths
            System.out.println("Enter marks in Maths:");
            mathsMarks[i] = sc.nextInt();
            
            // Calculating percentage for the student
            percentage[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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

        // Displaying the marks, percentage, and grades of all students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " +(i+1)+ "scored "+physicsMarks[i]+" in physics, " +chemistryMarks[i]+" in chemistry and " +mathsMarks[i]+" in  maths and scored "+percentage[i]+" percentage and the grade is "+grades[i]);
        }

        // Closing the scanner
        sc.close();
    }
}
