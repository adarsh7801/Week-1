import java.util.Scanner;
public class DivisibleByFive{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input for number
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		//checking if the number is completely divisible by 5 or not
		if(num%5==0){
			System.out.println("Number is divisible by 5");
		}
		else{
			System.out.println("Number is not divisible by 5");
		}
		
		//closing scanner
		sc.close();
	}
}