import java.util.Scanner;
public class SumOfNaturalNumbers{
	
	//Creating method to find natural numbers
	public static int sum(int number){
		int totalSum=0;
		
		for(int i=0; i<=number; i++){
			totalSum+=i;
		}
		return totalSum;
	}
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		//storing the sum in a variable
		int totalSum = sum(number);
		
		//printing sum
		System.out.println("The sum is "+totalSum);
		
		//closing scanner
		sc.close();
		
	}
}