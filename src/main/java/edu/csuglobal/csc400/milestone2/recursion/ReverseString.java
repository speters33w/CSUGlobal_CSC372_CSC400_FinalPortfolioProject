/*
CSU Global CSC400 Module 5 Critical Thinking

Critical Thinking Assignment (70 Points)

Program 3 (Algorithm Analysis / Big-Oh Notation)

In addition, compile and submit Exercise 5 (Chapter 9 of Carrano & Henry, p. 288), 
Write a recursive method that displays a portion of a given array backward. Consider the last entry in the portion
first.
*/
package edu.csuglobal.csc400.milestone2.recursion;

public class ReverseString {

    /**
     * This method reverses a string.
     *
     * @param str the string to reverse.
     * @return the reversed string.
     */
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.printf("racecar reversed is %s.%n", reverseString("racecar"));
    }
}
