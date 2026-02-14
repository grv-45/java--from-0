package arraylisttw0d;
import java.util.ArrayList;
import java.util.List;
public class pascaltraiangle {

        public static List<List<Integer>> generate(int n) {
            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                // create a new row
                ans.add(new ArrayList<>());

                for (int j = 0; j <= i; j++) {
                    // first or last element of each row is always 1
                    if (j == 0 || j == i) {
                        ans.get(i).add(1);
                    } else {
                        // middle elements = sum of two elements from previous row
                        int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                        ans.get(i).add(val);
                    }
                }
            }

            return ans;
        }

        // main method to test
        public static void main(String[] args) {
            List<List<Integer>> result = generate(5);

            for (List<Integer> row : result) {
                System.out.println(row);
            }
        }
    }


