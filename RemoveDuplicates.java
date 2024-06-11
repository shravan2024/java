package array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Define an array with duplicate elements
        int[] numbersWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 8,9,10,10};

        // Call the removeDuplicates method
        int[] numbersWithoutDuplicates = removeDuplicates(numbersWithDuplicates);

        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(numbersWithoutDuplicates));
    }

    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] arr) {
        // Sort the array to group duplicates together
        Arrays.sort(arr);

        // Count the number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array to store unique elements
        int[] result = new int[uniqueCount];
        result[0] = arr[0];
        int index = 1;

        // Copy unique elements to the new array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}

