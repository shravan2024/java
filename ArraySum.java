package array;

public class ArraySum {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Call the sumArray method to calculate the sum
        int sum = sumArray(numbers);

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }

    // Method to calculate the sum of an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        // Iterate through the array and add each element to the sum
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
