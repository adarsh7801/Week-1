import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args){
		
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
		
		// Input day
        System.out.print("Enter the day: ");
        int d = sc.nextInt();

        // Input month
        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int m = sc.nextInt();

        // Input year
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        //calculating
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the result
        System.out.println("The day of the week is: " + d0);
		
		//closing scanner
		sc.close();
    }
}
