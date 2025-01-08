public abstract class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

	//overloaded constructor here so its easy to set
    public Account(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // lets add the getters here
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
	
    // here is the abstract withdrawal method
    public abstract void withdraw(double amount);

    //concrete method: displayAccountInfo
	public void displayAccountInfo(){
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
		
    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }
}