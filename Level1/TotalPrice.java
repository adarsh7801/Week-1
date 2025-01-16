import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] args){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking input of price and quantity
		System.out.println("Enter the price of the Product");
		int price = sc.nextInt();
		System.out.println("Enter the number of products");
		int quantity = sc.nextInt();
		
		//calculating the price of total purchase
		int total_Price = quantity*price;
		
		//printing 
		System.out.println("The total purchase price is INR "+total_Price+" if the quantity "+ quantity +" and unit price is INR "+quantity);
		
		//closing scanner
		sc.close();
	}
}