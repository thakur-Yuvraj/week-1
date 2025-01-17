// Program to Simulate an ATM
// Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
// Depositing money.
// Withdrawing money (only if sufficient balance exists).
// Displaying the current balance.
// Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state.


// Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
// Depositing money, withdrawing money
class BankAccount {
    // class attribute
    private String accountHolder = null;
    private int accountNumber;
    private double balance;

    // methods
    // constructor to initilized the Bank account
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // function to deposite money
    void deposit(int amount){
        // checking if it is valid
        if (amount < 0) {
            System.out.println("Invalid Deposit");
            return;
        }
        balance += amount;
        System.out.println("Money Deposited Sucessfully");
    }

    // Withdrawing money (only if sufficient balance exists).
    double withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Not enough Balance");
            return 0.0;
        }
        balance -= amount;
        return amount;
    };

    // displaying the balance in the bank account
    void display() {
        System.out.println(accountHolder+ " Your account No "+ accountNumber + " has "+ balance + " rupees");
    }

}


public class ATM {
    public static void main(String[] args) {
        // creating a new bank account
        BankAccount bAccount1 = new BankAccount("Shivam", 9413, 500);

        // depositing a amount
        bAccount1.deposit(900);

        // withdrawing amount
        double withdrawingAmount = bAccount1.withdraw(800);
        
        // Printing the withdraw amount
        System.out.println("Withdraw amount is :"+ withdrawingAmount);

        // displaying the account balance
        bAccount1.display();
    }
}
