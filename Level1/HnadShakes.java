import java.util.Scanner;
public class HnadShakes{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking input for students
		System.out.println("Enter the number of students");
		int student = sc.nextInt();
		
		//calculating handshakes
		int handShakes = student*(student-1)/2;
		
		//printing
		System.out.println("The total number of handshakes  for "+student+" is "+ handShakes +" handShakes");
		
		//closing scanner
		sc.close();
	}
}