package edu.csuglobal.csc372.milestone2.recursion;

@SuppressWarnings("unused")
public final class Recurse {
    @SuppressWarnings("unused")
    private Recurse() {}

    public static int product(int[] numbers) {
        return product(numbers, 0, numbers.length - 1);
    }

    private static int product(int[] numbers, int left, int right) {
        // Base case: return the product if left and right indices are equal

        if (left == right) {
            return numbers[left];
        }

        // divide the array evenly.
        // calculate the product in each half recursively,
        // and return the product of the two calculated products

        int mid = (left + right) / 2;
        int productLeft = product(numbers, left, mid);
        int productRight = product(numbers, mid + 1, right);

        return productLeft * productRight;
    }

    public static int sum(int[] numbers) {
        return sum(numbers, 0, numbers.length - 1);
    }

    private static int sum(int[] numbers, int left, int right) {
        // return the sum if left and right indices are equal

        if (left == right) {
            return numbers[left];
        }

        // divide the array evenly.
        // calculate the sum in each half recursively,
        // and return the sum of the two calculated sums

        int mid = (left + right) / 2;
        int sumLeft = sum(numbers, left, mid);
        int sumRight = sum(numbers, mid + 1, right);

        return sumLeft + sumRight;
    }
}
