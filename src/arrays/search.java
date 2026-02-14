package arrays;
import java.util.Scanner;
public class search {

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

            // Step 4: Element search karne ke liye input lo
            System.out.print("Enter the element to search: ");
            int key = sc.nextInt();

            // Step 5: Search process
            boolean found = false;
            int index = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == key) {
                    found = true;
                    index = i;
                    break; // Element mil gaya, loop break karo
                }
            }

            // Step 6: Result print karo
            if (found) {
                System.out.println("Element " + key + " found at index: " + index);
            } else {
                System.out.println("Element " + key + " not found in the array.");
            }
        }



}
