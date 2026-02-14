package basics;

import java.util.Scanner;

class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        System.out.println("Square is: " + square);

        // nextInt() user se integer input leta hai.
        // square nikalne ke liye simple multiply kiya (num * num)
    }
}
