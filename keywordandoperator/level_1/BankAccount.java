/*
Sample Program 1: Bank Account System

Create a BankAccount class with the following features:
Static:
- A static variable bankName shared across all accounts.
- A static method getTotalAccounts() to display total number of accounts.

This:
- Use this to resolve ambiguity in the constructor.

Final:
- Use a final variable accountNumber.

Instanceof:
- Check if an object is an instance of BankAccount before displaying details.
*/

class BankAccountDetails {
    static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final long accountNumber;

    public BankAccountDetails(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public void displayDetails(Object obj) {
        if (obj instanceof BankAccountDetails) {
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + accountHolderName);
            System.out.println("Account No: " + accountNumber);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAccountDetails acc = new BankAccountDetails("Varun", 123456789);
        acc.displayDetails(acc);
        BankAccountDetails.getTotalAccounts();
    }
}
