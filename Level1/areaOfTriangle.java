import java.util.Scanner;
public class areaOfTriangle{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking input for both base and height  in feet in case it is in decimal
		System.out.println("Enter the Base of the triangle in Feet");
		float base = sc.nextFloat();
		System.out.println("Enter the Height of the triangle Feet");
		float height = sc.nextFloat();
		
		//Calculating area in feet
		float area_feet = (base*height)/2f;
		
		//converting area in inches from area in feet
		float area_inches = area_feet*144f;
		
		//converting area in centimeter from area in feet
		float area_centimeter = area_inches*6.4516f;
		
		//printing the answers
		System.out.println("Your Area in centimeter is "+area_centimeter+" while in feet is "+area_feet+" and inches is "+area_inches);
		
		//closing scanner
		sc.close();
	}
}