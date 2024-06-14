package constructs;

public class ArithmeticOperations {

	 // Parameterized function to perform arithmetic operations
    public static double performOperation(double num1, double num2, String operation) {
        double result = 0;

        switch (operation.toLowerCase()) {
            case "addition":
                result = num1 + num2;
                break;
            case "subtraction":
                result = num1 - num2;
                break;
            case "multiplication":
                result = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN; // Return Not-a-Number if division by zero
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                return Double.NaN; // Return Not-a-Number if invalid operation
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        double number1 = 20;
        double number2 = 10;

        // Perform addition
        double additionResult = performOperation(number1, number2, "addition");
        System.out.println("Addition Result: " + additionResult);

        // Perform subtraction
        double subtractionResult = performOperation(number1, number2, "subtraction");
        System.out.println("Subtraction Result: " + subtractionResult);

        // Perform multiplication
        double multiplicationResult = performOperation(number1, number2, "multiplication");
        System.out.println("Multiplication Result: " + multiplicationResult);

        // Perform division
        double divisionResult = performOperation(number1, number2, "division");
        System.out.println("Division Result: " + divisionResult);
    }
}