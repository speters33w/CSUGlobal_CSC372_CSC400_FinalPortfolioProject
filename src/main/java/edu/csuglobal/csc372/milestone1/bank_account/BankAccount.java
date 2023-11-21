package edu.csuglobal.csc372.milestone1.bank_account;

/**
 * The type Bank account.
 */
public class BankAccount {
    /**
     * The first name of the account holder.
     */
    private String firstName;
    /**
     * The last name of the account holder.
     */
    private String lastName;
    /**
     * The account id.
     */
    private String accountID;
    /**
     * The initial balance.
     */
    private double balance;

    @SuppressWarnings("unused")
    private BankAccount() {
    }

    /**
     * Instantiates a new Bank account.
     *
     * @param firstName the first name of the account holder.
     * @param lastName  the last name of the account holder.
     * @param accountID the account id.
     */
    public BankAccount(String firstName, String lastName, String accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0;
    }

    /**
     * Instantiates a new Bank account.
     *
     * @param firstName      the first name of the account holder.
     * @param lastName       the last name of the account holder.
     * @param accountID      the account id.
     * @param initialBalance the initial balance.
     */
    public BankAccount(String firstName, String lastName, String accountID, double initialBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = initialBalance;
    }

    /**
     * Sets the first name of the account holder.
     *
     * @param firstName the first name of the account holder.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the account holder.
     *
     * @param lastName the last name of the account holder.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets account id.
     *
     * @param accountID the account id.
     */
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * Gets the first name of the account holder.
     *
     * @return the first name of the account holder.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the account holder.
     *
     * @return the last name of the account holder.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the account id.
     *
     * @return the account id.
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Gets the current balance.
     *
     * @return the current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposit to the bank account.
     *
     * @param amount the amount to deposit.
     */
    public void deposit(double amount) {
        System.out.printf("Depositing $%.2f to account %s%n", amount, this.getAccountID());
        balance += amount;
    }

    /**
     * Withdraws from the bank account.
     *
     * @param amount the amount to withdraw.
     */
    public void withdrawal(double amount) {
        System.out.printf("Withdrawing $%.2f from account %s%n", amount, this.getAccountID());
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Transaction failed.");
        }
    }

    /**
     * Withdraws from the bank account.
     *
     * @param amount        the amount to withdraw.
     * @param allowNegative Allows withdrawal of negative amounts with a fee if true.
     */
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

    /**
     * Returns a String representation of the Bank Account.
     *
     * @return a String representation of the Bank Account.
     */
    public String toString() {
        return String.format("Account Summary%nFirst Name: %s%nLast Name:%s%nAccount ID:%s%nBalance:%.2f%n%n",
                firstName, lastName, accountID, balance);
    }

    /**
     * Prints an account summary.
     */
    public void printAccountSummary() {
        System.out.print(this.toString());
    }

}
