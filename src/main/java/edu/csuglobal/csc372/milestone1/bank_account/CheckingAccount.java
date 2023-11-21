package edu.csuglobal.csc372.milestone1.bank_account;

public class CheckingAccount extends BankAccount {
    private float interestRate;
    private float insufficientFundsTransactionFee;

    public CheckingAccount(String firstName, String lastName, String accountID, float interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
        this.insufficientFundsTransactionFee = 30f;
    }

    void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    void setInsufficientFundsTransactionFee(float insufficientFundsTransactionFee) {
        this.insufficientFundsTransactionFee = insufficientFundsTransactionFee;
    }

    public void displayAccount() {
        System.out.printf("Account Summary%nFirst Name: %s%nLast Name:%s%nAccount ID:%s%nBalance:%.2f%n" +
                          "Interest Rate: %.1f%%%n%n",
                super.getFirstName(), super.getLastName(), super.getAccountID(), super.getBalance(),
                interestRate * 100);
    }

    public void processWithdrawal(double amount) {
        super.withdrawal(amount, true);
        if (super.getBalance() < 0) {
            System.out.println("Insufficient funds, assessing a $30 fee to this transaction.");
            super.withdrawal(insufficientFundsTransactionFee, true);
        }
    }
}
