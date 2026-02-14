package methods;
import java.util.Scanner;
public class Maxoffour {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Take 4 inputs from user
        System.out.print("Enter 4 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Using built-in Math.max() method
        int max1 = Math.max(a, b);     // find larger of a and b
        int max2 = Math.max(c, d);     // find larger of c and d
        int result = Math.max(max1, max2); // find overall maximum


        System.out.println("Maximum number is: " + result);
    }
    }


