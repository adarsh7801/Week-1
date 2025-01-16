import java.util.Scanner;
public class FarenheitToDegree{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking input in farenheit
		System.out.println("Enter the temprature in Farenheit");
		float farenheit = sc.nextInt();
		
		//converting in degree celcius
		float degree = (farenheit-32)*5/9 ;
		
		//printing
		System.out.println("The "+farenheit+" is "+degree+" degree celcius");
		
		//closing scanner
		sc.close();
	}
}