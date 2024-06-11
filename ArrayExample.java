package array;


public class ArrayExample {
    public static void main(String[] args) {
        // Initializing an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements of an array
        System.out.println("Element at index 2: " + numbers[2]); // Outputs: 3

        // Modifying an element of an array
        numbers[3] = 10;
        System.out.println("Modified element at index 3: " + numbers[3]); // Outputs: 10

        // Iterating over an array
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Outputs: Array elements: 1 2 3 10 5

        // Finding the sum of elements in an array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of array elements: " + sum); // Outputs: Sum of array elements: 21

        // Finding the maximum element in an array
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element in the array: " + max); // Outputs: Maximum element in the array: 10
    }
}
