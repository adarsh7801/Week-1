import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking input of perimeter of square
		System.out.println("Enter the perimeter of the square");
		float perimeter = sc.nextInt();
		
		//calculating side if square
		float side = perimeter/4f;
		
		//printing
		System.out.println("The length of the side is "+side+ " whose perimeter is "+perimeter);
		
		//closing scanner
		sc.close();
	}
}