import java.util.Scanner;
public class centimeterToFeetAndInches{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking height in centimeter as input
		float cm = sc.nextFloat();
		
		//converting centimeter to inches
		float inches = cm/2.54f;
		
		//converting inches to feet
		float feet = inches/12f;
		System.out.println("Your Height in cm is " +cm+ " while in feet is "+feet+ " and inches is "+inches);
	}
}