package basics;
import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate Simple Interest");
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Rate (R) in %: ");
        double R = sc.nextDouble();
        System.out.print("Enter Time (T) in years: ");
        double T = sc.nextDouble();

        // Formula: S.I. = (P × R × T) / 100
        double SI = (P * R * T) / 100;

        System.out.println("Simple Interest = " + SI);


        // Formula direct use kiya.
        // Double liya taaki decimals (paise, fractions) handle ho sakein.
    }
}
