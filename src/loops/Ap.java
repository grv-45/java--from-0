package loops;
import java.util.Scanner;
public class Ap {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();

            int a = 2; // first term
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                a = a + 3; // common difference d = 3
            }
        }


}
