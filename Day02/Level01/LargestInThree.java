import java.util.Scanner;
public class LargestInThree{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking input for three numbers
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		
		//checking which number largest is than remaining 2
		if(num1>num2 && num1 > num3){
			System.out.println("Is the first number the largest?  Yes");
			System.out.println("Is the second number the largest?  No");
			System.out.println("Is the Third number the largest?   No");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("Is the first number the largest?  No");
			System.out.println("Is the second number the largest?  Yes");
			System.out.println("Is the Third number the largest?   No");
		}
		else{
			System.out.println("Is the first number the largest?  NO");
			System.out.println("Is the second number the largest?  No");
			System.out.println("Is the Third number the largest?   Yes");
		}
		
		//closing scanner
		sc.close();
	}
}