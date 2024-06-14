package constructs;

public class Factorial {

    // Iterative method to calculate factorial
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial

        // Iterative approach
        long iterativeResult = factorialIterative(number);
        System.out.println("Factorial of " + number + " (iterative): " + iterativeResult);

        // Recursive approach
        long recursiveResult = factorialRecursive(number);
        System.out.println("Factorial of " + number + " (recursive): " + recursiveResult);
    }
}