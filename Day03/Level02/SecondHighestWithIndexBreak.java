import java.util.Scanner;

public class SecondHighestWithIndexBreak {
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //initializing array of double datatype for height
        double[] height = new double[10];

        int index =9;
			
        //taking input for array
        System.out.println("Enter the height ");
        for(int i=0; i<10; i++){
            height[i]= sc.nextDouble();
            if (height[i]==i+1) {
                index = i;
                break;
            }
        }

        //making variables for highest and second highest
        double highest=0;
        double second_highest=0;
        
        //finding highest and second highest
        for(int i= 0; i<=index; i++){
            if (height[i]>highest) {
                second_highest= highest;
                highest= height[i];        
            } else if(height[i]>second_highest && highest != height[i]){
            second_highest = height[i];
            }
        }

        //printing the output
        System.out.println("The tallest person is "+highest+ " and second tallest is "+second_highest);

        //closing scanner
        sc.close();
        
    }    
}
