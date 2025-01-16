import java.util.Scanner;
public class HighestAndLOwest{
	
	//creating method to find the lowest and highest
	public static int[] highestAndLowest(int a,int b, int c){
		
		int[] arr = new int[2];
		if(a>b && a>c){
			arr[0]=a;
			if(b>c){
				arr[1]=c;
			}else{
				arr[1]=b;
			}
		}else if(b>a && b>c){
			arr[0]=b;
			if(a>c){
				arr[1]=c;
			}else{
				arr[1]=a;
			}
		}else{
			arr[0]=c;
			if(a>b){
				arr[1]=b;
			}else{
				arr[1]=a;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] answer = new int[2];
		answer= highestAndLowest(a, b, c);
		
		System.out.println("Highest = "+answer[0]);
		System.out.println("Lowest = "+answer[1]);
		
		sc.close();
		
	}
	
}