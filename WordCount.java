package collections;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String input = "Hello world world again Hello";
        
        // Split the input string into words
        String[] words = input.split("\\s+");
        
        // Create a HashMap to store word counts
        Map<String, Integer> wordCounts = new HashMap<>();
        
        // Count occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                // If word is already present in the map, increment its count
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                // If word is not present in the map, add it with count as 1
                wordCounts.put(word, 1);
            }
        }
        
        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
