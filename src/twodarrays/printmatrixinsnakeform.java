package twodarrays;

public class printmatrixinsnakeform {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 4, 5, 6},
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {9, 8, 7, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) { // even row -> left to right
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else { // odd row -> right to left
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println(); // move to next line after each row
        }
    }
}
