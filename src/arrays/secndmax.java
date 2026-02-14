package arrays;
import java.util.Scanner;
public class secndmax {

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

            // Step 3: Initialize max1 and max2
            int max1 = Integer.MIN_VALUE; // sabse bada element
            int max2 = Integer.MIN_VALUE; // second sabse bada element

            // Step 4: Array traverse karke do largest elements find karo
            for (int i = 0; i < n; i++) {
                if (arr[i] > max1)
                {
                    max2 = max1; // purana max1 second max ban jaata hai
                    max1 = arr[i]; // current element sabse bada ban jaata hai
                } else if (arr[i] > max2)
                {
                    max2 = arr[i]; // current element second max ban jaata hai
                }
            }

            // Step 5: Print max1 and max2
            System.out.println("Maximum element (max1) is: " + max1);
            System.out.println("Second maximum element (max2) is: " + max2);

    }

}
