import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		//taking input for 3 numbers
		System.out.println("Enter the first number");
		double a= sc.nextDouble();
		System.out.println("Enter the Second number");
		double b= sc.nextDouble();
		System.out.println("Enter the Third number");
		double c= sc.nextDouble();
		
		//Doing all the operations
		double operation1 = a+b*c;
		double operation2= a*b+c;
		double operation3= c+a/b;
		double operation4= a%b+c;
		
		//printing
		System.out.println("The results of Int Operations are "+operation1+", "+operation2+", "+operation3+" and "+operation4);
		
		//Closing scanner
		sc.close();
	}
}