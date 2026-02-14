package Recursion;
import java.util.Scanner;

public class Factorial {
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n <= 1)  // base case
            return 1;
        return n * factorial(n - 1);  // recursive step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int ans = factorial(n); // call recursive function
        System.out.println("Factorial of " + n + " is: " + ans);
    }
}
