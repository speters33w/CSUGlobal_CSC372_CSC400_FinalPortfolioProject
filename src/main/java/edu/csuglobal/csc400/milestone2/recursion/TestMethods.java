/*
CSU Global CSC400 Module 5 Critical Thinking

Critical Thinking Assignment (70 Points)

Program 3 (Algorithm Analysis / Big-Oh Notation)

Ensure that your program has the required class and a test class.
*/
package edu.csuglobal.csc400.milestone2.recursion;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import static edu.csuglobal.csc400.milestone2.recursion.Factorial.factorialMethodOne;
import static edu.csuglobal.csc400.milestone2.recursion.Factorial.factorialMethodTwo;
import static edu.csuglobal.csc400.milestone2.recursion.ReverseString.reverseString;

public class TestMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testFactorial(scanner);
        testReverseString(scanner);
        scanner.close();
    }

    /**
     * Tests the two recursive factorial methods.
     * Entered values must be between 0 and 20, inclusive.
     * Negative numbers are invalid,
     *     and integers greater than 20 will overflow a long variable.
     */
    public static void testFactorial(Scanner scanner) {
        NumberFormat numFormat = new DecimalFormat("0.#############E0");
        int n;
        while (true) {
            System.out.print("Enter a non-negative whole number less than 21: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n < 0 || n > 20) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Input.");
            }

        }
        long methodOneResult = factorialMethodOne(n);
        long methodTwoResult = factorialMethodTwo(n);
        System.out.printf("The factorial of %d (method one) is %d, or %s.%n",
                n, methodOneResult, numFormat.format(methodOneResult));
        System.out.printf("The factorial of %d (method two) is %d, or %s.%n",
                n, methodTwoResult, numFormat.format(methodTwoResult));
    }

    /**
     * Tests the recursive reverse string method.
     */
    public static void testReverseString(Scanner scanner) {
        String s = "";
        while (s.length() < 1) {
            System.out.print("Enter a String: ");
            s = scanner.nextLine();
        }
        scanner.close();
        System.out.printf("%s reversed is %s.%n", s, reverseString(s));
    }
}
