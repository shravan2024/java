package functions;

import java.util.Scanner;
import java.time.Year;

class Voter {
    private int birthYear;
    private int age;
    private boolean eligible;

    // Constructor to initialize the birth year
    public Voter(int birthYear) {
        this.birthYear = birthYear;
        calculateAge();
        checkEligibility();
    }

    // Method to calculate age
    private void calculateAge() {
        int currentYear = Year.now().getValue();
        this.age = currentYear - birthYear;
    }

    // Method to check voting eligibility
    private void checkEligibility() {
        this.eligible = (this.age >= 18);
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Current Age: " + age);
        if (eligible) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

