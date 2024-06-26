package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Adding elements to the HashMap
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("orange", 15);
        hashMap.put("grape", 8);
        
        // Displaying the HashMap before modification
        System.out.println("HashMap before modification:");
        System.out.println(hashMap);
        
        // Associate a specified value with a specified key
        String key = "apple";
        int newValue = 20;
        hashMap.put(key, newValue);
        
        // Displaying the HashMap after modification
        System.out.println("\nHashMap after modifying value for key '" + key + "':");
        System.out.println(hashMap);
    }
}
