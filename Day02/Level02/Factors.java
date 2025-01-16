import java.util.*;
public class Factors
{
    public static void main(String[] args) {
        //user input
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=1;i<100;i++)
        {
            //using if condition to check number is completely divisible or not
            if(number%i==0)
            {
                System.out.println(i);
            }
        }
    }
}