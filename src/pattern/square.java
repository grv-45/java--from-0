package pattern;

public class square {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line after each row
        }//numsquare
        /*
                for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j); // print number (column index)
            }
            System.out.println();
        }

         */
        //alphabet square: abcd abcd abcd abcd
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Convert number to corresponding character
                char ch = (char) ('A' + j - 1);
                System.out.print(ch);
            }
            System.out.println();

         */
        }
    }



