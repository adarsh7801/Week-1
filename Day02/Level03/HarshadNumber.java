import java.util.Scanner;
public class HarshadNumber{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a number");
		int number_input= sc.nextInt();
		int number= number_input;
		
		int sum=0;
		
		//calculating the sum of digits
		while(number!=0){
			int a = number%10;
			number = number/10;
			sum +=a;
		}
		
		//printing
		if(number_input==sum){
			System.out.println("Harshad Number");
		}
		else{
			System.out.println("Not a Harshad Number");
		}
		
		//closing scanner
		sc.close();
	}
}