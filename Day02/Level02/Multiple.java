import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = sc.nextInt();

        // Find and print multiples
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 1; i < 100; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
