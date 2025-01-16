import java.util.Scanner;
public class Handshakes{
	
	//creating method to calculate handshakes
	public static int handshakes(int people){
		return (people*(people-1))/2;
	}
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the number of people");
		int people = sc.nextInt();
		
		int handshakes = handshakes(people);
		
		System.out.println("The total number of handshakes are "+handshakes);
	}
}