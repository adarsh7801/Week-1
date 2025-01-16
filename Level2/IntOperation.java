import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input for 3 numbers
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the Second number");
		int b= sc.nextInt();
		System.out.println("Enter the Third number");
		int c= sc.nextInt();
		
		//Doing all the operations
		int operation1 = a+b*c;
		int operation2= a*b+c;
		int operation3= c+a/b;
		int operation4= a%b+c;
		
		//printing
		System.out.println("The results of Int Operations are "+operation1+", "+operation2+", "+operation3+" and "+operation4);
		
		//Closing scanner
		sc.close();
	}
}