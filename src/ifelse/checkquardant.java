package ifelse;

import java.util.Scanner;

class QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Origin");
        else if (x == 0)
            System.out.println("On Y-axis");
        else if (y == 0)
            System.out.println("On X-axis");
        else if (x > 0 && y > 0)
            System.out.println("1st Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("2nd Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("3rd Quadrant");
        else
            System.out.println("4th Quadrant");

        // 🔍 Hinglish:
        // Cartesian plane ke 4 parts hote hain:
        // (+,+) → Q1, (-,+) → Q2, (-,-) → Q3, (+,-) → Q4
        // Axis ya origin alag cases hain.
    }
}
