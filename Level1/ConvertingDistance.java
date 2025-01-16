import java.util.Scanner;
public class ConvertingDistance{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking input of distance in feet
		System.out.println("Enter the Distance in Feet");
		float feet = sc.nextFloat();
		
		//converting feet to yard
		float yard = feet/3f;
		
		//converting yard to  mile
		float mile = yard/1760f;
		
		//printing
		System.out.println("Your Distance in Feet is " +feet+ "while in Yard is " +yard+ " and Mile is "+mile);
		
		//closing scanner
		sc.close();
	}
}