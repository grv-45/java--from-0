package basics;
import java.util.Scanner;

class TSAofCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate Total Surface Area of a Cuboid");
        System.out.print("Enter length (l): ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth (b): ");
        double b = sc.nextDouble();
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();

        // Formula: TSA = 2(lb + bh + lh)
        double tsa = 2 * (l * b + b * h + l * h);

        System.out.println("TSA of Cuboid = " + tsa);

        // 🔍 Hinglish Explanation:
        // Ek cuboid ke 6 faces hote hain — pairs me combine karte hain:
        // TSA = 2(lb + bh + lh)
    }
}
