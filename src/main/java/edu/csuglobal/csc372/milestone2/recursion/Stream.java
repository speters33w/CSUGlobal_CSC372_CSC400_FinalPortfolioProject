package edu.csuglobal.csc372.milestone2.recursion;

public class Stream {
    public static int product(int[] numbers) {
        return java.util.stream.IntStream.of(numbers).reduce(1, (a, b) -> a * b);
    }

    public static int sum(int[] numbers) {
        return java.util.stream.IntStream.of(numbers).sum();
    }
}
