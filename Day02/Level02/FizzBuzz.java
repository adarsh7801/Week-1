import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            //condition if number is a multiple of 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } //checking condition for fizz
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } //condition for buzz
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}