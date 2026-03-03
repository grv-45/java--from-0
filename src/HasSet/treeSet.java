package HasSet;

import java.util.TreeSet;
//TreeSet ek collection class hai jo:
//
//        ✅ Duplicate allow nahi karta
//✅ Elements ko sorted order me store karta hai
//✅ Internally Red-Black Tree use karta hai
//✅ Operations O(log n) time me hoti hain

public class treeSet {
        public static void main(String[] args) {
                TreeSet<Integer> set = new TreeSet<>();
                // Adding data
                set.add(45);
                set.add(341);
                set.add(454);
                set.add(4);
                set.add(3);
                set.add(100);
                set.add(50);
                set.add(3);     // duplicate
                set.add(500);

                System.out.println("Size: " + set.size());
                System.out.println("Contains 45: " + set.contains(45));

                set.remove(45);

                System.out.println("After removing 45: " + set);
                System.out.println("First element: " + set.first());
                System.out.println("Last element: " + set.last());
        }
}