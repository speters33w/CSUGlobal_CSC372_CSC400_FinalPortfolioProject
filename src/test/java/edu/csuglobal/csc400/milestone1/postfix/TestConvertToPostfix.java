/*
CSU Global CSC 400 Module 4 Critical Thinking

Critical Thinking Assignment (70 Points)

Program 2 (Java Postfix Converter)

Create a Java Postfix converter using the algorithm provided in Segment 5.16 on page 167 (Chapter 5 of Carrano
& Henry, 2019, p. 167).

Ensure that your program has the required class and a test class.
*/

//ConvertToPostfix requires a minimum Java version of 14 or higher to compile.
package edu.csuglobal.csc400.milestone1.postfix;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConvertToPostfix {
    public static void main(String[] args) {

        String postfix;
        String infix;
        ConvertToPostfix convertedPostfix = new ConvertToPostfix();

        System.out.printf("Examples from paragraph 5.11 page 164%n%n");
        infix = "a + b";
        postfix = convertedPostfix.convertToPostfix(infix);
        assertEquals(postfix, "a b +");
        System.out.printf("Infix: %s\nPostfix: %s\n\n", infix, postfix);

        infix = "(a + b) * c";
        postfix = convertedPostfix.convertToPostfix(infix);
        assertEquals(postfix, "a b + c *");
        System.out.printf("Infix: %s\nPostfix: %s\n\n", infix, postfix);

        infix = "a + b * c";
        postfix = convertedPostfix.convertToPostfix(infix);
        assertEquals(postfix, "a b c * +");
        System.out.printf("Infix: %s\nPostfix: %s\n\n", infix, postfix);

        System.out.printf("%nExample from Figure 5.9 page 168%n%n");
        infix = "a / b * (c + (d - e))";
        postfix = convertedPostfix.convertToPostfix(infix);
        assertEquals(postfix, "a b / c d e - + *");
        System.out.printf("Infix: %s\nPostfix: %s\n\n", infix, postfix);

        infix = "Math.PI * r ^ 2";
        String trimPostfix = convertedPostfix.convertToPostfix(infix).replaceAll(" ","").trim();
        assertEquals(trimPostfix, "Math.PIr2^*");
        System.out.printf("Infix: %s\nPostfix: %s\n\n", infix, trimPostfix);
    }
}
