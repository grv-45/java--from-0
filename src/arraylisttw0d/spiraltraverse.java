import java.util.*;

class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();

        int m = mat.length;      // total rows
        int n = mat[0].length;   // total columns
        int fr = 0, lr = m - 1;  // first row, last row
        int fc = 0, lc = n - 1;  // first col, last col

        while (fr <= lr && fc <= lc) {

            // 1️⃣ Traverse left to right (top row)
            for (int j = fc; j <= lc; j++) {
                ans.add(mat[fr][j]);
            }
            fr++; // move top boundary down

            // 2️⃣ Traverse top to bottom (right column)
            for (int i = fr; i <= lr; i++) {
                ans.add(mat[i][lc]);
            }
            lc--; // move right boundary left

            // 3️⃣ Traverse right to left (bottom row)
            if (fr <= lr) { // check again to avoid double counting
                for (int j = lc; j >= fc; j--) {
                    ans.add(mat[lr][j]);
                }
                lr--; // move bottom boundary up
            }

            // 4️⃣ Traverse bottom to top (left column)
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(mat[i][fc]);
                }
                fc++; // move left boundary right
            }
        }

        return ans;
    }

    // Optional: test main
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        Solution sol = new Solution();
        System.out.println(sol.spirallyTraverse(mat));
    }
}
