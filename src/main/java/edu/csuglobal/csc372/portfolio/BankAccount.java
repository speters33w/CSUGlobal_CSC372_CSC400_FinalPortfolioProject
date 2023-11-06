package edu.csuglobal.csc372.portfolio;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String accountID;
    private double balance;

    private BankAccount() {
    }

    public BankAccount(String firstName, String lastName, String accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0;
    }

    public BankAccount(String firstName, String lastName, String accountID, double initialBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        System.out.printf("Depositing $%.2f to account %s%n", amount, this.getAccountID());
        balance += amount;
    }

    public void withdrawal(double amount) {
        System.out.printf("Withdrawing $%.2f from account %s%n", amount, this.getAccountID());
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
        }
    }

    public void withdrawal(double amount, boolean allowNegative) {
        if (amount < balance && allowNegative) {
            System.out.printf("Withdrawing $%.2f from account %s%n", amount, this.getAccountID());
            balance -= amount;
        } else if (amount < balance) {
            System.out.println("Insufficient funds. Transaction failed.");
        } else {
            balance -= amount;
        }
    }

    public void accountSummary() {
        System.out.printf("Account Summary%nFirst Name: %s%nLast Name:%s%nAccount ID:%s%nBalance:%.2f%n%n", firstName, lastName, accountID, balance);
    }

}
