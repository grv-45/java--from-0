package arrays;
import java.util.Scanner;
public class twosum {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Array ka size input lo
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Step 2: Array ke elements input lo
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 3: Target sum input lo
            System.out.print("Enter the target sum: ");
            int target = sc.nextInt();

            // Step 4: Two Sum logic
            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                        found = true;
                        // break; // Agar sirf ek pair chahiye to break karo
                    }
                }
            }

            if (!found) {
                System.out.println("No pair found with the target sum.");
            }
        }


}
