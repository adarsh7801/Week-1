import java.util.Scanner;
public class feeAndDiscountPercent{
	public static void main(String[] args){
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//taking fee input
		double fee= sc.nextDouble();
		
		//taking discount percent as input
		double discount_percent = sc.nextDouble();
		
		//calculating the fee discount amount
		double discount_amount = (fee*discount_percent)/100.0;
		
		//calculating discounted fee
		double discounted_fee = fee - discount_amount;
		
		System.out.println("The discount amount is INR " +discount_amount+ "and final discounted fee is INR " +discounted_fee);
	}
}