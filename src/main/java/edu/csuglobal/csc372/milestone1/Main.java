package edu.csuglobal.csc372.milestone1;

import edu.csuglobal.csc372.milestone1.bank_account.BankAccount;
import edu.csuglobal.csc372.milestone1.bank_account.CheckingAccount;
import edu.csuglobal.csc372.milestone1.bank_account.GUIBankAccount;
import edu.csuglobal.csc372.milestone1.user_interface.UserInterface;

import java.util.Scanner;

public final class Main {

    private Main() {
    } // Utility classes should not have a public or default constructor.

    public static void main(String[] args) {
        if (args.length != 1 || args[0].equals("1") || args[0].equals("2") || args[0].equals("3")) {
            args = new String[1];
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("""
                                   Enter:\s
                                   1 for module 1 Critical Thinking, Checking Account (Console Test App)
                                   2 for module 2 Critical Thinking, GUI Bank Account
                                   3 for module 3 Critical Thinking, User Interface (Interactive Swing GUI)""");
                args[0] = scanner.nextLine().substring(0, 1);
            } while (!args[0].equals("1") && !args[0].equals("2") && !args[0].equals("3"));
        }
        switch (Integer.parseInt(args[0])) {
            case 1 -> testConsoleApp(); // CSC 372 Module 1 Critical Thinking
            case 2 -> GUIBankAccount.main(new String[0]);  // CSC 372 Module 2 Critical Thinking.
            case 3 -> UserInterface.main(new String[0]);  // CSC 372 Module 3 Critical Thinking.
            default -> System.out.println("Invalid input");
        }
    }

    /**
     * This was the original code used to test the console app from Module 1 Critical Thinking.
     */
    public static void testConsoleApp() {
        BankAccount bankAccount = new BankAccount("Jane", "Doe", "JD1234");
        CheckingAccount checkingAccount = new CheckingAccount("John", "Smith", "JS5678", 0.051f);
        bankAccount.accountSummary();
        bankAccount.deposit(10);
        bankAccount.accountSummary();
        bankAccount.withdrawal(20);
        bankAccount.accountSummary();
        bankAccount.withdrawal(5);
        bankAccount.accountSummary();
        checkingAccount.displayAccount();
        checkingAccount.deposit(10);
        checkingAccount.displayAccount();
        checkingAccount.processWithdrawal(20);
        checkingAccount.displayAccount();
        checkingAccount.processWithdrawal(5);
        checkingAccount.displayAccount();
    }
}