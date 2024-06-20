package exception;

class BankAccount {
	  private double balance;

	  public BankAccount(double balance) {
	    this.balance = balance;
	  }

	  public void deposit(double amount) {
	    if (amount > 0) {
	      balance += amount;
	    }
	  }

	  public void withdraw(double amount) {
	    if (amount > 0 && amount <= balance) {
	      balance -= amount;
	    } else {
	      System.out.println("Insufficient funds");
	    }
	  }

	  public double getBalance() {
	    return balance;
	  }
	}

	public class Bank {
	  public static void main(String[] args) {
	    BankAccount account = new BankAccount(100);
	    account.deposit(50);
	    System.out.println("Balance after deposit: rs" + account.getBalance());
	    account.withdraw(75);
	    System.out.println("Balance after withdrawal: rs" + account.getBalance());
	    account.withdraw(100); // This will print "Insufficient funds"
	  }
	}
