package ifelse;

import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check kar rahe hain ki n 5 se divisible hai ya nahi
        if (n % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is NOT divisible by 5");
        }

        // 🔍 Hinglish:
        // Agar n % 5 == 0 → matlab remainder 0, to divisible hai.
    }
}
