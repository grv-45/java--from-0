package arrays;
import java.util.Scanner;
public class sum {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Array ka size input lo
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n]; // Step 2: Array declare karo

            // Step 3: Array ke elements input lo
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 4: Sum calculate karo
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i]; // sum = sum + arr[i]
            }

            // Step 5: Sum print karo
            System.out.println("Sum of the array elements is: " + sum);

    }

}
