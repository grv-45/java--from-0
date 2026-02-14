package arraylisttw0d;
import java.util.List;
import java.util.ArrayList;

public class first {
    public static void main(String[] args) {

        // 1️⃣ 3 alag ArrayLists bana rahe hain
        ArrayList<Integer> a = new ArrayList<>();
        a.add(34); a.add(24); a.add(87);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(44); b.add(64); b.add(77);b.add(24); b.add(87);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(54); c.add(94); c.add(17);

        // 2️⃣ Ab ek 2D ArrayList banate hain
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // 3️⃣ 1D lists ko 2D list me add karte hain
        arr.add(a);
        arr.add(b);
        arr.add(c);

        // 4️⃣ Print karte hain
        System.out.println(arr);

        // 5️⃣ Nested loop se properly print karna
        System.out.println("Printing row by row:");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
