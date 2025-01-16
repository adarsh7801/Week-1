import java.util.*;
public class AverageHeight{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//initializing array of size 11
		double[] height = new double[11];
		
		//taking input and storing it in array
		System.out.println("Enter the height of 11 players");
		for(int i=0; i<11; i++){
			height[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		//calculating the sum 
		for(int i=0 ;i<11; i++){
			sum += height[i] ;
		}
		
		//printing the output
		System.out.println("The average height is "+(sum/11));
		
		//closing scanner
		sc.close();
	}
}