package Recursion;

import java.util.ArrayList;
import java.util.List;

public class printsubsets {
    public static void main(String[] args) {
        String s = "Gourav";
        List<String> list = new ArrayList<>();
        subsets("", s, 0, list);

        // Print all subsets
        for (String subset : list) {
            System.out.print(subset+" ");
        }
    }

    public static void subsets(String ans, String s, int idx, List<String> list) {
        if (idx == s.length()) {
            list.add(ans);
            return;
        }

        char ch = s.charAt(idx);

        // Include the current character
        subsets(ans + ch, s, idx + 1, list);

        // Exclude the current character
        subsets(ans, s, idx + 1, list);
    }
}
