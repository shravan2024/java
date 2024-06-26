package collections;

import java.util.HashMap;
import java.util.Map;

public class CricketScores {
    public static void main(String[] args) {
        // Create a HashMap to store cricketer names and their scores
        Map<String, Integer> scoresMap = new HashMap<>();
        
        // Adding cricketer names and scores to the HashMap
        scoresMap.put("Virat Kohli", 120);
        scoresMap.put("Rohit Sharma", 85);
        scoresMap.put("MS Dhoni", 50);
        scoresMap.put("Jasprit Bumrah", 0); // Just for example
        
        // Batsman name to search for
        String batsmanName = "Rohit Sharma";
        
        // Check if the batsman name exists in the map
        if (scoresMap.containsKey(batsmanName)) {
            // Get and display the score of the batsman
            int score = scoresMap.get(batsmanName);
            System.out.println("Score of " + batsmanName + " is: " + score);
        } else {
            // Batsman not found in the map
            System.out.println("Batsman " + batsmanName + " not found in the records.");
        }
    }
}
