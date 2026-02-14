package arrays;
import java.util.Scanner;
public class reverse {

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

            // Step 3: Reverse the array in-place
            int start = 0;
            int end = n - 1;
            while (start < end) {
                // Swap arr[start] and arr[end]
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            // Step 4: Print the reversed array
            System.out.println("Reversed array is:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

    }

}
