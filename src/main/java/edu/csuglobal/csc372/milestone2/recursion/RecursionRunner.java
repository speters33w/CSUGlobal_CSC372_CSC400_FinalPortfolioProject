package edu.csuglobal.csc372.milestone2.recursion;

import java.util.Arrays;
import java.util.Scanner;

public final class RecursionRunner {

    @SuppressWarnings("unused")
    private RecursionRunner() {}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialize the integer array and counter.
        int arrayLength = 5;  // Change this value to change the array length. Maximum recommended value is 9.
        int[] numbers = new int[arrayLength];
        int i = 0;

        System.out.printf("Enter %d numbers: ", arrayLength);

        // Create valid digits from input string, e.g. "1, 2, 3, 4, 5" is valid.
        String input = scanner
                .nextLine()
                .trim()
                .replaceAll("[^\\d.]", "");

        // Create the array. If input string contained fewer numbers than the array length, trailing values will be 0.
        for (char character : input.toCharArray()) {
            numbers[i] = Integer.parseInt(String.valueOf(character));
            if (i == numbers.length - 1) {
                break;
            } // if (i == numbers.length - 1)
            i++;
        } // for (char character : input.toCharArray())

        // Display the sum of the array.
        System.out.printf("%nThe sum of %s is %d.%n", Arrays.toString(numbers), Recurse.sum(numbers));

        // Change non-entered trailing zeroes to 1 for a valid product of entered numbers.
        while (numbers[i] == 0) {
            numbers[i] = 1;
            if (i == numbers.length - 1) {
                break;
            } // if (i == numbers.length - 1)
            i++;
        } // while (numbers[i] == 0)

        // Display the product of the array.
        System.out.printf("%nThe product of %s is %d.%n", Arrays.toString(numbers), Recurse.product(numbers));

        scanner.close();
    } // public static void main

} // public class RecursionRunner()

