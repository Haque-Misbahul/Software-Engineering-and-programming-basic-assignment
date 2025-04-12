
import java.util.Scanner;



public class BankAccount {

    public static void main(String[] args) 
    
    {
        //Scanner myObj = new Scanner(System.in);
        
        //int xpin = myObj.nextInt();
        Account petersAccount = new Account(1010101, 4567);
petersAccount.getAccountNumber(); // returns 1010101
petersAccount.getPin(); // returns 22
petersAccount.credit(5000.0);
petersAccount.getBalance(); // returns 5000.0
petersAccount.debit(150.0, 4567); // returns true
petersAccount.debit(150.0, 4577); // returns false (wrong pin)
petersAccount.debit(5500.0, 4567); // returns false (not enough money on the account)
petersAccount.getBalance(); // returns 4850.0 (150 were debited once)
Account sallysAccount = new Account(1010102, 9984);
petersAccount.transferTo(sallysAccount, 563.5, 4567); //returns true
petersAccount.getBalance(); //returns 4286.5
sallysAccount.getBalance(); //returns 563.5
sallysAccount.getAccountNumber();
        
    }
    
}
