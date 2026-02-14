package methods;
import java.util.Scanner;
public class swap {

        // Method to swap and display numbers
        public static void swa(int x, int y) {
            int temp = x;
            x = y;
            y = temp;
            System.out.println("After swapping inside method: a = " + x + ", b = " + y);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Before swapping: a = " + a + ", b = " + b);
            swa(a, b); // pass by value
            System.out.println("After calling method (main values unchanged): a = " + a + ", b = " + b);
        }
    }


