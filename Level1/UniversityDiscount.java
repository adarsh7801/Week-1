public class UniversityDiscount{
	public static void main(String[] args){
		int fee = 125000;
		int dissount_percent = 10;
		//calculating the discount amount
		int discount_amount = (fee * dissount_percent)/100;
		//calculating the discounted fee
		int discounted_fee = fee- discount_amount;
		//printing the discount amount and discounted fee
		System.out.println(" The discount amount is INR "+discount_amount+ " and final discounted fee is INR " +discounted_fee);
	}
}