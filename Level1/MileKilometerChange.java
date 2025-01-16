import java.util.Scanner;
public class MileKilometerChange{
	public static void main(String[] args){
		//Creating scanner object
		Scanner sc= new Scanner(System.in);
		double kilometer= sc.nextDouble();
		
		//Converting miles to kilometer
		double miles= kilometer/1.6;
		
		//printing
		System.out.println("The total miles is "+miles+" mile for the given " +kilometer+ "km");
	}
}