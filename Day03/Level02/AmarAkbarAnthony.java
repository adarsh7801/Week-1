import java.util.Scanner;

public class AmarAkbarAnthony {
    public static void main(String[] args) {

        //creating scanner object
        Scanner sc = new Scanner(System.in);

        //initializing int array for age and double array for height
        int[] age = new int[3];
        double[] height = new double[3];

        //taking input
        System.out.println("Enter the height of the all three ");
        for(int i=0; i<3; i++){
            height[i] = sc.nextDouble();
        }

        System.out.println("Enter the age of the all three ");
        for(int i=0; i<3; i++){
            age[i] = sc.nextInt();
        }


        //finding the youngest one
        for(int i = 0; i<3; i++){
            int count=0;
            for(int j=0; j<3; j++){
                if (age[i]<age[j]) {
                    count++;
                    if (count==2) {
                        System.out.println("the youngest is person "+(i+1)+" with age "+age[i] );
                        break;
                    }
                }
            }
        }


        //finding the tallest one
        for(int i = 0; i<3; i++){
            int count=0;
            for(int j=0; j<3; j++){
                if (height[i]>height[j]) {
                    count++;
                    if (count==2) {
                        System.out.println("the tallest is person "+(i+1)+" with height "+height[i] );
                        break;
                    }
                }
            }
        }

        //closing scanner
        sc.close();
    }
}
