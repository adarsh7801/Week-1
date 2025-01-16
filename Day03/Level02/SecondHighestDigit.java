import java.util.Scanner;

public class SecondHighestDigit {
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //taking input for number of people
        System.out.println("Enter the digit if numbers ");
        int digit = sc.nextInt();
		
		//user input should be between 0 and 10 if not then invalid input
        if (digit<=10 && digit>0) {
            
			//initializing array of double datatype for height
            double[] height = new double[digit];
			
			//taking input for array
            for(int i=0; i<digit; i++){
                height[i]= sc.nextDouble();
            }
			
			//making variables for highest and second highest
            double highest=0;
            double second_highest=0;
            
			//finding highest and second highest
            for(int i= 0; i<digit; i++){
                if (height[i]>highest) {
                    second_highest= highest;
                    highest= height[i];        
            } else if(height[i]>second_highest && highest != height[i]){
                second_highest = height[i];
            }
        }
		
		//printing the output
        System.out.println("The tallest person is "+highest+ " and second tallest is "+second_highest);

        }else{
            
            System.out.println("Invalid input");

        }


        //closing scanner
        sc.close();
    }
}
