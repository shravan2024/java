package constructs;

import java.util.Scanner;

public class palindromeChecker {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();
        
        // Remove non-alphanumeric characters and convert to lowercase
        String sanitizedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the sanitized string is a palindrome
        if (isPalindrome(sanitizedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}