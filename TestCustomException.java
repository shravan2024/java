package exception;

// Custom exception class extending Exception
class InvalidAgeException extends Exception {

    // Constructor with a custom error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to test custom exception
public class TestCustomException {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 120.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            // Validate ages
            validateAge(25);   // Valid age
            validateAge(-5);   // Invalid age, should throw exception
            validateAge(150);  // Invalid age, should throw exception
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.err.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
