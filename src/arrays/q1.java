package arrays;
import java.util.Scanner;
public class q1 {

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

            // Step 4: Array modify karo
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    arr[i] += 10; // Even index → +10
                } else {
                    arr[i] *= 2; // Odd index → *2
                }
            }

            // Step 5: Modified array print karo
            System.out.println("Modified array is:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }


}
