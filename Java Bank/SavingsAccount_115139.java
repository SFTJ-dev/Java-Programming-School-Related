public class SavingsAccount extends Account{

	interest = amount*(rate/100);
	
    @Override
    public void withdraw(double amount) {
        if (getBalance() + interest >= amount) {
            super.deposit(-amount); // Withdrawal
        } else {
            System.out.println("Transaction exceeded overdraft limit.");
        }
    }

}