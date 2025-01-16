import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter a number");
		int number= sc.nextInt();
		
		//initializing array of size 10
		int[] table = new int[10];
		
		//storing the table in the array
		for(int i=0; i<10; i++){
			table[i] = number*(i+1);
		}
		
		//printing the output
		for(int i=0; i<10; i++){
			System.out.println(number+" * "+(i+1)+" = "+ table[i]);
		}
		
		//closing the scanner
		sc.close();
	}
}