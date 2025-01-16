import java.util.*;
public class NumberDigitsInArray{
	public static void main(String[] args){
		
		//Creating scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the number");
		int number= sc.nextInt();
		int a= number;
		int digit_number = 0;
		
		//counting the digits
		while(a!=0){
			a/=10;
			digit_number++;
		}
		
		//initializing the array
		int[] digits = new int[digit_number];
		
		a= number;
		
		//storing the digits in array
		for(int i=0; i<digit_number; i++){
			digits[i]= a%10;
			a=a/10;
		}
		
		//printing the original number
		System.out.println("Your input is "+number);
		
		//printing the array in reverse order
		for(int i=digits.length-1; i>=0; i--){
			System.out.print(digits[i]);
		}
		
		//closing scanner
		sc.close();
		
	}
}