package sorting;
import java.util.Scanner;
public class ifsortedornot {

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

            // Step 3: Check if array is sorted
            boolean isSorted = true; // initially assume sorted
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false; // agar current element next se bada hai
                    break;
                }
            }

            // Step 4: Print result
            if (isSorted) {
                System.out.println("Array is sorted in ascending order.");
            } else {
                System.out.println("Array is not sorted.");
            }
        }


}
