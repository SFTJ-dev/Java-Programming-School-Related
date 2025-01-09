import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaBank{

        public static void main(String[] args){
        
        //Add a boolean statement here
        boolean keepRunning = true;
        
        //while loop here
        while(keepRunning){
        	//add new scanner
        Scanner scanner = new Scanner(System.in);
		Account account = new Account(System.in);
        int choice = scanner.nextLine();
        
        //add switch for choices
        switch (choice){
        	case 1:createAccount(choice);
        break;
			case 2:logIn(choice);
        break;
        
        //add if else
        if(choice == 1){
			System.out.println("Let's get started!");
			try{
				System.out.println("What is your name? ");
				Scanner scanner1 = new Scanner(System.in);
				String name = scanner1.nextLine();
			}catch(InputMismatchException e){
				System.out.println("Invalid input, enter a String.");
			}//end of catch
		}else{ //end of if
			account.displayAccountInfo();
		}//end of else
		
        keepRunning = false;
        
        //Lets display the options here

        // Create SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount(12345, "Sofia Tabujara", 1000.0, 2.0);
        //savingsAccount.displayAccountInfo();

        // Create CheckingAccount instance
        CheckingAccount checkingAccount = new CheckingAccount(67890, "Kerax Lynn", 500.0, 1000.0);
        //checkingAccount.displayAccountInfo();
		}
		}
    }
}