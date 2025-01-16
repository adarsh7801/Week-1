import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();
        
        // initializing i
        int i = 1;  
        
        // using while loop
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
