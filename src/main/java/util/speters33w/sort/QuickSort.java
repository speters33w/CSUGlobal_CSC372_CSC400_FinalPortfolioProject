/* ************************************************************************
 *    Adapted and modified by Stephan Peters (speters33w)
 *        from the following source code:
 *    Title: Generic Quicksort in Java
 *    Author: Big-O
 *    Date: 2020
 *    Availability: https://big-o.io/examples/quicksort/java-generic/
 *********************************************************************** */

package util.speters33w.sort;

public class QuickSort {

    private QuickSort() {}

    /**
     * Sorts an array into ascending order using Quick Sort.
     * Main entry for the sort algorithm,
     * takes in one array of Comparables as an argument.
     *
     * @param array The array to be sorted.
     * @param <T> a Comparable type.
     */
    public static <T extends Comparable<? super T>> void
    quickSort(T[] array){
        quickSort(array, 0, array.length - 1);
    }

    /**
     * @param array the array to be sorted.
     * @param startIndex the index of the first element to be sorted.
     * @param endIndex the index of the last element to be sorted.
     * @param <T> the type of the elements in the array.
     */
    private static <T extends Comparable<? super T>> void
    quickSort(T[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex);
            quickSort(array, pivotIndex + 1, endIndex);
        }
    }

    /**
     * The partition() function does all the work.
     * This function requires 3 parameters: the original array,
     * the starting index of the sub-array,
     * and the end index of the sub-array.
     *
     * @param array the original array.
     * @param startIndex the starting index of the sub-array.
     * @param endIndex the end intexd of the sub-array.
     * @return the index of the pivot element.
     * @param <T> the type of the elements in the array.
     */
    private static <T extends Comparable<? super T>> int
    partition(T[] array, int startIndex, int endIndex) {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true) {
            do {
                startIndex++;
            }
            while (array[startIndex].compareTo(pivotValue) < 0);

            do {
                endIndex--;
            }
            while (array[endIndex].compareTo(pivotValue) > 0);

            if (startIndex >= endIndex) {
                return endIndex;
            }

            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
