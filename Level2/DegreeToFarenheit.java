import java.util.Scanner;
public class DegreeToFarenheit{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking input in degree celcius
		System.out.println("Enter the temprature in Degree celcius");
		float celcius = sc.nextInt();
		
		//converting in farenheit
		float farenheit = (celcius* 9/5)+32f;
		
		//printing
		System.out.println("The "+celcius+" is "+farenheit+" farenheit");
		
		//closing scanner
		sc.close();
	}
}