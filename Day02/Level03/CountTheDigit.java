import java.util.*;
public class CountTheDigit{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc= new Scanner(System.in);
		
		//Taking input
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int digit = 0;
		
		//calculating the digits
		while(number!=0){
			number=number/10;
			digit++;
		}
		
		//printing the result
		System.out.println("The number have "+digit+" digit");
		
		//closing scanner
		sc.close();
	}
}