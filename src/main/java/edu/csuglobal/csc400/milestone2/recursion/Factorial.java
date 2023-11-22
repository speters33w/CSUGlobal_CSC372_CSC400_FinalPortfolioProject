/*
CSU Global CSC400 Module 5 Critical Thinking

Critical Thinking Assignment (70 Points)

Program 3 (Algorithm Analysis / Big-Oh Notation)

Implement the algorithm outlined in Exercise # 4 (Chapter 9 of Carrano & Henry, p. 288) in Java.
The factorial of a positive integer n—which we denote as n!—is the product of n and the factorial of n - 1. The
factorial of 0 is 1. Write two different recursive methods that each return the factorial of n.

Analyze your algorithm in Big-Oh notation and provide the appropriate analysis, ensuring that your program has
the required class and a test class.
*/
package edu.csuglobal.csc400.milestone2.recursion;

public class Factorial {
    /**
     * This method calculates the factorial of a non-negative integer < 21.
     *
     * @param n the number to calculate the factorial of.
     * @return the factorial of the given number.
     */
    public static long factorialMethodOne(int n) {
        if (n == 0 || n == 1) {                                  // O(1)
            return 1;                                            // O(1)
        }
        //Calling Function Recursively
        return n * factorialMethodOne(n - 1);                    // O(n)
    }

    /**
     * This method calculates the factorial of a non-negative integer < 21.
     *
     * @param n the number to calculate the factorial of.
     * @return the factorial of the given number.
     */
    public static long factorialMethodTwo(long n) {
        long result = 1;                                         // O(1)
        if(n != 0) {                                             // O(1)
            //Calling Function Recursively
            result = n * factorialMethodTwo(n - 1);              // O(n)
        }
        return result;                                           // O(1)
    }
}
