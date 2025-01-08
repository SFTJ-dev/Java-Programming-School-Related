public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.deposit(-amount); // Withdrawal
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}