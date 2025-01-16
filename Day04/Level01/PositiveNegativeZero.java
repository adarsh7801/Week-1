import java.util.Scanner;
public class PositiveNegativeZero{
	
	//creating method for to find that the given number is positive, negative or zero
	public static String positiveNegativeZero(int number){
		if(number > 0){
			return "positive";
		}else if(number<0){
			return "negative";
		}else{
			return "zero";
		}
	}
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the number");
		int number = sc.nextInt();
				
		String output = positiveNegativeZero(number);
		
		//printing output
		System.out.println("The number is "+output);
		
		//closing scanner
		sc.close();
	}
}