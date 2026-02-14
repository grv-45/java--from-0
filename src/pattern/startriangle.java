package pattern;
import java.util.*;
public  class startriangle
{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            // Outer loop controls rows
            for (int i = 1; i <= n; i++) {
                // Inner loop prints stars = row number (i)
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // move to next line
            }
        }
    }


