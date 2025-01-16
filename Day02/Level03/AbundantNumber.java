import java.util.Scanner;
public class AbundantNumber{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a number");
		int number= sc.nextInt();
		
		int sum=0;
		
		//calculating the sum of divisiors
		for(int i=1 ; i<=number/2 ; i++){
			if(number%i==0){
				sum+=i;
			}
		}
		
		//printing
		if(number<sum){
			System.out.println("Abundant Number");
		}
		else{
			System.out.println("Not a Abundant Number");
		}
		
		//closing scanner
		sc.close();
	}
}