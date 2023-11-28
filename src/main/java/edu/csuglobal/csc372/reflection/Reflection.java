package edu.csuglobal.csc372.reflection;

import java.util.Arrays;

/**
 * This class illustrates the difference between pass-by-value and pass-by-reference.
 */
public class Reflection {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(16);
        // Note this passes the integer value into the static void method multiplyInteger.
        squareInteger(integer);
        // Note the value of the wrapper class Integer remains 16 in the main method.
        System.out.println("Integer integer = " + integer);
        // To change the value of integer, it would need to be passed to a method that returns an Integer.
        // Like this:
        integer = squareIntegerAndReturn(integer);
        // Note the value of the wrapper class Integer integer is now 256.
        System.out.println("Integer integer = " + integer);

        // Here I will create an array of unsorted integers:
        Integer[] integers = new Integer[]{4, 64, 32, 16, 2, 8};
        // Note this passes the Integer array into the static void method sortIntegerArray.
        sortIntegerArray(integers);
        // Note the integers object is now sorted,
        // without requiring a return value, so there is no need for the method signature to be:
        // public static Integer[] sortIntegerArray(Integer[] integers)
        // and the next line to be:
        // integers = sortIntegerArray(integers);
        // the array as an object is now sorted, even in the scope of the main method.
        System.out.println("Integer[] integers = " + Arrays.toString(integers));
    }

    public static void squareInteger(Integer integer) {
        integer = integer * integer;
    }

    public static Integer squareIntegerAndReturn(Integer integer) {
        return integer * integer;
    }

    public static void sortIntegerArray(Integer[] integers) {
        Arrays.sort(integers);
    }
}
