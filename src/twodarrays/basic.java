package twodarrays;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 2D array with 3 rows and 4 columns
        int[][] arr = new int[3][4];

        System.out.println("Enter elements of 3x4 matrix:");

        // Input loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output loop
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
        // addditon in 2d array
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
