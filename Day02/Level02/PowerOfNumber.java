import java.util.*;
public class PowerOfNumber{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //taking inputs here
        int number=sc.nextInt();
        int power=sc.nextInt();
        //initializing result
        int result=1;
        //using loop to find result
        for(int i=1;i<=power;i++)
        {
            result=number*result;
        }
        System.out.println("number " +number +" to the power "+power+" is "+ result);
    }
}