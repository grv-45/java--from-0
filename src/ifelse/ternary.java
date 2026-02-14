package ifelse;
import java.util.Scanner;

public class ternary {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // Syntax: condition ? true-part : false-part
            String result = (n % 2 == 0) ? "Even" : "Odd";
            System.out.println("Number is " + result);

            // 🔍 Hinglish:
            // Ternary operator ek short if-else hai.
            // Agar condition true → pehla part chalega, warna doosra.
        }
    }


