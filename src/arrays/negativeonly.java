package arrays;
import java.util.Scanner;
public class negativeonly {

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

            // Step 4: Negative elements print karo
            System.out.println("Negative elements in the array are:");
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) { // Agar element 0 se chhota hai
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }


