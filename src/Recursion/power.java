package Recursion;
import java.util.Scanner;

public class power {

    // Recursive function to calculate a^b
    public static int power(int a, int b) {
        // base case
        if (b == 0)
            return 1;

        // recursive step
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        int pow = power(a, b); // function call
        System.out.println(a + " raised to power " + b + " is: " + pow);
    }
}
