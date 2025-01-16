import java.util.*;
public class VotingEligibility{
	public static void main(String[] args){
		
		//making scanner object
		Scanner sc = new Scanner(System.in);
		int [] age = new int[10];
		
		//printing to take input
		System.out.println("Enter the age of 10 students");
		
		//taking input
		for(int i=0; i<10; i++){
			age[i]= sc.nextInt();
		}
		
		//calculating if the student is eligible or not and printing the result
		for(int i=0; i<10; i++){
			if(age[i]<0){
				System.out.println("Invalid age");
			}else if(age[i]<18){
			System.out.println("Student with "+age[i]+" can not vote");
			}else
				System.out.println("Student with "+age[i]+" can vote");
			
			//closing scanner
			sc.close();
			
		}
	}
}