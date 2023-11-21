package edu.csuglobal.csc372.milestone2.recursion;

// https://gist.github.com/speters33w/53b3f56ff0b8dce94efcc157b5e64e65

import edu.princeton.cs.algs4.Stopwatch;

import java.util.Arrays;
import java.util.Random;

public class TestRecurse {

    public static void main(String[] args) {
        Random random = new Random();
        Stopwatch stopwatch;

//        int arrayLength = 90000000; // Use to test sum only. Higher values may cause out of memory errors.
        int arrayLength = 9; // Higher values than 9 may overflow the integer.MAX_VALUE of 2147483647 using product.
        int numberBound = 9; // Higher values than 9 may overflow the integer.MAX_VALUE of 2147483647 using product.

        //create an int[] array with five numbers to test the functions.
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(numberBound) + 1;
//            numbers[i] = 9;  // used to test maximum value of arrayLength with numberBound at 9.
        }

        System.out.printf("The array contains %s.%n%n", Arrays.toString(numbers));

        //test speed of different methods. Comment out code to test one or the other.
        // Product:
        stopwatch = new Stopwatch();
        System.out.printf("The product is %d.%n", Recurse.product(numbers));
        System.out.printf("Find product using recursion: %.10f seconds.%n%n", stopwatch.elapsedTime());
        stopwatch = new Stopwatch();
        System.out.printf("The product is %d.%n", Iterate.product(numbers));
        System.out.printf("Find product using iteration: %.10f seconds.%n%n", stopwatch.elapsedTime());
        stopwatch = new Stopwatch();
        System.out.printf("The product is %d.%n", Stream.product(numbers));
        System.out.printf("Find product using streams: %.10f seconds.%n%n", stopwatch.elapsedTime());


        // Sum:
        stopwatch = new Stopwatch();
        System.out.printf("The sum is %d.%n", Recurse.sum(numbers));
        System.out.printf("Find sum using recursion: %.10f seconds.%n%n", stopwatch.elapsedTime());
        stopwatch = new Stopwatch();
        System.out.printf("The sum is %d.%n", Iterate.sum(numbers));
        System.out.printf("Find sum using iteration: %.10f seconds.%n%n", stopwatch.elapsedTime());
        stopwatch = new Stopwatch();
        System.out.printf("The sum is %d.%n", Stream.sum(numbers));
        System.out.printf("Find sum using streams: %.10f seconds.%n%n", stopwatch.elapsedTime());
    }
}
