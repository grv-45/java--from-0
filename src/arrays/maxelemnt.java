package arrays;
import java.util.Scanner;
public class maxelemnt {



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

            // Step 4: Maximum element find karo
            int max = arr[0]; // pehla element ko max assume karo
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) { // Agar current element max se bada hai
                    max = arr[i];   // to max update karo
                }
            }

            // Step 5: Maximum element print karo
            System.out.println("Maximum element in the array is: " + max);
        }


}
