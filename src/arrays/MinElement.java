package arrays;
import java.util.Scanner;

    public class MinElement {
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

            // Step 4: Minimum element find karo
            int min = arr[0]; // Pehla element ko minimum maan ke start karo
            for (int i = 1; i < n; i++) {
                if (arr[i] < min) { // Agar current element min se chhota hai
                    min = arr[i];   // to min update karo
                }
            }

            // Step 5: Minimum element print karo
            System.out.println("Minimum element in the array is: " + min);
        }


}
