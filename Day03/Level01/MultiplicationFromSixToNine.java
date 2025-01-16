import java.util.*;
public class MultiplicationFromSixToNine{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//initializing array of size 4
		int[] mul = new int[4];
		
		//taking input
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		//calculating and storing it in array 
		for(int i=0 ;i<4; i++){
			mul[i] = number*(i+6);
		}
		
		//printing the output
		for(int i=0; i<4;i++){
			System.out.println(number+" * "+(i+6)+" = "+mul[i]);
		}
		
		//closing scanner
		sc.close();
	}
}