import java.util.Scanner;
public class SpringSeason{
	
	//creating method for to find whether its spring season or not
	public static String spring(int month, int date){
		if ((month==3 && date>=20)||(month==6 && date<=20)||month==4||month==5){  
            return "It's a Spring Season";
        } else {
            return "Not a Spring Season";
        }
	}
	
	public static void main(String[] args){
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter the month");
		int month = sc.nextInt();
		System.out.println("Enter the date");
		int date = sc.nextInt();
		
		//printing output
		System.out.println(spring(month, date));
		
		//closing scanner
		sc.close();
	}
}