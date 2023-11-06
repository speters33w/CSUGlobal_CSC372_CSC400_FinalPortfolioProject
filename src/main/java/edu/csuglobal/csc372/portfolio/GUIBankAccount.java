package edu.csuglobal.csc372.portfolio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class GUIBankAccount {

    // these must be declared here to be seen in the Action classes
    private final JFrame initialBalanceFrame;
    private final JFrame mainFrame;
    private final JFrame inputFrame;

    private final JTextField numberField;
    private final JTextField initialBalanceField;
    private final JLabel verifyLabel;
    private final JLabel balanceLabel;

    private final JButton depositButton;
    private final JButton withdrawButton;
    private final JButton makeDepositButton;
    private final JButton makeWithdrawalButton;

    private final JToggleButton balanceButton;

    private final NumberFormat currency;
    private BankAccount theAccount;
    private double theAmount;
    private boolean showBalance;

    public GUIBankAccount() {

        // define frames
        mainFrame = new JFrame("GUI Bank Account Human Interface");
        initialBalanceFrame = new JFrame("Welcome to the GUI Bank Account");
        inputFrame = new JFrame("Enter Amount");

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialBalanceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel initialBalancePanel = new JPanel();
        initialBalancePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 20));
        initialBalancePanel.setPreferredSize(new Dimension(400, 200));

        // the main frame panel
        JPanel thePanel = new JPanel();
        thePanel.setPreferredSize(new Dimension(500, 360));
        thePanel.setBackground(Color.LIGHT_GRAY);
        thePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 20));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        initialBalanceFrame.setLocation(
                (int) screenSize.getWidth() / 2 - (int) initialBalancePanel.getPreferredSize().getWidth() / 2,
                (int) screenSize.getHeight() / 2 - (int) initialBalancePanel.getPreferredSize().getHeight() / 2);
        mainFrame.setLocation(
                (int) screenSize.getWidth() / 2 - (int) thePanel.getPreferredSize().getWidth() / 2,
                (int) screenSize.getHeight() / 2 - (int) thePanel.getPreferredSize().getHeight() / 2);
        inputFrame.setLocation(
                (int) screenSize.getWidth() / 2 - (int) thePanel.getPreferredSize().getWidth() / 2 + 100,
                (int) screenSize.getHeight() / 2 - (int) thePanel.getPreferredSize().getHeight() / 2 + 30);

        JLabel pinLabel = new JLabel("Enter starting balance and Press Enter");
        initialBalanceField = new JTextField(10);
        initialBalanceField.addActionListener(new InitialBalanceAction());
        initialBalancePanel.add(pinLabel);
        initialBalancePanel.add(initialBalanceField);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new NextButtonAction());

        JPanel inputPanel = new JPanel();

        JLabel numberLabel = new JLabel("Type Amount and Press Enter");
        numberField = new JTextField(10);
        numberField.addActionListener(new NumberFieldAction());
        inputPanel.add(numberLabel);
        inputPanel.add(numberField);

        JPanel verifyPanel = new JPanel();
        verifyLabel = new JLabel("No Amount Entered");
        verifyPanel.add(verifyLabel);

        JPanel choosePanel = new JPanel();
        JLabel chooseLabel = new JLabel("Choose Transaction");
        choosePanel.add(chooseLabel);

        JPanel buttonPanel = new JPanel();
        JPanel makeButtonPanel = new JPanel();

        balanceButton = new JToggleButton("Show Balance");
        balanceButton.addActionListener(new BalanceButtonAction());
        buttonPanel.add(balanceButton);

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new DepositButtonAction());
        buttonPanel.add(depositButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new WithdrawButtonAction());
        buttonPanel.add(withdrawButton);

        makeDepositButton = new JButton("Confirm Deposit");
        makeDepositButton.addActionListener(new MakeDepositButtonAction());
        makeButtonPanel.add(makeDepositButton);

        makeWithdrawalButton = new JButton("Confirm Withdrawal");
        makeWithdrawalButton.addActionListener(new MakeWithdrawalButtonAction());
        makeButtonPanel.add(makeWithdrawalButton);

        JPanel finishButtonPanel = new JPanel();
        JButton finishButton = new JButton("Finish");
        finishButton.addActionListener(new FinishButtonAction());
        finishButtonPanel.add(finishButton);

        // todo add cancel button.

        JPanel outPanel = new JPanel();
        outPanel.setBackground(Color.LIGHT_GRAY);
        balanceLabel = new JLabel("");
        balanceLabel.setForeground(Color.RED);
        balanceLabel.setFont(new Font(balanceLabel.getFont().getName(), Font.BOLD, 20));
        outPanel.add(balanceLabel);

        thePanel.add(choosePanel);
        thePanel.add(verifyPanel);
        thePanel.add(buttonPanel);
        thePanel.add(makeButtonPanel);
        thePanel.add(finishButtonPanel);
        thePanel.add(outPanel);

        initialBalanceFrame.getContentPane().add(initialBalancePanel);
        initialBalanceFrame.pack();
        initialBalanceFrame.setVisible(true);

        mainFrame.getContentPane().add(thePanel);
        mainFrame.pack();

        inputFrame.getContentPane().add(inputPanel);
        inputFrame.pack();

        currency = NumberFormat.getCurrencyInstance();

    } // end constructor

    boolean isInputInvalid(String input) {
        if (input.equals("")) {
            return true;
        } // end if
        int decimalIndex = input.indexOf(".");
        if (decimalIndex == -1) {
            return !isAllDigits(input);
        } else {
            String first = input.substring(0, decimalIndex);
            String last = input.substring(decimalIndex + 1);
            boolean firstAndLastAllDigits = isAllDigits(first) && isAllDigits(last);
            boolean lastLengthOK = last.length() == 2;
            return !firstAndLastAllDigits && !lastLengthOK;
        } // end if
    } // end is InputOK

    boolean isAllDigits(String input) {
        int index = 0;
        while (index < input.length()) {
            if (!Character.isDigit(input.charAt(index))) {
                return false;
            } // end if
            index++;
        } // end while
        return true;
    } // end isAllDigits

    void drawBalance(JLabel outLabel) {
        if (showBalance) {
            System.out.printf("Current balance is %s%n", currency.format(theAccount.getBalance()));
            outLabel.repaint();
            outLabel.setText("The balance is " + currency.format(theAccount.getBalance()) + ".");
        } else {
            outLabel.repaint();
            outLabel.setText("");
        } // end if showBalance
    } // end drawBalance

    public static void main(String[] args) {
        new GUIBankAccount();
    } // end main

    class InitialBalanceAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String initialBalance = initialBalanceField.getText().replaceAll("[, \t\r\n]", "");
            if (isInputInvalid(initialBalance)) {
                JOptionPane.showMessageDialog(null, "Invalid input. Try again.");
                numberField.requestFocus();
                return;
            } // end if
            theAccount = new BankAccount("Adam", "Smith", "AS17760309", Double.parseDouble(initialBalance));

            initialBalanceFrame.setVisible(false);
            mainFrame.setVisible(true);
            initialBalanceField.setText("");
        } // end actionPerformed
    } // end InitialBalanceAction

    class NumberFieldAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = numberField.getText().replaceAll("[, \t\r\n]", "");
            if (isInputInvalid(input)) {
                JOptionPane.showMessageDialog(null, "Invalid input. Try again.");
                numberField.requestFocus();
                return;
            } // end if
            theAmount = Double.parseDouble(input);
            initialBalanceFrame.setVisible(false);
            inputFrame.setVisible(false);
            mainFrame.setVisible(true);
            verifyLabel.setText("Amount Entered was " + currency.format(theAmount));
        } // end actionPerformed
    } // end NumberButtonAction

    class BalanceButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (balanceButton.isSelected()) {
                showBalance = true; // todo change button text to hide balance
                drawBalance(balanceLabel);
            } else {
                showBalance = false; // todo change button text to hide balance
                drawBalance(balanceLabel);
            } // end if balanceButton.isSelected()
        } //end actionPerformed
    } // end BalanceButtonAction

    class DepositButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputFrame.setVisible(true);
            numberField.setText("");
            numberField.requestFocus();
            withdrawButton.setEnabled(false);
            makeWithdrawalButton.setEnabled(false);
        } // end actionPerformed
    } // end DepositButtonAction

    class WithdrawButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputFrame.setVisible(true);
            numberField.setText("");
            numberField.requestFocus();
            depositButton.setEnabled(false);
            makeDepositButton.setEnabled(false);
        } // end actionPerformed
    } // end WithdrawButtonAction

    class MakeDepositButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            theAccount.deposit(theAmount);

            drawBalance(balanceLabel);
            withdrawButton.setEnabled(true);
            makeWithdrawalButton.setEnabled(true);
        } // end actionPerformed
    } // end MakeDepositButtonAction

    class MakeWithdrawalButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            theAccount.withdrawal(theAmount);  // BankAccount does not allow negative balances.
            if (theAccount.getBalance() < theAmount) {
                JOptionPane.showMessageDialog(null, "Insufficient funds for this transaction.");
            }

            drawBalance(balanceLabel);
            depositButton.setEnabled(true);
            makeDepositButton.setEnabled(true);
        } // end actionPerformed
    } // end MakeWithdrawalButtonAction

    class NextButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            initialBalanceField.setText("");
            initialBalanceField.requestFocus(true);
            initialBalanceFrame.setVisible(false);
            mainFrame.setVisible(true);
        } // end actionPerformed
    } // end NextButtonAction

    class FinishButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            balanceLabel.setText("");
            mainFrame.setVisible(false);
            inputFrame.setVisible(false);
            initialBalanceFrame.setVisible(true);
            initialBalanceField.requestFocus();
            depositButton.setEnabled(true);
            withdrawButton.setEnabled(true);
            initialBalanceFrame.setVisible(false); // New for portfolio milestone
            System.exit(0); // New for portfolio milestone
        } // end actionPerformed
    } // end FinishButtonAction

} // end GUIBankAccount