package methods;
import java.util.Scanner;
public class nprandncr {



        // Method to calculate factorial
        public static long factorial(int n) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();

            // Calculate using formula
            long nCr = factorial(n) / (factorial(r) * factorial(n - r));
            long nPr = factorial(n) / factorial(n - r);

            System.out.println("nCr = " + nCr);
            System.out.println("nPr = " + nPr);
        }
    }


