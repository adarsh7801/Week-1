import java.util.Scanner;
public class QuotientAndRemainder{
	
	//creating method to find the quotient and remainder
	public static int[] quotientAndRemainder(int a,int b){
		
		int[] arr = new int[2];
		
		arr[0] = a/b;
		arr[1] = a%b;
		
		return arr;
	}
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
				
		int[] answer = new int[2];
		answer= quotientAndRemainder(a, b);
		
		//printing answer
		System.out.println("Quotient = "+answer[0]);
		System.out.println("Remainder = "+answer[1]);
		
		//closing scanner
		sc.close();
		
	}
	
}