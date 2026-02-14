package twodarrays;

public class rowwithmaxsum {
    public static void main(String[] args) {
        // Jagged array
        int[][] arr = {
                {43, 34, 24, 24},
                {43, 34, 2, 12},
                {43, 5, 3, 33}
        };

        int max = Integer.MIN_VALUE;
        int row = -1;

        // Loop through each row
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            // Use arr[i].length (not arr[0].length)
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            // Update max and row index
            if (sum > max) {
                max = sum;
                row = i;
            }
        }

        System.out.println("Maximum Row Sum: " + max);
        System.out.println("Row Index: " + row);
    }
}
