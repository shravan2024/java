package collections;

import java.util.*;

public class DictionaryApp {
    public static void main(String[] args) {
        // Create a TreeMap to store word-definition pairs
        TreeMap<String, String> dictionary = new TreeMap<>();
        
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Menu-driven loop for dictionary application
        while (true) {
            System.out.println("\nDictionary Application Menu:");
            System.out.println("1. Add a word and its definition");
            System.out.println("2. Retrieve definition of a word");
            System.out.println("3. Display all words and definitions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    // Add a word and its definition
                    System.out.print("\nEnter word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word and definition added successfully.");
                    break;
                case 2:
                    // Retrieve definition of a word
                    System.out.print("\nEnter word to retrieve definition: ");
                    String lookupWord = scanner.nextLine();
                    if (dictionary.containsKey(lookupWord)) {
                        String retrievedDefinition = dictionary.get(lookupWord);
                        System.out.println("Definition of '" + lookupWord + "': " + retrievedDefinition);
                    } else {
                        System.out.println("Word '" + lookupWord + "' not found in the dictionary.");
                    }
                    break;
                case 3:
                    // Display all words and definitions in alphabetical order
                    System.out.println("\nDictionary Contents:");
                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Exiting Dictionary Application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
