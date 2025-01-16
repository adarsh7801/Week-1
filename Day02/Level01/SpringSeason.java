import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking input for date
		System.out.println("Please input the date");
		int date = sc.nextInt();
		System.out.println("Please input the month");
		int month = sc.nextInt();
		
        // Check if the given date falls within the Spring season (March 20 to June 20)
        if ((month==3 && date>=20)||(month==6 && date<=20)||month==4||month==5){  
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}