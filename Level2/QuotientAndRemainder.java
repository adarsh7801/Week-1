import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
			
		//taking input for dividend
		System.out.println("Enter the dividend ");
		int dividend = sc.nextInt();
		
		//taking input for divisior
		System.out.println("Enter the divisior");
		int divisior = sc.nextInt();
		
		//calculating remainder
		int remainder = dividend%divisior;
		
		//calculating quotient
		int quotient = dividend/divisior;
			
		//printing
		System.out.println("The Quotient is "+quotient+" and Reminder is " +remainder+ " of two number "+dividend+" and "+divisior);
		
		//closing scanner
		sc.close();
	
	}
}