/*
CSU Global CSC 372 Module 1: Critical Thinking

Critical Thinking Assignment (70 Points)

Option #1:  Implementing a Superclass Bank Account

Part 2: Implement a CheckingAccount class that inherits from the BankAccount class, that:

    Has an interest rate attribute
    Allows overdraft withdrawals and charges a $30 fee

Methods:

    processWithdrawal() - will display a negative balance that includes a $30 overdraft fee
                          and denotes that a fee has been accessed
    displayAccount() - should display all superclass attributes and provides an additional interest rate

Ensure that your program has the two required classes and a test class.
 */
package edu.csuglobal.csc372.milestone1.bank_account;

/**
 * The type Checking account.
 */
public class CheckingAccount extends BankAccount {
    private float interestRate;
    private float insufficientFundsTransactionFee;

    /**
     * Instantiates a new Checking account.
     *
     * @param firstName    the first name
     * @param lastName     the last name
     * @param accountID    the account id
     * @param interestRate the interest rate
     */
    public CheckingAccount(String firstName, String lastName, String accountID, float interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
        this.insufficientFundsTransactionFee = 30f;
    }

    /**
     * Sets the interest rate.
     *
     * @param interestRate the interest rate.
     */
    void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Sets a transaction fee for insufficient funds withdrawal.
     *
     * @param insufficientFundsTransactionFee the insufficient funds transaction fee
     */
    void setInsufficientFundsTransactionFee(float insufficientFundsTransactionFee) {
        this.insufficientFundsTransactionFee = insufficientFundsTransactionFee;
    }

    /**
     * Displays the account information in a text-readable format.
     */
    public void displayAccount() {
        System.out.printf("Account Summary%nFirst Name: %s%nLast Name:%s%nAccount ID:%s%nBalance:%.2f%n" +
                          "Interest Rate: %.1f%%%n%n",
                super.getFirstName(), super.getLastName(), super.getAccountID(), super.getBalance(),
                interestRate * 100);
    }

    /**
     * Processes a withdrawal.
     *
     * @param amount the amount to withdraw.
     */
    public void processWithdrawal(double amount) {
        super.withdrawal(amount, true);
        if (super.getBalance() < 0) {
            System.out.println("Insufficient funds, assessing a $30 fee to this transaction.");
            super.withdrawal(insufficientFundsTransactionFee, true);
        }
    }
}
