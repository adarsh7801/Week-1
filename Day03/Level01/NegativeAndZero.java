import java.util.*;
public class NegativeAndZero{
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//initializing array of size 10
		int[] num = new int[10];
		
		//taking input and storing it in array
		System.out.println("Enter 10 numbers");
		for(int i=0 ;i<10; i++){
			num[i] = sc.nextInt();
			//breaking the loop if 0 or negative value is entered
			if(num[i] < 1){
				break;
			}
		}
		
		//calculating the sum
		int sum =0;
		for(int i=0 ;i<10; i++){
			sum += num[i];
		}
		
		//printing the output
		System.out.println("The sum is "+sum);
		
		//closing scanner
		sc.close();
	}
}