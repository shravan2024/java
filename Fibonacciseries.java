package constructs;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user to enter the number of terms
	        System.out.print("Enter the number of terms for the Fibonacci series: ");
	        int numTerms = scanner.nextInt();
	        
	        // Validate the number of terms
	        if (numTerms <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            // Generate and print the Fibonacci series
	            System.out.println("Fibonacci series up to " + numTerms + " terms:");
	            int a = 0, b = 1;
	            for (int i = 0; i < numTerms; i++) {
	                System.out.print(a + " ");
	                int next = a + b;
	                a = b;
	                b = next;
	            }
	        }
	    }
	}