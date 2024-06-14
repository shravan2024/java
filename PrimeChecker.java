package constructs;

public class PrimeChecker {

	
		// Method to check if a number is prime
	    public static boolean isPrime(int n) {
	        // Check if the number is less than or equal to 1
	        if (n <= 1) {
	            return false;
	        }

	        // Check for factors from 2 to the square root of n
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        // If no factors are found, the number is prime
	        return true;
	    }

	    public static void main(String[] args) {
	        int number = 29; // Example number to check

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}