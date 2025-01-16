import java.util.*;
public class PositiveNegativeOrZero{
	public static void main(String[] args){
		
		//making scanner object
		Scanner sc = new Scanner(System.in);
		int [] number = new int[5];
		
		//printing to take input
		System.out.println("Enter the 5 numbers");
		
		//taking input
		for(int i=0; i<5; i++){
			number[i]= sc.nextInt();
		}
		
		//performing operations
		for(int i=0;i<5;i++){
			if(number[i]==0){
				System.out.println("the given number "+number[i]+" is Zero");
			} else if(number[i]<0){
				System.out.println("the given number "+number[i]+" is Negative");
			} else{
				System.out.print("the given number "+number[i]+" is Positive");
				if(number[i]%2==0){
					System.out.println(" and even");
				} else{
					System.out.println(" and odd");
				}
			}
		}
		
		//closing scanner
		sc.close();
	}
}