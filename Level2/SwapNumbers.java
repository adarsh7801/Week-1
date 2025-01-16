import java.util.Scanner;
public class SwapNumbers{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input for two numbers
		System.out.println("Enter the first number ");
		int first = sc.nextInt();
		
		System.out.println("Enter the second number ");
		int second = sc.nextInt();
		
		//Swapping
		int temp= first;
		first = second;
		second= temp;
		
		//printing
		System.out.println("The swapped numbers are "+first+" and "+second);
		
		//closing scanner
		sc.close();
	}
}