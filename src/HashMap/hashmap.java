package HashMap;

import java.util.HashMap;
import java.util.Map;

//HashMap ek data structure hai jo:
//
// ✅ Key–Value pair me data store karta hai
//✅ Duplicate keys allow ❌ nahi karta
//✅ Values duplicate ho sakti hain ✅
//✅ Fast operations deta hai (O(1) average time)
//✅ Internally hashing use karta hai
public class hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Adding Data
        map.put("Ravi", 85);
        map.put("Aman", 90);
        map.put("Aman", 91);   // Updated
        map.put("Neha", 78);
        map.put("Ravi", 95);   // Updated

        // Size
        System.out.println("Size: " + map.size());

        // Full Map
        System.out.println("Map: " + map);

        // Remove Ravi
        System.out.println("Removed Ravi Marks: " + map.remove("Ravi"));

        // After removal
        System.out.println("After Removal: " + map);

        // Get value safely
        System.out.println("Neha Marks: " + map.getOrDefault("Neha", 0));
        System.out.println("Karan Marks: " + map.getOrDefault("Karan", 0));
        System.out.println(map.containsKey("Neha"));

        for(String key: map.keySet()){
            System.out.println(key+"  " + map.get(key));
        }


    }
}
