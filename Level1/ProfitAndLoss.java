public class ProfitAndLoss{
	public static void main(String[] args){
		float cp = 129f;
		float sp = 191f;
		float profit = sp-cp;
		//Printing cost price and selling price
		System.out.println("The Cost Price is INR " +cp+ " and Selling Price is INR " +sp);
		//calculating profit percent
		float profit_percent = (profit*100)/cp;
		//printing profit and profit percent
		System.out.println("The Profit is INR " +profit+ "and the Profit Percentage is "+profit_percent);
	}
}