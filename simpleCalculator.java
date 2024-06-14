package constructs;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Simple Calculator");
	        
	        // Prompt user to enter first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();
	        
	        // Prompt user to enter second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
	        
	        // Prompt user to enter the operation
	        System.out.print("Enter the operation (+, -, *, /): ");
	        char operation = scanner.next().charAt(0);
	        
	        // Perform the operation and store the result
	        double result;
	        switch (operation) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                // Check for division by zero
	                if (num2 == 0) {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return;
	                }
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("Error: Invalid operation.");
	                return;
	        }
	        
	        // Display the result
	        System.out.println("The result is: " + result);
	    }
	}