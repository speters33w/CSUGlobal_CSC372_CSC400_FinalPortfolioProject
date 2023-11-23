/*
CSU Global CSC 400 Module 4 Critical Thinking

Critical Thinking Assignment (70 Points)

Program 2 (Java Postfix Converter)

Create a Java Postfix converter using the algorithm provided in Segment 5.16 on page 167 (Chapter 5 of Carrano
& Henry, 2019, p. 167).

Ensure that your program has the required class and a test class.
*/
package edu.csuglobal.csc400.milestone1.postfix;

import java.util.Stack;

//ConvertToPostfix requires a minimum Java version of 14 or higher to compile.
public class ConvertToPostfix {

    /**
     * Converts an infix expression to an equivalent postfix expression.
     *
     * @param infix the infix expression.
     * @return the equivalent postfix expression.
     */
    public String convertToPostfix(String infix) {
        Stack<Character> operatorStack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        infix = infix.trim().replaceAll(" ", "");  // remove whitespace
        while (!infix.isEmpty()) {
//            System.out.print(infix + "/n"); // for testing purposes
            char nextCharacter = infix.charAt(0);
            int precedence = precedence(nextCharacter);
            switch (precedence) {
                case -1 -> throw new IllegalArgumentException(
                        "Invalid infix expression: " + infix); // invalid infix expression
                case 0 -> postfix.append(" ").append(nextCharacter); // alphanumeric (variable or digit)
                case 5 ->  operatorStack.push(nextCharacter); // '^'
                case 4, 3 -> { // '+', '-', '/', '*', '%'
                    while (!operatorStack.isEmpty() && precedence(nextCharacter) <= precedence(operatorStack.peek())) {
                        postfix.append(" ").append(operatorStack.peek());
                        operatorStack.pop();
                    } // while (!operatorStack.isEmpty()
                    operatorStack.push(nextCharacter);
                }
                case 2 -> operatorStack.push(nextCharacter); // '('
                case 1 -> { // ')' // stack is not empty if infix expression is valid
                    char topOperator = operatorStack.pop();
                    while (topOperator != '(') {
                        postfix.append(" ").append(topOperator);
                        topOperator = operatorStack.pop();
                    } // while (topOperator != '(')
                }
                default -> {
                }
            } // switch (precedence)
            infix = infix.substring(1);
        } // while (!infix.isEmpty())
        while (!operatorStack.isEmpty()) {
            char topOperator = operatorStack.pop();
            postfix.append(" ").append(topOperator);
        } // while (!operatorStack.isEmpty())
        return postfix.toString().trim();
    } // convertToPostfix(String infix)

    private int precedence(char operator) {
        int response;
        if (Character.isAlphabetic(operator) || Character.isDigit(operator) || operator == '.') {
            return 0;
        }
        response = switch (operator) {
            case ')' -> 1;
            case '(' -> 2;
            case '+', '-' -> 3;
            case '/', '*', '%' -> 4;
            case '^' -> 5; //note: this is invalid as a numeric operator in Java.
            default -> -1;
        };
        return response;
    }
}

