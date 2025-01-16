import java.util.Scanner;

public class ChocolatesDivision {

    // creating method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] arr = new int[2];
        arr[0] = number / divisor;
        arr[1] = number % divisor;
        return arr;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates = sc.nextInt();
        System.out.println("Enter the number of children:");
        int numberOfChildren = sc.nextInt();

        // storing result in an array
        int[] result = new int[2];
        result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // printing answer
        System.out.println("Chocolates each child gets = " + result[0]);
        System.out.println("Remaining chocolates = " + result[1]);

        // closing scanner
        sc.close();
    }
}
