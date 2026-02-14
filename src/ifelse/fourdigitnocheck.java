package ifelse;

import java.util.Scanner;

class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n >= 1000 && n <= 9999) {
            System.out.println("It is a four-digit number.");
        } else {
            System.out.println("Not a four-digit number.");
        }

        // 🔍 Hinglish:
        // 1000 ≤ n ≤ 9999 → 4-digit number.
    }
}
