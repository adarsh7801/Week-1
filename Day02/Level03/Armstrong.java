import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);
        
		// Input the number
        System.out.println("Enter the number:");
		int num = sc.nextInt(); 
        
        int sum = 0;            
        int originalNum = num; 

        // Loop to extract each digit and calculate the sum of cubes
        while (num != 0) {
            int digit = num % 10;            
            sum += (digit * digit * digit);  
            num /= 10;                       
        }

        // Check if the original number is equal to the sum of cubes of digits
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
