import java.util.Scanner;
public class SalaryAndBonus{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc= new Scanner(System.in);
		
		//taking input for Salary
		System.out.println("Enter the monthly salary");
		int salary = sc.nextInt();
		
		//taking input for Salary
		System.out.println("Enter the bonus");
		int bonus = sc.nextInt();
		
		//calculating complete income
		int  complete_Income = salary+bonus;
		
		//printing
		System.out.println("The salary is INR "+salary+ "  and bonus is INR "+bonus+" Hence Total Income is INR "+complete_Income);
		
		//closing scanner
		sc.close();
	}
}