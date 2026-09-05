package Strings;

public class allSubstring {
    public static void main(String[] args) {
        String str = "Gourav";

        System.out.print("All substrings of '" + str + "':");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j)+" ");
            }
            System.out.println(" ");
        }
    }
}