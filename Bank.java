/*Develop a class BankAccount with fields accountNumber, balance, and accountHolder. Implement getters and setters to deposit and withdraw money(only for single bank account).*/

import java.util.*;
class BankAccount {
    private String accHolder;
    private long accNumber;
    private double balance;

    public void setAccHolder(String a) { accHolder = a; }
    public void setAccNumber(long l) { accNumber = l; }
    public void setBalance(double b) { balance = b; }

    public String getAccHolder() { return accHolder; }
    public long getAccNumber() { return accNumber; }
    public double getBalance() { return balance; }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit success! New Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal success! New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Bank {
    public static void main(String args[]) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        account.setAccHolder("bunny");
        account.setAccNumber(1234556);
        account.setBalance(10000.00);

        System.out.println("ACCOUNT DETAILS:");
        System.out.println("ACCOUNT HOLDER: " + account.getAccHolder());
        System.out.println("ACCOUNT NUMBER: " + account.getAccNumber());
        System.out.println("ACCOUNT BALANCE: " + account.getBalance());

        while (true) {
            System.out.print("Menu: 1.Balance 2.Deposit 3.Withdraw 4.Exit: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

/* OUTPUT:
ACCOUNT DETAILS:
ACCOUNT HOLDER: bunny
ACCOUNT NUMBER: 1234556
ACCOUNT BALANCE: 10000.0
Menu: 1.Balance 2.Deposit 3.Withdraw 4.Exit: 1
Balance: 10000.0
Menu: 1.Balance 2.Deposit 3.Withdraw 4.Exit: 2
Enter amount to deposit: 5000
Deposit success! New Balance: 15000.0
Menu: 1.Balance 2.Deposit 3.Withdraw 4.Exit: 3
Enter amount to withdraw: 2000
Withdrawal success! New Balance: 13000.0
Menu: 1.Balance 2.Deposit 3.Withdraw 4.Exit: 3
Enter amount to withdraw: 15000
Insufficient balance!
Menu: 1.Balance 2.Deposit 3.Withdraw 4.Exit: 4
Exiting. Thank you!
*/

/*Explanation:
Class BankAccount

->Stores account holder name, account number, and balance.
->Provides setter methods (setAccHolder, setAccNumber, setBalance) to initialize values.
->Methods setDep and setWithDraw modify the balance when deposits or withdrawals occur.
->Getter methods (getAccHolder, getAccNumber, getBalance) retrieve values.

Class Bank (Main Class):
->Creates an instance of BankAccount, initializes it with predefined values.
->Displays the account details.
->Uses a while loop with a menu that allows:
->Checking the balance.
->Depositing money.
->Withdrawing money.
->Exiting the program.
->Execution Flow

The user chooses an option.
->If 1, the balance is displayed.
->If 2, the user enters a deposit amount, and it is added to the balance.
->If 3, the user enters a withdrawal amount, and if sufficient funds exist, it is deducted; otherwise, an "insufficient balance" message appears.
->If 4, the program exits.
*/