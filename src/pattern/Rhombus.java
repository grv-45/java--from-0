package pattern;

public class Rhombus {
        public static void main(String[] args) {
            int rows = 5;

            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }

                // Print asterisks
                for (int k = 1; k <= rows; k++) {
                    System.out.print("*");
                }

                // Move to the next line
                System.out.println();
            }
        }

}
