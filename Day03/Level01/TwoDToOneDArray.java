import java.util.Scanner;

public class TwoDToOneDArray {
    public static void main(String[] args) {
		
		//creating scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        // Create a 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");

        // Take user input to populate the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array
        int[] oneDArray = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index++] = matrix[i][j];
            }
        }

        // printing the 2D array
        System.out.println("The 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // printing the 1D array
        System.out.println("The 1D array:");
        for (int element : oneDArray) {
            System.out.print(element + " ");
        }
        
		//closing scanner
		sc.close();
    }
}
