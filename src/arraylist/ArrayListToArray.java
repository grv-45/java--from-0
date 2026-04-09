package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(34);
        ans.add(23);
        ans.add(78);
        ans.add(39);
        ans.add(342);

        int n = ans.size();
        int[] arr = new int[n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[k++] = ans.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}