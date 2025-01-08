public class JavaBank{
	
	public static void main(String[] args){
		
		//Lets display the options here

        // Create SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount(12345, "John Doe", 1000.0, 2.0);
        //savingsAccount.displayAccountInfo();

        // Create CheckingAccount instance
        CheckingAccount checkingAccount = new CheckingAccount(67890, "Jane Doe", 500.0, 1000.0);
        //checkingAccount.displayAccountInfo();
    }
}