package exception;

//MobileRecharge class
public class MobileRecharge {

 private String mobileNumber;
 private double amount;

 // Constructor
 public MobileRecharge(String mobileNumber, double amount) {
     this.mobileNumber = mobileNumber;
     this.amount = amount;
 }

 // Method to recharge the mobile
 public void recharge() {
     System.out.println("Recharging " + mobileNumber + " with amount: " + amount);
     // Logic to perform the recharge operation, like calling an API or updating a database
     System.out.println("Recharge successful!");
 }

 // Getters and setters (optional based on your needs)
 public String getMobileNumber() {
     return mobileNumber;
 }

 public void setMobileNumber(String mobileNumber) {
     this.mobileNumber = mobileNumber;
 }

 public double getAmount() {
     return amount;
 }

 public void setAmount(double amount) {
     this.amount = amount;
 }

 // Main method for testing
 public static void main(String[] args) {
     // Example usage:
     MobileRecharge recharge1 = new MobileRecharge("9876543210", 200.0);
     recharge1.recharge();
     
     MobileRecharge recharge2 = new MobileRecharge("9988776655", 500.0);
     recharge2.recharge();
 }
}
