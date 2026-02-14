package pattern;
import java.util.Scanner;
public class numtraiangle {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            // Outer loop = number of rows
            for (int i = 1; i <= n; i++) {
                // Inner loop prints 1 to i
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println(); // new line after each row
            }
        }
    }


