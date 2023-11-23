package util.speters33w.sort;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    /**
     * Reverses the elements of the array.
     * Used to change an array sorted in ascending order to a descending order.
     * @param array an array of Comparable objects.
     * @param <T> the type of the elements in the array.
     */
    public static <T extends Comparable<? super T>> void reverse(T[] array)
    {
        Collections.reverse(Arrays.asList(array));
    }
}
