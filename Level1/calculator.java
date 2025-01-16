import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input for 2 numbers as float
		float number1= sc.nextFloat();
		float number2= sc.nextFloat();
		
		//addition
		float addition = number1 + number2;
		
		//subtraction
		float subtraction = number1 - number2;
		
		//multiplication
		float multiplication = number1*number2;
		
		//division
		float division = number1/number2;
		
		//printing
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+addition+", "+subtraction+" ,"+multiplication+" and "+division);
		sc.close();
	}
}