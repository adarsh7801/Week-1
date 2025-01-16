import java.util.Scanner;
public class AtheleteRun{
	
	//creating method for to find the number of rounds
	public static double rounds(double sideA, double sideB, double sideC){
		return 5000/(sideA+sideB+sideC);
	}
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the sides if the tringular park");
		double sideA = sc.nextDouble();
		double sideB = sc.nextDouble();
		double sideC = sc.nextDouble();
		
		double totalRounds = rounds(sideA, sideB, sideC);
		
		//printing output
		System.out.println("The total number of rounds are "+totalRounds);
		
		//closing scanner
		sc.close();
	}
}