// Import karte hain ArrayList class
import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {

        // 1️⃣ ArrayList banana
        // Syntax: ArrayList<Type> name = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // 2️⃣ Elements add karna
        names.add("Ravi");
        names.add("Aman");
        names.add("Sita");
        names.add("Geeta");

        // 3️⃣ Print karna (pure list)
        System.out.println("ArrayList elements: " + names);

        // 4️⃣ Specific index pe element add karna
        names.add(2, "Mohit"); // index 2 pe insert hoga
        System.out.println("After adding Mohit: " + names);

        // 5️⃣ Element access karna (get method)
        System.out.println("Element at index 1: " + names.get(1));

        // 6️⃣ Element change/update karna (set method)
        names.set(0, "Rohit"); // index 0 pe "Ravi" ki jagah "Rohit"
        System.out.println("After updating first element: " + names);

        // 7️⃣ Element remove karna
        names.remove("Sita"); // value se remove
        System.out.println("After removing Sita: " + names);

        // 8️⃣ Index se remove karna
        names.remove(1); // index 1 ka element remove hoga
        System.out.println("After removing index 1 element: " + names);

        // 9️⃣ Size check karna
        System.out.println("Size of ArrayList: " + names.size());

        // 🔟 Check karna element present hai ya nahi
        System.out.println("Contains Geeta? " + names.contains("Geeta"));
        System.out.println("Contains Aman? " + names.contains("Aman"));

        // 1️⃣1️⃣ Loop se print karna (for loop)
        System.out.println("Printing using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        // 1️⃣2️⃣ Enhanced for loop (for-each)
        System.out.println("Printing using for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }

        // 1️⃣3️⃣ Clear karna (sab elements delete)
        names.clear();
        System.out.println("After clearing list: " + names);
    }
}
