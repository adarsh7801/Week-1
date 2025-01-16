import java.util.Scanner;
public class SmallestOfThree{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input for numbers
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		
		//checking if the number is smaller than remaining 2 or not
		if(num1<num2 && num1 < num3){
			System.out.println("Number 1 "+num1+" is smaller than remaining two"+num2+ " and "+num3);
		}
		else{
			System.out.println("Number 1 "+num1+" is not smaller than reamining two"+num2+ " and "+num3);
		}
		
		//closing scanner
		sc.close();
	}
}