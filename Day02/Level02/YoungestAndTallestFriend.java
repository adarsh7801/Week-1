import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input for ages and heights of  friends
        System.out.print("Enter age of Amar: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int anthonyHeight = sc.nextInt();

        // youngest friend based on age
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        //  tallest friend based on height
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";

        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Displaying the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");

        sc.close();
    }
}
