package edu.csuglobal.csc372.milestone2.recursion;

public class Iterate {

    public static int product(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
