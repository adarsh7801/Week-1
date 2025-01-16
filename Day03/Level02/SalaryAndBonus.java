import java.util.Scanner;
public class SalaryAndBonus{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//initializing one array of double datatype for salary and one array of int datatype for year of service
		double [] old_salary = new double [10];
		int [] year_of_service = new int [10];

		////taking input
		for(int i=0; i<10; i++){
			System.out.print("Enter the Salary of employee "+(i+1)+" ");
			old_salary[i]= sc.nextDouble();
			System.out.print("Enter the year of service of employee "+(i+1));
			year_of_service[i] = sc.nextInt();	
		}

		//initializing array of double datatype for bonus and one array of double for new salary
		double[] bonus = new double[10];
		double[] new_salary = new double[10];

		//storing bonus and new salary in array
		for(int i=0; i<10;i++){
			if (year_of_service[i]<5) {
				bonus[i]= (old_salary[i]*2)/100;
			}else{
				bonus[i]= (old_salary[i]*5)/100;
			}
			new_salary[i] = old_salary[i] + bonus[i];

			//printing the output
			System.out.println("The employee "+(i+1)+" is getting "+old_salary[i]+" as salary and "+bonus[i]+" and his new salary is "+new_salary[i]);
		}
		
		//closing scanner
		sc.close();
	}
}