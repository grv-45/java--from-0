package ifelse;

import java.util.Scanner;

class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = sc.nextInt();
        System.out.print("Enter side b: ");
        int b = sc.nextInt();
        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Triangle condition: sum of two sides > third side
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Triangle is valid");
        else
            System.out.println("Invalid triangle");

        // 🔍 Hinglish:
        // Har do sides ka sum teesri side se bada hona chahiye.
    }
}
