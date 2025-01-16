import java.util.Scanner;
public class SimpleIntrest{
	
	//creating method to calculate Simple intrest
	public static double si(int principal, double rate, double time){
			return (principal*rate*time)/100;
	}
		
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the Principal");
		int principal = sc.nextInt();
		
		System.out.println("Enter the rate of intrest");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time in years");
		double time = sc.nextDouble();
		
		//calling method and storing its return value in a variable
		double simple_intrest = si(principal, rate, time);
		
		//printing the output
		System.out.println("The simple intrest is "+simple_intrest);
		
		//closing the scanner
		sc.close();
		
	}
}