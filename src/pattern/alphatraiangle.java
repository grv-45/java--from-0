package pattern;
import java.util.Scanner;
public class alphatraiangle {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                // print letters from A to (A + i - 1)
                for (int j = 1; j <= i; j++) {
                    char ch = (char) ('A' + j - 1);
                    System.out.print(ch);
                }
                System.out.println();
            }
        }


}
