package ifelse;

import java.util.Scanner;

class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Agar negative number hai to -1 se multiply kar do
        if (n < 0) {
            n = -n;
        }

        System.out.println("Absolute Value = " + n);

        // Absolute value matlab negative sign hata dena.
        // Example: -5 → 5, 10 → 10
    }
}
