import java.util.*;
public class BMI{
	public static void main(String[] args){
		
		//Creating scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the number of people");
		int people= sc.nextInt();
		
		//initializing the array
		double[] weight = new double[people];
		double[] height = new double[people];
		double[] bmi = new double[people];
		
		for(int i=0; i<people; i++){
			
			//taking input for height
			System.out.println("Enter the height of person "+(i+1)+ " in meters");
			height[i]= sc.nextDouble();
			
			//taking input for weight
			System.out.println("Enter the weight of person "+(i+1)+" in kg");
			weight[i]= sc.nextDouble();
			
			//calculating bmi
			bmi[i]= weight[i]/(height[i]*height[i]);
			
		}
		
		//checking the status and printing the result
		for(int i=0; i<people; i++){
			System.out.print("Person " + (i+1) + " having height " +height[i]+ "meters and weight " +weight[i]+ "kg is having " +bmi[i]+ " and the person is ");
			
			if(bmi[i]<=18.4){
				System.out.print("is underweight");
			}else if(bmi[i]>18.4 && bmi[i]<=24.9){
				System.out.print("is normal");
			}else if(bmi[i]>24.9 && bmi[i]<=30.9){
				System.out.print("is overweight");
			}else{
				System.out.print("is obese");
			}
			
			System.out.println();
		}
		
		//closing scanner
		sc.close();
		
	}
}