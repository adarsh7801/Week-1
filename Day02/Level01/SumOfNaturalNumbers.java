import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking input for the number
		System.out.println("Please input a number");
		int number = sc.nextInt();
		
		
		if(number>0){
			
			//finding the sum of N natural Numbers
			int sum = number*(number+1)/2;
			
			//printing
			System.out.println("The sum of "+number+ " natural numbers is "+sum);
		}
		else{
			System.out.println("The number "+number+ "is not a natural number");
		}
		
		
		//closing scanner
		sc.close();
	}
}