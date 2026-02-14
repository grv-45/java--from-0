package pattern;

public class rectangle {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line after each row
        }

}

}
