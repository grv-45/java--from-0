package HasSet;

//HashSet ek collection class hai jo:
//
//Duplicate values allow ❌ nahi karta
//
//Order maintain ❌ nahi karta
//
//Fast operations deta hai (O(1) average time)
//
//Internally Hashing use karta hai
import java.util.HashSet;

public class Basicop {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();// creation
        // Adding data
        set.add(45);
        set.add(341);
        set.add(454);
        set.add(4);
        set.add(3);
        set.add(45);   // duplicate
        set.add(100);
        set.add(200);

        System.out.println("Size: " + set.size());
        System.out.println("Contains 45: " + set.contains(45));

        set.remove(45);

        System.out.println("Contains 45 after removal: " + set.contains(45));

        System.out.println("Final Set: " + set);

    }
}
