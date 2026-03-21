package basics;

import java.util.Scanner;

public class GymMembershipProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number :");
        int n = sc .nextInt();
        if (n==1) System.out.println("Cost : "+ 2000);
        else if (n<=3) System.out.println("Cost : "+ 5000);
        else if (n<=6) System.out.println("Cost : "+ 9000);
        else if(n>6) System.out.println("Cost : "+ 15000);
        else{
            System.out.println("Invalid Input");
        }
    }
}
