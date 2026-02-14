package ifelse;

import java.util.Scanner;

class DivisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else if (n % 3 == 0)
            System.out.println("Divisible by 3 only");
        else if (n % 5 == 0)
            System.out.println("Divisible by 5 only");
        else
            System.out.println("Not divisible by 3 or 5");

        // 🔍 Hinglish:
        // Logical operators && (AND), || (OR) use kiye.
    }
}
