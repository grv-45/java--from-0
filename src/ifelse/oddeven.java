package ifelse;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Condition: Agar number 2 se divisible hai -> even, warna odd
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }


        // n % 2 remainder deta hai.
        // Agar remainder 0 hai → even number.
        // Agar remainder 1 hai → odd number.
    }
}
